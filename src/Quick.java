
public class Quick {//private static int partition(Comparable[] a, int lo, int hi)
	
	
	@SuppressWarnings("rawtypes")
	private static int partition(Comparable[] a, int lo, int hi) {
		// has three parameter which are comparable array and two integer that are low and high.
		// this is partition parts it has pivot and i and j if t j is lesser than a low it changes the elements and if i is greater than low it changes again
		int i = lo, j = hi+1;
		while (true) {
			while (!(less(a[lo], a[--j])))
				if (j == lo) break;
			while (!(less(a[++i], a[lo])))
				if (i == hi) break;
			if (i >= j) break;
			exch(a, i, j);}
		exch(a, lo, j);
		return j;
	} 
	
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) {
		// with this method we sort the array by calling the other sort method with extra parameters and in here ı randomize the arrays.
		Randomizer.Randomize(a);
		sort(a, 0, a.length - 1);
	}
	
	
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable[] a, int lo, int hi) {
		// we are calling partition in here than recursively sorts all the arrays elements
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		 sort(a, lo, j-1);
		 sort(a, j+1, hi);
	}
	
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) { 
		 // compares the elements
		 if(0> v.compareTo(w))
			 return true;
		 else
			 return false;
	}
	 
	
	 @SuppressWarnings("rawtypes")
	private static void exch(Comparable[] a, int i, int j) { 
		 // exchanges the elements
		Comparable temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}