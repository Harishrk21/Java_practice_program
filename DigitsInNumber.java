public class DigitsInNumber {
    public static void main(String[] args) {
        int num=123456;
        int count=0;
        while(num>0)
        {
            num=num/10;
            count+=1;
        }
        System.out.println("The count in a number is : "+count);
    }
}
