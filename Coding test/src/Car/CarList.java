package Car;

import java.util.*;



public class CarList {
	public static List<Car> getinfo() {
		List<Car> lst = new ArrayList<Car>();
		lst.add(new Car(1001, "Honda", 250000));
		lst.add(new Car(1002, "Chevrolet", 150000));
		lst.add(new Car(1003, "Porshe", 1150000));
		return lst;

	}
	public static void display(Car car) {
		System.out.println("Car ID"+car.getCarid());
		System.out.println("Car Name"+car.getCarName());
		System.out.println("Car Price"+car.getPrice());
		System.out.println("----------------------------------");
	}


}
