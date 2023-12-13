import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner i= new Scanner(System.in);
        int num =i.nextInt();
        
        if(num%2==0)
        
            System.out.println("The number is even");
        
        else
        
            System.out.println("The number is odd");
        
    }
}
