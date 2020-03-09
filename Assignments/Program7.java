// Jacob Hinchey
// Program 7
// 1113


import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;

class Program7 extends JPanel
{
    private static String S = "oval";
    private int x = 220;
    private int y = 180;
    private int width = 350;
    private int height = 250;
    public Program7()
    {
        JButton ovalButton = new JButton("Oval");
        JButton imageButton = new JButton("Image");
        JButton centerButton = new JButton("Center");
        JButton specialButton = new JButton("Jacob Hinchey");
        this.setBackground(Color.BLACK);
        MouseDrag mouseDrag = new MouseDrag();
        this.addMouseListener(mouseDrag);
        this.addMouseMotionListener(mouseDrag);
        this.add(ovalButton);
        this.add(imageButton);
        this.add(centerButton);
        this.add(specialButton);
        ovalButton.addActionListener(e ->
        {
            S = "oval";
            this.x = 30;
            this.y = 50;
            this.repaint();
        }
        );
        imageButton.addActionListener(e ->
        {
            S = "Image";
            this.x = 30;
            this.y = 50;
            this.repaint();
        }
        );
        centerButton.addActionListener(e ->
        {
            this.x = 220;
            this.y = 180;
            this.repaint();
        }
        );
        specialButton.addActionListener(e ->
        {
            S = "names";
            this.repaint();
        }
        );
    }
    private boolean isInsideEllipse(Point point)
    {
        return new Ellipse2D.Float(this.x, this.y, this.width, this.height).contains(point);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (S.contentEquals("oval"))
        {
            g.setColor(Color.ORANGE);
            g.fillOval(this.x, this.y, this.width, this.height);
            setBackground(Color.BLACK);
        }
        if (S.contentEquals("Image"))
        {
            Image image = this.Load();
            g.drawImage(image, this.x, this.y, 350, 200, this);
            setBackground(Color.BLACK);
        }
        if (S.contentEquals("names"))
        {
            g.setColor(Color.YELLOW);
            g.fill3DRect(235, 145, 360, 360, true);
            g.setPaintMode();
            setBackground(Color.GRAY);
        }
    }
    private Image Load()
    {
        BufferedImage picture = null;
        String fileName = "Logo.png";
        try
        {
            URL url = this.getClass().getResource(fileName);
            picture = ImageIO.read(url);
        }
        catch (IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        return picture;
    }
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setTitle("Jacob Hinchey");
        jFrame.add(new Program7());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(3);
    }
    private class MouseDrag extends MouseAdapter
    {
        private boolean dragging;
        private Point last;

        private MouseDrag()
        {
            this.dragging = false;
        }
        public void mousePressed(MouseEvent m)
        {
            this.last = m.getPoint();
            this.dragging = S.contains("Image") || Program7.this.isInsideEllipse(this.last);
            Program7.this.repaint();
        }
        public void mouseReleased(MouseEvent m)
        {
            this.last = null;
            this.dragging = false;
            Program7.this.repaint();
        }
        public void mouseDragged(MouseEvent m)
        {
            int dx = m.getX() - this.last.x;
            int dy = m.getY() - this.last.y;
            if (this.dragging)
            {
                Program7.this.x = Program7.this.x + dx;
                Program7.this.y = Program7.this.y + dy;
            }
            this.last = m.getPoint();
            Program7.this.repaint();
        }
    }
}
