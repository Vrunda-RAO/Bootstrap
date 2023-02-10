import java.awt.*;
import java.applet.*;
public class Demo extends Applet
{
   Image i;
  public void init()
   {
        i = getImage(getDoctumentBase(),"ball.jfif");
   }
public void paint(Graphics g)
{
  for(int a=0 ; a<500; a++)
   {
          g.drawImage(p,i,50,this);
          try
          {
             Thread.sleep(100);

          }
   catch(Exception e)
       {}
   }
}
}