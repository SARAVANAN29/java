package DataStructure;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SingleNode {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	// Complete the printLinkedList function below.

	
	static void printLinkedList(SinglyLinkedListNode head) {
		if (head.next != null) {
			System.out.println(head.data);
			printLinkedList(head.next);
		}

		else {
			System.out.println(head.data);
		}
	}

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		return head;
	}

	static int l=0;
	private static int getNodeLength(SinglyLinkedListNode head , int len)
	{
		l = len;
		if(head.next != null)
		{
			l++;
			return getNodeLength(head.next , l);
		}
		System.out.println(l);
		return l;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SinglyLinkedList llist = new SinglyLinkedList();

		//        int llistCount = scanner.nextInt();
		//        int n = scanner.nextInt();
		//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		for (int i = 0; i < list.size(); i++) {
			int llistItem = list.get(i);
			//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			llist.insertNode(llistItem);
		}
		
		SinglyLinkedListNode returnNode = rotateList(llist.head, 3);
		System.out.println("current node list");
		printLinkedList(returnNode);
		System.out.println("Final list");
		printLinkedList(llist.head);
		//        scanner.close();
	}
	
	static int count = 1;
	private static SinglyLinkedListNode rotateList(SinglyLinkedListNode head, int i) {
		SinglyLinkedListNode myNode = null;
		SinglyLinkedListNode temp = head;
		int length = getNodeLength(head , 1), sl = 0;
		try {
			sl = length%i;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("We cant use 0");
		}
		
		System.out.println("length = " + length + " " + "sl = " + sl);
		while(sl+1 > 0)
		{
			head = head.next;
			sl--;
		}
		myNode = head.next;
		
		head.next = null;
		
		SinglyLinkedListNode t = myNode;
		
		while (t.next != null) {
			t = t.next;
		}
		t.next = temp;
		return myNode;
	}
}