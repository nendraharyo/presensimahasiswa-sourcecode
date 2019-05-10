package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zzg;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Future;

public class zzn
  extends zzd
{
  private volatile String zzPO;
  private Future zzRr;
  
  protected zzn(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private boolean zzh(Context paramContext, String paramString)
  {
    boolean bool = false;
    Object localObject1 = null;
    zzx.zzcM(paramString);
    zzx.zzcE("ClientId should be saved from worker thread");
    Object localObject3 = null;
    Object localObject4 = "Storing clientId";
    for (;;)
    {
      try
      {
        zza((String)localObject4, paramString);
        localObject4 = "gaClientId";
        str = null;
        localObject3 = paramContext.openFileOutput((String)localObject4, 0);
        localObject4 = paramString.getBytes();
        ((FileOutputStream)localObject3).write((byte[])localObject4);
        bool = true;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        str = "Error creating clientId file";
        zze(str, localFileNotFoundException);
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject3).close();
        }
        catch (IOException localIOException2)
        {
          localObject3 = "Failed to close clientId writing stream";
          zze((String)localObject3, localIOException2);
        }
        continue;
      }
      catch (IOException localIOException3)
      {
        String str = "Error writing to clientId file";
        zze(str, localIOException3);
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject3).close();
        }
        catch (IOException localIOException4)
        {
          localObject3 = "Failed to close clientId writing stream";
          zze((String)localObject3, localIOException4);
        }
        continue;
      }
      finally
      {
        if (localObject3 == null) {
          break label189;
        }
      }
      try
      {
        ((FileOutputStream)localObject3).close();
        return bool;
      }
      catch (IOException localIOException1)
      {
        localObject3 = "Failed to close clientId writing stream";
        zze((String)localObject3, localIOException1);
      }
    }
    try
    {
      ((FileOutputStream)localObject3).close();
      label189:
      throw ((Throwable)localObject2);
    }
    catch (IOException localIOException5)
    {
      for (;;)
      {
        localObject3 = "Failed to close clientId writing stream";
        zze((String)localObject3, localIOException5);
      }
    }
  }
  
  private String zzkn()
  {
    String str1 = zzko();
    try
    {
      localObject = zzjo();
      localObject = ((zzg)localObject).getContext();
      boolean bool = zzh((Context)localObject, str1);
      if (!bool) {
        str1 = "0";
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = "Error saving clientId file";
        zze((String)localObject, localException);
        String str2 = "0";
      }
    }
    return str1;
  }
  
  /* Error */
  protected String zzac(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 97
    //   4: invokestatic 28	com/google/android/gms/common/internal/zzx:zzcE	(Ljava/lang/String;)V
    //   7: ldc 36
    //   9: astore_3
    //   10: aload_1
    //   11: aload_3
    //   12: invokevirtual 101	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   15: astore 4
    //   17: bipush 36
    //   19: istore 5
    //   21: iload 5
    //   23: newarray <illegal type>
    //   25: astore 6
    //   27: iconst_0
    //   28: istore 5
    //   30: aconst_null
    //   31: astore_3
    //   32: aload 6
    //   34: arraylength
    //   35: istore 7
    //   37: aload 4
    //   39: aload 6
    //   41: iconst_0
    //   42: iload 7
    //   44: invokevirtual 108	java/io/FileInputStream:read	([BII)I
    //   47: istore 7
    //   49: aload 4
    //   51: invokevirtual 112	java/io/FileInputStream:available	()I
    //   54: istore 5
    //   56: iload 5
    //   58: ifle +52 -> 110
    //   61: ldc 114
    //   63: astore_3
    //   64: aload_0
    //   65: aload_3
    //   66: invokevirtual 117	com/google/android/gms/analytics/internal/zzn:zzbg	(Ljava/lang/String;)V
    //   69: aload 4
    //   71: invokevirtual 118	java/io/FileInputStream:close	()V
    //   74: ldc 36
    //   76: astore_3
    //   77: aload_1
    //   78: aload_3
    //   79: invokevirtual 122	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   82: pop
    //   83: aload 4
    //   85: ifnull +8 -> 93
    //   88: aload 4
    //   90: invokevirtual 118	java/io/FileInputStream:close	()V
    //   93: aload_2
    //   94: areturn
    //   95: astore_3
    //   96: ldc 124
    //   98: astore 4
    //   100: aload_0
    //   101: aload 4
    //   103: aload_3
    //   104: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   107: goto -14 -> 93
    //   110: bipush 14
    //   112: istore 5
    //   114: iload 7
    //   116: iload 5
    //   118: if_icmpge +53 -> 171
    //   121: ldc 127
    //   123: astore_3
    //   124: aload_0
    //   125: aload_3
    //   126: invokevirtual 117	com/google/android/gms/analytics/internal/zzn:zzbg	(Ljava/lang/String;)V
    //   129: aload 4
    //   131: invokevirtual 118	java/io/FileInputStream:close	()V
    //   134: ldc 36
    //   136: astore_3
    //   137: aload_1
    //   138: aload_3
    //   139: invokevirtual 122	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   142: pop
    //   143: aload 4
    //   145: ifnull -52 -> 93
    //   148: aload 4
    //   150: invokevirtual 118	java/io/FileInputStream:close	()V
    //   153: goto -60 -> 93
    //   156: astore_3
    //   157: ldc 124
    //   159: astore 4
    //   161: aload_0
    //   162: aload 4
    //   164: aload_3
    //   165: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   168: goto -75 -> 93
    //   171: aload 4
    //   173: invokevirtual 118	java/io/FileInputStream:close	()V
    //   176: new 44	java/lang/String
    //   179: astore_3
    //   180: aload_3
    //   181: aload 6
    //   183: iconst_0
    //   184: iload 7
    //   186: invokespecial 130	java/lang/String:<init>	([BII)V
    //   189: ldc -124
    //   191: astore 6
    //   193: aload_0
    //   194: aload 6
    //   196: aload_3
    //   197: invokevirtual 34	com/google/android/gms/analytics/internal/zzn:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   200: aload 4
    //   202: ifnull +8 -> 210
    //   205: aload 4
    //   207: invokevirtual 118	java/io/FileInputStream:close	()V
    //   210: aload_3
    //   211: astore_2
    //   212: goto -119 -> 93
    //   215: astore_2
    //   216: ldc 124
    //   218: astore 4
    //   220: aload_0
    //   221: aload 4
    //   223: aload_2
    //   224: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   227: goto -17 -> 210
    //   230: astore_3
    //   231: iconst_0
    //   232: istore 5
    //   234: aconst_null
    //   235: astore_3
    //   236: aload_3
    //   237: ifnull -144 -> 93
    //   240: aload_3
    //   241: invokevirtual 118	java/io/FileInputStream:close	()V
    //   244: goto -151 -> 93
    //   247: astore_3
    //   248: ldc 124
    //   250: astore 4
    //   252: aload_0
    //   253: aload 4
    //   255: aload_3
    //   256: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   259: goto -166 -> 93
    //   262: astore_3
    //   263: aconst_null
    //   264: astore 4
    //   266: ldc -122
    //   268: astore 6
    //   270: aload_0
    //   271: aload 6
    //   273: aload_3
    //   274: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   277: ldc 36
    //   279: astore_3
    //   280: aload_1
    //   281: aload_3
    //   282: invokevirtual 122	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   285: pop
    //   286: aload 4
    //   288: ifnull -195 -> 93
    //   291: aload 4
    //   293: invokevirtual 118	java/io/FileInputStream:close	()V
    //   296: goto -203 -> 93
    //   299: astore_3
    //   300: ldc 124
    //   302: astore 4
    //   304: aload_0
    //   305: aload 4
    //   307: aload_3
    //   308: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   311: goto -218 -> 93
    //   314: astore_3
    //   315: aconst_null
    //   316: astore 4
    //   318: aload_3
    //   319: astore_2
    //   320: aload 4
    //   322: ifnull +8 -> 330
    //   325: aload 4
    //   327: invokevirtual 118	java/io/FileInputStream:close	()V
    //   330: aload_2
    //   331: athrow
    //   332: astore_3
    //   333: ldc 124
    //   335: astore 4
    //   337: aload_0
    //   338: aload 4
    //   340: aload_3
    //   341: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   344: goto -14 -> 330
    //   347: astore_2
    //   348: goto -28 -> 320
    //   351: astore_3
    //   352: goto -86 -> 266
    //   355: astore_3
    //   356: aload 4
    //   358: astore_3
    //   359: goto -123 -> 236
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	this	zzn
    //   0	362	1	paramContext	Context
    //   1	211	2	localObject1	Object
    //   215	9	2	localIOException1	IOException
    //   319	12	2	localObject2	Object
    //   347	1	2	localObject3	Object
    //   9	70	3	str1	String
    //   95	9	3	localIOException2	IOException
    //   123	16	3	str2	String
    //   156	9	3	localIOException3	IOException
    //   179	32	3	str3	String
    //   230	1	3	localFileNotFoundException1	FileNotFoundException
    //   235	6	3	localObject4	Object
    //   247	9	3	localIOException4	IOException
    //   262	12	3	localIOException5	IOException
    //   279	3	3	str4	String
    //   299	9	3	localIOException6	IOException
    //   314	5	3	localObject5	Object
    //   332	9	3	localIOException7	IOException
    //   351	1	3	localIOException8	IOException
    //   355	1	3	localFileNotFoundException2	FileNotFoundException
    //   358	1	3	localObject6	Object
    //   15	342	4	localObject7	Object
    //   19	214	5	i	int
    //   25	247	6	localObject8	Object
    //   35	150	7	j	int
    // Exception table:
    //   from	to	target	type
    //   88	93	95	java/io/IOException
    //   148	153	156	java/io/IOException
    //   205	210	215	java/io/IOException
    //   11	15	230	java/io/FileNotFoundException
    //   240	244	247	java/io/IOException
    //   11	15	262	java/io/IOException
    //   291	296	299	java/io/IOException
    //   11	15	314	finally
    //   325	330	332	java/io/IOException
    //   21	25	347	finally
    //   32	35	347	finally
    //   42	47	347	finally
    //   49	54	347	finally
    //   65	69	347	finally
    //   69	74	347	finally
    //   78	83	347	finally
    //   125	129	347	finally
    //   129	134	347	finally
    //   138	143	347	finally
    //   171	176	347	finally
    //   176	179	347	finally
    //   184	189	347	finally
    //   196	200	347	finally
    //   273	277	347	finally
    //   281	286	347	finally
    //   21	25	351	java/io/IOException
    //   32	35	351	java/io/IOException
    //   42	47	351	java/io/IOException
    //   49	54	351	java/io/IOException
    //   65	69	351	java/io/IOException
    //   69	74	351	java/io/IOException
    //   78	83	351	java/io/IOException
    //   125	129	351	java/io/IOException
    //   129	134	351	java/io/IOException
    //   138	143	351	java/io/IOException
    //   171	176	351	java/io/IOException
    //   176	179	351	java/io/IOException
    //   184	189	351	java/io/IOException
    //   196	200	351	java/io/IOException
    //   21	25	355	java/io/FileNotFoundException
    //   32	35	355	java/io/FileNotFoundException
    //   42	47	355	java/io/FileNotFoundException
    //   49	54	355	java/io/FileNotFoundException
    //   65	69	355	java/io/FileNotFoundException
    //   69	74	355	java/io/FileNotFoundException
    //   78	83	355	java/io/FileNotFoundException
    //   125	129	355	java/io/FileNotFoundException
    //   129	134	355	java/io/FileNotFoundException
    //   138	143	355	java/io/FileNotFoundException
    //   171	176	355	java/io/FileNotFoundException
    //   176	179	355	java/io/FileNotFoundException
    //   184	189	355	java/io/FileNotFoundException
    //   196	200	355	java/io/FileNotFoundException
  }
  
  protected void zziJ() {}
  
  /* Error */
  public String zzkk()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 137	com/google/android/gms/analytics/internal/zzn:zzjv	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +28 -> 40
    //   15: aload_0
    //   16: invokevirtual 79	com/google/android/gms/analytics/internal/zzn:zzjo	()Lcom/google/android/gms/measurement/zzg;
    //   19: astore_1
    //   20: new 141	com/google/android/gms/analytics/internal/zzn$1
    //   23: astore_2
    //   24: aload_2
    //   25: aload_0
    //   26: invokespecial 144	com/google/android/gms/analytics/internal/zzn$1:<init>	(Lcom/google/android/gms/analytics/internal/zzn;)V
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 148	com/google/android/gms/measurement/zzg:zzc	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   34: astore_1
    //   35: aload_0
    //   36: aload_1
    //   37: putfield 150	com/google/android/gms/analytics/internal/zzn:zzRr	Ljava/util/concurrent/Future;
    //   40: aload_0
    //   41: getfield 150	com/google/android/gms/analytics/internal/zzn:zzRr	Ljava/util/concurrent/Future;
    //   44: astore_1
    //   45: aload_1
    //   46: ifnull +63 -> 109
    //   49: aload_0
    //   50: getfield 150	com/google/android/gms/analytics/internal/zzn:zzRr	Ljava/util/concurrent/Future;
    //   53: astore_1
    //   54: aload_1
    //   55: invokeinterface 156 1 0
    //   60: astore_1
    //   61: aload_1
    //   62: checkcast 44	java/lang/String
    //   65: astore_1
    //   66: aload_0
    //   67: aload_1
    //   68: putfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   71: aload_0
    //   72: getfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   75: astore_1
    //   76: aload_1
    //   77: ifnonnull +11 -> 88
    //   80: ldc 91
    //   82: astore_1
    //   83: aload_0
    //   84: aload_1
    //   85: putfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   88: ldc -98
    //   90: astore_1
    //   91: aload_0
    //   92: getfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   95: astore_2
    //   96: aload_0
    //   97: aload_1
    //   98: aload_2
    //   99: invokevirtual 34	com/google/android/gms/analytics/internal/zzn:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   102: aconst_null
    //   103: astore_1
    //   104: aload_0
    //   105: aconst_null
    //   106: putfield 150	com/google/android/gms/analytics/internal/zzn:zzRr	Ljava/util/concurrent/Future;
    //   109: aload_0
    //   110: getfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: areturn
    //   118: astore_1
    //   119: ldc -96
    //   121: astore_2
    //   122: aload_0
    //   123: aload_2
    //   124: aload_1
    //   125: invokevirtual 163	com/google/android/gms/analytics/internal/zzn:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   128: ldc 91
    //   130: astore_1
    //   131: aload_0
    //   132: aload_1
    //   133: putfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   136: goto -65 -> 71
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    //   144: astore_1
    //   145: ldc -91
    //   147: astore_2
    //   148: aload_0
    //   149: aload_2
    //   150: aload_1
    //   151: invokevirtual 64	com/google/android/gms/analytics/internal/zzn:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   154: ldc 91
    //   156: astore_1
    //   157: aload_0
    //   158: aload_1
    //   159: putfield 139	com/google/android/gms/analytics/internal/zzn:zzPO	Ljava/lang/String;
    //   162: goto -91 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	zzn
    //   10	107	1	localObject1	Object
    //   118	7	1	localInterruptedException	InterruptedException
    //   130	3	1	str1	String
    //   139	4	1	localObject2	Object
    //   144	7	1	localExecutionException	java.util.concurrent.ExecutionException
    //   156	3	1	str2	String
    //   23	127	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   49	53	118	java/lang/InterruptedException
    //   54	60	118	java/lang/InterruptedException
    //   61	65	118	java/lang/InterruptedException
    //   67	71	118	java/lang/InterruptedException
    //   6	10	139	finally
    //   15	19	139	finally
    //   20	23	139	finally
    //   25	29	139	finally
    //   30	34	139	finally
    //   36	40	139	finally
    //   40	44	139	finally
    //   49	53	139	finally
    //   54	60	139	finally
    //   61	65	139	finally
    //   67	71	139	finally
    //   71	75	139	finally
    //   84	88	139	finally
    //   91	95	139	finally
    //   98	102	139	finally
    //   105	109	139	finally
    //   109	113	139	finally
    //   114	116	139	finally
    //   124	128	139	finally
    //   132	136	139	finally
    //   140	142	139	finally
    //   150	154	139	finally
    //   158	162	139	finally
    //   49	53	144	java/util/concurrent/ExecutionException
    //   54	60	144	java/util/concurrent/ExecutionException
    //   61	65	144	java/util/concurrent/ExecutionException
    //   67	71	144	java/util/concurrent/ExecutionException
  }
  
  String zzkl()
  {
    Object localObject1 = null;
    try
    {
      this.zzPO = null;
      localObject1 = zzjo();
      zzn.2 local2 = new com/google/android/gms/analytics/internal/zzn$2;
      local2.<init>(this);
      localObject1 = ((zzg)localObject1).zzc(local2);
      this.zzRr = ((Future)localObject1);
      return zzkk();
    }
    finally {}
  }
  
  String zzkm()
  {
    Object localObject = zzjo().getContext();
    localObject = zzac((Context)localObject);
    if (localObject == null) {
      localObject = zzkn();
    }
    return (String)localObject;
  }
  
  protected String zzko()
  {
    return UUID.randomUUID().toString().toLowerCase();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */