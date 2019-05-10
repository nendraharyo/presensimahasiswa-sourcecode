package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;

public abstract class ResolvingResultCallbacks
  extends ResultCallbacks
{
  private final Activity mActivity;
  private final int zzagz;
  
  protected ResolvingResultCallbacks(Activity paramActivity, int paramInt)
  {
    Activity localActivity = (Activity)zzx.zzb(paramActivity, "Activity must not be null");
    this.mActivity = localActivity;
    this.zzagz = paramInt;
  }
  
  public final void onFailure(Status paramStatus)
  {
    boolean bool = paramStatus.hasResolution();
    if (bool) {}
    for (;;)
    {
      try
      {
        Activity localActivity = this.mActivity;
        i = this.zzagz;
        paramStatus.startResolutionForResult(localActivity, i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        String str1 = "ResolvingResultCallback";
        String str2 = "Failed to start resolution";
        Log.e(str1, str2, localSendIntentException);
        Status localStatus = new com/google/android/gms/common/api/Status;
        int i = 8;
        localStatus.<init>(i);
        onUnresolvableFailure(localStatus);
        continue;
      }
      onUnresolvableFailure(paramStatus);
    }
  }
  
  public abstract void onSuccess(Result paramResult);
  
  public abstract void onUnresolvableFailure(Status paramStatus);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\ResolvingResultCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */