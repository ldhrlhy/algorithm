package link;


public class SingleLinkList {
    private Node head=null;
    public static class Node {
        private int data;
        private Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        private int getData(){
            return data;
        }
    }

    public Node findByValue(int value) {
        Node p=head;
        while (p!=null&&p.data!=value){
            p=p.next;
        }
        return p;
    }

    public Node findByIndex(int index){
        Node p =head;
        int pos=0;
        while (p!=null&&pos!=index){
            p=p.next;
            ++pos;
        }
        return p;
    }

    public void insertToHead(int value){
        Node newNode=new Node(value,null);

    }

    public void insertToHead(Node newNode){
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void insertAfter(Node p,int value) {
        Node newNode = new Node(value,null);
        insertAfter(p,newNode);
    }

    public void insertAfter(Node p,Node newNode){
        if(p==null){
            return;
        }
        newNode.next=p.next;
        p.next=newNode;
    }

    public void insertBefore(Node p,int value){
        Node newNode = new Node(value,null);
        insertBefore(p,newNode);
    }

    public void insertBefore(Node p,Node newNode){
        if(p==null){
            return;
        }
        if(head==p){
            insertToHead(newNode);
            return;
        }

        Node q=head;

        while (q!=null&&q.next!=p){
            q=q.next;
        }
        if(q==null){
            return;
        }
        newNode.next=p;
        q.next=newNode;
    }

}
