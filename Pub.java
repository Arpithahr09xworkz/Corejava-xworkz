class Pub
{
static String[] pubNames={"What's in a Name","Toit Brewpub","Gilly's 104 Bar","Pecos Stones","District 6","The Biere Club","Hoppipola","The Noon Wine","Vapour Pub","Pelican","Doffpub","Dhamaka By Oat Soda","SkyDeck by Sherlock's","Hammered pub","Boozy Griffin","Levels pub"};
public static void main(String Pub[])
{
System.out.println("List of pubNames:");
System.out.println("1:" + pubNames[0] + "\n" + "2:" + pubNames[1] + "\n" + "3:" + pubNames[2] + "\n" + "3:" + pubNames[2] + "\n" + "4:"
+ pubNames[3] + "\n" + "5:" + pubNames[4] + "\n" + "6:" + pubNames[5] + "\n" + "7:" + pubNames[6] + "\n" + "8:" + pubNames[7] + "\n" + "9:"
+ pubNames[8] + "\n" + "10:" + pubNames[9] + "\n" + "11:" + pubNames[10] + "\n" + "12:" + pubNames[11] + "\n" + "13:" + pubNames[12] + "14:"
+ pubNames[13] + "\n" + "15:" + pubNames[14]);
for(int i=0; i<pubNames.length; i++)
{
	System.out.println(pubNames[i]);
}
}
}