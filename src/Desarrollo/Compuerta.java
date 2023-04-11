package Desarrollo;

import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Compuerta {
    public static int x=1040;
    public static int y=560;
    
    private static int ancho=20;
    private static int alto=120;
    
     public void paint(Graphics g){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/compuerta.png"));
            g.drawImage(m1.getImage(),x,y, ancho, alto,null);   
     }
     public void mover(){
         if(NinaAgua.interruptorC==true || NinoFuego.interruptorC==true){
             y=y-5;
             if(y==435){
                 NinaAgua.interruptorC=false;
                 NinoFuego.interruptorC=false;
             }
         }
     }
}
