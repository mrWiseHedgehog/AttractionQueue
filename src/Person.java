public class Person {
    protected String name;
    protected String lastName;
    protected int ticket;

    public Person(String name, String lastname, int ticket) {
        this.name = name;
        this.lastName = lastname;
        this.ticket = ticket;
    }

    public Person(String name) {
        this.name = name;
        this.lastName = this.lastName;
        this.ticket = this.ticket;
    }

    public String toString() {
        return this.name + " " + this.lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public void setName(int ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastName;
    }

    public int getTicket() {
        return this.ticket;
    }
}
