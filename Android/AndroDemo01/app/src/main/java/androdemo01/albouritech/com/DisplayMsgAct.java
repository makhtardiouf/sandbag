package androdemo01.albouritech.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMsgAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);
        this.setTitle("A message was received");

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.inpMsg);

        // Capture the layout's TextView and set the string as its text
        TextView txtView = findViewById(R.id.textView);
        txtView.setText(msg);
    }
}
