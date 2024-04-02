package EmployeeManagementSystm.Project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);

        //Add Image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("EmployeeManagementSystm/Icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);

        //Use Button
        JButton clickhere = new JButton("Click here to continue");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);




        setSize(1170,650);
        setLocation(50,50);
        setVisible(true);

        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {

        new Splash();
    }
}
