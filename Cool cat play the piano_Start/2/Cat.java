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
        walk(nStep,-10,"cat-walk.png","cat-walk-2.png");
    }
    
    public void walkRight(int nStep){     //������ n ��,ÿ��20������
        //������ش���
         walk(nStep,10,"cat-walk-right.png","cat-walk-right-2.png");
    }
    
    private void walk(int nStep, int direction, String img1, String img2){   //�� n ���Ķ���������direction��ʾÿ�벽�Ĵ�С�ͷ���
        //������ش���
        for(int i=0;i<nStep;i++){
        setImage(img1);
        Greenfoot.delay(4);
        setLocation(getX()+direction,getY());
        setImage(img2);
        Greenfoot.delay(4);
        setLocation(getX()+direction,getY());
    }
    setImage("cat.png");
        
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
        if(starting==true){
         int n=1;
         /*
         while(n<=6){
            if(n<=3){
            setImage("spin-"+n+".png");
            }
            else{
            setImage("spin-"+(n-1)+"-piano.png");
            }
            Greenfoot.delay(6);
            n++;
            }
         
        }*/

        do{
            if(n<=3){
            setImage("spin-"+n+".png");
            }
            else{
            setImage("spin-"+(n-1)+"-piano.png");
            }
            Greenfoot.delay(6);
            n++;
            while(n<=6){
                
        }
            
        }
           
        
    }
    
    private void twoPlayMoves(int howMany)
    {
        //������ش���
    }
    
    public void act(){
        playPiano();
    }
}
    

    




