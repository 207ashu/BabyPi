package com.example.ashu.babypi;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseMsgingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        String title=remoteMessage.getNotification().getTitle();
        String body=remoteMessage.getNotification().getBody();

        MyNotificationManager.getMyInsatnce(getApplicationContext())
                .displayNotification(title,body);

    }
}
