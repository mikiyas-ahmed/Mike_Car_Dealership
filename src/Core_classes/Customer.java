package Core_classes;

import java.util.Date;

public class Customer {
	private String customerFirstName;
	private String customerLasttName;
	private String customerAddress;
	private String customerCity;
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLasttName() {
		return customerLasttName;
	}
	public void setCustomerLasttName(String customerLasttName) {
		this.customerLasttName = customerLasttName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}
	public int getCustomerBudget() {
		return customerBudget;
	}
	public void setCustomerBudget(int customerBudget) {
		this.customerBudget = customerBudget;
	}
	public boolean isFinance() {
		return finance;
	}
	public void setFinance(boolean finance) {
		this.finance = finance;
	}
	private String customerEmail;
	private String customerPhoneNumber;
	private Date birthDate;
	private String PESEL;
	private int customerBudget;
	private boolean finance;
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		
	}
	
}
