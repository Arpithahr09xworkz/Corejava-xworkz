class UberEats1
{
public static  double searchItem(String itemName)
{
System.out.println("searchItem method started");
	double price = 0.00 ;
if(" Tandoori Chiken " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  185.00;
}
if(" Lamb Chops " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  225.00;
}

if(" Mutton Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  240.00;
}

if(" Fish Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  220.00;
}

if(" Panner Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  170.00;
}

if(" Vegetable Seekh Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  165.00;
}

if(" Tandoori Mushroom Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  300.00;
}

if(" Egg Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  140.00;
}

if(" Chiken Pepper Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  190.00;
}

if(" Murg Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  190.00;
}

if(" Butter Chiken Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  190.00;
}

if(" Fried Chiken " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  150.00;
}

if(" Ghee Roast Dosa" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  80.00;
}

System.out.println("searchItem method ended");
return price;
}
public static  double searchItem(String itemName , int quantity)
{
System.out.println("searchItem method started");
	double price = 0.00 ;
if(" Tandoori Chiken " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =185.00 * quantity;
}
if(" Lamb Chops " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 225.00 * quantity;
}

if(" Mutton Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 240.00 * quantity;
}

if(" Fish Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 220.00 * quantity;
}

if(" Panner Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 170.00 *quantity;
}

if(" Vegetable Seekh Kabab " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 165.00 * quantity;
}

if(" Tandoori Mushroom Tikka " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 300.00 * quantity;
}

if(" Egg Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 140.00  *   quantity;
}

if(" Chiken Pepper Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 190.00 * quantity;
}

if(" Murg Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 190.00 * quantity;
}

if(" Butter Chiken Masala " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 190.00 * quantity;
}

if(" Fried Chiken " == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 150.00 * quantity;
}

if(" Ghee Roast Dosa" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price = 80.00 * quantity;
}
System.out.println("searchItem method ended");
return price;
}
}