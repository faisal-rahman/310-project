  import java.util.Scanner;
class admin extends common
{
  Scanner sc = new Scanner(System.in);
  waiter w [] = new waiter [100];
  static int wNum=0;
  cashier c[] = new cashier [100];
  static int cNum=0;
  
  public admin ()
  {
    addWaiter("Jack");
    addCashier("Jill");
    addCategory("Chinese","chinese cuisine");
    super.cat[0].newFood("chinese chicken","sweet and sour with gravy",1000);
    
  }
  
  void addWaiter(String name)
  {
    w[wNum]= new waiter(name);
    //w[wNum].getName();
    wNum++;
  }
  public waiter getWaiter()
  {
    return w[0];
  }
  void addCashier(String name)
  {
     c[cNum]= new cashier(name);
     cNum++;
  }
  
  void addCategory(String name, String desc)
  {
    super.cat[super.noCat]= new category(name,desc);
    super.noCat++;
  }
  void addFood(String cat, String name , int price)
  {
    super.getCat();
    System.out.println("Enter category");
    int categNum = sc.nextInt();
    super.cat[categNum].newFood(cat, name , price);
  }
  
}