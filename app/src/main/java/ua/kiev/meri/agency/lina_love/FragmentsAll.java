package ua.kiev.meri.agency.lina_love;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
/**
 * Created by mary on 18/03/18.
 */

public class FragmentsAll extends MainActivity {
    FragmentPagerAdapter adapterViewPager;
    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_poems);
        ViewPager vpPager = findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager(), this);
        vpPager.setAdapter(adapterViewPager);
        vpPager.setPageTransformer(true, new RotateUpTransformer());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu resource file.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Locate MenuItem with ShareActionProvider
       // MenuItem item = menu.findItem(R.id.menu_share);

// Fetch and store ShareActionProvider
     //   mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
     //   Intent shareIntent = new Intent(Intent.ACTION_SEND);
      //  shareIntent.setType("text/plain");
     //   shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Book Recommendation");
     //   shareIntent.putExtra(Intent.EXTRA_TEXT, "http://google.com");
        // Return true to display menu
        return true;
    }

    // Call to update the share intent
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }


    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 26;
        Context context;

        public MyPagerAdapter(FragmentManager fragmentManager, Context context) {
            super(fragmentManager);
            this.context = context;
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    String title1 = context.getResources().getString(R.string.title1);
                    String poem1 = context.getResources().getString(R.string.poem1);
                    return FragmentWithOneImage.newInstance(R.drawable.img24, title1, poem1);
                case 1:
                    String title2 = context.getResources().getString(R.string.title2);
                    String poem2 = context.getResources().getString(R.string.poem2);
                    return FragmentWithOneImage.newInstance(R.drawable.img9, title2, poem2);
                case 2:
                    String title25 = context.getResources().getString(R.string.title25);
                    String poem25 = context.getResources().getString(R.string.poem25);
                    return FragmentWithOneImage.newInstance(R.drawable.img22, title25, poem25);
                case 3:
                    String title4 = context.getResources().getString(R.string.title4);
                    String poem4 = context.getResources().getString(R.string.poem4);
                    return FragmentWithOneImage.newInstance(R.drawable.img1, title4, poem4);
                case 4:
                    String title16 = context.getResources().getString(R.string.title16);
                    String poem16 = context.getResources().getString(R.string.poem16);
                    return FragmentWithOneImage.newInstance(R.drawable.img15, title16, poem16);

                case 5:
                    String title9 = context.getResources().getString(R.string.title9);
                    String poem9 = context.getResources().getString(R.string.poem9);
                    return FragmentWithOneImage.newInstance(R.drawable.img23, title9, poem9);
                case 6:
                    String title7 = context.getResources().getString(R.string.title7);
                    String poem7 = context.getResources().getString(R.string.poem7);
                    return FragmentWithOneImage.newInstance(R.drawable.img14, title7, poem7);
                case 7:
                    String title12 = context.getResources().getString(R.string.title12);
                    String poem12 = context.getResources().getString(R.string.poem12);
                    return FragmentWithOneImage.newInstance(R.drawable.img12, title12, poem12);
                case 8:
                    String title6 = context.getResources().getString(R.string.title6);
                    String poem6 = context.getResources().getString(R.string.poem6);
                    return FragmentWithOneImage.newInstance(R.drawable.img25, title6, poem6);

                case 9:
                    String title10 = context.getResources().getString(R.string.title10);
                    String poem10 = context.getResources().getString(R.string.poem10);
                    return FragmentWithOneImage.newInstance(R.drawable.img16, title10, poem10);
                case 10:
                    String title11 = context.getResources().getString(R.string.title11);
                    String poem11 = context.getResources().getString(R.string.poem11);
                    return FragmentWithOneImage.newInstance(R.drawable.img11, title11, poem11);
                case 11:
                    String title8 = context.getResources().getString(R.string.title8);
                    String poem8 = context.getResources().getString(R.string.poem8);
                    return FragmentWithOneImage.newInstance(R.drawable.img13, title8, poem8);
                case 12:
                    String title13 = context.getResources().getString(R.string.title13);
                    String poem13 = context.getResources().getString(R.string.poem13);
                    return FragmentWithOneImage.newInstance(R.drawable.img17, title13, poem13);
                case 13:
                    String title14 = context.getResources().getString(R.string.title14);
                    String poem14 = context.getResources().getString(R.string.poem14);
                    return FragmentWithOneImage.newInstance(R.drawable.img4, title14, poem14);
                case 14:
                    String title15 = context.getResources().getString(R.string.title15);
                    String poem15 = context.getResources().getString(R.string.poem15);
                    return FragmentWithOneImage.newInstance(R.drawable.img18, title15, poem15);
                case 15:
                    String title5 = context.getResources().getString(R.string.title5);
                    String poem5 = context.getResources().getString(R.string.poem5);
                    return FragmentWithOneImage.newInstance(R.drawable.img6, title5, poem5);
                case 16:
                    String title22 = context.getResources().getString(R.string.title22);
                    String poem22 = context.getResources().getString(R.string.poem22);
                    return FragmentWithOneImage.newInstance(R.drawable.img5, title22, poem22);

                case 17:
                    String title18 = context.getResources().getString(R.string.title18);
                    String poem18 = context.getResources().getString(R.string.poem18);
                    return FragmentWithOneImage.newInstance(R.drawable.img8, title18, poem18);
                case 18:
                    String title19 = context.getResources().getString(R.string.title19);
                    String poem19 = context.getResources().getString(R.string.poem19);
                    return FragmentWithOneImage.newInstance(R.drawable.img3, title19, poem19);
                case 19:
                    String title21 = context.getResources().getString(R.string.title21);
                    String poem21 = context.getResources().getString(R.string.poem21);
                    return FragmentWithOneImage.newInstance(R.drawable.img2, title21, poem21);
                case 20:
                    String title20 = context.getResources().getString(R.string.title20);
                    String poem20 = context.getResources().getString(R.string.poem20);
                    return FragmentWithOneImage.newInstance(R.drawable.img20, title20, poem20);
                case 21:
                    String title17 = context.getResources().getString(R.string.title17);
                    String poem17 = context.getResources().getString(R.string.poem17);
                    return FragmentWithOneImage.newInstance(R.drawable.img10, title17, poem17);
                case 22:
                    String title23 = context.getResources().getString(R.string.title23);
                    String poem23 = context.getResources().getString(R.string.poem23);
                    return FragmentWithOneImage.newInstance(R.drawable.img19, title23, poem23);
                case 23:
                    String title24 = context.getResources().getString(R.string.title24);
                    String poem24 = context.getResources().getString(R.string.poem24);
                    return FragmentWithOneImage.newInstance(R.drawable.img21, title24, poem24);
                case 24:

                    String title3 = context.getResources().getString(R.string.title3);
                    String poem3 = context.getResources().getString(R.string.poem3);
                    return FragmentWithOneImage.newInstance(R.drawable.img26, title3, poem3);
                case 25:
                    String title26 = context.getResources().getString(R.string.title26);
                    String poem26 = context.getResources().getString(R.string.poem26);
                    return FragmentWithOneImage.newInstance(R.drawable.img7, title26, poem26);
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + position;
        }

    }
}