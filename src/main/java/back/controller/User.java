package back.controller;

public class User {
    private final String name;
    private final String surname;
    private final int age;
    private final String nickname;
    private final String password;
    private final String email;

    public User(String name, String surname, int age, String nickname, String password, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
