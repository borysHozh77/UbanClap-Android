package com.thinkin_service.app.ui.fragment.invoice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.thinkin_service.app.BuildConfig;
import com.thinkin_service.app.R;
import com.thinkin_service.app.data.SharedHelper;

@SuppressLint("ValidFragment")
 public class AfterService extends Fragment {

    public static final String TAG = "BeforeService";
    Context context;
    View rootView;
    ImageView imgBeforeServiceInvoice;
    TextView lblBeforeServiceInvoice;


    public AfterService() {
        // Required empty public constructor
    }


    public static AfterService newInstance() {
        AfterService fragment = new AfterService();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.before_service, container, false);
        findViewByIdAndInitialize();


        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public void findViewByIdAndInitialize() {

        imgBeforeServiceInvoice = (ImageView) rootView.findViewById(R.id.imgBeforeServiceInvoice);
        lblBeforeServiceInvoice = (TextView) rootView.findViewById(R.id.lblBeforeServiceInvoice);

        String image=  SharedHelper.getKey(getContext(),"after");
        String comment=  SharedHelper.getKey(getContext(),"after_comm");
        Glide.with(getContext()).load(BuildConfig.BASE_IMAGE_URL+"/"+image).into(imgBeforeServiceInvoice);
        lblBeforeServiceInvoice.setText(comment);
        // Toast.makeText(context,SharedHelper.getKey(context, "before_comment")+"===="+SharedHelper.getKey(context, "before_image"),Toast.LENGTH_LONG).show();



    }


    @Override
    public void onResume() {
        super.onResume();

    }
}
