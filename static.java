class test
{
  static int i;
  static
  {
    System.out.println("Static is called");
  }
  test()
  {
    System.out.println("Constructor is called"); 
  }
}
class staticjava
{
  public static void main(String[] args) {
    test a=new test();
  }
}