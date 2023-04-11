package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Barra1 {
    public static int x1=840;
    public static int y1=360;
    
    private static int ancho=120;
    private static int alto=20;
    
    private boolean subir=true;
    
     public void paint(Graphics g){
        ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/barra1.png"));
        g.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
     }
     
      public Ellipse2D getBoundsBarra1(){
        return new Ellipse2D.Double(x1, y1,ancho,alto);
    }
      
     public void mover(){
         if(NinaAgua.interruptor==true || NinoFuego.interruptor==true){
             if(x1==840 && y1==360){
               subir=true;
             }
             if(x1==840 && y1==125){
                subir=false;
             }
             
             if(subir==true){
                y1=y1-5; 
             }else if(subir==false){
                y1=y1+5;
             }
             
         }
     } 
}
