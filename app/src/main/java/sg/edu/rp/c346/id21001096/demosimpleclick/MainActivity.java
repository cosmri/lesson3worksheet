package sg.edu.rp.c346.id21001096.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //create handles(variables)
    Button btnClickMe;
    EditText etInput;
    TextView tv;
    ToggleButton tgbtn;
    RadioGroup rgGender;




    @Override
    //method onCreate(Bundle savedInstanceState)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 bridge UI with controller
        btnClickMe = findViewById(R.id.btnClickMe);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tgbtn = findViewById(R.id.tgbtn);
        rgGender = findViewById(R.id.rgGender);


        //3 Set event
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set actions
                if (tgbtn.isChecked() == true) {
                    //grab input from EditText
                    //set to TextView
                    String data = etInput.getText().toString();
                    int selectedId = rgGender.getCheckedRadioButtonId();

                    if (selectedId == R.id.radioMale) {
                        tv.setText("He says " + data);
                    } else {
                        tv.setText("She says " + data);
                    }


                }


                tgbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (tgbtn.isChecked() == true) {
                            tv.setText("Enabled");
                        } else {
                            tv.setText("Disabled");
                        }
                    }


                });