package celik.alpay.buton_goster;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private BilgiDeposu mBilgiDeposu = new BilgiDeposu();
    private Renkler mRenkler = new Renkler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView bilgiLabel = (TextView)findViewById(R.id.bilgiTextView);
        final Button bilgiGosterButton = (Button)findViewById(R.id.bilgiButton);
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bilgi = mBilgiDeposu.getBilgi();
                // burada label güncelleniyor.
                bilgiLabel.setText(bilgi);
                int renk = mRenkler.getRenk();
                constraintLayout.setBackgroundColor(renk);
                bilgiGosterButton.setTextColor(renk);
                // mBilgiDeposu.mBilgiler[0] = "Siberakademi.net bir harika";
            }
        };

        bilgiGosterButton.setOnClickListener(listener);

        Toast.makeText(this, "Güzel bir android uygulaması", Toast.LENGTH_LONG).show();

        Log.d("MainActivity", "Güzel bir android uygulaması");
    }
}
