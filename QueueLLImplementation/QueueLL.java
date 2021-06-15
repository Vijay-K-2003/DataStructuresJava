package QueueLLImplementation;

public class QueueLL<Gen>
{
    MyLinkedList<Gen> ll;
    public QueueLL()
    {
        ll = new MyLinkedList<>();
    }
    public void enqueue(Gen x)
    {
        ll.addRear(x);
    }
    public Gen dequeue()
    {
        if(empty())
            throw new IllegalCallerException("The Queue in Empty!");
        return ll.removeFront();
    }
    public int search(Gen x)
    {
        return ll.indexOf(x);
    }
    public Gen peek()
    {
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
        return ll.get(0);
    }
    public Gen getRearElement()
    {
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
