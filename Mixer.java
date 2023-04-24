class Mixer
{
static boolean isConnected;
static String name="Presitge";
static int price=5000;
static int minSpeed;
static int maxSpeed=4;
static int currentSpeed;
public static void main(String mixer[])
{
System.out.println("Main Stared");
onOrOff();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
onOrOff();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
onOrOff();
System.out.println("main ended");
}
public static boolean onOrOff()
{
System.out.println("onOrOff method Starded");
if(isConnected == false)
	{
	isConnected = true;
	System.out.println(" Mixer is turned onn...");
	}
	else if(isConnected == true)
	{
	isConnected = false;
	System.out.println(" Mixer is turmed off...");
	}
	System.out.println("onOrOff method ended");
	return isConnected;
	
}
public static int increaseSpeed()
{
	System.out.println("increaseSpeed method started");
	if(isConnected==true){
		
	if(currentSpeed < maxSpeed)
	{ 
		System.out.println("currentSpeed is less than max... proceed");
		currentSpeed = currentSpeed + 1 ;
		System.out.println("  the currentSpeeed is " + currentSpeed);
	}
else{
	System.out.println("current Speed reached...");
}
	}
else
{
	System.out.println(" Mixer turn on maduu");
}
	System.out.println("increaseSpeed method ended");
	return currentSpeed;
}
	
public static int decreaseSpeed()
{
	System.out.println("decreaseSpeed method started");
	if(isConnected==true)
	{
	if(currentSpeed > minSpeed)
	{
		System.out.println("currentSpeed is less than min...proceed");
		currentSpeed = currentSpeed - 1;
		System.out.println(" the currentSpeed is" + currentSpeed);
	}
	else
	{
		System.out.println(  " minSpeed reached..");
	}
	}
	
	else
	{
		System.out.println(" user turn on the Mixer");
	}
	System.out.println("decreaseSpeed method eneded");
	return currentSpeed;
}
}