package QueueLLImplementation;

import java.util.NoSuchElementException;

public class QueueLL<Gen>
{
    MyLinkedList<Gen> ll;
    public QueueLL()
    {
        ll = new MyLinkedList<>();
    }
    public void enqueue(Gen x)
    {
        if (ll.size() == 20)
            throw new NoSuchElementException("The Queue Is Full!");
        ll.addRear(x);
    }
    public Gen dequeue()
    {
        if(empty())
            throw new NoSuchElementException("The Queue in Empty!");
        return ll.removeFront();
    }
    public int search(Gen x)
    {
        if(empty())
            throw new NoSuchElementException("The Queue in Empty!");
        return ll.indexOf(x);
    }
    public Gen peek()
    {
        if(empty())
            throw new NoSuchElementException("The Queue in Empty!");
        return ll.get(0);
    }
    public boolean empty()
    {
        return ll.isEmpty();
    }
    public int getSize()
    {
        return ll.size();
    }
    public Gen getFrontElement()
    {
        if(empty())
            throw new NoSuchElementException("The Queue in Empty!");
        return ll.get(0);
    }
    public Gen getRearElement()
    {
        if(empty())
            throw new NoSuchElementException("The Queue in Empty!");
        return ll.get(ll.size() - 1);
    }
    public String display()
    {
        return ll.toString();
    }
    public boolean contains(Gen x)
    {
        throw new UnsupportedOperationException("This operation is Unsupported!");
    }
    public void clear()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public Gen removeRear()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public void addFront(Gen x)
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public void add(int index, Gen x)
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public Gen remove(int index)
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
}
