package ac.id.atmaluhur.mhs.vallereyoscar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText nilai1;
    EditText nilai2;
    EditText nilai3;
    EditText nilai4;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        nilai3 = findViewById(R.id.nilai3);
        nilai4 = findViewById(R.id.nilai4);
        hasil = findViewById(R.id.hasil);
    }

    @SuppressLint("SetTextI18n")
    public void hitung (View View){
        int absen = Integer.parseInt(nilai1.getText().toString());
        int tugas = Integer.parseInt(nilai2.getText().toString());
        int uts = Integer.parseInt(nilai3.getText().toString());
        int uas = Integer.parseInt(nilai4.getText().toString());
        double a = absen * 0.1;
        double b = tugas * 0.2;
        double c = uts * 0.3;
        double d = uas * 0.4;
        double f = a + b + c + d;
        hasil.setText("Hasil = "+f);



    }
}