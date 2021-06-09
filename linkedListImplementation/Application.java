package linkedListImplementation;

public class Application extends LinkedList<Object>
{
    public static void main(String[] args)
    {
        LinkedList<Object> ll_name = new LinkedList<>();
        LinkedList<Object> ll_id = new LinkedList<>();
        Object[] name = {'V', 'I', 'J', 'A', 'Y', ' ', 'K', 'A', 'R', 'A', 'N', 'J', 'K', 'A', 'R'};
        Object[] id = {2, 0, 2, 0, 5, 1, 2, 0, 0};
        System.out.println("*****Implement addRear(), removeRear() and removeFront() methods!*****\n");
        System.out.println("Name in Correct Order : ");
        for (int i = 0; i < name.length; i++)
        {
            ll_name.addRear(name[name.length-1-i]);
        }
        System.out.println("\nName is Now : " + ll_name);
        for (int i = 0; i < name.length; i++)
        {
            if (i < name.length-1)
                System.out.print(ll_name.removeRear());
            else
                System.out.print(ll_name.removeFront());
        }
        System.out.println("\nName is Now : "+ll_name);
        System.out.println();

        System.out.println("Name in Reverse Order : ");
        for (int i = 0; i < name.length; i++)
        {
            ll_name.addRear(name[i]);
        }
        System.out.println("\nName is Now : " + ll_name);
        for (int i = 0; i < name.length; i++)
        {
            if (i < name.length-1)
                System.out.print(ll_name.removeRear());
            else
                System.out.print(ll_name.removeFront());
        }
        System.out.println("\nName is Now : " + ll_name);
        System.out.println();
        // For Id
        System.out.println("\n*****Implement addFront(), removeRear() and removeFront() methods*****\n");
        System.out.println("ID in Correct Order : ");
        for (int i = id.length-1; i >= 0; i--)
        {
            ll_id.addFront(id[id.length-1-i]);
        }
        System.out.println("\nID is Now : " + ll_id);
        for (int i = 0; i < id.length; i++)
        {
            if (i < id.length-1)
                System.out.print(ll_id.removeRear());
            else
                System.out.print(ll_id.removeFront());
        }
        System.out.println("\nID is Now : " + ll_id);
        System.out.println();

        System.out.println("ID in Reverse Order : ");
        for (int i = 0; i < id.length; i++)
        {
            ll_id.addRear(id[i]);
        }
        System.out.println("\nID is Now : " + ll_id);
        for (int i = 0; i < id.length; i++)
        {
            if (i < id.length-1)
                System.out.print(ll_id.removeRear());
            else
                System.out.print(ll_id.removeFront());
        }
        System.out.println("\nID is Now : " + ll_id);


        // To implement Clear Method
        System.out.println("\n\n*****Implement Clear Method!*****");
        for (int i = id.length-1; i >= 0; i--)
        {
            ll_id.addRear(id[id.length-1-i]);
        }
        System.out.println(ll_id.isEmpty()? "\nID LinkedList is Empty":"\nID LinkedList is NOT Empty");
        ll_id.clear();
        System.out.println(ll_id.isEmpty()? "ID LinkedList is Empty":"ID LinkedList is NOT Empty");

        for (int i = 0; i < name.length; i++)
        {
            ll_name.addRear(name[name.length-1-i]);
        }
        System.out.println(ll_name.isEmpty()? "\nName LinkedList is Empty":"\nName LinkedList is NOT Empty");
        ll_name.clear();
        System.out.println(ll_name.isEmpty()? "Name LinkedList is Empty":"Name LinkedList is NOT Empty");


        // To implement remove from index and add to index methods
        System.out.println("\n*****Implement add() and remove() methods!*****");
        for (int i = 0; i < name.length; i++)
        {
            ll_name.add(i, name[i]);
        }
        System.out.println(ll_name.isEmpty()? "\nName LinkedList is Empty":"\nName LinkedList is NOT Empty");
        for (int i = name.length-1; i >= 0; i--)
        {
            System.out.print(ll_name.remove(i));
        }
        System.out.println();
        System.out.println(ll_name.isEmpty()? "Name LinkedList is Empty":"Name LinkedList is NOT Empty");

        // To implement contains() method
        System.out.println("\n\nTo Implement contains() method!\n");
        for (int i = id.length-1; i >= 0; i--)
        {
            ll_id.addFront(id[id.length-1-i]);
        }
        for (int i = 0; i < id.length; i++)
        {
            if (ll_id.contains(i))
                System.out.println("ID contains "+ i);
            else
                System.out.println("ID does NOT contain "+ i);
        }
        for (int i = 0; i < id.length; i++)
        {
            if (i < id.length-1)
                System.out.print(ll_id.removeRear());
            else
                System.out.print(ll_id.removeFront());
        }
        System.out.println();

        // To implement get and size methods
        System.out.println("\nTo implement get and size methods : ");
        for (int i = 0; i < name.length; i++)
        {
            ll_name.add(i, name[i]);
        }
        System.out.println(ll_name.isEmpty()? "Name LinkedList is Empty":"Name LinkedList is NOT Empty");
        for (int i = 0; i < name.length; i++)
        {
            System.out.println("Element at " + i + " is " + ll_name.get(i));
        }
        System.out.println("The Size of the LinkedList is " + ll_name.size());
        for (int i = 65; i < 65+26; i++)
        {
            int index = ll_name.indexOf((char)i);
            if (index != -1)
            System.out.println("Index Of " + (char)i + " is " + index);
        }
        System.out.println();

        // Good Practice to clear data after use is completed
        System.out.println(ll_name);
        System.out.println(ll_id);
        ll_id.clear();
        ll_name.clear();
    }
}
