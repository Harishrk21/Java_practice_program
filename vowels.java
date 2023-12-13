import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        try{
        for(int i=0;i<s1.length();i++)
        {
            char word =s1.charAt(i);
            if(word=='a'||word=='e'||word=='i'||word=='o'||word=='u')
            {
                c=c+1;
            }

        }
        System.out.println(c);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
