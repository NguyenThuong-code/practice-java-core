package list;

public class DeleteStart {
    class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail= null;
    public void addNode(int data){
        Node newNode= new Node(data);
        if (head==null){
            head= newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void deleteFromStart(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }else {
            if (head!=tail){
                head=head.next;
            }else {
                head=tail=null;
            }
        }
    }
    public void display(){
        Node current =head;
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
