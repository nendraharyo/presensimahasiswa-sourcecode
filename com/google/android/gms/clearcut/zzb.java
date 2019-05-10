package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class zzb
{
  public static final Api API;
  public static final Api.zzc zzUI;
  public static final Api.zza zzUJ;
  public static final zzc zzaeQ;
  private final Context mContext;
  private final String zzTJ;
  private final int zzaeR;
  private String zzaeS;
  private int zzaeT;
  private String zzaeU;
  private String zzaeV;
  private final boolean zzaeW;
  private int zzaeX;
  private final zzc zzaeY;
  private final zza zzaeZ;
  private zzb.zzc zzafa;
  private final zzmq zzqW;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/clearcut/zzb$1;
    ((zzb.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("ClearcutLogger.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzlv;
    ((zzlv)localObject).<init>();
    zzaeQ = (zzc)localObject;
  }
  
  public zzb(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, zzc paramzzc, zzmq paramzzmq, zzb.zzc paramzzc1, zza paramzza)
  {
    int i = -1;
    this.zzaeT = i;
    this.zzaeX = 0;
    Object localObject = paramContext.getApplicationContext();
    label108:
    boolean bool;
    if (localObject != null)
    {
      this.mContext = ((Context)localObject);
      localObject = paramContext.getPackageName();
      this.zzTJ = ((String)localObject);
      i = zzai(paramContext);
      this.zzaeR = i;
      this.zzaeT = paramInt;
      this.zzaeS = paramString1;
      this.zzaeU = paramString2;
      this.zzaeV = paramString3;
      this.zzaeW = paramBoolean;
      this.zzaeY = paramzzc;
      this.zzqW = paramzzmq;
      if (paramzzc1 == null) {
        break label168;
      }
      this.zzafa = paramzzc1;
      this.zzaeZ = paramzza;
      this.zzaeX = 0;
      bool = this.zzaeW;
      if (bool)
      {
        localObject = this.zzaeU;
        if (localObject != null) {
          break label181;
        }
        bool = true;
      }
    }
    for (;;)
    {
      str = "can't be anonymous with an upload account";
      zzx.zzb(bool, str);
      return;
      localObject = paramContext;
      break;
      label168:
      paramzzc1 = new com/google/android/gms/clearcut/zzb$zzc;
      paramzzc1.<init>();
      break label108;
      label181:
      bool = false;
      localObject = null;
    }
  }
  
  public zzb(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this(paramContext, -1, paramString1, paramString2, paramString3, false, localzzc, localzzmq, null, localzza);
  }
  
  private int zzai(Context paramContext)
  {
    int i = 0;
    try
    {
      Object localObject = paramContext.getPackageManager();
      str2 = paramContext.getPackageName();
      localObject = ((PackageManager)localObject).getPackageInfo(str2, 0);
      i = ((PackageInfo)localObject).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str1 = "ClearcutLogger";
        String str2 = "This can't happen.";
        Log.wtf(str1, str2);
      }
    }
    return i;
  }
  
  private static int[] zzb(ArrayList paramArrayList)
  {
    boolean bool;
    if (paramArrayList == null) {
      bool = false;
    }
    int[] arrayOfInt;
    for (Object localObject = null;; localObject = arrayOfInt)
    {
      return (int[])localObject;
      arrayOfInt = new int[paramArrayList.size()];
      bool = false;
      localObject = null;
      Iterator localIterator = paramArrayList.iterator();
      int i;
      for (int j = 0;; j = i)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Integer)localIterator.next();
        int k = ((Integer)localObject).intValue();
        i = j + 1;
        arrayOfInt[j] = k;
      }
    }
  }
  
  public boolean zza(GoogleApiClient paramGoogleApiClient, long paramLong, TimeUnit paramTimeUnit)
  {
    return this.zzaeY.zza(paramGoogleApiClient, paramLong, paramTimeUnit);
  }
  
  public zzb.zza zzi(byte[] paramArrayOfByte)
  {
    zzb.zza localzza = new com/google/android/gms/clearcut/zzb$zza;
    localzza.<init>(this, paramArrayOfByte, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\clearcut\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */