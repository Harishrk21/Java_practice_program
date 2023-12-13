public class DivisorOfANumber {
    public static void main(String[] args) {
        int num=10;
        int count=0;
        for(int i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            System.out.println("The number"+i+" is a divisor of"+num);
            count++;
        }
    }
    System.out.println("the total divisors count is :"+count);
    }
}
