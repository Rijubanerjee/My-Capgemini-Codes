package Car;

import java.util.List;

public class MaxPriceCar {
	public static void main(String[] args) {
		List<Car> lst = CarList.getinfo();
		double max = lst.stream().mapToDouble(e -> e.getPrice()).max().getAsDouble();
		lst.stream().filter(e -> e.getPrice() == max).forEach(CarList::display);

	}

}
