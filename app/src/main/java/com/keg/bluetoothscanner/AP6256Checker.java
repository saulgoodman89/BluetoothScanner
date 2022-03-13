package com.keg.bluetoothscanner;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;


abstract class AP6256Checker extends Dialog {
    protected Button mScanBtn = null;
    protected Button mResultOk = null;
    protected Button mResultNg = null;
    protected TextView mTextTitle = null;
    public AP6256Checker(@NonNull Context context) {
        super(context);
    }

    abstract void tryScan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ap6256_check_dialog);
        init();
        tryScan();
    }

    private void init() {
        mScanBtn = findViewById(R.id.btn_scanner);
        mResultOk = findViewById(R.id.btn_result_ok);
        mResultNg = findViewById(R.id.btn_result_ng);
    }
}
