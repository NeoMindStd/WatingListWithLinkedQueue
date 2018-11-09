package watingListWithLinkedQueue;

public class ListNode {
	public Customer data;
	public ListNode LNode;
	public ListNode RNode;
	
	public ListNode() {}
	
	public ListNode(Customer data) { this(data, null, null); }
	// For the start node. not a data node!
	public ListNode(ListNode RNode) { this(null, null, RNode); }
	public ListNode(ListNode LNode, ListNode RNode) { this(null, LNode, RNode); }

	public ListNode(Customer data, ListNode RNode) {
		this(data, null, RNode);
	}
	
	public ListNode(Customer data, ListNode LNode, ListNode RNode) {
		this.data = data;
		this.LNode = LNode;
		this.RNode = RNode;
	}
	
	public void printData() {
		System.out.println(data);
	}
	
	public void printAll() {
		System.out.println("Data : " + data);
		System.out.println("Left : " + LNode);
		System.out.println("Right : " + RNode);
	}
}
