// Class:         CS 5040/W1
// Term:          Spring 2019
// Name:          Thassanee Wells
// Instructor     Dr.Seo
// Assignment:    #2 Stack implementation using linked list
// RecursiveString



import java.util.Stack;
import java.util.Scanner;
public class ReverseString
{
   public Node first;
   public Node head, tail;
   private int size;

   //constructor method to create a list of object with head, tail, and size. 
   public ReverseString()
   {  
      first = null;
      head = null;
      tail = null;
      size = 0;
   }
   //method push
   public void push(String data) {// add elements
      Node newNode = new Node(data);
		if (tail == null)
			head = tail= newNode ;// check if empty list
		else {
			tail.next = newNode; // link new node as last node
			tail = tail.next; // make tail pointer points to last node
		}
		size++; // increase list size by one
    }  
      public static String reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

                
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
      private String data;  //data field
      private Node next; //link field
     
      public Node(String item) //constructor method
      {
         data = item;
         next = null;
      }
   }
      
	
         
  public static void main(String[]args)
  {
      Scanner input =new Scanner(System.in);
      System.out.print("Enter a string: ");
      String word = input.nextLine();
      
      
      ReverseString myWord= new ReverseString();
      String[] wordLink = word.split(" ");
      myWord.push(word);
      
      System.out.print("Input String: ");
      myWord.printList();
      System.out.println();
      System.out.print("\nReversed String: ");
      System.out.println(reverse(word));
      
       } 
 }    