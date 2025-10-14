public class doubly_LL {
     Node head;
   
     public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }  
    } 


    public void display(){
        Node node = head;
        Node tail = null;
        while( node != null){
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }
        System.out.println("end");
        System.out.println("Printing in reverse order");
        while(tail != null){
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }
        System.out.println("start");
    }
    







    private class Node{   
        int val;
        Node next;
        Node prev;
        
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
    public static void main(String[] args){
        doubly_LL list = new doubly_LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(336);
        list.display();
    }
    
}

