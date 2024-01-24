import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String firstName;
    private String lastName;
    private Date dob;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, Date dob, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.salary = salary;
    }
    public void applySalaryHike() {
        double hikePercentage = 0.10;
        salary += salary * hikePercentage;
    }


    public void displayMonthlySalary() {
        double monthlySalary = salary / 12;
        System.out.println("Monthly Salary: $" + monthlySalary);
    }


    public void displayEmployeeInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDob = dateFormat.format(dob);

        System.out.println("Employee Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + formattedDob);
        System.out.println("Original Salary: $" + salary);
    }

    public void displayMonthlySalaryAfterTaxes() {
        double stateTaxPercentage = 0.21;
        double federalTaxPercentage = 0.06;

        double monthlySalary = salary / 12;
        double stateTaxAmount = monthlySalary * stateTaxPercentage;
        double federalTaxAmount = monthlySalary * federalTaxPercentage;

        double monthlySalaryAfterStateTax = monthlySalary - stateTaxAmount;
        double monthlySalaryAfterFederalTax = monthlySalary - federalTaxAmount;

        System.out.println("\nMonthly Salary After 21% State Tax: $" + monthlySalaryAfterStateTax);
        System.out.println("Monthly Salary After 6% Federal Tax: $" + monthlySalaryAfterFederalTax);
    }


        public static int calculateAge(LocalDate dateOfBirth) {
            LocalDate currentDate = LocalDate.now();

            // Calculate the difference between the current date and the date of birth
            Period age = Period.between(dateOfBirth, currentDate);

            // Return the age in years
            return age.getYears();
        }



    public static void main(String[] args) {

        Date dob = createDate(1990, 1, 15);
        Employee employee = new Employee("Mahith", "Reddy", dob, 50000.0);

        employee.displayEmployeeInfo();
        employee.displayMonthlySalary();
        employee.applySalaryHike();

        System.out.println("\nEmployee Information After 10% Hike:");
        employee.displayEmployeeInfo();

        System.out.println("\nMonthly Salary Information:");
        employee.displayMonthlySalary();
        System.out.println("\nMonthly Salary Information:");
        employee.displayMonthlySalaryAfterTaxes();


        LocalDate dateOfBirth = LocalDate.of(1990, 1, 15);

        // Calling the calculateAge function
        int age = calculateAge(dateOfBirth);

        // Displaying the calculated age
        System.out.println("Employee Age: " + age + " years");



    }
    private static Date createDate(int year, int month, int day) {
        return new Date(year - 1900, month - 1, day);
    }
    private static int calculateAge(Date dob, Date currentDate) {
        long diffInMillies = Math.abs(currentDate.getTime() - dob.getTime());
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);

        // Assuming average days in a year as 365.25
        int age = (int) (diffInDays / 365.25);

        return age;
    }

}
