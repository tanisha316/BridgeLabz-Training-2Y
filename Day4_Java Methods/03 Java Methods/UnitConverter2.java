public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }


    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToFeet(double inches) {
        return inches / 12.0;
    }

    
    public static double convertFeetToInches(double feet) {
        return feet * 12.0;
    }

    public static void main(String[] args) {
        double yards = 5;
        double feet = 15;
        double meters = 2;
        double inches = 24;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToFeet(inches) + " feet");
        System.out.println(feet + " feet = " + convertFeetToInches(feet) + " inches");
    }
}

