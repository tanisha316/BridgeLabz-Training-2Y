import java.util.Scanner;
public class BMICalculator {
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }       
        return new String[]{
            String.valueOf(weight),
            String.valueOf(heightCm),
            String.valueOf(bmi),
            status
        };
    }
    public static String[][] computeAllBMI(double[][] data) {
        int n = data.length;
        String[][] results = new String[n][4];
        for (int i = 0; i < n; i++) {
            results[i] = computeBMI(data[i][0], data[i][1]);
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        System.out.println("--------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" +
                               results[i][0] + "\t\t" +
                               results[i][1] + "\t\t" +
                               results[i][2] + "\t" +
                               results[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] results = computeAllBMI(data);
        displayResults(results);
        sc.close();
    }
}
