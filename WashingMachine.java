class WashingMachine
{
static boolean isConnected;
static String name="LG";
static double price=88.990;
static int minTime;
static int maxTime=3;
static int currentTime;
public static void main(String WashingMachine[])
{
System.out.println("Main Stared");
onOrOff();
increaseTime();
increaseTime();
increaseTime();
increaseTime();
onOrOff();
decreaseTime();
decreaseTime();
decreaseTime();
decreaseTime();
onOrOff();
System.out.println("main ended");
}
public static boolean onOrOff()
{
System.out.println("onOrOff method Starded");
if(isConnected == false)
	{
	isConnected = true;
	System.out.println(" WashingMachine is turned onn...");
	}
	else if(isConnected == true)
	{
	isConnected = false;
	System.out.println(" WashingMachine is turmed off...");
	}
	System.out.println("onOrOff method ended");
	return isConnected;
	
}
public static int increaseTime()
{
	System.out.println("increaseTime method started");
	if(isConnected==true){
		
	if(currentTime < maxTime)
	{ 
		System.out.println("currentTime is less than max... proceed");
		currentTime = currentTime + 1 ;
		System.out.println("  the currentTime is " + currentTime);
	}
else{
	System.out.println("current Time reached...");
}
	}
else
{
	System.out.println(" WashingMachine turn on maduu");
}
	System.out.println("increaseTime method ended");
	return currentTime;
}
	
public static int decreaseTime()
{
	System.out.println("decreaseTime method started");
	if(isConnected==true)
	{
	if(currentTime > minTime)
	{
		System.out.println("currentTime is less than min...proceed");
		currentTime = currentTime - 1;
		System.out.println(" the currentTime is" + currentTime);
	}
	else
	{
		System.out.println(  " minTime reached..");
	}
	}
	
	else
	{
		System.out.println(" user turn on the WashingMachine");
	}
	System.out.println("decreaseTime method eneded");
	return currentTime;
}
}