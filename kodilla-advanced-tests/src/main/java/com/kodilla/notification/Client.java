package com.kodilla.notification;

public interface Client {
    void receive(Notification notification);
    void receive(Alert alert);
}
