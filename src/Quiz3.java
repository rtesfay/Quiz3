import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        password = keyboard.next();
        for (int i = 0; i <= password.length(); i++) {
            String[] upperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            String[] lowerCase = {"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] specialCharacters = {"!", "", "#", "$", "%", "&"};
            for (password.length().equals(4) || password.length() > 4){
                if (password.contains(upperCase) && password.contains(lowerCase) && password.contains(numbers) && password.contains(specialCharacters)) {
                    System.out.println(" Password is valid");
                } else {
                    System.out.println("Password is invalid");
                }


            }

        }
    }
}