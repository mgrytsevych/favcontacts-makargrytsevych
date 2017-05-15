package makar.contacts_makargrytsevych;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call1, call2, call3;
    Button sms1, sms2, sms3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();
    }

    private void setupButtonClickEvents() {
        call1 = (Button) findViewById(R.id.button1Call);
        sms1 = (Button) findViewById(R.id.button1sms);

        call2 = (Button) findViewById(R.id.button2Call);
        sms2 = (Button) findViewById(R.id.button2sms);

        call3 = (Button) findViewById(R.id.button3Call);
        sms3 = (Button) findViewById(R.id.button3sms);

    /*
    * Call contact 1
     */
        call1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "+38(097)4049105"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });
    /*
    *
    *Send a sms to contact 1
    */
        sms1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: +38(097)4049105"));
                sendIntent.putExtra("sms_body", "Привіт!");
                startActivity(sendIntent);
            }
        });


    //Call contact 2

        call2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "+38(067)673553"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });
    /*
    *
    *Send a sms to contact 2
    */
        sms2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: +38(067)673553"));
                sendIntent.putExtra("sms_body", "Привіт!");
                startActivity(sendIntent);
            }
        });

        /*
        * Call contact 3
        */
        call3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "+38(067)673554"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });
    /*
    *
    *Send a sms to contact 3
    */
        sms3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: +38(067)673554"));
                sendIntent.putExtra("sms_body", "Привіт!");
                startActivity(sendIntent);
            }
        });

    }

}
