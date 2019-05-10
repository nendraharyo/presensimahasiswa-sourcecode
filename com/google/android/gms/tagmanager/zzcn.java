package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzrq.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzg;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class zzcn
  implements zzp.zzf
{
  private final Context mContext;
  private final String zzbhM;
  private zzbf zzbkg;
  private final ExecutorService zzbkn;
  
  zzcn(Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.zzbhM = paramString;
    ExecutorService localExecutorService = Executors.newSingleThreadExecutor();
    this.zzbkn = localExecutorService;
  }
  
  private zzrs.zzc zza(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    zzrs.zzc localzzc = null;
    String str1 = "UTF-8";
    try
    {
      str1 = paramByteArrayOutputStream.toString(str1);
      localzzc = zzaz.zzgi(str1);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str2 = "Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.";
        zzbg.zzaI(str2);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        String str3 = "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container";
        zzbg.zzaK(str3);
      }
    }
    return localzzc;
  }
  
  private void zzd(zzrq.zza paramzza)
  {
    Object localObject = paramzza.zzju;
    if (localObject == null)
    {
      localObject = paramzza.zzbme;
      if (localObject == null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Resource and SupplementedResource are NULL.");
        throw ((Throwable)localObject);
      }
    }
  }
  
  private zzrs.zzc zzx(byte[] paramArrayOfByte)
  {
    try
    {
      localObject1 = zzaf.zzf.zzc(paramArrayOfByte);
      localObject1 = zzrs.zzb((zzaf.zzf)localObject1);
      if (localObject1 != null)
      {
        String str = "The container was successfully loaded from the resource (using binary file)";
        zzbg.v(str);
      }
    }
    catch (zzst localzzst)
    {
      for (;;)
      {
        Object localObject1;
        zzbg.e("The resource file is corrupted. The container cannot be extracted from the binary file");
        Object localObject2 = null;
      }
    }
    catch (zzrs.zzg localzzg)
    {
      for (;;)
      {
        zzbg.zzaK("The resource file is invalid. The container from the binary file is invalid");
        Object localObject3 = null;
      }
    }
    return (zzrs.zzc)localObject1;
  }
  
  public void release()
  {
    try
    {
      ExecutorService localExecutorService = this.zzbkn;
      localExecutorService.shutdown();
      return;
    }
    finally {}
  }
  
  public void zzGl()
  {
    ExecutorService localExecutorService = this.zzbkn;
    zzcn.1 local1 = new com/google/android/gms/tagmanager/zzcn$1;
    local1.<init>(this);
    localExecutorService.execute(local1);
  }
  
  /* Error */
  void zzHc()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +15 -> 21
    //   9: new 123	java/lang/IllegalStateException
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 125
    //   16: invokespecial 126	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: athrow
    //   21: aload_0
    //   22: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   25: invokeinterface 131 1 0
    //   30: ldc -123
    //   32: invokestatic 94	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   35: invokestatic 139	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   38: invokevirtual 143	com/google/android/gms/tagmanager/zzcb:zzGV	()Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   41: astore_1
    //   42: getstatic 149	com/google/android/gms/tagmanager/zzcb$zza:zzbjV	Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   45: astore_2
    //   46: aload_1
    //   47: aload_2
    //   48: if_acmpeq +19 -> 67
    //   51: invokestatic 139	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   54: invokevirtual 143	com/google/android/gms/tagmanager/zzcb:zzGV	()Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   57: astore_1
    //   58: getstatic 152	com/google/android/gms/tagmanager/zzcb$zza:zzbjW	Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   61: astore_2
    //   62: aload_1
    //   63: aload_2
    //   64: if_acmpne +42 -> 106
    //   67: aload_0
    //   68: getfield 22	com/google/android/gms/tagmanager/zzcn:zzbhM	Ljava/lang/String;
    //   71: astore_1
    //   72: invokestatic 139	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   75: invokevirtual 156	com/google/android/gms/tagmanager/zzcb:getContainerId	()Ljava/lang/String;
    //   78: astore_2
    //   79: aload_1
    //   80: aload_2
    //   81: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: istore_3
    //   85: iload_3
    //   86: ifeq +20 -> 106
    //   89: aload_0
    //   90: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   93: astore_1
    //   94: getstatic 168	com/google/android/gms/tagmanager/zzbf$zza:zzbju	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   97: astore_2
    //   98: aload_1
    //   99: aload_2
    //   100: invokeinterface 172 2 0
    //   105: return
    //   106: new 174	java/io/FileInputStream
    //   109: astore_2
    //   110: aload_0
    //   111: invokevirtual 178	com/google/android/gms/tagmanager/zzcn:zzHd	()Ljava/io/File;
    //   114: astore_1
    //   115: aload_2
    //   116: aload_1
    //   117: invokespecial 181	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   120: new 34	java/io/ByteArrayOutputStream
    //   123: astore_1
    //   124: aload_1
    //   125: invokespecial 182	java/io/ByteArrayOutputStream:<init>	()V
    //   128: aload_2
    //   129: aload_1
    //   130: invokestatic 185	com/google/android/gms/internal/zzrs:zzb	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   133: aload_1
    //   134: invokevirtual 189	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   137: astore_1
    //   138: aload_1
    //   139: invokestatic 193	com/google/android/gms/internal/zzrq$zza:zzy	([B)Lcom/google/android/gms/internal/zzrq$zza;
    //   142: astore_1
    //   143: aload_0
    //   144: aload_1
    //   145: invokespecial 197	com/google/android/gms/tagmanager/zzcn:zzd	(Lcom/google/android/gms/internal/zzrq$zza;)V
    //   148: aload_0
    //   149: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   152: astore 4
    //   154: aload 4
    //   156: aload_1
    //   157: invokeinterface 201 2 0
    //   162: aload_2
    //   163: invokevirtual 204	java/io/FileInputStream:close	()V
    //   166: ldc -50
    //   168: astore_1
    //   169: aload_1
    //   170: invokestatic 94	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   173: goto -68 -> 105
    //   176: astore_1
    //   177: ldc -48
    //   179: invokestatic 52	com/google/android/gms/tagmanager/zzbg:zzaI	(Ljava/lang/String;)V
    //   182: aload_0
    //   183: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   186: astore_1
    //   187: getstatic 168	com/google/android/gms/tagmanager/zzbf$zza:zzbju	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   190: astore_2
    //   191: aload_1
    //   192: aload_2
    //   193: invokeinterface 172 2 0
    //   198: goto -93 -> 105
    //   201: astore_1
    //   202: ldc -46
    //   204: astore_1
    //   205: aload_1
    //   206: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   209: goto -43 -> 166
    //   212: astore_1
    //   213: aload_0
    //   214: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   217: astore_1
    //   218: getstatic 213	com/google/android/gms/tagmanager/zzbf$zza:zzbjv	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   221: astore 4
    //   223: aload_1
    //   224: aload 4
    //   226: invokeinterface 172 2 0
    //   231: ldc -41
    //   233: astore_1
    //   234: aload_1
    //   235: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   238: aload_2
    //   239: invokevirtual 204	java/io/FileInputStream:close	()V
    //   242: goto -76 -> 166
    //   245: astore_1
    //   246: ldc -46
    //   248: astore_1
    //   249: aload_1
    //   250: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   253: goto -87 -> 166
    //   256: astore_1
    //   257: aload_0
    //   258: getfield 121	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   261: astore_1
    //   262: getstatic 213	com/google/android/gms/tagmanager/zzbf$zza:zzbjv	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   265: astore 4
    //   267: aload_1
    //   268: aload 4
    //   270: invokeinterface 172 2 0
    //   275: ldc -39
    //   277: astore_1
    //   278: aload_1
    //   279: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   282: aload_2
    //   283: invokevirtual 204	java/io/FileInputStream:close	()V
    //   286: goto -120 -> 166
    //   289: astore_1
    //   290: ldc -46
    //   292: astore_1
    //   293: aload_1
    //   294: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   297: goto -131 -> 166
    //   300: astore_1
    //   301: aload_2
    //   302: invokevirtual 204	java/io/FileInputStream:close	()V
    //   305: aload_1
    //   306: athrow
    //   307: astore_2
    //   308: ldc -46
    //   310: astore_2
    //   311: aload_2
    //   312: invokestatic 57	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   315: goto -10 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	zzcn
    //   4	166	1	localObject1	Object
    //   176	1	1	localFileNotFoundException	FileNotFoundException
    //   186	6	1	localzzbf	zzbf
    //   201	1	1	localIOException1	IOException
    //   204	2	1	str1	String
    //   212	1	1	localIOException2	IOException
    //   217	18	1	localObject2	Object
    //   245	1	1	localIOException3	IOException
    //   248	2	1	str2	String
    //   256	1	1	localIllegalArgumentException	IllegalArgumentException
    //   261	18	1	localObject3	Object
    //   289	1	1	localIOException4	IOException
    //   292	2	1	str3	String
    //   300	6	1	localObject4	Object
    //   45	257	2	localObject5	Object
    //   307	1	2	localIOException5	IOException
    //   310	2	2	str4	String
    //   84	2	3	bool	boolean
    //   152	117	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   106	109	176	java/io/FileNotFoundException
    //   110	114	176	java/io/FileNotFoundException
    //   116	120	176	java/io/FileNotFoundException
    //   162	166	201	java/io/IOException
    //   120	123	212	java/io/IOException
    //   124	128	212	java/io/IOException
    //   129	133	212	java/io/IOException
    //   133	137	212	java/io/IOException
    //   138	142	212	java/io/IOException
    //   144	148	212	java/io/IOException
    //   148	152	212	java/io/IOException
    //   156	162	212	java/io/IOException
    //   238	242	245	java/io/IOException
    //   120	123	256	java/lang/IllegalArgumentException
    //   124	128	256	java/lang/IllegalArgumentException
    //   129	133	256	java/lang/IllegalArgumentException
    //   133	137	256	java/lang/IllegalArgumentException
    //   138	142	256	java/lang/IllegalArgumentException
    //   144	148	256	java/lang/IllegalArgumentException
    //   148	152	256	java/lang/IllegalArgumentException
    //   156	162	256	java/lang/IllegalArgumentException
    //   282	286	289	java/io/IOException
    //   120	123	300	finally
    //   124	128	300	finally
    //   129	133	300	finally
    //   133	137	300	finally
    //   138	142	300	finally
    //   144	148	300	finally
    //   148	152	300	finally
    //   156	162	300	finally
    //   213	217	300	finally
    //   218	221	300	finally
    //   224	231	300	finally
    //   234	238	300	finally
    //   257	261	300	finally
    //   262	265	300	finally
    //   268	275	300	finally
    //   278	282	300	finally
    //   301	305	307	java/io/IOException
  }
  
  File zzHd()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("resource_");
    Object localObject2 = this.zzbhM;
    localObject1 = (String)localObject2;
    localObject2 = this.mContext.getDir("google_tagmanager", 0);
    File localFile = new java/io/File;
    localFile.<init>((File)localObject2, (String)localObject1);
    return localFile;
  }
  
  public void zza(zzbf paramzzbf)
  {
    this.zzbkg = paramzzbf;
  }
  
  public void zzb(zzrq.zza paramzza)
  {
    ExecutorService localExecutorService = this.zzbkn;
    zzcn.2 local2 = new com/google/android/gms/tagmanager/zzcn$2;
    local2.<init>(this, paramzza);
    localExecutorService.execute(local2);
  }
  
  boolean zzc(zzrq.zza paramzza)
  {
    boolean bool = false;
    Object localObject1 = null;
    File localFile = zzHd();
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>(localFile);
      try
      {
        byte[] arrayOfByte;
        String str1;
        String str2;
        String str5;
        String str3;
        localFileOutputStream.close();
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          String str4 = "error closing stream for writing resource to disk";
          zzbg.zzaK(str4);
        }
      }
    }
    catch (FileNotFoundException localIOException4)
    {
      for (;;)
      {
        try
        {
          arrayOfByte = zzsu.toByteArray(paramzza);
          localFileOutputStream.write(arrayOfByte);
          bool = true;
        }
        catch (IOException localIOException4)
        {
          localIOException4 = localIOException4;
          str5 = "Error writing resource to disk. Removing resource from disk.";
          zzbg.zzaK(str5);
          str2.delete();
          try
          {
            localFileOutputStream.close();
          }
          catch (IOException localIOException2)
          {
            str3 = "error closing stream for writing resource to disk";
            zzbg.zzaK(str3);
          }
          continue;
        }
        finally {}
        try
        {
          localFileOutputStream.close();
          return bool;
          localFileNotFoundException = localFileNotFoundException;
          str1 = "Error opening resource file for writing";
          zzbg.e(str1);
        }
        catch (IOException localIOException1)
        {
          str2 = "error closing stream for writing resource to disk";
          zzbg.zzaK(str2);
        }
      }
    }
  }
  
  public zzrs.zzc zzke(int paramInt)
  {
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject1 = this.mContext;
        localObject1 = ((Context)localObject1).getResources();
        localObject1 = ((Resources)localObject1).openRawResource(paramInt);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Attempting to load a container from the resource ID ").append(paramInt).append(" (");
        String str = this.mContext.getResources().getResourceName(paramInt);
        localObject3 = ((StringBuilder)localObject3).append(str);
        str = ")";
        localObject3 = str;
        zzbg.v((String)localObject3);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Object localObject1;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Failed to load the container. No default container resource found with the resource ID ";
        zzbg.zzaK((String)localObject3 + paramInt);
        localObject2 = null;
        continue;
        localObject2 = ((ByteArrayOutputStream)localObject3).toByteArray();
        localObject2 = zzx((byte[])localObject2);
        continue;
      }
      try
      {
        localObject3 = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject3).<init>();
        zzrs.zzb((InputStream)localObject1, (OutputStream)localObject3);
        localObject1 = zza((ByteArrayOutputStream)localObject3);
        if (localObject1 == null) {
          continue;
        }
        localObject3 = "The container was successfully loaded from the resource (using JSON file format)";
        zzbg.v((String)localObject3);
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Error reading the default container with resource ID ").append(paramInt).append(" (");
        localObject3 = this.mContext.getResources().getResourceName(paramInt);
        localStringBuilder = localStringBuilder.append((String)localObject3);
        localObject3 = ")";
        zzbg.zzaK((String)localObject3);
        localStringBuilder = null;
      }
    }
    return (zzrs.zzc)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */