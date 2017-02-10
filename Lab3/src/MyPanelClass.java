import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
       static MyPanelClass myPanel = new MyPanelClass();
       
       public static void main(String[] args) {
           JFrame myFrame = new JFrame("SomeName");
            myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            myFrame.setLocation(800, 350);
            myFrame.setSize(210, 150);
            myFrame.getContentPane().add(myPanel);
            myFrame.setVisible(true);
       }          
       /**
     * 
     */
    private static final long serialVersionUID = 1L;

            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, height-80, width, y1-30);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height-60, width,y1-25 );
                        g.setColor(Color.RED);
                        g.fillRect(x1, height-40, width, y1-25);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height-20, width,y1-20 );
                        g.setColor(Color.RED);
                        g.fillRect(x1, height, width, y1-20);
                        
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        //g.setColor(Color.CYAN);
                        //g.drawRect(x1+5, y1+5, width-10, height-10);
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.RED);
                        //g.drawLine(x1, y2, x2, y1);
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval(x1+55, y1+45, width-110, height-100);
                        
                        
                         //Paint a triangle
                        Polygon t = new Polygon();
                        t.addPoint(x1+110, y1+55);
                        t.addPoint(x1, y1+110);
                        t.addPoint(x1, y1);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(t);
                        

                        //Polygon p = new Polygon();
                        //p.addPoint(x1 + 5, y1 + 25);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);
                       
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 20, y1 + 50);
                        p2.addPoint(x1 + 36, y1 + 50);
                        p2.addPoint(x1 + 42, y1 + 35);
                        p2.addPoint(x1 + 48, y1 + 50);
                        p2.addPoint(x1 + 64, y1 + 50);
                        p2.addPoint(x1 + 51, y1 + 60);
                        p2.addPoint(x1 + 56, y1 + 75);
                        p2.addPoint(x1 + 42, y1 + 65);
                        p2.addPoint(x1 + 29, y1 + 75);
                        p2.addPoint(x1 + 33, y1 + 60);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                       
            }
}