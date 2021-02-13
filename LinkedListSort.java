//kelly briceno
//stacks and queues assignment
// Linked list class
public class LinkedListSort {

 // inserts a new node at the end of the list
 public boolean add(int data) {
  // Check if the element is the first node in the list
  
  if(head == null) {
   n = new node(data);
   n.link = null;
   head = n;
   return true;
  } else {
   temp = n;
   n = new node(data);
   n.link = null;
   temp.link = n;
   
   return true;
  }

  
 }
 
 // Inserts a new node after the one specified
 public boolean addAfter(int val, int data) {
  node j = search(val);
  
  n = new node(data);
  n.link = j.link;
  
  j.link = n;
  
  current = head;
  
  do {
   if (current.link == n) {
    
    // make n the last node of the list again
    n = temp.link;
    return true;
   }
   current = current.link;
  } while (current != null);
  
  return false;
 }
 
 // Replaces the existing element with the one specified
 public boolean replace(int val, int data) {
  node j = search(val);
  
  j.data = data;
  
  return true;
 }
 
 // Removes the node at the end of the list
 public boolean remove() {
  current = head;
  
  do {
   if (current.link == temp) {
    n = temp;
    n.link = null;
    temp = current;
    return true;
   }
   
   current = current.link;
   
  } while (current != null);
  
  return false;
 }
 
 // Removes the node at the specified value
 public boolean remove(int val) {
  node j = search(val);
  
  // Check if the searched value is the head
  if (j == head) {
   j = head.link;
   head = j;
   return true;
  }
  
  // If the val does not exist in the list
  if(j == null) return false;
  
  // executes if val is anywhere else in the list
  current = head;
  do {
   if (current.link == j) {
    
    current.link = j.link;
    
    return true;
   }
   current = current.link;
  } while (current != null);
  
  return false;
 }
 
 // Searches the node of the specified value
 // Returns memory address
 public node search(int val) {
  current = head;
  
  while (current != null) {
   // get the target
   if (current.data == val) {
    return current;
   }
   
   current = current.link;
  }
  
  return null;
 }
 
 // Prints all the elements in the list
 public void print() {
  current = head;
  while (current != null) {
   System.out.print(current.data + " ");
   current = current.link;
  }
  System.out.println();
 }
 
 // Default constructor
 public LinkedListSort() {
  head = null;
 }


 //PROTECTED 
 protected node n,
         temp,
         head,
         current;
  
 public void bubbleS() {
   node border = null; // first node in sprted part
   while (border != head) {
     node current = head;
     while (current.next != border) {
       if (current.element > current.next.element) {
      
         current.element = current.next.element;
         current.next.element = v;
       }
       current = current.next;
     }
     border = current;
   }
 }

}
