package example;

public class Main {
        public static void main(String[] args) {
            Methods methods = new Methods();
            methods.printMessage();
            String message = methods.getMessage();
            //System.out.println(message);
            //System.out.println(methods.getMessage());

            int newNumber = methods.getNewNumber(5);
            System.out.println(newNumber);


        }
    }

