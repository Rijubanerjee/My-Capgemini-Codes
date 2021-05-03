package Car;

public class Car {
	int carid;
	String carName;
	float price;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Car(int carid, String carName, float price) {
		super();
		this.carid = carid;
		this.carName = carName;
		this.price = price;
	}
	
}
