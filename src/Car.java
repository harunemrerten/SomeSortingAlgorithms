

public class Car implements Comparable<Car>{
	
	
	public Car(String brand, String modelName, long modelYear) {
		this.brand = brand;
		this.modelName = modelName;
		this.modelYear = modelYear;
	}


	private String brand,modelName;
	private long modelYear;
	
	
	
	@Override
	public int compareTo(Car otherCar) {
		if(this.modelYear>otherCar.modelYear)
			return 1;
		else if(this.modelYear==otherCar.modelYear)
			return 0;
		else 
			return -1;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", modelName=" + modelName + ", modelYear=" + modelYear + "]";
	}
}
