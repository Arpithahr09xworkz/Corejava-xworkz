class FilpcartTest1
{
public static void main(String filpcart[])
{
System.out.println(" Main Method started ");
	String productName = " Mascara ";
	double priceForSingle = Filpcart1.searchProduct(productName);
double  priceWithQuantity = Filpcart1.searchProduct(productName,10);
System.out.println("the price of " + productName + "is" + priceForSingle);
System.out.println("the price of  " + productName + "is" + priceWithQuantity);
System.out.println(" Main Method ended ");
}
}