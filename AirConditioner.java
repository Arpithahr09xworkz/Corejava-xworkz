class AirConditioner
{
static boolean isConnected;
static String name="Haier";
static double price=75.990;
static int minTemperture;
static int currentTemperture;
static int maxTemperture=60;
public static void main(String AirConditioner[])
{
System.out.println("Main Stared");
onOrOff();
increaseTemperture();
increaseTemperture();
increaseTemperture();
increaseTemperture();
onOrOff();
decreaseTemperture();
decreaseTemperture();
decreaseTemperture();
decreaseTemperture();
onOrOff();
System.out.println("main ended");
}
public static boolean onOrOff()
{
System.out.println("onOrOff method Starded");
if(isConnected == false)
	{
	isConnected = true;
	System.out.println(" AirConditioner is turned onn...");
	}
	else if(isConnected == true)
	{
	isConnected = false;
	System.out.println(" AirConditioner is turmed off...");
	}
	System.out.println("onOrOff method ended");
	return isConnected;
	
}
public static int increaseTemperture()
{
	System.out.println("increaseTemperture method started");
	if(isConnected==true){
		
	if(currentTemperture < maxTemperture)
	{ 
		System.out.println("currentTemperture is less than max... proceed");
		currentTemperture = currentTemperture + 1 ;
		System.out.println("  the currentTemperture is " + currentTemperture);
	}
else{
	System.out.println("current Temperture reached...");
}
	}
else
{
	System.out.println(" AirConditioner turn on maduu");
}
	System.out.println("increaseTemperture method ended");
	return currentTemperture;
}
	
public static int decreaseTemperture()
{
	System.out.println("decreaseTemperture method started");
	if(isConnected==true)
	{
	if(currentTemperture > minTemperture)
	{
		System.out.println("currentTemperture is less than min...proceed");
		currentTemperture = currentTemperture - 1;
		System.out.println(" the currentTemperture is" + currentTemperture);
	}
	else
	{
		System.out.println(  " minTemperture reached..");
	}
	}
	
	else
	{
		System.out.println("user turn on the AirConditioner");
	}
	System.out.println("decreaseTemperture method eneded");
	return currentTemperture;
}
}