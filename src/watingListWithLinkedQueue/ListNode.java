package watingListWithLinkedQueue;

public class ListNode {
	public String data;
	public ListNode nodeL;
	public ListNode nodeR;
	
	public ListNode() {}
	
	public ListNode(String data) {
		this.data = data;
	}

	// For the start node. not a data node!
	public ListNode(ListNode nodeR) {
		this.data = null;
		this.nodeL = null;
		this.nodeR = nodeR;
	}
	
	public ListNode(ListNode nodeL, ListNode nodeR) {
		this.nodeL = nodeL;
		this.nodeR = nodeR;
	}

	public ListNode(String data, ListNode nodeR) {
		this.data = data;
		this.nodeR = nodeR;
	}
	
	public ListNode(String data, ListNode nodeL, ListNode nodeR) {
		this.data = data;
		this.nodeL = nodeL;
		this.nodeR = nodeR;
	}
	
	public void printData() {
		System.out.println(data);
	}
	
	public void printAll() {
		System.out.println("Data : " + data);
		System.out.println("Left : " + nodeL);
		System.out.println("Right : " + nodeR);
	}
}
