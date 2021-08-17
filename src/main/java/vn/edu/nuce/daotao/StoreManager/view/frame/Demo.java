/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.view.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anh
 */
public class Demo extends JFrame {
     public Demo() 
  {
    //Headers for JTable 
    String[] columns = {"Id", "Name", "Address", "Image"};
    //data for JTable in a 2D table
    Object[][] data = {
      {1, "Thomas", "Alaska", new ImageIcon(getClass().getResource("/Login-icon.png")) },
      {2, "Jean", "Arizona", new ImageIcon (new ImageIcon("C:/Users/Anh/Downloads/unnamed.jpg").getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) )},
      {3, "Yohan", "California", new ImageIcon("user3.png") },
      {4, "Emily", "Florida", new ImageIcon("user4.png") }
    };
    DefaultTableModel model = new DefaultTableModel(data, columns);
      
    JTable table = new JTable(model) {
      public Class getColumnClass(int column) {
        return (column == 3) ? Icon.class : Object.class;
      }
    };
    
    //Set row height to 60 pixels
    table.setRowHeight(100);
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane);
      
    JLabel labelHead = new JLabel("List of employees");
    labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
    getContentPane().add(labelHead,BorderLayout.PAGE_START);
  }
  public static void main(String[] args) 
  {
    Demo frame = new Demo();  
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setSize(500, 330);
    frame.setVisible(true);
  }
}
