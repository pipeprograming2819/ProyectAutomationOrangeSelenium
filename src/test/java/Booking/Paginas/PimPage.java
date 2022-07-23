package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.ButtonPages;

public class PimPage {
	
	private ButtonPages buttonPages;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver); 
	}
	
	public void llegaAddEmployee() {
		buttonPages.btnPim(); 
		buttonPages.btnAdd();
	}

}   
