class SwiggyTester1
{
public static void main(String swiggy1[])
{
System.out.println("Main method started");
String itemName = "Paneer Soup";
double priceForSingle = Swiggy1.searchItem(itemName);
double  priceWithQuantity = Swiggy1.searchItem(itemName,5);
System.out.println("the price of " + itemName + "is" + priceForSingle);
System.out.println("the price of  " + itemName + "is" + priceWithQuantity);
System.out.println("Main  method ended");
}
}