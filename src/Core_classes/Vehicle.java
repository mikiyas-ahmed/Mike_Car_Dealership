package Core_classes;

import java.util.Date;

public class Vehicle {
	public Vehicle(String carName, String carmodel, int horsePower, Date productionYear, double price) {
		super();
		this.carName = carName;
		this.carmodel = carmodel;
		this.horsePower = horsePower;
		this.productionYear = productionYear;
		this.price = price;
	}
	private String carName;
	private String carmodel;
	private int horsePower;
	private Date productionYear;
	private double price;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public Date getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [carName=" + carName + ", carmodel=" + carmodel + ", horsePower=" + horsePower
				+ ", productionYear=" + productionYear + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((carmodel == null) ? 0 : carmodel.hashCode());
		result = prime * result + horsePower;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productionYear == null) ? 0 : productionYear.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carmodel == null) {
			if (other.carmodel != null)
				return false;
		} else if (!carmodel.equals(other.carmodel))
			return false;
		if (horsePower != other.horsePower)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productionYear == null) {
			if (other.productionYear != null)
				return false;
		} else if (!productionYear.equals(other.productionYear))
			return false;
		return true;
	}

}
