package meat.mountedwings.org.activity.login_signUp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import meat.mountedwings.org.R;
import meat.mountedwings.org.utils.Tools;

public class LoginCardOverlap extends AppCompatActivity {

    private View parent_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_card_number);
        Tools.setSystemBarDisabled(this);
        parent_view = findViewById(android.R.id.content);

        ((View) findViewById(R.id.sign_up)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Snackbar.make(parent_view, "Sign Up", Snackbar.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), Login_SignUp.class));
            }
        });
    }
}
