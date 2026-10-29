import java.awt.BorderLayout;
import javax.swing.*;

class Slip13{
Slip13(){
JFrame frame=new JFrame();
frame.setLayout(new BorderLayout(10,10));

JButton btn=new JButton("Show table");
DefaultListModel<String> model = new DefaultListModel<>();
JList<String> list=new JList<>(model);
frame.add(new JScrollPane(list));



JLabel lab=new JLabel("Enter a number");
JPanel pan=new JPanel();
JPanel pan2=new JPanel();
JTextField text=new JTextField(20);

btn.addActionListener(e->{
    model.clear();

    try {
        int num=Integer.parseInt(text.getText());
         for (int i = 1; i <= 10; i++) {
            
        
        model.addElement(num+"x"+i+"="+(num*i));
        }
        
    } 
    catch (Exception ex){
        model.addElement("Please enter a valid number:");
    }
});

pan2.add(lab,BorderLayout.CENTER);
pan2.add(text);

frame.add(pan2,BorderLayout.NORTH);

frame.add(btn,BorderLayout.SOUTH);









frame.setSize(600,600);
frame.setTitle("Calculation");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
public static void main(String args[]){
    
   Slip13 s=new Slip13();
    

}



}