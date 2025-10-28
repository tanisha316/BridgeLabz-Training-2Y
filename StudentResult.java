public class StudentResult {
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
    public static void main(String[] args) {
        String name="Tanisha";
        int age=20;
        int phy_marks=20;
        int chem_marks=22;
        int maths_marks=24;
        int avg=(phy_marks+chem_marks+maths_marks)/3;
     try{
        String str=null;
        System.out.println(str.length());
    }
    catch(NullPointerException y){
        System.out.println("null pointer exception="+ y.getMessage());
    }
    try{
    if (age < 18) {
            throw new InvalidAgeException("age should be 18 or above");
    }
    else{
        System.out.println("eligible");
    }
     if (phy_marks< 0 || phy_marks > 100 || chem_marks< 0 || chem_marks > 100 || maths_marks< 0 || maths_marks > 100 ) {
                    throw new InvalidMarksException("Marks should be between 0 and 100");
                }
                else{
                    System.out.println("valid");
                }
            }
                try{
        int arr[]={1,2,3,4,5};
        System.out.println(arr[8]);
    }
    catch(ArrayIndexOutOfBoundsException z){
        System.out.println("ArrayIndexOutofBounds exception="+z.getMessage());
    }
    finally{
        System.out.println("Result processing completed");
    }
    }
}
