import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.Enumeration;
import java.sql.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class cakebill extends JFrame
{
    JPanel pic_panel, bill_panel;
    cakebill()
    {
        pic_panel = new JPanel();
        BufferedImage myPicture = ImageIO.read(new File("D:\\oop JAVA\\cake delivery\\cakelist.jpg")); 
        JLabel picLabel = new JLabel(new ImageIcon(myPicture)); 
        add(picLabel);
        //pic_panel.setContentPane(new JLabel(new ImageIcon("D:\\oop JAVA\\cake delivery\\cakelist.jpg")));


    }
    public static void main(String[] args)
    { 

    }
}
