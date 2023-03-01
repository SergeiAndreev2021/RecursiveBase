public class MergeSorter{

    public static int [] mergeSorted(int[] left, int[] right) { 
    	int [] result = new int[left.length+right.length];
    	int leftIndex = 0;
    	int rightIndex = 0;
    	int resultIndex = 0;

    	while(leftIndex < left.length && rightIndex < right.length)
    	{
    		if (left[leftIndex]<right[rightIndex])
    			result[resultIndex++] = left[leftIndex++];
    		else
    			result[resultIndex++] = right[rightIndex++];
    	}
    	while (leftIndex < left.length )
    	{
    		 result[resultIndex++] = left[leftIndex++];
    	}
    	while (rightIndex<right.length)
    	{
    		result[resultIndex++] = right[rightIndex++];
    	}
       return result;
    }

    public static int[] sorter(int[] a) {
    	if (a == null) return null;

    	if (a.length == 1) return a;
    	else
    	{
        int [] left = new int[a.length/2];
        int [] right = new int[a.length - left.length];

        for (int i=0;i<left.length ;i++ ) {
        	   left[i] = a[i];
        }
        for (int i=0;i<right.length ;i++ ) {
        	   right[i] = a[left.length+i];
        }

        return mergeSorted(sorter(left),sorter(right));

    	}

    }

	public static void main(String[] args) {
		int [] a = {2,4,8,12};
		int [] b = {0,5,11,10};
		int[] c = mergeSorted(a,b);
		for(int zz : c) System.out.print(zz+" ");
		System.out.println();

		int[]d = {6,5,4,3,2,1,22,-78,0};
		int [] rd = sorter(d);

		for(int zz : rd) System.out.print(zz+" ");
		System.out.println();
	}
}