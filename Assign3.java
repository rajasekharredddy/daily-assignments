

    import java.util.Scanner;

    public class Assign3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a number in inches: ");

            double inches = scanner.nextDouble();



            double meters = inches * 0.0254;
            System.out.println(inches + " inches is equal to " + meters + " meters.");

                    System.out.print("Enter a number: ");

                    double number = scanner.nextDouble();




                    double square = Math.pow(number, 2);
                    double cube = Math.pow(number, 3);
                    double fourthPower = Math.pow(number, 4);


                    System.out.println("Square: " + square);
                    System.out.println("Cube: " + cube);
                    System.out.println("Fourth Power: " + fourthPower);

            System.out.println("Enter four integers, one at a time:");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();

            // Check if all four integers are equal
            if (num1 == num2 && num2 == num3 && num3 == num4) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
            System.out.print("Enter an integer: ");

            int numbr = scanner.nextInt();
            String result = (numbr % 2 == 0) ? "Even number" : "Odd number";

            System.out.println(result);


        }
    }


