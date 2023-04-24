class Fan
{
static boolean isConnected;
static String name="Crompton";
static int price=2000;
static int minSpeed;
static int maxSpeed=4;
static int currentSpeed;
public static void main(String Fan[])
{
System.out.println("Main Stared");
onOrOff();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
onOrOff();
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
	System.out.println(" Fan is turned onn...");
	}
	else if(isConnected == true)
	{
	isConnected = false;
	System.out.println("Fan is turmed off...");
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
		System.out.println("  the currentSpeed is " + currentSpeed);
	}
else{
	System.out.println("current Speed reached...");
}
	}
else
{
	System.out.println(" Fan turn on maduu");
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
		System.out.println(" user turn on the Fan");
	}
	System.out.println("decreaseSpeed method eneded");
	return currentSpeed;
}
}