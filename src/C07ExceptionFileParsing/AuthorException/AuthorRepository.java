package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorRepository {
    Scanner sc = new Scanner(System.in);
    static List<Author> authors = new ArrayList<>();

    AuthorRepository() {
        this.authors = new ArrayList<>();

    }
    void sysRegister(Author author){
        authors.add(author);
    }

//    void register() {
//        try {
//            System.out.println("회원가입 서비스입니다.\n name, email, password를 입력해주세요");
//            String name = sc.nextLine();
//            String email = sc.nextLine();
//            String password = sc.nextLine();
//            AuthorService.RegisterException(email, password);
//            Author author = new Author(name, email, password);
//            authors.add(author);
//            System.out.println("회원가입이 완료되었습니다.");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    void login() {
//        try {
//            System.out.println("로그인 서비스입니다.\n email, password를 입력하세요");
//            String email = sc.nextLine();
//            String password = sc.nextLine();
//            AuthorService.LoginException(email, password);
//            System.out.println("로그인 성공.");
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
