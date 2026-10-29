import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

class Slip11{

    public Slip11() {
    JFrame frame=new JFrame();
    frame.setSize(600,350);
    frame.setLayout(new BorderLayout(10,20));
    
    JLabel text=new JLabel("Compound Interest Calculator");
    JPanel pan=new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
    pan.add(text);
    frame.add(pan,BorderLayout.NORTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	JLabel t1=new JLabel("Principal Amount");
	JTextField f1=new JTextField(40);
	JPanel p2=new JPanel();
	p2.add(t1);
	p2.add(f1);

	JLabel t2=new JLabel("Interest rate %");
	JTextField f2=new JTextField(5);
	
	p2.add(t2);
	p2.add(f2);

	JLabel t3=new JLabel("Time Yrs");
	JTextField f3=new JTextField(30);

	p2.add(t3);
	p2.add(f3);

	JLabel t4=new JLabel("Total Amount:");
	JTextField f4=new JTextField(48);

	p2.add(t4);
	p2.add(f4);

    
	JLabel t5=new JLabel("Interest amount");
	JTextField f5=new JTextField(20);
    
	p2.add(t5);
	p2.add(f5);
    

	frame.add(p2,FlowLayout.LEFT);
	
    JPanel p3=new JPanel(new BorderLayout(10,20));
    JButton b1=new JButton("Calculate");
    
    p3.add(b1,BorderLayout.WEST);
    JButton b2=new JButton("Clear");
    p3.add(b2,BorderLayout.CENTER);
    JButton b3=new JButton("Close");
    p3.add(b3,BorderLayout.EAST);
    
    frame.add(p3,BorderLayout.SOUTH);
	
    
	
	

	 frame.setVisible(true);
	
    }

    

public static void main(String[] args) {
    

Slip11 s1=new Slip11();


}



}