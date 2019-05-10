package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.zzg;

public class zzc
{
  private final zzf zzQj;
  
  protected zzc(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    this.zzQj = paramzzf;
  }
  
  private void zza(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject1 = null;
    Object localObject2 = this.zzQj;
    if (localObject2 != null) {
      localObject1 = this.zzQj.zzjy();
    }
    if (localObject1 != null)
    {
      int i = paramInt;
      ((zzaf)localObject1).zza(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
    for (;;)
    {
      return;
      localObject1 = (String)zzy.zzRL.get();
      boolean bool = Log.isLoggable((String)localObject1, paramInt);
      if (bool)
      {
        localObject2 = zzc(paramString, paramObject1, paramObject2, paramObject3);
        Log.println(paramInt, (String)localObject1, (String)localObject2);
      }
    }
  }
  
  protected static String zzc(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if (paramString == null) {
      paramString = "";
    }
    String str1 = zzj(paramObject1);
    String str2 = zzj(paramObject2);
    String str3 = zzj(paramObject3);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str4 = "";
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (!bool1)
    {
      localStringBuilder.append(paramString);
      str4 = ": ";
    }
    bool1 = TextUtils.isEmpty(str1);
    if (!bool1)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str1);
      str4 = ", ";
    }
    boolean bool2 = TextUtils.isEmpty(str2);
    if (!bool2)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str2);
      str4 = ", ";
    }
    bool2 = TextUtils.isEmpty(str3);
    if (!bool2)
    {
      localStringBuilder.append(str4);
      localStringBuilder.append(str3);
      str4 = ", ";
    }
    return localStringBuilder.toString();
  }
  
  private static String zzj(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = "";
    }
    for (;;)
    {
      return (String)paramObject;
      boolean bool = paramObject instanceof String;
      if (bool)
      {
        paramObject = (String)paramObject;
      }
      else
      {
        bool = paramObject instanceof Boolean;
        if (bool)
        {
          Object localObject = Boolean.TRUE;
          if (paramObject == localObject) {}
          for (localObject = "true";; localObject = "false")
          {
            paramObject = localObject;
            break;
          }
        }
        bool = paramObject instanceof Throwable;
        if (bool) {
          paramObject = ((Throwable)paramObject).toString();
        } else {
          paramObject = paramObject.toString();
        }
      }
    }
  }
  
  protected Context getContext()
  {
    return this.zzQj.getContext();
  }
  
  public void zza(String paramString, Object paramObject)
  {
    zza(2, paramString, paramObject, null, null);
  }
  
  public void zza(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(2, paramString, paramObject1, paramObject2, null);
  }
  
  public void zza(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza(3, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public void zzb(String paramString, Object paramObject)
  {
    zza(3, paramString, paramObject, null, null);
  }
  
  public void zzb(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(3, paramString, paramObject1, paramObject2, null);
  }
  
  public void zzb(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza(5, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public void zzbd(String paramString)
  {
    zza(2, paramString, null, null, null);
  }
  
  public void zzbe(String paramString)
  {
    zza(3, paramString, null, null, null);
  }
  
  public void zzbf(String paramString)
  {
    zza(4, paramString, null, null, null);
  }
  
  public void zzbg(String paramString)
  {
    zza(5, paramString, null, null, null);
  }
  
  public void zzbh(String paramString)
  {
    zza(6, paramString, null, null, null);
  }
  
  public void zzc(String paramString, Object paramObject)
  {
    zza(4, paramString, paramObject, null, null);
  }
  
  public void zzc(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(5, paramString, paramObject1, paramObject2, null);
  }
  
  public void zzd(String paramString, Object paramObject)
  {
    zza(5, paramString, paramObject, null, null);
  }
  
  public void zzd(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(6, paramString, paramObject1, paramObject2, null);
  }
  
  public void zze(String paramString, Object paramObject)
  {
    zza(6, paramString, paramObject, null, null);
  }
  
  public boolean zzhp()
  {
    return Log.isLoggable((String)zzy.zzRL.get(), 2);
  }
  
  public GoogleAnalytics zziC()
  {
    return this.zzQj.zzjz();
  }
  
  protected zzb zziH()
  {
    return this.zzQj.zziH();
  }
  
  protected zzan zziI()
  {
    return this.zzQj.zziI();
  }
  
  public zzf zzji()
  {
    return this.zzQj;
  }
  
  protected void zzjj()
  {
    Object localObject = zzjn();
    boolean bool = ((zzr)localObject).zzkr();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call only supported on the client side");
      throw ((Throwable)localObject);
    }
  }
  
  protected void zzjk()
  {
    this.zzQj.zzjk();
  }
  
  protected zzmq zzjl()
  {
    return this.zzQj.zzjl();
  }
  
  protected zzaf zzjm()
  {
    return this.zzQj.zzjm();
  }
  
  protected zzr zzjn()
  {
    return this.zzQj.zzjn();
  }
  
  protected zzg zzjo()
  {
    return this.zzQj.zzjo();
  }
  
  protected zzv zzjp()
  {
    return this.zzQj.zzjp();
  }
  
  protected zzai zzjq()
  {
    return this.zzQj.zzjq();
  }
  
  protected zzn zzjr()
  {
    return this.zzQj.zzjC();
  }
  
  protected zza zzjs()
  {
    return this.zzQj.zzjB();
  }
  
  protected zzk zzjt()
  {
    return this.zzQj.zzjt();
  }
  
  protected zzu zzju()
  {
    return this.zzQj.zzju();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */