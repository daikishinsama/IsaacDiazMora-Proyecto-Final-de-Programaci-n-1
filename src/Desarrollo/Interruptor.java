package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Interruptor {
    private static int x1=320;
    private static int y1=280;
    
    private static int ancho=40;
    private static int alto=40;
    
     public void paint(Graphics g){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/interruptor.png"));
            g.drawImage(m1.getImage(),x1,y1, ancho, alto,null);   
     }
     
     public Ellipse2D getBoundsInterruptor(){
        return new Ellipse2D.Double(x1, y1,ancho,alto);
    }
}
