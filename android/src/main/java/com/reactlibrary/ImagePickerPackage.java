package com.reactlibrary;

import androidx.annotation.StyleRes;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImagePickerPackage implements ReactPackage {
  private @StyleRes final int dialogThemeId;

  public ImagePickerPackage()
  {
    this.dialogThemeId = RNPhotoEditingLibraryModule.DEFAULT_EXPLAINING_PERMISSION_DIALIOG_THEME;
  }

  public ImagePickerPackage(@StyleRes final int dialogThemeId)
  {
    this.dialogThemeId = dialogThemeId;
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Arrays.<NativeModule>asList(new RNPhotoEditingLibraryModule(reactContext, dialogThemeId));
  }

  // Deprecated RN 0.47
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
