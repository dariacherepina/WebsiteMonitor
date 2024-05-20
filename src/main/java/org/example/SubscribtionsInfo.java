package org.example;

import java.util.ArrayList;
import java.util.Map;

public class SubscribtionsInfo {
    private Map<Website ,Notification> notificatonWebsite;

    public SubscribtionsInfo(Map<Website ,Notification> notificatonWebsite) {
        this.notificatonWebsite = notificatonWebsite;
    }

    @Override
    public String toString(){
        String result = null;
        for(Map.Entry<Website, Notification> entry : notificatonWebsite.entrySet()){
            result = "SubscribtionsInfo{ " +
                    "Website " + entry.getKey().toString() +
                    "Notification " + entry.getValue().toString() +
                    "}";
        }
        return result;
    }

    public void addSubscribtion (Website website, ArrayList<String> preferredUrls){}
    public void cancelSubscribtion(Website website){}
    public boolean registerForUpdates(Website wesite, Map<Notification, Website> notificatonPreferrence){
        return true;
    }
    public void changeNotificatonPreferrence(Map<Notification , Website> notificatonPreferrence){}
    public boolean weeklyCheck(Website website){
        return true;
    }
}
