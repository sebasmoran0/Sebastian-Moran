import java.util.Scanner;
// Sebastian Moran. COP 3502

public class SciCalculator {
    public static void main (String[] arg) {

        int menuChoice = -1;
        double num1 = 0; // first operand
        double num2 = 0; // second operand
        double answer = 0; // current result
        double totResult = 0; // sum of all results
        int counter = 0; // calculations completed
        double avg = 0; // average

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Current Result: 0.0");

        while (menuChoice != 0) { // calculator will continue to function as long as user doesn't select "Exit Program"

            String mainMenu = (
                    "\n"
                            + "Calculator Menu\n"
                            + "---------------\n"
                            + "0. Exit Program\n"
                            + "1. Addition\n"
                            + "2. Subtraction\n"
                            + "3. Multiplication\n"
                            + "4. Division\n"
                            + "5. Exponentiation\n"
                            + "6. Logarithm\n"
                            + "7. Display Average\n"
                            + "\n"
                            + "Enter Menu Selection: "
            );
            System.out.println(mainMenu); //displays the main menu
            menuChoice = scanObject.nextInt(); //allows user to select option from main menu

            while (menuChoice < 0 || menuChoice > 6) {
                if (menuChoice == 7 && counter == 0) {
                    // there is no current result or total result, so user cannot select "display average" as the first option
                    System.out.println("Error: No calculations yet to average!");
                    System.out.print("Enter Menu Selection: ");
                    menuChoice = scanObject.nextInt();
                }

                if (menuChoice > 7 || menuChoice < 0) { //if user selects a menu choice that is not an option
                    System.out.println("Error: Invalid selection!");
                    System.out.print("Enter Menu Selection: ");
                    menuChoice = scanObject.nextInt();
                }

                if (menuChoice == 7 && counter > 0) { //gets average only if one operand has done before hand
                    avg = totResult / counter;
                    System.out.printf("Sum of calculations: %.2f\n",totResult);
                    System.out.println("Number of calculations: " + counter);
                    System.out.printf("Average of calculations: %.2f\n",avg);
                    System.out.print("Enter Menu Selection: ");
                    menuChoice = scanObject.nextInt();

                    break;
                }
            }
            switch (menuChoice) {

                case 0: { //exits calculator
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);

                    break;
                }
                case 1: { // addition (first operand plus second operand)
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = num1 + num2;
                    totResult = totResult + answer; // adds operation answer to the sum of all previous operations
                    counter++; // adds 1 calculation completed to the number of total calculations done

                    System.out.println("Current Result: " + answer);

                    break;
                }

                case 2: { //subtraction (first operand minus second operand)
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = num1 - num2;

                    totResult = totResult + answer;
                    counter++;

                    System.out.println("Current Result: " + answer);

                    break;
                }

                case 3: { //multiplication (first operand times second operand)
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = num1 * num2;

                    totResult = totResult + answer;
                    counter++;

                    System.out.println("Current Result: " + answer);

                    break;
                }

                case 4: { //Division (first operand divided by second operand)
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = num1 / num2;

                    totResult = totResult + answer;
                    counter++;

                    System.out.println("Current Result: " + answer);

                    break;
                }

                case 5: { // exponent (first operand is the base. second operand is the exponent)
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = Math.pow(num1, num2);

                    totResult = totResult + answer;
                    counter++;

                    System.out.println("Current Result: " + answer);

                    break;
                }

                case 6: { //logarithm (both logs have the same base of '10')
                    System.out.print("Enter first operand: ");
                    num1 = scanObject.nextDouble();
                    System.out.print("Enter second operand: ");
                    num2 = scanObject.nextDouble();
                    answer = Math.log(num2) / Math.log(num1); // log(num2) / log(num1)

                    totResult = totResult + answer;
                    counter++;

                    System.out.println("Current Result: " + answer);
                    break;
                }

            }

        }

        }

        }

