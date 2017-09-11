import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A cat. Can do some things cats do. Or not.
 * 
 * @author Michael Kolling
 * @author Denise Lodge
 * @author Rebecca Lee
 * @author Mihaela Sabin
 * @version 2.0 - Sep 30, 2010
 */
public class Cat  extends Actor
{
    public void walkLeft(int nStep){     //朝左走 n 步,每步20个像素
        //填入相关代码
    }
    
    public void walkRight(int nStep){     //朝右走 n 步,每步20个像素
        //填入相关代码
    }
    
    private void walk(int nStep, int direction, String img1, String img2){   //走 n 步的动作方法，direction表示每半步的大小和方向
        //填入相关代码
    }       
    
    public void playPiano()
    {        
        //酷猫朝右走8步入场；播放史努比的音乐；
        walkRight(8);
        Greenfoot.playSound("snoopy.wav");
        Greenfoot.delay(10);; 
        
        //渐入佳境
        this.spinAwayToPlay(true);
        
        //中间过渡
        setImage("cat.png");
        
        //连续两段激情演奏
        this.twoPlayMoves(10);
        Greenfoot.playSound("snoopy.wav");
        this.twoPlayMoves(10);

        //恢复平静
        this.spinAwayToPlay(false);
        
        //结束动作
        setImage("cat.png");        
    }   
    
    public void spinAwayToPlay(boolean starting)
    {    
        //填入相关代码
    }
    
    private void twoPlayMoves(int howMany)
    {
        //填入相关代码
    }
    
    public void act(){
        playPiano();
    }
}
    

    




