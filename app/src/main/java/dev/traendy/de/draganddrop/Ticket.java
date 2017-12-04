package dev.traendy.de.draganddrop;

/**
 * Created by speters on 01.12.17.
 */

class Ticket {
    private int id;
    private String title;
    private Priority priority = Priority.LOW;
    private int estimated_time = 0;
    private int needed_time = 0;
    private Type type;

    public Ticket(int id, String name, Type type, Priority priority, int estimated_time) {
        this.id = id;
        this.title = name;
        this.priority = priority;
        this.estimated_time = estimated_time;
        this.type = type;
    }

    public Ticket(Ticket ticket) {
        this.id = ticket.id;
        this.title = ticket.title;
        this.priority = ticket.priority;
        this.estimated_time = ticket.estimated_time;
        this.type = ticket.type;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public int getEstimated_time() {
        return estimated_time;
    }

    public void setEstimated_time(int estimated_time) {
        this.estimated_time = estimated_time;
    }

    public int getNeeded_time() {
        return needed_time;
    }

    public void setNeeded_time(int needed_time) {
        this.needed_time = needed_time;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}