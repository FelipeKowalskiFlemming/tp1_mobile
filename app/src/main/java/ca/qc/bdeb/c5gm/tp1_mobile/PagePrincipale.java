package ca.qc.bdeb.c5gm.tp1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PagePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_principale);
    }


    public void onClickConnecter(View view) {
        startActivity(new Intent(PagePrincipale.this, PageEntreprises.class));
    }
}