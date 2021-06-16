package QueueALImplementation;

@SuppressWarnings("unchecked cast")
class MyArrayList<Gen>
{
    protected Gen[] elements;
    protected int buffer;
    protected int size;
    public MyArrayList()
    {
        elements = (Gen[]) new Object[20];
        buffer = 20;
        size = 0;
    }
    public boolean isFull()
    {
        return size == 20;
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
    public void addToFront(Gen i)
    {
        Gen[] newGen = (Gen[]) new Object[buffer];
        newGen[0] = i;
        for(int j = 1 ; j < buffer ; j++)
        {
            newGen[j] = elements[j-1];
        }
        elements = newGen;
        size++;
    }
    public void addToRear(Gen i)
    {
        elements[size] = i;
        size++;
    }
    public void addAtIndex(int index, Gen i)
    {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException("The index "+index+" is Out of bounds ; Min index = 0 Max index = "+(buffer-1));
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
        if (isEmpty())
            throw new IllegalArgumentException("Gen is Empty!");
        Gen copy = elements[0];
        for (int i = 1 ; i < buffer ; i++)
        {
            elements[i-1] = elements[i];// copy form 1 to 0 and 2 to 1 and so on...
        }
        elements[buffer-1] = null; // set repeated element to null
        size--; // reduce the number of element counter
        return copy;
    }
    public Gen removeRear()
    {
        if (isEmpty())
            throw new IllegalArgumentException("Gen is Empty!");
        Gen copy = elements[size-1];
        elements[size-1] = null;
        size--;
        return copy;
    }
    public Gen removeFromIndex(int index)
    {
        if (isEmpty())
            throw new IllegalArgumentException("Gen is Empty!");
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("The index "+index+" is Out of bounds ; \nMin index = 0 Max index = "+(buffer-1));
                    Gen copy = elements[index];
        elements[index] = null;
        for(int j = index ; j < size ; j++)
        {
            elements[j] = elements[j+1];
        }
        size--;
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
        if (size == 0)
            return "[]";
        else
        {
            StringBuilder s = new StringBuilder("[");
// put elements into the buffer
            for (int i = 0; i <= size; i++)
            {
                if (elements[i] == null)
                {
                    s.append("null, ");
                }
                else
                {
                    String a = elements[i].toString() + ", ";

                    s.append(a);

                }
            }
            if (size >= 0)
            {
// remove last ", "
                s.delete(s.length() - 8, s.length());
            }
            s.append("]");
// create equivalent String
            return new String(s);
        }
    }
}
