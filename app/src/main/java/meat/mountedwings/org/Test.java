package meat.mountedwings.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import meat.mountedwings.org.activity.bottombarnavigationwithnavigationdrawer.MainActivity;
import meat.mountedwings.org.activity.main.home;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void testing(View view) {
        startActivity(new Intent(getApplicationContext(), home.class));

    }
}