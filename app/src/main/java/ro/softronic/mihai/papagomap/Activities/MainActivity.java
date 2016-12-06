package ro.softronic.mihai.papagomap.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

import ro.softronic.mihai.papagomap.R;

public class MainActivity extends AppCompatActivity {
    final static String infoTopicName = "deliver-user_1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic(infoTopicName);
    }

}
