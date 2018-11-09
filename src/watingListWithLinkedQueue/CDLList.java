package watingListWithLinkedQueue;

// Circular Doubly Linked List 
public class CDLList {
	private ListNode L = new ListNode();

	// Insert a data right the L.
	// Clockwise!!
	public void addLastNode(ListNode node) {
		addLastNode(node.data);
	}
	public void addLastNode(Customer data) {
		ListNode newNode;
		if(L.RNode == null) {	// There are no nodes.
			newNode = new ListNode(data);
			newNode.LNode = newNode;
			newNode.RNode = newNode;
			L.RNode = newNode.RNode;
		} else {				// Already exist nodes.
			newNode = new ListNode(data, getFirstNode().LNode, getFirstNode());
			newNode.LNode.RNode = newNode;
			newNode.RNode.LNode = newNode;
		}
	}

	// Get a data of the first node
	public ListNode getFirstNode() {
		return L.RNode;
	}

	// Counter-Clockwise!!
	public void deleteNode(ListNode node) throws Exception {
		if(getFirstNode() == null) throw new Exception("The list is empty!!");
		else if(node == null) throw new Exception("The node is empty!!");
		else {
			node.RNode.LNode = node.LNode;
			node.LNode.RNode = node.RNode;
			if(node.equals(getFirstNode())) {
				if(node.RNode.equals(node))
					L.RNode = null;
				else L.RNode = node.RNode;
			}
		}
	}
	
	// Insert a data right the node.
	public void insertNode(Customer data, ListNode existNode) {
		ListNode newNode;
		if(existNode.equals(L)) addLastNode(data);
		else {
			newNode = new ListNode(data, existNode, existNode.RNode);
			newNode.RNode.LNode = newNode;
			newNode.LNode.RNode = newNode;
		}
	}
}