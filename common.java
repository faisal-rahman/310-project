class common 
{
  static int noCat=0;
  
  static category cat[]= new category[100];
  
  public void getCat()
  {
    for(int i=0; i<50; i++)
    {
      if(cat[i]!=null)
      {
        System.out.print(i+":");
      System.out.println(cat[i].getName());
      }
    }
  }
}