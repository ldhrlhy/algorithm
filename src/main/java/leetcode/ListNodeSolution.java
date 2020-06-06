package leetcode;

public class ListNodeSolution {
//	���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
//	�����7 -> 0 -> 8
//	ԭ��342 + 465 = 807
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode new1 = new ListNode(0);
		ListNode p=l1,q=l2,curr=new1;
		int carry=0;
		while(p!=null||q!=null){
			int x=(p!=null)?p.val:0;
			int y=(q!=null)?q.val:0;
			int total=x+y+carry;
			carry=total/10;
			curr.next=new ListNode(total%10);
			curr=curr.next;
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if(carry>0){
			curr.next = new ListNode(carry);
		}
		return new1;
    }
	
}
