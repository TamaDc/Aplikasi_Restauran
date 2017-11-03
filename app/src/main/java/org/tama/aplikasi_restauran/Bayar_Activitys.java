package org.tama.aplikasi_restauran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Bayar_Activitys extends AppCompatActivity {

    int Harga1,Harga2,Harga3,Harga4,Harga5,Harga6,Harga7,TotaLHarga;
    String Nama1,Nama2,Nama3,Nama4,Nama5,Nama6,Nama7,NamaTotal;
    String jml_gulai,jml_ayam,jml_iga,jml_mendoan,jml_spageti,jml_rujak,jml_esteh;
    TextView total1,total2,total3,total4,total5,total6,total7,totalTot;
    SharedPreferences sharedpreferences;
    public static final String preferences = "preference";
    public static final String menu1 = "";
    public static final String menu2 = "";
    public static final String menu3 = "";
    public static final String menu4 = "";
    public static final String menu5 = "";
    public static final String menu6 = "";
    public static final String menu7 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar_);
        sharedpreferences = getSharedPreferences(preferences, Context.MODE_PRIVATE);
        Intent gin = getIntent();
        Bundle b = gin.getExtras();
        if(b!=null){
            jml_gulai= (String) b.get("jumlah1");
            jml_ayam= (String) b.get("jumlah2");
            jml_iga= (String) b.get("jumlah3");
            jml_mendoan= (String) b.get("jumlah4");
            jml_spageti= (String) b.get("jumlah5");
            jml_rujak= (String) b.get("jumlah6");
            jml_esteh= (String) b.get("jumlah7");
        }
        ///
        total1= (TextView) findViewById(R.id.total1);
        total2= (TextView) findViewById(R.id.total2);
        total3= (TextView) findViewById(R.id.total3);
        total4= (TextView) findViewById(R.id.total4);
        total5= (TextView) findViewById(R.id.total5);
        total6= (TextView) findViewById(R.id.total6);
        total7= (TextView) findViewById(R.id.total7);
        totalTot= (TextView) findViewById(R.id.totalTotal);

        /// menjadikan interger
        Harga1= Integer.parseInt(jml_gulai) * Integer.parseInt(sharedpreferences.getString(menu1,menu1));
        Harga2= Integer.parseInt(jml_ayam) * Integer.parseInt(sharedpreferences.getString(menu2,menu2));
        Harga3= Integer.parseInt(jml_iga) * Integer.parseInt(sharedpreferences.getString(menu3,menu3));
        Harga4= Integer.parseInt(jml_mendoan) * Integer.parseInt(sharedpreferences.getString(menu4,menu4));
        Harga5= Integer.parseInt(jml_spageti) * Integer.parseInt(sharedpreferences.getString(menu5,menu5));
        Harga6= Integer.parseInt(jml_rujak) * Integer.parseInt(sharedpreferences.getString(menu6,menu6));
        Harga7= Integer.parseInt(jml_esteh) * Integer.parseInt(sharedpreferences.getString(menu7,menu7));

        /// jumlah dan harga dari setiap menu
        TotaLHarga=Harga1+Harga2+Harga3+Harga4+Harga5+Harga6+Harga7;

        /// merubah nilai int jadi string
        Nama1= String.valueOf(Harga1);
        Nama2= String.valueOf(Harga2);
        Nama3= String.valueOf(Harga3);
        Nama4= String.valueOf(Harga4);
        Nama5= String.valueOf(Harga5);
        Nama6= String.valueOf(Harga6);
        Nama7= String.valueOf(Harga7);
        NamaTotal= String.valueOf(TotaLHarga);

        /// menempatkan nilai pada bar struk total
        total1.setText(Nama1);
        total2.setText(Nama2);
        total3.setText(Nama3);
        total4.setText(Nama4);
        total5.setText(Nama5);
        total6.setText(Nama6);
        total7.setText(Nama7);
        totalTot.setText(NamaTotal);
    }

}
