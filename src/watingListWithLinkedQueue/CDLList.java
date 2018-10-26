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

	// Get a data of the first node
	public ListNode getFirstNode() {
		return L.nodeR;
	}

	// Counter-Clockwise!!
	public void deleteNode(ListNode node) throws Exception {
		if(getFirstNode() == null) throw new Exception("The list is empty!!");
		else if(node == null) throw new Exception("The node is empty!!");
		else {
			node.nodeR.nodeL = node.nodeL;
			node.nodeL.nodeR = node.nodeR;
			if(node.equals(getFirstNode())) {
				L.nodeR = node.nodeL;
			}
		}
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