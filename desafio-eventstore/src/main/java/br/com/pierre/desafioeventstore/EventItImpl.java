package br.com.pierre.desafioeventstore;

import java.util.List;

public class EventItImpl implements EventIT {

    List<Event> events;
    Event current;

    int currentIndex = -1;

    public EventItImpl(List<Event> events) {
        this.events = events;
    }

    @Override
    public boolean moveNext() {
        if (events == null || events.isEmpty()) {
            return false;
        } else {
            if (currentIndex++ < events.size() -1) {
                current = events.get(currentIndex);
                return true;
            }else {
                return false;
            }
        }

    }

    @Override
    public Event current() {
        return this.current;
    }

    @Override
    public void remove() {
        if (current != null && !events.isEmpty()) {
            events.remove(currentIndex);
            this.current = null;
        }
    }

    @Override
    public void close() throws Exception {
        events =null;
    }
}
