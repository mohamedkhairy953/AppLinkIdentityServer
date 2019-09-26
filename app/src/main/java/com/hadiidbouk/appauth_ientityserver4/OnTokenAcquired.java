package com.hadiidbouk.appauth_ientityserver4;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.os.Bundle;
import android.util.Log;

public class OnTokenAcquired implements AccountManagerCallback<Bundle> {
    @Override
    public void run(AccountManagerFuture<Bundle> result) {
        Bundle bundle = null;
        try {
            bundle = result.getResult();
            String token = bundle.getString(AccountManager.KEY_AUTHTOKEN);
            Log.d("uhhhhhh", "run: "+token);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}