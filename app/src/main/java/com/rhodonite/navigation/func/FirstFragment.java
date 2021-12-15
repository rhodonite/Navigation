package com.rhodonite.navigation.func;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.rhodonite.navigation.MainActivity;
import com.rhodonite.navigation.R;
import com.rhodonite.navigation.databinding.FragmentFirstBinding;
import com.rhodonite.navigation.utils.CumtomActionBarTitle;


public class FirstFragment extends Fragment implements
        View.OnClickListener
{

    private FragmentFirstBinding binding;
    static String TAG = "FirstFragment";

    MainActivity mainActivity;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mainActivity = (MainActivity)activity;

    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        CumtomActionBarTitle.setTitle(getActivity(),TAG);
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);


        binding.buttonTab1.setOnClickListener(this);
        binding.buttonTab2.setOnClickListener(this);
        binding.buttonTab3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        try
        {

           if (view.getId()== R.id.button_tab1)
            {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_Tab1);
            }
           else if (view.getId()==R.id.button_tab2)
            {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_Tab2);
            }
           else if (view.getId()==R.id.button_tab3)
           {
               NavHostFragment.findNavController(FirstFragment.this)
                       .navigate(R.id.action_FirstFragment_to_Tab3);
           }

        }
        catch (Exception ex)
        {
            Log.e(TAG,ex.getMessage(),ex);
        }
    }


    @Override
    public void onStart()
    {
        super.onStart();
        Log.i(TAG,"-------------------------FirstFragment.onStart()-------------------------");
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}