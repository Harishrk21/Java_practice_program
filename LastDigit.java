import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int result=num%10;
        System.out.println("The last digit of a  given number is :"+result);
    }
}
