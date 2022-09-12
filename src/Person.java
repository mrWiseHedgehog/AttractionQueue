public class Person<ticket> {
    private String name;
    private String lastName;
    private int ticket;

    public Person(String name, String lastname, int ticket) {
        this.name = name;
        this.lastName = lastname;
        this.ticket = ticket;
    }

    public String toString() {
        return this.name + " " + this.lastName;
    }

    public int getTicket() {
        return this.ticket;
    }

    public void spendTicket() {
        ticket--;
    }
}
