package Package01List;

import java.util.HashMap;
import java.util.Hashtable;

public class MyLinkedList {
	
	Node head = null;
	
	//向链表中插入数据
	public void addNode(Node node){
		if(head==null){
			head = node;
			return;
		}
		Node tmp = head;
		while(tmp.next!=null){
			tmp = tmp.next;
		}
		tmp.next = node;
	}
	
	//删除链表的第index个节点
	public boolean deleteNode(int index){
		//删除的index位置不合理
		if(index<1 || index>length()){
			return false;
		}
		//删除第一个节点
		if(index==1){
			head = head.next;
			return true;
		}
		
		int tmp = 1; //删除第2个或以后的节点
		Node tmpNode = head;
		//将节点移动到被删除的节点的上一个节点
		while(tmpNode != null){
			if(tmp==index-1){
				break;
			}
			tmpNode = tmpNode.next;
			tmp++;
		}
		
		tmpNode.next =tmpNode.next.next;
		return true;
	}

	
	//获取链表的长度
	public int length(){
		int length = 0;
		Node tmp = head;
		while(tmp!=null){
			length++;
			tmp = tmp.next;
		}
		return length;
	}
	
	//对链表进行排序
	public void sortList(){
		Node curNode = head;
		while(curNode!=null){
			Node nextNode = curNode.next;
			while(nextNode!=null){
				if(curNode.data > nextNode.data){
					int tmpData = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = tmpData;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
	}
	
	public static void printList(MyLinkedList list){
		Node node = list.head;
		while(node!=null){
			System.out.print(node.data + ", ");
			node = node.next;
		}
		System.out.println();
	}
	
	//删除链表中重复的数据
	public void deleteRepeatData(){
		Node tmp = head;
		HashMap<Integer,Integer> map = new HashMap<>();
		Node pre = null;
		
		while(tmp!=null){
			if(!map.containsKey(tmp.data)){//未重复
				map.put(tmp.data, 1);
				pre = tmp;
			}else{//重复
				pre.next = tmp.next;
			}
			tmp=tmp.next;
		}
	}
	
	public void test(){
		Node tmp = head;
		Node t2 = tmp;
		System.out.println("tmp = "+tmp.data +", t2 = "+t2.data);

		t2.data = 10;	
		System.out.println("tmp = "+tmp.data +", t2 = "+t2.data);
	}
	
	//输出单链表中倒数第k个节点
	public static Node getKLast(Node head,int k) {
		if(head==null || k<=0)
			return null;
		
		Node node = head;
		Node nxt = head;
		
		int step = k-1;
		for(int i=0; i<step; ++i) {
			if(nxt.next!=null)
				nxt = nxt.next;
			else //说明k大于链表的长度
				return null;
		}
		
		while(nxt.next!=null) {
			nxt = nxt.next;
			node = node.next;
		}
		return node;
	}
	
	//单链表的反转
	public static Node reverseList(Node head) {
		Node pre = null;
		Node nxt = null;
		while(head!=null) {
			nxt = head.next;
			head.next = pre;
			pre = head;
			head = nxt;
		}
		return pre;
	}
	
	//从尾到头输出单链表
	public static void printListReverse(Node head) {
		if(head !=null ) {
			printListReverse(head.next);
			System.out.println(head.data);
		}else
		{
			//等于null   不做任何处理，可省略else
		}
	}
	
	//找到单链表的中间节点
	public static Node findMidNode(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	
	
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addNode(new Node(6));
		list.addNode(new Node(5));
		list.addNode(new Node(6));
		list.addNode(new Node(6));
		list.addNode(new Node(6));
		
		Node head = new Node(2);
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		Node n3 = new Node(0);
		Node n4 = new Node(3);
		Node n5 = new Node(9);
		Node n6 = new Node(7);
		
		head.next = n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=null;

		System.out.println("Mid = "+findMidNode(head).data);
		
//		printListReverse(head);
		
		
//		Node node = reverseList(head);
//		while(node!=null) {
//			System.out.println(node.data);
//			node = node.next;
//		}
//		
		
		
		
//		int k = 7;
//		Node node = getKLast(head,k);
//		if(node==null)
//			System.out.println("倒数第"+k+"的值是：null ");
//		else
//			System.out.println("倒数第"+k+"的值是： "+node.data);
		
//		list.test();
		
		
//		System.out.println("length : "+list.length());
		
//		printList(list);
//		list.deleteNode(8);
//		printList(list);
	
//		list.sortList();
//		printList(list);
		
//		list.deleteRepeatData();
//		printList(list);
	
	
	}
	
}
