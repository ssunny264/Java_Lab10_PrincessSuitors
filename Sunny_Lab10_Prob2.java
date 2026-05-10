/*
 * Sara Sunny - Lab 10 - Problem 2 
 */
package sunny_lab10_prob2;

/**
 *
 * @author slbru
 */
import java.util.Scanner;
public class Sunny_Lab10_Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SuitorList num = new SuitorList();
        
        System.out.println("How many suitors are there for the princess? ");
        int count = in.nextInt();
        for(int i=count; i>=1; i--){
            num.createSuitor(i);
        }
       
        num.displayWinner();    //answer should be 1 for 6 suitors
        
        
    }
    
}
