package justanotherarraypractice;

public class ArrayFactory {

    private String[] words; // Vi skapar ett array av Strings som dock inte har en
    // fast längd.

    public ArrayFactory(){ // Vi skapar en no-arg konstruktor
        // mest bara för att visa/undervisa, ni behöver inte skapa en konstruktor
        // utan värden i de flesta fallen.

    }
    public void setWordArray(String input){ // vi skickar in vår String till metoden!
        words = input.split(" "); // Vi färdigställer vårt array igenom att dela vår
        //string som vi gjort i main metoden. Vi delar den vid varje mellanslag/Whitespace.
        // Vi kan fylla i vår regex med t.ex bara ett tomrum " " eller kan vi också
        //representera ett tomrum med "\s"
    }
    public String[] getWordArray(){
        return words;
    }
    public void printMyArray(){
        for (String word : words){ // <-- enchanced for loop
            // Vi bestämmer att varje indexposition/värden existerar i vårt array
            //hanteras av t.ex en String kallad word. (notera att det måste vara rätt sorts variabel typ
            // String, boolean, char, int, double, float,long, you name it)
            System.out.println(word);
        }
    }
    public String getFirstWord(){
        if (words.length > 0){ // <-- om vårt arrays längd är större än 0 så returnerar vi det som är på första indexpositionen.
            return words[0];
        } else {
            return "Fel! *<:S";
        }
    }
    public String getLastWord(){
        //return getWordArray()[getWordArray().length-1];
        return words[words.length-1]; // vi hämtar det sista ordet
        // i vårt array igenom att kolla på vårt words array och sedan
        // ange ett index inom [], vi bestämmer det sista indexet igenom att
        //kolla på arrayets längds och sedan dra av ett (eftersom index räknas ifrån
        // noll och längd räknas ifrån ett!
    }
    public int getArrayLength(){ // Fastän vi returnernar något som har att göra
        // med ett array, så är det vad vi faktiskt returnerar som spelar roll.
        // när vi kallar length på ett array så får vi tillbaka en int, då måste
        // vårt return value vara en int också!
        return words.length;
    }

}
