import javax.swing.*;
import java.awt.*;
public class FirstGui {
    public static void main(String[] args) {
        abc obj =new abc();
        obj.setVisible(true);
        obj.setSize(400,400);
    }
}
class abc extends JFrame
{
    public abc()
    {
        setLayout(new FlowLayout());
        JLabel a = new JLabel("hello");
        add(a);
        JLabel b = new JLabel("Welcomeeeee");
        add(b);
    }
}
