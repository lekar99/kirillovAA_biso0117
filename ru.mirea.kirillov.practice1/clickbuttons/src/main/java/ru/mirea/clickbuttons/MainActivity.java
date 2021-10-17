package ru.mirea.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOK;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        View.OnClickListener OK = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("OK");
            }
        };
        buttonOK.setOnClickListener(OK);

    }

    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Ещё способ", Toast.LENGTH_SHORT).show();
    }
}
