import sun.awt.image.ToolkitImage;

import java.awt.*;
import javax.swing.*;



public class BallGame extends  JFrame{
    Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
    double x=100;
    double y=100;
    boolean right=true;
    
    
    
    //画窗口的方法
    
    public void paint(Graphics g){
        System.out.println("窗口被重新画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        
        if(right){
            x=x+5;
        }else{x=x-5;}
        
        if (x>865-40-30){
            right=false;
        }
        
        if (x<40){
            right=true;
        }
        
    }
    
    
    void lanuchFrame(){
        setSize(865,500);
        setLocation(100,100);
        setVisible(true);
        
        
        
        
        while(true){
            repaint();
            try{
                Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("反反复复");
        BallGame game=new BallGame();
        game.lanuchFrame();
        
    }
    
    
}