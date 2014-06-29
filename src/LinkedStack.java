import java.util.EmptyStackException;

/*
 * A LinkedStack object uses the linked list approach to stacks to hold locations along the path.
 */
public class LinkedStack<E>{
	/*
	 * 	Invariant of the LinkedStack class:
	 * 		1. The items in the stack are stored in a linked list, with the top of the stack stored at the head node, down to the
	 * 		   bottom of the stack at the final node.
	 * 		2. The instance variable top is the head reference of the linked list of items.
	 */
	private Node<E> head;	// head reference for list
	
	// private inner Node class
	private class Node<E>{
		private E data;
		private Node link;
		
		/**
		 * Constructor
		 * @param initialData The data to initialize the node with
		 * @param initialLink A reference to the node after this node
		 */
		public Node(E initialData, Node initialLink){
			this.data = (E) initialData;
			this.link = initialLink;
		}
		
		/**
		 * mutator method setData sets the new data into this node
		 * @param data The generic data to add to this node
		 */
		public void setData(E data){
			this.data = (E) data;
		}
		
		/**
		 * mutator method setLink to set the link to the node after this node
		 * @param link The reference to the node after this node
		 */
		public void setLink(Node link){
			this.link = link;
		}
		
		/**
		 * accessor method to return the data at this node
		 * @return data The data in this node
		 */ 
		public E getData(){
			return (E) data;
		}
		
		/**
		 * accessor method to return a reference to the node after this node
		 * @return link A reference to the node after this node
		 */
		public Node getLink(){
			return link;
		}
		
		/**
		 * addNodeAfter method will add a new node after this node
		 * @param element The data to add to this node
		 */
		public Node addNodeAfter(E element){
			link = new Node(element, link);
			return link;
		}
		
		/**
		 * removeNodeAfter method will remove the node after this node
		 */
		public void removeNodeAfter(){
			link = link.link;
		}
		
		/**
		 * toString method to display the data held by all the nodes in the list along with the links that each node references
		 */
		public String toString(){
			String field1 = "",
				   field2 = "";
			
			if(data == null){
				field1 = "dummy";
			}
			else{
				field1 = data.toString();
			}
			
			if(link == null){
				field2 = "null in tail!";
			}
			else{
				field2 = link.toString();
			}	
			return "data: " + field1 + "\nlink: " + field2;
		}
	}
	
	/**
	 * Constructor
	 */
	public LinkedStack(){
		head = null;
	}
	
	/**
	 * isEmpty method to determine if a stack is empty or still has more elements
	 * @return - True if the stack is empty, otherwise false
	 */
	public boolean isEmpty(){
		return (head == null);
	}
	
	/**
	 * Peek to see what's at the top of the stack and return it without removing it from the stack
	 * @return - The element at the top of the stack
	 */
	public E peek(){
		if(head == null){
			throw new EmptyStackException();
		}
		return head.getData();
	}
	
	/**
	 * Remove the item from the stack and return the element
	 * @return - The element removed from the stack
	 */
	public E pop(){
		E answer;
		
		if(head == null){
			throw new EmptyStackException();
		}
		
		answer = head.getData();
		head = head.getLink();
		return answer;
	}
	
	/**
	 * Push a new element to the top of the stack.
	 * @param item - The new element
	 */
	public void push(E item){
		head = new Node<E>(item, head);
	}
	
}
