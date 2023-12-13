
public class Gcd {
    public static void main(String[] args) {
        int a=50;
        int b=60;
        int g=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0&b%i==0)
            {
                System.out.println("The common factors of "+a+" and "+b+" are "+i);
                g=i;
            }
        }
        System.out.println("The Greatest Common Divisor of "+a+" and "+b+"is "+g);
        
    }
}
