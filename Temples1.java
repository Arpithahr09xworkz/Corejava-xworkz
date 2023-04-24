class Temples1
{
static String[] godNames={"Ganapati","Hanjeneya","Vishnu","Krishna","Shiva","Narasimha Swami","Virabdrheshawara","Laxmidevi","Parvati","Sati","Radha","Rukmini","Annaporneshwari","Mukambika","Yallamma"};
public static void main(String Temples1[])
{
System.out.println("Main Started");
	getGodNames();
System.out.println("Main Ended");
}
public static void getGodNames()
{
System.out.println("Calling getGodNames Method");
for(int i=0; i<godNames.length; i++)
{
System.out.println(godNames[i]);
}
System.out.println("End of getGodNames Method");
return;
}
}