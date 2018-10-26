  import java.util.Scanner;
public class main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    admin a = new admin ();
    order [] arr=new order[0];
    
    
    System.out.println("Select User");
    System.out.println("admin, press 1");
    System.out.println("customer, press 2");
    System.out.println("cashier, press 3");
    int id = sc.nextInt();
    
    
    if(id==1)
    {
    System.out.println("add waiter , press 1");
    System.out.println("add cashier, press 2");
    System.out.println("add category, press 3");
    System.out.println("add food, press 4");
    id = sc.nextInt();
      if(id==1)
      {
        System.out.println("Enter name");
         String s = sc.nextLine();
        a.addWaiter(s);
        
      }
      if(id==2)
      {
        System.out.println("Enter name");
        
         String s = sc.nextLine();
         a.addCashier(s);
        
      }
       if(id==3)
      {
        System.out.println("enter category");
         String s = sc.nextLine();
        System.out.println("enter description");
          String s1 = sc.nextLine();
        a.addCategory(s,s1);
      }
       if(id==4)
       {
         System.out.println("enter category");
         String s = sc.nextLine();
        System.out.println("enter description");
         String s1 = sc.nextLine();
         System.out.println("enter description");
         int s2 = sc.nextInt();
        a.addFood(s,s1,s2);
       }
    }
    else if(id==2)
    {
      System.out.println("would you like to place an order?");
      System.out.println("if yes press 1");
      System.out.println("if no press 2");
        id = sc.nextInt();
        if(id==1)
        {
          waiter w = a.getWaiter();
          arr= w.placeOrder();
        }
    }
    else if(id==3)
    {
      System.out.println("Print order?");
      System.out.println("if yes press 1");
      System.out.println("if no press 2");
      id = sc.nextInt();
      if(id==1)
      {
        for(int i=0;i<arr.length;i++)
          if(arr[i]!=null)
        {
          arr[i].printOrder(arr);
        }
      }
    }
      
    
    
  }
}