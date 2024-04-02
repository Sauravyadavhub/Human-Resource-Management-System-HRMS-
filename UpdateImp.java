package EmployeeManagementSystm.Project1;


//import com.toedter.calendar.JDateChooser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import  java.sql.*;
//
//import java.util.Random;
//
//
//public class UpdateImp extends JFrame implements ActionListener {
//
//    JTextField tfeducation,tfname,tfaddress,tfphone,tfemail,tfsalary,tffname,tfdesignation,tfaddhar,dob;
//    JLabel lblempId;
//
////    JLabel iblempId;
//    JButton add,back;
//    String EmpId;
//    UpdateImp(String EmpId){
//        this.EmpId = EmpId;
//        getContentPane().setBackground(Color.white);
//        setLayout(null);
//
//        JLabel heading = new JLabel("Update Employee Details");
//        heading.setBounds(320,30,500,50);
//        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
//        add(heading);
//
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50,150,150,30);
//        labelname.setFont(new Font("serif",Font.PLAIN,20));
//        add(labelname);
//
//        JLabel lblname = new JLabel();
//        lblname.setBounds(200,150,150,30);
//        add(lblname);
//
//        JLabel labelfname = new JLabel("father's Name");
//        labelfname.setBounds(400,150,150,30);
//        labelfname.setFont(new Font("serif",Font.PLAIN,20));
//        add(labelfname);
//
//        tfname = new JTextField();
//        tfname.setBounds(600,150,150,30);
//        add(tfname);
//
//        JLabel labeldob = new JLabel("Date of Birth");
//        labeldob .setBounds(50,200,150,30);
//        labeldob .setFont(new Font("serif",Font.PLAIN,20));
//        add(labeldob );
//
//        JLabel lbldob = new JLabel();
//        lbldob.setBounds(200,200,150,30);
//        add(lbldob);
//
//        JLabel labelsalary = new JLabel("Salary");
//        labelsalary .setBounds(400,200,150,30);
//        labelsalary .setFont(new Font("serif",Font.PLAIN,20));
//        add(labelsalary );
//
//        tfsalary = new JTextField();
//        tfsalary.setBounds(600,200,150,30);
//        add(tfsalary);
//
//        JLabel labeladdress = new JLabel("Address");
//        labeladdress .setBounds(50,250,150,30);
//        labeladdress .setFont(new Font("serif",Font.PLAIN,20));
//        add(labeladdress );
//
//        tfaddress = new JTextField();
//        tfaddress.setBounds(200,250,150,30);
//        add(tfaddress);
//
//        JLabel labelphone = new JLabel("Phone No");
//        labelphone.setBounds(400,250,150,30);
//        labelphone.setFont(new Font("serif",Font.PLAIN,20));
//        add(labelphone);
//
//        tfphone = new JTextField();
//        tfphone.setBounds(600,250,150,30);
//        add(tfphone);
//
//        JLabel labelemail = new JLabel("Email");
//        labelemail.setBounds(50,300,150,30);
//        labelemail.setFont(new Font("serif",Font.PLAIN,20));
//        add(labelemail);
//
//        tfemail = new JTextField();
//        tfemail.setBounds(200,300,150,30);
//        add(tfemail);
//
//        JLabel labeleducation = new JLabel("Higest Education");
//        labeleducation.setBounds(400,300,150,30);
//        labeleducation.setFont(new Font("serif",Font.PLAIN,20));
//        add(labeleducation);
//
//        //String courses[] = {"B_Tech","BCA","BBA","MBA","MCA","MTech"};
//        tfeducation = new JTextField();
//        tfeducation.setBackground(Color.white);
//        tfeducation.setBounds(600,300,150,30);
//        add(tfeducation);
//
//        JLabel labeldesignation = new JLabel("Designation");
//        labeldesignation .setBounds(50,350,150,30);
//        labeldesignation .setFont(new Font("serif",Font.PLAIN,20));
//        add(labeldesignation );
//
//        tfdesignation = new JTextField();
//        tfdesignation.setBounds(200,350,150,30);
//        add(tfdesignation);
//
//        JLabel labeladdhar = new JLabel("Addhar No");
//        labeladdhar.setBounds(400,350,150,30);
//        labeladdhar.setFont(new Font("serif",Font.PLAIN,20));
//        add(labeladdhar);
//
//        JLabel lblaadhar = new JLabel();
//        lblaadhar.setBounds(600, 350, 150, 30);
//        add(lblaadhar);
//
////        JTextField tfaddhar = new JTextField();
////        lblaadhar.setBounds(600,350,150,30);
////        add(lblaadhar);
//
//        JLabel labelempId = new JLabel("EmployeeId");
//        labelempId.setBounds(50,400,150,30);
//        labelempId.setFont(new Font("serif",Font.PLAIN,20));
//        add(labelempId);
//
//        lblempId = new JLabel();
//        lblempId.setBounds(200,400,150,30);
//        lblempId.setFont(new Font("serif",Font.PLAIN,20));
//        add(lblempId);
//        try{
//            Conn c = new Conn();
//            String query = "select * from employee where empId='"+lblempId+"'";
//            ResultSet rs = c.s.executeQuery(query);
//            while (rs.next()){
//                lblname.setText(rs.getString("name"));
//                tffname.setText(rs.getString("fname"));
//                lbldob.setText(rs.getString("dob"));
//                tfaddress.setText(rs.getString("address"));
//                tfsalary.setText(rs.getString("salary"));
//                tfphone.setText(rs.getString("phone"));
//                tfemail.setText(rs.getString("email"));
//                tfeducation.setText(rs.getString("education"));
//                lblaadhar.setText(rs.getString("aadhar"));
//                lblempId.setText(rs.getString("empId"));
//                tfdesignation.setText(rs.getString("destigation"));
//
//
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//
//        add = new JButton("Update Details");
//        add.setBounds(250,550,150,40);
//        add.addActionListener(this);
//        add.setBackground(Color.black);
//        add.setForeground(Color.white);
//        add(add);
//
//        back = new JButton("Back");
//        back.setBounds(450,550,150,40);
//        back.addActionListener(this);
//        back.setBackground(Color.black);
//        back.setForeground(Color.white);
//        add(back);
//
//        setSize(900,700);
//        setLocation(250,50);
//        setVisible(true);
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == add) {
//
//            String fname = tfname.getText();
//            //String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
//            String salary = tfsalary.getText();
//            String address = tfaddress.getText();
//            String phone = tfphone.getText();
//            String email = tfemail.getText();
//            String education = tfeducation.getText();
//            String designation = tfdesignation.getText();
////            String addhar = tfaddhar.getText();
////            String empId = lblempId.getText();
//
//
//            try{
//                Conn conn = new Conn();
//                String query = "update employee set fname='"+fname+"',salary='"+salary+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',designation='"+designation+"' where empId = '"+EmpId+"'";
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null,"Details Update Successfully");
//            } catch (Exception ex){
//                ex.printStackTrace();
//            }
//
//        }else {
//            setVisible(false);
//            new Home().setVisible(true);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        new UpdateImp("");
//    }
//}



