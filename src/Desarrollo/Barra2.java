package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Barra2 {
    public static int x2=340;
    public static int y2=560;
    
    private static int ancho=120;
    private static int alto=20;
    
    private boolean subir=true;
    
     public void paint(Graphics g){
        ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/barra2.png"));
        g.drawImage(m1.getImage(),x2,y2, ancho, alto,null);
     }
     
      public Ellipse2D getBoundsBarra2(){
        return new Ellipse2D.Double(x2, y2,ancho,alto);
    }
      
     public void mover(){
         if(NinaAgua.palanca==true || NinoFuego.palanca==true){
             if(x2==340 && y2==560){
               subir=true;
             }
             if(x2==340 && y2==385){
                subir=false;
             }
             
             if(subir==true){
                y2=y2-5;
                
             }else if(subir==false){
                y2=y2+5;
             }
             
         }
     } 
}
