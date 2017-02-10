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
            myFrame.setSize(200, 200);
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
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        g.setColor(Color.CYAN);
                        g.drawRect(x1+5, y1+5, width-10, height-10);
                        
            }
}