class food 
{
  String name;
  String desc;
  int price;
  public food(String x, String y, int z)
  {
    this.name=x;
    this.desc=y;
    this.price=z;
  }
  public String getName()
  {
    return name;
  }
  public int getPrice()
  {
    return price;
  }
}