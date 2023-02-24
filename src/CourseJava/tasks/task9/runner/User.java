package CourseJava.tasks.task9.runner;

public class User {

    private String login;
    private String password;

    public String setLogin(String login) {
        this.login = login;
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
