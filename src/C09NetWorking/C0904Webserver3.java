package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

//Author 테이블 생성 id, name, email, password pk(id)
//
//사용자가 localhost:8081?id=1 이면 id가 1인 author의 name, email, password 응답
//사용자가 localhost:8081?name=hong&email=hong@naver.com 이라면 author의 name, email, password 응답
public class C0904Webserver3 {
    public static void main(String[] args) throws SQLException, IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        while (true) {
//            accept() : 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String sId = "";
            if (infos.contains("?")) {
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for (String s : stArr) {
                    String[] keyValue = s.split("=");
                    if (keyValue[0].equals("id")) {
                        sId = keyValue[1];
                    }
                }
            }

//        dbconnector
            String url = "jdbc:mysql://localhost:3307/board1?useSSL=false";
            String userName = "root";
            String pass = "1234";

            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("DB연결 성공");
            Statement st = con.createStatement();
            String myQuery = "SELECT * FROM author where ";

            ResultSet rs = st.executeQuery(myQuery);
            int id = 0;
            String name = "";
            String email = "";
            String password = "";
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
                System.out.println("id: " + id + " name: " + name + " email: " + " password: " + password + "\n");
            }


            System.out.println("id: " + sId);
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
//            TF-8 문자열 return
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            플러시란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();

        }
    }
}

