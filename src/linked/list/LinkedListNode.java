package linked.list;

public class LinkedListNode {
	
	int data;
	LinkedListNode nextNode;
	
	public LinkedListNode(int data){
		this.data=data;
	}
	
	public LinkedListNode(){
		data=0;
		nextNode=null;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
}
