package C07ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static C07ExceptionFileParsing.AuthorException.AuthorRepository.authors;

public class AuthorService {
    Scanner sc = new Scanner(System.in);
    AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }


    void register() {
        try {
            System.out.println("회원가입 서비스입니다.\n name, email, password를 입력해주세요");
            String name = sc.nextLine();
            String email = sc.nextLine();
            String password = sc.nextLine();
            RegisterException(email, password);
            Author author = new Author(name, email, password);
            authorRepository.sysRegister(author);
            System.out.println("회원가입이 완료되었습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void login() {
        try {
            System.out.println("로그인 서비스입니다.\n email, password를 입력하세요");
            String email = sc.nextLine();
            String password = sc.nextLine();
            LoginException(email, password);
            System.out.println("로그인 성공을 성공했습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void RegisterException(String email, String password) throws IllegalArgumentException, NoSuchElementException {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                throw new NoSuchElementException("이미 존재하는 이메일입니다.");
            }
        }

        if (password.length() < 5) {
            throw new IllegalArgumentException("비밀번호가 짧습니다. 5자 이상으로 입력해주세요.");
        }
    }

    static void LoginException(String email, String password) throws IllegalArgumentException {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                if (!author.getPassword().equals(password)) {
                    throw new IllegalArgumentException("이메일과 일치하지 않는 비밀번호입니다.");
                }
                return;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 이메일입니다.");
    }
}
