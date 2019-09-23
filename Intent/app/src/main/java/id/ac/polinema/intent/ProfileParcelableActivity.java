package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.Siswa;

public class ProfileParcelableActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        Bundle extras = getIntent().getExtras();



        if (extras != null) {

            Siswa u = extras.getParcelable("user");
            // TODO: display value here

        }
    }
}
