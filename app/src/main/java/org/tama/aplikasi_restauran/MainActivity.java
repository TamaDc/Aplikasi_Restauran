package org.tama.aplikasi_restauran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //// penamaan
    String jumlah1;
    String jumlah2;
    String jumlah3;
    String jumlah4;
    String jumlah5;
    String jumlah6;
    String jumlah7;

    /// jumlah pesanan
    TextView jml_gulai,jml_ayam,jml_iga,jml_mendoan,jml_spageti,jml_rujak,jml_esteh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jml_gulai= (TextView) findViewById(R.id.jml_gulai);
        jml_ayam= (TextView) findViewById(R.id.jml_ayam);
        jml_iga= (TextView) findViewById(R.id.jml_iga);
        jml_mendoan= (TextView) findViewById(R.id.jml_mendoan);
        jml_spageti= (TextView) findViewById(R.id.jml_spageti);
        jml_rujak= (TextView) findViewById(R.id.jml_rujak);
        jml_esteh= (TextView) findViewById(R.id.jml_esteh);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setHarga){
            startActivity(new Intent(this, Setting_Activity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void doPesan(View view) {
        Intent it = new Intent(this, Bayar_Activitys.class);
        jumlah1=jml_gulai.getText().toString();
        jumlah2=jml_ayam.getText().toString();
        jumlah3=jml_iga.getText().toString();
        jumlah4=jml_mendoan.getText().toString();
        jumlah5=jml_spageti.getText().toString();
        jumlah6=jml_rujak.getText().toString();
        jumlah7=jml_esteh.getText().toString();


        it.putExtra("jumlah1",jumlah1);
        it.putExtra("jumlah2",jumlah2);
        it.putExtra("jumlah3",jumlah3);
        it.putExtra("jumlah4",jumlah4);
        it.putExtra("jumlah5",jumlah5);
        it.putExtra("jumlah6",jumlah6);
        it.putExtra("jumlah7",jumlah7);
        startActivity(it);
    }
}
