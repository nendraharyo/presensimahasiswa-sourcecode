package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.zzc;

public class zzd
  extends zzy
{
  static final String zzaVA = String.valueOf(zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
  private Boolean zzRy;
  
  zzd(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  public int zzBA()
  {
    return 25;
  }
  
  int zzBB()
  {
    return 32;
  }
  
  public int zzBC()
  {
    return 24;
  }
  
  int zzBD()
  {
    return 36;
  }
  
  int zzBE()
  {
    return 256;
  }
  
  public int zzBF()
  {
    return 36;
  }
  
  public int zzBG()
  {
    return 2048;
  }
  
  int zzBH()
  {
    return 500;
  }
  
  public long zzBI()
  {
    return ((Integer)zzl.zzaWk.get()).intValue();
  }
  
  public long zzBJ()
  {
    return ((Integer)zzl.zzaWl.get()).intValue();
  }
  
  public long zzBK()
  {
    return ((Integer)zzl.zzaWm.get()).intValue();
  }
  
  int zzBL()
  {
    return 25;
  }
  
  int zzBM()
  {
    return 50;
  }
  
  long zzBN()
  {
    return 3600000L;
  }
  
  long zzBO()
  {
    return 60000L;
  }
  
  long zzBP()
  {
    return 61000L;
  }
  
  public long zzBQ()
  {
    return ((Long)zzl.zzaWw.get()).longValue();
  }
  
  public long zzBR()
  {
    return ((Long)zzl.zzaWs.get()).longValue();
  }
  
  public long zzBS()
  {
    return 1000L;
  }
  
  public int zzBT()
  {
    int i = ((Integer)zzl.zzaWi.get()).intValue();
    return Math.max(0, i);
  }
  
  public int zzBU()
  {
    int i = ((Integer)zzl.zzaWj.get()).intValue();
    return Math.max(1, i);
  }
  
  public String zzBV()
  {
    return (String)zzl.zzaWo.get();
  }
  
  public long zzBW()
  {
    return ((Long)zzl.zzaWd.get()).longValue();
  }
  
  public long zzBX()
  {
    long l = ((Long)zzl.zzaWp.get()).longValue();
    return Math.max(0L, l);
  }
  
  public long zzBY()
  {
    long l = ((Long)zzl.zzaWr.get()).longValue();
    return Math.max(0L, l);
  }
  
  public long zzBZ()
  {
    return ((Long)zzl.zzaWq.get()).longValue();
  }
  
  public long zzBp()
  {
    return zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000;
  }
  
  String zzBz()
  {
    return (String)zzl.zzaWa.get();
  }
  
  public long zzCa()
  {
    long l = ((Long)zzl.zzaWt.get()).longValue();
    return Math.max(0L, l);
  }
  
  public long zzCb()
  {
    long l = ((Long)zzl.zzaWu.get()).longValue();
    return Math.max(0L, l);
  }
  
  public int zzCc()
  {
    int i = ((Integer)zzl.zzaWv.get()).intValue();
    i = Math.max(0, i);
    return Math.min(20, i);
  }
  
  public String zzH(String paramString1, String paramString2)
  {
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    Object localObject1 = (String)zzl.zzaWe.get();
    Object localObject2 = localBuilder.scheme((String)localObject1);
    localObject1 = (String)zzl.zzaWf.get();
    localObject1 = ((Uri.Builder)localObject2).authority((String)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "config/app/" + paramString1;
    localObject1 = ((Uri.Builder)localObject1).path((String)localObject2).appendQueryParameter("app_instance_id", paramString2).appendQueryParameter("platform", "android");
    String str = String.valueOf(zzBp());
    ((Uri.Builder)localObject1).appendQueryParameter("gmp_version", str);
    return localBuilder.build().toString();
  }
  
  public long zza(String paramString, zzl.zza paramzza)
  {
    Object localObject;
    long l;
    if (paramString == null)
    {
      localObject = (Long)paramzza.get();
      l = ((Long)localObject).longValue();
    }
    for (;;)
    {
      return l;
      localObject = zzCl();
      String str = paramzza.getKey();
      localObject = ((zzu)localObject).zzO(paramString, str);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = (Long)paramzza.get();
        l = ((Long)localObject).longValue();
      }
      else
      {
        try
        {
          localObject = Long.valueOf((String)localObject);
          l = ((Long)localObject).longValue();
          localObject = Long.valueOf(l);
          localObject = paramzza.get(localObject);
          localObject = (Long)localObject;
          l = ((Long)localObject).longValue();
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Long localLong = (Long)paramzza.get();
          l = localLong.longValue();
        }
      }
    }
  }
  
  public int zzb(String paramString, zzl.zza paramzza)
  {
    Object localObject;
    int i;
    if (paramString == null)
    {
      localObject = (Integer)paramzza.get();
      i = ((Integer)localObject).intValue();
    }
    for (;;)
    {
      return i;
      localObject = zzCl();
      String str = paramzza.getKey();
      localObject = ((zzu)localObject).zzO(paramString, str);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = (Integer)paramzza.get();
        i = ((Integer)localObject).intValue();
      }
      else
      {
        try
        {
          localObject = Integer.valueOf((String)localObject);
          i = ((Integer)localObject).intValue();
          localObject = Integer.valueOf(i);
          localObject = paramzza.get(localObject);
          localObject = (Integer)localObject;
          i = ((Integer)localObject).intValue();
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Integer localInteger = (Integer)paramzza.get();
          i = localInteger.intValue();
        }
      }
    }
  }
  
  long zzeS(String paramString)
  {
    zzl.zza localzza = zzl.zzaWb;
    return zza(paramString, localzza);
  }
  
  int zzeT(String paramString)
  {
    zzl.zza localzza = zzl.zzaWx;
    return zzb(paramString, localzza);
  }
  
  public int zzeU(String paramString)
  {
    zzl.zza localzza = zzl.zzaWg;
    return zzb(paramString, localzza);
  }
  
  public int zzeV(String paramString)
  {
    zzl.zza localzza = zzl.zzaWh;
    int i = zzb(paramString, localzza);
    return Math.max(0, i);
  }
  
  public int zzeW(String paramString)
  {
    zzl.zza localzza = zzl.zzaWn;
    int i = zzb(paramString, localzza);
    i = Math.min(1000000, i);
    return Math.max(0, i);
  }
  
  long zzkM()
  {
    return ((Long)zzl.zzaWy.get()).longValue();
  }
  
  public String zzkR()
  {
    return "google_app_measurement.db";
  }
  
  public String zzkS()
  {
    return "google_app_measurement2.db";
  }
  
  public long zzkX()
  {
    long l = ((Long)zzl.zzaWc.get()).longValue();
    return Math.max(0L, l);
  }
  
  public boolean zzkr()
  {
    return com.google.android.gms.common.internal.zzd.zzakE;
  }
  
  /* Error */
  public boolean zzks()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +117 -> 123
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +104 -> 121
    //   20: aload_0
    //   21: invokevirtual 345	com/google/android/gms/measurement/internal/zzd:getContext	()Landroid/content/Context;
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 351	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   29: astore_1
    //   30: aload_0
    //   31: invokevirtual 345	com/google/android/gms/measurement/internal/zzd:getContext	()Landroid/content/Context;
    //   34: astore_2
    //   35: invokestatic 356	android/os/Process:myPid	()I
    //   38: istore_3
    //   39: aload_2
    //   40: iload_3
    //   41: invokestatic 362	com/google/android/gms/internal/zznf:zzi	(Landroid/content/Context;I)Ljava/lang/String;
    //   44: astore_2
    //   45: aload_1
    //   46: ifnull +38 -> 84
    //   49: aload_1
    //   50: getfield 367	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   53: astore_1
    //   54: aload_1
    //   55: ifnull +76 -> 131
    //   58: aload_1
    //   59: aload_2
    //   60: invokevirtual 371	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +64 -> 131
    //   70: iconst_1
    //   71: istore 4
    //   73: iload 4
    //   75: invokestatic 376	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   78: astore_1
    //   79: aload_0
    //   80: aload_1
    //   81: putfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   84: aload_0
    //   85: getfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   88: astore_1
    //   89: aload_1
    //   90: ifnonnull +31 -> 121
    //   93: getstatic 379	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   96: astore_1
    //   97: aload_0
    //   98: aload_1
    //   99: putfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   102: aload_0
    //   103: invokevirtual 380	com/google/android/gms/measurement/internal/zzd:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   106: astore_1
    //   107: aload_1
    //   108: invokevirtual 386	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   111: astore_1
    //   112: ldc_w 388
    //   115: astore_2
    //   116: aload_1
    //   117: aload_2
    //   118: invokevirtual 394	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_0
    //   124: getfield 344	com/google/android/gms/measurement/internal/zzd:zzRy	Ljava/lang/Boolean;
    //   127: invokevirtual 398	java/lang/Boolean:booleanValue	()Z
    //   130: ireturn
    //   131: iconst_0
    //   132: istore 4
    //   134: aconst_null
    //   135: astore_1
    //   136: goto -63 -> 73
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	zzd
    //   4	132	1	localObject1	Object
    //   139	4	1	localObject2	Object
    //   34	84	2	localObject3	Object
    //   38	3	3	i	int
    //   63	70	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	15	139	finally
    //   20	24	139	finally
    //   25	29	139	finally
    //   30	34	139	finally
    //   35	38	139	finally
    //   40	44	139	finally
    //   49	53	139	finally
    //   59	63	139	finally
    //   73	78	139	finally
    //   80	84	139	finally
    //   84	88	139	finally
    //   93	96	139	finally
    //   98	102	139	finally
    //   102	106	139	finally
    //   107	111	139	finally
    //   117	121	139	finally
    //   121	123	139	finally
    //   140	142	139	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */