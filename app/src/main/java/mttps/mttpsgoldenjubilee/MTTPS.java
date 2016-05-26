package mttps.mttpsgoldenjubilee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MTTPS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mttps);

        /*final Button bMemReg = (Button) findViewById(R.id.bMemReg);
        final Button bGallery = (Button) findViewById(R.id.bGallery);
        final Button bCalendar = (Button) findViewById(R.id.bCalendar);
        final Button bFinance = (Button) findViewById(R.id.bFinance);*/
        }
    public void memReg(View view){
        Intent act1 = new Intent(this.registration.class);
        act1(act1);
    }
}
