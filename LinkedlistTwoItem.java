public class LinkedlistTwoItem {
 private Node first;
 private int count;
 private Node last;

 public LinkedlistTwoItem() {
     first = null;
    //last = null;
     count = 0;
}

public void prepend(String name, int gpa) {
    first = new Node(name,gpa,first);
    count++;
    if (count == 1) {
       last = first;
}
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
    System.out.println("Name is " + traveller.Name + " and GPA is " + traveller.GPA);
    traveller = traveller.next;
  }
}






public void append(String name ,int gpa) {
    Node tmp = new Node(name,gpa);
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
    sb.append("\n\t"+"Name is " + traveller.Name + " and GPA is " + traveller.GPA);
}
    return sb.toString();
}



public static void main(String[] args) {
	LinkedlistTwoItem obj = new LinkedlistTwoItem();
	obj.prepend("Kamel",10);
	obj.prepend("Daniel",7);
	obj.append("Ali",3);
        System.out.println(obj);
    //  obj.check();

  }
}



class Node {
  int GPA;
  String Name;
  Node next;
  Node(String Name, int GPA, Node next) {
    this.GPA = GPA;
    this.Name = Name;
    this.next = next;
}
  Node(String Name, int GPA) {
    this(Name,GPA,null);
}
  Node() {
    this(null,0);
    }
}
