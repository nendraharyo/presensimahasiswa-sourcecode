package com.google.android.gms.internal;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzg;
import com.google.android.gms.common.stats.zzi;
import java.util.List;

public class zzrp
{
  private static boolean DEBUG = false;
  private static String TAG = "WakeLock";
  private static String zzbhl = "*gcore*:";
  private final Context mContext;
  private final String zzanQ;
  private final PowerManager.WakeLock zzbhm;
  private WorkSource zzbhn;
  private final int zzbho;
  private final String zzbhp;
  private boolean zzbhq = true;
  private int zzbhr;
  private int zzbhs;
  
  public zzrp(Context paramContext, int paramInt, String paramString) {}
  
  public zzrp(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    zzx.zzh(paramString1, "Wake lock name can NOT be empty");
    this.zzbho = paramInt;
    this.zzbhp = paramString2;
    Object localObject1 = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject1);
    boolean bool = zzni.zzcV(paramString3);
    if (!bool)
    {
      localObject1 = "com.google.android.gms";
      if (localObject1 != paramString3)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = zzbhl;
        localObject1 = (String)localObject2 + paramString1;
        this.zzanQ = ((String)localObject1);
        localObject1 = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(paramInt, paramString1);
        this.zzbhm = ((PowerManager.WakeLock)localObject1);
        localObject1 = this.mContext;
        bool = zznj.zzaA((Context)localObject1);
        if (bool)
        {
          bool = zzni.zzcV(paramString3);
          if (bool)
          {
            bool = zzd.zzakE;
            if (!bool) {
              break label277;
            }
            bool = zzlz.isInitialized();
            if (!bool) {
              break label277;
            }
            localObject1 = TAG;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("callingPackage is not supposed to be empty for wakelock ");
            Object localObject3 = this.zzanQ;
            localObject2 = (String)localObject3 + "!";
            localObject3 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject3).<init>();
            Log.e((String)localObject1, (String)localObject2, (Throwable)localObject3);
          }
        }
      }
    }
    label277:
    for (paramString3 = "com.google.android.gms";; paramString3 = paramContext.getPackageName())
    {
      localObject1 = zznj.zzl(paramContext, paramString3);
      this.zzbhn = ((WorkSource)localObject1);
      localObject1 = this.zzbhn;
      zzc((WorkSource)localObject1);
      return;
      this.zzanQ = paramString1;
      break;
    }
  }
  
  private void zzfJ(String paramString)
  {
    boolean bool1 = zzfK(paramString);
    String str1 = zzn(paramString, bool1);
    boolean bool2 = DEBUG;
    Object localObject1;
    Object localObject2;
    int k;
    if (bool2)
    {
      localObject1 = TAG;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Release:\n mWakeLockName: ");
      String str2 = this.zzanQ;
      localObject2 = ((StringBuilder)localObject2).append(str2).append("\n mSecondaryName: ");
      str2 = this.zzbhp;
      localObject2 = ((StringBuilder)localObject2).append(str2).append("\nmReferenceCounted: ");
      boolean bool3 = this.zzbhq;
      localObject2 = ((StringBuilder)localObject2).append(bool3).append("\nreason: ").append(paramString).append("\n mOpenEventCount");
      k = this.zzbhs;
      localObject2 = ((StringBuilder)localObject2).append(k).append("\nuseWithReason: ").append(bool1);
      str2 = "\ntrackingName: ";
      localObject2 = str2 + str1;
      Log.d((String)localObject1, (String)localObject2);
    }
    try
    {
      bool2 = this.zzbhq;
      int j;
      if (bool2)
      {
        j = this.zzbhr + -1;
        this.zzbhr = j;
        if ((j == 0) || (bool1)) {}
      }
      else
      {
        bool1 = this.zzbhq;
        if (bool1) {
          break label311;
        }
        i = this.zzbhs;
        j = 1;
        if (i != j) {
          break label311;
        }
      }
      zzi localzzi = zzi.zzrZ();
      localObject1 = this.mContext;
      localObject2 = this.zzbhm;
      localObject2 = zzg.zza((PowerManager.WakeLock)localObject2, str1);
      k = 8;
      String str3 = this.zzanQ;
      int m = this.zzbho;
      Object localObject4 = this.zzbhn;
      localObject4 = zznj.zzb((WorkSource)localObject4);
      localzzi.zza((Context)localObject1, (String)localObject2, k, str3, str1, m, (List)localObject4);
      int i = this.zzbhs + -1;
      this.zzbhs = i;
      label311:
      return;
    }
    finally {}
  }
  
  private boolean zzfK(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (!bool)
    {
      str = this.zzbhp;
      bool = paramString.equals(str);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  private void zzj(String paramString, long paramLong)
  {
    boolean bool1 = zzfK(paramString);
    String str1 = zzn(paramString, bool1);
    boolean bool2 = DEBUG;
    Object localObject1;
    Object localObject2;
    int k;
    if (bool2)
    {
      localObject1 = TAG;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Acquire:\n mWakeLockName: ");
      String str2 = this.zzanQ;
      localObject2 = ((StringBuilder)localObject2).append(str2).append("\n mSecondaryName: ");
      str2 = this.zzbhp;
      localObject2 = ((StringBuilder)localObject2).append(str2).append("\nmReferenceCounted: ");
      boolean bool3 = this.zzbhq;
      localObject2 = ((StringBuilder)localObject2).append(bool3).append("\nreason: ").append(paramString).append("\nmOpenEventCount");
      k = this.zzbhs;
      localObject2 = ((StringBuilder)localObject2).append(k).append("\nuseWithReason: ").append(bool1).append("\ntrackingName: ").append(str1);
      str2 = "\ntimeout: ";
      localObject2 = str2 + paramLong;
      Log.d((String)localObject1, (String)localObject2);
    }
    try
    {
      bool2 = this.zzbhq;
      if (bool2)
      {
        int j = this.zzbhr;
        int m = j + 1;
        this.zzbhr = m;
        if ((j == 0) || (bool1)) {}
      }
      else
      {
        bool1 = this.zzbhq;
        if (bool1) {
          break label334;
        }
        i = this.zzbhs;
        if (i != 0) {
          break label334;
        }
      }
      zzi localzzi = zzi.zzrZ();
      localObject1 = this.mContext;
      localObject2 = this.zzbhm;
      localObject2 = zzg.zza((PowerManager.WakeLock)localObject2, str1);
      k = 7;
      String str3 = this.zzanQ;
      int n = this.zzbho;
      Object localObject4 = this.zzbhn;
      localObject4 = zznj.zzb((WorkSource)localObject4);
      localzzi.zza((Context)localObject1, (String)localObject2, k, str3, str1, n, (List)localObject4, paramLong);
      int i = this.zzbhs + 1;
      this.zzbhs = i;
      label334:
      return;
    }
    finally {}
  }
  
  private String zzn(String paramString, boolean paramBoolean)
  {
    boolean bool = this.zzbhq;
    if (bool) {
      if (!paramBoolean) {}
    }
    for (;;)
    {
      return paramString;
      paramString = this.zzbhp;
      continue;
      paramString = this.zzbhp;
    }
  }
  
  public void acquire(long paramLong)
  {
    boolean bool = zzne.zzsg();
    if (!bool)
    {
      bool = this.zzbhq;
      if (bool)
      {
        String str1 = TAG;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ");
        String str2 = this.zzanQ;
        localObject = str2;
        Log.wtf(str1, (String)localObject);
      }
    }
    zzj(null, paramLong);
    this.zzbhm.acquire(paramLong);
  }
  
  public boolean isHeld()
  {
    return this.zzbhm.isHeld();
  }
  
  public void release()
  {
    zzfJ(null);
    this.zzbhm.release();
  }
  
  public void setReferenceCounted(boolean paramBoolean)
  {
    this.zzbhm.setReferenceCounted(paramBoolean);
    this.zzbhq = paramBoolean;
  }
  
  public void zzc(WorkSource paramWorkSource)
  {
    Object localObject = this.mContext;
    boolean bool = zznj.zzaA((Context)localObject);
    if ((bool) && (paramWorkSource != null))
    {
      localObject = this.zzbhn;
      if (localObject == null) {
        break label56;
      }
      localObject = this.zzbhn;
      ((WorkSource)localObject).add(paramWorkSource);
    }
    for (;;)
    {
      localObject = this.zzbhm;
      WorkSource localWorkSource = this.zzbhn;
      ((PowerManager.WakeLock)localObject).setWorkSource(localWorkSource);
      return;
      label56:
      this.zzbhn = paramWorkSource;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */