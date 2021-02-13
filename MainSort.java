//kelly briceno
//stacks and queues assignemnt
public class MainSort {

 public static void main(String[] args) {
  //created linked list 
  System.out.println("Linked List");
  LinkedListSort list = new LinkedListSort();
  //adding items to linked list
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  
 //calling print method
  list.print();
  //calling remove method
  list.remove(3);
  //calling print method
  list.print();
  
  list.bubbleS(); 
 

  

  
  
  
  
 }
}
