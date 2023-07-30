import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Integer> results = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int choice = 0;
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.println("enter 2 numbers ");
            try {

                num1 = data.nextInt();
                num2 = data.nextInt();

                System.out.println("choice numbers ");
                System.out.println("1 for + \n 2 for - \n 3 for * \n 4 for /  \n 5 for  % \n 6 for min \n 7 for max \n 8 for average \n 9 for last result  \n 10 for all result \n 0 to exit \n");

                choice = data.nextInt();
            } catch (InputMismatchException e3) {
                System.out.println("Enter only number");
                continue;
            } catch (Exception e5) {
                System.out.println(e5.getMessage());
            }

            switch (choice) {
                case 1:
                    System.out.println(sum(num1, num2));
                    break;
                case 2:
                    System.out.println(subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(multiply(num1, num2));
                    break;
                case 4:
                    System.out.println(division(num1, num2));
                    break;
                case 5:
                    System.out.println(mood(num1, num2));
                    break;
                case 6:
                    System.out.println(findMin(num1, num2));
                    break;
                case 7:
                    System.out.println(findMax(num1, num2));
                    break;
                case 8:
                    System.out.println(average(num1, num2));
                    break;
                case 9:
                    try {


                        lastResult();
                    } catch (IndexOutOfBoundsException e6) {
                        System.out.println(e6.getMessage());
                    } catch (Exception e7) {
                        System.out.println(e7.getMessage());

                    }
                    break;
                case 10:
                    allResult();
                    break;
                case 0:
                    System.out.println("see you later");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 0);
    }



        public static int sum ( int num1, int num2){

            int result = num1 + num2;
            results.add(result);

            return result;
        }
        public static int subtract ( int num1, int num2){

            int result = num1 - num2;
            results.add(result);
            return result;
        }
        public static int multiply ( int num1, int num2){

            int result = num1 * num2;
            results.add(result);
            return result;
        }
        public static int division ( int num1, int num2){
            int result = 0;
            try {
                result = num1 / num2;
                results.add(result);

                return result;
            } catch (ArithmeticException e1) {
                System.out.println("divide by zero");
            } catch (Exception e4) {
                System.out.println(e4.getMessage());

            }
            return 0;

        }
        public static int mood ( int num1, int num2){
            int result = 0;
            try {
                result = num1 % num2;

                results.add(result);
                return result;
            } catch (ArithmeticException e9) {
                System.out.println(e9.getMessage());
            } catch (Exception e10) {
                System.out.println(e10.getMessage());

            }
            return 0;
        }

        public static int findMin ( int num1, int num2){
            int result = num1 <= num2 ? num1 : num2;
            results.add(result);
            return result;

        }
        public static int findMax ( int num1, int num2){
            int result = num1 >= num2 ? num1 : num2;
            results.add(result);
            return result;


        }
        public static int average ( int num1, int num2){
            int result = (num1 + num2) / 2;
            results.add(result);
            return result;

        }
        public static void lastResult () {

            System.out.println(results.get(results.size() - 1));


        }
        public static void allResult () {

            //for (int i = 0; i < results.size()-1; i++) {
            System.out.println(results);
            // }


        }


    }