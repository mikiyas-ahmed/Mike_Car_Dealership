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
	public Customer(String customerFirstName, String customerLasttName, String customerAddress, String customerCity,
			String customerEmail, String customerPhoneNumber, Date birthDate, String pESEL, int customerBudget,
			boolean finance) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLasttName = customerLasttName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.birthDate = birthDate;
		PESEL = pESEL;
		this.customerBudget = customerBudget;
		this.finance = finance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PESEL == null) ? 0 : PESEL.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerBudget;
		result = prime * result + ((customerCity == null) ? 0 : customerCity.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerFirstName == null) ? 0 : customerFirstName.hashCode());
		result = prime * result + ((customerLasttName == null) ? 0 : customerLasttName.hashCode());
		result = prime * result + ((customerPhoneNumber == null) ? 0 : customerPhoneNumber.hashCode());
		result = prime * result + (finance ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (PESEL == null) {
			if (other.PESEL != null)
				return false;
		} else if (!PESEL.equals(other.PESEL))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerBudget != other.customerBudget)
			return false;
		if (customerCity == null) {
			if (other.customerCity != null)
				return false;
		} else if (!customerCity.equals(other.customerCity))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerFirstName == null) {
			if (other.customerFirstName != null)
				return false;
		} else if (!customerFirstName.equals(other.customerFirstName))
			return false;
		if (customerLasttName == null) {
			if (other.customerLasttName != null)
				return false;
		} else if (!customerLasttName.equals(other.customerLasttName))
			return false;
		if (customerPhoneNumber == null) {
			if (other.customerPhoneNumber != null)
				return false;
		} else if (!customerPhoneNumber.equals(other.customerPhoneNumber))
			return false;
		if (finance != other.finance)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerFirstName=" + customerFirstName + ", customerLasttName=" + customerLasttName
				+ ", customerAddress=" + customerAddress + ", customerCity=" + customerCity + ", customerEmail="
				+ customerEmail + ", customerPhoneNumber=" + customerPhoneNumber + ", birthDate=" + birthDate
				+ ", PESEL=" + PESEL + ", customerBudget=" + customerBudget + ", finance=" + finance + "]";
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
