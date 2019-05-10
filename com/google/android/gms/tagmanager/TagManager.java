package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager
{
  private static TagManager zzblm;
  private final Context mContext;
  private final DataLayer zzbhN;
  private final zzs zzbkh;
  private final TagManager.zza zzblj;
  private final zzct zzblk;
  private final ConcurrentMap zzbll;
  
  TagManager(Context paramContext, TagManager.zza paramzza, DataLayer paramDataLayer, zzct paramzzct)
  {
    if (paramContext == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("context cannot be null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject1);
    this.zzblk = paramzzct;
    this.zzblj = paramzza;
    localObject1 = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject1).<init>();
    this.zzbll = ((ConcurrentMap)localObject1);
    this.zzbhN = paramDataLayer;
    localObject1 = this.zzbhN;
    Object localObject2 = new com/google/android/gms/tagmanager/TagManager$1;
    ((TagManager.1)localObject2).<init>(this);
    ((DataLayer)localObject1).zza((DataLayer.zzb)localObject2);
    localObject1 = this.zzbhN;
    localObject2 = new com/google/android/gms/tagmanager/zzd;
    Context localContext = this.mContext;
    ((zzd)localObject2).<init>(localContext);
    ((DataLayer)localObject1).zza((DataLayer.zzb)localObject2);
    localObject1 = new com/google/android/gms/tagmanager/zzs;
    ((zzs)localObject1).<init>();
    this.zzbkh = ((zzs)localObject1);
    zzHt();
  }
  
  public static TagManager getInstance(Context paramContext)
  {
    synchronized (TagManager.class)
    {
      Object localObject1 = zzblm;
      if (localObject1 != null) {
        break label91;
      }
      if (paramContext == null)
      {
        localObject1 = "TagManager.getInstance requires non-null context.";
        zzbg.e((String)localObject1);
        localObject1 = new java/lang/NullPointerException;
        ((NullPointerException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    Object localObject3 = new com/google/android/gms/tagmanager/TagManager$2;
    ((TagManager.2)localObject3).<init>();
    Object localObject4 = new com/google/android/gms/tagmanager/zzw;
    ((zzw)localObject4).<init>(paramContext);
    TagManager localTagManager = new com/google/android/gms/tagmanager/TagManager;
    DataLayer localDataLayer = new com/google/android/gms/tagmanager/DataLayer;
    localDataLayer.<init>((DataLayer.zzc)localObject4);
    localObject4 = zzcu.zzHo();
    localTagManager.<init>(paramContext, (TagManager.zza)localObject3, localDataLayer, (zzct)localObject4);
    zzblm = localTagManager;
    label91:
    localObject3 = zzblm;
    return (TagManager)localObject3;
  }
  
  private void zzHt()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      Context localContext = this.mContext;
      TagManager.3 local3 = new com/google/android/gms/tagmanager/TagManager$3;
      local3.<init>(this);
      localContext.registerComponentCallbacks(local3);
    }
  }
  
  private void zzgp(String paramString)
  {
    Object localObject = this.zzbll.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzo)localIterator.next();
      ((zzo)localObject).zzfR(paramString);
    }
  }
  
  public void dispatch()
  {
    this.zzblk.dispatch();
  }
  
  public DataLayer getDataLayer()
  {
    return this.zzbhN;
  }
  
  public PendingResult loadContainerDefaultOnly(String paramString, int paramInt)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, null, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGg();
    return (PendingResult)localObject;
  }
  
  public PendingResult loadContainerDefaultOnly(String paramString, int paramInt, Handler paramHandler)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    Looper localLooper = paramHandler.getLooper();
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, localLooper, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGg();
    return (PendingResult)localObject;
  }
  
  public PendingResult loadContainerPreferFresh(String paramString, int paramInt)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, null, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGi();
    return (PendingResult)localObject;
  }
  
  public PendingResult loadContainerPreferFresh(String paramString, int paramInt, Handler paramHandler)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    Looper localLooper = paramHandler.getLooper();
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, localLooper, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGi();
    return (PendingResult)localObject;
  }
  
  public PendingResult loadContainerPreferNonDefault(String paramString, int paramInt)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, null, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGh();
    return (PendingResult)localObject;
  }
  
  public PendingResult loadContainerPreferNonDefault(String paramString, int paramInt, Handler paramHandler)
  {
    Object localObject = this.zzblj;
    Context localContext = this.mContext;
    Looper localLooper = paramHandler.getLooper();
    zzs localzzs = this.zzbkh;
    localObject = ((TagManager.zza)localObject).zza(localContext, this, localLooper, paramString, paramInt, localzzs);
    ((zzp)localObject).zzGh();
    return (PendingResult)localObject;
  }
  
  public void setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 2;; i = 5)
    {
      zzbg.setLogLevel(i);
      return;
    }
  }
  
  public void zza(zzo paramzzo)
  {
    ConcurrentMap localConcurrentMap = this.zzbll;
    Boolean localBoolean = Boolean.valueOf(true);
    localConcurrentMap.put(paramzzo, localBoolean);
  }
  
  public boolean zzb(zzo paramzzo)
  {
    Object localObject = this.zzbll.remove(paramzzo);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  boolean zzp(Uri paramUri)
  {
    for (;;)
    {
      String str1;
      Object localObject5;
      try
      {
        localObject1 = zzcb.zzGU();
        boolean bool1 = ((zzcb)localObject1).zzp(paramUri);
        if (!bool1) {
          break label301;
        }
        str1 = ((zzcb)localObject1).getContainerId();
        localObject2 = TagManager.4.zzblo;
        localObject5 = ((zzcb)localObject1).zzGV();
        int j = ((zzcb.zza)localObject5).ordinal();
        int i = localObject2[j];
        switch (i)
        {
        default: 
          i = 1;
          return i;
        }
      }
      finally {}
      Object localObject2 = this.zzbll;
      localObject2 = ((ConcurrentMap)localObject2).keySet();
      Object localObject1 = ((Set)localObject2).iterator();
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (bool2)
      {
        localObject2 = ((Iterator)localObject1).next();
        localObject2 = (zzo)localObject2;
        localObject5 = ((zzo)localObject2).getContainerId();
        boolean bool3 = ((String)localObject5).equals(str1);
        if (bool3)
        {
          bool3 = false;
          localObject5 = null;
          ((zzo)localObject2).zzfT(null);
          ((zzo)localObject2).refresh();
          continue;
          Object localObject4 = this.zzbll;
          localObject4 = ((ConcurrentMap)localObject4).keySet();
          localObject5 = ((Set)localObject4).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject5).hasNext();
            if (!bool2) {
              break;
            }
            localObject4 = ((Iterator)localObject5).next();
            localObject4 = (zzo)localObject4;
            String str2 = ((zzo)localObject4).getContainerId();
            boolean bool4 = str2.equals(str1);
            if (bool4)
            {
              str2 = ((zzcb)localObject1).zzGW();
              ((zzo)localObject4).zzfT(str2);
              ((zzo)localObject4).refresh();
            }
            else
            {
              str2 = ((zzo)localObject4).zzGd();
              if (str2 != null)
              {
                bool4 = false;
                str2 = null;
                ((zzo)localObject4).zzfT(null);
                ((zzo)localObject4).refresh();
              }
            }
          }
          label301:
          bool2 = false;
          localObject4 = null;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\TagManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */