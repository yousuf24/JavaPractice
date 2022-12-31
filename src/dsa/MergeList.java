package dsa;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
public class MergeList {
	Node head;
	
	void addAtLast(Node node) {
		 if (head == null) {
	            head = node;
	        }
	        else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	            temp.next = node;
	        }
		}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
	public static void main(String[] args) {
		MergeList lList1=new MergeList();lList1.addAtLast(new Node(5));lList1.addAtLast(new Node(1));lList1.addAtLast(new Node(15));
		MergeList lList2=new MergeList();lList2.addAtLast(new Node(1));lList2.addAtLast(new Node(3));lList2.addAtLast(new Node(5));
		
//		lList1.print();
//		lList2.print();
		
		lList1.head=new Gfg().sortedMerge(lList1.head,lList2.head);
		lList1.print();
		

	}

}

class Gfg{
	Node sortedMerge(Node headA, Node headB)
    {
 
        /* a dummy first node to
           hang the result on */
        Node dummyNode = new Node(0);
 
        /* tail points to the
        last result node */
        Node tail = dummyNode;
        while (true) {
 
            /* if either list runs out,      use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
 
            /* Compare the data of the two            lists whichever lists' data is            smaller, append it into tail and            advance the head to the next Node
            */
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
 
            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
}
