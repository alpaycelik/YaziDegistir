package celik.alpay.buton_goster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView bilgiLabel = (TextView)findViewById(R.id.bilgiTextView);
        Button bilgiGosterButton = (Button)findViewById(R.id.bilgiButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Butona tıkladığımızda yazıyı bu bölümde değiştiriyoruz.
                String bilgi = "Uçak saniyede 50m gider";
                bilgiLabel.setText(bilgi);
            }
        };

        bilgiGosterButton.setOnClickListener(listener);
    }
}
