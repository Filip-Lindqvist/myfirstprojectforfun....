package Exercise4;

public class ForLoop {

        public static void main(String[] args) {

        /*
Skriv ut alla tal från 1-100
*/
            System.out.println("Numbers 1-100:");

            for(int i=0;i<100;i++) {
                System.out.print((i + 1) + " ");
            }

/*
Skriv ut alla jämna tal ifrån 1-100
*/
            System.out.println();
            System.out.println();
            System.out.println("Even Numbers 1-100:");


            for(int i = 0; i<100;i+=2) {
                System.out.print((i+2) + " ");

            }
/*
Skriv ut alla fibornacci-tal ifrån 1-100
Fibonnaci-tal är de två senaste talen
adderat och börjar med 1, 1 som första två tal
Exempel: 1, 1, 2, 3, 5, 8, 13, 21....
*/

            System.out.println();
            System.out.println();
            System.out.println("Fibonnaci Numbers 1-100:");

            int first = 1;

            System.out.print(first + " ");

            int second = 1;

            for(int i=0; i<10;i++) {
                System.out.print(second + " ");
                int third = first + second;
                first = second;
                second = third;
            }

        }

    }

