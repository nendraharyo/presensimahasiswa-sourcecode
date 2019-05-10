package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.AppMeasurement;

public class zzp
  extends zzz
{
  private final long zzaVj;
  private final char zzaWB;
  private final zzp.zza zzaWC;
  private final zzp.zza zzaWD;
  private final zzp.zza zzaWE;
  private final zzp.zza zzaWF;
  private final zzp.zza zzaWG;
  private final zzp.zza zzaWH;
  private final zzp.zza zzaWI;
  private final zzp.zza zzaWJ;
  private final zzp.zza zzaWK;
  private final String zzamn;
  
  zzp(zzw paramzzw)
  {
    super(paramzzw);
    Object localObject = zzCp().zzBz();
    this.zzamn = ((String)localObject);
    long l = zzCp().zzBp();
    this.zzaVj = l;
    localObject = zzCp();
    boolean bool2 = ((zzd)localObject).zzks();
    if (bool2)
    {
      localObject = zzCp();
      bool2 = ((zzd)localObject).zzkr();
      if (bool2) {}
      for (char c1 = 'P';; c1 = 'C')
      {
        this.zzaWB = c1;
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, i, false, false);
        this.zzaWC = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, i, bool1, false);
        this.zzaWD = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, i, false, bool1);
        this.zzaWE = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, j, false, false);
        this.zzaWF = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, j, bool1, false);
        this.zzaWG = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, j, false, bool1);
        this.zzaWH = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, 4, false, false);
        this.zzaWI = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, 3, false, false);
        this.zzaWJ = ((zzp.zza)localObject);
        localObject = new com/google/android/gms/measurement/internal/zzp$zza;
        ((zzp.zza)localObject).<init>(this, 2, false, false);
        this.zzaWK = ((zzp.zza)localObject);
        return;
      }
    }
    localObject = zzCp();
    boolean bool3 = ((zzd)localObject).zzkr();
    if (bool3) {}
    for (char c2 = 'p';; c2 = 'c')
    {
      this.zzaWB = c2;
      break;
    }
  }
  
  static String zza(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if (paramString == null) {
      paramString = "";
    }
    String str1 = zzc(paramBoolean, paramObject1);
    String str2 = zzc(paramBoolean, paramObject2);
    String str3 = zzc(paramBoolean, paramObject3);
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
    }
    return localStringBuilder.toString();
  }
  
  static String zzc(boolean paramBoolean, Object paramObject)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    double d1 = 10.0D;
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = "";
      return (String)localObject1;
    }
    boolean bool1 = paramObject instanceof Integer;
    long l1;
    if (bool1)
    {
      paramObject = (Integer)paramObject;
      int j = ((Integer)paramObject).intValue();
      l1 = j;
    }
    for (Object localObject2 = Long.valueOf(l1);; localObject2 = paramObject)
    {
      boolean bool2 = localObject2 instanceof Long;
      Object localObject3;
      if (bool2)
      {
        if (!paramBoolean)
        {
          localObject1 = String.valueOf(localObject2);
          break;
        }
        localObject1 = localObject2;
        localObject1 = (Long)localObject2;
        long l2 = Math.abs(((Long)localObject1).longValue());
        long l3 = 100;
        bool2 = l2 < l3;
        if (bool2)
        {
          localObject1 = String.valueOf(localObject2);
          break;
        }
        localObject1 = String.valueOf(localObject2);
        int k = ((String)localObject1).charAt(0);
        i = 45;
        if (k == i) {}
        for (localObject1 = "-";; localObject1 = "")
        {
          localObject2 = String.valueOf(Math.abs(((Long)localObject2).longValue()));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder = localStringBuilder.append((String)localObject1);
          int i1 = ((String)localObject2).length() + -1;
          double d2 = i1;
          l2 = Math.round(Math.pow(d1, d2));
          localStringBuilder = localStringBuilder.append(l2);
          localObject3 = "...";
          localStringBuilder = localStringBuilder.append((String)localObject3);
          localObject1 = localStringBuilder.append((String)localObject1);
          int i2 = ((String)localObject2).length();
          double d3 = i2;
          d3 = Math.pow(d1, d3);
          l2 = 4607182418800017408L;
          d2 = 1.0D;
          d3 -= d2;
          long l4 = Math.round(d3);
          localObject1 = l4;
          break;
        }
      }
      int m = localObject2 instanceof Boolean;
      if (m != 0)
      {
        localObject1 = String.valueOf(localObject2);
        break;
      }
      m = localObject2 instanceof Throwable;
      if (m != 0)
      {
        localObject2 = (Throwable)localObject2;
        localObject3 = new java/lang/StringBuilder;
        localObject1 = ((Throwable)localObject2).toString();
        ((StringBuilder)localObject3).<init>((String)localObject1);
        String str1 = zzff(AppMeasurement.class.getCanonicalName());
        String str2 = zzff(zzw.class.getCanonicalName());
        localObject2 = ((Throwable)localObject2).getStackTrace();
        int i3 = localObject2.length;
        m = 0;
        localObject1 = null;
        if (m < i3)
        {
          localStringBuilder = localObject2[m];
          boolean bool3 = localStringBuilder.isNativeMethod();
          if (bool3) {}
          do
          {
            do
            {
              int n;
              m += 1;
              break;
              str3 = localStringBuilder.getClassName();
            } while (str3 == null);
            String str3 = zzff(str3);
            boolean bool4 = str3.equals(str1);
            if (bool4) {
              break label483;
            }
            bool3 = str3.equals(str2);
          } while (!bool3);
          label483:
          localObject1 = ": ";
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append(localStringBuilder);
        }
        localObject1 = ((StringBuilder)localObject3).toString();
        break;
      }
      if (paramBoolean)
      {
        localObject1 = "-";
        break;
      }
      localObject1 = String.valueOf(localObject2);
      break;
    }
  }
  
  private static String zzff(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      paramString = "";
    }
    for (;;)
    {
      return paramString;
      int i = paramString.lastIndexOf('.');
      int j = -1;
      if (i != j)
      {
        j = 0;
        paramString = paramString.substring(0, i);
      }
    }
  }
  
  public zzp.zza zzCE()
  {
    return this.zzaWC;
  }
  
  public zzp.zza zzCF()
  {
    return this.zzaWF;
  }
  
  public zzp.zza zzCG()
  {
    return this.zzaWG;
  }
  
  public zzp.zza zzCH()
  {
    return this.zzaWH;
  }
  
  public zzp.zza zzCI()
  {
    return this.zzaWI;
  }
  
  public zzp.zza zzCJ()
  {
    return this.zzaWJ;
  }
  
  public zzp.zza zzCK()
  {
    return this.zzaWK;
  }
  
  public String zzCL()
  {
    Object localObject = zzCo().zzaXi.zzlN();
    if (localObject == null) {}
    StringBuilder localStringBuilder;
    for (localObject = null;; localObject = (String)localObject)
    {
      return (String)localObject;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = String.valueOf(((Pair)localObject).second);
      localStringBuilder = localStringBuilder.append(str);
      str = ":";
      localStringBuilder = localStringBuilder.append(str);
      localObject = (String)((Pair)localObject).first;
    }
  }
  
  protected boolean zzQ(int paramInt)
  {
    return Log.isLoggable(this.zzamn, paramInt);
  }
  
  protected void zza(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject;
    if (!paramBoolean1)
    {
      boolean bool = zzQ(paramInt);
      if (bool)
      {
        bool = false;
        localObject = zza(false, paramString, paramObject1, paramObject2, paramObject3);
        zzl(paramInt, (String)localObject);
      }
    }
    if (!paramBoolean2)
    {
      int i = 5;
      if (paramInt >= i)
      {
        localObject = this;
        zzb(paramInt, paramString, paramObject1, paramObject2, paramObject3);
      }
    }
  }
  
  public void zzb(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 1024;
    Object localObject1 = null;
    char c = '\006';
    zzx.zzz(paramString);
    Object localObject2 = this.zzaTV;
    zzv localzzv = ((zzw)localObject2).zzCU();
    if (localzzv == null)
    {
      localObject1 = "Scheduler not set. Not logging error/warn.";
      zzl(c, (String)localObject1);
    }
    for (;;)
    {
      return;
      boolean bool = localzzv.isInitialized();
      if (!bool)
      {
        localObject1 = "Scheduler not initialized. Not logging error/warn.";
        zzl(c, (String)localObject1);
      }
      else
      {
        bool = localzzv.zzDi();
        if (!bool) {
          break;
        }
        localObject1 = "Scheduler shutdown. Not logging error/warn.";
        zzl(c, (String)localObject1);
      }
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    localObject2 = "01VDIWEA?";
    int k = ((String)localObject2).length();
    if (paramInt >= k)
    {
      localObject2 = "01VDIWEA?";
      k = ((String)localObject2).length();
      paramInt = k + -1;
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("1");
    c = "01VDIWEA?".charAt(paramInt);
    localObject2 = ((StringBuilder)localObject2).append(c);
    c = this.zzaWB;
    localObject2 = ((StringBuilder)localObject2).append(c);
    long l = this.zzaVj;
    localObject2 = ((StringBuilder)localObject2).append(l).append(":");
    String str = zza(true, paramString, paramObject1, paramObject2, paramObject3);
    localObject2 = str;
    int j = ((String)localObject2).length();
    if (j > i) {}
    for (localObject1 = paramString.substring(0, i);; localObject1 = localObject2)
    {
      localObject2 = new com/google/android/gms/measurement/internal/zzp$1;
      ((zzp.1)localObject2).<init>(this, (String)localObject1);
      localzzv.zzg((Runnable)localObject2);
      break;
    }
  }
  
  protected void zziJ() {}
  
  protected void zzl(int paramInt, String paramString)
  {
    String str = this.zzamn;
    Log.println(paramInt, str, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */