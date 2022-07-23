package Booking.Paginas;

import org.openqa.selenium.WebDriver;

import Booking.Steps.ButtonPages;

public class LeavePage {
	
	private ButtonPages buttonPages; 
	
	public LeavePage(WebDriver driver) {
	 this.buttonPages =new ButtonPages(driver);	
	}
	
	public void buscarEmpleadoActions() {
	this.buttonPages.btnLeave();
	}
}
