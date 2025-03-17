     //day 1//
import java.util.Scanner;
class Day1{
     public static void main(String[] args) { 
          //print Hello world      
          System.out.println("Hello world");
          //Take user input
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter your id");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter your name");
          String name = sc.nextLine();
          System.out.println("Enter your Department");
          String dept = sc.nextLine();
          System.out.println("Enter your Mark");
          float mark = sc.nextFloat();
          System.out.println("Hi "+name +" "+id  +" from " +dept +" Your Mark is " +mark);
     }
}
