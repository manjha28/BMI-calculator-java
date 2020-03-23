import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BMICalculator extends Frame implements ActionListener

{
    Label l1,l2,l3,l7,l4,l5,l6;

    TextField t1,t2,t3;

    Button b1,b2,b3;

    public BMICalculator()
    {
        l1 = new Label("Height");
        l2 = new Label("Weight");
        l3 = new Label("BMI");
        l4 = new Label("BMI less than 18.5 is underweight");
        l5 = new Label("BMI b/w 18.5 to 24.9 is healthy");
        l6 = new Label("BMI b/w 25 to 29.9 is overweight");
        l7 = new Label("BMI more than 30 is obese");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("Calculate");
        b2 = new Button("Exit");
        b3 = new Button("Reset");

            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(b1);
            add(b2);
            add(b3);
add(l4);
add(l5);
add(l6);
add(l7);

            setSize(650,650);
            setTitle("BMICalculator");
            setLayout(new FlowLayout());
         
            b1.addActionListener(this);
             b2.addActionListener(this);
             b3.addActionListener(this);
          
    }
    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0;
        try
        {
            a = Double.parseDouble(t1.getText());
        }
        catch (NumberFormatException e) {
            t1.setText("Invalid input");
        }
        try
        {
            b = Double.parseDouble(t2.getText());
        }
        catch (NumberFormatException e) {
            t2.setText("Invalid input");
        }
        if(ae.getSource()==b1)
        {
            c = (b*b)/ a;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b3)
        {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }
    
        if(ae.getSource()==b2)
        {
            System.exit(0);
        }     
    }
    public static void main(String[] args)
    {
        BMICalculator c = new BMICalculator();
        c.setVisible(true);
        c.setLocation(400,400);
    }
}