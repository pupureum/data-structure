public class Main {
    public static void main(String[] args) {

        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addFirst(5);
        numbers.add(1, 7);
        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
        numbers.remove(0);

        LinkedList.ListIterator i = numbers.listIterator();
        LinkedList.ListIterator t = numbers.listIterator();
        while(t.hasNext()){
            if((int)t.next() == 20){
                t.remove();
            }
        }
        System.out.println(numbers);

        i.add(5);
        i.next();
        i.add(15);
        System.out.println(numbers);
    }
}