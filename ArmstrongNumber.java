public class ArmstrongNumber
{
    public static void main(String[] args) {
        int num=157;
        int temp=num;
        int r,sum=0;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum)
        {
            System.out.println("It is a Armstrong number");
        }
        else
        {
            System.out.println("It is not a armstrong number");
        }
    }
}