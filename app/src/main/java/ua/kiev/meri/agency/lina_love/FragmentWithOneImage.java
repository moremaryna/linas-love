package ua.kiev.meri.agency.lina_love;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FragmentWithOneImage extends Fragment {
    private int image;
    private String text_full;
    private String title;


    public static FragmentWithOneImage newInstance(int resImage, String title, String text_full) {
        FragmentWithOneImage fragment = new FragmentWithOneImage();
        Bundle args = new Bundle();
        args.putInt("image", resImage);
        args.putString("title", title);
        args.putString("text_full", text_full);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image = getArguments().getInt("image", 0);
        title = getArguments().getString("title");
        text_full = getArguments().getString("text_full");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_img, container, false);

        NestedScrollView layoutBottomSheet = view.findViewById(R.id.bottom_sheet);
        BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(layoutBottomSheet);

        TextView title_poem = (TextView) view.findViewById(R.id.title_poem);
        title_poem.setText(title);

        TextView poem_one = (TextView) view.findViewById(R.id.text_full);
        poem_one.setText(text_full);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);
        imageView.setImageResource(image);
        return view;
    }
}