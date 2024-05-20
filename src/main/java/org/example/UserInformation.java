package org.example;

public class UserInformation {
    private static int nextId = 1;
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String useEmail;
    private SubscribtionsInfo subscriptions;

    public UserInformation(String userFirstName, String userLastName, String useEmail, SubscribtionsInfo subscriptions) {
        this.userId = nextId++;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.useEmail = useEmail;
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "userFirstName=" + userFirstName +
                ", userLastName=" + userLastName +
                ", useEmail" + useEmail +
                ", subscriptions" + subscriptions.toString() +
                '}';
    }

    public static int getNextId() {
        return nextId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUseEmail() {
        return useEmail;
    }

    public SubscribtionsInfo getSubscriptions() {
        return subscriptions;
    }
}
