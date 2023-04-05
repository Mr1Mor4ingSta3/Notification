package in.sarthak.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button btnNotify,btnCancle;
    private NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        initViews();
        setupListener ();

    }

    private void setupListener () {
        btnNotify.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Notification notification = new NotificationCompat.Builder(MainActivity.this)
                                .setContentTitle("BitCode Updates")
                                .setContentText("You Got call From Google...!")
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setColor(Color.RED)
                                .


                    }
                }
        );
    }
    private void initViews () {
        btnNotify = findViewById(R.id.btnNotify);
        btnCancle = findViewById(R.id.btnCancle);

    }
}