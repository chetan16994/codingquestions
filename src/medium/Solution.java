package medium;

import java.util.Arrays;

class CircularLinkedList{
    int val;
    CircularLinkedList next;
    CircularLinkedList(int val){
        this.val = val;
        next = null;
    }
}

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length<=1) return deck;
        Arrays.sort(deck);
        CircularLinkedList head = new CircularLinkedList(1);
        CircularLinkedList itr = head;
        for(int i=2;i<=deck.length;i++){
            itr.next = new CircularLinkedList(i);
            itr = itr.next;
        }
        itr.next = head;
        CircularLinkedList prev = itr;
        itr = head;
        int[] op = new int[deck.length];
        for(int i=0;i<op.length;i++){
            op[itr.val-1] = deck[i];
            System.out.println(itr.val);
            //removing the current pointer from the list
            prev.next = itr.next;
            //going to the next to next pointer
            prev = prev.next;
            itr = prev.next;
        }
        return op;
    }

    public static void main(String[] args) {
        Solution obj=new Solution();
        int res[]= obj.deckRevealedIncreasing(new int[] {2,4,6,8,11,13});
        for (int i:res)
            System.out.println(i);
    }
}