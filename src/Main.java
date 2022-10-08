import java.util.Scanner;

//PASSWORD GENERATOR PROJECT by ERIC GUAN
//*PURPOSE*
//Creating a strong password is becoming increasingly important in today's digital age. However, how do
//you create a strong password and remember it? One way is to run a series of algorithms that only you
//know on a term that relates to the account. This creates a unique and strong password that you can
//easily derive by running your algorithm. This project is an example of this method in action.

//*HOW IT WORKS*
//Enter a term that relates to the purpose of this password (ex. Website Name)
//This term will be lower-cased and mutated several times to create the password

//1. The term's vowels will all be extracted and capitalized. This will be the first part of the password.
//2. The term will be reversed. This will be the second part of the password.
//3. The term's length will correspond with a special character (see character's above 0-9 on keyboard).
//   The length of the term * 2 will be added at the end. This will be the third part of the password.

//The password will be a concatenation of all these "algorithms" in that order.

public class Main
{
    public static void main(String[] args)
    {
        //input the term that you would like to use for your password
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the purpose of this password?");
        String term = scan.nextLine();

        //sets the term to all lowercase letters
        term = term.toLowerCase();

        String password = "";

        //concatenates all the algorithm strings together to form the password
        password += addVowels(term);
        password += stringReversal(term);
        password += specialCharacter(term);
        System.out.println("Your generated password is: " + password);

    }

    public static String addVowels(String term) //method that extracts all vowels of term in order.
                                                //Returns them capitalized.
    {
        String temp_term = term;
        String vowels = "";
        int i = 0;

        while(temp_term.length() > i)
        {
            if(  (temp_term.charAt(i) == 'a') ||
                 (temp_term.charAt(i) == 'e') ||
                 (temp_term.charAt(i) == 'i') ||
                 (temp_term.charAt(i) == 'o') ||
                 (temp_term.charAt(i) == 'u') )
            {
                vowels += temp_term.charAt(i);
            }
            i++;
        }
        vowels = vowels.toUpperCase();
        return vowels;
    }

    public static String stringReversal(String term) //method that reverses the order of the term.
    {
        String temp_term = term;
        String reversal = "";

        for(int i = temp_term.length()-1; i >= 0; i--)
        {
            reversal += temp_term.charAt(i);
        }

        return reversal;
    }

    public static String specialCharacter(String term) //method that returns special character based on length of string.
                                                       //0-9 on keyboard corresponds to special character. If over 10, subtract 10.
                                                       //add 2 times the length of the term to the end.
    {
        String temp_term = term;
        String specialChar = "";
        int length = temp_term.length();
        int temp_length = temp_term.length();

        while(temp_length > 0)
        {
            if(temp_length == 1)
            {
                specialChar += "!";
                break;
            }
            else if(temp_length == 2)
            {
                specialChar += "@";
                break;
            }
            else if(temp_length == 3)
            {
                specialChar += "#";
                break;
            }
            else if(temp_length == 4)
            {
                specialChar += "$";
                break;
            }
            else if(temp_length == 5)
            {
                specialChar += "%";
                break;
            }
            else if(temp_length == 6)
            {
                specialChar += "^";
                break;
            }
            else if(temp_length == 7)
            {
                specialChar += "&";
                break;
            }
            else if(temp_length == 8)
            {
                specialChar += "*";
                break;
            }
            else if(temp_length == 9)
            {
                specialChar += "(";
                break;
            }
            else if(temp_length == 10)
            {
                specialChar += ")";
                break;
            }
            else
            {
                temp_length -= 10;
            }
        }
        //
        specialChar += (2*length); //adds 2 times length of term to password
        return specialChar;
    }
}