package com.kodilla.mockito.homework;

import com.kodilla.notification.Alert;
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
    public void removeClientFromAllLocations(Client client) {
        for (Set<Client> clients : clientsToLocations.values()) {
            clients.remove(client);
        }
    }
    public void sendAlertToGivenLocation(Location location, Alert alert) {
        clientsToLocations.get(location).forEach(client -> client.receive(alert));
    }
    public void sendNotificationToAllClients(Notification notification) {
        for (Map.Entry<Location, Set<Client>> entry : clientsToLocations.entrySet()) {
            entry.getValue().forEach(client -> client.receive(notification));
        }
    }
    public void addLocation(Location location) {

        clientsToLocations.put(location, new HashSet<>());
    }
    public void removeLocation(Location location) {

        clientsToLocations.remove(location);
    }
    public Set<Location> findLocation(Location location) {
        Set<Location> result = new HashSet<>();
        for (Map.Entry<Location, Set<Client>> entry : clientsToLocations.entrySet()) {
            if (clientsToLocations.containsKey (location))
                result.add(location);
        }
        return result;
    }
    public Set<Client> findClient(Client client) {
        Set<Client> result = new HashSet<>();
        for (Map.Entry<Location, Set<Client>> entry : clientsToLocations.entrySet()) {
            if (clientsToLocations.containsKey (client))
                result.add(client);
        }
        return result;
    }
}
