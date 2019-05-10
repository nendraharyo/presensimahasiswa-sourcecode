package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class zzdb
  extends zzak
{
  private static final String ID = zzad.zzdl.toString();
  private static final String NAME = zzae.zzgo.toString();
  private static final String zzblp = zzae.zzfT.toString();
  private static final String zzblq = zzae.zzgb.toString();
  private static final String zzblr = zzae.zzhW.toString();
  private final Context mContext;
  private Handler mHandler;
  private DataLayer zzbhN;
  private boolean zzbls;
  private boolean zzblt;
  private final HandlerThread zzblu;
  private final Set zzblv;
  
  public zzdb(Context paramContext, DataLayer paramDataLayer)
  {
    super((String)localObject1, (String[])localObject2);
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    this.zzblv = ((Set)localObject1);
    this.mContext = paramContext;
    this.zzbhN = paramDataLayer;
    localObject1 = new android/os/HandlerThread;
    ((HandlerThread)localObject1).<init>("Google GTM SDK Timer", 10);
    this.zzblu = ((HandlerThread)localObject1);
    this.zzblu.start();
    localObject1 = new android/os/Handler;
    localObject2 = this.zzblu.getLooper();
    ((Handler)localObject1).<init>((Looper)localObject2);
    this.mHandler = ((Handler)localObject1);
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    l1 = 0L;
    Object localObject1 = NAME;
    String str1 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
    localObject1 = zzblr;
    String str2 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
    localObject1 = zzblp;
    Object localObject2 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
    localObject1 = zzblq;
    localObject1 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
    try
    {
      l2 = Long.parseLong((String)localObject2);
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      for (;;)
      {
        label100:
        boolean bool;
        Handler localHandler;
        long l2 = l1;
      }
    }
    try
    {
      l3 = Long.parseLong((String)localObject1);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      l3 = l1;
      break label100;
    }
    bool = l2 < l1;
    if (bool)
    {
      bool = TextUtils.isEmpty(str1);
      if (!bool)
      {
        if (str2 != null)
        {
          bool = str2.isEmpty();
          if (!bool) {}
        }
        else
        {
          str2 = "0";
        }
        localObject1 = this.zzblv;
        bool = ((Set)localObject1).contains(str2);
        if (!bool)
        {
          localObject1 = "0";
          bool = ((String)localObject1).equals(str2);
          if (!bool)
          {
            localObject1 = this.zzblv;
            ((Set)localObject1).add(str2);
          }
          localHandler = this.mHandler;
          localObject1 = new com/google/android/gms/tagmanager/zzdb$zza;
          localObject2 = this;
          ((zzdb.zza)localObject1).<init>(this, str1, str2, l2, l3);
          localHandler.postDelayed((Runnable)localObject1, l2);
        }
      }
    }
    return zzdf.zzHF();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */