package watingListWithLinkedQueue;

public class DataQueue implements QueueInterface {
	protected CDLList list = new CDLList();

	@Override
	public boolean isEmpty() {
		return (list.getFirstNode() == null);
	}

	@Override
	public void enQueue(ListNode node) {
		list.addLastNode(node);
	}

	@Override
	public void enQueue(Customer data) {
		list.addLastNode(data);
	}

	@Override
	public Customer deQueue() {
		Customer data = this.peek();
		delete();
		return data;
	}

	@Override
	public ListNode deQueueNode() {
		ListNode node = this.peekNode();
		delete();
		return node;
	}

	@Override
	public void delete() {
		try { list.deleteNode(list.getFirstNode()); } catch (Exception e) { }
	}

	@Override
	public Customer peek() {
		return peekNode().data;
	}

	@Override
	public ListNode peekNode() {
		return list.getFirstNode();
	}
}