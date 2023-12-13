class demo extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
    }
}
public class thread
{
    public static void main(String[] args) {
        demo dem = new demo();
        dem.start();
    }
}
