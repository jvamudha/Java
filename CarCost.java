class CarCost
{
int price, tax, totalprice; 
String carname;
int taxrate=12.5;

int Totalprice(double price,String carname)
{
tax=(price/100)*12.5; 
totalprice=price+tax;
System.out.println("The total price of car ",+carname," is ",+totalprice);
}
}
public static void main(String args[])
{
 Car c1=new car(); 
 c1.Totalprice(700000,"Nissan"); 
 Car c2 =new car(); 
 c2.Totalprice(110000,"Hyundai Creta");
}

