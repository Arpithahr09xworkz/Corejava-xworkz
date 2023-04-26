class Zomoto1
{
public static  double searchItem(String itemName)
{
System.out.println("searchItem method started");
	double price = 0.00 ;
if("Masala Dose" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  50.00;
}
if("Gobi" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  30.00;
}
if("Veg Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  120.00;
}
if("Pizza" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  399.00;
}
if("Mutton Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  180.00;
}
if("French Fries" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  90.00;
}
if("Dragon Chiken" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  200.00;
}
if("Chiken Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  190.00;
}
if("Chiken Shorma" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  190.00;
}
if("Fried Rice" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
return  60.90;
}
System.out.println("searchItem method ended");
return price;
}

public static  double searchItem(String itemName , int quantity)
{
System.out.println("searchItem method started");
	double price = 0.00;
if("Masala Dose" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  50.00 * quantity;
}
if("Gobi" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  30.30 * quantity;
}
if("Veg Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price  =  120.00 * quantity;
}
if("Pizza" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  399.90 * quantity;
}
if("Mutton Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  180.00 * quantity;
}
if("French Fries" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  90.00 * quantity;
}
if("Dragon Chiken" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  200.00 * quantity;
}
if("Chiken Biriyani" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  190.00 * quantity;
}
if("Chiken Shorma" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  190.00 * quantity;
}
if("Fried Rice" == itemName)
{
System.out.println("Thanks for Selecting" + itemName);
price =  60.00 * quantity;
}{
System.out.println("searchItem method ended");
return price;
}
}
}