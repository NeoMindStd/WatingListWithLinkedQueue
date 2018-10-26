package watingListWithLinkedQueue;

// Circular Doubly Linked List 
public class CDLList {
	private ListNode L = new ListNode();

	// Insert a data right the L.
	// Clockwise!!
	public void addLastNode(String data) {
		ListNode newNode;
		if(L.nodeR == null) {	// There are no nodes.
			newNode = new ListNode(data);
			newNode.nodeL = newNode;
			newNode.nodeR = newNode;
		} else {				// Already exist nodes.
			newNode = new ListNode(data, getFirstNode(), getFirstNode().nodeR);
			newNode.nodeL.nodeR = newNode;
			newNode.nodeR.nodeL = newNode;
		}
		L.nodeR = newNode.nodeL;
	}

	// Get a data of the first node's left.
	public ListNode getFirstNode() {
		return L.nodeR;
	}
	
	// Insert a data right the node.
	public void insertNode(String data, ListNode node) {
		ListNode newNode;
		if(node.equals(L)) addLastNode(data);
		else {
			newNode = new ListNode(data, node, node.nodeR);
			node.nodeR = newNode;
			newNode.nodeR.nodeL = newNode;
		}
	}
}