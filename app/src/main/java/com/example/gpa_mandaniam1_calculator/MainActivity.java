package com.example.gpa_mandaniam1_calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText v1,v2,v3,v4,v5;
    TextView t;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.b);
        v1=findViewById(R.id.v1);
        v2=(EditText)findViewById(R.id.v2);
        v3=(EditText)findViewById(R.id.v3);
        v4=(EditText)findViewById(R.id.v4);
        v5=(EditText)findViewById(R.id.v5);
        t=(TextView)findViewById(R.id.t);
        t.setBackgroundColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                float g1, g2, g3, g4, g5;
                if (count % 2 == 0) {
                    if (v1.getText().toString().equals("") || v2.getText().toString().equals("") || v3.getText().toString().equals("") || v4.getText().toString().equals("") || v5.getText().toString().equals("")) {
                        t.setText("Enter values/grades in all fields");
                    }
                    else {
                        g1 = Float.parseFloat(v1.getText().toString());
                        g2 = Float.parseFloat(v2.getText().toString());
                        g3 = Float.parseFloat(v3.getText().toString());
                        g4 = Float.parseFloat(v4.getText().toString());
                        g5 = Float.parseFloat(v5.getText().toString());
                        float avg = g1 + g2 + g3 + g4 + g5;
                        avg = avg / 5;
                        if (avg < 60) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.RED);
                        } else if (avg > 60 && avg < 80) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.YELLOW);
                        } else if (avg >= 80 && avg <= 100) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        b.setText("Clear");
                    }

                }
                else
                {
                    v1.setText("");
                    v2.setText("");
                    v3.setText("");
                    v4.setText("");
                    v5.setText("");
                    t.setText("");
                    b.setText("Compute GPA");
                    t.setBackgroundColor(Color.WHITE);
                    count++;
        }
    }
});
    }
}

