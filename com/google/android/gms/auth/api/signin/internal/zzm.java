package com.google.android.gms.auth.api.signin.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class zzm
{
  private static final WeakHashMap zzXE;
  private static final Lock zzXF;
  private final Lock zzXG;
  private final Map zzXH;
  
  static
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    zzXE = (WeakHashMap)localObject;
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    zzXF = (Lock)localObject;
  }
  
  private zzm(Map paramMap)
  {
    ReentrantLock localReentrantLock = new java/util/concurrent/locks/ReentrantLock;
    localReentrantLock.<init>();
    this.zzXG = localReentrantLock;
    this.zzXH = paramMap;
  }
  
  public static zzm zzbN(String paramString)
  {
    zzx.zzcM(paramString);
    Object localObject1 = zzXF;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = zzXE;
      localObject1 = ((WeakHashMap)localObject1).get(paramString);
      localObject1 = (zzm)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/auth/api/signin/internal/zzm;
        Object localObject3 = new com/google/android/gms/auth/api/signin/internal/zzm$zzb;
        int i = 20;
        ((zzm.zzb)localObject3).<init>(i);
        ((zzm)localObject1).<init>((Map)localObject3);
        localObject3 = zzXE;
        ((WeakHashMap)localObject3).put(paramString, localObject1);
      }
      return (zzm)localObject1;
    }
    finally
    {
      zzXF.unlock();
    }
  }
  
  public boolean zza(Set paramSet, zzm.zza paramzza)
  {
    zzx.zzz(paramSet);
    zzx.zzz(paramzza);
    int i = paramSet.size();
    boolean bool;
    Object localObject1;
    if (i != 0)
    {
      bool = paramzza.zzb();
      if (!bool) {}
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(paramSet);
      Collections.sort((List)localObject1);
      this.zzXG.lock();
      Object localObject3 = " ";
      try
      {
        localObject1 = TextUtils.join((CharSequence)localObject3, (Iterable)localObject1);
        localObject3 = this.zzXH;
        ((Map)localObject3).put(localObject1, paramzza);
        bool = true;
        localObject3 = this.zzXG;
        ((Lock)localObject3).unlock();
      }
      finally
      {
        this.zzXG.unlock();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */