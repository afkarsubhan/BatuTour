package batutour.com.batutour.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import batutour.com.batutour.MainActivity;
import batutour.com.batutour.R;
import batutour.com.batutour.adapter.MyAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Home extends Fragment {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.city1,R.drawable.city2,R.drawable.city3};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    public Home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        mPager = (ViewPager) view.findViewById(R.id.pager);
//
//        mPager.setAdapter(new MyAdapter(getActivity(), XMENArray));
//        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
//        indicator.setViewPager(mPager);

    //    init();
        return view;
    }

    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);



        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
    }
}