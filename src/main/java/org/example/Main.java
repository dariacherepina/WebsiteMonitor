package org.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        Map<Website, Notification> notificationMap = new HashMap<>();
        System.out.println("If you want to exit write exit!");

        System.out.println("Enter Website Name you want to monitor: ");
        String websiteName = scanner.nextLine();
        System.out.println("Enter website URL you want to monitor: ");
        String websiteUrl = scanner.nextLine();
        Website UserWebsite = new Website(websiteName, websiteUrl);

        while (true) {
            System.out.println("Enter notification channel you want to use for this website: ");
            String notificationChannel = scanner.nextLine();
            if (notificationChannel.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter how oft do you want to check Website for updates: ");
            int notificationFrequency = 0;
            try {
                notificationFrequency = scanner.nextInt();
            }catch (InputMismatchException e){
                if (Integer.toString(notificationFrequency).equalsIgnoreCase("exit")) {
                    break;
                }
            }

            
            Notification UserNotification = new Notification(notificationChannel, notificationFrequency);
            notificationMap.put(UserWebsite, UserNotification);
        }
        SubscribtionsInfo UserSub = new SubscribtionsInfo(notificationMap);
        UserInformation User = new UserInformation(firstName, lastName, email, UserSub);
        System.out.println(User.getUserId());
        System.out.println(User.toString());
    }
}