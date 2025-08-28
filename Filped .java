import java.util.Scanner;
public class Filped {
    public static void main(String[] args) {
        String filppedLetters = "BCDEHIKOX";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char Letter = scanner.next(). toUpperCase().charAt(0);
        if(filppedLetters.indexOf(Letter)!=-1) {
            System.out.println("The alphabet is filpped.");
        } else {
            System.out.println("The alphabet is not filpped.");
        }
        scanner.close();
    }
}
