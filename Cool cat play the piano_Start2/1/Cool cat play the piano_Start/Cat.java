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
    public void walkLeft(int nStep){     //������ n ��,ÿ��20������
        //������ش���
    }
    
    public void walkRight(int nStep){     //������ n ��,ÿ��20������
        //������ش���
    }
    
    private void walk(int nStep, int direction, String img1, String img2){   //�� n ���Ķ���������direction��ʾÿ�벽�Ĵ�С�ͷ���
        //������ش���
    }       
    
    public void playPiano()
    {        
        //��è������8���볡������ʷŬ�ȵ����֣�
        walkRight(8);
        Greenfoot.playSound("snoopy.wav");
        Greenfoot.delay(10);; 
        
        //����Ѿ�
        this.spinAwayToPlay(true);
        
        //�м����
        setImage("cat.png");
        
        //�������μ�������
        this.twoPlayMoves(10);
        Greenfoot.playSound("snoopy.wav");
        this.twoPlayMoves(10);

        //�ָ�ƽ��
        this.spinAwayToPlay(false);
        
        //��������
        setImage("cat.png");        
    }   
    
    public void spinAwayToPlay(boolean starting)
    {    
        //������ش���
    }
    
    private void twoPlayMoves(int howMany)
    {
        //������ش���
    }
    
    public void act(){
        playPiano();
    }
}
    

    




