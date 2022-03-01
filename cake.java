import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
class cake extends JFrame
{
   JFrame f=new JFrame("Book Your Cake"); 
   JLabel BlackForest,AlmondChocolate,BountyChocolate,IrishCheeseCake,FreshFruitCake;
   JLabel Hazelnut,Vancho,WhiteForest,IrishCoffee,OreoChocolate;
   String emailhere;
   cake() throws IOException
  {
    //emailhere=email;
   //date
   BlackForest=new JLabel("Black Forest");
   JLabel date=new JLabel("Date:       ");
     String s1[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
     String s2[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox month=new JComboBox(s1);
    JComboBox dates=new JComboBox(s2);
    JPanel datep=new JPanel();
    datep.add (date);
    datep.add(month);
    datep.add(dates);
    JPanel bf= new JPanel();
    bf.add(BlackForest);
    BufferedImage myPicture = ImageIO.read(new File("D:\\oop JAVA\\cake delivery\\irish.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		bf.add(picLabel);
		f.add(bf);
    f.setLayout(new GridBagLayout());
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