package EmployeeManagementSystm.Project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton view,add,update,remove;

    Home(){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("EmployeeManagementSystm/Icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("RALEWAY",Font.BOLD,25));
        image.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("view  Employees");
        view .setBounds(820,80,150,40);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("update Employee");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("remove Employee");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
        image.add(remove);


        setSize(1120,630);
        setLocation(100,50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            setVisible(false);
            new AddEmployee();

        } else if (e.getSource()==view) {
            setVisible(false);
            new ViewEmployee("");

        } else if (e.getSource()==update) {
            setVisible(false);
            new UpdateEmployee("").setVisible(true);
        } else if(e.getSource() == remove){
            setVisible(false);
            new RemoveEmployee().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
