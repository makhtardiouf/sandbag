package androdemo01.albouritech.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String inpMsg = "androdemo01.albouritech.com.Msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMsg(View v) {
        Intent it = new Intent(this, DisplayMsgAct.class);
        EditText txt = (EditText) findViewById(R.id.editText);
        String msg = txt.getText().toString();
        it.putExtra(inpMsg, msg);
        startActivity(it);

    }
}