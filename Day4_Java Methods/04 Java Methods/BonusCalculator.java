import java.util.*;
public class BonusCalculator {
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; 
        for (int i = 0; i < employees; i++) {
            int salary = (int) (Math.random() * 90000) + 10000;
            int years = (int) (Math.random() * 11); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] oldData) {
        double[][] newData = new double[oldData.length][2];
        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            newData[i][0] = bonus;
            newData[i][1] = newSalary;
        }
        return newData;
    }
    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15s %-10s %-15s %-15s\n", 
                          "ID", "Years", "Old Salary", "Bonus", "New Salary", "Bonus Rate");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int years = oldData[i][1];
            int oldSalary = oldData[i][0];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];
            String bonusRate = (years > 5) ? "5%" : "2%";

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-15d %-10.2f %-15.2f %-15s\n", 
                              (i + 1), years, oldSalary, bonus, newSalary, bonusRate);
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%-16s %-15.2f %-10s %-15.2f %-15s\n", 
                          "TOTAL", totalOldSalary, "", totalNewSalary, "");
        System.out.printf("Total Bonus Amount Zara Pays: %.2f\n", totalBonus);
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int employees = 10;
        int[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }
}

