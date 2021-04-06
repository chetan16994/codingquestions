package easy;

class Node{
    int data;
    Node next;
    Node (int data,Node next){
        this.data=data;
        this.next= next;
    }
    public Node(){}
}
public class L1290 {
    public int getDecimalValue(Node head) {
        Node curr=head;
        int n=0;
        int ans=0;

        Node prev=null;
        Node next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

        curr=head;

        while (curr!=null){
            if(curr.data==1) {
                ans += Math.pow(2, n);
            }
            curr=curr.next;
            n +=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,0,1,1,1,0,0,0,0,0,0};
//        int arr[]={1,2,3,4};
        Node head=null;
        for (int i = arr.length-1; i >=0 ; i--) {
            head=new Node(arr[i],head );
        }
        L1290 obj=new L1290();
        System.out.println(obj.getDecimalValue(head));
    }
}
