package meat.mountedwings.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import meat.mountedwings.org.activity.login_signUp.LoginCardOverlap;
import meat.mountedwings.org.activity.login_signUp.Login_SignUp;
import meat.mountedwings.org.activity.login_signUp.SMS_Verification;
import meat.mountedwings.org.activity.login_signUp.SignUp;
import meat.mountedwings.org.activity.main.home;
import meat.mountedwings.org.utils.Tools;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Tools.setSystemBarDisabled(this);
    }

    public void testing(View view) {
        startActivity(new Intent(getApplicationContext(), home.class));

    }
}
