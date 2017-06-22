
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1 = new int[] {1,2};
    int[] arr2 = new int[] {3,4};
    
    double median = findMedianOfTwoSortedArrays(arr1,arr2);
    System.out.println(median);
	}

	private static double findMedianOfTwoSortedArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int len1 = arr1.length;
		int len2 = arr2.length;
		if(len1 < len2) 
			return findMedianOfTwoSortedArrays(arr2,arr1);
		if(len2 ==0)
			return (arr1[len1-1/2] + arr1[len1/2])/2;
		int h1 = arr1.length >0 ?arr1[arr1.length-1] :0;
		int l2 = arr2.length >0?arr2[0]:0;
		double res = (h1 +l2 )/2.0;
		return res;
	}

}
