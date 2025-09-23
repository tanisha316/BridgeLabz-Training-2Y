import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();        
        if(number>0){
        int odd[]=new int[number];
        int even[]=new int[number];
        int oddi=0,eveni=0;
        for(int i=0;i<=number ;i++){
            if(i%2==0){
                even[eveni++]=i;
            }
            else{
                odd[oddi++]=i;
            }
            
        }
        System.out.println("even");
        for(int i=0;i<eveni;i++){
        System.out.print(even[i]+" ");
        }
        System.out.println("odd");
        for(int i=0;i<oddi;i++){
        System.out.print(odd[i]+" ");
    }
}
    else{
        System.out.println("error");
    }
}
}

