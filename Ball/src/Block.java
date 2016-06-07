
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fjy8029
 */
public class Block implements Runnable{
    private int width,dx,dy,x,y;
    Color color;
    
    Random r;
    public Block(int WIDTH, int HEIGHT){
        r = new Random();
        width = r.nextInt(50)+50;
        do{
          x = r.nextInt(WIDTH);
        }while(x<width/2 || x>WIDTH-width/2);     
        y = this.width/2;
        do{
          dx = 0;
          dy = r.nextInt(8)+5;
        }while(dy ==0);
        color = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
        
    }
    
    public boolean requestStop(){
        if(y+width/2>=1280){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public void run() {
        while(!requestStop())
        {   
            x += dx;
            y += dy;
            try
            {
                Thread.sleep(30);
            }
            catch(InterruptedException e){}
        }
    }
    public void draw(Graphics g)
    {   //draw the ball
//        
//        g.setColor(color);
//        g.fillOval((int)x,(int)y,width,width);
        
        g.setColor(color);
        g.fillRect(x-(width/2),(y-width/2),width,width);
        g.setColor(Color.WHITE);
        g.drawRect(x-(width/2),(y-width/2),width,width);
    }
}
