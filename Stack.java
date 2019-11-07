public class Stack
{
   public Node head, tail;
   private int size;

   //constructor method to create a list of object with head, tail, and size. 
   public Stack()
   {
      head = null;
      tail = null;
      size = 0;
   }
  
   //method push
   public void push(int data) {// add elements
      Node newNode = new Node(data);
		if (tail == null)
			head = tail= newNode ;// check if empty list
		else {
			tail.next = newNode; // link new node as last node
			tail = tail.next; // make tail pointer points to last node
		}
		size++; // increase list size by one
	}
         
     public void pop() { // remove last element
		if (size != 0) {
			if (size == 1) // one node list
			{

				head = tail = null;
				size = 0;

			} else {
				Node current = head; // current points to head
				for (int i = 1; i < size - 1; i++)
					current = current.next; // move current to second last node
				tail = current; // tail point to current node
				tail.next = null; // set tail.next to null
				size--; // decrease list size by one element
			}
		}
	}
     // method top()
      public int top(){
       
       return tail.data;
       }
      
     // method size()
      public int size(){
      return size;
      }
     
     //method isEmpty()
     public boolean isEmpty(){
      return size ==0;
      }
                
  //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
     
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}


