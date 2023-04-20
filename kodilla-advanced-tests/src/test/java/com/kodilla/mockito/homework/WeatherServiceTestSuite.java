package com.kodilla.mockito.homework;

import com.kodilla.notification.Alert;
import com.kodilla.notification.Client;
import com.kodilla.notification.Location;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTestSuite {
    WeatherService service = new WeatherService();
    Notification notification = Mockito.mock(Notification.class);
    Alert alert = Mockito.mock(Alert.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Location warszawa = Mockito.mock(Location.class);
    Location kraków = Mockito.mock(Location.class);
    Location katowice = Mockito.mock(Location.class);

    @BeforeEach
    public void setup() {
        service.addLocation(warszawa);
        service.addLocation(kraków);
        service.addLocation(katowice);
    }
    @Test
    public void shouldAddClientToLocationAndStartSendingAlerts() {
        service.addClientToLocation(warszawa, client1);
        service.sendAlertToGivenLocation(warszawa, alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
    }
    @Test
    public void shouldNotSendAlertsToUnsubscribedClients() {
        service.addClientToLocation(warszawa, client1);
        service.sendAlertToGivenLocation(warszawa, alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.never()).receive(alert);
    }
    @Test
    public void shouldRemoveClientFromLocationAndStopSendingAlerts() {
        service.addClientToLocation(warszawa, client1);
        service.removeClientFromLocation(warszawa, client1);
        service.sendAlertToGivenLocation(warszawa, alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
    }
    @Test
    public void shouldRemoveClientFromAllLocations() {
        service.addClientToLocation(warszawa, client1);
        service.addClientToLocation(kraków, client1);
        service.addClientToLocation(katowice, client1);
        service.removeClientFromAllLocations(client1);
        Set<Client> expectedResult = service.findClient(client1);
        assertEquals(0, expectedResult.size());
    }

    @Test
    public void shouldSendNotificationToAllSubscribedClients() {
        service.addClientToLocation(warszawa, client1);
        service.addClientToLocation(kraków, client2);
        service.addClientToLocation(katowice, client3);
        service.sendNotificationToAllClients(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }
    @Test
    public void shouldRemoveLocationFromService() {
        service.removeLocation(warszawa);
        Set<Location> expectedResult = service.findLocation(warszawa);
        assertEquals(0, expectedResult.size());
    }
    @Test
    public void shouldRemoveLocationFromService_withException() {
        service.addClientToLocation(warszawa, client1);
        service.removeLocation(warszawa);
        assertThrows(NullPointerException.class, () -> service.sendAlertToGivenLocation(warszawa, alert));
    }
}