import sun.awt.image.ToolkitImage;

import java.awt.*;
import javax.swing.*;



public class BallGame2 extends  JFrame{
    Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
    double x=100;
    double y=100;
    double degree=3.14/3;

    //画窗口的方法

    public void paint(Graphics g){
        System.out.println("窗口被重新画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
        
        x=x+10*Math.cos(degree);
        y=y+10*Math.sin(degree);
        
        if (y>500-40-30 || y<40){
            degree=-degree;
        }
        
        if(x>865-40-30 || x<40){
            degree=3.14-degree;
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
        BallGame2 game=new BallGame2();
        game.lanuchFrame();

    }


}