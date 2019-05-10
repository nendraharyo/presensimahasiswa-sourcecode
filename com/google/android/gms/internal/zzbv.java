package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzbv
{
  final Context mContext;
  final String zzsy;
  String zzxj;
  BlockingQueue zzxl;
  ExecutorService zzxm;
  LinkedHashMap zzxn;
  Map zzxo;
  private AtomicBoolean zzxp;
  private File zzxq;
  
  public zzbv(Context paramContext, String paramString1, String paramString2, Map paramMap)
  {
    Object localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    this.zzxn = ((LinkedHashMap)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzxo = ((Map)localObject1);
    this.mContext = paramContext;
    this.zzsy = paramString1;
    this.zzxj = paramString2;
    localObject1 = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject1).<init>(false);
    this.zzxp = ((AtomicBoolean)localObject1);
    Object localObject2 = this.zzxp;
    boolean bool = ((Boolean)zzbt.zzwi.get()).booleanValue();
    ((AtomicBoolean)localObject2).set(bool);
    localObject1 = this.zzxp;
    bool = ((AtomicBoolean)localObject1).get();
    if (bool)
    {
      localObject1 = Environment.getExternalStorageDirectory();
      if (localObject1 != null)
      {
        localObject2 = new java/io/File;
        localObject3 = "sdk_csi_data.txt";
        ((File)localObject2).<init>((File)localObject1, (String)localObject3);
        this.zzxq = ((File)localObject2);
      }
    }
    localObject1 = paramMap.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = this.zzxn;
      Object localObject4 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      ((LinkedHashMap)localObject3).put(localObject4, localObject1);
    }
    localObject1 = new java/util/concurrent/ArrayBlockingQueue;
    ((ArrayBlockingQueue)localObject1).<init>(30);
    this.zzxl = ((BlockingQueue)localObject1);
    localObject1 = Executors.newSingleThreadExecutor();
    this.zzxm = ((ExecutorService)localObject1);
    localObject1 = this.zzxm;
    localObject2 = new com/google/android/gms/internal/zzbv$1;
    ((zzbv.1)localObject2).<init>(this);
    ((ExecutorService)localObject1).execute((Runnable)localObject2);
    localObject1 = this.zzxo;
    Object localObject3 = zzby.zzxt;
    ((Map)localObject1).put("action", localObject3);
    localObject1 = this.zzxo;
    localObject3 = zzby.zzxt;
    ((Map)localObject1).put("ad_format", localObject3);
    localObject1 = this.zzxo;
    localObject3 = zzby.zzxu;
    ((Map)localObject1).put("e", localObject3);
  }
  
  /* Error */
  private void zza(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +147 -> 148
    //   4: aconst_null
    //   5: astore_3
    //   6: new 166	java/io/FileOutputStream
    //   9: astore 4
    //   11: iconst_1
    //   12: istore 5
    //   14: aload 4
    //   16: aload_1
    //   17: iload 5
    //   19: invokespecial 170	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   22: aload_2
    //   23: invokevirtual 176	java/lang/String:getBytes	()[B
    //   26: astore 6
    //   28: aload 4
    //   30: aload 6
    //   32: invokevirtual 180	java/io/FileOutputStream:write	([B)V
    //   35: bipush 10
    //   37: istore 5
    //   39: aload 4
    //   41: iload 5
    //   43: invokevirtual 183	java/io/FileOutputStream:write	(I)V
    //   46: aload 4
    //   48: ifnull +8 -> 56
    //   51: aload 4
    //   53: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   56: return
    //   57: astore 6
    //   59: ldc -68
    //   61: astore 4
    //   63: aload 4
    //   65: aload 6
    //   67: invokestatic 194	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   70: goto -14 -> 56
    //   73: astore 6
    //   75: aconst_null
    //   76: astore 4
    //   78: ldc -60
    //   80: astore_3
    //   81: aload_3
    //   82: aload 6
    //   84: invokestatic 194	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   87: aload 4
    //   89: ifnull -33 -> 56
    //   92: aload 4
    //   94: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   97: goto -41 -> 56
    //   100: astore 6
    //   102: ldc -68
    //   104: astore 4
    //   106: aload 4
    //   108: aload 6
    //   110: invokestatic 194	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: goto -57 -> 56
    //   116: astore 6
    //   118: aconst_null
    //   119: astore 4
    //   121: aload 4
    //   123: ifnull +8 -> 131
    //   126: aload 4
    //   128: invokevirtual 186	java/io/FileOutputStream:close	()V
    //   131: aload 6
    //   133: athrow
    //   134: astore 4
    //   136: ldc -68
    //   138: astore_3
    //   139: aload_3
    //   140: aload 4
    //   142: invokestatic 194	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   145: goto -14 -> 131
    //   148: ldc -58
    //   150: astore 6
    //   152: aload 6
    //   154: invokestatic 202	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   157: goto -101 -> 56
    //   160: astore 6
    //   162: goto -41 -> 121
    //   165: astore 6
    //   167: goto -89 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	zzbv
    //   0	170	1	paramFile	File
    //   0	170	2	paramString	String
    //   5	135	3	str1	String
    //   9	118	4	localObject1	Object
    //   134	7	4	localIOException1	java.io.IOException
    //   12	6	5	bool	boolean
    //   37	5	5	i	int
    //   26	5	6	arrayOfByte	byte[]
    //   57	9	6	localIOException2	java.io.IOException
    //   73	10	6	localIOException3	java.io.IOException
    //   100	9	6	localIOException4	java.io.IOException
    //   116	16	6	localObject2	Object
    //   150	3	6	str2	String
    //   160	1	6	localObject3	Object
    //   165	1	6	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   51	56	57	java/io/IOException
    //   6	9	73	java/io/IOException
    //   17	22	73	java/io/IOException
    //   92	97	100	java/io/IOException
    //   6	9	116	finally
    //   17	22	116	finally
    //   126	131	134	java/io/IOException
    //   22	26	160	finally
    //   30	35	160	finally
    //   41	46	160	finally
    //   82	87	160	finally
    //   22	26	165	java/io/IOException
    //   30	35	165	java/io/IOException
    //   41	46	165	java/io/IOException
  }
  
  private void zzc(Map paramMap, String paramString)
  {
    String str1 = this.zzxj;
    str1 = zza(str1, paramMap, paramString);
    Object localObject = this.zzxp;
    boolean bool = ((AtomicBoolean)localObject).get();
    if (bool)
    {
      localObject = this.zzxq;
      zza((File)localObject, str1);
    }
    for (;;)
    {
      return;
      localObject = zzr.zzbC();
      Context localContext = this.mContext;
      String str2 = this.zzsy;
      ((zzir)localObject).zzc(localContext, str2, str1);
    }
  }
  
  private void zzdx()
  {
    try
    {
      for (;;)
      {
        Object localObject = this.zzxl;
        localObject = ((BlockingQueue)localObject).take();
        localObject = (zzcb)localObject;
        String str = ((zzcb)localObject).zzdD();
        boolean bool = TextUtils.isEmpty(str);
        if (!bool)
        {
          LinkedHashMap localLinkedHashMap = this.zzxn;
          localObject = ((zzcb)localObject).zzn();
          localObject = zza(localLinkedHashMap, (Map)localObject);
          zzc((Map)localObject, str);
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzd("CsiReporter:reporter interrupted", localInterruptedException);
    }
  }
  
  public zzby zzL(String paramString)
  {
    zzby localzzby = (zzby)this.zzxo.get(paramString);
    if (localzzby != null) {}
    for (;;)
    {
      return localzzby;
      localzzby = zzby.zzxs;
    }
  }
  
  String zza(String paramString1, Map paramMap, String paramString2)
  {
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    Object localObject = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      localBuilder.appendQueryParameter(str, (String)localObject);
    }
    localObject = new java/lang/StringBuilder;
    String str = localBuilder.build().toString();
    ((StringBuilder)localObject).<init>(str);
    ((StringBuilder)localObject).append("&").append("it").append("=").append(paramString2);
    return ((StringBuilder)localObject).toString();
  }
  
  Map zza(Map paramMap1, Map paramMap2)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(paramMap1);
    if (paramMap2 == null) {}
    for (Object localObject = localLinkedHashMap;; localObject = localLinkedHashMap)
    {
      return (Map)localObject;
      localObject = paramMap2.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str1 = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        String str2 = (String)localLinkedHashMap.get(str1);
        zzby localzzby = zzL(str1);
        localObject = localzzby.zzb(str2, (String)localObject);
        localLinkedHashMap.put(str1, localObject);
      }
    }
  }
  
  public boolean zza(zzcb paramzzcb)
  {
    return this.zzxl.offer(paramzzcb);
  }
  
  public void zzb(List paramList)
  {
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      if (!bool)
      {
        LinkedHashMap localLinkedHashMap = this.zzxn;
        String str1 = "e";
        String str2 = TextUtils.join(",", paramList);
        localLinkedHashMap.put(str1, str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */