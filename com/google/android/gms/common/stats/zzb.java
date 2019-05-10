package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.zzlz;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zznf;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class zzb
{
  private static final Object zzalX;
  private static zzb zzanp;
  private static Integer zzanv;
  private final List zzanq;
  private final List zzanr;
  private final List zzans;
  private final List zzant;
  private zze zzanu;
  private zze zzanw;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzalX = localObject;
  }
  
  private zzb()
  {
    int j = getLogLevel();
    int k = zzd.LOG_LEVEL_OFF;
    if (j == k)
    {
      localObject1 = Collections.EMPTY_LIST;
      this.zzanq = ((List)localObject1);
      localObject1 = Collections.EMPTY_LIST;
      this.zzanr = ((List)localObject1);
      localObject1 = Collections.EMPTY_LIST;
      this.zzans = ((List)localObject1);
      localObject1 = Collections.EMPTY_LIST;
      this.zzant = ((List)localObject1);
      return;
    }
    Object localObject1 = (String)zzc.zza.zzanA.get();
    if (localObject1 == null)
    {
      localObject1 = Collections.EMPTY_LIST;
      label87:
      this.zzanq = ((List)localObject1);
      localObject1 = (String)zzc.zza.zzanB.get();
      if (localObject1 != null) {
        break label266;
      }
      localObject1 = Collections.EMPTY_LIST;
      label114:
      this.zzanr = ((List)localObject1);
      localObject1 = (String)zzc.zza.zzanC.get();
      if (localObject1 != null) {
        break label285;
      }
      localObject1 = Collections.EMPTY_LIST;
      label141:
      this.zzans = ((List)localObject1);
      localObject1 = (String)zzc.zza.zzanD.get();
      if (localObject1 != null) {
        break label304;
      }
    }
    Object localObject2;
    for (localObject1 = Collections.EMPTY_LIST;; localObject1 = Arrays.asList(((String)localObject1).split((String)localObject2)))
    {
      this.zzant = ((List)localObject1);
      localObject2 = new com/google/android/gms/common/stats/zze;
      long l = ((Long)zzc.zza.zzanE.get()).longValue();
      ((zze)localObject2).<init>(i, l);
      this.zzanu = ((zze)localObject2);
      localObject2 = new com/google/android/gms/common/stats/zze;
      localObject1 = (Long)zzc.zza.zzanE.get();
      l = ((Long)localObject1).longValue();
      ((zze)localObject2).<init>(i, l);
      this.zzanw = ((zze)localObject2);
      break;
      localObject2 = ",";
      localObject1 = Arrays.asList(((String)localObject1).split((String)localObject2));
      break label87;
      label266:
      localObject2 = ",";
      localObject1 = Arrays.asList(((String)localObject1).split((String)localObject2));
      break label114;
      label285:
      localObject2 = ",";
      localObject1 = Arrays.asList(((String)localObject1).split((String)localObject2));
      break label141;
      label304:
      localObject2 = ",";
    }
  }
  
  private static int getLogLevel()
  {
    Object localObject = zzanv;
    if (localObject == null) {}
    for (;;)
    {
      try
      {
        boolean bool = zzmp.zzkr();
        if (!bool) {
          continue;
        }
        localObject = zzc.zza.zzanz;
        localObject = ((zzlz)localObject).get();
        localObject = (Integer)localObject;
        i = ((Integer)localObject).intValue();
        localObject = Integer.valueOf(i);
        zzanv = (Integer)localObject;
      }
      catch (SecurityException localSecurityException)
      {
        int i = zzd.LOG_LEVEL_OFF;
        Integer localInteger = Integer.valueOf(i);
        zzanv = localInteger;
        continue;
      }
      return zzanv.intValue();
      i = zzd.LOG_LEVEL_OFF;
    }
  }
  
  private void zza(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    long l1 = System.currentTimeMillis();
    String str = null;
    int i = getLogLevel();
    int j = zzd.zzanJ;
    i &= j;
    if (i != 0)
    {
      i = 13;
      if (paramInt != i)
      {
        i = 3;
        j = 5;
        str = zznf.zzn(i, j);
      }
    }
    long l2 = 0L;
    i = getLogLevel();
    j = zzd.zzanL;
    i &= j;
    if (i != 0) {
      l2 = Debug.getNativeHeapAllocatedSize();
    }
    i = 1;
    if (paramInt != i)
    {
      i = 4;
      if (paramInt != i)
      {
        i = 14;
        if (paramInt != i) {
          break label184;
        }
      }
    }
    Object localObject = new com/google/android/gms/common/stats/ConnectionEvent;
    long l3 = SystemClock.elapsedRealtime();
    j = paramInt;
    ((ConnectionEvent)localObject).<init>(l1, paramInt, null, null, null, null, str, paramString1, l3, l2);
    for (;;)
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      ComponentName localComponentName = zzd.zzanF;
      localObject = localIntent.setComponent(localComponentName).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", (Parcelable)localObject);
      paramContext.startService((Intent)localObject);
      return;
      label184:
      localObject = new com/google/android/gms/common/stats/ConnectionEvent;
      l3 = SystemClock.elapsedRealtime();
      j = paramInt;
      ((ConnectionEvent)localObject).<init>(l1, paramInt, paramString2, paramString3, paramString4, paramString5, str, paramString1, l3, l2);
    }
  }
  
  private void zza(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    int i = 1;
    String str1 = null;
    String str2 = null;
    boolean bool1 = zzrQ();
    Object localObject1;
    if (bool1)
    {
      localObject1 = this.zzanu;
      if (localObject1 != null) {
        break label32;
      }
    }
    label32:
    boolean bool2;
    do
    {
      return;
      int j = 4;
      if ((paramInt != j) && (paramInt != i)) {
        break;
      }
      localObject1 = this.zzanu;
      bool2 = ((zze)localObject1).zzcT(paramString1);
    } while (!bool2);
    String str3 = null;
    String str4 = null;
    for (;;)
    {
      localObject1 = this;
      Object localObject2 = paramContext;
      Object localObject3 = paramString1;
      zza(paramContext, paramString1, paramInt, str2, paramString2, str4, str3);
      break;
      localObject1 = zzd(paramContext, paramIntent);
      if (localObject1 == null)
      {
        localObject1 = "ConnectionTracker";
        int k = 2;
        localObject3 = new Object[k];
        localObject3[0] = paramString2;
        str1 = paramIntent.toUri(0);
        localObject3[i] = str1;
        localObject2 = String.format("Client %s made an invalid request %s", (Object[])localObject3);
        Log.w((String)localObject1, (String)localObject2);
        break;
      }
      str4 = ((ServiceInfo)localObject1).processName;
      str3 = ((ServiceInfo)localObject1).name;
      str2 = zznf.zzaz(paramContext);
      bool2 = zzb(str2, paramString2, str4, str3);
      if (!bool2) {
        break;
      }
      localObject1 = this.zzanu;
      ((zze)localObject1).zzcS(paramString1);
    }
  }
  
  private String zzb(ServiceConnection paramServiceConnection)
  {
    long l1 = Process.myPid() << 32;
    long l2 = System.identityHashCode(paramServiceConnection);
    return String.valueOf(l1 | l2);
  }
  
  private boolean zzb(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = getLogLevel();
    List localList = this.zzanq;
    boolean bool = localList.contains(paramString1);
    if (!bool)
    {
      localList = this.zzanr;
      bool = localList.contains(paramString2);
      if (!bool)
      {
        localList = this.zzans;
        bool = localList.contains(paramString3);
        if (!bool)
        {
          localList = this.zzant;
          bool = localList.contains(paramString4);
          if (!bool)
          {
            bool = paramString3.equals(paramString1);
            if (!bool) {
              break label125;
            }
            int k = zzd.zzanK;
            i &= k;
            if (i == 0) {
              break label125;
            }
          }
        }
      }
    }
    label125:
    int j;
    for (i = 0;; j = 1) {
      return i;
    }
  }
  
  private boolean zzc(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getComponent();
    boolean bool2;
    if (localObject != null)
    {
      boolean bool1 = com.google.android.gms.common.internal.zzd.zzakE;
      if (bool1)
      {
        String str1 = "com.google.android.gms";
        String str2 = ((ComponentName)localObject).getPackageName();
        bool1 = str1.equals(str2);
        if (!bool1) {}
      }
    }
    else
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool2;
      localObject = ((ComponentName)localObject).getPackageName();
      bool2 = zzmp.zzk(paramContext, (String)localObject);
    }
  }
  
  private static ServiceInfo zzd(Context paramContext, Intent paramIntent)
  {
    int i = 20;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject1 = paramContext.getPackageManager();
    int n = 128;
    localObject1 = ((PackageManager)localObject1).queryIntentServices(paramIntent, n);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (localObject1 != null)
    {
      n = ((List)localObject1).size();
      if (n != 0) {}
    }
    else
    {
      localObject2 = new Object[k];
      localObject3 = paramIntent.toUri(0);
      localObject2[0] = localObject3;
      localObject3 = zznf.zzn(j, i);
      localObject2[m] = localObject3;
      localObject4 = String.format("There are no handler of this intent: %s\n Stack trace: %s", (Object[])localObject2);
      Log.w("ConnectionTracker", (String)localObject4);
      localObject1 = null;
    }
    for (;;)
    {
      return (ServiceInfo)localObject1;
      n = ((List)localObject1).size();
      if (n > m)
      {
        localObject3 = new Object[k];
        String str = paramIntent.toUri(0);
        localObject3[0] = str;
        str = zznf.zzn(j, i);
        localObject3[m] = str;
        localObject2 = String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", (Object[])localObject3);
        Log.w("ConnectionTracker", (String)localObject2);
        localObject4 = ((List)localObject1).iterator();
        boolean bool = ((Iterator)localObject4).hasNext();
        if (bool)
        {
          localObject1 = (ResolveInfo)((Iterator)localObject4).next();
          localObject4 = "ConnectionTracker";
          localObject1 = ((ResolveInfo)localObject1).serviceInfo.name;
          Log.w((String)localObject4, (String)localObject1);
          localObject1 = null;
          continue;
        }
      }
      localObject1 = ((ResolveInfo)((List)localObject1).get(0)).serviceInfo;
    }
  }
  
  public static zzb zzrP()
  {
    synchronized (zzalX)
    {
      zzb localzzb = zzanp;
      if (localzzb == null)
      {
        localzzb = new com/google/android/gms/common/stats/zzb;
        localzzb.<init>();
        zzanp = localzzb;
      }
      return zzanp;
    }
  }
  
  private boolean zzrQ()
  {
    boolean bool1 = false;
    boolean bool2 = com.google.android.gms.common.internal.zzd.zzakE;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      int i = getLogLevel();
      int j = zzd.LOG_LEVEL_OFF;
      if (i != j) {
        bool1 = true;
      }
    }
  }
  
  public void zza(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    String str = zzb(paramServiceConnection);
    zza(paramContext, str, null, null, 1);
  }
  
  public void zza(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent)
  {
    String str = zzb(paramServiceConnection);
    zza(paramContext, str, paramString, paramIntent, 3);
  }
  
  public boolean zza(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    String str = paramContext.getClass().getName();
    return zza(paramContext, str, paramIntent, paramServiceConnection, paramInt);
  }
  
  public boolean zza(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    boolean bool1 = zzc(paramContext, paramIntent);
    Object localObject;
    if (bool1)
    {
      localObject = "Attempted to bind to a service in a STOPPED package.";
      Log.w("ConnectionTracker", (String)localObject);
    }
    boolean bool2;
    for (bool1 = false;; bool1 = bool2)
    {
      return bool1;
      bool2 = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
      if (bool2)
      {
        String str = zzb(paramServiceConnection);
        int i = 2;
        localObject = paramContext;
        zza(paramContext, str, paramString, paramIntent, i);
      }
    }
  }
  
  public void zzb(Context paramContext, ServiceConnection paramServiceConnection)
  {
    String str = zzb(paramServiceConnection);
    zza(paramContext, str, null, null, 4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */