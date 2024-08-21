// Create a variable to store a person's name and age, and print out a message with both details.

import java.util.Scanner;

class Question_1{
    public static void main(String[] args)
    {
        Scanner Myscan= new Scanner(System.in);
        String name;
        System.out.printf("Enter a Name :");
        name=Myscan.nextLine(); 
        int age;
        System.out.printf("Enter a Age :");
        age=Myscan.nextInt();   
        
        System.out.println("Your A Details.....");
        System.out.println("Name : "+name+" , Age : "+age);
       // System.out.println();
    }
}