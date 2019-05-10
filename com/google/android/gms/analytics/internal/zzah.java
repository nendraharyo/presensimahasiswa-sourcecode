package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

class zzah
  extends zzd
{
  private static final byte[] zzTd = "\n".getBytes();
  private final zzaj zzTc;
  private final String zzzN;
  
  zzah(zzf paramzzf)
  {
    super(paramzzf);
    Object localObject1 = zze.VERSION;
    String str1 = Build.VERSION.RELEASE;
    String str2 = zzam.zza(Locale.getDefault());
    String str3 = Build.MODEL;
    String str4 = Build.ID;
    Object localObject2 = zza("GoogleAnalytics", (String)localObject1, str1, str2, str3, str4);
    this.zzzN = ((String)localObject2);
    localObject2 = new com/google/android/gms/analytics/internal/zzaj;
    localObject1 = paramzzf.zzjl();
    ((zzaj)localObject2).<init>((zzmq)localObject1);
    this.zzTc = ((zzaj)localObject2);
  }
  
  /* Error */
  private int zza(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 80	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 80	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: ldc 82
    //   14: astore 4
    //   16: aload_2
    //   17: arraylength
    //   18: istore 5
    //   20: iload 5
    //   22: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   25: astore 6
    //   27: aload_0
    //   28: aload 4
    //   30: aload 6
    //   32: aload_1
    //   33: invokevirtual 92	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   36: aload_0
    //   37: invokevirtual 96	com/google/android/gms/analytics/internal/zzah:zzhp	()Z
    //   40: istore 7
    //   42: iload 7
    //   44: ifeq +26 -> 70
    //   47: ldc 98
    //   49: astore 4
    //   51: new 14	java/lang/String
    //   54: astore 6
    //   56: aload 6
    //   58: aload_2
    //   59: invokespecial 101	java/lang/String:<init>	([B)V
    //   62: aload_0
    //   63: aload 4
    //   65: aload 6
    //   67: invokevirtual 104	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   70: aload_0
    //   71: aload_1
    //   72: invokevirtual 108	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   75: astore 6
    //   77: iconst_1
    //   78: istore 7
    //   80: aload 6
    //   82: iload 7
    //   84: invokevirtual 115	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   87: aload_2
    //   88: arraylength
    //   89: istore 7
    //   91: aload 6
    //   93: iload 7
    //   95: invokevirtual 119	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   98: aload 6
    //   100: invokevirtual 123	java/net/HttpURLConnection:connect	()V
    //   103: aload 6
    //   105: invokevirtual 127	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   108: astore_3
    //   109: aload_3
    //   110: aload_2
    //   111: invokevirtual 132	java/io/OutputStream:write	([B)V
    //   114: aload_0
    //   115: aload 6
    //   117: invokespecial 135	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/net/HttpURLConnection;)V
    //   120: aload 6
    //   122: invokevirtual 139	java/net/HttpURLConnection:getResponseCode	()I
    //   125: istore 7
    //   127: sipush 200
    //   130: istore 8
    //   132: iload 7
    //   134: iload 8
    //   136: if_icmpne +14 -> 150
    //   139: aload_0
    //   140: invokevirtual 144	com/google/android/gms/analytics/internal/zzah:zziH	()Lcom/google/android/gms/analytics/internal/zzb;
    //   143: astore 9
    //   145: aload 9
    //   147: invokevirtual 149	com/google/android/gms/analytics/internal/zzb:zzjh	()V
    //   150: ldc -105
    //   152: astore 9
    //   154: iload 7
    //   156: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: astore 10
    //   161: aload_0
    //   162: aload 9
    //   164: aload 10
    //   166: invokevirtual 153	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   169: aload_3
    //   170: ifnull +7 -> 177
    //   173: aload_3
    //   174: invokevirtual 156	java/io/OutputStream:close	()V
    //   177: aload 6
    //   179: ifnull +8 -> 187
    //   182: aload 6
    //   184: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   187: iload 7
    //   189: ireturn
    //   190: astore_3
    //   191: ldc -95
    //   193: astore 9
    //   195: aload_0
    //   196: aload 9
    //   198: aload_3
    //   199: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   202: goto -25 -> 177
    //   205: astore 4
    //   207: iconst_0
    //   208: istore 5
    //   210: aconst_null
    //   211: astore 6
    //   213: ldc -90
    //   215: astore 9
    //   217: aload_0
    //   218: aload 9
    //   220: aload 4
    //   222: invokevirtual 169	com/google/android/gms/analytics/internal/zzah:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   225: iconst_0
    //   226: istore 7
    //   228: aconst_null
    //   229: astore 4
    //   231: aload_3
    //   232: ifnull +7 -> 239
    //   235: aload_3
    //   236: invokevirtual 156	java/io/OutputStream:close	()V
    //   239: aload 6
    //   241: ifnull -54 -> 187
    //   244: aload 6
    //   246: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   249: goto -62 -> 187
    //   252: astore_3
    //   253: ldc -95
    //   255: astore 9
    //   257: aload_0
    //   258: aload 9
    //   260: aload_3
    //   261: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   264: goto -25 -> 239
    //   267: astore 4
    //   269: iconst_0
    //   270: istore 5
    //   272: aconst_null
    //   273: astore 6
    //   275: aload_3
    //   276: ifnull +7 -> 283
    //   279: aload_3
    //   280: invokevirtual 156	java/io/OutputStream:close	()V
    //   283: aload 6
    //   285: ifnull +8 -> 293
    //   288: aload 6
    //   290: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   293: aload 4
    //   295: athrow
    //   296: astore_3
    //   297: ldc -95
    //   299: astore 9
    //   301: aload_0
    //   302: aload 9
    //   304: aload_3
    //   305: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   308: goto -25 -> 283
    //   311: astore 4
    //   313: goto -38 -> 275
    //   316: astore 4
    //   318: goto -105 -> 213
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	this	zzah
    //   0	321	1	paramURL	URL
    //   0	321	2	paramArrayOfByte	byte[]
    //   1	173	3	localOutputStream	java.io.OutputStream
    //   190	46	3	localIOException1	IOException
    //   252	28	3	localIOException2	IOException
    //   296	9	3	localIOException3	IOException
    //   14	50	4	str	String
    //   205	16	4	localIOException4	IOException
    //   229	1	4	localObject1	Object
    //   267	27	4	localObject2	Object
    //   311	1	4	localObject3	Object
    //   316	1	4	localIOException5	IOException
    //   18	253	5	i	int
    //   25	264	6	localObject4	Object
    //   40	43	7	bool	boolean
    //   89	138	7	j	int
    //   130	7	8	k	int
    //   143	160	9	localObject5	Object
    //   159	6	10	localInteger	Integer
    // Exception table:
    //   from	to	target	type
    //   173	177	190	java/io/IOException
    //   71	75	205	java/io/IOException
    //   235	239	252	java/io/IOException
    //   71	75	267	finally
    //   279	283	296	java/io/IOException
    //   82	87	311	finally
    //   87	89	311	finally
    //   93	98	311	finally
    //   98	103	311	finally
    //   103	108	311	finally
    //   110	114	311	finally
    //   115	120	311	finally
    //   120	125	311	finally
    //   139	143	311	finally
    //   145	150	311	finally
    //   154	159	311	finally
    //   164	169	311	finally
    //   220	225	311	finally
    //   82	87	316	java/io/IOException
    //   87	89	316	java/io/IOException
    //   93	98	316	java/io/IOException
    //   98	103	316	java/io/IOException
    //   103	108	316	java/io/IOException
    //   110	114	316	java/io/IOException
    //   115	120	316	java/io/IOException
    //   120	125	316	java/io/IOException
    //   139	143	316	java/io/IOException
    //   145	150	316	java/io/IOException
    //   154	159	316	java/io/IOException
    //   164	169	316	java/io/IOException
  }
  
  private static String zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramString3;
    arrayOfObject[3] = paramString4;
    arrayOfObject[4] = paramString5;
    arrayOfObject[5] = paramString6;
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", arrayOfObject);
  }
  
  private void zza(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    int i = paramStringBuilder.length();
    if (i != 0)
    {
      i = 38;
      paramStringBuilder.append(i);
    }
    String str = URLEncoder.encode(paramString1, "UTF-8");
    paramStringBuilder.append(str);
    paramStringBuilder.append('=');
    str = URLEncoder.encode(paramString2, "UTF-8");
    paramStringBuilder.append(str);
  }
  
  private int zzb(URL paramURL)
  {
    zzx.zzz(paramURL);
    String str = "GET request";
    zzb(str, paramURL);
    localHttpURLConnection = null;
    try
    {
      localHttpURLConnection = zzc(paramURL);
      localHttpURLConnection.connect();
      zzb(localHttpURLConnection);
      i = localHttpURLConnection.getResponseCode();
      int j = 200;
      if (i == j)
      {
        localObject3 = zziH();
        ((zzb)localObject3).zzjh();
      }
      localObject3 = "GET status";
      Integer localInteger = Integer.valueOf(i);
      zzb((String)localObject3, localInteger);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject3 = "Network GET connection error";
        zzd((String)localObject3, localIOException);
        int i = 0;
        Object localObject1 = null;
        if (localHttpURLConnection != null) {
          localHttpURLConnection.disconnect();
        }
      }
    }
    finally
    {
      if (localHttpURLConnection == null) {
        break label127;
      }
      localHttpURLConnection.disconnect();
    }
    return i;
  }
  
  /* Error */
  private int zzb(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 80	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 80	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_2
    //   13: invokestatic 216	com/google/android/gms/analytics/internal/zzah:zzg	([B)[B
    //   16: astore 4
    //   18: ldc -38
    //   20: astore 5
    //   22: aload 4
    //   24: arraylength
    //   25: istore 6
    //   27: iload 6
    //   29: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: astore 7
    //   34: bipush 100
    //   36: i2l
    //   37: lstore 8
    //   39: aload 4
    //   41: arraylength
    //   42: istore 10
    //   44: iload 10
    //   46: i2l
    //   47: lstore 11
    //   49: lload 8
    //   51: lload 11
    //   53: lmul
    //   54: lstore 8
    //   56: aload_2
    //   57: arraylength
    //   58: istore 10
    //   60: iload 10
    //   62: i2l
    //   63: lstore 11
    //   65: lload 8
    //   67: lload 11
    //   69: ldiv
    //   70: lstore 8
    //   72: lload 8
    //   74: invokestatic 225	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   77: astore 13
    //   79: aload_0
    //   80: aload 5
    //   82: aload 7
    //   84: aload 13
    //   86: aload_1
    //   87: invokevirtual 228	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   90: aload 4
    //   92: arraylength
    //   93: istore 14
    //   95: aload_2
    //   96: arraylength
    //   97: istore 6
    //   99: iload 14
    //   101: iload 6
    //   103: if_icmple +40 -> 143
    //   106: ldc -26
    //   108: astore 5
    //   110: aload 4
    //   112: arraylength
    //   113: istore 6
    //   115: iload 6
    //   117: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: astore 7
    //   122: aload_2
    //   123: arraylength
    //   124: istore 15
    //   126: iload 15
    //   128: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: astore 13
    //   133: aload_0
    //   134: aload 5
    //   136: aload 7
    //   138: aload 13
    //   140: invokevirtual 232	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   143: aload_0
    //   144: invokevirtual 96	com/google/android/gms/analytics/internal/zzah:zzhp	()Z
    //   147: istore 14
    //   149: iload 14
    //   151: ifeq +65 -> 216
    //   154: ldc -22
    //   156: astore 5
    //   158: new 186	java/lang/StringBuilder
    //   161: astore 7
    //   163: aload 7
    //   165: invokespecial 236	java/lang/StringBuilder:<init>	()V
    //   168: ldc 12
    //   170: astore 13
    //   172: aload 7
    //   174: aload 13
    //   176: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: astore 7
    //   181: new 14	java/lang/String
    //   184: astore 13
    //   186: aload 13
    //   188: aload_2
    //   189: invokespecial 101	java/lang/String:<init>	([B)V
    //   192: aload 7
    //   194: aload 13
    //   196: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: astore 7
    //   201: aload 7
    //   203: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 7
    //   208: aload_0
    //   209: aload 5
    //   211: aload 7
    //   213: invokevirtual 104	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   216: aload_0
    //   217: aload_1
    //   218: invokevirtual 108	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   221: astore 7
    //   223: iconst_1
    //   224: istore 14
    //   226: aload 7
    //   228: iload 14
    //   230: invokevirtual 115	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   233: ldc -14
    //   235: astore 5
    //   237: ldc -12
    //   239: astore 13
    //   241: aload 7
    //   243: aload 5
    //   245: aload 13
    //   247: invokevirtual 248	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: aload 4
    //   252: arraylength
    //   253: istore 14
    //   255: aload 7
    //   257: iload 14
    //   259: invokevirtual 119	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   262: aload 7
    //   264: invokevirtual 123	java/net/HttpURLConnection:connect	()V
    //   267: aload 7
    //   269: invokevirtual 127	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   272: astore 5
    //   274: aload 5
    //   276: aload 4
    //   278: invokevirtual 132	java/io/OutputStream:write	([B)V
    //   281: aload 5
    //   283: invokevirtual 156	java/io/OutputStream:close	()V
    //   286: iconst_0
    //   287: istore 14
    //   289: aconst_null
    //   290: astore 5
    //   292: aload_0
    //   293: aload 7
    //   295: invokespecial 135	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/net/HttpURLConnection;)V
    //   298: aload 7
    //   300: invokevirtual 139	java/net/HttpURLConnection:getResponseCode	()I
    //   303: istore 16
    //   305: sipush 200
    //   308: istore 15
    //   310: iload 16
    //   312: iload 15
    //   314: if_icmpne +14 -> 328
    //   317: aload_0
    //   318: invokevirtual 144	com/google/android/gms/analytics/internal/zzah:zziH	()Lcom/google/android/gms/analytics/internal/zzb;
    //   321: astore 13
    //   323: aload 13
    //   325: invokevirtual 149	com/google/android/gms/analytics/internal/zzb:zzjh	()V
    //   328: ldc -105
    //   330: astore 13
    //   332: iload 16
    //   334: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   337: astore 17
    //   339: aload_0
    //   340: aload 13
    //   342: aload 17
    //   344: invokevirtual 153	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   347: iconst_0
    //   348: ifeq +7 -> 355
    //   351: aconst_null
    //   352: invokevirtual 156	java/io/OutputStream:close	()V
    //   355: aload 7
    //   357: ifnull +8 -> 365
    //   360: aload 7
    //   362: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   365: iload 16
    //   367: ireturn
    //   368: astore_3
    //   369: ldc -6
    //   371: astore 5
    //   373: aload_0
    //   374: aload 5
    //   376: aload_3
    //   377: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   380: goto -25 -> 355
    //   383: astore 4
    //   385: iconst_0
    //   386: istore 14
    //   388: aconst_null
    //   389: astore 5
    //   391: ldc -4
    //   393: astore 7
    //   395: aload_0
    //   396: aload 7
    //   398: aload 4
    //   400: invokevirtual 169	com/google/android/gms/analytics/internal/zzah:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   403: iconst_0
    //   404: istore 16
    //   406: aconst_null
    //   407: astore 4
    //   409: aload_3
    //   410: ifnull +7 -> 417
    //   413: aload_3
    //   414: invokevirtual 156	java/io/OutputStream:close	()V
    //   417: aload 5
    //   419: ifnull -54 -> 365
    //   422: aload 5
    //   424: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   427: goto -62 -> 365
    //   430: astore_3
    //   431: ldc -6
    //   433: astore 7
    //   435: aload_0
    //   436: aload 7
    //   438: aload_3
    //   439: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   442: goto -25 -> 417
    //   445: astore 4
    //   447: iconst_0
    //   448: istore 6
    //   450: aconst_null
    //   451: astore 7
    //   453: aload_3
    //   454: ifnull +7 -> 461
    //   457: aload_3
    //   458: invokevirtual 156	java/io/OutputStream:close	()V
    //   461: aload 7
    //   463: ifnull +8 -> 471
    //   466: aload 7
    //   468: invokevirtual 159	java/net/HttpURLConnection:disconnect	()V
    //   471: aload 4
    //   473: athrow
    //   474: astore_3
    //   475: ldc -6
    //   477: astore 5
    //   479: aload_0
    //   480: aload 5
    //   482: aload_3
    //   483: invokevirtual 164	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   486: goto -25 -> 461
    //   489: astore 4
    //   491: goto -38 -> 453
    //   494: astore 4
    //   496: aload 5
    //   498: astore_3
    //   499: goto -46 -> 453
    //   502: astore 4
    //   504: aload 5
    //   506: astore 7
    //   508: goto -55 -> 453
    //   511: astore 4
    //   513: aload 7
    //   515: astore 5
    //   517: goto -126 -> 391
    //   520: astore 4
    //   522: aload 5
    //   524: astore_3
    //   525: aload 7
    //   527: astore 5
    //   529: goto -138 -> 391
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	532	0	this	zzah
    //   0	532	1	paramURL	URL
    //   0	532	2	paramArrayOfByte	byte[]
    //   1	1	3	localObject1	Object
    //   368	46	3	localIOException1	IOException
    //   430	28	3	localIOException2	IOException
    //   474	9	3	localIOException3	IOException
    //   498	27	3	localObject2	Object
    //   16	261	4	arrayOfByte	byte[]
    //   383	16	4	localIOException4	IOException
    //   407	1	4	localObject3	Object
    //   445	27	4	localObject4	Object
    //   489	1	4	localObject5	Object
    //   494	1	4	localObject6	Object
    //   502	1	4	localObject7	Object
    //   511	1	4	localIOException5	IOException
    //   520	1	4	localIOException6	IOException
    //   20	508	5	localObject8	Object
    //   25	424	6	i	int
    //   32	494	7	localObject9	Object
    //   37	36	8	l1	long
    //   42	19	10	j	int
    //   47	21	11	l2	long
    //   77	264	13	localObject10	Object
    //   93	11	14	k	int
    //   147	82	14	bool	boolean
    //   253	134	14	m	int
    //   124	191	15	n	int
    //   303	102	16	i1	int
    //   337	6	17	localInteger	Integer
    // Exception table:
    //   from	to	target	type
    //   351	355	368	java/io/IOException
    //   12	16	383	java/io/IOException
    //   22	25	383	java/io/IOException
    //   27	32	383	java/io/IOException
    //   39	42	383	java/io/IOException
    //   56	58	383	java/io/IOException
    //   67	70	383	java/io/IOException
    //   72	77	383	java/io/IOException
    //   86	90	383	java/io/IOException
    //   90	93	383	java/io/IOException
    //   95	97	383	java/io/IOException
    //   110	113	383	java/io/IOException
    //   115	120	383	java/io/IOException
    //   122	124	383	java/io/IOException
    //   126	131	383	java/io/IOException
    //   138	143	383	java/io/IOException
    //   143	147	383	java/io/IOException
    //   158	161	383	java/io/IOException
    //   163	168	383	java/io/IOException
    //   174	179	383	java/io/IOException
    //   181	184	383	java/io/IOException
    //   188	192	383	java/io/IOException
    //   194	199	383	java/io/IOException
    //   201	206	383	java/io/IOException
    //   211	216	383	java/io/IOException
    //   217	221	383	java/io/IOException
    //   413	417	430	java/io/IOException
    //   12	16	445	finally
    //   22	25	445	finally
    //   27	32	445	finally
    //   39	42	445	finally
    //   56	58	445	finally
    //   67	70	445	finally
    //   72	77	445	finally
    //   86	90	445	finally
    //   90	93	445	finally
    //   95	97	445	finally
    //   110	113	445	finally
    //   115	120	445	finally
    //   122	124	445	finally
    //   126	131	445	finally
    //   138	143	445	finally
    //   143	147	445	finally
    //   158	161	445	finally
    //   163	168	445	finally
    //   174	179	445	finally
    //   181	184	445	finally
    //   188	192	445	finally
    //   194	199	445	finally
    //   201	206	445	finally
    //   211	216	445	finally
    //   217	221	445	finally
    //   457	461	474	java/io/IOException
    //   228	233	489	finally
    //   245	250	489	finally
    //   250	253	489	finally
    //   257	262	489	finally
    //   262	267	489	finally
    //   267	272	489	finally
    //   293	298	489	finally
    //   298	303	489	finally
    //   317	321	489	finally
    //   323	328	489	finally
    //   332	337	489	finally
    //   342	347	489	finally
    //   276	281	494	finally
    //   281	286	494	finally
    //   398	403	502	finally
    //   228	233	511	java/io/IOException
    //   245	250	511	java/io/IOException
    //   250	253	511	java/io/IOException
    //   257	262	511	java/io/IOException
    //   262	267	511	java/io/IOException
    //   267	272	511	java/io/IOException
    //   293	298	511	java/io/IOException
    //   298	303	511	java/io/IOException
    //   317	321	511	java/io/IOException
    //   323	328	511	java/io/IOException
    //   332	337	511	java/io/IOException
    //   342	347	511	java/io/IOException
    //   276	281	520	java/io/IOException
    //   281	286	520	java/io/IOException
  }
  
  private URL zzb(zzab paramzzab, String paramString)
  {
    bool = paramzzab.zzlt();
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = zzjn().zzkF();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = zzjn().zzkH();
      localObject1 = (String)localObject3 + "?" + paramString;
    }
    for (localObject3 = localObject1;; localObject3 = localObject1)
    {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>((String)localObject3);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        for (;;)
        {
          localObject3 = "Error trying to parse the hardcoded host url";
          zze((String)localObject3, localMalformedURLException);
          bool = false;
          Object localObject2 = null;
        }
      }
      return (URL)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = zzjn().zzkG();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = zzjn().zzkH();
      localObject1 = (String)localObject3 + "?" + paramString;
    }
  }
  
  private void zzb(HttpURLConnection paramHttpURLConnection)
  {
    localObject1 = null;
    try
    {
      localObject1 = paramHttpURLConnection.getInputStream();
      int i = 1024;
      byte[] arrayOfByte = new byte[i];
      int j;
      do
      {
        j = ((InputStream)localObject1).read(arrayOfByte);
      } while (j > 0);
      if (localObject1 != null) {}
      try
      {
        ((InputStream)localObject1).close();
        return;
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          localObject1 = "Error closing http connection input stream";
          zze((String)localObject1, localIOException2);
        }
      }
      try
      {
        ((InputStream)localObject1).close();
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          String str = "Error closing http connection input stream";
          zze(str, localIOException1);
        }
      }
    }
    finally
    {
      if (localObject1 == null) {}
    }
  }
  
  private boolean zzg(zzab paramzzab)
  {
    int i = 200;
    boolean bool1 = true;
    String str = null;
    zzx.zzz(paramzzab);
    boolean bool2 = paramzzab.zzlt();
    Object localObject;
    if (!bool2)
    {
      bool2 = bool1;
      localObject = zza(paramzzab, bool2);
      if (localObject != null) {
        break label72;
      }
      localObject = zzjm();
      str = "Error formatting hit for upload";
      ((zzaf)localObject).zza(paramzzab, str);
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label72:
      int k = ((String)localObject).length();
      zzr localzzr = zzjn();
      int m = localzzr.zzku();
      int j;
      if (k <= m)
      {
        localObject = zzb(paramzzab, (String)localObject);
        if (localObject == null)
        {
          localObject = "Failed to build collect GET endpoint url";
          zzbh((String)localObject);
          bool1 = false;
        }
        else
        {
          j = zzb((URL)localObject);
          if (j != i) {
            bool1 = false;
          }
        }
      }
      else
      {
        localObject = zza(paramzzab, false);
        if (localObject == null)
        {
          localObject = zzjm();
          str = "Error formatting hit for POST upload";
          ((zzaf)localObject).zza(paramzzab, str);
        }
        else
        {
          localObject = ((String)localObject).getBytes();
          k = localObject.length;
          localzzr = zzjn();
          m = localzzr.zzkw();
          if (k > m)
          {
            localObject = zzjm();
            str = "Hit payload exceeds size limit";
            ((zzaf)localObject).zza(paramzzab, str);
          }
          else
          {
            URL localURL = zzh(paramzzab);
            if (localURL == null)
            {
              localObject = "Failed to build collect POST endpoint url";
              zzbh((String)localObject);
              bool1 = false;
            }
            else
            {
              j = zza(localURL, (byte[])localObject);
              if (j != i) {
                bool1 = false;
              }
            }
          }
        }
      }
    }
  }
  
  private static byte[] zzg(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
    localGZIPOutputStream.<init>(localByteArrayOutputStream);
    localGZIPOutputStream.write(paramArrayOfByte);
    localGZIPOutputStream.close();
    localByteArrayOutputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
  
  private URL zzh(zzab paramzzab)
  {
    bool = paramzzab.zzlt();
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = zzjn().zzkF();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = zzjn().zzkH();
      localObject1 = (String)localObject3;
    }
    for (localObject3 = localObject1;; localObject3 = localObject1)
    {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>((String)localObject3);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        for (;;)
        {
          localObject3 = "Error trying to parse the hardcoded host url";
          zze((String)localObject3, localMalformedURLException);
          bool = false;
          Object localObject2 = null;
        }
      }
      return (URL)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = zzjn().zzkG();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = zzjn().zzkH();
      localObject1 = (String)localObject3;
    }
  }
  
  private String zzi(zzab paramzzab)
  {
    return String.valueOf(paramzzab.zzlq());
  }
  
  private URL zzlC()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    str = zzjn().zzkF();
    localObject1 = ((StringBuilder)localObject1).append(str);
    str = zzjn().zzkI();
    localObject1 = ((StringBuilder)localObject1).append(str);
    str = ((StringBuilder)localObject1).toString();
    try
    {
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(str);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        str = "Error trying to parse the hardcoded host url";
        zze(str, localMalformedURLException);
        Object localObject2 = null;
      }
    }
    return (URL)localObject1;
  }
  
  String zza(zzab paramzzab, boolean paramBoolean)
  {
    zzx.zzz(paramzzab);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    try
    {
      Object localObject1 = paramzzab.zzn();
      localObject1 = ((Map)localObject1).entrySet();
      localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (Map.Entry)localObject1;
        localObject4 = ((Map.Entry)localObject1).getKey();
        localObject4 = (String)localObject4;
        String str = "ht";
        boolean bool2 = str.equals(localObject4);
        if (!bool2)
        {
          str = "qt";
          bool2 = str.equals(localObject4);
          if (!bool2)
          {
            str = "AppUID";
            bool2 = str.equals(localObject4);
            if (!bool2)
            {
              str = "z";
              bool2 = str.equals(localObject4);
              if (!bool2)
              {
                str = "_gmsv";
                bool2 = str.equals(localObject4);
                if (!bool2)
                {
                  localObject1 = ((Map.Entry)localObject1).getValue();
                  localObject1 = (String)localObject1;
                  zza(localStringBuilder, (String)localObject4, (String)localObject1);
                }
              }
            }
          }
        }
      }
      return (String)localObject2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject4 = "Failed to encode name or value";
      zze((String)localObject4, localUnsupportedEncodingException);
      bool1 = false;
      localObject2 = null;
    }
    Object localObject2 = "ht";
    long l1 = paramzzab.zzlr();
    Object localObject4 = String.valueOf(l1);
    zza(localStringBuilder, (String)localObject2, (String)localObject4);
    localObject2 = zzjl();
    long l2 = ((zzmq)localObject2).currentTimeMillis();
    l1 = paramzzab.zzlr();
    l2 -= l1;
    Object localObject3 = "qt";
    localObject2 = String.valueOf(l2);
    zza(localStringBuilder, (String)localObject3, (String)localObject2);
    localObject2 = zzjn();
    boolean bool1 = ((zzr)localObject2).zzkr();
    if (bool1)
    {
      localObject2 = "_gmsv";
      localObject4 = zze.VERSION;
      zza(localStringBuilder, (String)localObject2, (String)localObject4);
    }
    if (paramBoolean)
    {
      l2 = paramzzab.zzlu();
      l1 = 0L;
      boolean bool3 = l2 < l1;
      if (!bool3) {
        break label398;
      }
    }
    label398:
    for (localObject2 = String.valueOf(l2);; localObject2 = zzi(paramzzab))
    {
      localObject4 = "z";
      zza(localStringBuilder, (String)localObject4, (String)localObject2);
      localObject2 = localStringBuilder.toString();
      break;
    }
  }
  
  List zza(List paramList, boolean paramBoolean)
  {
    boolean bool1 = paramList.isEmpty();
    Object localObject1;
    Object localObject2;
    int j;
    Object localObject3;
    Object localObject4;
    label82:
    int i;
    if (!bool1)
    {
      bool1 = true;
      zzx.zzac(bool1);
      localObject1 = "Uploading batched hits. compression, count";
      localObject2 = Boolean.valueOf(paramBoolean);
      j = paramList.size();
      localObject3 = Integer.valueOf(j);
      zza((String)localObject1, localObject2, localObject3);
      localObject3 = new com/google/android/gms/analytics/internal/zzah$zza;
      ((zzah.zza)localObject3).<init>(this);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject4 = paramList.iterator();
      bool1 = ((Iterator)localObject4).hasNext();
      if (bool1)
      {
        localObject1 = (zzab)((Iterator)localObject4).next();
        boolean bool3 = ((zzah.zza)localObject3).zzj((zzab)localObject1);
        if (bool3) {
          break label145;
        }
      }
      i = ((zzah.zza)localObject3).zzlE();
      if (i != 0) {
        break label172;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (List)localObject1;
      i = 0;
      localObject1 = null;
      break;
      label145:
      long l = ((zzab)localObject1).zzlq();
      localObject1 = Long.valueOf(l);
      ((List)localObject2).add(localObject1);
      break label82;
      label172:
      localObject1 = zzlC();
      if (localObject1 == null)
      {
        zzbh("Failed to build batching endpoint url");
        localObject1 = Collections.emptyList();
      }
      else
      {
        if (paramBoolean) {
          localObject4 = ((zzah.zza)localObject3).getPayload();
        }
        for (i = zzb((URL)localObject1, (byte[])localObject4);; i = zza((URL)localObject1, (byte[])localObject4))
        {
          int k = 200;
          if (k != i) {
            break label278;
          }
          j = ((zzah.zza)localObject3).zzlE();
          localObject3 = Integer.valueOf(j);
          zza("Batched upload completed. Hits batched", localObject3);
          localObject1 = localObject2;
          break;
          localObject4 = ((zzah.zza)localObject3).getPayload();
        }
        label278:
        localObject3 = Integer.valueOf(i);
        zza("Network error uploading hits. status code", localObject3);
        localObject2 = zzjn().zzkL();
        localObject1 = Integer.valueOf(i);
        boolean bool2 = ((Set)localObject2).contains(localObject1);
        if (bool2)
        {
          zzbg("Server instructed the client to stop batching");
          localObject1 = this.zzTc;
          ((zzaj)localObject1).start();
        }
        localObject1 = Collections.emptyList();
      }
    }
  }
  
  HttpURLConnection zzc(URL paramURL)
  {
    String str = null;
    Object localObject = paramURL.openConnection();
    boolean bool = localObject instanceof HttpURLConnection;
    if (!bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Failed to obtain http connection");
      throw ((Throwable)localObject);
    }
    localObject = (HttpURLConnection)localObject;
    ((HttpURLConnection)localObject).setDefaultUseCaches(false);
    int i = zzjn().zzkU();
    ((HttpURLConnection)localObject).setConnectTimeout(i);
    i = zzjn().zzkV();
    ((HttpURLConnection)localObject).setReadTimeout(i);
    ((HttpURLConnection)localObject).setInstanceFollowRedirects(false);
    str = this.zzzN;
    ((HttpURLConnection)localObject).setRequestProperty("User-Agent", str);
    ((HttpURLConnection)localObject).setDoInput(true);
    return (HttpURLConnection)localObject;
  }
  
  protected void zziJ()
  {
    String str = this.zzzN;
    zza("Network initialized. User agent", str);
  }
  
  public boolean zzlB()
  {
    zzjk();
    zzjv();
    Object localObject1 = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
        continue;
        bool = true;
      }
    }
    if (localObject1 != null)
    {
      bool = ((NetworkInfo)localObject1).isConnected();
      if (bool) {}
    }
    else
    {
      zzbd("No network connectivity");
      bool = false;
      localObject1 = null;
      return bool;
    }
  }
  
  public List zzq(List paramList)
  {
    boolean bool1 = true;
    zzjk();
    zzjv();
    zzx.zzz(paramList);
    Object localObject1 = zzjn().zzkL();
    boolean bool2 = ((Set)localObject1).isEmpty();
    Object localObject2;
    if (!bool2)
    {
      localObject1 = this.zzTc;
      localObject2 = zzjn();
      long l1 = ((zzr)localObject2).zzkE();
      long l2 = 1000L;
      l1 *= l2;
      bool2 = ((zzaj)localObject1).zzv(l1);
      if (bool2) {}
    }
    else
    {
      bool1 = false;
      bool2 = false;
      localObject1 = null;
      if (!bool2) {
        break label156;
      }
    }
    label156:
    for (localObject1 = zza(paramList, bool1);; localObject1 = zzr(paramList))
    {
      return (List)localObject1;
      localObject1 = zzjn().zzkJ();
      localObject2 = zzm.zzRk;
      if (localObject1 != localObject2) {
        bool2 = bool1;
      }
      for (;;)
      {
        localObject2 = zzjn().zzkK();
        zzo localzzo = zzo.zzRv;
        if (localObject2 == localzzo) {
          break;
        }
        bool1 = false;
        break;
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  List zzr(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramList.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramList.iterator();
    boolean bool1 = localIterator.hasNext();
    Object localObject;
    if (bool1)
    {
      localObject = (zzab)localIterator.next();
      boolean bool2 = zzg((zzab)localObject);
      if (bool2) {
        break label63;
      }
    }
    for (;;)
    {
      return localArrayList;
      label63:
      long l = ((zzab)localObject).zzlq();
      localObject = Long.valueOf(l);
      localArrayList.add(localObject);
      int j = localArrayList.size();
      zzr localzzr = zzjn();
      int k = localzzr.zzkC();
      if (j < k) {
        break;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */