package exercise8;

public class Spellchecker {

    //skapa en metod som heter isLetter(char sign)
    //som kontrollerar om ett tecken (sign) är en engelsk bokstav(a-z)

    public boolean isLetter(char sign) {
        boolean isLetter = false;

        if ((sign>='a' && sign<='z') || (sign>='A' && sign<='Z')) {
            isLetter = true;

        }

        return isLetter;
    }


    //denna metod returnerar true om tecknet är en engelsk bokstav annars false
}
