class ChatsShop1
{
 static String chats[]={"Pani Puri","Masala Puri","Dahi Puri","Bhel Puri","Gobi","Vada Pav","Pav Bhajji","Noodles","Momos","Golgappa","Corn","Rolls","Chiken Puff","Chips"};
 public static void main (String chatsShop1[])
{
System.out.println("Main Stared");
	getchats();
System.out.println("Main Ended");
}
public static void getChats()
{
System.out.println("Calling getchats Method");
for(int i=0; i<chats.length; i++)
{
System.out.println(chats[i]);
}
System.out.println("End of getchats Method");
}
}  