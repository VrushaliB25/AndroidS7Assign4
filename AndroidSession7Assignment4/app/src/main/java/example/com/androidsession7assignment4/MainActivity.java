package example.com.androidsession7assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bLogin;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bLogin = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.editText1);


        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityNext.class);
                Bundle bundle = new Bundle();                                   //creating bundle instance
                bundle.putString("BundleName", email.getText().toString().trim()); //passing using bundle
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}
