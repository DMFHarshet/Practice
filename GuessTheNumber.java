import java.util.Scanner;
public class GuessTheNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        System.out.println("Guess the number");
          int n = (int)(Math.random()*100);
          
        while(true){
         int n1 = sc.nextInt();
            if(n1 == n){
                System.out.println("Correct");
                break;
            }else{
                if(n1 < n )
                {
                    System.out.println("Your number is small, Try again ");
                    
                }else if(n1 > n )
                {
                    System.out.println("Your number is large ,Try again ");
                    
                }
                
            }
            
        }
		
		
	}
}
