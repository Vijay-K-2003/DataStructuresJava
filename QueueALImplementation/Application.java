package QueueALImplementation;
// import QueueALImplementation.MyArrayList;
// The above statement is required for using
// MyArrayList in another Package
public class Application
{
    public static void main(String[] args)
    {
        QueueAL<Character> qname = new QueueAL<>();
        QueueAL<Integer> qroll = new QueueAL<>();
        char[] name = {'V', 'I', 'J', 'A', 'Y', ' ', 'K', 'A', 'R', 'A', 'N', 'J', 'K', 'A', 'R'};
        int[] roll = {2, 0, 2, 0, 5, 1, 2, 0, 0};
        for (char c : name)
        {
            qname.enqueue(c);
        }
        for(int i = 0 ; i < roll.length ; i++)
        {
            qroll.enqueue(roll[i]);
        }
        int sizeN = qname.getSize();
        System.out.println(qname.display());
        System.out.println("SIZE OF NAME IS : " + sizeN);
        System.out.println("I IN NAME IS AT : " + qname.search('I'));
        System.out.println("K IN NAME IS AT : " + qname.search('K'));
        System.out.println("THE REAR ELEMENT IS : " + qname.getRearElement());
        System.out.println("THE FRONT ELEMENT IS : " + qname.getFrontElement());
        System.out.println("NEXT ELEMENT THAT WILL BE OUT OF QUEUE IS : " + qname.peek());
        System.out.println("IS THE QUEUE EMPTY : " + qname.empty());
        for (int i = 0; i < sizeN; i++)
        {
            System.out.print(qname.dequeue());
        }
        System.out.println("\nIS THE QUEUE EMPTY : " + qname.empty());
        System.out.println("\n");
        int sizeR = qroll.getSize();
        System.out.println(qroll.display());
        System.out.println("SIZE OF ROLL NO. IS : " + sizeR);
        System.out.println("1 IN ROLL IS AT : " + qroll.search(1));
        System.out.println("5 IN ROLL IS AT : " + qroll.search(5));
        System.out.println("THE REAR ELEMENT IS : " + qroll.getRearElement());
        System.out.println("THE FRONT ELEMENT IS : " + qroll.getFrontElement());
        System.out.println("NEXT ELEMENT THAT WILL BE OUT OF QUEUE IS : " + qroll.peek());
        System.out.println("IS THE QUEUE EMPTY : " + qroll.empty());
        for(int i = 0 ; i < sizeR ; i++)
        {
            System.out.print(qroll.dequeue());
        }
        System.out.println("\nIS THE QUEUE EMPTY : " + qroll.empty());
        System.out.println();
    }
}
