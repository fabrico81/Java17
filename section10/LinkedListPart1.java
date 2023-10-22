package section10;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPart1 {

    public static void main(String[] args) {
        //LinkedList<String> placeToVisit = new LinkedList<>();
        System.out.println("****LinkedList****"+"\t");
        var placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        System.out.println("Add: " + placeToVisit);
        placeToVisit.add(0, "Melbourne");
        System.out.println("Add at index 0: " + placeToVisit);
        System.out.println(placeToVisit);
        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
       // gettingElements(placeToVisit);
        //printItinerary2(placeToVisit);

    //    testIterator(placeToVisit);
        testListIterator(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> placeToVisit) {
        placeToVisit.addFirst("Brisbane");
        placeToVisit.addLast("Perth");
        System.out.println("Add First, Add Last: " + placeToVisit);
        //Queue methods
        placeToVisit.offer("Adelaide");
        System.out.println("Offer: " + placeToVisit);
        placeToVisit.offerFirst("Darwin");
        placeToVisit.offerLast("Hobart");
        System.out.println("Offer First, Offer Last: " + placeToVisit);
        //STACK methods
        placeToVisit.push("Alice Springs");
        System.out.println("****Stack****");
        System.out.println("Push: " + placeToVisit);
    }
    private static void removeElements(LinkedList<String> placeToVisit) {
        String s1 = placeToVisit.remove(4);
        System.out.println("Removed index 4: " + s1);
        String s2 = String.valueOf(placeToVisit.remove("Brisbane"));
        System.out.println("Removed Brisbane: " + s2);
        String s3 =   placeToVisit.removeFirst();
        System.out.println("Removed first: " + s3);
        String s4 = placeToVisit.removeLast();
        System.out.println("Removed last: " + s4);

        //Queue/Drueque methods
        System.out.println("****Queue/Deque****");

        String s5 = placeToVisit.poll();
        System.out.println("Poll: " + s5);
        String s6 = placeToVisit.pollFirst();
        System.out.println("Poll First: " + s6);
        String s7 = placeToVisit.pollLast();
        System.out.println("Poll Last: " + s7);
        String s8 = placeToVisit.pop();
        System.out.println("Pop: " + s8);
    }

    private static void gettingElements(LinkedList<String> placeToVisit) {
        System.out.println("****Stack methods*****");
        String s1 = placeToVisit.peek();
        System.out.println("Peek: " + s1);

        String s2 = placeToVisit.peekFirst();
        System.out.println("Peek First: " + s2);

        String s3 = placeToVisit.peekLast();
        System.out.println("Peek Last: " + s3);
        System.out.println("****Queue methods*****");
        String s4 = placeToVisit.element();
        System.out.println("Element: " + s4);

        System.out.println(placeToVisit);
    }

    public static void printItinerary(LinkedList<String> itinerary) {
        System.out.println("****Itinerary****");
       for (int i = 1; i < itinerary.size(); i++) {
           System.out.println("Now visiting TO: " + itinerary.get(i -1) + " FROM: " + itinerary.get(i));
       }
        System.out.println("****Itinerary****");
    }

    public static void printItinerary2(LinkedList<String> itinerary) {
        System.out.println("****Itinerary****");
        String previous = itinerary.getFirst();
        for (String s : itinerary) {
            System.out.println("Now visiting TO: " + previous + " FROM: " + s);
            previous = s;
        }
        System.out.println("****Itinerary****");
    }

    public static void printItinerary3(LinkedList<String> itinerary) {
        System.out.println("****Itinerary****");
        String previous = itinerary.getFirst();
        ListIterator<String> listIterator = itinerary.listIterator(1);
       while(listIterator.hasNext()){
              String next = listIterator.next();
              System.out.println("Now visiting TO: " + previous + " FROM: " + next);
              previous = next;
       }
        System.out.println("****Itinerary****");
    }

    private static void testIterator(LinkedList<String> itinerary) {
        var iterator = itinerary.iterator();
        System.out.println("****Iterator****");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(itinerary);
    }

    private static void testListIterator(LinkedList<String> itinerary) {
        var iterator = itinerary.listIterator();
        System.out.println("****ListIterator****");
        System.out.println(itinerary);
        while (iterator.hasNext()) {
            if(iterator.next() == "Melbourne") {
                iterator.add("Canberra");
            }
        }
        while (iterator.hasNext()){
            System.out.println("NEXT: "+iterator.next());
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(itinerary);
    }
}
