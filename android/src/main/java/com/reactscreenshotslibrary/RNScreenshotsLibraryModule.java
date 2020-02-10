
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.view.WindowManager;
import android.app.Activity;

public class RNScreenshotsLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNScreenshotsLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNScreenshotsLibrary";
  }

  @ReactMethod
  public void disableScreenCapture(){
    try {
      getCurrentActivity().runOnUiThread(new Runnable(){
        @Override
        public void run() {
          Activity activity = getCurrentActivity();
          if (activity != null) {
            activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
          }
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @ReactMethod
  public void enableScreenCapture(){
    try {
      getCurrentActivity().runOnUiThread(new Runnable(){
        @Override
        public void run() {
          Activity activity = getCurrentActivity();
          if (activity != null) {
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
          }
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}