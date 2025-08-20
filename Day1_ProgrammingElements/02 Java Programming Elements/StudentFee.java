<<<<<<< HEAD
    import java.util.Scanner;
public class StudentFee {
	public static void main(String[] args){
		int fee;
        System.out.println("enter fee ");
		Scanner input = new Scanner(System.in);
		fee = input.nextInt();
        System.out.println("enter discount percent");
		int discountPercent;
		discountPercent = input.nextInt();
		double discount = (fee * discountPercent) / 100;
		double final_amount = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_amount);
    }
}
=======
    import java.util.Scanner;
public class StudentFee {
	public static void main(String[] args){
		int fee;
        System.out.println("enter fee ");
		Scanner input = new Scanner(System.in);
		fee = input.nextInt();
        System.out.println("enter discount percent");
		int discountPercent;
		discountPercent = input.nextInt();
		double discount = (fee * discountPercent) / 100;
		double final_amount = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_amount);
    }
}
>>>>>>> 64484dfe97211cc883efa58c4f9c9a83210bbc19
