package Package03Sort;

public class ShellSort {

	public static void main(String[] args) {
		
		int[] arr = new int[]{16,7,3,9,-5,12,6};
		
		shell_sort(arr);
		
		for (int i : arr) {
			System.out.print(i+"  ");
		}
	}

	private static void shell_sort(int[] arr) {
		int gap = arr.length;
		do {
			gap = gap/3 + 1;
			
			for(int i=0;i<=gap;++i) {
				for(int j=i;j<arr.length;j+=gap) {
					//²åÈëÅÅÐò
					int tmp = arr[j];
					while((j>=gap) && (arr[j-gap]>tmp)) {
						arr[j]=arr[j-gap];
						j-=gap;
					}
					arr[j]=tmp;
				}
			}
			
		}while(gap>1);
		
	}

}
