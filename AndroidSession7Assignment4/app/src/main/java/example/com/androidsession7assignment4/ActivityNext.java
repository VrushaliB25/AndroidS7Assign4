package example.com.androidsession7assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by HPWorld on 5/11/2017.
 */

public class ActivityNext extends AppCompatActivity {
    TextView txName;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Method for an Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitynext);         // Passing Layout
        txName = (TextView) findViewById(R.id.textView3);

        Intent i = getIntent();
        String display = "Welcome " + i.getExtras().getString("BundleName"); //receiving e-mail
        txName.setText(display);
    }
}