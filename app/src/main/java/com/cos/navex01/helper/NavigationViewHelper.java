package com.cos.navex01.helper;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.cos.navex01.MainActivity;
import com.cos.navex01.R;
import com.cos.navex01.SubActivity;
import com.google.android.material.navigation.NavigationView;

public class NavigationViewHelper {

    public static void enableNavigation(Context context, NavigationView nav) {
        nav.setNavigationItemSelectedListener(item -> {


            if(item.getItemId() == R.id.nav_camera) {
                Intent intent = new Intent(
                        context,
                        MainActivity.class
                );
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }else if(item.getItemId() == R.id.nav_gallery) {
                Intent intent = new Intent(
                        context,
                        SubActivity.class
                );
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent);
            }else if(item.getItemId() == R.id.nav_tools) {

            }

            return true;
        });
    }
//    private void routeSetting(Context context) {
//        Intent intent = new Intent(
//                context,
//                SubActivity.class
//        );
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        context.startActivity(intent);
//    }
}
