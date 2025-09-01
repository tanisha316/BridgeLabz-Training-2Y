import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

       
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid weight! Please enter a positive value.");
                }
            } while (weight <= 0);

           
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            } while (height <= 0);

           
            personData[i][0] = height;
            personData[i][1] = weight;
        }

        
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

       
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
