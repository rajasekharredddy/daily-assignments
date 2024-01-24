

import java.util.Scanner; // import the Scanner class

class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        System.out.println("Enter age");
        userName = myObj.nextLine();
        int age= myObj.nextInt();
        System.out.println("Username is: " + age);
        System.out.println("Username is: " + userName);
    }
}


