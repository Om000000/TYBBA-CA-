import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Window{
    public static void main(String[] args) {
        
    
    JFrame main= new JFrame("FirstWindow");
    main.setSize(400,500);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    


    /* SUB ACTION  */
    JFrame p=new JFrame("New Menu om");
    p.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    p.setSize(300,300);
    p.setVisible(false);

    /* BUTTON */
    JButton button= new JButton("Open menu");
    JPanel panel=new JPanel();
    


    button.addActionListener(new ActionListener(){
        @Override 
         public void actionPerformed(ActionEvent e) {
            p.setVisible(true);
            
        }
    });

   main.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
        Image ico=Toolkit.getDefaultToolkit().getImage("/OM.png");
        main.setIconImage(ico);
    JMenuBar menu=new JMenuBar();
    JMenu Files=new JMenu("Files");

    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

        panel.add(button);
        menu.add(Files);
        main.setVisible(true);
        menu.add(editMenu);
        menu.add(helpMenu);

        main.setJMenuBar(menu);



   
    


    }

}

