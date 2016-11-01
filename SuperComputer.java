/**
 * This is the start of a super computer
 * 
 * Author: Ken and Scarce (Jarrett and Alex)
 * Date: Halloween, 2016
 * Desc: Use some for loops to show how fast our computer is
 */
import java.util.Scanner; 
public class SuperComputer{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("To test this supercomputer, please selcet from the choices below: ");
        System.out.println("");
        System.out.println("1.) Count up from 1 to 100 by 5's");
        System.out.println("2.) Count down from 100 to 1 by 1's");
        System.out.println("3.) Count up from 0 to 100000 by 5's");
        System.out.println("4.) Count down from 1000000 to 0 by 5's");
        System.out.println("");
        System.out.print("");
        int choice = 0;
        choice = scan.nextInt();
        // ALex
        if (choice == 1){
            for (int a = 1; a <= 100; a += 5){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        // Alex
        else if (choice == 2){
            for (int b = 100; b >= 1; b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        // Jarrett
        else if (choice == 3){
            for (int c = 0; c <= 100000; c += 5){
                System.out.print(c + " ");
            }
            System.out.println();
        }
        // Jarrett
        else if (choice == 4){
            for (int d = 1000000; d >= 0; d -= 5){
                System.out.print(d + " ");
            }
            System.out.println();
        }
        
    }
}
