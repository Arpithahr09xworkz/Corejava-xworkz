class Garage1
{
static String workersName[]={"Vivian","Caroline","Lennon","Kaylee","Camille","Adley","Chelsia","Harper","Lila","Ava","Mia","Daisy","Aria","Lilly","Bella"};
public static void main(String Garage1[])
{
System.out.println("Main Started");
	getworkersName();
	System.out.println("Main Ended");
}
public static void  getworkersName()
{
System.out.println("Calling getworkersName Method");
for(int i=0; i<workersName.length; i++)
{
System.out.println(workersName[i]);
}
System.out.println("End of getworkersName Method");
return;
}
}