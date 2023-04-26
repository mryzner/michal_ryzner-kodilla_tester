package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
        //application.processMessage("Test message", null);
    }
}
