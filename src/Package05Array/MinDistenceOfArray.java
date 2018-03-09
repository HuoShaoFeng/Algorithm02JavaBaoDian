package Package05Array;

public class MinDistenceOfArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,6,7,8,5,6,3,10,8};
        int n1 = 4;
        int n2 = 8;
        System.out.println("两个数之间最小距离是：");
        System.out.println(getMinDis(arr,n1,n2));
    }

    private static int getMinDis(int[] arr, int n1, int n2) {
        int minDis = Integer.MAX_VALUE;

        if(arr==null || arr.length<2)
            return Integer.MAX_VALUE;

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==n1){
                index1 = i;
                if(index2!=-1){
                    minDis = minDis>Math.abs(index1-index2)?Math.abs(index1-index2):minDis;
                }
            }

            if(arr[i]==n2){
                index2 = i;
                if(index1!=-1){
                    minDis = minDis>Math.abs(index1-index2)?Math.abs(index1-index2):minDis;
                }
            }
        }
        return  minDis;
    }
}
