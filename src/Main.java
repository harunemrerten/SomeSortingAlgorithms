
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here is the first part where ı created object that takes input from a text and turns its array() method into an array.
		
		IntArrayCreator intArray=null;
		FloatArrayCreator floatArray =null;
		try {
			intArray= new IntArrayCreator("int.txt");
			floatArray= new FloatArrayCreator("float.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		// second and third part where we created a insertion sort and sorted integer and float array
		
		
		// now in here ı am looking the array from the given text. This one is for integer
		System.out.println("int array size: "+intArray.array().length);
		for(int x: intArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		// now in here ı am looking the array from the given text. This one is for float
		System.out.println("float array size: "+floatArray.array().length);
		for(float x: floatArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		
		// sorted integer
		System.out.println("now lets see the sorted integer array");
		Insertion.sort(intArray.array());
		for(int x: intArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		// sorted float
		System.out.println("now lets see the sorted array");
		Insertion.sort(floatArray.array());
		for(float x: floatArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//fourth part where we created a Merge sort and sorted an integer array
		
		
		//lets randomize integer array again so that we can use the same object in testing Merge sort
		System.out.println("new randomized integer array to test mergesort:");
		Randomizer.Randomize(intArray.array());
		for(int x: intArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		// lets try to control randomized array that if we can sort with merge sort
		System.out.println("Sorted array with mergeing");
		Merge.sort(intArray.array());
		for(int x: intArray.array())
			System.out.print(x+" ");
		System.out.println();
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		// fifth and sixth part where we create 10 Car object that has compareTo method and creating the Quick sort to test the it with car objects
		
		
		// I am creating 10 car object like the hoca asked
		Car[] car = new Car[]{
				new Car("Toyota","RAV4",2000),
				new Car("Tesla","S",1969),
				new Car("Ford","Mustang",2001),
				new Car("Honda","CRV",2015),
				new Car("BMW","Gran Coupé",2024),
				new Car("Toyota","Corolla",2010),
				new Car("Tesla","X",1999),
				new Car("Chevrolet","Impala",1967),
				new Car("Ford","Bronco",1998),
				new Car("MageAaron","Apostle Of The ArchMage",36999)
		};
		
		System.out.println("Car objects:");// let see our car objects with to string methods
		for(Car x: car)
			System.out.println(x);
		//
		System.out.println("Sorted Car objects with quicksort:");
		Quick.sort(car);
		for(Car x: car)
			System.out.println(x);
		System.out.println();
		
		
		
		// From here ı am starting to the second part
	
		
		
		
		
		
		
		
		
	}
 
}
