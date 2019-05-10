package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzv
  implements zzb
{
  private final int zzaA;
  private final Map zzax;
  private long zzay;
  private final File zzaz;
  
  public zzv(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  public zzv(File paramFile, int paramInt)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(16, 0.75F, true);
    this.zzax = localLinkedHashMap;
    this.zzay = 0L;
    this.zzaz = paramFile;
    this.zzaA = paramInt;
  }
  
  private void removeEntry(String paramString)
  {
    Object localObject = (zzv.zza)this.zzax.get(paramString);
    if (localObject != null)
    {
      long l1 = this.zzay;
      long l2 = ((zzv.zza)localObject).zzaB;
      l2 = l1 - l2;
      this.zzay = l2;
      localObject = this.zzax;
      ((Map)localObject).remove(paramString);
    }
  }
  
  private static int zza(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    int j = -1;
    if (i == j)
    {
      EOFException localEOFException = new java/io/EOFException;
      localEOFException.<init>();
      throw localEOFException;
    }
    return i;
  }
  
  static void zza(OutputStream paramOutputStream, int paramInt)
  {
    int i = paramInt >> 0 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 8 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 16 & 0xFF;
    paramOutputStream.write(i);
    i = paramInt >> 24 & 0xFF;
    paramOutputStream.write(i);
  }
  
  static void zza(OutputStream paramOutputStream, long paramLong)
  {
    int i = (byte)(int)(paramLong >>> 0);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 8);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 16);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 24);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 32);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 40);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 48);
    paramOutputStream.write(i);
    i = (byte)(int)(paramLong >>> 56);
    paramOutputStream.write(i);
  }
  
  static void zza(OutputStream paramOutputStream, String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    long l = arrayOfByte.length;
    zza(paramOutputStream, l);
    int i = arrayOfByte.length;
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  private void zza(String paramString, zzv.zza paramzza)
  {
    Object localObject = this.zzax;
    boolean bool = ((Map)localObject).containsKey(paramString);
    long l1;
    long l2;
    if (!bool)
    {
      l1 = this.zzay;
      l2 = paramzza.zzaB;
      l1 += l2;
    }
    for (this.zzay = l1;; this.zzay = l1)
    {
      this.zzax.put(paramString, paramzza);
      return;
      localObject = (zzv.zza)this.zzax.get(paramString);
      l2 = this.zzay;
      long l3 = paramzza.zzaB;
      l1 = ((zzv.zza)localObject).zzaB;
      l1 = l3 - l1 + l2;
    }
  }
  
  static void zza(Map paramMap, OutputStream paramOutputStream)
  {
    if (paramMap != null)
    {
      int i = paramMap.size();
      zza(paramOutputStream, i);
      localObject = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        zza(paramOutputStream, str);
        localObject = (String)((Map.Entry)localObject).getValue();
        zza(paramOutputStream, (String)localObject);
      }
    }
    boolean bool = false;
    Object localObject = null;
    zza(paramOutputStream, 0);
  }
  
  private static byte[] zza(InputStream paramInputStream, int paramInt)
  {
    Object localObject = new byte[paramInt];
    int i = 0;
    String str = null;
    while (i < paramInt)
    {
      int j = paramInt - i;
      j = paramInputStream.read((byte[])localObject, i, j);
      int k = -1;
      if (j == k) {
        break;
      }
      i += j;
    }
    if (i != paramInt)
    {
      localObject = new java/io/IOException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "Expected " + paramInt + " bytes, read " + i + " bytes";
      ((IOException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
    return (byte[])localObject;
  }
  
  static int zzb(InputStream paramInputStream)
  {
    int i = zza(paramInputStream) << 0;
    int j = 0x0 | i;
    i = zza(paramInputStream) << 8;
    j |= i;
    i = zza(paramInputStream) << 16;
    j |= i;
    i = zza(paramInputStream) << 24;
    return j | i;
  }
  
  static long zzc(InputStream paramInputStream)
  {
    long l1 = 255L;
    long l2 = (zza(paramInputStream) & l1) << 0;
    long l3 = 0L | l2;
    l2 = (zza(paramInputStream) & l1) << 8;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 16;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 24;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 32;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 40;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 48;
    l3 |= l2;
    l2 = (zza(paramInputStream) & l1) << 56;
    return l3 | l2;
  }
  
  private void zzc(int paramInt)
  {
    int i = 2;
    int j = 1;
    long l1 = this.zzay;
    long l2 = paramInt;
    l1 += l2;
    int k = this.zzaA;
    l2 = k;
    boolean bool1 = l1 < l2;
    if (bool1) {
      return;
    }
    bool1 = zzs.DEBUG;
    if (bool1)
    {
      localObject1 = "Pruning old cache entries.";
      localObject2 = new Object[0];
      zzs.zza((String)localObject1, (Object[])localObject2);
    }
    l2 = this.zzay;
    long l3 = SystemClock.elapsedRealtime();
    Object localObject1 = this.zzax.entrySet();
    Object localObject3 = ((Set)localObject1).iterator();
    int n = 0;
    Object localObject2 = null;
    float f1 = 0.0F;
    label112:
    bool1 = ((Iterator)localObject3).hasNext();
    Object localObject4;
    long l4;
    label199:
    int m;
    if (bool1)
    {
      localObject1 = (zzv.zza)((Map.Entry)((Iterator)localObject3).next()).getValue();
      localObject4 = ((zzv.zza)localObject1).key;
      localObject4 = zzf((String)localObject4);
      boolean bool2 = ((File)localObject4).delete();
      if (bool2)
      {
        l4 = this.zzay;
        long l5 = ((zzv.zza)localObject1).zzaB;
        l4 -= l5;
        this.zzay = l4;
        ((Iterator)localObject3).remove();
        m = n + 1;
        l4 = this.zzay;
        l5 = paramInt;
        l4 += l5;
        f1 = (float)l4;
        int i1 = this.zzaA;
        float f2 = i1;
        float f3 = 0.9F;
        f2 *= f3;
        n = f1 < f2;
        if (n >= 0) {
          break label412;
        }
      }
    }
    for (;;)
    {
      n = zzs.DEBUG;
      if (n == 0) {
        break;
      }
      localObject2 = "pruned %d files, %d bytes, %d ms";
      k = 3;
      localObject3 = new Object[k];
      localObject1 = Integer.valueOf(m);
      localObject3[0] = localObject1;
      l4 = this.zzay;
      localObject1 = Long.valueOf(l4 - l2);
      localObject3[j] = localObject1;
      l2 = SystemClock.elapsedRealtime() - l3;
      localObject1 = Long.valueOf(l2);
      localObject3[i] = localObject1;
      zzs.zza((String)localObject2, (Object[])localObject3);
      break;
      localObject4 = "Could not delete cache entry for key=%s, filename=%s";
      Object[] arrayOfObject = new Object[i];
      String str = ((zzv.zza)localObject1).key;
      arrayOfObject[0] = str;
      localObject1 = ((zzv.zza)localObject1).key;
      localObject1 = zze((String)localObject1);
      arrayOfObject[j] = localObject1;
      zzs.zzb((String)localObject4, arrayOfObject);
      break label199;
      label412:
      n = m;
      break label112;
      m = n;
    }
  }
  
  static String zzd(InputStream paramInputStream)
  {
    int i = (int)zzc(paramInputStream);
    byte[] arrayOfByte = zza(paramInputStream, i);
    String str = new java/lang/String;
    str.<init>(arrayOfByte, "UTF-8");
    return str;
  }
  
  private String zze(String paramString)
  {
    int i = paramString.length() / 2;
    Object localObject = String.valueOf(paramString.substring(0, i).hashCode());
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject = localStringBuilder.append((String)localObject);
    String str = String.valueOf(paramString.substring(i).hashCode());
    return str;
  }
  
  static Map zze(InputStream paramInputStream)
  {
    int i = zzb(paramInputStream);
    Object localObject;
    if (i == 0) {
      localObject = Collections.emptyMap();
    }
    for (;;)
    {
      int j = 0;
      while (j < i)
      {
        String str1 = zzd(paramInputStream).intern();
        String str2 = zzd(paramInputStream).intern();
        ((Map)localObject).put(str1, str2);
        j += 1;
      }
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>(i);
    }
    return (Map)localObject;
  }
  
  public void remove(String paramString)
  {
    try
    {
      Object localObject1 = zzf(paramString);
      boolean bool = ((File)localObject1).delete();
      removeEntry(paramString);
      if (!bool)
      {
        localObject1 = "Could not delete cache entry for key=%s, filename=%s";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        arrayOfObject[0] = paramString;
        j = 1;
        String str = zze(paramString);
        arrayOfObject[j] = str;
        zzs.zzb((String)localObject1, arrayOfObject);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public zzb.zza zza(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/google/android/gms/internal/zzv:zzax	Ljava/util/Map;
    //   6: astore_2
    //   7: aload_2
    //   8: aload_1
    //   9: invokeinterface 46 2 0
    //   14: astore_2
    //   15: aload_2
    //   16: checkcast 48	com/google/android/gms/internal/zzv$zza
    //   19: astore_2
    //   20: aload_2
    //   21: ifnonnull +9 -> 30
    //   24: aconst_null
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: areturn
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual 196	com/google/android/gms/internal/zzv:zzf	(Ljava/lang/String;)Ljava/io/File;
    //   35: astore_3
    //   36: new 277	com/google/android/gms/internal/zzv$zzb
    //   39: astore 4
    //   41: new 279	java/io/FileInputStream
    //   44: astore 5
    //   46: aload 5
    //   48: aload_3
    //   49: invokespecial 282	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: iconst_0
    //   53: istore 6
    //   55: aconst_null
    //   56: astore 7
    //   58: aload 4
    //   60: aload 5
    //   62: aconst_null
    //   63: invokespecial 285	com/google/android/gms/internal/zzv$zzb:<init>	(Ljava/io/InputStream;Lcom/google/android/gms/internal/zzv$1;)V
    //   66: aload 4
    //   68: invokestatic 288	com/google/android/gms/internal/zzv$zza:zzf	(Ljava/io/InputStream;)Lcom/google/android/gms/internal/zzv$zza;
    //   71: pop
    //   72: aload_3
    //   73: invokevirtual 290	java/io/File:length	()J
    //   76: lstore 8
    //   78: aload 4
    //   80: invokestatic 293	com/google/android/gms/internal/zzv$zzb:zza	(Lcom/google/android/gms/internal/zzv$zzb;)I
    //   83: istore 10
    //   85: iload 10
    //   87: i2l
    //   88: lstore 11
    //   90: lload 8
    //   92: lload 11
    //   94: lsub
    //   95: lstore 8
    //   97: lload 8
    //   99: l2i
    //   100: istore 13
    //   102: aload 4
    //   104: iload 13
    //   106: invokestatic 235	com/google/android/gms/internal/zzv:zza	(Ljava/io/InputStream;I)[B
    //   109: astore 5
    //   111: aload_2
    //   112: aload 5
    //   114: invokevirtual 296	com/google/android/gms/internal/zzv$zza:zzb	([B)Lcom/google/android/gms/internal/zzb$zza;
    //   117: astore_2
    //   118: aload 4
    //   120: ifnull -94 -> 26
    //   123: aload 4
    //   125: invokevirtual 299	com/google/android/gms/internal/zzv$zzb:close	()V
    //   128: goto -102 -> 26
    //   131: astore_2
    //   132: aconst_null
    //   133: astore_2
    //   134: goto -108 -> 26
    //   137: astore_2
    //   138: aconst_null
    //   139: astore 4
    //   141: ldc_w 301
    //   144: astore 5
    //   146: iconst_2
    //   147: istore 6
    //   149: iload 6
    //   151: anewarray 4	java/lang/Object
    //   154: astore 7
    //   156: iconst_0
    //   157: istore 10
    //   159: aload_3
    //   160: invokevirtual 304	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   163: astore_3
    //   164: aload 7
    //   166: iconst_0
    //   167: aload_3
    //   168: aastore
    //   169: iconst_1
    //   170: istore 14
    //   172: aload_2
    //   173: invokevirtual 305	java/io/IOException:toString	()Ljava/lang/String;
    //   176: astore_2
    //   177: aload 7
    //   179: iload 14
    //   181: aload_2
    //   182: aastore
    //   183: aload 5
    //   185: aload 7
    //   187: invokestatic 228	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_0
    //   191: aload_1
    //   192: invokevirtual 307	com/google/android/gms/internal/zzv:remove	(Ljava/lang/String;)V
    //   195: aload 4
    //   197: ifnull +8 -> 205
    //   200: aload 4
    //   202: invokevirtual 299	com/google/android/gms/internal/zzv$zzb:close	()V
    //   205: aconst_null
    //   206: astore_2
    //   207: goto -181 -> 26
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_2
    //   213: goto -187 -> 26
    //   216: astore_2
    //   217: aconst_null
    //   218: astore 4
    //   220: aload 4
    //   222: ifnull +8 -> 230
    //   225: aload 4
    //   227: invokevirtual 299	com/google/android/gms/internal/zzv$zzb:close	()V
    //   230: aload_2
    //   231: athrow
    //   232: astore_2
    //   233: aload_0
    //   234: monitorexit
    //   235: aload_2
    //   236: athrow
    //   237: astore_2
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -214 -> 26
    //   243: astore_2
    //   244: goto -24 -> 220
    //   247: astore_2
    //   248: goto -107 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	zzv
    //   0	251	1	paramString	String
    //   6	112	2	localObject1	Object
    //   131	1	2	localIOException1	IOException
    //   133	1	2	localObject2	Object
    //   137	36	2	localIOException2	IOException
    //   176	31	2	str	String
    //   210	1	2	localIOException3	IOException
    //   212	1	2	localObject3	Object
    //   216	15	2	localObject4	Object
    //   232	4	2	localObject5	Object
    //   237	1	2	localIOException4	IOException
    //   239	1	2	localObject6	Object
    //   243	1	2	localObject7	Object
    //   247	1	2	localIOException5	IOException
    //   35	133	3	localObject8	Object
    //   39	187	4	localzzb	zzv.zzb
    //   44	140	5	localObject9	Object
    //   53	97	6	i	int
    //   56	130	7	arrayOfObject	Object[]
    //   76	22	8	l1	long
    //   83	75	10	j	int
    //   88	5	11	l2	long
    //   100	5	13	k	int
    //   170	10	14	m	int
    // Exception table:
    //   from	to	target	type
    //   123	128	131	java/io/IOException
    //   36	39	137	java/io/IOException
    //   41	44	137	java/io/IOException
    //   48	52	137	java/io/IOException
    //   62	66	137	java/io/IOException
    //   200	205	210	java/io/IOException
    //   36	39	216	finally
    //   41	44	216	finally
    //   48	52	216	finally
    //   62	66	216	finally
    //   2	6	232	finally
    //   8	14	232	finally
    //   15	19	232	finally
    //   31	35	232	finally
    //   123	128	232	finally
    //   200	205	232	finally
    //   225	230	232	finally
    //   230	232	232	finally
    //   225	230	237	java/io/IOException
    //   66	72	243	finally
    //   72	76	243	finally
    //   78	83	243	finally
    //   104	109	243	finally
    //   112	117	243	finally
    //   149	154	243	finally
    //   159	163	243	finally
    //   167	169	243	finally
    //   172	176	243	finally
    //   181	183	243	finally
    //   185	190	243	finally
    //   191	195	243	finally
    //   66	72	247	java/io/IOException
    //   72	76	247	java/io/IOException
    //   78	83	247	java/io/IOException
    //   104	109	247	java/io/IOException
    //   112	117	247	java/io/IOException
  }
  
  /* Error */
  public void zza()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 38	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 310	java/io/File:exists	()Z
    //   15: istore 4
    //   17: iload 4
    //   19: ifne +59 -> 78
    //   22: aload_0
    //   23: getfield 38	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   26: astore_2
    //   27: aload_2
    //   28: invokevirtual 313	java/io/File:mkdirs	()Z
    //   31: istore_1
    //   32: iload_1
    //   33: ifne +42 -> 75
    //   36: ldc_w 315
    //   39: astore_2
    //   40: iconst_1
    //   41: istore 4
    //   43: iload 4
    //   45: anewarray 4	java/lang/Object
    //   48: astore_3
    //   49: iconst_0
    //   50: istore 5
    //   52: aload_0
    //   53: getfield 38	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   56: astore 6
    //   58: aload 6
    //   60: invokevirtual 304	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   63: astore 6
    //   65: aload_3
    //   66: iconst_0
    //   67: aload 6
    //   69: aastore
    //   70: aload_2
    //   71: aload_3
    //   72: invokestatic 317	com/google/android/gms/internal/zzs:zzc	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: aload_0
    //   79: getfield 38	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   82: astore_3
    //   83: aload_3
    //   84: invokevirtual 321	java/io/File:listFiles	()[Ljava/io/File;
    //   87: astore 6
    //   89: aload 6
    //   91: ifnull -16 -> 75
    //   94: aload 6
    //   96: arraylength
    //   97: istore 7
    //   99: iconst_0
    //   100: istore 5
    //   102: iload 5
    //   104: iload 7
    //   106: if_icmpge -31 -> 75
    //   109: aload 6
    //   111: iload 5
    //   113: aaload
    //   114: astore 8
    //   116: iconst_0
    //   117: istore 4
    //   119: aconst_null
    //   120: astore_3
    //   121: new 323	java/io/BufferedInputStream
    //   124: astore_2
    //   125: new 279	java/io/FileInputStream
    //   128: astore 9
    //   130: aload 9
    //   132: aload 8
    //   134: invokespecial 282	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   137: aload_2
    //   138: aload 9
    //   140: invokespecial 326	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   143: aload_2
    //   144: invokestatic 288	com/google/android/gms/internal/zzv$zza:zzf	(Ljava/io/InputStream;)Lcom/google/android/gms/internal/zzv$zza;
    //   147: astore_3
    //   148: aload 8
    //   150: invokevirtual 290	java/io/File:length	()J
    //   153: lstore 10
    //   155: aload_3
    //   156: lload 10
    //   158: putfield 51	com/google/android/gms/internal/zzv$zza:zzaB	J
    //   161: aload_3
    //   162: getfield 192	com/google/android/gms/internal/zzv$zza:key	Ljava/lang/String;
    //   165: astore 9
    //   167: aload_0
    //   168: aload 9
    //   170: aload_3
    //   171: invokespecial 329	com/google/android/gms/internal/zzv:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzv$zza;)V
    //   174: aload_2
    //   175: ifnull +7 -> 182
    //   178: aload_2
    //   179: invokevirtual 330	java/io/BufferedInputStream:close	()V
    //   182: iload 5
    //   184: iconst_1
    //   185: iadd
    //   186: istore_1
    //   187: iload_1
    //   188: istore 5
    //   190: goto -88 -> 102
    //   193: astore_2
    //   194: iconst_0
    //   195: istore_1
    //   196: aconst_null
    //   197: astore_2
    //   198: aload 8
    //   200: ifnull +9 -> 209
    //   203: aload 8
    //   205: invokevirtual 201	java/io/File:delete	()Z
    //   208: pop
    //   209: aload_2
    //   210: ifnull -28 -> 182
    //   213: aload_2
    //   214: invokevirtual 330	java/io/BufferedInputStream:close	()V
    //   217: goto -35 -> 182
    //   220: astore_2
    //   221: goto -39 -> 182
    //   224: astore_2
    //   225: aload_3
    //   226: ifnull +7 -> 233
    //   229: aload_3
    //   230: invokevirtual 330	java/io/BufferedInputStream:close	()V
    //   233: aload_2
    //   234: athrow
    //   235: astore_2
    //   236: aload_0
    //   237: monitorexit
    //   238: aload_2
    //   239: athrow
    //   240: astore_2
    //   241: goto -59 -> 182
    //   244: astore_3
    //   245: goto -12 -> 233
    //   248: astore 12
    //   250: aload_2
    //   251: astore_3
    //   252: aload 12
    //   254: astore_2
    //   255: goto -30 -> 225
    //   258: astore_3
    //   259: goto -61 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	zzv
    //   1	32	1	bool1	boolean
    //   186	10	1	i	int
    //   3	176	2	localObject1	Object
    //   193	1	2	localIOException1	IOException
    //   197	17	2	localObject2	Object
    //   220	1	2	localIOException2	IOException
    //   224	10	2	localObject3	Object
    //   235	4	2	localObject4	Object
    //   240	11	2	localIOException3	IOException
    //   254	1	2	localObject5	Object
    //   10	220	3	localObject6	Object
    //   244	1	3	localIOException4	IOException
    //   251	1	3	localIOException5	IOException
    //   258	1	3	localIOException6	IOException
    //   15	103	4	bool2	boolean
    //   50	139	5	j	int
    //   56	54	6	localObject7	Object
    //   97	10	7	k	int
    //   114	90	8	localFile	File
    //   128	41	9	localObject8	Object
    //   153	4	10	l	long
    //   248	5	12	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   121	124	193	java/io/IOException
    //   125	128	193	java/io/IOException
    //   132	137	193	java/io/IOException
    //   138	143	193	java/io/IOException
    //   213	217	220	java/io/IOException
    //   121	124	224	finally
    //   125	128	224	finally
    //   132	137	224	finally
    //   138	143	224	finally
    //   6	10	235	finally
    //   11	15	235	finally
    //   22	26	235	finally
    //   27	31	235	finally
    //   43	48	235	finally
    //   52	56	235	finally
    //   58	63	235	finally
    //   67	70	235	finally
    //   71	75	235	finally
    //   78	82	235	finally
    //   83	87	235	finally
    //   94	97	235	finally
    //   111	114	235	finally
    //   178	182	235	finally
    //   213	217	235	finally
    //   229	233	235	finally
    //   233	235	235	finally
    //   178	182	240	java/io/IOException
    //   229	233	244	java/io/IOException
    //   143	147	248	finally
    //   148	153	248	finally
    //   156	161	248	finally
    //   161	165	248	finally
    //   170	174	248	finally
    //   203	209	248	finally
    //   143	147	258	java/io/IOException
    //   148	153	258	java/io/IOException
    //   156	161	258	java/io/IOException
    //   161	165	258	java/io/IOException
    //   170	174	258	java/io/IOException
  }
  
  /* Error */
  public void zza(String paramString, zzb.zza paramzza)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: getfield 336	com/google/android/gms/internal/zzb$zza:data	[B
    //   6: astore_3
    //   7: aload_3
    //   8: arraylength
    //   9: istore 4
    //   11: aload_0
    //   12: iload 4
    //   14: invokespecial 338	com/google/android/gms/internal/zzv:zzc	(I)V
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 196	com/google/android/gms/internal/zzv:zzf	(Ljava/lang/String;)Ljava/io/File;
    //   22: astore_3
    //   23: new 340	java/io/FileOutputStream
    //   26: astore 5
    //   28: aload 5
    //   30: aload_3
    //   31: invokespecial 341	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   34: new 48	com/google/android/gms/internal/zzv$zza
    //   37: astore 6
    //   39: aload 6
    //   41: aload_1
    //   42: aload_2
    //   43: invokespecial 344	com/google/android/gms/internal/zzv$zza:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/zzb$zza;)V
    //   46: aload 6
    //   48: aload 5
    //   50: invokevirtual 347	com/google/android/gms/internal/zzv$zza:zza	(Ljava/io/OutputStream;)Z
    //   53: istore 7
    //   55: iload 7
    //   57: ifne +115 -> 172
    //   60: aload 5
    //   62: invokevirtual 348	java/io/FileOutputStream:close	()V
    //   65: ldc_w 350
    //   68: astore 5
    //   70: iconst_1
    //   71: istore 8
    //   73: iload 8
    //   75: anewarray 4	java/lang/Object
    //   78: astore 6
    //   80: iconst_0
    //   81: istore 7
    //   83: aconst_null
    //   84: astore 9
    //   86: aload_3
    //   87: invokevirtual 304	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   90: astore 10
    //   92: aload 6
    //   94: iconst_0
    //   95: aload 10
    //   97: aastore
    //   98: aload 5
    //   100: aload 6
    //   102: invokestatic 228	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: new 140	java/io/IOException
    //   108: astore 5
    //   110: aload 5
    //   112: invokespecial 351	java/io/IOException:<init>	()V
    //   115: aload 5
    //   117: athrow
    //   118: astore 5
    //   120: aload_3
    //   121: invokevirtual 201	java/io/File:delete	()Z
    //   124: istore 11
    //   126: iload 11
    //   128: ifne +41 -> 169
    //   131: ldc_w 353
    //   134: astore 5
    //   136: iconst_1
    //   137: istore 8
    //   139: iload 8
    //   141: anewarray 4	java/lang/Object
    //   144: astore 6
    //   146: iconst_0
    //   147: istore 7
    //   149: aconst_null
    //   150: astore 9
    //   152: aload_3
    //   153: invokevirtual 304	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   156: astore_3
    //   157: aload 6
    //   159: iconst_0
    //   160: aload_3
    //   161: aastore
    //   162: aload 5
    //   164: aload 6
    //   166: invokestatic 228	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_0
    //   170: monitorexit
    //   171: return
    //   172: aload_2
    //   173: getfield 336	com/google/android/gms/internal/zzb$zza:data	[B
    //   176: astore 9
    //   178: aload 5
    //   180: aload 9
    //   182: invokevirtual 356	java/io/FileOutputStream:write	([B)V
    //   185: aload 5
    //   187: invokevirtual 348	java/io/FileOutputStream:close	()V
    //   190: aload_0
    //   191: aload_1
    //   192: aload 6
    //   194: invokespecial 329	com/google/android/gms/internal/zzv:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzv$zza;)V
    //   197: goto -28 -> 169
    //   200: astore_3
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_3
    //   204: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	zzv
    //   0	205	1	paramString	String
    //   0	205	2	paramzza	zzb.zza
    //   6	155	3	localObject1	Object
    //   200	4	3	localObject2	Object
    //   9	4	4	i	int
    //   26	90	5	localObject3	Object
    //   118	1	5	localIOException	IOException
    //   134	52	5	str1	String
    //   37	156	6	localObject4	Object
    //   53	95	7	bool1	boolean
    //   71	69	8	j	int
    //   84	97	9	arrayOfByte	byte[]
    //   90	6	10	str2	String
    //   124	3	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   23	26	118	java/io/IOException
    //   30	34	118	java/io/IOException
    //   34	37	118	java/io/IOException
    //   42	46	118	java/io/IOException
    //   48	53	118	java/io/IOException
    //   60	65	118	java/io/IOException
    //   73	78	118	java/io/IOException
    //   86	90	118	java/io/IOException
    //   95	98	118	java/io/IOException
    //   100	105	118	java/io/IOException
    //   105	108	118	java/io/IOException
    //   110	115	118	java/io/IOException
    //   115	118	118	java/io/IOException
    //   172	176	118	java/io/IOException
    //   180	185	118	java/io/IOException
    //   185	190	118	java/io/IOException
    //   192	197	118	java/io/IOException
    //   2	6	200	finally
    //   7	9	200	finally
    //   12	17	200	finally
    //   18	22	200	finally
    //   23	26	200	finally
    //   30	34	200	finally
    //   34	37	200	finally
    //   42	46	200	finally
    //   48	53	200	finally
    //   60	65	200	finally
    //   73	78	200	finally
    //   86	90	200	finally
    //   95	98	200	finally
    //   100	105	200	finally
    //   105	108	200	finally
    //   110	115	200	finally
    //   115	118	200	finally
    //   120	124	200	finally
    //   139	144	200	finally
    //   152	156	200	finally
    //   160	162	200	finally
    //   164	169	200	finally
    //   172	176	200	finally
    //   180	185	200	finally
    //   185	190	200	finally
    //   192	197	200	finally
  }
  
  public File zzf(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.zzaz;
    String str = zze(paramString);
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */