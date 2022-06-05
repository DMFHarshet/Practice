/******************************************************************************

                          Project 1 
                     Very Basic calculator            

*******************************************************************************/
import java.util.Scanner;
public class BasicCalculator
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
        System.out.println("--------------------------------");
        System.out.println("     CHOOSE AN OPERATION        ");
        System.out.println();
        System.out.println("Press 1 for Addition ");
        System.out.println("Press 2 for Substraction ");
        System.out.println("Press 3 for multipication ");
        System.out.println("Press 4 for Divison");
        System.out.println("press 5 for Mod ");
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.print("Ypur option: ");
        
        byte n = sc.nextByte();
         System.out.print("Ans: ");
        switch(n){
        case 1 :
            System.out.println(a+b);
            break;
        case 2 :
            System.out.println(a-b);
            break;
        case 3 : 
            System.out.println(a*b);
            break;
        case 4 :
            System.out.println((float)a/(float)b);
            break;
        case 5 :
            System.out.println(a%b);
            break;
        }
        
	}
}
