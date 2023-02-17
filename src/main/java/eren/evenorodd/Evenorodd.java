/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.evenorodd;
import java.util.Scanner;
/**
 *
 * @author ereni
 */
public class Evenorodd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your digit to compare");
        System.out.println("Enter a negative integer to end program");
         int newNum = input.nextInt();
         while(newNum>0){
        if(isEven(newNum)){
            System.out.println("Your number is even:" + '\s' + newNum);
            System.out.println("Your remaider when divided by 2 is" + '\s' + newNum % 2);
        }
        else{
            System.out.println("Your number is odd:" + '\s' + newNum);
            System.out.println("Your remaider when divided by 2 is" +'\s' + newNum % 2);
        }
        System.out.print("Please enter your new digit to compare:");
             newNum = input.nextInt();
         }
    }
    
        
    
   
    
    public static boolean isEven(int newNum){
        return newNum % 2 == 0;
    }
}
