package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView idText;
    private TextView nameText;
    private TextView kelasText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        idText = findViewById(R.id.text_id);
        nameText = findViewById(R.id.text_name);
        kelasText = findViewById(R.id.text_kelas);

        Bundle extras = getIntent().getExtras();

        int id = extras.getInt(BundleActivity.ID_KEY);
        String name = extras.getString(BundleActivity.NAME_KEY);
        String kelas = extras.getString(BundleActivity.KELAS_KEY);

        if (extras != null) {
            // TODO: display value here
            idText.setText(String.valueOf(id));
            nameText.setText(name);
            kelasText.setText(kelas);
        }
    }
}
