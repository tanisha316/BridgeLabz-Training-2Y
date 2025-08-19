import java.util.Scanner;
    public class Height {
	public static void main(String[] args){
		double height;
        System.out.println("Enter height in cm ");
		Scanner input = new Scanner(System.in);
		height = input.nextInt();
		double foot = height * 0.0328084;
		double inch = height * 0.393701;
		System.out.println(" Your Height in cm is " + height + " while in feet is " + foot + " and inches is " + inch);
	}
}



