import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double yr = sc.nextDouble();

 
            if (sal <= 0 || yr < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        
        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5%
            } else {
                bonus[i] = salary[i] * 0.02; // 2%
            }
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        
        System.out.println("\n--- Bonus Calculation Result ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}
