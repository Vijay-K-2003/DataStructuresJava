package StackLLimplementation;
// since they are in same package no need of import statement
// but if they are in different packages then use import statement
import StackLLimplementation.StackLL;

public class Application
{
    public static void main(String[] args)
    {
        StackLL<Character> sll = new StackLL<>();
        Character[] ar = {'V', 'I', 'J', 'A', 'Y', ' ', 'K', 'A', 'R', 'A', 'N', 'J', 'K', 'A', 'R'};
        for(int i = 0; i < ar.length; i++)
        {
            sll.push(ar[i]);
        }
        int size = sll.getSize();
        System.out.println(sll.display());
        System.out.println("The index of K is : "+sll.search('K'));
        System.out.println("Top Element is : " + sll.peek());
        System.out.println("Size of stack is : " + sll.getSize());
        if(sll.empty())
            System.out.println("Stack is Empty!");
        else
            System.out.println("Stack is NOT Empty!");
        for(int i = 0; i < size; i++)
        {
            System.out.print(sll.pop());
        }
        if(sll.empty())
            System.out.println("\nStack is Empty!");
        else
            System.out.println("\nStack is NOT Empty!");
        System.out.println();

        StackLL<Integer> slli = new StackLL<>();
        Integer[] roll = {2, 0, 2, 0, 5, 1, 2, 0, 0};
        for (int i = 0 ; i < roll.length ; i++)
        {
            slli.push(roll[i]);
        }
        int sizeroll = slli.getSize();
        System.out.println(slli.display());
        System.out.println("The index of 1 is : "+slli.search(1));
        System.out.println("Top Element is : " + slli.peek());
        System.out.println("Size of stack is : " + slli.getSize());
        if(slli.empty())
            System.out.println("Stack is Empty!");
        else
            System.out.println("Stack is NOT Empty!");
        for(int i = 0; i < sizeroll; i++)
        {
            System.out.print(slli.pop());
        }
        if(slli.empty())
            System.out.println("\nStack is Empty!");
        else
            System.out.println("\nStack is NOT Empty!");
        System.out.println();
    }
}
