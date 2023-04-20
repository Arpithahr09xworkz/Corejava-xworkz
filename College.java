class College
{
static String[] departmentNames={"Computer Science","Civil","IS","EEE","EC","Biology","Chemistry","Physics","History","Music"};
public static void main(String College[])
{
System.out.println("List of departmentNames:");
System.out.println("1:" + departmentNames[0] + "\n" + "2:" + departmentNames[1] + "\n" + "3:" + departmentNames[2] + "\n" +
"4:" + departmentNames[3] + "\n" + "5:" + departmentNames[4] + "\n" + "6:" + departmentNames[5] + "\n" + "7:" + departmentNames[6]
+ "\n" + "8:" + departmentNames[7] + "\n" + "9:" + departmentNames[8] + "\n" + "10:" + departmentNames[9] + "\n" + "11:" +
departmentNames[10] + "\n" + "12:" + departmentNames[11] + "\n" + "13:" + departmentNames[12] + "\n" + "14:" + departmentNames[13]
+ "\n" + "15:" + departmentNames[14]);
for(int i=0; i<departmentNames.length; i++)
{
	System.out.println(departmentNames[i]);
}
}
}