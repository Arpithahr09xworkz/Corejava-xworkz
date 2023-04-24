class Prime
{
static String kannadaMovies[]={"Kabzaa","Hondisi Bareyiri","Mr.Bachelor","Hushar","Daari Yavudayya Vaikuntake","Gandhadagudi","Once Upon a Time in Jamaligudda","Love Brids","Raymo","Pampa","Padavi Poorva","Made in Begaluru","Abbara","Mute","Raana"};
static String telaguMovies[]={"Waltair Veerayya","Vaathi","RRR","Dhamaka","Rangasthalam","Hit","18 Pages","Hunt","Butta Bomma","Arya","Jersey","Pokiri","Sita Ramam","Bommarillu","Maharsi"};
static String hindiMovies[]={"Faraaz","United","Gaslight","Almost Pyaar","Dj Mohabbat","Kanjoos Makhichoos","Chor Nikal Ke Bhaga","Kuttey","Lost","Circus","Salaam Venky","Vadh","An Action Hero","Chhatriwali","Drishyam 2"};
public static void main(String Prime[])
{
System.out.println("Main Started");
	getKannadaMovies();
	getTelaguMovies();
	getHindiMovies();
System.out.println("Main Ended");
}
public static void getKannadaMovies()
{
System.out.println("Calling getKannadaMovies Method:");
for(int i=0; i<kannadaMovies.length; i++)
{
System.out.println(kannadaMovies[i]);
}
System.out.println("Ended the getKannadaMovies Method");
return;
}
public static void getTelaguMovies()
{
System.out.println("Calling getTelaguMovies Methood:");
for(int i=0; i<telaguMovies.length; i++)
{
System.out.println(telaguMovies[i]);
}
System.out.println("Ended the getTelaguMovies Method:");
return;
}
public static void getHindiMovies()
{
System.out.println("Calling the getHindiMovies Method:");
for(int i=0; i<hindiMovies.length; i++)
{
System.out.println(hindiMovies[i]);
}
System.out.println("Ended the getHindiMovies Method:");
return;
}
}