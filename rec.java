import java.util.Scanner;
class rectangle
{
	Scanner s=new Scanner(System.in);
	double area,length,breadth;
	rectangle()
	{
		length=s.nextDouble();
		breadth=s.nextDouble();
	}
	void CalculateArea()
	{
		area=(length*breadth);
		System.out.println("Area Is: " + area);
	}
}
class rec
{
	public static void main(String[] args) 
	{
		System.out.println("Enter length and breadth of the rectangle: ");
		rectangle r=new rectangle();
		r.CalculateArea();	
	}
}
