package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Location;
import com.kodilla.notification.Notification;

import java.util.*;

public class WeatherService {
    private Map<Location, Set<Client>> clientsToLocations = new HashMap<>();

    public void addClientToLocation(Location location, Client client) {
        clientsToLocations.get(location).add(client);
    }
    public void removeClientFromLocation(Location location, Client client) {
        clientsToLocations.get(location).remove(client);
    }
    public void removeClient(Client client) {
        for (Set<Client> clients : clientsToLocations.values()) {
            clients.remove(client);
        }
    }
    public void sendNotificationToGivenLocation(Location location, Notification notification) {
        clientsToLocations.get(location).forEach(client -> client.receive(notification));
    }
    public void sendNotificationToAllClients() {

    }
    public void addLocation(Location location) {
        clientsToLocations.put(location, new HashSet<>());
    }
    public void removeLocation(Location location) {
        clientsToLocations.remove(location);
    }
}
