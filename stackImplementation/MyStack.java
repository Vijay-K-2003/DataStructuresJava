/*
* public class MyStack2
* protected Object[] stack;// stack of Object type
* protected int buffer = 0;// height of stack or number of element on stack
* public MyStack2()//constructor
* public boolean empty()//check if empty
* public Object peek()//peeks on the top of stack
* public void push(Object element)//keeping book on stack
* public Object pop()//remove book from the stack
* public void reverse()//reverse the stack
* private void resize(int capacity)//resize the stack
* */
// Array Implementation
public class MyStack
{
    // imagine it as stack of books
    protected Object[] stack;   // stack of Object type
    protected int buffer = 0;       // height of stack
    // CONSTRUCTOR
    public MyStack2()
    {
        stack = new Object[1];
    }
    // Stack has set of Operations
    public boolean empty()
    {
        // checks if the stack is empty or not
        return buffer == 0;
    }
    public Object peek()
    {
        // peeks and return the topmost element
        // without deleting it
        if(buffer != 0)
            return stack[buffer - 1];
        else
            System.out.println("The Stack is Empty!!!");
        return -1;
    }
    public void push(Object element)
    {
        // pushes the element Object on the stack
        // first check if the stack is full
        // if full then double the size of stack array
        if (buffer == stack.length)
            resize(2 * stack.length);
        // Now push element at the top
        stack[buffer] = element;
        buffer++;
    }
    public Object pop()
    {
        // Check the Index if it is valid
        // If the user calls pop index first
        // then the buffer will become -ve
        if(buffer == 0)
            throw new IllegalCallerException("No element to pop!!!\nStack is Empty!!!");
        // returns the topmost object and deletes
        // it from the top
        // step 1 copy the element to be removed into
        // another variable
        Object elementToBeRemoved = stack[--buffer];
        // the removed position should be made null
        stack[buffer] = null;
        // now if buffer size has reduced to one-fourth
        // then reduce the size of stack array to half
        // doing this will reduce the complexity
        // imagine the case when the stack is full but
        // the user is repeatedly pushing and popping
        // the element, in this case the resize function
        // will be called repeatedly, so we reduce size
        // of stack when it has reduced to one-fourth
        if(buffer > 0 && buffer == stack.length/4)
            resize(stack.length/2);
        // now return the element to be removed
        return elementToBeRemoved;
    }


    // Other Optional Functions
    public void reverse()
    {
        // to reverse the stack
        // create another stack
        Object[] newStack = new Object[buffer];
        // pop elements from old stack and push
        // them into new stack
        for(int i = 0 ; i < buffer ; i++)
        {
            newStack[i] = stack[buffer-1-i];
        }
        // now reinitialize old stack to new stack
        stack = newStack;
    }
    private void resize(int capacity)
    {
        Object[] copy = new Object[capacity];
        for(int i = 0 ; i < buffer ; i++)
        {
            copy[i] = stack[i];
        }
        stack = copy;
    }
    public static void main(String[] args)
    {
        MyStack ob = new MyStack();
        /*
        * This is for Application of the Above DATA STRUCTURE
        * This class can be imported and used later
        */
        ob.push(1);         // pushed 1 on stack
        System.out.println(ob.pop()); // removed 1 from stack
        ob.push(2);// pushed 2 on stack
        ob.push(3);// pushed 3 on stack
        ob.push(4);// pushed 4 on stack
        System.out.print(ob.pop());//removed 4 from stack output 4
        System.out.println(ob.pop());// removed 3 from stack output 3
        System.out.println(ob.peek());//output 2
        ob.push(100);// pushed 100 on stack
        ob.reverse();
        System.out.println(ob.peek());// output 100
        System.out.println(ob.empty());
//        ob.pop();
    }
}
