class ZomotoTester1
{
public static void main(String zomoto1[])
{
System.out.println("Main method started");
String itemName = "Pizza";
double priceForSingle = Zomoto1.searchItem(itemName);
double  priceWithQuantity = Zomoto1.searchItem(itemName,12);
System.out.println("the price of " + itemName + "is" + priceForSingle);
System.out.println("the price of  " + itemName + "is" + priceWithQuantity);
System.out.println("Main  method ended");
}
}