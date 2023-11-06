package exercise10TDD;

public class PasswordCheck {

    public boolean check(String password) {

       // boolean isValid = false;
        boolean enoughCharacters = false;
        boolean hasDigits = false;
        boolean hasSpecialCharacter = false;


        if (password.length()>=8) {
            enoughCharacters = true;
        }

        for (int i=0;i<password.length();i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;

            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;

            }
        }


        return enoughCharacters && hasDigits && hasSpecialCharacter;
    }
}
