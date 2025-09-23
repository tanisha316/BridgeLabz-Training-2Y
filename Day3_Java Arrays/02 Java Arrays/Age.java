import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ages[]= new int[10];
        for(int i=0;i<ages.length;i++){
        ages[i]=sc.nextInt();
            if(ages[i]>=18){
                System.out.println("eligible to vote");
            }
            else{
                System.out.println("not eligible to vote");
            }
        }
    }
}