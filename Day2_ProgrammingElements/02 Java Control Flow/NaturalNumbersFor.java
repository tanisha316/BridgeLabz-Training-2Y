import java.util.*;
public class NaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter number");
        int total=0;
        int summ=0;
    int number = sc.nextInt();
    if(number>0){
    summ=number*(number+1)/2;
    for(int i=0;i<=number;i++){
        total= total+number;
        i++;
    }
    }System.out.println("summ= "+summ);
    System.out.println("total= "+total);
}
}

