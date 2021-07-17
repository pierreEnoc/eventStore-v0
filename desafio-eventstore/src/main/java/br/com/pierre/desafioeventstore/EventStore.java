package br.com.pierre.desafioeventstore;

import com.sun.jdi.event.EventIterator;

import java.time.LocalDateTime;
import java.util.List;

public interface EventStore {
    void insert(Event event);
    void removeAll(String type);

    EventIterator query(String type, LocalDateTime startTime, LocalDateTime endTime);

    List<Event> getEvents();
}
