import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.Enumeration;
import java.sql.*;
import java.io.IOException;


public class caketest extends JFrame
{
    String ven,emailhere,qtytaken;

    caketest()
    {
    JLabel date=new JLabel("Date:       ");
    Color brown = Color.decode("#b08913");
    String s1[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
    String s2[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox month=new JComboBox(s1);
    JComboBox dates=new JComboBox(s2);

    JRadioButton BF=new JRadioButton("Black Forest");    
    JRadioButton WF=new JRadioButton("White Forest");
    JRadioButton AC=new JRadioButton("Almound Chocolate");
    JRadioButton BC=new JRadioButton("BountyChocolate");
    JRadioButton IRC=new JRadioButton("IrishCheeseCake");
    JRadioButton FF=new JRadioButton("FreshFruitCake"); 
    JRadioButton HN=new JRadioButton("Hazelnut"); 
    JRadioButton VC=new JRadioButton("Vancho"); 
    JRadioButton IC=new JRadioButton("IrishCoffe"); 
    JRadioButton OC=new JRadioButton("OreoChocolate"); 
    JTextField qty=new JTextField(5);
    JButton next=new JButton("Next");
    JLabel qtylabel=new JLabel("Quantity:");

    ButtonGroup cake_grp = new ButtonGroup();
    cake_grp.add(BF);
    cake_grp.add(WF); 
    cake_grp.add(AC);
    cake_grp.add(BC); 
    cake_grp.add(IRC);
    cake_grp.add(FF); 
    cake_grp.add(HN);
    cake_grp.add(VC); 
    cake_grp.add(IC);
    cake_grp.add(OC);    

    setLayout(new FlowLayout());
    add(date);
    add(dates);
    add(month);
    add(WF);
    add(BF);
    add(AC);
    add(BC);
    add(IRC);
    add(FF);
    add(HN);
    add(VC);
    add(IC);
    add(OC);
    add(qtylabel);
    add(qty);
    add(next);
    next.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e) 
        {
          try
          {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          }
          catch(Exception ex)
          {
           System.out.println("not found");
          }
          try 
          {
            ResultSet rs;
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/oracle@localhost:1521:xe");
          //  java.sql.Statement sta=conn.createStatement();
          //java.sql.ResultSet rst=sta.executeQuery("SELECT date,venue from exploredb");
          //selection of cake
            for (Enumeration<AbstractButton> buttons = cake_grp.getElements(); buttons.hasMoreElements();) 
            {
              AbstractButton button = buttons.nextElement();
              if (button.isSelected())
              {
                ven=button.getText();
                qtytaken=qty.getText();
                System.out.print(ven+qtytaken);
              }
            }
          }
          catch(Exception e1)
          {
            System.out.println("ERROR 1");
          }   
        }
    });
}
    public static void main(String[] args)
    {
        caketest cake = new caketest();
        cake.setVisible(true);
        cake.setSize(400,400);
        cake.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
