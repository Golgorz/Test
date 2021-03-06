package com.hexenbytes.demomodule;

import android.content.Context;
import android.widget.Toast;

import com.hexenbytes.demomoduledependency.Constants;

public class ToastUtility {

        public static Toast initializeToast(Context context, Toast toast, String res) {
            cancelToast(toast);
            return Toast.makeText(context, res, Toast.LENGTH_SHORT);
        }

        public static void cancelToast(Toast toast) {
            if (toast != null) {
                toast.cancel();
            }
        }
        public static void testModel() {
            System.out.print(Constants.APP_URL);
        }
}
