package regression;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Functions {

		public static WebDriver driver;
		 
		 public	static HSSFWorkbook workbook;
		 public static HSSFSheet sheet;
		 public static HSSFCell cell;
		
		 public static void launch() throws InterruptedException
		{ 
			System.setProperty("webdriver.chrome.driver", Inputs.chrpath);
			driver=new ChromeDriver();
			driver.get(Inputs.URL);	
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
	public static void Signupform(int sheetno) throws IOException, InterruptedException
	{
	     // Import excel sheet.
	     File src=new File("D:\\test\\testdata.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load the workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(sheetno);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for First name.
	      	 driver.navigate().refresh();
	      	 Thread.sleep(3000);
	         cell = sheet.getRow(i).getCell(1);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Fname).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	          
	         // Import data for Lastname.
	         cell = sheet.getRow(i).getCell(2);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.Lname).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for Email id.
	         cell = sheet.getRow(i).getCell(3);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.email).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	         
	         // Import data for Password
	         cell = sheet.getRow(i).getCell(4);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.password).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
		
	         // Import data for confirmpassword 
	         cell = sheet.getRow(i).getCell(5);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.confmpass).sendKeys(cell.getStringCellValue());
	         Thread.sleep(3000);
		
	         driver.findElement(Locators.terms).click();

	         Actions act = new Actions(driver);
	         WebElement btnElement = driver.findElement(Locators.signupbtn);
	         act.doubleClick(btnElement).perform();
	         Thread.sleep(3000);
	     }

	}

	public static void Loginform(int b) throws IOException, InterruptedException
	{
	     // Import excel sheet.
	     File src=new File("D:\\test\\testdata.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(b);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Email id.
	      	 driver.navigate().refresh();
	      	 Thread.sleep(3000);
	         cell = sheet.getRow(i).getCell(1);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.loginemail).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);
	          
	         // Import data for password.
	         cell = sheet.getRow(i).getCell(2);
	         cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(Locators.loginpass).sendKeys(cell.getStringCellValue());
	         Thread.sleep(2000);

	       
	         Actions act = new Actions(driver);
	         WebElement btnElement = driver.findElement(Locators.loginbtn);
	         act.doubleClick(btnElement).perform();
	       //  driver.findElement(Locators.loginbtn).click();
	         Thread.sleep(2000);
	}
	}

	public static void forgotpassword(int sheetno) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		driver.findElement(Locators.forgotpass).click();
	    // Import excel sheet.
	    File src=new File("D:\\test\\testdata.xls");
	     
	    // Load the file.
	    FileInputStream finput = new FileInputStream(src);
	     
	    // Load the workbook.
	   workbook = new HSSFWorkbook(finput);
	     
	    // Load the sheet in which data is stored.
	    sheet= workbook.getSheetAt(sheetno);
	     
	    for(int i=1; i<=sheet.getLastRowNum(); i++)
	    {
	        // Import data for email id 
	     	 driver.navigate().refresh();
	     	 Thread.sleep(3000);
	        cell = sheet.getRow(i).getCell(1);
	        cell.setCellType(Cell.CELL_TYPE_STRING);
	        driver.findElement(Locators.emailforgot).sendKeys(cell.getStringCellValue());
	        Thread.sleep(2000);
	        
	        Actions act = new Actions(driver);
	        WebElement btnElement = driver.findElement(Locators.forgotbtn);
	        act.doubleClick(btnElement).perform();
	        Thread.sleep(2000);
	    
	    }
		
		
	}


	public static void resetpassordgmail() throws InterruptedException

	{ 
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.open()");
	 	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	 	 driver.switchTo().window(tabs.get(1));

	Thread.sleep(10000);
		   driver.get("https://mail.google.com/");                                                                                                                        

		   WebElement userElement =driver.findElement(By.id("identifierId"));                                                           
		   userElement.click();                                                                                                                                           
		   userElement.sendKeys("vijayashanthi@kochatechnologies.com");                                                                                                      

		   WebElement identifierNext = driver.findElement(By.id("identifierNext"));                                                      
		   identifierNext.click();                                                                                                                                        
	Thread.sleep(2000);
		   WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));                                                        
		   passwordElement.click();                                                                                                                                       
		   Thread.sleep(2000);
		   passwordElement.sendKeys("vijipoonkodi");                                                                                                  

		   WebElement passwordNext = driver.findElement(By.id("passwordNext"));                                                          
		   passwordNext.click();    
		   Thread.sleep(10000);
		   
		   List<WebElement> a = driver.findElements(By.className("yW"));
		   System.out.println(a.size());
		               for(int i=0;i<1;i++){
		                   System.out.println(a.get(i).getText());
		                   if(a.get(i).getText().equals("noreply")){  // if u want to click on the specific mail then here u can pass it
		                	   a.get(i).click();                
		                   }
		               }
		   
		        Thread.sleep(20000);
	            List<WebElement> links= driver.findElements(By.tagName("a"));
	            
	            //storing the size of the links
	            int i= links.size();
	            
	            //Printing the size of the string
	            System.out.println(i);
	            
	            for(int j=0; j<i; j++)
	            {
	                //Printing the links
	                System.out.println(links.get(j).getText());
	            }
		        Thread.sleep(8000);
	            links.get(18).click();
		        Thread.sleep(8000);
		    	 driver.switchTo().window(tabs.get(2));
		    	 
		    	 Thread.sleep(5000);

	 	 
	 	 
	 	 
	}



	public static void Resetpassword(int sheetno) throws InterruptedException, IOException
	{
		Thread.sleep(4000);
	    // Import excel sheet.
	    File src=new File("D:\\test\\testdata.xls");
	     
	    // Load the file.
	    FileInputStream finput = new FileInputStream(src);
	     
	    // Load the workbook.
	   workbook = new HSSFWorkbook(finput);
	     
	    // Load the sheet in which data is stored.
	    sheet= workbook.getSheetAt(sheetno);
	     
	    for(int i=1; i<=sheet.getLastRowNum(); i++)
	    {
	        // Import data for new password 
	     	 driver.navigate().refresh();
	     	 Thread.sleep(3000);
	        cell = sheet.getRow(i).getCell(1);
	        cell.setCellType(Cell.CELL_TYPE_STRING);
	        driver.findElement(Locators.newpass).sendKeys(cell.getStringCellValue());
	        Thread.sleep(2000);
	        
	        cell = sheet.getRow(i).getCell(2);
	        cell.setCellType(Cell.CELL_TYPE_STRING);
	        driver.findElement(Locators.confirmnew).sendKeys(cell.getStringCellValue());
	        Thread.sleep(2000);
	        
	        Actions act = new Actions(driver);
	        WebElement btnElement = driver.findElement(Locators.submitpass);
	        act.doubleClick(btnElement).perform();
	        Thread.sleep(2000);
	    
	    }
		
		
	}


	public static void profile_update(int sheetno) throws InterruptedException, IOException
	{
		
		Thread.sleep(10000);
		driver.findElement(Locators.menu_button).click();
		Thread.sleep(2000);
		driver.findElement(Locators.acc_menu).click();
		Thread.sleep(3000);
		
	     File src=new File("D:\\test\\testdata.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load the workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(sheetno);
	     
	    for(int i=1;i<=sheet.getLastRowNum();i++)
	    {
	      //Thread.sleep(10000);
		  driver.findElement(Locators.edit_button).click();
		  driver.findElement(Locators.uname).clear();
		  driver.findElement(Locators.fname).clear();
		  driver.findElement(Locators.lname).clear();
		  driver.findElement(Locators.acc_email).clear();		  
		  driver.findElement(Locators.bio).clear();
		  driver.findElement(Locators.twitter).clear();
		  driver.findElement(Locators.instagram).clear();
		  driver.findElement(Locators.linkedin).clear();
		  Thread.sleep(3000);
		  //username
		  //Cell cell=sheet.getRow(i).getCell(1);
		  //cell.setCellType(CellType.STRING);
		  //driver.findElement(Locators.uname).sendKeys(cell.getStringCellValue());
		  driver.findElement(Locators.gen_button).click();
		  Thread.sleep(2000);
		  
		  //firstname
		  Cell cell1=sheet.getRow(i).getCell(1);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.fname).sendKeys(cell1.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //lastname
		  Cell cell2=sheet.getRow(i).getCell(2);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.lname).sendKeys(cell2.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Email
		  Cell cell3=sheet.getRow(i).getCell(3);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.acc_email).sendKeys(cell3.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //About
		  Cell cell4=sheet.getRow(i).getCell(4);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.bio).sendKeys(cell4.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Twitter
		  Cell cell5=sheet.getRow(i).getCell(5);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.twitter).sendKeys(cell5.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //Instagram
		  Cell cell6=sheet.getRow(i).getCell(6);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.instagram).sendKeys(cell6.getStringCellValue());
		  Thread.sleep(2000);
		  
		  //LinkedIn
		  Cell cell7=sheet.getRow(i).getCell(7);
		  cell.setCellType(Cell.CELL_TYPE_STRING);
		  driver.findElement(Locators.linkedin).sendKeys(cell7.getStringCellValue());
		  Thread.sleep(2000);
		  
		  driver.findElement(Locators.acc_save).click();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  Thread.sleep(10000);
		
	    }
	    System.out.println("User Details Updated Successfully ");
	}
	
	public static void profile_image() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(Locators.choose_button).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(Locators.acc_upload);
		element.click();
		Thread.sleep(10000);
		uploadFile("E:\\Kocha SS\\photo.png");
		Thread.sleep(10000);
		driver.findElement(Locators.pro_save).click();
		Thread.sleep(10000);
		System.out.println("Profile update completed successfully");
		
	}
	public static void remove_profile() throws InterruptedException
	{
		driver.findElement(Locators.choose_button).click();
		Thread.sleep(1000);
		driver.findElement(Locators.remove_photo).click();
		Thread.sleep(2000);
		System.out.println("Profile picture Removed successfully");
		Thread.sleep(2000);
		driver.findElement(Locators.menu_dashboard).click();
	}

	public static void uploadFile(String fileLocation) throws AWTException 
	{
            setClipboard(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public static void setClipboard(String file) 
	{
		
		   StringSelection stringSelection = new StringSelection(file);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	public static void connectwallet() throws InterruptedException	
	{
		Thread.sleep(3000);
		driver.findElement(Locators.c_wallet).click();
		Thread.sleep(20000);
		driver.switchTo().frame(driver.findElement(Locators.wallet_frame));
		Thread.sleep(3000);
		System.out.println("Inside Blockto Window");
		driver.findElement(Locators.blocto_email).sendKeys(Inputs.wallet_email);
		Thread.sleep(3000);
		String blocto_button_text=driver.findElement(Locators.blocto_button_text).getText();
		System.out.println(blocto_button_text);
		if(blocto_button_text.equals("SIGN IN"))
		{
			Thread.sleep(5000);
			driver.findElement(Locators.blocto_signin_button).click();
			Thread.sleep(30000);
			driver.findElement(Locators.confirm_wallet_button).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			System.out.println("Wallet connected Successfully");
			Thread.sleep(1000);
			driver.findElement(Locators.wallet_address).isDisplayed();
			String walletaddress=driver.findElement(Locators.wallet_address).getText();
			driver.findElement(Locators.wallet_balance).isDisplayed();
			String walletbalance=driver.findElement(Locators.wallet_balance).getText();
			System.out.println("Connected Wallet Address:" + walletaddress);
			System.out.println("Connected Wallet Balance:" + walletbalance);
		}
		else if(blocto_button_text.equals("REGISTER"))
		{
			Thread.sleep(3000);
			driver.findElement(Locators.blocto_signin_button).click();
			Thread.sleep(20000);
			driver.findElement(Locators.confirm_wallet_button).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.findElement(Locators.initialize_wallet_button).click();
			Thread.sleep(60000);
			driver.switchTo().frame(driver.findElement(Locators.wallet_frame));
			Thread.sleep(10000);
			driver.findElement(Locators.initialize_approve_button).click();
			Thread.sleep(60000);
			System.out.println("Wallet connected Successfully");
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(Locators.wallet_address).isDisplayed();
			String walletaddress=driver.findElement(Locators.wallet_address).getText();
			driver.findElement(Locators.wallet_balance).isDisplayed();
			String walletbalance=driver.findElement(Locators.wallet_balance).getText();
			System.out.println("Connected Wallet Address:" + walletaddress);
			System.out.println("Connected Wallet Balance:" + walletbalance);
			
		}
		
	}
	
	public static void copywallet() throws InterruptedException
	{
       Thread.sleep(3000);
       driver.findElement(Locators.copy_address).click();
       System.out.println("Wallet Address Copied Successfully");
	}
	
	public static void disconnectwallet() throws InterruptedException
	{
       Thread.sleep(3000);
       driver.findElement(Locators.disconnect_wallet).click();
       System.out.println("Wallet Disconnected Successfully");
	}
	
	public static void collectedtab() throws InterruptedException
	{
		Thread.sleep(10000);
		
		
		WebElement count=driver.findElement(Locators.collectedtab);
		//System.out.println(count.getText());
		Thread.sleep(2000);
		String countmoment = count.getText();
		Thread.sleep(2000);
		String momentcount=countmoment.substring( 11, countmoment.length() - 1 );
		//System.out.println(momentcount);
		
	    int i = Integer.parseInt(momentcount.trim());
	    
	    System.out.println(i);

	    if(i==0)
	    {
	    	WebElement content=driver.findElement(Locators.nomoment);
	    	System.out.println(content.getText());

	    	content.isDisplayed();
	    }
	    else {
	    	Thread.sleep(2000);
	        List<WebElement> products = driver.findElements(Locators.grid);
	    	System.out.println(products.size());
	    	//how many momentables available	
	    }
	    }
	    
	public static void startsale() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(Locators.grid).click();
		
		Thread.sleep(10000);
		driver.findElement(Locators.startsalebtn).click();
		
		Thread.sleep(5000);
		driver.findElement(Locators.setprice).sendKeys("125");
		
		Thread.sleep(2000);
		WebElement count=driver.findElement(Locators.summaryprice);
		
		String countsummary = count.getText();
		String summarycount=countsummary.substring(0,countsummary.length()-5 );	
		System.out.println(summarycount);
	    int summaryprice = Integer.parseInt(summarycount.trim());
	    System.out.println("Summary price is " +summaryprice);
	    
		Thread.sleep(2000);
		WebElement total=driver.findElement(Locators.totalprice);
		
		String totalprice = total.getText();
		//String totalno=totalprice.substring(totalprice.length() - 5 );	
	    int Total_price = Integer.parseInt(totalprice.trim());
	    System.out.println("Total price is " +Total_price);

		Thread.sleep(2000);
		WebElement onsale=driver.findElement(Locators.Onsaleprice);
		
		String onsaleprice = onsale.getText();
		String priceonsale=onsaleprice.substring(0,onsaleprice.length() - 5 );	
	    int ONsaleprice = Integer.parseInt(priceonsale.trim());
	    System.out.println("On sale price is " +ONsaleprice);
		
		Thread.sleep(2000);
		WebElement Minpro=driver.findElement(Locators.minproprice);
		
		String minproprice = Minpro.getText();
		String priceminpro=minproprice.substring(0,minproprice.length() - 8 );	
	    int Minprofitprice= Integer.parseInt(priceminpro.trim());
	    System.out.println("Min Profit price is " +Minprofitprice);
		
		if(summaryprice == 125 && Total_price ==125 &&  ONsaleprice==125 &&  Minprofitprice==125)
		
		{
			System.out.println("Case passed = system displays same price in all 4 sections ");
		}
		else 
		{
			System.out.println("Case Failed - IN all 4sections indifferent price value displayed");
		}
		
		
		Thread.sleep(8000);
		driver.findElement(Locators.publislist).click();
		Thread.sleep(10000);
		
		
		driver.findElement(Locators.yeslist).click();
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(Locators.wallet_frame));
		Thread.sleep(10000);
		driver.findElement(Locators.testnetapprove).click();
		Thread.sleep(25000);
		driver.findElement(Locators.ok).click();
		Thread.sleep(20000);
		
		WebElement button = driver.findElement(Locators.stopselling); 	
		if(button.isDisplayed())
		{ 		System.out.println("Momentable listed  and Stop sale button displayed");

		}
		else {System.out.println("Case failed - Stop sale button not displayed after successfulllisting");
		}


	}
	public static void stopsale() throws InterruptedException  //After successfull delist , Start sale button displayed or not
	{
		Thread.sleep(2000);
		driver.findElement(Locators.forsaletab).click();
		
		Thread.sleep(2000);
		driver.findElement(Locators.grid).click();
		
		Thread.sleep(10000);
		driver.findElement(Locators.stopsale).click();
		
		Thread.sleep(8000);
		driver.findElement(Locators.yeslist).click();
		Thread.sleep(10000);
		
		driver.switchTo().frame(driver.findElement(Locators.wallet_frame));
		Thread.sleep(10000);
		driver.findElement(Locators.testnetapprove).click();
		Thread.sleep(10000);
		
		WebElement button = driver.findElement(By.linkText("Start Sale")); 	
		if(button.isDisplayed())
		{ 		System.out.println("Momentable delisted and Start sale button displayed");

		}
		else {System.out.println("Case failed - Start sale button not displayed after successfull delisting");
		}
		}


	
	
}
