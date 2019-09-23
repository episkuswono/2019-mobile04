package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BundleActivity extends AppCompatActivity {

    public static final String ID_KEY = "id";
    public static final String NAME_KEY = "name";
    public static final String KELAS_KEY = "kelas";

    private EditText idInput;
    private EditText nameInput;
    private EditText kelasInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        idInput = findViewById(R.id.input_id);
        nameInput = findViewById(R.id.input_name);
        kelasInput = findViewById(R.id.input_kelas);
    }

    public void handleBundleSubmit(View view) {
        int id = Integer.parseInt((idInput.getText().toString()));
        String name = nameInput.getText().toString();
        String kelas = kelasInput.getText().toString();

        Intent intent = new Intent(this, ProfileBundleActivity.class);

        intent.putExtra(ID_KEY, id);
        intent.putExtra(NAME_KEY, name);
        intent.putExtra(KELAS_KEY, kelas);
        startActivity(intent);
    }
}
