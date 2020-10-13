import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter : ");
        String letter = input.next();
        char ch = Character.toLowerCase(letter.charAt(0));

        if (!Character.isLetter(ch))
            System.out.println(letter + " is invalid input.");
        else
        {
            switch(ch)
            {
                case 'a': 
                case 'e':
                case 'i': 
                case 'o': 
                case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is not a vowel");
            }    
        }
    }
}