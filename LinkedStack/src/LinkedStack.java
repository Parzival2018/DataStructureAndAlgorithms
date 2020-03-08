import java.util.Iterator;

public class LinkedStack<Item> implements Iterable<Item> {
private class Node
{
    Item item;
    Node next;
}
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    private Node first;
    private int N;
    public boolean isEmpty() {return N==0;}
    public int size() {return N;}
    public void push(Item i)
    {
        Node oldfirst;
        oldfirst=first;
        first =new Node();
        first.item=i;
        first.next=oldfirst;
    }
    public Item pop()
    {
       Item removeItem=first.item;
       first=first.next;
       N--;
       return removeItem;
    }
}

