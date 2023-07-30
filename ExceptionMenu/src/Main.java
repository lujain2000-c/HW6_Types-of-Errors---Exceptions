import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int choice;
        System.out.println("select length of array");
        try {
            int arr_length = data.nextInt();
            int[] arr = new int[arr_length];
            int element;
            do {

                System.out.println("Enter 1 for Accept elements of an array");
                System.out.println("Enter 2 for Display elements of an array");
                System.out.println("Enter 3 for Search the element within array");
                System.out.println("Enter 4 for Sort the array");
                System.out.println("Enter 5 To Stope");

                choice = data.nextInt();


                switch (choice) {

                    case 1:
                        int count = 0;
                        System.out.println("Enter elements of an array ");
                        while (count < arr_length) {
                            element = data.nextInt();
                            arr[count] = element;
                            count++;
                        }
                        break;

                    case 2:
                        System.out.println(Arrays.toString(arr));
                        break;

                    case 3:
                        boolean is_found = false;
                        System.out.println("Enter the element");
                        int search_element = data.nextInt();
                        for (int item : arr) {

                            if (search_element == item) {
                                is_found = true;
                            }
                        }
                        System.out.println(is_found);
                        break;

                    case 4:
                        Arrays.sort(arr);
                        System.out.println(Arrays.toString(arr));
                        break;

                    case 5:
                        System.out.println("see you later");

                        break;
                    default:
                        System.out.println("invaled option");
                }


            } while (choice != 5);
        } catch (InputMismatchException e1){
            System.out.println("Enter only number");
        }catch (IndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
        }

    }
}