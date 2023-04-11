package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Palanca {
    private static int x1=1240;
    private static int y1=600;
    
    private static int ancho=20;
    private static int alto=80;
    
     public void paint(Graphics g){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/palanca.png"));
            g.drawImage(m1.getImage(),x1,y1, ancho, alto,null);   
     }
     
     public Ellipse2D getBoundsInterruptor(){
        return new Ellipse2D.Double(x1, y1,ancho,alto);
    }
}
