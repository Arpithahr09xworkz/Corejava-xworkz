class SuperMarket1
{
static String[] groceries={"Rice","Oils","Sauces","Salad","Cereals","Soups","Frozen Foods","Dairy","Cheese","Eggs","Snacks","Crackers","Driks","Fruits","Vegetables"};
static String[] chocolates={"Diary Milk","Kit Kat","Snickers","Milkybar","Lindt","Perk","Fuse","5 Star","Amul","Parel","Hide & Seek","Eclaris","Melody","Kismi","Mars Bar"};
static String[] shampoos={"Dove","Keratin","Tresemme","Biotique","Elvive","EverPure","Matrix","OGX","Pantene","Selsum","Strength Cure","Detox","Garnier","Herbal","Monday Haircare"};
static String[] perfumes={"Skinn by Titan","Guess","United Colors","Versace","Gucci","Fogg","Bella Vita","Tommy","Victoria's","Dior Miss Dior","Ajmal","Armani","Yues Saint","Davidoff","Carlton London"};
static String[] soaps={"Dettol","Chandrika","Cinthol","Dove","Hamam","Himalaya","Lifeboy","Santoor","Medimix","Pears","Mysore Sandal","Shashi","Surfexcel","Wheel","Arial"};
static String[] tshirtBrands={"Uniqlo","Hanes","HM","Puma","Nike","Levis","Bonobos","Everlane","Busk Manson","Banana Republic","J.Crew","Calvin","ATM","Tom Ford","Handverk"};
public static void main(String supermarket1[])
{
System.out.println("Main Started");
	getGroceries();
	getChocolates();
	getShampoos();
	getPerfumes();
	getSoaps();
	getTshirtBrands();
System.out.println("Main Ended");
}
public static void getGroceries()
{
System.out.println("Calling getgroceries Method");
for(int i=0; i<groceries.length; i++)
{
System.out.println(groceries[i]);
}
System.out.println("Ended of getgroceries Method");
return;
}
public static void getChocolates()
{
System.out. println("Calling getChocolates Method");
for(int i=0; i<chocolates.length; i++)
{
System.out.println(chocolates[i]);
}
System.out.println("Ended of getChocolates Method");
return;
}
public static void getShampoos()
{
System.out.println("Calling getShampoos Method");
for(int i=0; i<shampoos.length; i++)
{
System.out.println(shampoos[i]);
}
System.out.println("Ended of getShampoos Method");
return;
}
public static void getPerfumes()
{
System.out.println("Calling the getPerfumes Method");
for(int i=0; i<perfumes.length; i++)
{
System.out.println(perfumes[i]);
}
System.out.println("Ended of getPerfumes Method");
return;
}
public static void getSoaps()
{
System.out.println("Calling the  getSoaps Method");
for(int i=0; i<soaps.length; i++)
{
System.out.println(soaps[i]);
}
System.out.println("Ended of getSoaps Method");
return;
}
public static void getTshirtBrands()
{
System.out.println("Calling getTshirtBrands Method");
for(int i=0; i<tshirtBrands.length; i++)
{
System.out.println(tshirtBrands[i]);
}
System.out.println("Ended the getTshirtBrands Methods");
return;
}
} 