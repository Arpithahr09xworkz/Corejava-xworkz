class Netflix
{
static String kannadaMovies[]={"googly","kantara","kranti","kgf","om","A","uppi 2","upendra","Dia"};
static String tamilMovies[]={"ps1","Shivaji","Enemy","Singham","Pasha"};
public static  void main(String netflix[])
{
System.out.println("Main Started");
        getKannadaMovies();
		getTamilMovies();
System.out.println("Main Ended");
}
public static void getKannadaMovies()
{
System.out. println("calling getKannadaMovies method");
System.out.println("list of kannadaMovies:");
for(int i=0; i<kannadaMovies.length; i++)
{
System.out.println(kannadaMovies[i]);
}
System.out.println("end of getKannadaMovies method");
return;
}
public static void getTamilMovies()
{
System.out. println("calling getTamilMovies method");
System.out.println("list of tamilMovies:");
for(int i =0; i<tamilMovies.length; i++)
{
System.out.println(tamilMovies[i]);
}
System.out.println("end of getTamilMovies method");
return;
}
}