public class PenDivision {
	public static void main(String[] args){
        int students = 3;
        int pens = 14;
		
		int pens_got = pens/students;
        int rem = pens % students;
		System.out.println("The Pen Per Student is " + pens_got + " and the remaining pen not distributed is " + rem); 
		}
}