package com.dieam.reactnativepushnotification.helpers;

import android.content.Context;
import android.os.Bundle;

public interface RNPushNotificationSideEffectInterface {
    void onNotificationReceived(Context context, Bundle extras);
}
