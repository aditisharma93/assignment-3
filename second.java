import java.lang.*;
import java.util.*;
class second
{  Scanner ss=new Scanner (System.in);
    int i=0,j,temp;
    int b[]=new int [10];
    second()
    {
      for(i=0;i<10;i++)
        {
          b[i]=ss.nextInt();
        }  
    }
    void sort()
    {
      for(i=0;i<10;i++)
    {
      for(j=0;j<10;j++)
      {
        if(b[i]<b[j])
        {
          temp=b[i];
          b[i]=b[j];
          b[j]=temp;
        }
      }
    }
    }
    void large()
    {
      System.out.println("Second Largest Number: " + b[8]);
    }
}
class secondlarge
{
  public static void main(String [] args)
  {
    System.out.println("Enter Ten Elements: ");
    second s=new second();
    s.sort();
    s.large();
  }
}