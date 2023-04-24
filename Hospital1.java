class Hospital1
{
static String[] doctorsName={"Dr. Smith","Dr.Abram","Dr.Ackerson","Dr.Albano","Dr.Althen","Dr.Blanks","Dr.Brooks","Dr.Castro","Dr.Coley","Dr.Danesh","Dr.Dial","Dr.Evil","Dr.Foster","Dr.Gower","Dr.Henry"};
public static void main(String Hospital1[])
{
System.out.println("Main Started");
	getdoctorsName();
System.out.println("Main Ended");
}
public static void getdoctorsName()
{
System.out.println("Calling getdoctorsName Method");
for(int i=0; i<doctorsName.length; i++)
{
System.out.println(doctorsName[i]);
}
System.out.println("End of getdoctorsName Method");
return;
}
}