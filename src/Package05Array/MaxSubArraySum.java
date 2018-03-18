package Package05Array;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,-2,-5};
        System.out.println("������������ǣ�");
        System.out.println(getMaxSum(arr));
        
        int[] arr1 = new int[]{-4,-2,-1,-5};
        System.out.println("����= "+getMax(arr1));
        System.out.println("��ʼλ�ã�"+index[0]+", "+index[1]);   
    }
    
    //��ȡ��������������� �Լ���ʼλ��
    static int[] index = new int[2];
    public static int getMax(int[] arr){
        int max = arr[0];
        int sum = 0;
        int start = 0;
        for (int i=0;i<arr.length;++i){
            
            if (sum<0){
                sum=arr[i];
                start=i;
            }
            else 
            	sum += arr[i];
            if(max<sum){
                    max=sum;
                    index[0]=start;
                    index[1]=i;
                    
            }
        }
        return max;
    }

    /**
     * ��̬�滮��
     */
    private static int getMaxSum(int[] arr) {
        int[] End = new int[arr.length];
        int[] All = new int[arr.length];

        End[0]=All[0]=arr[0];

        for (int i = 1; i < arr.length; i++) {
            End[i] = End[i-1]+arr[i] > arr[i] ? End[i-1]+arr[i] : arr[i];
            All[i] = All[i-1]>End[i]?All[i-1]:End[i];
        }
        return All[arr.length-1];
    }
    
    
    
    
    
    
}

