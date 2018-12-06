public class LinkedListDemo {
  public static void main(String args[]){
    System.out.println("LinkedList Demo");
    LinkedList ll = new LinkedList();
    ll.display();
    ll.addNode(10);
    ll.addNode(20);
    ll.addNode(30);
    ll.display();
  }
  
};

class Node{
  
  public int number;
  public Node nextNode;
  
  public Node(int num){
    nextNode = null;
    number = num;
  }
  
  public Node next(){
    return nextNode;
  }
  public void setNext(Node node){
    nextNode = node;
  }
  public String toString(){
    return "Value is:"+number;
  }
  
  
  public int getNumber(){
    return number;
  } 
}


class LinkedList{
  private int count;
  private Node head;
  
  public LinkedList(){
    count = 0;
    head = null;
  }
  
  public void addNode(int value){
    //create New Node
    Node newNode = new Node(value);
    //Traverse to the end
    if(head==null){
      head = newNode;
    }else{
      
    Node node = head;
    display();
    
    while(node.next()!=null){
      node = node.next();
    }
    node.setNext(newNode);
    }
    count++;
  }
  
  public void display(){
    if(count ==0){
      System.out.println("List Empty");
    }else{
      System.out.println("Size is "+count);
      Node node = head;   
        while(node!=null){
          System.out.println(node);
          node = node.next();
        }
    }
  }
};
