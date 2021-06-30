package Core_classes;

public class Employee {
	private String name;
	private int age;
	private String position;
	private String address;
	private int customerLike;
	private int customerDisLike;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustomerLike() {
		return customerLike;
	}
	public void setCustomerLike(int customerLike) {
		this.customerLike = customerLike;
	}
	public int getCustomerDisLike() {
		return customerDisLike;
	}
	public void setCustomerDisLike(int customerDisLike) {
		this.customerDisLike = customerDisLike;
	}
	public void customerHandle(Vehicle vehicle , Customer customer, boolean finance) {
		if(vehicle.getPrice()<=customer.getCustomerBudget()) {
			processTransaction(vehicle,customer);
		}
		else if(finance ) {
			runCreditHistory(customer, vehicle.getPrice()-customer.getCustomerBudget());
		}
		else
			System.out.println("you need more money to purchase this car");
	}
	public void runCreditHistory(Customer customer, double doubleAmount) {
		
	}
	public void processTransaction(Vehicle vehicle,Customer customer) {
		
	}
}