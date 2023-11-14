package AnAssignment;

public class Logics {
    private String[] words;

    public Logics(){
    }
    public void setWordArray(String input){
        words = input.split(" ");
    }
    public String[] getWordArray(){
        return words;
    }
    public void printMyArray(){
        for (String word : words){
            System.out.println(word);
        }
    }
    public String getFirstWord(){
        if (words.length > 0){
            return words[0];
        } else {
            return "Fel! *<:S";
        }
    }
    public String getLastWord(){
        return words[words.length-1];

    }
    public int getArrayLength(){
        return words.length;
    }
}
