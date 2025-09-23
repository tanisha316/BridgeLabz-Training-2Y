import java.util.*;
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter number");
        int total=0;
        int summ=0;
        int i=0;
    int number = sc.nextInt();
    if(number>0){
    summ=number*(number+1)/2;
    while(i<=number){
        total= total+number;
        i++;
    }

    }System.out.println("summ= "+summ);
    System.out.println("total= "+total);
}
}

