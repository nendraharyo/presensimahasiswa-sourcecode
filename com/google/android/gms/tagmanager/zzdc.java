package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class zzdc
{
  private Context mContext;
  private Tracker zzPb;
  private GoogleAnalytics zzPd;
  
  public zzdc(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void zzgr(String paramString)
  {
    try
    {
      Object localObject1 = this.zzPd;
      if (localObject1 == null)
      {
        localObject1 = this.mContext;
        localObject1 = GoogleAnalytics.getInstance((Context)localObject1);
        this.zzPd = ((GoogleAnalytics)localObject1);
        localObject1 = this.zzPd;
        zzdc.zza localzza = new com/google/android/gms/tagmanager/zzdc$zza;
        localzza.<init>();
        ((GoogleAnalytics)localObject1).setLogger(localzza);
        localObject1 = this.zzPd;
        localObject1 = ((GoogleAnalytics)localObject1).newTracker(paramString);
        this.zzPb = ((Tracker)localObject1);
      }
      return;
    }
    finally {}
  }
  
  public Tracker zzgq(String paramString)
  {
    zzgr(paramString);
    return this.zzPb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */