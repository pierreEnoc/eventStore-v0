package br.com.pierre.desafioeventstore;

import java.time.LocalDateTime;

public class Event {
    private String type;
    private LocalDateTime moment;

    public Event() {

    }

    public Event(String type, LocalDateTime moment) {
        this.type = type;
        this.moment = moment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
}
