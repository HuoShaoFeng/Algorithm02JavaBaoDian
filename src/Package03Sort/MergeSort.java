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

	//�����������  ����
	private static void Merge_Sort(int[] arr, int low, int high) {
		if(low<high){
			int mid = (low+high)>>1;
			Merge_Sort(arr, low, mid);
			Merge_Sort(arr, mid+1, high);
			Merge(arr,low,mid,high);
		}
	}

	//�����������������  �ϲ�
	private static void Merge(int[] arr, int low, int mid, int high) {
		
		int leftCount = mid - low + 1;//mid���Ԫ�ػ��ֵ�����������
		int rightCount = high - mid;
		int[] left = new int[leftCount];
		int[] right = new int[rightCount];
		
		//���������鿽����left������
		int iL=low;
		for (int i = 0; i < leftCount; i++,iL++) {
			left[i]=arr[iL];
		}
		//���������鿽����right������
		int iR=mid+1;
		for (int i = 0; i < rightCount; i++,iR++) {
			right[i]=arr[iR];
		}
		
		//�Ӻ���ǰ�ϲ���������������left��right
		int index1=left.length-1;
		int index2=right.length-1;
		int i = -1;
		for (i = high; i >= low && index1>=0 && index2>=0 ; i--) {
			if(left[index1]>=right[index2])
				arr[i]=left[index1--];
			else
				arr[i]=right[index2--];
		}
		
		if(index1>=0){//right�����Ѿ��Ƚ�����
			while(index1>=0){
				arr[i--]=left[index1--];
			}
		}
		if(index2>=0){//left�����Ѿ��Ƚ�����
			while(index2>=0){
				arr[i--]=right[index2--];
			}
		}
	}
	
	public static void mergeArray(){
		int[] arr1 = new int[]{1,2};
		int[] arr2 = new int[]{-2,5};
		
		//�Ӻ���ǰ�ϲ���������������left��right
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
