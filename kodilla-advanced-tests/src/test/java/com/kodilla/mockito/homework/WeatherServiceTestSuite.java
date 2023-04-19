package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Location;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTestSuite {
    WeatherService service = new WeatherService();
    Notification notification = Mockito.mock(Notification.class);
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
    public void shouldAddClientToLocationAndSendNotification() {
        service.addClientToLocation(warszawa, client1);
        service.sendNotificationToGivenLocation(warszawa, notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldNotSendNotificationsToUnsubscribedClients() {
        service.addClientToLocation(warszawa, client1);
        service.sendNotificationToGivenLocation(warszawa, notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
    }
    @Test
    public void shouldRemoveClientFromLocationAndStopSendingNotifications() {
        service.addClientToLocation(warszawa, client1);
        service.removeClientFromLocation(warszawa, client1);
        service.sendNotificationToGivenLocation(warszawa, notification);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

}