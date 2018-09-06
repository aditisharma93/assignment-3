import java.util.*;
import java.lang.*;

class flow
{Scanner q=new Scanner(System.in);
  int a[]=new int[10];
  int i,t;
  flow()
  {
    for(i=0;i<10;i++)
    {
      a[i]=q.nextInt();
    }
  }
  void wave()
  {
    i=0;
    while(i<9)
    {
      t=a[i];
      a[i]=a[i+1];
      a[i+1]=t;
      i=i+2;
    }
    for(i=0;i<10;i++)
    {
      System.out.print(a[i] + " ");
    }
  }
}
class waveform
{
  public static void main(String[] args) 
  {
    System.out.println("Enter Elements..");
    flow f=new flow();
    f.wave();
  }
}