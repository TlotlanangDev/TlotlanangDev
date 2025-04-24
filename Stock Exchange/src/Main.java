import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Welcome to the Small Business Stock Exchange. \n \t please choose an option!" +
                " \n \n a. Log in \n b. Register \n c. Admin \n x. Exit \n");
             String option;

        do {
            option = Input.nextLine();
            switch (option) {
                case "a":
                    System.out.println("Thank you a");
                    break;
                case "b":
                    System.out.println("Thank you b");
                    break;
                case "c":
                    System.out.println("Thank you c");
                    break;
                case "x":
                    System.out.println("Thank you x");
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }while (!option.equals("x")) ;



    }
}