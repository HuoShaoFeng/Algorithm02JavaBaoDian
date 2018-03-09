package Package05Array;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,4,8,4,7,-1,-5};
        System.out.println("子数组的最大和是：");
        System.out.println(getMaxSum(arr));
    }

    /**
     * 动态规划法
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

