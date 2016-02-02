package cubebarn.com.emmanuel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity  implements View.OnClickListener{

   Button button2;
    EditText   editText1, editText2;
    TextView TVRegisterLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);


        editText1 =(EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        TVRegisterLink =(TextView) findViewById(R.id.TVRegisterLink);

        button2 = (Button) findViewById(R.id.button);

        button2.setOnClickListener(this);
        TVRegisterLink.setOnClickListener(this);

            }

    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.button:

                break;

            case R.id.TVRegisterLink:
                startActivity(new Intent(this, Register.class));
                break;

        }
    }
}
