package EmployeeManagementSystm.Project1;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class AddEmployee extends JFrame implements ActionListener {
    Random ran = new Random();
    int number = ran.nextInt(999999);
    JTextField tfname,tfaddress,tfphone,tfemail,tfsalary,tffname,tfdesignation,tfaddhar;
    JDateChooser dcdob;
    JLabel lblempId;
    JComboBox cbedeucation;
    JLabel iblempId;
    JButton add,back;
    AddEmployee(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);

        JLabel labelfname = new JLabel("father's Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);

        JLabel labeldob = new JLabel("Date of Birth");
        labeldob .setBounds(50,200,150,30);
        labeldob .setFont(new Font("serif",Font.PLAIN,20));
        add(labeldob );

        dcdob = new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary .setBounds(400,200,150,30);
        labelsalary .setFont(new Font("serif",Font.PLAIN,20));
        add(labelsalary );

        tfsalary = new JTextField();
        tfsalary.setBounds(600,200,150,30);
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress .setBounds(50,250,150,30);
        labeladdress .setFont(new Font("serif",Font.PLAIN,20));
        add(labeladdress );

        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone No");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("serif",Font.PLAIN,20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif",Font.PLAIN,20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);

        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(400,300,150,30);
        labeleducation.setFont(new Font("serif",Font.PLAIN,20));
        add(labeleducation);

        String courses[] = {"B_Tech","BCA","BBA","MBA","MCA","MTech"};
        cbedeucation = new JComboBox(courses);
        cbedeucation.setBackground(Color.white);
        cbedeucation.setBounds(600,300,150,30);
        add(cbedeucation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation .setBounds(50,350,150,30);
        labeldesignation .setFont(new Font("serif",Font.PLAIN,20));
        add(labeldesignation );

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200,350,150,30);
        add(tfdesignation);

        JLabel labeladdhar = new JLabel("Addhar No");
        labeladdhar.setBounds(400,350,150,30);
        labeladdhar.setFont(new Font("serif",Font.PLAIN,20));
        add(labeladdhar);

        tfaddhar = new JTextField();

//        JTextField tfaddhar = new JTextField();
        tfaddhar.setBounds(600,350,150,30);
        add(tfaddhar);

        JLabel labelempId = new JLabel("EmployeeId");
        labelempId.setBounds(50,400,150,30);
        labelempId.setFont(new Font("serif",Font.PLAIN,20));
        add(labelempId);

        lblempId = new JLabel(""+number);
        lblempId.setBounds(200,400,150,30);
        lblempId.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempId);



        add = new JButton("Add Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add(add);

        back = new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        add(back);

        setSize(1120,630);
        setLocation(100,50);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfemail.getText();
            String email = tfemail.getText();
            String education = (String) cbedeucation.getSelectedItem();
            String designation = tfdesignation.getText();
            String addhar = tfaddhar.getText();
            String empId = lblempId.getText();


            try{
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+addhar+"','"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added Successfully");
            } catch (Exception ex){
                ex.printStackTrace();
            }

        }else {
            setVisible(false);
            new Home();
        }

    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
