package Package03Sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] srcArr = new int[]{6,5,-2,-2,1,9,0,5};
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		System.out.println();
		Quick_Sort(srcArr, 0, srcArr.length-1);
		System.out.println("ordered: ");
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		
		
	}
	
	//������Ŧ��λ��
	public static int Partition(int[] arr,int low,int high){
		int key = arr[low];
		
		while(low<high){
			
			while(low<high && key<=arr[high]){ //�������<=����<�����޷��Ƚ���������ͬ������
				high--;
			}
			int tmp = arr[high];
			arr[high] = arr[low];
			arr[low] = tmp;
			
			while(low<high && key>=arr[low]){ //�������<=����<�����޷��Ƚ���������ͬ������
				low++;
			}
			tmp = arr[high];
			arr[high] = arr[low];
			arr[low] = tmp;
		}
		
		return low;
	}
	
	public static void Quick_Sort(int[] arr,int low,int high){
		if(low < high){
			int par = Partition(arr, low, high);
			Quick_Sort(arr, low, par-1);
			Quick_Sort(arr, par+1, high);
		}		
	}
}
