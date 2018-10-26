class cashier 
{
  String name;
  
  public cashier(String x)
  {
    name = x;
  }
  
  void getName()
  {
    System.out.println(name);
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