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
    //BlackForest
    JPanel bf= new JPanel();
    bf.add(BlackForest);
    BufferedImage myPicture = ImageIO.read(new File("D:\\oop JAVA\\cake delivery\\irish.png"));
    ImageIcon icon = new ImageIcon(myPicture);
    Image scaleImage = icon.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT);
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		bf.add(picLabel);
		f.add(bf);
    
    //AlmondChocolate
    AlmondChocolate=new JLabel("Almond Chocolate");
    JPanel ac= new JPanel();
    ac.add(AlmondChocolate);
    BufferedImage al = ImageIO.read(new File("D:\\oop JAVA\\cake delivery\\almond.jpg"));
    ImageIcon alicon = new ImageIcon(al);
    Image ai = alicon.getImage().getScaledInstance(15, 15,Image.SCALE_DEFAULT);
		JLabel picLabelAl = new JLabel(new ImageIcon(al));
		ac.add(picLabelAl);
		f.add(ac);
        ac.setPreferredSize(new Dimension(350, 190));

    
    //BountyChocolate
    BountyChocolate =new JLabel("Bounty Chocolate");
    JPanel bc= new JPanel();
    bc.add(BountyChocolate);
    BufferedImage bci = ImageIO.read(new File("D:\\oop JAVA\\cake delivery\\bc.jpg"));
    ImageIcon bcicon = new ImageIcon(bci);
    Image bcc = alicon.getImage().getScaledInstance(15, 15,Image.SCALE_DEFAULT);
		JLabel picLabelbc = new JLabel(new ImageIcon(bci));
		bc.add(picLabelbc);
		f.add(bc);
    f.setLayout(new GridLayout());
    
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