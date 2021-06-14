package StackALImplementation;
// since they are in same package no need of import statement
// but if they are in different packages then use import statement
import StackALImplementation.StackAL;
public class Application
{
    public static void main(String[] args)
    {
        StackAL<Character> sal = new StackAL<Character>(1);
        Character[] ar = {'V', 'I', 'J', 'A', 'Y', ' ', 'K', 'A', 'R', 'A', 'N', 'J', 'K', 'A', 'R'};
        for(int i = 0; i < ar.length; i++)
        {
            sal.push(ar[i]);
        }
        int size = sal.getSize();
        System.out.println(sal.display());
        System.out.println("Size is : "+sal.getSize());
        System.out.println(sal.peek());
        System.out.println("Index of I is (0 indexing) : "+sal.search('I'));
        System.out.println("First Index of A is (0 indexing) : "+sal.search('A'));
        for(int i = 0; i < size; i++)
        {
            System.out.print(sal.pop());
        }
        System.out.println();

        StackAL<Integer> sali = new StackAL<>(4);
        Integer[] ari = {2,0,2,0,5,1,2,0,0};
        for(int i = 0; i < ari.length; i++)
        {
            sali.push(ari[i]);
        }
        int sizei = sali.getSize();
        System.out.println(sali.display());
        System.out.println("Size is : "+sali.getSize());
        System.out.println(sali.peek());
        System.out.println("Index of 1 is (0 indexing) : "+sali.search(1));
        System.out.println("Index of 5 is (0 indexing) : "+sali.search(5));
        for(int i = 0; i < sizei; i++)
        {
            System.out.print(sali.pop());
        }
        System.out.println();
    }
}
