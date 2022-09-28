import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myNumbers = new MyLinkedList();
        LinkedList  numbers = new LinkedList();

        addTest(numbers, myNumbers);
        removeTest(numbers, myNumbers);
        iteratorTest(numbers, myNumbers);
    }
    static void print(LinkedList numbers, MyLinkedList myNumbers){
        System.out.println("-------------LinkedList---------------");
        System.out.println(numbers);
        System.out.println("-------------MyLinkedList-------------");
        System.out.println(myNumbers);
        System.out.println();
    }
    static void addTest(LinkedList numbers, MyLinkedList myNumbers){
        System.out.println("<addLast(1)>\n<addLast(2)>");
        numbers.addLast( 1);
        numbers.addLast( 2);
        myNumbers.addLast(1);
        myNumbers.addLast(2);
        print(numbers, myNumbers);

        System.out.println("<addFirst(0)>");
        numbers.addFirst( 0);
        myNumbers.addFirst(0);
        print(numbers, myNumbers);

        System.out.println("<add(index: 3, element: 3)>");
        numbers.add( 3, 3);
        myNumbers.add(3, 3);
        print(numbers, myNumbers);

        System.out.println("<addFirst(\"start\")>");
        numbers.addFirst("start");
        myNumbers.addFirst("start");
        print(numbers, myNumbers);

        System.out.println("<addLast(\"end\")>");
        numbers.addLast("end");
        myNumbers.addLast("end");
        print(numbers, myNumbers);
    }
    static void removeTest(LinkedList numbers, MyLinkedList myNumbers){
        System.out.println("<remove(index: 1)>");
        numbers.remove(1);
        myNumbers.remove(1);
        print(numbers, myNumbers);

        System.out.println("<removeFirst()>");
        numbers.removeFirst();
        myNumbers.removeFirst();
        print(numbers, myNumbers);

        System.out.println("<removeLast()>");
        numbers.removeLast();
        myNumbers.removeLast();
        print(numbers, myNumbers);
    }
    static void iteratorTest(LinkedList numbers, MyLinkedList myNumbers){
        ListIterator iter = numbers.listIterator();
        MyLinkedList.ListIterator myIter = myNumbers.listIterator();

        System.out.println("<iterator add(\"iter\")>");
        iter.add("iter");
        myIter.add("iter");
        print(numbers, myNumbers);

        System.out.println("<iterator next()");
        System.out.println("-------------LinkedList---------------");
        System.out.println(iter.next());
        System.out.println("-------------MyLinkedList-------------");
        System.out.println(myIter.next());
        System.out.println();

        System.out.println("<iterator hasNext()>");
        System.out.println("-------------LinkedList---------------");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-------------MyLinkedList-------------");
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }
        System.out.println();

        System.out.println("<iterator find 2 and remove()");
        System.out.println("before:");
        print(numbers, myNumbers);
        ListIterator iter2 = numbers.listIterator();
        MyLinkedList.ListIterator myIter2 = myNumbers.listIterator();
        iter2.next();
        myIter2.next();
        while(iter2.hasNext()){
            if((int)iter2.next() == 2){
                iter2.remove();
            }
        }
        while(myIter2.hasNext()){
            if((int)myIter2.next() == 2){
                myIter2.remove();
            }
        }
        System.out.println("after:");
        print(numbers, myNumbers);
    }
}