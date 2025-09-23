import java.util.*;
public class BMI {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double weight =sc.nextDouble();
    double height=sc.nextDouble();
    double bmi=weight/(height*height)/10000;
    if(bmi<=18.4){
        System.out.println("underweight");
    }
    if(bmi<=24.9 && bmi>=18.5){
        System.out.println("normal");
    }
    if(bmi<=39.9 && bmi>=25.0){
        System.out.println("overweight");
    }
    if(bmi>=40.0){
        System.out.println("obese");
    }
}    
}
