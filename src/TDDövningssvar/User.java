package TDDövningssvar;

public class User {
    private String userName;
    private String password;

    private String typeOfUser;


    public User(String myName, String myPassword) {
        userName = myName;
        password = myPassword;
        typeOfUser = "normal";
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String newName) {
        if (newName.length()>=4){ // vi ändrar enbart namnet om det innehåller mer än 4 bokstäver.
            userName = newName;
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length()>=7 &&
                newPassword.length()<=20 &&
                newPassword.matches(".*[!$#&].*")) {
            password = newPassword;
        }
    }


    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String myType) {
       // myType = myType.toLowerCase(); // Sparar innehållet i 100% lowercase
        if (myType.equals("normal")||
                myType.equals("super")||
                myType.equals("admin")){
            typeOfUser = myType;
        }

    }
}

