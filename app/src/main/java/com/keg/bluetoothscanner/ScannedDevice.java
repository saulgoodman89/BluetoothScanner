package com.keg.bluetoothscanner;

import androidx.annotation.NonNull;

public class ScannedDevice {
    private String mSsid = "";
    private int mRssi = 0;

    public String getmSsid() {
        return mSsid;
    }

    public void setmSsid(String mSsid) {
        this.mSsid = mSsid;
    }

    public int getmRssi() {
        return mRssi;
    }

    public void setmRssi(int mRssi) {
        this.mRssi = mRssi;
    }

    @NonNull
    @Override
    public String toString() {
        return "SSID : "+ mSsid + " RSSI : "+ mRssi;
    }
}
