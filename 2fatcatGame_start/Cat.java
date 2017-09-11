 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cat  extends Animal
{
     private int eatenPizza = 0;
     private int eatenApple = 0;
     private GreenfootImage cat_sit = new GreenfootImage("cat-sit.png");    //肥猫初始样子的图片
     private GreenfootImage eat_pizza = new GreenfootImage("cat-eat.png");      //肥猫吃匹萨动作的图片1
     private GreenfootImage eat_pizza2 = new GreenfootImage("cat-eat2.png");  
     private GreenfootImage walk_left = new GreenfootImage("cat-walk-left.png"); 
     private GreenfootImage walk_left2 = new GreenfootImage("cat-walk-left2.png"); 
     private GreenfootImage walk_right = new GreenfootImage("cat-walk-right.png"); 
     private GreenfootImage walk_right2 = new GreenfootImage("cat-walk-right2.png"); 
     private GreenfootImage walk_sit = new GreenfootImage("cat-sit.png");
     //肥猫吃匹萨动作的图片2
 
    public void act() 
    {
        checkKeyPress();        
        lookForPizza();
        lookForApple();          
    }    
    
    public void fatCatEatPizza()        //将Animal中的eat(Class class)方法扩展，增加猫吃匹萨的动画
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
        
    public void lookForPizza(){         //肥猫找匹萨吃，如果吃了3只匹萨，就跳舞找乐
        // Add code here.
        if(canSee(Pizza.class)){
            fatCatEatPizza();
            eatenPizza++;
            if(eatenPizza%3==0);
            dance();
        }
    }
        
    public void lookForApple(){         //肥猫偷苹果吃，如果偷吃了三只苹果，被困睡着了。为了有好的睡的动画效果，可以多调用sleep()几次
        // Add code here.
    }
        
    public void checkKeyPress()         //控制肥猫左右行走的功能方法
    {
        //如果按了左方向键，就朝左走
        if(Greenfoot.isKeyDown("left")){
            if(this.getImage()==walk_left)
               setImage("cat-walk-left.png");
            else
               setImage("cat-walk-left2.png"); 
            setLocation(getX()-3,getY());
        }
        //如果按了右方向键，就朝右走
          if(Greenfoot.isKeyDown("right")){
            if(this.getImage()==walk_right)
               setImage("cat-walk-right.png");
            else
               setImage("cat-walk-right2.png"); 
            setLocation(getX()+3,getY());
        }
        //如果既没按左键、又没按右键，就保持站立姿势
        if(Greenfoot.isKeyDown("right")==false&&
           Greenfoot.isKeyDown("right")==false)
           {
           setImage("cat-sit.png");
        }
        
    }
    
    public void dance()         //肥猫跳舞的方法
    {
         Greenfoot.playSound("music.wav");
        //肥猫跳舞第一套动作
            setImage("cat-dance.png");
            Greenfoot.delay(10);
            setImage("cat-sit.png");
            Greenfoot.delay(8);
            setImage("cat-dance-2.png");
            Greenfoot.delay(8);
            setImage("cat-sit.png");
            Greenfoot.delay(8);
        
        //肥猫跳舞第二套动作
            setImage("cat-dance.png");
            Greenfoot.delay(8);
            setImage("cat-dance-2.png");
            Greenfoot.delay(6);
        //肥猫跳舞结束动作
        setImage("cat-sit.png");

        
    }
        
    public void sleep()         //肥猫睡觉
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
