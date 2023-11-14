package exercise70;

public class ArraysCreator {


    private int[] tempArray = new int[50];
    private int counter = 0;

    public ArraysCreator(){
        for (int i = 0; i < 50; i++){
            tempArray[i] = i;
        }
        tempArray[25] = -22;
        tempArray[2] = -2;
    }

    public void setPositives() {
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] >= 0) {
                counter++; //<-- vi ökar counter med ett varje gång numret på index
                //Positionen i vårt array är över 0.
                //Vi kan spara information i en redan skapad variabel!
            }
        }
    }
    public void setPositives(int[] inputArray){
        //counter = 0; // <-- vi kan resetta counter om vi ska återställa räkningen!
        int tempCounter = 0;
        for (int i = 0; i < inputArray.length;i++){
            if (inputArray[i] >= 0){
                tempCounter++;
            }
        }
        counter = tempCounter;
    }

    public int getCounter() {
        return counter; //<-- Vi kan returnera vår counter här så att den alltid går att nå!
    }
    /*public int getPositives(){
        int counter = 0; //<--- vi skapar en counter som börjar ifrån noll
        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i] >= 0){
                counter++; //<-- vi ökar counter med ett varje gång numret på index
                //positionen i vårt array är över 0.
                //Vi kan spara information i en redan skapad variabel!
            }
        }
        return counter; //Vi returnerar sedan innehållet i counter!
    }*/
}




