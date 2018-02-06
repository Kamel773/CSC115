public class LinkedlistInteger {
 private Node first;
  private int count;
  private Node last;

	public LinkedlistInteger() {
		first = null;
    //last = null;
		count = 0;
}

public void prepend(int element) {
    first = new Node(element,first);
    count++;
		if (count == 1) {
       last = first;
}
}


	public int findAtIndex(int index){
    int i = 1;
    for (Node traveller = first; traveller != null; traveller = traveller.next){
      if (i == index){
        return traveller.item;
      }
      i++;
    }
    return -1;
  }


  public int find(int element){
    for (Node traveller = first; traveller != null; traveller = traveller.next){
      if (element == traveller.item){
        return traveller.item;
      }
    }
    return -1;
  }


public int size(){
  return 0;
}

public boolean isEmpty(){
  return (first == null);
}

public void check(){

	//System.out.println(first.item);
	//System.out.println(last.next);
  //System.out.println(first.next.next.item);
  //System.out.println(first.next.next.next.item);
//  first = first.next;
	//System.out.println(last.item);
	//System.out.println(last.next);
  //last.next = first;
  //last = first.next;
//  Node traveller;
  //for (traveller = first; traveller != null; traveller = traveller.next){
  //  System.out.println("Node = " + traveller.item);
  //}
  //System.out.println(traveller.next);
  Node traveller = first;
  while(traveller != null){
    System.out.println("Node = " + traveller.item);
    traveller = traveller.next;
  }
}

public int sum(){
  int sum = 0;
  for (Node traveller = first; traveller != null; traveller = traveller.next){
    sum = sum + traveller.item;
  }
  return sum;
}


public int Max(){
  Node traveller = first;
  int max= traveller.item;
  for (; traveller != null; traveller = traveller.next){
    if (traveller.item > max){
      max = traveller.item;
    }
  }
  return max;
}


public void append(int element) {
    Node tmp = new Node(element);
    last.next = tmp;
    last = tmp;
    count++;
		tmp = null;
}


public String toString() {
  StringBuilder sb = new StringBuilder(count*10);
  sb.append("List: size = "+count);
for (Node traveller = first; traveller != null; traveller = traveller.next) {
                //this will invoke the String’s toString method!!
    sb.append("\n\t"+traveller.item);
}
             return sb.toString();
}



	public static void main(String[] args) {
		LinkedlistInteger obj = new LinkedlistInteger();
		obj.prepend(10);
		obj.prepend(7);
		obj.append(3);
    obj.prepend(4);
//  System.out.println(obj);
  //System.out.println(obj.find(9));
//  System.out.println(obj.Max());
  obj.check();

  }
}



class Node {
  int item;
  Node next;
  Node(int item, Node next) {
    this.item = item;
    this.next = next;
}
  Node(int item) {
    this(item,null);
}
  Node() {
    this(0);
    }
}
