class TouristPlace
{
static String[] placeNames={"Lalbagh ","Iskcon Temple","Cubbon Park","Bengaluru Palace","Vidhana Soudha","Bannerghatta National Park","St.Mary's","Jawaharlal Neharu Planetarium","National Gallery of Modern Art","HAL Heritage Centre","Tipu  Sultan's Summer Palace","Sri Someshwara Swami Temple","Chitrakala Parishath","UB city","Ulsoor Lake"};
public static void main(String touristplace[])
{
System.out.println("List of TouristPlace:");
System.out.println("1:" + placeNames[0] + "\n" + "2:" + placeNames[1] + "\n" + "3:" + placeNames[2] + "\n" + "3:" + placeNames[2] + "\n" + "4:"
+ placeNames[3] + "\n" + "5:" + placeNames[4] + "\n" + "6:" + placeNames[5] + "\n" + "7:" + placeNames[6] + "\n" + "8:" + placeNames[7] + "\n" + "9:"
+ placeNames[8] + "\n" + "10:" + placeNames[9] + "\n" + "11:" + placeNames[10] + "\n" + "12:" + placeNames[11] + "\n" + "13:" + placeNames[12] + "14:"
+ placeNames[13] + "\n" + "15:" + placeNames[14]);
for(int i=0; i<placeNames.length; i++)
{
	System.out.println(placeNames[i]);
}
}
}