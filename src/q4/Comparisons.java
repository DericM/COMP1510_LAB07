package q4;

import java.util.Scanner;

public class Comparisons {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        String string1;
        String string2;
        String string3;
        
        int int1;
        int int2;
        int int3;
        
        System.out.println();
        System.out.println("Comparisons.java");
        System.out.println();
        
        System.out.print("Enter first String: ");
        string1 = scan.next(); 
        System.out.print("Enter second String: ");
        string2 = scan.next(); 
        System.out.print("Enter third String: ");
        string3 = scan.next(); 
        
        System.out.println("The largest string is: " + Compare3.Largest(string1,string2,string3));
        
        
        System.out.print("Enter first int: ");
        int1 = scan.nextInt(); 
        System.out.print("Enter second int: ");
        int2 = scan.nextInt(); 
        System.out.print("Enter third int: ");
        int3 = scan.nextInt(); 
        
        System.out.println("The largest int is: " + Compare3.Largest(int1,int2,int3));
        
        
    }

}
