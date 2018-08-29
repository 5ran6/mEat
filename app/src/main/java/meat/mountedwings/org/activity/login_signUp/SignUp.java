package meat.mountedwings.org.activity.login_signUp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import meat.mountedwings.org.R;
import meat.mountedwings.org.utils.Tools;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Tools.setSystemBarDisabled(this);
        setContentView(R.layout.activity_sign_up);
    }
}
