package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        spring에서는 RestTemplate을 통해 Http요청하고
//        여기서는 java에 내장된 http클라이언트 사용

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();
//        System.out.println(posts);

        ObjectMapper objectMapper = new ObjectMapper();
//    Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data2.json");
//    String jsonString = Files.readString(filePath);
//    JsonNode data2 = objectMapper.readTree(jsonString);

        JsonNode data = objectMapper.readTree(posts);

        List<Post> postList = new ArrayList<>();
        for(JsonNode j : data){
            Post tempPost = objectMapper.readValue(j.toString(), Post.class);
            postList.add(tempPost);
        }
        System.out.println(postList);

//        List<Post> 객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);
//        System.out.println(postJson);

    }
}

class Post{
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "userId: " + this.userId + " 제목: " + this.title +
                " 내용: " + this.body+ "\n";

    }
}