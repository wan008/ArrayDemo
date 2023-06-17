package arrydemo;

import java.util.Scanner;

public class ArryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter word:");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetter = new char[myWord.length()];
        
        for (int i = 0; i < myLetter.length; i++){
            myLetter[i] = myWord.charAt(i);
            System.out.print(myLetter[i]);
        }
        System.out.println();
        System.out.println("Printing Reverse");
        
        for (int i = myLetter.length - 1; i >= 0; i--){
            System.out.print(myLetter[i]);
        }
        System.out.println();
    }
    
}
