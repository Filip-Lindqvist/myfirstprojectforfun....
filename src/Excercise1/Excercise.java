package Excercise1;

public class Excercise {

    public static void main(String[] args) {

        /*
Skapa ett program som använder tre tal
programmet beräknas och skriver ut summan samt medelvärdet av de tre talen
*/

        int first = 5;
        int second = 8;
        int third = 14;

        int sum = first + second + third;
        int median = sum/3;

        System.out.println("The sum is: " +sum);
        System.out.println("The mean is: " +median);


/*
skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel
rektangels sidor ska läsas in.
*/
        int height = 3;
        int length = 5;

        int area = height * length;
        int circ = height*2 + length*2;


        System.out.println();

        System.out.println(area);
        System.out.println(circ);


    }
}
