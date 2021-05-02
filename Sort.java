
public class Sort {

	public static void main(String[] args) {
		int[] array0= {-5,5,-3,3,-1,1,0};
		System.out.println("For selection sort, we print it step by step as follows: ");
		selectionsort(array0);
		System.out.print("And so, the sorted array using selection sort is ");
		for(int curr=0; curr<array0.length; curr++) {
        	System.out.print(array0[curr]+" ");
        }
		
		int[] array1= {-5,5,-3,3,-1,1,0};
		System.out.println("\n\nFor insertion sort, we print it step by step as follows: ");
		insertionsort(array1);
		System.out.print("And so, the sorted array using insertion sort is ");
		for(int curr=0; curr<array1.length; curr++) {
        	System.out.print(array1[curr]+" ");
        }
		
		int[] array2= {-5,5,-3,3,-1,1,0};
		mergesort(array2,0,array2.length-1);
		System.out.print("\n\nThe sorted array using merge sort is ");
		for(int curr=0; curr<array2.length; curr++) {
        	System.out.print(array2[curr]+" ");
        }
		
		int[] array3= {-5,5,-3,3,-1,1,0};
		quicksort(array3,0,array3.length-1);
		System.out.print("\n\nThe sorted array using quick sort is ");
		for(int curr=0; curr<array3.length; curr++) {
        	System.out.print(array3[curr]+" ");
        }
		
		

		
	}
	//selection sort
	public static void selectionsort(int arr[])
    {
        int n = arr.length;
  
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIndex])
                	minIndex = j;
  
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
            for(int curr=0; curr<arr.length; curr++) {
            	System.out.print(arr[curr]+" ");
            }
            System.out.println();
        }
    }
	//insertion sort
	public static void insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for(int curr=0; curr<arr.length; curr++) {
            	System.out.print(arr[curr]+" ");
            }
            System.out.println();
        }
    }
	//merge sort
	public static void mergesort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
        
        
    }
	
	public static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	//quick sort
	public static void quicksort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quicksort(arr, begin, partitionIndex-1);
	        quicksort(arr, partitionIndex+1, end);
	    }
	}
	
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
 
   
    

}
