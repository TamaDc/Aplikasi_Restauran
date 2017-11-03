package org.tama.aplikasi_restauran;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Setting_Activity extends AppCompatActivity {

    EditText harga1,harga2,harga3,harga4,harga5,harga6,harga7;

    Button b1;

    public static final String preferences = "preference";
    public static final String menu1 = "";
    public static final String menu2 = "";
    public static final String menu3 = "";
    public static final String menu4 = "";
    public static final String menu5 = "";
    public static final String menu6 = "";
    public static final String menu7 = "";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        harga1= (EditText) findViewById(R.id.harga_gulai);
        harga2= (EditText) findViewById(R.id.harga_ayam);
        harga3= (EditText) findViewById(R.id.harga_iga);
        harga4= (EditText) findViewById(R.id.harga_mendoan);
        harga5= (EditText) findViewById(R.id.harga_spageti);
        harga6= (EditText) findViewById(R.id.harga_rujak);
        harga7= (EditText) findViewById(R.id.harga_esteh);


        b1= (Button) findViewById(R.id.simpanButton);
        sharedpreferences = getSharedPreferences(preferences, Context.MODE_PRIVATE);
        Tampil();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f1 = harga1.getText().toString();
                String f2 = harga2.getText().toString();
                String f3 = harga3.getText().toString();
                String f4 = harga4.getText().toString();
                String f5 = harga5.getText().toString();
                String f6 = harga6.getText().toString();
                String f7 = harga7.getText().toString();


                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(menu1,f1);
                editor.putString(menu2,f2);
                editor.putString(menu3,f3);
                editor.putString(menu4,f4);
                editor.putString(menu5,f5);
                editor.putString(menu6,f6);
                editor.putString(menu7,f7);
                editor.commit();
                Toast.makeText(Setting_Activity.this, "Saved!", Toast.LENGTH_SHORT).show();
                Tampil();
            }
        });
    }
    void Tampil(){
        harga1.setText(sharedpreferences.getString(menu1,menu1));
        harga2.setText(sharedpreferences.getString(menu2,menu2));
        harga3.setText(sharedpreferences.getString(menu3,menu3));
        harga4.setText(sharedpreferences.getString(menu4,menu4));
        harga5.setText(sharedpreferences.getString(menu5,menu5));
        harga6.setText(sharedpreferences.getString(menu6,menu6));
        harga7.setText(sharedpreferences.getString(menu7,menu7));
    }
}
