//Jacob Hinchey
//Program7
//1113
import java.awt.Graphics;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Program7a extends JFrame
{
  public DrawPanel drawPanel;
  public double mouseX, mouseY, mousePrevX, mousePrevY;
  public JLabel header;
  public JPanel gridPanel;
  public JButton oval;
  public JButton image;
  public JButton center;
  public JButton name;
  public JButton safe;
  public void paintComponent(Graphics g)
  {

    g.setColor(Color.yellow);
    g.fillOval(100, 100, 240, 240);
  }
  public Program7a()
  {
    super("Jacob Hinchey");
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setSize(800, 600);
    contentPane.setLayout( new BorderLayout() );
    gridPanel = new JPanel();
    gridPanel.setLayout(new GridLayout(1, 4));
    contentPane.add(gridPanel, BorderLayout.NORTH);
    oval = new JButton("Oval");
    gridPanel.add(oval);
    oval.setBounds(10, 10, 90, 30);
    image = new JButton("Image");
    gridPanel.add(image);
    image.setBounds(110, 10, 90, 30);
    image.setVisible(true);
    center = new JButton("Center");
    gridPanel.add(center);
    center.setBounds(210, 10, 90, 30);
    name = new JButton("Jacob Hinchey");
    gridPanel.add(name);
    name.setBounds(310, 10, 200, 30);
    contentPane.setBackground(Color.BLACK);

  }
public void actionPerformed(ActionEvent event)
{
    Object source = event.getSource();

        if (source == name)
        {
            System.out.print("Yes");
        }
  }


    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
    public void mousePressed(MouseEvent event)
    {
        System.out.println("Mouse Pressed.");
        double x = event.getX() - drawPanel.getX();
        double y = event.getY() - drawPanel.getY();

        mouseX = x;
        mouseY = y;
        mousePrevX = x;
        mousePrevY = y;

        drawPanel.model.select(x,y);
    }
    public void mouseClicked(MouseEvent event) {}
    public void mouseReleased(MouseEvent event)
    {
        System.out.println("Mouse Released.");
        drawPanel.model.selectedObject = null;
    }

    public void mouseMoved(MouseEvent event) {}
    public void mouseDragged(MouseEvent event)
    {
        System.out.println("Mouse dragged");

        mousePrevX = mouseX;
        mousePrevY = mouseY;
        mouseX = event.getX() - drawPanel.getX();
        mouseY = event.getY() - drawPanel.getY();

        Sprite s = drawPanel.model.selectedObject;
        if (s == null)
        {
            System.out.println("s is null");
            return;
        }
        s.x += (mouseX-mousePrevX);
        s.y += (mouseY-mousePrevY);
        repaint();
      }




  public static void main(String[] args)
  {
    Program7a frame = new Program7a();
    frame.setVisible(true);
    frame.getContentPane().add(new Program7a());
    frame.pack();
    System.out.println("Running");

  }
}
class Sprite
{
    public Image image;   // image that will be displayed
    public double x,y;    // x and y position of sprite
    public double w,h;    // width and height
    public double vx,vy;  // velocity of the sprite
    public double border; // collision border

    public Sprite(String fileName, double x, double y, double vx, double vy, double w, double h, double border)
    {
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.border = border;
        this.w = w;
        this.h = h;
    }

    public void drawSprite(Graphics g)
    {
        g.drawImage(image, (int)x, (int)y, (int)w, (int)h, null);
    }

    public void moveSprite()
    {
        x += vx;
        y += vy;
    }

    public boolean containsPoint(double xpos, double ypos)
    {
        double xmin = this.x + this.border;
        double xmax = this.x + this.w - this.border;
        double ymin = this.y + this.border;
        double ymax = this.y + this.h - this.border;

        if (ypos >= ymin && ypos <= ymax && xpos >= xmin && xpos <= xmax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean overlap(Sprite s, Sprite t)
    {
        double xmins = s.x + s.border;
        double xmaxs = s.x + s.w - s.border;
        double ymins = s.y + s.border;
        double ymaxs = s.y + s.h - s.border;

        double xmint = t.x + t.border;
        double xmaxt = t.x + t.w - t.border;
        double ymint = t.y + t.border;
        double ymaxt = t.y + t.h - t.border;

        if (xmins > xmaxt) return false;
        if (xmint > xmaxs) return false;
        if (ymins > ymaxt) return false;
        if (ymint > ymaxs) return false;
        return true;
    }
}
