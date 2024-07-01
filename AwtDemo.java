import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6, l7,l8;
    Checkbox c1, c2, c3, c4, c5;
    CheckboxGroup cbg;
    TextField t1, t2;
    Button b;

    MyApp() {
        super("Java AWT");
        setSize(1000, 600);
        setLayout(null); // Border layout set to null
        setVisible(true); // Making the frame need to be visible

        // setting the check box and label values
        c1 = new Checkbox("C Program");
        c1.setBounds(10, 50, 250, 30);
        add(c1);
        l1 = new Label("Not Selected");
        l1.setBounds(300, 50, 600, 30);
        add(l1);

        c2 = new Checkbox("C++ Program");
        c2.setBounds(10, 100, 250, 30);
        add(c2);
        l2 = new Label("Not Selected");
        l2.setBounds(300, 100, 600, 30);
        add(l2);

        c3 = new Checkbox("Java Program");
        c3.setBounds(10, 150, 250, 30);
        add(c3);
        l3 = new Label("Not Selected");
        l3.setBounds(300, 150, 600, 30);
        add(l3);

        // creating instance for checkboxGroup
        cbg = new CheckboxGroup();
        // creating instance for c4
        c4 = new Checkbox("Male", cbg, false);
        c4.setBounds(10, 200, 250, 30);
        add(c4);
        l4 = new Label("Not Selected");
        l4.setBounds(300, 200, 600, 30);
        add(l4);

        // creating for c5
        c5 = new Checkbox("Female", cbg, false);
        c5.setBounds(10, 250, 250, 30);
        add(c5);
        l5 = new Label("Not Selected");
        l5.setBounds(300, 250, 600, 30);
        add(l5);

        // creating and setting bounds for l6, l7, t1, and t2
        l6 = new Label("Enter the value 1:");
        l6.setBounds(10, 300, 250, 30);
        add(l6);
        t1 = new TextField();
        t1.setBounds(300, 300, 250, 30);
        add(t1);

        l7 = new Label("Enter the value 2:");
        l7.setBounds(10, 350, 250, 30);
        add(l7);
        t2 = new TextField();
        t2.setBounds(300, 350, 250, 30);
        add(t2);

        b=new Button("Click me");
        b.setBounds(10,400,100,30);
        add(b);
        b.addActionListener(this);
        l8 = new Label();
        l8.setBounds(10, 450, 540, 30);
        add(l8);


        // adding ItemListener for c1 check boxes
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText(e.getStateChange() == 1 ? "Checked" : "Unchecked");
            }
        });

        // adding for c2 checkbox
        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l2.setText(e.getStateChange() == 1 ? "Checked" : "Unchecked");
            }
        });

        // adding for c3 checkbox
        c3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l3.setText(e.getStateChange() == 1 ? "Checked" : "Unchecked");
            }
        });

        // adding ItemListener for c4 and c5 checkboxes
        c4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l4.setText(e.getStateChange() == 1 ? "Selected" : "Not Selected");
            }
        });

        c5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l5.setText(e.getStateChange() == 1 ? "Selected" : "Not Selected");
            }
        });

        // used to close the window
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        String s1=t1.getText();
        String s2=t2.getText();
        if(s1.isEmpty()||s2.isEmpty())
        {
            l8.setText("Please enter some value!!");
        }
        else{
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=a+b;
            String result=String.valueOf(c);
            l8.setText("TOTAL :" +result);
        }
    }
}

class AwtDemo {
    public static void main(String[] args) throws Exception {
        MyApp n = new MyApp();
    }
}
