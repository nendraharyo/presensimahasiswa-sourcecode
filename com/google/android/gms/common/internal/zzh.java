package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class zzh
  implements DialogInterface.OnClickListener
{
  private final Activity mActivity;
  private final Intent mIntent;
  private final int zzagz;
  private final Fragment zzalg;
  
  public zzh(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.mActivity = paramActivity;
    this.zzalg = null;
    this.mIntent = paramIntent;
    this.zzagz = paramInt;
  }
  
  public zzh(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.mActivity = null;
    this.zzalg = paramFragment;
    this.mIntent = paramIntent;
    this.zzagz = paramInt;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.mIntent;
        if (localObject1 != null)
        {
          localObject1 = this.zzalg;
          if (localObject1 != null)
          {
            localObject1 = this.zzalg;
            localObject2 = this.mIntent;
            i = this.zzagz;
            ((Fragment)localObject1).startActivityForResult((Intent)localObject2, i);
            paramDialogInterface.dismiss();
            return;
          }
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Object localObject1;
        int i;
        String str = "SettingsRedirect";
        Object localObject2 = "Can't redirect to app settings for Google Play services";
        Log.e(str, (String)localObject2);
        continue;
      }
      localObject1 = this.mIntent;
      if (localObject1 != null)
      {
        localObject1 = this.mActivity;
        localObject2 = this.mIntent;
        i = this.zzagz;
        ((Activity)localObject1).startActivityForResult((Intent)localObject2, i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */