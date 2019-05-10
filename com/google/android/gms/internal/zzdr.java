package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class zzdr
  implements Releasable
{
  protected Context mContext;
  protected String zzzN;
  protected WeakReference zzzO;
  
  public zzdr(zzjp paramzzjp)
  {
    Object localObject = paramzzjp.getContext();
    this.mContext = ((Context)localObject);
    localObject = zzr.zzbC();
    Context localContext = this.mContext;
    String str = paramzzjp.zzhX().afmaVersion;
    localObject = ((zzir)localObject).zze(localContext, str);
    this.zzzN = ((String)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramzzjp);
    this.zzzO = ((WeakReference)localObject);
  }
  
  private String zzW(String paramString)
  {
    String str1 = "internal";
    int i = -1;
    int j = paramString.hashCode();
    switch (j)
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return str1;
      String str2 = "error";
      boolean bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 0;
      break;
      str2 = "playerFailed";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 1;
      break;
      str2 = "inProgress";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 2;
      break;
      str2 = "contentLengthMissing";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 3;
      break;
      str2 = "noCacheDir";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 4;
      break;
      str2 = "expireFailed";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 5;
      break;
      str2 = "badUrl";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 6;
      break;
      str2 = "downloadTimeout";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 7;
      break;
      str2 = "sizeExceeded";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 8;
      break;
      str2 = "externalAbort";
      bool = paramString.equals(str2);
      if (!bool) {
        break;
      }
      i = 9;
      break;
      str1 = "internal";
      continue;
      str1 = "io";
      continue;
      str1 = "network";
      continue;
      str1 = "policy";
    }
  }
  
  private void zza(String paramString, Map paramMap)
  {
    zzjp localzzjp = (zzjp)this.zzzO.get();
    if (localzzjp != null) {
      localzzjp.zza(paramString, paramMap);
    }
  }
  
  public abstract void abort();
  
  public void release() {}
  
  public abstract boolean zzU(String paramString);
  
  protected String zzV(String paramString)
  {
    return zzn.zzcS().zzaH(paramString);
  }
  
  protected void zza(String paramString1, String paramString2, int paramInt)
  {
    Handler localHandler = zza.zzMS;
    zzdr.2 local2 = new com/google/android/gms/internal/zzdr$2;
    local2.<init>(this, paramString1, paramString2, paramInt);
    localHandler.post(local2);
  }
  
  protected void zza(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Handler localHandler = zza.zzMS;
    zzdr.1 local1 = new com/google/android/gms/internal/zzdr$1;
    local1.<init>(this, paramString1, paramString2, paramInt1, paramInt2, paramBoolean);
    localHandler.post(local1);
  }
  
  protected void zza(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Handler localHandler = zza.zzMS;
    zzdr.3 local3 = new com/google/android/gms/internal/zzdr$3;
    local3.<init>(this, paramString1, paramString2, paramString3, paramString4);
    localHandler.post(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */