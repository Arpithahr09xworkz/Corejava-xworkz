class UberEatsTester1
{
public static void main(String ubereats1[])
{
System.out.println("Main method started");
String itemName = "Chiken Pepper Masala";
double priceForSingle = UberEats1.searchItem(itemName);
double  priceWithQuantity = UberEats1.searchItem(itemName,5);
System.out.println("the price of " + itemName + "is" + priceForSingle);
System.out.println("the price of  " + itemName + "is" + priceWithQuantity);
System.out.println("Main  method ended");
}
}