package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.support.v4.app.i;
import android.support.v4.app.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.zzc;
import java.util.List;

class zzw$zzb
  implements Runnable
{
  private final int zzaiJ;
  private final ConnectionResult zzaiK;
  
  public zzw$zzb(zzw paramzzw, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.zzaiJ = paramInt;
    this.zzaiK = paramConnectionResult;
  }
  
  public void run()
  {
    Object localObject1 = this.zzaiI;
    boolean bool1 = zzw.zza((zzw)localObject1);
    if (bool1)
    {
      localObject1 = this.zzaiI;
      bool1 = zzw.zzb((zzw)localObject1);
      if (!bool1) {
        break label29;
      }
    }
    for (;;)
    {
      return;
      label29:
      zzw.zza(this.zzaiI, true);
      localObject1 = this.zzaiI;
      int k = this.zzaiJ;
      zzw.zza((zzw)localObject1, k);
      localObject1 = this.zzaiI;
      Object localObject3 = this.zzaiK;
      zzw.zza((zzw)localObject1, (ConnectionResult)localObject3);
      localObject1 = this.zzaiK;
      bool1 = ((ConnectionResult)localObject1).hasResolution();
      Object localObject4;
      Object localObject2;
      if (bool1)
      {
        try
        {
          localObject1 = this.zzaiI;
          localObject1 = ((zzw)localObject1).getActivity();
          localObject1 = ((i)localObject1).getSupportFragmentManager();
          localObject1 = ((m)localObject1).e();
          localObject3 = this.zzaiI;
          int i = (((List)localObject1).indexOf(localObject3) + 1 << 16) + 1;
          localObject3 = this.zzaiK;
          localObject4 = this.zzaiI;
          localObject4 = ((zzw)localObject4).getActivity();
          ((ConnectionResult)localObject3).startResolutionForResult((Activity)localObject4, i);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          localObject2 = this.zzaiI;
          ((zzw)localObject2).zzpP();
        }
      }
      else
      {
        localObject2 = this.zzaiI.zzpQ();
        localObject3 = this.zzaiK;
        k = ((ConnectionResult)localObject3).getErrorCode();
        boolean bool2 = ((zzc)localObject2).isUserResolvableError(k);
        if (bool2)
        {
          localObject2 = this.zzaiI;
          k = this.zzaiJ;
          localObject4 = this.zzaiK;
          ((zzw)localObject2).zzb(k, (ConnectionResult)localObject4);
        }
        else
        {
          localObject2 = this.zzaiK;
          int j = ((ConnectionResult)localObject2).getErrorCode();
          k = 18;
          if (j == k)
          {
            localObject2 = this.zzaiI;
            k = this.zzaiJ;
            localObject4 = this.zzaiK;
            ((zzw)localObject2).zzc(k, (ConnectionResult)localObject4);
          }
          else
          {
            localObject2 = this.zzaiI;
            k = this.zzaiJ;
            localObject4 = this.zzaiK;
            zzw.zza((zzw)localObject2, k, (ConnectionResult)localObject4);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzw$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */