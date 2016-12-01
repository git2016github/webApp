package org.apache.cordova.myplugins;

import android.content.Intent;

import com.example.demo.ResultActivity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

/**
 * Created by admin on 2016/11/30.
 */

public class CustomDialogPlugin extends CordovaPlugin {
    private CallbackContext callbackContext;
    private int REQUESTCODE = 0;//请求码
    private int RESULTCODE = 1;//结果码

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        this.callbackContext = callbackContext;
        if(action.equals("showDialog")){
            Intent intent = new Intent();
            intent.setClass(this.cordova.getActivity(),ResultActivity.class);
            this.cordova.startActivityForResult(this,intent,REQUESTCODE);
        }
        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(resultCode==RESULTCODE){
            String value = intent.getExtras().getString("key");
            callbackContext.success(value);
        }
    }
}
