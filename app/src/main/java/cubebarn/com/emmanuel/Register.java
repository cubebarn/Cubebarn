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

public class Register extends AppCompatActivity  implements View.OnClickListener{


    Button buttonRegister;
    EditText ETFirst, ETSurname, ETPhone,textEmailAddress ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);

        ETFirst = (EditText) findViewById(R.id.ETFirst);
        ETSurname = (EditText)findViewById(R.id.ETSurname);
        ETPhone =(EditText) findViewById(R.id.ETPhone);
        textEmailAddress =(EditText) findViewById(R.id.ETtextEmailAddress);

        buttonRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonRegister:
                startActivity(new Intent(this, Login.class));
                break;
        }

    }
}
