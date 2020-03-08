import java.util.Iterator;

public class LinkedQuene<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    private class Node
    {
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;  //长度
    public boolean isEmpty() {return N==0;}
    public int size() {return N;}
    public void enquene(Item item)
    {
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()) first=last;
        else  oldlast.next=last;
        N++;
    }
    public Item dequene()
    {
        Item item=first.item;
        first=first.next;
        if(isEmpty()) last=null;
        N--;
        return item;



    }
}
