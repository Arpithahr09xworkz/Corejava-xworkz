class CreditCard
{
static String[] cardNames={"VISA","Rupay","MasterCard","Burgundy","Priority","Delight","Online","Srcure","Titanium","Power","Rupay Platinium","Prime","Rewards","Salute","Mastercard"};
public static void main(String creditcard[])
{
System.out.println("List of CreditCard:");
System.out.println("1:" + cardNames[0] + "\n" + "2:" + cardNames[1] + "\n" + "3:" + cardNames[2] + "\n" + "3:" + cardNames[2] + "\n" + "4:"
+ cardNames[3] + "\n" + "5:" + cardNames[4] + "\n" + "6:" + cardNames[5] + "\n" + "7:" + cardNames[6] + "\n" + "8:" + cardNames[7] + "\n" + "9:"
+ cardNames[8] + "\n" + "10:" + cardNames[9] + "\n" + "11:" + cardNames[10] + "\n" + "12:" + cardNames[11] + "\n" + "13:" + cardNames[12] + "14:"
+ cardNames[13] + "\n" + "15:" + cardNames[14]);
for(int i=0; i<cardNames.length; i++)
{
	System.out.println(cardNames[i]);
}
}
}