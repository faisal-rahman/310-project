class order 
{
  static int totalPrice;
  
  static food f[] = new food[100];
  public order(food[] fNew, int price)
  {
    totalPrice = price;
    f=fNew;
  }
  void printFood()
  {
    for(int i=0;i<f.length;i++)
    {
      
      if(f[i]!=null)
      {
        System.out.println(f[i].name);
      }
    }
  }
  void printPrice()
  {
    for(int i=0;i<f.length;i++)
    {
      
      if(f[i]!=null)
      {
        System.out.println(f[i].price);
      }
    }
  }
  void printOrder(order[] o)
  {
    for(int i=0;i<o.length;i++)
    {
      if(o[i]!=null)
      {
        System.out.println("For order: "+i);
      o[i].printFood();
      o[i].printPrice();
      }
    }
  }
}