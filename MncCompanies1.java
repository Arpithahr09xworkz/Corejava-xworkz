class MncCompanies1
{
static String[] companyNames={"Infosys","Accenture","Tesco","Mcafee","Texas","HPE","Oracle","Torry","Ness","Microsoft","Accord","Sonata","Fidelity","Vaps","Aris" ,"IBM","KPMG","Lam","Samsung","Dare"};
public static void main(String MncCompanies1[])
{
System.out.println("Main Started");
	getcompanyNames();
System.out.println("Main Ended");
}
public static void getCompanyNames()
{
System.out.println("Calling getcompanyNames Method");
for(int i=0; i<companyNames.length; i++)
{
	System.out.println(companyNames[i]);
}
System.out.println("End of getcompanyNames Method");
return;
}
}