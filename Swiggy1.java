class Swiggy1
{
public static  double searchItem(String itemName)
{
System.out.println("searchItem method started");
	double price = 0.00 ;
if(" Egg Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  70.00;
}
if(" Egg Chiken Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  80.00;
}
if(" Egg Panner Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  80.00;
}
if(" Mushroom Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  80.00;
}
if(" Prawn Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  90.00;
}
if("Masala Egg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  30.00;
}
if(" Atho Veg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  70.00;
}
if(" Mohingo Veg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  70.00;
}
if(" Paneer Soup " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  20.00;
}
if(" Mushroom Soup " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  50.00;
}
if(" Chiken Cheese Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  185.00;
}
if(" Chiken Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  180.00;
}
System.out.println("searchItem method ended");
return price;
}
public static  double searchItem(String itemName , int quantity)
{
System.out.println("searchItem method started");
	double price = 0.00 ;
if(" Egg Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 70.89 * quantity;
}
if(" Egg Chiken Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 80.00 * quantity;
}
if(" Egg Panner Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 80.00 * quantity;
}
if(" Mushroom Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 80.56 * quantity;
}
if(" Prawn Fry " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 90.00 * quantity;
}
if("Masala Egg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 30.00 * quantity;
}
if(" Atho Veg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 70.00 * quantity;
}
if(" Mohingo Veg " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 70.00 * quantity;
}
if(" Paneer Soup " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 20.00 * quantity;
}
if(" Mushroom Soup " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 50.00 * quantity;
}
if(" Chiken Cheese Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 185.00 * quantity;
}
if(" Chiken Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 180.90 * quantity;
}
System.out.println("searchItem method ended");
return price;
}
}