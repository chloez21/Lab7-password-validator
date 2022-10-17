import java.util.Scanner;

public class PasswordValidator {
 
    public static boolean isValid(String password)
    {
        int criteria = 0;
        if (!((password.length() >= 8)
              && (password.length() <= 16))) {
            return false;
        }

        if (true) {
            int count = 0;
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
                // to convert int to string
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count != 0) {
                criteria++;              
            }
        }
 
        // for special characters
        if ((password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("_")
              || password.contains("="))) {
            criteria++;         
        }

 
        if (true) {
            int count = 0;
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count != 0) {
                criteria++;
            }
        }
 
        if (true) {
            int count = 0;
            // checking lower case letters
            for (int i = 97; i <= 122; i++) {
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count != 0) {
                criteria++;
            }
        }
        if(criteria>=3){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter Your Password: ");  
        Scanner input = new Scanner(System.in);
        String password1 = input.nextLine();
        if (isValid(password1)) {
            System.out.println(password1 + " - Valid Password");
        }
        else {
            System.out.println(password1 + " - Invalid Password!");
        }
        input.close();
 
    }
}