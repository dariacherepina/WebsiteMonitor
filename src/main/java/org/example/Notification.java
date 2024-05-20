package org.example;

public class Notification {
    private String communicationChannel;
    private int frequencyProWeek;

    public Notification(String communicationChannel,  int frequencyProWeek) {
        this.communicationChannel = communicationChannel;
        this.frequencyProWeek = frequencyProWeek;
    }


    private enum notificationContent{
    }
    public void sendNotification(){}
    @Override
    public String toString() {
        return "Notification{" +
                "communicationChannel=" + communicationChannel +
                ", frequencyProWeek=" + frequencyProWeek +
                '}';
    }

}
