package QueueLLImplementation;

public class MyLinkedList<Gen>    // Gen generic type
{
    // Data members
    protected Node firstNode;
    protected int size;

    public MyLinkedList()
    {
        // Constructor
        firstNode = null;
        size = 0;
    }
    private class Node
    {
        Gen data;
        Node next;
        Node(Gen element)
        {
            this.data = element;
        }
        Node(Gen element, Node addr)
        {
            this.data = element;
            this.next = addr;
        }
    }
    private boolean isFull()
    {
        return size == 20;
    }
    public boolean isEmpty()
    {
        // to check if the size of the Linked List is 0
        return size == 0;
    }
    public int size()
    {
        // to get the size of Linked list
        return size;
    }
    private void checkIndex(int index)
    {
        // checks if the index is valid or invalid
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("\nIndex = " + index + "\nSize = " + size + "\n is Out Of Bounds");
    }
    public Gen get(int index)
    {
        // returns data which is at index "index"
        checkIndex(index);
        Node currentNode = firstNode;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode.data;
    }
    public int indexOf(Gen element)
    {
        // return the index of the element
        Node currentNode = firstNode;
        int index = 0;
        while(currentNode != null && !currentNode.data.equals(element))
        {
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode == null)
            return -1;
        else
            return index;
    }

    public Gen remove(int index)
    {
        checkIndex(index);
        Gen removedElement;
        if(index == 0)
        {
            removedElement = firstNode.data;
            firstNode = firstNode.next;
        }
        else
        {
            // 1 2 3
            Node q = firstNode;
            for (int i = 0; i < index-1; i++)
                q = q.next;
            removedElement = q.next.data;
            // 3 <- 4 4 <- 5
            q.next = q.next.next;
            // 3 <- 5
        }
        size--;
        return removedElement;
    }
    public void add(int index, Gen element)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("\nIndex = "+index+"\nSize = "+size+"\n is out of Bounds.");
        if (index == 0)
            firstNode = new Node(element, firstNode);
        else
        {
            Node p = firstNode;
            for (int i = 0; i < index-1 ; i++)
                p = p.next;
            p.next = new Node(element, p.next);
        }
        size++;
    }
    public void addFront(Gen element)
    {
        firstNode = new Node(element, firstNode);
        size++;
    }
    public void addRear(Gen element)
    {
        if (size != 0)
        {
            Node p = firstNode;
            for (int i = 0; i < size - 1; i++)
                p = p.next;
            p.next = new Node(element, p.next);
        }
        else
        {
            firstNode = new Node(element, firstNode);
        }
        size++;
    }
    public Gen removeFront()
    {
        if(isEmpty())
            throw new IllegalArgumentException("The List is Empty!");
        Gen removedElement;
        removedElement = firstNode.data;
        firstNode = firstNode.next; // head -> 1 -> 2 -> 3 => head -> 2 -> 3
        size--;
        return removedElement;
    }
    public Gen removeRear()
    {
        if(isEmpty())
            throw new IllegalArgumentException("The List is Empty!");
        Gen removedElement;
        Node q = firstNode;
        for (int i = 0; i < size - 2; i++) // size - 3
            q = q.next;
        removedElement = q.next.data;
        q.next = q.next.next; // head -> 1 -> 2 -> 3 -> null => head -> 1 -> 2 -> null
        size--;
        return removedElement;
    }
    public void clear()
    {
        // To Clear the Linked List
        Node q = firstNode;
        int s = size;
        for (int i = 0; i < s; i++)
        {
            remove(0);
        }
        System.out.println("DATA CLEARED!");
    }
    public boolean contains(Gen o)
    {
        // To check if the LL contains specified Object
        Node q = firstNode;
        for (int i = 0; i < size; i++)
        {
            if(q.data.equals(o))
                return true;
            q = q.next;
        }
        return false;
    }
    public String toString()
    {
        if (size != 0)
        {
            StringBuilder s = new StringBuilder("[ ");
            Node p = firstNode;
            for (int i = 0; i < size ; i++)
            {
                s.append(p.data).append(", ");
                p = p.next;
            }
            if (size > 0)
                s.delete(s.length() - 2, s.length());
            s.append(" ]");
            return new String(s);
        }
        return "[]";
    }
}

