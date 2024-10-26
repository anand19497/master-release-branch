
public class Main {
    public ListNode mergeUnsortedLinkedList(ListNode L1, ListNode L2 ){
        if (L1==null) return L2;
        if (L2==null) return L1;
        ListNode current=L1;

        while(current.next!=null){
            current=current.next;

        }

        current.next=L2;


        return L1;
    }
    void print( ListNode head){
        ListNode currentNode=head;
        while (currentNode!=null){

            System.out.print(currentNode.val + "  ");
            currentNode=currentNode.next;

        }
    }


    public static void main(String[] args) {
        ListNode newlist=new ListNode(1);
        newlist.next=new ListNode(5);
        newlist.next.next=new ListNode(4);

        ListNode newlist1=new ListNode(5);
        newlist1.next=new ListNode(11);
        newlist1.next.next=new ListNode(12);
        Main newmain=new Main();
    ListNode   mergeList = newmain.mergeUnsortedLinkedList(newlist,newlist1);

        newmain.print(mergeList);

        }
    }