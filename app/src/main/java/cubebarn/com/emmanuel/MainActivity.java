package cubebarn.com.emmanuel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText ETFirst, ETSurname ;
    TextView TVRegisterLink;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);


        ETFirst = (EditText) findViewById(R.id.ETFirst);
        ETSurname = (EditText)findViewById(R.id.ETSurname);
        TVRegisterLink =(TextView)findViewById(R.id.TVRegisterLink);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
        TVRegisterLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.button:

        break;



    case R.id.TVRegisterLink:


        break;
}


    }
}
