import java.util.*;

public class Main {
    public Main() {
    }

    public static List<Person> generateClients(List<Person> list) {
        list.add(new Person("Kevin", "Mitnick", 3));
        list.add(new Person("Adrian", "Lamo", 2));
        list.add(new Person("Albert", "Gonzales", 5));
        list.add(new Person("Jeanson", "James", 4));
        list.add(new Person("Aaron", "Swartz", 7));
        return list;
    }

    public static void main(String[] args) {
        List<Person> list = new LinkedList();
        Deque<Person> clients = new ArrayDeque(generateClients(list));

        while(!clients.isEmpty()) {
            Person unit = (Person)clients.poll();
            --unit.ticket;
            System.out.println("The " + unit + " visited the attraction " + unit.ticket + " left");
            if (unit.ticket != 0) {
                clients.offer(unit);
            }
        }

    }
}
