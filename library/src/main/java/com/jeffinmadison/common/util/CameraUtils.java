package com.jeffinmadison.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Jeff on 11/7/13.
 * Copyright JeffInMadison 2014
 */
public class CameraUtils {

    public boolean deviceHasCamera(Context context) {

        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    public boolean deviceHasFrontFacingCamera(Context context) {

        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);
    }
}
