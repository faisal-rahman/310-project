import java.util.Scanner;
class waiter extends common 
{
  Scanner sc = new Scanner(System.in);
  String name;
  order o[] = new order [100] ;
  int oNum=0;
  public waiter(String x)
  {
    name = x;
    
  }
  
  void getName()
  {
    System.out.println(name);
  }
  public food[] seeList()
  {
    super.getCat();
    System.out.println("Enter category");
    int categNum = sc.nextInt();
    super.cat[categNum].getFood();
     super.cat[categNum].getPrice();
    category ca = super.cat[categNum];
    System.out.println("Please enter number of orders");
    int orderSize= sc.nextInt();
    System.out.println("Please enter food id");
    food fr[] = new food[orderSize];
    for(int i=0;i<orderSize;i++)
    {
      int order= sc.nextInt();
      category c = super.cat[categNum];
      fr[i] = c.getFood(order);
      
      //foodOrder[i]=super.cat[categNum[order]].getFood(order);
    }
    return fr;
  }
  public order[] placeOrder()
  {
    food f [] = seeList();
    int a = totalPrice(f);
     o[oNum] = new order(f,a);
     oNum++;
    System.out.println("Total Price: "+a);
     return o;
  }
  public int totalPrice(food[] f)
  {
    int total=0;
    for(int i=0;i<f.length;i++)
    {
      total=total+f[i].price;
    }
     return total;
  }
}