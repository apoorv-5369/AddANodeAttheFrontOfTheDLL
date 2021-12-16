//adding a node at the front of the dll.
public void push(int new_data)
{
/* 1. Allocate node.
* 2. Put in the data.*/
Node new_Node = new Node(new_data);
/* 3. Make next of new node as head and previous as null.*/
new_Node.next=head;
new_Node.prev=null;
/* 4. Change previous of head node to new node.*/
if(head!=null){
head.prev=new_Node;
/* 5. Move the head to point to the new node.*/
head=new_Node;
}
}
