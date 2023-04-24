class IceCreams1
{
static String[] brands={"Baskin","Haagen","Ben&Jerry","Bule Bell","Diary Queen","Breyers","Cold Stone","Magnum","Blue Bunny","Dreyer's","Klondike bar","Graeter's","Cornetto","Talenti","Salt&straw"};
public static void main(String IceCreams1[])
{
System.out.println("Main Started");
	getbrands();
System.out.println("Main Ended");
}
public static void getbrands()
{
System.out.println("Calling getbrands Method");
for(int i=0; i<brands.length; i++)
{
	System.out.println(brands[i]);
}
System.out.println("End of getbrands Method");
return;
}
}