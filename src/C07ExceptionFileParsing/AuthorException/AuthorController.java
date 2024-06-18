package C07ExceptionFileParsing.AuthorException;

import javax.security.auth.login.LoginContext;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// AuthorService service = new AuthorService();
// 1. 회원가입 : name, email, password 입력 객체 생성 후 service의 register 메서드 호출
// -> service에서 Author객체 생성하여 -> repository호출하여 register 완료(List에 담기)
// 1-1. 회원가입 예외처리 : service에서 throw new 발생, controller try catch(동일한 email || pass < 5
// 2. 로그인 : email, password 입력받아 service에 login 메서드 호출 -> service에서 해당 email user가 있는지
// 검증.(없으면 예외)
public class AuthorController {
    static Scanner sc = new Scanner(System.in);
    static AuthorService authorService = new AuthorService();
    public static void main(String[] args) {
        while(true){
            System.out.println("서비스 번호를 입력하세요.\n"+"1. 회원가입\n" + "2. 로그인");
            int input = Integer.parseInt(sc.nextLine());
            if(input==1){
                authorService.authorRepository.register();
            } else if (input ==2) {
                authorService.authorRepository.login();
            }
        }
    }
}
