package ua.kiev.meri.agency.lina_love;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//hide toolbar
        //getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        //getSupportActionBar().hide();

        setContentView(R.layout.activity_main);


        VideoView videoview = (VideoView) findViewById(R.id.videoview);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.linavideo);

        videoview.setVideoURI(uri);
        videoview.start();

        Button button = (Button) findViewById(R.id.button_continue);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PoemsTexts();
            }
        });

        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp)
            {
                PoemsTexts();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    //public void youtube_www (View view) {
    //    goToUrl ( "https://www.youtube.com/watch?v=LjyUlBVkJEo");
   // }

   // private void goToUrl (String url) {
   //     Uri uriUrl = Uri.parse(url);
    //    Intent WebView = new Intent(Intent.ACTION_VIEW, uriUrl);
     //   startActivity(WebView);
    //}

    public void PoemsTexts(){
        Intent intent = new Intent(this, FragmentsAll.class);
        //attempt to show toolbar
        // ActionBar actionBar = getActionBar();
        // setContentView(R.layout.fragment_poems);
        //  getSupportActionBar().show();
        startActivity(intent);

    }

}

