//https://www.hackerrank.com/domains/data-structures/linked-lists

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node n=head;
    if(head==null){
        head.data=data;
        head.next=null;
        return head;
    }
    else {
        while(n.next!=null){
            n=n.next;
        }
    Node n1=new Node();
        n.next=n1;
        n1.data=data;
        return head;
    }
  
}
