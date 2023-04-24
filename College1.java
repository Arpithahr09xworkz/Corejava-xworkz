class College1
{
static String[] departmentNames={"Computer Science","Civil","IS","EEE","EC","Biology","Chemistry","Physics","History","Music"};
public static void main(String college1[])
{
System.out.println("Main Started");
	getdepartmentNames();
System.out.println("Main Ended");
}
public static void getdepartmentNames()
{
System.out.println("Calling getdepartmentNames Method");
for(int i=0; i<departmentNames.length; i++)
{
				System.out.println(departmentNames[i]);
}
System.out.println("End of getdepartmentNames Method");
return;
}
}