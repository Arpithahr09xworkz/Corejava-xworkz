class CreditCard1
{
static String cardNames[]={"VISA","RuPay","MasterCard","Burgundy","Priority","Delight","Online Rewards","Secure","Titanium","Power","Rupay Platinum","Mastered Classic","Prime","Salute","Rewards",};
public static void main(String creditCard1[])
{
System.out.println("Main Started");
	getCardNames();
System.out.println("Main Ended");
}
public static void getCardNames()
{
System.out.println("Calling getCardNames Method");
for(int i=0; i<cardNames.length; i++)
{
	System.out.println(cardNames[i]);
}
System.out.println("Ended of getCardNames Method");
return;
}
}