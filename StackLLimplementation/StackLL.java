package StackLLimplementation;

import java.util.EmptyStackException;

public class StackLL<Gen> extends LinkedList<Gen>
{
    public boolean empty()
    {
        return isEmpty();
    }
    public Gen peek()
    {
        if (isEmpty())
            throw new EmptyStackException();
        return get(getSize()-1);
    }
    public int getSize()
    {
        return size();
    }
    public void push(Gen element)
    {
        addRear(element);
    }
    public Gen pop()
    {
        if(empty())
            throw new EmptyStackException();
        return removeRear();
    }
    public String display()
    {
        return toString();
    }
    public int search(Gen x)
    {
        return indexOf(x);
    }
    public boolean contains(Gen x)
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
    public Gen remove(int index)
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
    public void addFront(Gen x)
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
    public void add(int index, Gen x)
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
    public Gen removeFront()
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
    public void clear()
    {
        throw new UnsupportedOperationException("This Method is Unsupported!");
    }
}

class LinkedList<Gen>
{
    protected Node firstNode;
    protected int size;
    public LinkedList()
    {
        firstNode = null;
        size = 0;
    }
    protected class Node
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
            throw new IndexOutOfBoundsException("\nIndex = " + index +
                    "\nSize = " + size + "\n is Out Of Bounds");
    }
    public Gen get(int index)
    {
        checkIndex(index);
        Node currentNode = firstNode;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode.data;
    }
    public int indexOf(Gen element)
    {

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
            Node q = firstNode;
            for (int i = 0; i < index-1; i++)
                q = q.next;
            removedElement = q.next.data;
            q.next = q.next.next;
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
        firstNode = firstNode.next;
        size--;
        return removedElement;
    }
    public Gen removeRear()
    {
        if(isEmpty())
            throw new IllegalArgumentException("The List is Empty!");
        Gen removedElement;
        if (size != 1)
        {
            Node q = firstNode;
            for (int i = 0; i < size - 2; i++)
                q = q.next;
            removedElement = q.next.data;
//        if(q.next.next != null)
            q.next = q.next.next;
            size--;
        }
        else
        {
            Node q = firstNode;
            removedElement = q.data;
            q.next = null;
            size--;
        }
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