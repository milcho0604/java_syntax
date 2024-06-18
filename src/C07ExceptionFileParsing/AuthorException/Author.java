package C07ExceptionFileParsing.AuthorException;

import javax.xml.namespace.QName;

// Entity
// id, name, email, password
// 생성자에서 초기화 + getter로만 구성
public class Author {
    static Long author_id = 0L;
    private Long id;
    private String name;
    private  String email;
    private  String password;

    public Author( String name, String email, String password) {
        author_id ++;
        id = author_id;
        this.author_id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static Long getAuthor_id() {
        return author_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
