import java.util.Scanner;
public class StudentR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        System.out.println("enter students name");
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        //checking of registered student 
        System.out.println("enter name");
        for(int i=0;i<1;i++){
             String name=sc.nextLine();
        if(arr[i].equals(name)){
            System.out.println("Student registred");
        }
        else{
            System.out.println("Student not found");
        }
    }
        //String Constant pool
        String str1= "tan";
        String str2="van";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        //immutability
        String studentname="aman";
        String newname=studentname+" amit";
        System.out.println(studentname);
        System.out.println(newname);

        //StringBuilder
        StringBuilder sb=new StringBuilder("hey");
        sb.append("hello");
        System.out.println(sb);
        sb.insert(2,"yy");
        System.out.println(sb);
        sb.delete(2,sb.length());
        System.out.println(sb);
        //StringBuffer
        StringBuffer sbuff=new StringBuffer("hey");
        sbuff.append("hello");
        System.out.println(sbuff);
        sbuff.insert(2,"yy");
        System.out.println(sbuff);
        sbuff.delete(2,sbuff.length());
        System.out.println(sbuff);
       }
     
        }