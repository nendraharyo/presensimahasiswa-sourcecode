package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class zzk
  implements Comparable
{
  private final zzs.zza zzD;
  private final int zzE;
  private final String zzF;
  private final int zzG;
  private final zzm.zza zzH;
  private Integer zzI;
  private zzl zzJ;
  private boolean zzK;
  private boolean zzL;
  private boolean zzM;
  private long zzN;
  private zzo zzO;
  private zzb.zza zzP;
  
  public zzk(int paramInt, String paramString, zzm.zza paramzza)
  {
    boolean bool = zzs.zza.zzak;
    Object localObject;
    if (bool)
    {
      localObject = new com/google/android/gms/internal/zzs$zza;
      ((zzs.zza)localObject).<init>();
    }
    for (;;)
    {
      this.zzD = ((zzs.zza)localObject);
      this.zzK = true;
      this.zzL = false;
      this.zzM = false;
      this.zzN = 0L;
      this.zzP = null;
      this.zzE = paramInt;
      this.zzF = paramString;
      this.zzH = paramzza;
      localObject = new com/google/android/gms/internal/zzd;
      ((zzd)localObject).<init>();
      zza((zzo)localObject);
      int i = zzb(paramString);
      this.zzG = i;
      return;
      i = 0;
      localObject = null;
    }
  }
  
  private byte[] zza(Map paramMap, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    try
    {
      Object localObject2 = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      Object localObject3;
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = localIterator.next();
        localObject2 = (Map.Entry)localObject2;
        localObject3 = ((Map.Entry)localObject2).getKey();
        localObject3 = (String)localObject3;
        localObject3 = URLEncoder.encode((String)localObject3, paramString);
        ((StringBuilder)localObject1).append((String)localObject3);
        char c2 = '=';
        ((StringBuilder)localObject1).append(c2);
        localObject2 = ((Map.Entry)localObject2).getValue();
        localObject2 = (String)localObject2;
        localObject2 = URLEncoder.encode((String)localObject2, paramString);
        ((StringBuilder)localObject1).append((String)localObject2);
        char c1 = '&';
        ((StringBuilder)localObject1).append(c1);
      }
      str = ((StringBuilder)localObject1).toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject3 = new java/lang/RuntimeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Encoding not supported: " + paramString;
      ((RuntimeException)localObject3).<init>((String)localObject1, localUnsupportedEncodingException);
      throw ((Throwable)localObject3);
    }
    String str;
    return str.getBytes(paramString);
  }
  
  private static int zzb(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject;
    int i;
    if (!bool)
    {
      localObject = Uri.parse(paramString);
      if (localObject != null)
      {
        localObject = ((Uri)localObject).getHost();
        if (localObject != null) {
          i = ((String)localObject).hashCode();
        }
      }
    }
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  public Map getHeaders()
  {
    return Collections.emptyMap();
  }
  
  public int getMethod()
  {
    return this.zzE;
  }
  
  public String getUrl()
  {
    return this.zzF;
  }
  
  public boolean isCanceled()
  {
    return this.zzL;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("0x");
    int i = zzg();
    Object localObject2 = Integer.toHexString(i);
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = ((StringBuilder)localObject1).toString();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    boolean bool = this.zzL;
    if (bool) {}
    for (localObject1 = "[X] ";; localObject1 = "[ ] ")
    {
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = getUrl();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3).append(" ").append((String)localObject2).append(" ");
      localObject2 = zzs();
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(" ");
      localObject2 = this.zzI;
      return (String)localObject2;
    }
  }
  
  public final zzk zza(int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    this.zzI = localInteger;
    return this;
  }
  
  public zzk zza(zzb.zza paramzza)
  {
    this.zzP = paramzza;
    return this;
  }
  
  public zzk zza(zzl paramzzl)
  {
    this.zzJ = paramzzl;
    return this;
  }
  
  public zzk zza(zzo paramzzo)
  {
    this.zzO = paramzzo;
    return this;
  }
  
  protected abstract zzm zza(zzi paramzzi);
  
  protected abstract void zza(Object paramObject);
  
  protected zzr zzb(zzr paramzzr)
  {
    return paramzzr;
  }
  
  public int zzc(zzk paramzzk)
  {
    Object localObject1 = zzs();
    Object localObject2 = paramzzk.zzs();
    int i;
    int j;
    if (localObject1 == localObject2)
    {
      localObject1 = this.zzI;
      i = ((Integer)localObject1).intValue();
      localObject2 = paramzzk.zzI;
      j = ((Integer)localObject2).intValue();
      i -= j;
    }
    for (;;)
    {
      return i;
      j = ((zzk.zza)localObject2).ordinal();
      i = ((zzk.zza)localObject1).ordinal();
      i = j - i;
    }
  }
  
  public void zzc(zzr paramzzr)
  {
    zzm.zza localzza = this.zzH;
    if (localzza != null)
    {
      localzza = this.zzH;
      localzza.zze(paramzzr);
    }
  }
  
  public void zzc(String paramString)
  {
    boolean bool = zzs.zza.zzak;
    long l1;
    if (bool)
    {
      zzs.zza localzza = this.zzD;
      Thread localThread = Thread.currentThread();
      l1 = localThread.getId();
      localzza.zza(paramString, l1);
    }
    for (;;)
    {
      return;
      long l2 = this.zzN;
      l1 = 0L;
      bool = l2 < l1;
      if (!bool)
      {
        l2 = SystemClock.elapsedRealtime();
        this.zzN = l2;
      }
    }
  }
  
  void zzd(String paramString)
  {
    Object localObject1 = this.zzJ;
    if (localObject1 != null)
    {
      localObject1 = this.zzJ;
      ((zzl)localObject1).zzf(this);
    }
    boolean bool1 = zzs.zza.zzak;
    long l1;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      localObject1 = Thread.currentThread();
      l1 = ((Thread)localObject1).getId();
      localObject2 = Looper.myLooper();
      localObject3 = Looper.getMainLooper();
      if (localObject2 != localObject3)
      {
        localObject2 = new android/os/Handler;
        localObject3 = Looper.getMainLooper();
        ((Handler)localObject2).<init>((Looper)localObject3);
        localObject3 = new com/google/android/gms/internal/zzk$1;
        ((zzk.1)localObject3).<init>(this, paramString, l1);
        ((Handler)localObject2).post((Runnable)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.zzD;
      ((zzs.zza)localObject2).zza(paramString, l1);
      localObject1 = this.zzD;
      String str = toString();
      ((zzs.zza)localObject1).zzd(str);
      continue;
      l1 = SystemClock.elapsedRealtime();
      long l2 = this.zzN;
      l1 -= l2;
      l2 = 3000L;
      boolean bool2 = l1 < l2;
      if (!bool2)
      {
        localObject2 = "%d ms: %s";
        int i = 2;
        localObject3 = new Object[i];
        localObject1 = Long.valueOf(l1);
        localObject3[0] = localObject1;
        bool1 = true;
        str = toString();
        localObject3[bool1] = str;
        zzs.zzb((String)localObject2, (Object[])localObject3);
      }
    }
  }
  
  public int zzg()
  {
    return this.zzG;
  }
  
  public String zzh()
  {
    return getUrl();
  }
  
  public zzb.zza zzi()
  {
    return this.zzP;
  }
  
  protected Map zzj()
  {
    return zzn();
  }
  
  protected String zzk()
  {
    return zzo();
  }
  
  public String zzl()
  {
    return zzp();
  }
  
  public byte[] zzm()
  {
    Object localObject = zzj();
    String str;
    if (localObject != null)
    {
      int i = ((Map)localObject).size();
      if (i > 0) {
        str = zzk();
      }
    }
    for (localObject = zza((Map)localObject, str);; localObject = null) {
      return (byte[])localObject;
    }
  }
  
  protected Map zzn()
  {
    return null;
  }
  
  protected String zzo()
  {
    return "UTF-8";
  }
  
  public String zzp()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("application/x-www-form-urlencoded; charset=");
    String str = zzo();
    return str;
  }
  
  public byte[] zzq()
  {
    Object localObject = zzn();
    String str;
    if (localObject != null)
    {
      int i = ((Map)localObject).size();
      if (i > 0) {
        str = zzo();
      }
    }
    for (localObject = zza((Map)localObject, str);; localObject = null) {
      return (byte[])localObject;
    }
  }
  
  public final boolean zzr()
  {
    return this.zzK;
  }
  
  public zzk.zza zzs()
  {
    return zzk.zza.zzU;
  }
  
  public final int zzt()
  {
    return this.zzO.zzd();
  }
  
  public zzo zzu()
  {
    return this.zzO;
  }
  
  public void zzv()
  {
    this.zzM = true;
  }
  
  public boolean zzw()
  {
    return this.zzM;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */