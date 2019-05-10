package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container
{
  private final Context mContext;
  private final String zzbhM;
  private final DataLayer zzbhN;
  private zzcp zzbhO;
  private Map zzbhP;
  private Map zzbhQ;
  private volatile long zzbhR;
  private volatile String zzbhS;
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzaf.zzj paramzzj)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbhP = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbhQ = ((Map)localObject);
    this.zzbhS = "";
    this.mContext = paramContext;
    this.zzbhN = paramDataLayer;
    this.zzbhM = paramString;
    this.zzbhR = paramLong;
    localObject = paramzzj.zzju;
    zza((zzaf.zzf)localObject);
    localObject = paramzzj.zzjt;
    if (localObject != null)
    {
      localObject = paramzzj.zzjt;
      zza((zzaf.zzi[])localObject);
    }
  }
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzrs.zzc paramzzc)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzbhP = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzbhQ = localHashMap;
    this.zzbhS = "";
    this.mContext = paramContext;
    this.zzbhN = paramDataLayer;
    this.zzbhM = paramString;
    this.zzbhR = paramLong;
    zza(paramzzc);
  }
  
  private zzcp zzGc()
  {
    try
    {
      zzcp localzzcp = this.zzbhO;
      return localzzcp;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void zza(zzaf.zzf paramzzf)
  {
    Object localObject;
    if (paramzzf == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = zzrs.zzb(paramzzf);
      zza((zzrs.zzc)localObject);
      return;
    }
    catch (zzrs.zzg localzzg)
    {
      for (;;)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Not loading resource: ").append(paramzzf);
        String str2 = " because it is invalid: ";
        localStringBuilder = localStringBuilder.append(str2);
        String str1 = localzzg.toString();
        str1 = str1;
        zzbg.e(str1);
      }
    }
  }
  
  private void zza(zzrs.zzc paramzzc)
  {
    int i = 0;
    Object localObject1 = paramzzc.getVersion();
    this.zzbhS = ((String)localObject1);
    localObject1 = this.zzbhS;
    zzah localzzah = zzfS((String)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcp;
    Object localObject2 = this.mContext;
    DataLayer localDataLayer = this.zzbhN;
    Object localObject3 = new com/google/android/gms/tagmanager/Container$zza;
    ((Container.zza)localObject3).<init>(this, null);
    Container.zzb localzzb = new com/google/android/gms/tagmanager/Container$zzb;
    localzzb.<init>(this, null);
    Object localObject4 = paramzzc;
    ((zzcp)localObject1).<init>((Context)localObject2, paramzzc, localDataLayer, (zzt.zza)localObject3, localzzb, localzzah);
    zza((zzcp)localObject1);
    localObject1 = "_gtm.loadEventEnabled";
    boolean bool = getBoolean((String)localObject1);
    if (bool)
    {
      localObject1 = this.zzbhN;
      localObject2 = "gtm.load";
      i = 2;
      localObject4 = new Object[i];
      localDataLayer = null;
      localObject4[0] = "gtm.id";
      int j = 1;
      localObject3 = this.zzbhM;
      localObject4[j] = localObject3;
      localObject4 = DataLayer.mapOf((Object[])localObject4);
      ((DataLayer)localObject1).pushEvent((String)localObject2, (Map)localObject4);
    }
  }
  
  private void zza(zzcp paramzzcp)
  {
    try
    {
      this.zzbhO = paramzzcp;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void zza(zzaf.zzi[] paramArrayOfzzi)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfzzi.length;
    int j = 0;
    while (j < i)
    {
      zzaf.zzi localzzi = paramArrayOfzzi[j];
      localArrayList.add(localzzi);
      j += 1;
    }
    zzGc().zzF(localArrayList);
  }
  
  public boolean getBoolean(String paramString)
  {
    Object localObject1 = zzGc();
    boolean bool;
    if (localObject1 == null)
    {
      zzbg.e("getBoolean called for closed container.");
      localObject1 = zzdf.zzHC();
      bool = ((Boolean)localObject1).booleanValue();
    }
    for (;;)
    {
      return bool;
      try
      {
        localObject1 = ((zzcp)localObject1).zzgn(paramString);
        localObject1 = ((zzbw)localObject1).getObject();
        localObject1 = (zzag.zza)localObject1;
        localObject1 = zzdf.zzk((zzag.zza)localObject1);
        bool = ((Boolean)localObject1).booleanValue();
      }
      catch (Exception localException)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Calling getBoolean() threw an exception: ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        Object localObject2 = localException.getMessage();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " Returning default value.";
        zzbg.e((String)localObject3);
        localObject2 = zzdf.zzHC();
        bool = ((Boolean)localObject2).booleanValue();
      }
    }
  }
  
  public String getContainerId()
  {
    return this.zzbhM;
  }
  
  public double getDouble(String paramString)
  {
    Object localObject1 = zzGc();
    double d;
    if (localObject1 == null)
    {
      zzbg.e("getDouble called for closed container.");
      localObject1 = zzdf.zzHB();
      d = ((Double)localObject1).doubleValue();
    }
    for (;;)
    {
      return d;
      try
      {
        localObject1 = ((zzcp)localObject1).zzgn(paramString);
        localObject1 = ((zzbw)localObject1).getObject();
        localObject1 = (zzag.zza)localObject1;
        localObject1 = zzdf.zzj((zzag.zza)localObject1);
        d = ((Double)localObject1).doubleValue();
      }
      catch (Exception localException)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Calling getDouble() threw an exception: ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        Object localObject2 = localException.getMessage();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " Returning default value.";
        zzbg.e((String)localObject3);
        localObject2 = zzdf.zzHB();
        d = ((Double)localObject2).doubleValue();
      }
    }
  }
  
  public long getLastRefreshTime()
  {
    return this.zzbhR;
  }
  
  public long getLong(String paramString)
  {
    Object localObject1 = zzGc();
    long l;
    if (localObject1 == null)
    {
      zzbg.e("getLong called for closed container.");
      localObject1 = zzdf.zzHA();
      l = ((Long)localObject1).longValue();
    }
    for (;;)
    {
      return l;
      try
      {
        localObject1 = ((zzcp)localObject1).zzgn(paramString);
        localObject1 = ((zzbw)localObject1).getObject();
        localObject1 = (zzag.zza)localObject1;
        localObject1 = zzdf.zzi((zzag.zza)localObject1);
        l = ((Long)localObject1).longValue();
      }
      catch (Exception localException)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Calling getLong() threw an exception: ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        Object localObject2 = localException.getMessage();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " Returning default value.";
        zzbg.e((String)localObject3);
        localObject2 = zzdf.zzHA();
        l = ((Long)localObject2).longValue();
      }
    }
  }
  
  public String getString(String paramString)
  {
    Object localObject1 = zzGc();
    if (localObject1 == null)
    {
      zzbg.e("getString called for closed container.");
      localObject1 = zzdf.zzHE();
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        localObject1 = ((zzcp)localObject1).zzgn(paramString);
        localObject1 = ((zzbw)localObject1).getObject();
        localObject1 = (zzag.zza)localObject1;
        localObject1 = zzdf.zzg((zzag.zza)localObject1);
      }
      catch (Exception localException)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Calling getString() threw an exception: ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        Object localObject2 = localException.getMessage();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " Returning default value.";
        zzbg.e((String)localObject3);
        localObject2 = zzdf.zzHE();
      }
    }
  }
  
  public boolean isDefault()
  {
    long l1 = getLastRefreshTime();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void registerFunctionCallMacroCallback(String paramString, Container.FunctionCallMacroCallback paramFunctionCallMacroCallback)
  {
    Object localObject1;
    if (paramFunctionCallMacroCallback == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("Macro handler must be non-null");
      throw ((Throwable)localObject1);
    }
    synchronized (this.zzbhP)
    {
      localObject1 = this.zzbhP;
      ((Map)localObject1).put(paramString, paramFunctionCallMacroCallback);
      return;
    }
  }
  
  public void registerFunctionCallTagCallback(String paramString, Container.FunctionCallTagCallback paramFunctionCallTagCallback)
  {
    Object localObject1;
    if (paramFunctionCallTagCallback == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("Tag callback must be non-null");
      throw ((Throwable)localObject1);
    }
    synchronized (this.zzbhQ)
    {
      localObject1 = this.zzbhQ;
      ((Map)localObject1).put(paramString, paramFunctionCallTagCallback);
      return;
    }
  }
  
  void release()
  {
    this.zzbhO = null;
  }
  
  public void unregisterFunctionCallMacroCallback(String paramString)
  {
    synchronized (this.zzbhP)
    {
      Map localMap2 = this.zzbhP;
      localMap2.remove(paramString);
      return;
    }
  }
  
  public void unregisterFunctionCallTagCallback(String paramString)
  {
    synchronized (this.zzbhQ)
    {
      Map localMap2 = this.zzbhQ;
      localMap2.remove(paramString);
      return;
    }
  }
  
  public String zzGb()
  {
    return this.zzbhS;
  }
  
  Container.FunctionCallMacroCallback zzfP(String paramString)
  {
    synchronized (this.zzbhP)
    {
      Object localObject1 = this.zzbhP;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = (Container.FunctionCallMacroCallback)localObject1;
      return (Container.FunctionCallMacroCallback)localObject1;
    }
  }
  
  public Container.FunctionCallTagCallback zzfQ(String paramString)
  {
    synchronized (this.zzbhQ)
    {
      Object localObject1 = this.zzbhQ;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = (Container.FunctionCallTagCallback)localObject1;
      return (Container.FunctionCallTagCallback)localObject1;
    }
  }
  
  public void zzfR(String paramString)
  {
    zzGc().zzfR(paramString);
  }
  
  zzah zzfS(String paramString)
  {
    Object localObject = zzcb.zzGU().zzGV();
    zzcb.zza localzza = zzcb.zza.zzbjW;
    boolean bool = ((zzcb.zza)localObject).equals(localzza);
    if (bool) {}
    localObject = new com/google/android/gms/tagmanager/zzbo;
    ((zzbo)localObject).<init>();
    return (zzah)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\Container.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */