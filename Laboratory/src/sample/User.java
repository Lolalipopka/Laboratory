package sample;

public class User {
    private String login;
    private String password;
    private String fio;
    private String post;

    public User(String name, String surname, String patronymic, String phoneNumber, String cardNumber) {
        this.login = name;
        this.password = surname;
        this.fio = patronymic;
        this.post = phoneNumber;
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
