
import java.util.Scanner;

public class TestStack
{
   public static void main (String[] args)
   {
      Stack myList = new Stack(); //create a list object
   
       for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.push(i*10);
        
      }
      System.out.print("Initial List: ");
      myList.printList();
      System.out.println();
      System.out.println("Top element in the list: "+myList.top());
      System.out.println("Size of elements in the List is: "+myList.size());
      System.out.println("The list is empty: " + myList.isEmpty());
      System.out.println();

      System.out.print("List after pop: ");
      myList.pop();
      myList.printList();
      System.out.println();
      System.out.println("Top element in the list: "+myList.top());
      System.out.println("Size of elements in the List is: "+myList.size());
      System.out.println("The list is empty: " + myList.isEmpty());
      System.out.println();

      myList.pop();
      System.out.print("List after pop: ");
      myList.printList();
      System.out.println();
      System.out.println("Top element in the list: "+myList.top());
      System.out.println("Size of elements in the List is: "+myList.size());
      System.out.println("The list is empty: " + myList.isEmpty());
      System.out.println();

      myList.pop();
      System.out.print("List after pop: ");
      myList.printList();
      System.out.println();
      System.out.println("Top element in the list: "+myList.top());
      System.out.println("Size of elements in the List is: "+myList.size());
      System.out.println("The list is empty: " + myList.isEmpty());
      System.out.println();

      myList.pop();
      System.out.print("List after pop: ");
      myList.printList();
      System.out.println();
      System.out.println("Top element in the list: "+myList.top());
      System.out.println("Size of elements in the List is: "+myList.size());
      System.out.println("The list is empty: " + myList.isEmpty());
      System.out.println();

      



      
 }
}