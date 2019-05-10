package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzpn$zza
  extends zzpo.zza
{
  private Activity mActivity;
  private final int zzagz;
  
  public zzpn$zza(int paramInt, Activity paramActivity)
  {
    this.zzagz = paramInt;
    this.mActivity = paramActivity;
  }
  
  private void setActivity(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  public void zzh(int paramInt, Bundle paramBundle)
  {
    int i = 1073741824;
    int j = 1;
    Object localObject1;
    Object localObject4;
    int k;
    if (paramInt == j)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      ((Intent)localObject1).putExtras(paramBundle);
      localObject4 = this.mActivity;
      k = this.zzagz;
      localObject1 = ((Activity)localObject4).createPendingResult(k, (Intent)localObject1, i);
      if (localObject1 != null) {}
    }
    for (;;)
    {
      return;
      int m = 1;
      Object localObject5;
      try
      {
        ((PendingIntent)localObject1).send(m);
      }
      catch (PendingIntent.CanceledException localCanceledException1)
      {
        localObject4 = "AddressClientImpl";
        localObject5 = "Exception settng pending result";
        Log.w((String)localObject4, (String)localObject5, localCanceledException1);
      }
      continue;
      j = 0;
      Object localObject2 = null;
      if (paramBundle != null) {
        localObject2 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
      }
      localObject4 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject4).<init>(paramInt, (PendingIntent)localObject2);
      boolean bool = ((ConnectionResult)localObject4).hasResolution();
      if (bool) {
        try
        {
          localObject2 = this.mActivity;
          k = this.zzagz;
          ((ConnectionResult)localObject4).startResolutionForResult((Activity)localObject2, k);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject4 = "AddressClientImpl";
          localObject5 = "Exception starting pending intent";
          Log.w((String)localObject4, (String)localObject5, localSendIntentException);
        }
      } else {
        try
        {
          Object localObject3 = this.mActivity;
          m = this.zzagz;
          localObject5 = new android/content/Intent;
          ((Intent)localObject5).<init>();
          i = 1073741824;
          localObject3 = ((Activity)localObject3).createPendingResult(m, (Intent)localObject5, i);
          if (localObject3 != null)
          {
            m = 1;
            ((PendingIntent)localObject3).send(m);
          }
        }
        catch (PendingIntent.CanceledException localCanceledException2)
        {
          localObject4 = "AddressClientImpl";
          localObject5 = "Exception setting pending result";
          Log.w((String)localObject4, (String)localObject5, localCanceledException2);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpn$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */