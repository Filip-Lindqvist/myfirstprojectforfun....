package TDDövning;

public class User {


    private static String name;
    private static String pass;
    public User(String userName, String passWord) {
        name = userName;
        pass = passWord;
    }

    public static String getName() {
        return name;

    }

    public static String getPass() {
        return pass;

    }


    public static void setName(String newName) {
        name = newName;
    }
}

