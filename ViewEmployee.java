package EmployeeManagementSystm.Project1;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
//import not.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener {
    JTable table;
    Choice cemployeeId;

    JButton search,print,update,back;
     ViewEmployee(String EmpId){
         getContentPane().setBackground(Color.white);
         setLayout(null);

         JLabel searchlbl = new JLabel("Search by Employee Id");
         searchlbl.setBounds(20,20,150,20);
         add(searchlbl);

         cemployeeId = new Choice();
         cemployeeId.setBounds(180,20,150,20);
         add(cemployeeId);

         //JTable table = new JTable();

         try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from employee");
             //table.setModel(DbUtils.resultSetToTableModel(rs));
             while (rs.next()){
                 cemployeeId.add(rs.getString("empId"));
             }
         }catch (Exception e){
             e.printStackTrace();
         }

         table = new JTable();
         try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from employee");
             table.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) {
             e.printStackTrace();
         }





         JScrollPane jsp = new JScrollPane(table);
         jsp.setBounds(0,100,900,600);
         add(jsp);

         search = new JButton("search");
         search.setBounds(20,70,80,20);
         search.addActionListener(this);
         add(search);

         print = new JButton("Print");
         print.setBounds(120,70,80,20);
         print.addActionListener(this);
         add(print);

         update = new JButton("Update");
         update.setBounds(220,70,80,20);
         update.addActionListener(this);
         add(update);

         back = new JButton("Back");
         back.setBounds(320,70,80,20);
         back.addActionListener(this);
         add(back);

         setSize(900,630);
         setLocation(100,50);
         setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== search){
            String query = "select * from employee where empId = '"+cemployeeId.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ex){
                ex.printStackTrace();
            }

        } else if (e.getSource()==print){
            try{
                table.print();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        } else if (e.getSource()== update) {
            setVisible(false);
            new UpdateEmployee(cemployeeId.getSelectedItem());


        }else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new ViewEmployee("");
    }
}
