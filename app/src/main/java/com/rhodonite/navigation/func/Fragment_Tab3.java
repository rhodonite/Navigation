package com.rhodonite.navigation.func;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.rhodonite.navigation.databinding.FragmentTab3Binding;
import com.rhodonite.navigation.utils.CumtomActionBarTitle;


public class Fragment_Tab3 extends Fragment
{
    static String TAG = "Fragment_Tab3";
    private FragmentTab3Binding _binding;



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG,"-------------------------Fragment_Tab3.onViewCreated()-------------------------");
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        CumtomActionBarTitle.setTitle(getActivity(),TAG);
        _binding = FragmentTab3Binding.inflate(inflater, container, false);
        return _binding.getRoot();
    }

}
