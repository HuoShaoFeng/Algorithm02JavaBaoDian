package Package03Sort;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {

	 public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(9999);//�����һ��Ԫ��
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

	    //������
	    public static void heapSort(List<Integer> list){

	        //����һ���󶥶�
	        for (int i=list.size()/2;i>=0;i--){
	            heapAdjust(list,i,list.size()-1);
	        }

	        //
	        for (int i = list.size()-1; i > 0; i--) {
	            //�����Ѷ���¼ �� ��ǰδ�����������е� ���һ��Ԫ��
	            swap(list,0,i);//1����Ѷ�Ԫ��
	            heapAdjust(list,0,i-1);//����Ѿ��������
	        }
	    }

	    //�ѵ���
	    public static void heapAdjust(List<Integer> list,int start,int stop){

	        int tmp = list.get(start);

	        for (int i = start*2; i <= stop; i*=2 ) {

	            //start�����ӽڵ� С�� �����ӽڵ�
	            if (i<stop && list.get(i) < list.get(i+1)){
	                ++i; // i��λ����start�Ľϴ��ӽڵ�
	            }

	            //start�ڵ���ӽڵ㶼����������ѽṹ
	            if(tmp>=list.get(i)){
	                break;
	            }

	            //���ϴ���ӽڵ� ��ֵ ���丸�ڵ�start
	            list.set(start,list.get(i));

	            start = i;//������start�Ľϴ��ӽڵ���жѽṹ����
	        }

	        list.set(start,tmp);

	    }

	    public static void swap(List<Integer> list,int i,int j){
	        int tmp = list.get(j);
	        list.set(j,list.get(i));
	        list.set(i,tmp);
	    }


}


