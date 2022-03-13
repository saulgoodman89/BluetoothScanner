package com.keg.bluetoothscanner;

import android.content.Context;
import android.os.Handler;

import androidx.annotation.NonNull;

public class WifiDialog extends AP6256Checker{
    public WifiDialog(Handler _handler  , @NonNull Context context) {
        super(context);
    }

    @Override
    void tryScan() {
    }
}
