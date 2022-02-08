package com.keg.bluetoothscanner;

import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ScanFragment extends Fragment {

    public ScanFragment() {
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
        return inflater.inflate(R.layout.fragment_scan, container, false);
    }


    /*
        ACCESS_FINE_LOCATION 권한을 가지고 있는지 여부를 리턴하는 메소드.
        return true ACCESS_FINE_LOCATION 권한을 가지고있다.
        return false
     */
    private boolean hasPermission() {
        if(ContextCompat.checkSelfPermission(getActivity(),Constant.PERMISSION_ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED) {
                return true;
        }else {
            return false;
        }
    }

    private void requestPermission() {
        if(!hasPermission()) {

        }else {

        }
    }
}