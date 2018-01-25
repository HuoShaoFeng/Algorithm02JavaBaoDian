package Package03Sort;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {

	 public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(9999);//数组第一个元素
	        list.add(3);
	        list.add(1);
	        list.add(9);
	        list.add(5);
	        list.add(9);
	        list.add(0);

	        for (Integer i: list
	             ) {
	            System.out.print(i+"   ");
	        }
	        System.out.println();

	        heapSort(list);
	        System.out.println("After sort: ");

	        for (Integer i: list
	                ) {
	            System.out.print(i+"   ");
	        }
	        System.out.println();
	    }

	    //堆排序
	    public static void heapSort(List<Integer> list){

	        //构造一个大顶堆
	        for (int i=list.size()/2;i>=0;i--){
	            heapAdjust(list,i,list.size()-1);
	        }

	        //
	        for (int i = list.size()-1; i > 0; i--) {
	            //交换堆顶记录 和 当前未经排序子序列的 最后一个元素
	            swap(list,0,i);//1代表堆顶元素
	            heapAdjust(list,0,i-1);//最后已经是排序的
	        }
	    }

	    //堆调整
	    public static void heapAdjust(List<Integer> list,int start,int stop){

	        int tmp = list.get(start);

	        for (int i = start*2; i <= stop; i*=2 ) {

	            //start的左子节点 小于 其右子节点
	            if (i<stop && list.get(i) < list.get(i+1)){
	                ++i; // i定位到了start的较大子节点
	            }

	            //start节点比子节点都大，无需调整堆结构
	            if(tmp>=list.get(i)){
	                break;
	            }

	            //将较大的子节点 赋值 给其父节点start
	            list.set(start,list.get(i));

	            start = i;//继续对start的较大子节点进行堆结构调整
	        }

	        list.set(start,tmp);

	    }

	    public static void swap(List<Integer> list,int i,int j){
	        int tmp = list.get(j);
	        list.set(j,list.get(i));
	        list.set(i,tmp);
	    }


}


