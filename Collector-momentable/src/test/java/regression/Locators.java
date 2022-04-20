package regression;

import org.openqa.selenium.By;

public class Locators {
	//Signup locators
		public static By Fname=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[1]/input");
		public static By Lname=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[2]/input");
		public static By email=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[3]/input");
		public static By password=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[4]/input");
		public static By confmpass=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[5]/input");
		public static By terms=By.id("terms");
		public static By signupbtn=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[7]");
	//Login page locators	
		public static By loginemail=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[1]/input");
		public static By loginpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[2]/div/input");
		public static By loginbtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[4]/button");
		public static By fogotpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[3]/a");
		public static By signup=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[4]/div/div/a");
		public static By signin=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[8]/span[2]");
		public static By confmsignin=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/div/span[2]");
		public static By momentables=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div[2]/nav/a[2]/span");
	
		//profile page
		public static By menu_button=By.xpath("/html/body/div/div/div/div/div[1]/div[2]/nav/div/a/div/div/button");
	    public static By acc_menu=By.xpath("/html/body/div/div/div/div/div[1]/div[2]/nav/div/a/div/div[2]/div/a[1]");
	    public static By edit_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div/div/button");
	    public static By uname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[1]/div/input");
	    public static By gen_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[1]/div/button");
	    public static By fname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[2]/input");
	    public static By lname=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[3]/input");
	    public static By acc_email=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[4]/input");
	    public static By bio=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[6]/textarea");
	    public static By twitter=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[7]/input");
	    public static By instagram=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[8]/input");
	    public static By linkedin=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[2]/div[9]/input");
	    public static By acc_save=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div[2]/div[1]/div[3]/button[2]");
	    public static By choose_button=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div/a");
	    public static By acc_upload=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/a[1]");
	    public static By remove_photo=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/a[2]");
	    public static By pro_save=By.xpath("//*[@id=\"banner\"]/div/div[1]/div[1]/div[2]/div/div[3]/button[1]");
	    public static By pro_complete=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div[3]/h1/span[2]");
	    public static By menu_dashboard=By.xpath("/html/body/div/div/div/div/div[1]/div[2]/nav/a[1]");

	    //Connect Wallet
	    
	    public static By c_wallet=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div/button");
	  //  public static By wallet_frame=By.xpath("//*[@id=\"FCL_IFRAME\"]");
	    public static By blocto_email=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
	    public static By blocto_button_text=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[1]/span");
	    public static By blocto_signin_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button");
	    public static By confirm_wallet_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[1]");
	    public static By disconnect_wallet=By.xpath("//*[@id=\"__next\"]/div/div/div/div/main/div/div/div/div[1]/div[2]/div/div[1]/div[2]/button");
	    public static By initialize_wallet_button=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/button");
	    public static By initialize_approve_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
	    public static By wallet_address=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/span");
	    public static By wallet_balance=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/span");
	    public static By copy_address=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/img");

		//momentable screen locators
		public static By walletmom=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/button");
		
		public static By walletemail=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
		                                      
		public static By walletsignimn=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[2]");
		
		public static By wallet_frame=By.xpath("//*[@id=\"FCL_IFRAME\"]");
		public static By bloctosignin=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[2]");
		public static By bloctoconfm=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[1]/div[2]");
		
		public static By collectedtab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[1]");
		public static By nomoment=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/h1");
		
		public static By forsaletab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[2]");
		
		public static By grid=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div/div");
		public static By startsalebtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/button");
		public static By setprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div/input");
		public static By publislist=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/button");
		public static By yeslist=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
		public static By cancellist=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
		
		public static By testnetapprove=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button/div[2]");
		public static By ok=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
		public static By stopselling=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[3]/div[2]/div[1]/button");
		public static By closetestnet=By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/span/svg");
		public static By transcancel=By.xpath("//*[@id=\"swal2-title\"]");
		
		public static By successok=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
		public static By stopsale=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/button");
		public static By yesstop=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
		public static By cancelstop=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
		public static By threedot=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/span/svg/path[2]");
		public static By copylink =By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/div/ul/li[3]");

		
		public static By path= By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[1]/span[1]");
		
		public static By forgotpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[3]/a");
		public static By emailforgot=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/input");
		public static By forgotbtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/button");
		
		public static By summaryprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[2]/div");
		public static By totalprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[3]/table/tbody/tr[2]/td[2]");
		public static By Onsaleprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[4]/table/tbody/tr[3]/td[2]");
		public static By minproprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[4]/table/tbody/tr[4]/td[2]");
		public static By walleticon=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/img");
		public static By connnetwalletmsg=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/h1/text()");
		public static By loading=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/p");
		
		public static By emailone=By.xpath("//*[@id=\":67\"]");
		public static By newpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/input");
		public static By confirmnew=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[2]/input");
		public static By submitpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[2]/button");

	    //Transfer Momentables
	    public static By collected_tab_count=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[2]/div[1]");
	    public static By nomomentable=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/h1");
	    public static By grid_dot_icon=By.xpath("/html/body/div/div/div/div[2]/div/main/div/div/div[3]/section/div/div[1]/div/div[1]/span");
	    public static By transfer_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div[1]/div/div[1]/div/ul/li[3]");
	    public static By recepiant_address=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[2]/input");
	    public static By recepiant_email=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[3]/input");
	    public static By transfer_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[3]/div/div[2]/div[5]/button");
	    public static By transfer_approve_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
	    public static By transfer_finish_button=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/div/div[2]/div[3]/button");
	    
	    
	    //For sale Tab Copy Link
	    public static By collected_tab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/main/div/div/div[2]/div[1]");
	    public static By for_sale_tab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[2]");
	    public static By forsale_grid_icon=By.xpath("/html/body/div/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/span");
	    public static By copy_link_menu=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/div/ul/li[3]");
	    
	    //storefront
	    
	    public static By store_login_button=By.xpath("//*[@id=\"__next\"]/main/nav/div/div/ul/li[1]/button");
	    public static By store_email=By.xpath("//*[@id=\"email\"]");
	    public static By store_password=By.xpath("//*[@id=\"password\"]");
	    public static By store_signin_button=By.xpath("//*[@id=\"__next\"]/main/div[1]/div[2]/form/div[3]/button");
	    public static By store_wallet_icon=By.xpath("//*[@id=\"__next\"]/main/nav/div/div/ul/li[1]");
	    public static By store_useanother_account=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[2]");
	    public static By store_wallet_email=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
	    public static By store_wallet_signin_text=By.xpath("//*[@id=\\\"app\\\"]/div/div[2]/div[2]/div/button/div[1]/span");
	    public static By store_wallet_signin_button=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button");
	    public static By store_buy_button=By.xpath("//*[@id=\"stickyContainer\"]/div/div/div[1]/button");
	    public static By NFT_sale_amount=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[1]/table/tbody/tr[3]/td");
	    public static By store_wallet_balance=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td");
	    public static By buy_confirm=By.xpath("//*[@id=\"stickyContainer\"]/div[1]/div[2]/div/div[2]/button");
	    public static By buy_wallet_confirm=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button");
	    public static By Buy_success_cancel_button=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
	    

}
