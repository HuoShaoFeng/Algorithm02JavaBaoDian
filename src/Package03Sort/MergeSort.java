package Package03Sort;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] srcArr = new int[]{16,5,2,-1,2,1,-9,0};
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		System.out.println();
		
		Merge_Sort(srcArr, 0, srcArr.length-1);
		
		System.out.println("ordered: ");
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		
//		mergeArray();
	}

	//对子数组进行  排序
	private static void Merge_Sort(int[] arr, int low, int high) {
		if(low<high){
			int mid = (low+high)>>1;
			Merge_Sort(arr, low, mid);
			Merge_Sort(arr, mid+1, high);
			Merge(arr,low,mid,high);
		}
	}

	//对两个有序数组进行  合并
	private static void Merge(int[] arr, int low, int mid, int high) {
		
		int leftCount = mid - low + 1;//mid这个元素划分到左子数组中
		int rightCount = high - mid;
		int[] left = new int[leftCount];
		int[] right = new int[rightCount];
		
		//将左子数组拷贝到left数组中
		int iL=low;
		for (int i = 0; i < leftCount; i++,iL++) {
			left[i]=arr[iL];
		}
		//将右子数组拷贝到right数组中
		int iR=mid+1;
		for (int i = 0; i < rightCount; i++,iR++) {
			right[i]=arr[iR];
		}
		
		//从后向前合并两个有序子数组left和right
		int index1=left.length-1;
		int index2=right.length-1;
		int i = -1;
		for (i = high; i >= low && index1>=0 && index2>=0 ; i--) {
			if(left[index1]>=right[index2])
				arr[i]=left[index1--];
			else
				arr[i]=right[index2--];
		}
		
		if(index1>=0){//right数组已经比较完了
			while(index1>=0){
				arr[i--]=left[index1--];
			}
		}
		if(index2>=0){//left数组已经比较完了
			while(index2>=0){
				arr[i--]=right[index2--];
			}
		}
	}
	
	public static void mergeArray(){
		int[] arr1 = new int[]{1,2};
		int[] arr2 = new int[]{-2,5};
		
		//从后向前合并两个有序子数组left和right
		int index1=arr1.length-1;
		int index2=arr2.length-1;
		
		int[] arr = new int[arr2.length+arr1.length];
		int i;
		for ( i = arr.length-1; i >= 0 ; i--) {

			if(index1<0){
//				while(index2>=0){
//					arr[i--]=arr2[index2--];
//				}
				break;
			}
			if(index2<0){
//				while(index1>=0){
//					arr[i--]=arr1[index1--];
//				}
				break;
			}
		
			if(arr1[index1]>=arr2[index2])
				arr[i]=arr1[index1--];
			else
				arr[i]=arr2[index2--];
			
			
		}
		
		if(index1>=0){
			while(index1>=0){
				arr[i--]=arr1[index1--];
			}
		}
		if(index2>=0){
			while(index2>=0){
				arr[i--]=arr2[index2--];
			}
		}
		
		
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print("   "+arr[j]);
		}

	}
}
