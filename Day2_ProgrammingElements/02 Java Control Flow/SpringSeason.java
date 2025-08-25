import java.util.*;
class SpringSeason{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int month= sc.nextInt();
int day=sc.nextInt();

if ( month == 3 && day >=20 && day <=31){
System.out.println("its a spring season");
}
else if ( month ==4 || month ==5){
System.out.println("its a spring season");
}
else if ( month == 6 && day <=20){
System.out.println("its a spring season");
}

else {System.out.println("not spring ");
}
}
}
