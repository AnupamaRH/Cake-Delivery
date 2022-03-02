import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;
import java.io.IOException;
class cake extends JFrame
{
   JFrame f=new JFrame("Book Your Cake"); 
   JCheckBox BlackForest,AlmondChocolate,BountyChocolate,IrishCheeseCake,FreshFruitCake;
   JCheckBox Hazelnut,Vancho,WhiteForest,IrishCoffee,OreoChocolate;
   String emailhere;
   cake() throws IOException
  {
    //emailhere=email;
   //date
   JPanel main=new JPanel();
   BlackForest=new JCheckBox("Black Forest");
   JLabel date=new JLabel("Date:       ");
   Color brown = Color.decode("#b08913");
     String s1[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
     String s2[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox month=new JComboBox(s1);
    JComboBox dates=new JComboBox(s2);
    JPanel pan=new JPanel();
    
    f.setContentPane(new JLabel(new ImageIcon("D:\\oop JAVA\\cake delivery\\cakelist.jpg")));
    f.setLayout(new FlowLayout(FlowLayout.CENTER));
    //f.setLayout(new BorderLayout());


    JPanel datep=new JPanel();
    datep.add (date);
    datep.add(month);
    datep.add(dates);
    datep.setAlignmentX(CENTER_ALIGNMENT);
    datep.setBackground(brown);

  
    JPanel cakes=new JPanel();
    BlackForest=new JCheckBox("Black Forest");
    cakes.add(BlackForest);

    JPanel cake1=new JPanel();
    AlmondChocolate=new JCheckBox("Almond Chocolate");
    cake1.add(AlmondChocolate);

    JPanel cake2=new JPanel();
    BountyChocolate=new JCheckBox("Bounty Chocolate");
    cake2.add(BountyChocolate);

    JPanel cake3=new JPanel();
    IrishCheeseCake=new JCheckBox("Irish Cheese Cake");
    cake3.add(IrishCheeseCake);

    JPanel cake4=new JPanel();
    FreshFruitCake=new JCheckBox("Fresh Fruit Cake");
    cake4.add(FreshFruitCake);

    JPanel cake5=new JPanel();
    Hazelnut=new JCheckBox("Hazelnut");
    cake5.add(Hazelnut);

    JPanel cake6=new JPanel();
    Vancho=new JCheckBox("Vancho");
    cake6.add(Vancho);

    JPanel cake7=new JPanel();
    IrishCoffee=new JCheckBox("Irish Coffee");
    cake7.add(IrishCoffee);

    JPanel cake8=new JPanel();
    OreoChocolate=new JCheckBox("Oreo Chocolate");
    cake8.add(OreoChocolate);

    JPanel cake9=new JPanel();
    WhiteForest=new JCheckBox("White Forest");
    cake9.add(WhiteForest);

    pan.add(datep);
    main.add(cakes);main.add(cake1);main.add(cake2);main.add(cake3);main.add(cake4);main.add(cake5);main.add(cake6);main.add(cake7);main.add(cake8);main.add(cake9);
    pan.add(main);

  //   class CheckBoxListener implements ItemListener
  //   {
  //     public void itemStateChanged(ItemEvent e)
  //     {
  //      if(e.getSource()==BlackForest)
  //      {
  //         if(BlackForest.isSelected())
  //        // String query="INSERT INTO cakeorder VALUES(\'"+emailhere+"','"Black Forest",'1');";
  //         //int g=st.executeUpdate(query);
  //      }
  //     } 
  //  }

    BorderLayout b=new BorderLayout(2,1);

    JPanel manga=new JPanel();
    manga.add(pan);
    f.add(manga,BorderLayout.CENTER);
    
    //manga.setAlignmentX(CENTER_ALIGNMENT);
    //f.setAlignmentX(CENTER_ALIGNMENT);

    GridLayout layout = new GridLayout(3,4);
    layout.setVgap(10);
    layout.setHgap(10);
    main.setLayout(layout);

    f.setVisible(true);
    f.setSize(700,800);
    //p.setBackground(yelow);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
public static void main(String[] args) throws IOException
{
    new cake();
}
}