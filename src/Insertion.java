
public class Insertion {
	
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) {
		// it compares elements with less method and change with exchange method exactly like the Insertion sort algoritm
		// only difference it starts from the last element to first element
		for (int i =a.length-1 ; 0<=i; i--)
		for (int j = i; j<a.length-1; j++)
			if (less(a[j], a[j+1]))
				exch(a, j, j+1);
			else break;
	}
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) { 
		 if(0> v.compareTo(w))
			 return true;
		 else
			 return false;
	}
	 
	 
	 @SuppressWarnings("rawtypes")
	private static void exch(Comparable[] a, int i, int j) {  
		Comparable temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	 
}
