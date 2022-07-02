import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int[] arr = {1, 2, 3, 4, 5, 6, 0};

    boolean done = false;
    while (!done) {
      try {
        System.out.println("Array index: ");
        int index = keyboard.nextInt(); //triggers InputMismatchException
        //keyboard.nextLine();

        if (index < 0 || index >= arr.length) {
          throw new OutOfBoundException();
        }

        int value = arr[index];

        System.out.printf("arr[%d] = %d\n", index, value);
        done = true;

      } catch (InputMismatchException e) {
        System.out.println("Input mismatches! Please try again!");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("The array index is out of bound! Please try again!");
      } catch (OutOfBoundException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println("Something else went wrong! We don't know how to fix it yet!");
      } finally {
        keyboard.nextLine();
      }
    }

    //do something
    System.out.println("Continue running the program until the end ...");

    keyboard.close();
  }
}
