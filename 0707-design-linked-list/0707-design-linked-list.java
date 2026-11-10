class MyLinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int current_size = 0;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node temp = head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }

        if(index>=size || index<0) return -1;
        else{
            temp = head;
            for(int i=0;i<index;i++)
            {
                temp = temp.next;
            }
        }
    return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if(current_size==0)
        {
            tail = head;
        }
        current_size++;
    }
    
    public void addAtTail(int val) {
        if(current_size==0) 
        {
            addAtHead(val);
        }else{
            tail.next = new Node(val);
            tail = tail.next;
            current_size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>current_size) return;
        else if(index==0)
        {
            addAtHead(val);
        } 
        else if(index == current_size)
        {
            addAtTail(val);
        }else{
            Node temp = head;
            Node newnode = new Node(val);
            int cnt = 1;
            while(cnt!=index)
            {
                temp=temp.next;
                cnt++;
            }
            Node temp_next = temp.next;
            temp.next = newnode;
            newnode.next = temp_next;
            current_size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=current_size) return;

        else if(current_size == 1)
        {
            head = null;
            tail = null;
        }
        else if(index == 0)
        {
            head = head.next;
        }
        else{
            Node temp = head;
            int cnt = 1;
            while(cnt<index)
            {
                temp = temp.next;
                cnt++;
            }
            temp.next = temp.next.next;
            if(index == current_size-1)
            {
                tail = temp;
            }
        }
        current_size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */