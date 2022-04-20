package regression;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testcases {

	
	
	@BeforeTest
	public static void launchchrome() throws InterruptedException
	{
		Functions.launch();
	}
	@Test(priority=1)
	public static void signup() throws InterruptedException, IOException
	{
		Functions.Signupform(0);//Signup scenarios
		Functions.Signupform(2); //successfull signup

	}
	@Test(priority=2)
	public static void login() throws InterruptedException, IOException
	{
		Functions.Loginform(3);	  //Login scenarios

	}
	@Test(priority=3)
	public static void forgotpass() throws InterruptedException, IOException
	{
	
		Functions.forgotpassword(4);
		Functions.forgotpassword(5);
	}
	@Test(priority=4)
	public static void resetpass() throws InterruptedException, IOException
	{
		Functions.resetpassordgmail();
		Functions.Resetpassword(6);

	}
	
	@Test(priority=5)
	public static void profile() throws InterruptedException, IOException
	{
		//Functions.profile_update(0);
	}
	@Test(priority=3)
	public static void profile_image() throws InterruptedException, AWTException
	{
		//Functions.profile_image();
	}
	@Test(priority=4)
	public static void remove_image() throws InterruptedException
	{
		//Functions.remove_profile();
	}
	@Test(priority=5)
	public static void connect_wallet() throws InterruptedException
	{
		Functions.connectwallet();
		Functions.copywallet();
		//Functions.disconnectwallet();
	}
	
	
	
	
	
}
