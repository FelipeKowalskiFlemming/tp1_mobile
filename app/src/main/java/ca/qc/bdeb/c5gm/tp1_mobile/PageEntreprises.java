package ca.qc.bdeb.c5gm.tp1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class PageEntreprises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_entreprises);
    }


    public void onClickDeconnecter(View view) {
        startActivity(new Intent(PageEntreprises.this, PagePrincipale.class));
    }

    public void onClickAjouterEntreprise(View view) {
        startActivity(new Intent(PageEntreprises.this, PageInfosEntreprise.class));
    }

    public void onClickVoirCarte(View view){
        startActivity(new Intent(PageEntreprises.this, MapsActivity.class));
    }
}