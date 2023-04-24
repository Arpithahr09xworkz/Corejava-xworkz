class Pub1
{
static String[] pubNames={"What's in a Name","Toit Brewpub","Gilly's 104 Bar","Pecos Stones","District 6","The Biere Club","Hoppipola","The Noon Wine","Vapour Pub","Pelican","Doffpub","Dhamaka By Oat Soda","SkyDeck by Sherlock's","Hammered pub","Boozy Griffin","Levels pub"};
public static void main(String Pub1[])
{
System.out.println("Main Started");
	getPubNames();
System.out.println("Main Ended");
}
public static void getPubNames()
{
System.out.println("Calling getPubNames Method");
for(int i=0; i<pubNames.length; i++)
{
System.out.println(pubNames[i]);
}
System.out.println("End of getPubNames Method");
return;
}
}