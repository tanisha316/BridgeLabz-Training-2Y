    import java.util.Scanner;
public class DistanceConverter {
	public static void main(String[] args){
		double km;
		System.out.println("enter distance ");
		Scanner input = new Scanner(System.in);
		km = input.nextInt();
		double miles = 1.6*km;
		System.out.println("The total miles is "+miles+"mile for the given "+km);
		}
}

