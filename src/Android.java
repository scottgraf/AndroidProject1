import java.util.Scanner;
public class Android {


        public static void main(String[] args) {
            // TODO code application logic here

            String time;
            String secondTime;

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter first army time: ");
            time = keyboard.nextLine();

            System.out.print("Enter second army time: ");
            secondTime = keyboard.nextLine();

            time result = new time(time, secondTime);

            System.out.println(result.toString());
        }

    }

