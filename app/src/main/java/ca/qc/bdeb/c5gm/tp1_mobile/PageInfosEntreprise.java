package ca.qc.bdeb.c5gm.tp1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageInfosEntreprise extends AppCompatActivity {

    private EditText etContact;
    private EditText etCourriel;
    private EditText etTelephone;
    private EditText etAdresse;
    private EditText etSiteWeb;
    private EditText etVille;
    private EditText etCodePostal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_infos_entreprise);

        etContact = findViewById(R.id.Contact);
        etCourriel = findViewById(R.id.Courriel);
        etTelephone = findViewById(R.id.telephone);
        etAdresse = findViewById(R.id.Adresse);
        etSiteWeb = findViewById(R.id.SiteWeb);
        etVille = findViewById(R.id.Ville);
        etCodePostal = findViewById(R.id.CodePostal);

        Intent message = getIntent();


    }
}
