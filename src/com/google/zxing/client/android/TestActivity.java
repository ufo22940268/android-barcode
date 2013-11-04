/*
 * TestActivity.java
 * Copyright (C) 2013 ccheng <ccheng@cchengs-MacBook-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

package com.google.zxing.client.android;

import android.util.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.app.*;
import android.os.*;
import android.database.*;
import android.net.*;
import android.opengl.*;
import android.text.*;
import android.graphics.*;
import android.view.animation.*;

import java.util.*;
import org.json.*;

public class TestActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedBundleInstance) {
        super.onCreate(savedBundleInstance);
        TextView tv = new TextView(this);
        tv.setText(getIntent().getStringExtra("test"));
        setContentView(tv);
    }
}
