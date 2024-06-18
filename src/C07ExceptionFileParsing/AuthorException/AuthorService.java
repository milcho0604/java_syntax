package C07ExceptionFileParsing.AuthorException;

import java.util.List;

import static C07ExceptionFileParsing.AuthorException.AuthorRepository.authors;

public class AuthorService {
    AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }

    static void RegisterException(String email, String password) throws IllegalArgumentException {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                throw new IllegalArgumentException("이미 존재하는 이메일입니다.");
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
                return;  // 로그인 성공
            }
        }
        throw new IllegalArgumentException("존재하지 않는 이메일입니다.");
    }
}
