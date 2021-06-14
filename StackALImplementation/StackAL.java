package StackALImplementation;

import java.util.EmptyStackException;

public class StackAL<Gen> extends ArrayList<Gen>
{
    StackAL(int capacity)
    {
        super(capacity);
    }
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
    public void push(Gen theObject)
    {
        addToRear(theObject);
    }
    public Gen pop()
    {
        return removeRear();
    }
    public String display()
    {
        return toString();
    }
    public int getSize()
    {
        return size();
    }
    public int search(Gen x)
    {
        return indexOf(x);
    }
    public void addToFront(Gen element)
    {
        throw new UnsupportedOperationException("This method is Unsupported!");
    }
    public void addAtIndex(int index, Gen element)
    {
        throw new UnsupportedOperationException("This method is Unsupported!");
    }
    public Gen removeFront()
    {
        throw new UnsupportedOperationException("This method is Unsupported!");
    }
    public Gen removeFromIndex(int index)
    {
        throw new UnsupportedOperationException("This method is Unsupported!");
    }
    public int buffer()
    {
        throw new UnsupportedOperationException("This method is Unsupported!");
    }
}

@SuppressWarnings("unchecked cast")
class ArrayList<Gen>                                     // Generic Type Gen
{
    protected Gen[] elements;                           // For storing Elements Object[]
    protected int buffer;                               // Maximum number of elements that can be stored
    protected int size;                                 // Number of elements filled
    ArrayList(int capacity)
    {
        // Constructor for initializing
        elements = (Gen[]) new Object[capacity];
        buffer = capacity;  // initial buffer taken from the user
        size = 0;
    }
    private boolean isFull()
    {
        // Checks if the DS is Full
        return size == buffer;
    }
    private void increaseSize()
    {
        // We will double buffer
        // when the DS is full
        Gen[] copy = (Gen[]) new Object[buffer*2];
        for (int i = 0 ; i < buffer ; i++)
        {
            copy[i] = elements[i];
        }
        elements = copy;
        buffer *= 2;      // buffer = buffer*2;
    }
    private boolean bufferIsReduced()
    {
        // if n is one-fourth then we will reduce buffer to half
        // The reason for doing this is that if we consider
        // the worst case scenario the user can enter some value
        // when the DS is full so the arrayGen buffer will increase
        // so now if the user removes an item the list buffer should
        // decrease But this will be a burden on the machine
        return (size <= (buffer/4));
    }
    public int indexOf(Gen i)
    {
        for(int j = 0 ; j < buffer ; j++)
        {
            if(i.equals(elements[j]))
                return j;
        }
        return -1;
    }
    public Gen get(int index)
    {
        if(index < 0 || index > buffer)
            throw new IndexOutOfBoundsException("The index "+index+" is Out of bounds ; Min index = 0 Max index = "+(buffer-1));
        return elements[index];
    }
    private void reduceSize()
    {
        Gen[] newGen = (Gen[]) new Object[buffer/2];
        for(int i = 0 ; i < (buffer/2) ; i++)
        {
            newGen[i] = elements[i];
        }
        buffer = buffer/2;
        elements = newGen;
//        System.out.println("Size is halved");
    }
    public void addToFront(Gen i)
    {
        if(isFull())
        {
            increaseSize();
//            System.out.println("The Data Structure was Full so increased buffer to "+buffer);
        }
        Gen[] newGen = (Gen[]) new Object[buffer];
        newGen[0] = i;         //Front element is i as taken from user
        for(int j = 1 ; j < buffer ; j++)
        {
            newGen[j] = elements[j-1];
        }
        elements = newGen; //
        size++;        // increase number of elements stored
    }
    public void addToRear(Gen i)
    {
        if(isFull()) // if n == buffer
        {
            // Increase Array SIZE
            increaseSize(); // buffer will ve doubled
//            System.out.println("The Data Structure was Full so increased buffer to "+buffer);
        }
        elements[size] = i;
        size++;
    }

    public void addAtIndex(int index, Gen i)
    {
        // ADDS to index other than the previously filled arraylist
        if(index < size || index > buffer)
            throw new IndexOutOfBoundsException("The index "+index+" is Out of bounds ; Min index = 0 Max index = "+(buffer-1));
        if(isFull())
            increaseSize();
        for (int j = buffer - 2; j >= index; j--)
            elements[j + 1] = elements[j];

        elements[index] = i;
        size++;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public Gen removeFront()
    {
        if(isEmpty())
            throw new IllegalArgumentException("The List is Empty!");
        Gen copy = elements[0];        // make copy
        for (int i = 1 ; i < buffer ; i++)
        {
            elements[i-1] = elements[i];// copy form 1 to 0 and 2 to 1 and so on...
        }
        elements[buffer-1] = null; // set repeated element to null
        size--; // reduce the number of element counter
        if (bufferIsReduced())
        {
            // if the array is one-fourth filled then we will reduce buffer to half
            reduceSize();
//            System.out.println("Less Than one-fourth buffer was filled so reduced buffer to " + buffer);
        }
        return copy;
    }
    public Gen removeRear()
    {
        if(isEmpty())
            throw new IllegalArgumentException("The List is Empty!");
        Gen copy = elements[size-1];
        elements[size-1] = null;
        size--;
        if (bufferIsReduced())
        {
            reduceSize();
        }
        return copy;
    }
    public Gen removeFromIndex(int index)
    {
        if(index < 0 || index > size)   // <<---- see this
            throw new IndexOutOfBoundsException("The index "+index+" is Out of bounds ; \nMin index = 0 Max index = "+(buffer-1));
        Gen copy = elements[index];
        elements[index] = null;
        for(int j = index ; j < size ; j++)
        {
            elements[j] = elements[j+1];
        }
        size--;
        if (bufferIsReduced())
        {
            reduceSize();
        }
        return copy;
    }

    public int buffer()
    {
        return buffer;
    }
    public int size()
    {
        return size;
    }
    public String toString()
    {
        StringBuilder s = new StringBuilder("[");
        for(int i = 0 ; i < size; i++)
        {
            String a = elements[i].toString() + ", ";
            s.append(a);
        }
        s.delete(s.length() - 2, s.length());

        s.append("]");
        return new String(s);
    }
}
