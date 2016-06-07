
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmc6024
 */
public class Ball{

    private int width,x,y;
    Color color;
    Random r;
    public Ball(int WIDTH,int HEIGHT){
        r = new Random();
        width = 50;    
        x = WIDTH/2;
        y = 650;   
        color = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());   
    }   
    
    public void moveLeft(){
        
                try{ 
                if(!(x<width/2)){
                    x-=20;}
                }
                catch(Exception e){} 
       
    }
    
    public void moveRight(){
       
            try{ 
                if(!(720-x<width/2)){
                    x+=20;
                 }
            }catch(Exception e){} 
        
    }
    
    
    
   public  void draw(Graphics g)
    {   //draw the ball
        g.setColor(color);
        g.fillOval((int)x,(int)y,width,width);
    }
    
}
