import java.util.Scanner;
class comp
{ 	Scanner s=new Scanner(System.in);
	int real,com;
	comp()
	{real=s.nextInt();
	com=s.nextInt();
	}
	void Display()
	{System.out.println(real + "+" + com + "i");
	}	
}
class complex
{	public static void main(String[] args) 
	{System.out.println("Enter Real and Complex : ");
	comp c=new comp();
	c.Display();	
	}
}