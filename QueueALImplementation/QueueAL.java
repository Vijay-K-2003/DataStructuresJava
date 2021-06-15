package QueueALImplementation;

// import QueueALImplementation.MyArrayList;
// The above statement may be required If we
// are importing form a different package

public class QueueAL<Gen>
{
    MyArrayList<Gen> ls;
    public QueueAL()
    {
        ls = new MyArrayList<>(1);
    }
    public void enqueue(Gen x)
    {
        ls.addToRear(x);
    }
    public Gen dequeue()
    {
        if(empty())
            throw new IllegalCallerException("The Queue in Empty!");
        return ls.removeFront();
    }
    public int search(Gen x)
    {
        return ls.indexOf(x);
    }
    public Gen peek()
    {
        return ls.get(0);
    }
    public boolean empty()
    {
        return ls.isEmpty();
    }
    public int getSize()
    {
        return ls.size;
    }
    public Gen getFrontElement()
    {
        return ls.get(0);
    }
    public Gen getRearElement()
    {
        return ls.get(ls.size() - 1);
    }
    public String display()
    {
        return ls.toString();
    }
    public void addToFront()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public void addAtIndex()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public Gen removeRear()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
    public Gen removeFromIndex(int index)
    {
        throw new UnsupportedOperationException("This Opeartion is Unsupported!");
    }
    public int buffer()
    {
        throw new UnsupportedOperationException("This Operation is Unsupported!");
    }
}
