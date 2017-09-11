 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cat  extends Animal
{
     private int eatenPizza = 0;
     private int eatenApple = 0;
     private GreenfootImage cat_sit = new GreenfootImage("cat-sit.png");    //��è��ʼ���ӵ�ͼƬ
     private GreenfootImage eat_pizza = new GreenfootImage("cat-eat.png");      //��è��ƥ��������ͼƬ1
     private GreenfootImage eat_pizza2 = new GreenfootImage("cat-eat2.png");  
     private GreenfootImage walk_left = new GreenfootImage("cat-walk-left.png"); 
     private GreenfootImage walk_left2 = new GreenfootImage("cat-walk-left2.png"); 
     private GreenfootImage walk_right = new GreenfootImage("cat-walk-right.png"); 
     private GreenfootImage walk_right2 = new GreenfootImage("cat-walk-right2.png"); 
     private GreenfootImage walk_sit = new GreenfootImage("cat-sit.png");
     //��è��ƥ��������ͼƬ2
 
    public void act() 
    {
        checkKeyPress();        
        lookForPizza();
        lookForApple();          
    }    
    
    public void fatCatEatPizza()        //��Animal�е�eat(Class class)������չ������è��ƥ���Ķ���
    {
            // Add code here.   
            if(canSee(Pizza.class)){
                eat(Pizza.class);
                setImage("cat-eat.png");
                Greenfoot.delay(10);
                setImage("cat-eat2.png");
                Greenfoot.delay(10);
                setImage("cat-sit.png");
            }
    }
        
    public void lookForPizza(){         //��è��ƥ���ԣ��������3ֻƥ��������������
        // Add code here.
        if(canSee(Pizza.class)){
            fatCatEatPizza();
            eatenPizza++;
            if(eatenPizza%3==0);
            dance();
        }
    }
        
    public void lookForApple(){         //��è͵ƻ���ԣ����͵������ֻƻ��������˯���ˡ�Ϊ���кõ�˯�Ķ���Ч�������Զ����sleep()����
        // Add code here.
    }
        
    public void checkKeyPress()         //���Ʒ�è�������ߵĹ��ܷ���
    {
        //���������������ͳ�����
        if(Greenfoot.isKeyDown("left")){
            if(this.getImage()==walk_left)
               setImage("cat-walk-left.png");
            else
               setImage("cat-walk-left2.png"); 
            setLocation(getX()-3,getY());
        }
        //��������ҷ�������ͳ�����
          if(Greenfoot.isKeyDown("right")){
            if(this.getImage()==walk_right)
               setImage("cat-walk-right.png");
            else
               setImage("cat-walk-right2.png"); 
            setLocation(getX()+3,getY());
        }
        //�����û���������û���Ҽ����ͱ���վ������
        if(Greenfoot.isKeyDown("right")==false&&
           Greenfoot.isKeyDown("right")==false)
           {
           setImage("cat-sit.png");
        }
        
    }
    
    public void dance()         //��è����ķ���
    {
         Greenfoot.playSound("music.wav");
        //��è�����һ�׶���
            setImage("cat-dance.png");
            Greenfoot.delay(10);
            setImage("cat-sit.png");
            Greenfoot.delay(8);
            setImage("cat-dance-2.png");
            Greenfoot.delay(8);
            setImage("cat-sit.png");
            Greenfoot.delay(8);
        
        //��è����ڶ��׶���
            setImage("cat-dance.png");
            Greenfoot.delay(8);
            setImage("cat-dance-2.png");
            Greenfoot.delay(6);
        //��è�����������
        setImage("cat-sit.png");

        
    }
        
    public void sleep()         //��è˯��
    {
          setImage("cat-sleep-1.png");
                Greenfoot.delay(10);
                setImage("cat-sleep-2.png");
                Greenfoot.delay(10);
                setImage("cat-sleep-3.png");
                Greenfoot.delay(10);
                setImage("cat-sleep-4.png");
                Greenfoot.delay(10);
      
        setImage("cat-sit.png");

    }
}
