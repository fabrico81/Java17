package section10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d km)", name, distance);
    }

}

public class LinkedListChallenge {

    public static void main(String[] args) {

        LinkedList<Place> placeToVisit = new LinkedList<>();

        addPlace(placeToVisit, new Place("Perth", 3923));
        addPlace(placeToVisit, new Place("Darwin", 3972));
        addPlace(placeToVisit, new Place("Brisbane", 917));
        addPlace(placeToVisit, new Place("Adelaide", 1374));
        addPlace(placeToVisit, new Place("Alice Spring", 2771));
        addPlace(placeToVisit, new Place("Melbourne", 877));

        placeToVisit.addFirst(new Place("Sidney", 0));
        printMenu();

        ListIterator<Place> it = placeToVisit.listIterator();

        boolean stopIt = true;
        Scanner scanner = new Scanner(System.in);
        while (stopIt) {
            switch (scanner.nextLine()) {

                case "F" -> {
                    if (it.hasNext()) {
                        System.out.println("Moved Forward To:" + it.next());
                    }
                }
                case "B" -> {
                    if (it.hasPrevious()) {
                        System.out.println("Moved Backward" + it.previous());
                    } else {
                        System.out.println("You are in Sidney");
                    }
                }
                case "L" -> {
                    System.out.println("List the town /n" + placeToVisit );
                }
                case "M" -> {
                    System.out.println("Menu");
                    printMenu();
                }

                default -> stopIt = false;
            }
        }


    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Duplicate Found: " + place);
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Duplicate found: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (Place listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                 
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
        System.out.print(": ");
    }
}
