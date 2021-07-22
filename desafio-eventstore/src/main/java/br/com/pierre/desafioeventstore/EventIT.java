package br.com.pierre.desafioeventstore;

public interface EventIT extends AutoCloseable {
    boolean moveNext();
    Event current();
    void remove();
}