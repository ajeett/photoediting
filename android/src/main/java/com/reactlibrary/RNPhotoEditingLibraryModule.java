package com.reactlibrary;

import com.ahmedadeltito.photoeditorsdk.PhotoEditorSDK;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNPhotoEditingLibraryModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNPhotoEditingLibraryModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNPhotoEditingLibrary";
    }

    @ReactMethod
    public void initPhotoSdk() {
        PhotoEditorSDK photoEditorSDK = new PhotoEditorSDK.PhotoEditorSDKBuilder(getCurrentActivity())
//                .parentView(parentImageRelativeLayout)
////add parent image view
//                .childView(photoEditImageView)
////add the desired image view
//                .deleteView(deleteRelativeLayout)
////add the deleted view that will appear during the movement of the views
//                .brushDrawingView(brushDrawingView)
// add the brush drawing view that is responsible for drawing on the image view
                .buildPhotoEditorSDK();
        // build photo editor sdk



    }
}