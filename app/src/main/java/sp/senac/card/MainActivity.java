package sp.senac.card;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBarMenuapp);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mMusicas:
                Intent startmusica = new Intent(MainActivity.this, musica.class);
                startActivity(startmusica);

            case R.id.mMoeda:
                Intent startmoeda = new Intent(MainActivity.this, Moeda.class);
                startActivity(startmoeda);

            case R.id.mFrutas:
                Intent startfrutas = new Intent(MainActivity.this, Frutas.class);
                startActivity(startfrutas);

            case R.id.mTempo:
                Intent starttempo = new Intent(MainActivity.this, Tempo.class);
                startActivity(starttempo);

            case R.id.mNoticias:
                Intent startnoticias = new Intent(MainActivity.this, Noticias.class);
                startActivity(startnoticias);

            case R.id.mCards:
                Intent startcards = new Intent(MainActivity.this, Cards.class);
                startActivity(startcards);

            case R.id.mFotos:
                Intent startfotos = new Intent(MainActivity.this, Fotos.class);
                startActivity(startfotos);

        }
        return super.onOptionsItemSelected(item);
    }
}
