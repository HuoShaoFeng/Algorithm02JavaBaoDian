package Package03Sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		
		int[] srcArr = new int[]{6,5,12,-13,1,9,3,5};
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		System.out.println();
		Bubble_Sort(srcArr);
		System.out.println("ordered: ");
		for (int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]+"   ");
		}
		
	
		
	}
	
	public static void Bubble_Sort(int[] arr) {
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j+1<arr.length-i;++j) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}

}
