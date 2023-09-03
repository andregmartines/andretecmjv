package elementos;

import org.openqa.selenium.By;

public class Elementos {
	public By firstName = By.xpath("//*[@id=\"AccountFrm_firstname\"]");
	public By lastName = By.xpath("//*[@id=\"AccountFrm_lastname\"]");
	public By email = By.xpath("//*[@id=\"AccountFrm_email\"]");
	public By adress1 = By.xpath("//*[@id=\"AccountFrm_address_1\"]");
	public By city = By.xpath("//*[@id=\"AccountFrm_city\"]");
	public By regionState = By.xpath("//*[@id=\"AccountFrm_zone_id\"]");
	public By zipcode = By.xpath("//*[@id=\"AccountFrm_postcode\"]");
	public By country = By.xpath("//*[@id=\"AccountFrm_country_id\"]");
	public By loginName = By.xpath("//*[@id=\"AccountFrm_loginname\"]");
	public By password = By.xpath("//*[@id=\"AccountFrm_password\"]");
	public By confirmPassword = By.xpath("//*[@id=\"AccountFrm_confirm\"]");
	public By privacyPolicy = By.xpath("//*[@id=\"AccountFrm_agree\"]");
	public By continuee = By.xpath("//*[@id=\"AccountFrm\"]/div[5]/div/div/button");
	public By msgCreate = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]");
	public By btnContinue = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/div/section/a");
	public By loginCabecalho = By.xpath("//*[@id=\"customer_menu_top\"]/li/a/div");
	public By loginMyaccount = By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[2]");

}
