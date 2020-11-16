public class TestImpl{

	public Node rotateList(Node head, int n) {
			Node next = head.getNext();
			if(head.getNext() != null)
			{
				while(n >= 0)
				{
					rotateList(next, n--);
				}
				rotateList(next, n);
			}
			System.out.println(head.getName());
			return head;
	}
	
	public static void main(String[] a)
	{
		TestImpl s = new TestImpl();
		int n = 2;
		
	}
}

class Node{
	
	private String name;
	private Node next;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}

