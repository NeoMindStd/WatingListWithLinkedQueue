package watingListWithLinkedQueue;

public interface QueueInterface {	
	public boolean isEmpty();
	
	public void enQueue(ListNode node);
	public void enQueue(Customer data);
	
	public Customer deQueue();
	public ListNode deQueueNode();
	
	public void delete();
	
	public Customer peek();
	public ListNode peekNode();
}
