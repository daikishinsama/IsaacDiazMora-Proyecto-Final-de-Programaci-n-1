package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class InterruptorCompuerta {
    private static int x=80;
    private static int y=80;
    
    private static int ancho=40;
    private static int alto=40;
    
     public void paint(Graphics g){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/InterruptorCompuerta.png"));
            g.drawImage(m1.getImage(),x,y, ancho, alto,null);   
     }
       public Ellipse2D getBoundsInterruptorC(){
        return new Ellipse2D.Double(x, y,ancho,alto);
    }
}
