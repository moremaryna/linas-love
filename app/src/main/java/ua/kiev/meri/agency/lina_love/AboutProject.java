package ua.kiev.meri.agency.lina_love;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by mary on 17/03/18.
 */

public class AboutProject extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_project);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_about_lina) {
            Intent share_intent = new Intent(getApplicationContext(), AboutLina.class);
            startActivity(share_intent);
            return true;
        } else if (id == R.id.menu_about_project) {
            Intent share_intent = new Intent(getApplicationContext(), AboutProject.class);
            startActivity(share_intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void agency_www (View view) {
        goToUrl ( "http://agency.meri.kiev.ua");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent WebView = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(WebView);
    }
}
