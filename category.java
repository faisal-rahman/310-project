import java.util.Scanner;
class category extends common
{
  Scanner sc = new Scanner(System.in);
  food f[] = new food[100];
  int fNum=0;
 String name;
 String des;
  
  public category(String x, String y)
  {
    this.name = x;
    this.des= y ;
  }
  
  String getName()
  {
    return name;
  }
  food getFood(int i)
  {
    return f[i];
  }
  void newFood(String x, String y, int z)
  {
    f[fNum]=new food(x,y,z);
    fNum++;
  }
  public void getFood()
  {
    for(int i=0; i<50; i++)
    {
      if(f[i]!=null)
      {
      System.out.print(i+":");
      System.out.print(f[i].getName());
      }
    }
  }
  public void getPrice()
  {
    for(int i=0; i<50; i++)
    {
      if(f[i]!=null)
      {
      
      System.out.println(" "+f[i].getPrice() +"TK");
      }
    }
  }
}