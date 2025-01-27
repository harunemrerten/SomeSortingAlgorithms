
public class Merge{
	
	
	@SuppressWarnings("rawtypes")
	private static void merge(Comparable[] a, Comparable[] tempArr, int lo, int mid, int hi) {
		// this is our merge method in which we have 2 comparable array and three integer value that are low mid and high
		// it make temparray = main array and in temp array with comparing the two parts with each other it writes to the main array in the end.
		for (int k = lo; k <= hi; k++)
			tempArr[k] = a[k];
		
		int i = lo, j = mid+1;
		
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = tempArr[j++];
			else if (j > hi)
				a[k] = tempArr[i++];
			else if (!(less(tempArr[j], tempArr[i])))
				a[k] = tempArr[j++];
			else a[k] = tempArr[i++];
		}
	} 
	
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable[] a, Comparable[] tempArr, int lo, int hi) {
		// it divide the array into two from mid and sorts the elements recursively and merging them all
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, tempArr, lo, mid);
		sort(a, tempArr, mid+1, hi);
		merge(a, tempArr, lo, mid, hi);
	}
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a) {
		// we are creating out temp array in here and we call the method of sort with more parameters.
		Comparable[] tempArr = new Comparable[a.length];
		sort(a, tempArr, 0, a.length - 1);
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) { 
		 if(0> v.compareTo(w))
			 return true;
		 else
			 return false;
	}
	
	
}