package Exercise5;

public class HelloWorldPrinter {

    public HelloWorldPrinter() {}

    //Vi skapar en ny klass HelloWorldPrinter som kan skriva ut Hello World!
    //
    //Vi anropar denna nya klass ifrån HelloWorld
    //
    //HelloWorldPrinter hwp = new HelloWorldPrinter();

    public void print() {
        System.out.println("Hello World");

    }

    public void printManyTimes(int times){
        //int times = 7;
        for (int i=0;i<times;i++) {

            System.out.println("Hello World");

        }

    }



}
