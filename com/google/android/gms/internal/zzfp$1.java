package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zzfp$1
  implements DialogInterface.OnClickListener
{
  zzfp$1(zzfp paramzzfp, String paramString1, String paramString2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject1 = zzfp.zza(this.zzDt);
    Object localObject2 = "download";
    localObject1 = (DownloadManager)((Context)localObject1).getSystemService((String)localObject2);
    try
    {
      localObject2 = this.zzDt;
      String str1 = this.zzDr;
      String str2 = this.zzDs;
      localObject2 = ((zzfp)localObject2).zzf(str1, str2);
      ((DownloadManager)localObject1).enqueue((DownloadManager.Request)localObject2);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        zzfp localzzfp = this.zzDt;
        localObject2 = "Could not store picture.";
        localzzfp.zzam((String)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfp$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */