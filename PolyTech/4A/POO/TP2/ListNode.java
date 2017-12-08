package tp2;

public class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int newdata){
		data = newdata;
		next = null;
	}
	public ListNode(ListNode n){
		data = n.data;
		if (n.getNext() != null)
			next = new ListNode(n.getNext());
		else
			next = null;
	}
	public int getData(){
		return data;
	}
	public ListNode getNext(){
		return next;
	}
	public void setNext(ListNode node){
		next = node;
	}
	public boolean hasNext(){
		return !(next == null);
	}
}
