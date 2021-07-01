package Core_classes;

public class Employee {
	private String name;
	private int age;
	private String position;
	private String address;
	private int customerLike;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + customerDisLike;
		result = prime * result + customerLike;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
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
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (customerDisLike != other.customerDisLike)
			return false;
		if (customerLike != other.customerLike)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
	public Employee(String name, int age, String position, String address, int customerLike, int customerDisLike) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.address = address;
		this.customerLike = customerLike;
		this.customerDisLike = customerDisLike;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", address=" + address
				+ ", customerLike=" + customerLike + ", customerDisLike=" + customerDisLike + "]";
	}
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