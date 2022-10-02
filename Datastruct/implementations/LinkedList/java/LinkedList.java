public class LinkedList {

	private Node first;
	private Node current;
	private Node last;

	public LinkedList() {
		this.first = this.last = null;
	}

	public Node getHeadNode() {
		return this.first;
	}

	public Node getNext(Node n) {
		return n.next;
	}

	public Node getTailNode() {
		return this.last;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public void insertAtFront(Object data) {
		if (isEmpty()) {
			this.first = this.last = new Node(data);
		} else {
			this.first = new Node(data, this.first);
		}
	}

	public void insertAtBack(Object data) {
		if (isEmpty()) {
			this.first = this.last = new Node(data);
		} else {
			this.last = this.last.next = new Node(data);
		}
	}

	public Object removeFromFront() throws EmptyListException {
		Object remove = null;

		if (isEmpty())
			throw new EmptyListException();

		remove = this.first;
		if (this.first.equals(last)) {
			this.first = this.last = null;
		} else {
			this.first = this.first.next;
		}
		return remove;
	}

	public Object removeFromBack() throws EmptyListException {
		Object remove = null;

		if (isEmpty())
			throw new EmptyListException();

		remove = this.last.data;
		if (this.first.equals(this.last))
			this.first = this.last = null;
		else {
			this.current = this.first;

			// Iterate to the node just before the last node
			// while (this.current != this.last)
			// this.current = this.current.next;
			//
			// // Reassigned the new lastnode and break next chain of the removed nodes
			// this.last = current;
			// current.next = null;
			//
		}
		return remove;

	}

	public Object getFirst() throws EmptyListException {
		if (isEmpty())
			throw new EmptyListException();
		return this.first.data;
	}

	public Node getNext() {
		if (this.current != this.last) {
			current = current.next;
			return current;
		} else {
			return null;
		}
	}
}
