import java.util.*;

public class Main {

    public static List<Person> generateClients(List<Person> list) {
        list.add(new Person("Kevin", "Mitnick", 3));
        list.add(new Person("Adrian", "Lamo", 2));
        list.add(new Person("Albert", "Gonzales", 5));
        list.add(new Person("Jeanson", "James", 4));
        list.add(new Person("Aaron", "Swartz", 7));
        return list;
    }

    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        Queue<Person> clients = new LinkedList<>(generateClients(list));

        while (!clients.isEmpty()) {
            Person unit = clients.poll();
            System.out.println("The " + unit + " visited the attraction " + unit.getTicket() + " left");
            unit.spendTicket();

            if (unit.getTicket() > 0) {
                clients.offer(unit);
            }
        }
    }
}
