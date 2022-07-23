package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.ButtonPages;

public class PimPage {
	
	private ButtonPages buttonPages;
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement inputFirstName; 
	
	@FindBy(how = How.XPATH, using = "//input[@name='LastName']")
	private WebElement inputLastname; 
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver); 
	}
	
	public void llegaAddEmployee() {
		buttonPages.btnPim(); 
		buttonPages.btnAdd();
	}
	public void diligenciaEmpleado(String firstName, String LastName) {
		inputFirstName.sendKeys(firstName);
		inputFirstName.sendKeys(LastName);
		buttonPages.btnSave(); 
	}
}   
