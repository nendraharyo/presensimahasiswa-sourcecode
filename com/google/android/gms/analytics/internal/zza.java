package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmq;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public class zza
  extends zzd
{
  public static boolean zzPV;
  private AdvertisingIdClient.Info zzPW;
  private final zzaj zzPX;
  private String zzPY;
  private boolean zzPZ = false;
  private Object zzQa;
  
  zza(zzf paramzzf)
  {
    super(paramzzf);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzQa = localObject;
    localObject = new com/google/android/gms/analytics/internal/zzaj;
    zzmq localzzmq = paramzzf.zzjl();
    ((zzaj)localObject).<init>(localzzmq);
    this.zzPX = ((zzaj)localObject);
  }
  
  private boolean zza(AdvertisingIdClient.Info paramInfo1, AdvertisingIdClient.Info paramInfo2)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    boolean bool3;
    Object localObject2;
    if (paramInfo2 == null)
    {
      bool3 = false;
      localObject2 = null;
      boolean bool4 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool4) {
        break label46;
      }
      bool3 = bool2;
    }
    label46:
    String str2;
    Object localObject3;
    for (;;)
    {
      return bool3;
      localObject2 = paramInfo2.getId();
      break;
      str2 = zzjr().zzkk();
      for (;;)
      {
        synchronized (this.zzQa)
        {
          bool5 = this.zzPZ;
          if (!bool5)
          {
            localObject1 = zzjb();
            this.zzPY = ((String)localObject1);
            bool1 = true;
            this.zzPZ = bool1;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
            localObject1 = ((StringBuilder)localObject1).append(str2);
            localObject1 = ((StringBuilder)localObject1).toString();
            localObject1 = zzbb((String)localObject1);
            bool5 = TextUtils.isEmpty((CharSequence)localObject1);
            if (!bool5) {
              break label304;
            }
            bool3 = false;
            localObject2 = null;
          }
        }
        localObject5 = this.zzPY;
        boolean bool5 = TextUtils.isEmpty((CharSequence)localObject5);
        if (bool5)
        {
          if (paramInfo1 == null) {}
          for (;;)
          {
            if (localObject1 != null) {
              break label253;
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = ((StringBuilder)localObject1).append(str1);
            localObject3 = ((StringBuilder)localObject3).append(str2);
            localObject3 = ((StringBuilder)localObject3).toString();
            bool3 = zzbc((String)localObject3);
            break;
            localObject1 = paramInfo1.getId();
          }
          label253:
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject1).append(str2);
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject1 = zzbb((String)localObject1);
          this.zzPY = ((String)localObject1);
        }
      }
      label304:
      Object localObject5 = this.zzPY;
      bool1 = ((String)localObject1).equals(localObject5);
      if (!bool1) {
        break label332;
      }
      bool3 = bool2;
    }
    label332:
    localObject1 = this.zzPY;
    bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject6;
    if (!bool1)
    {
      localObject1 = "Resetting the client id because Advertising Id changed.";
      zzbd((String)localObject1);
      localObject1 = zzjr();
      localObject1 = ((zzn)localObject1).zzkl();
      localObject6 = "New client Id";
      zza((String)localObject6, localObject1);
    }
    for (;;)
    {
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject3 = ((StringBuilder)localObject6).append((String)localObject3);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = ((StringBuilder)localObject3).toString();
      bool3 = zzbc((String)localObject3);
      break;
      localObject1 = str2;
    }
  }
  
  private static String zzbb(String paramString)
  {
    int i = 1;
    Object localObject = zzam.zzbv("MD5");
    if (localObject == null) {}
    Locale localLocale;
    String str;
    Object[] arrayOfObject;
    for (localObject = null;; localObject = String.format(localLocale, str, arrayOfObject))
    {
      return (String)localObject;
      localLocale = Locale.US;
      str = "%032X";
      arrayOfObject = new Object[i];
      BigInteger localBigInteger = new java/math/BigInteger;
      byte[] arrayOfByte = paramString.getBytes();
      localObject = ((MessageDigest)localObject).digest(arrayOfByte);
      localBigInteger.<init>(i, (byte[])localObject);
      arrayOfObject[0] = localBigInteger;
    }
  }
  
  private boolean zzbc(String paramString)
  {
    boolean bool = false;
    try
    {
      String str = zzbb(paramString);
      localObject1 = "Storing hashed adid.";
      zzbd((String)localObject1);
      localObject1 = getContext();
      Object localObject2 = "gaClientIdData";
      localObject1 = ((Context)localObject1).openFileOutput((String)localObject2, 0);
      localObject2 = str.getBytes();
      ((FileOutputStream)localObject1).write((byte[])localObject2);
      ((FileOutputStream)localObject1).close();
      this.zzPY = str;
      bool = true;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1 = "Error creating hash file";
        zze((String)localObject1, localIOException);
      }
    }
    return bool;
  }
  
  /* Error */
  private AdvertisingIdClient.Info zziZ()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/google/android/gms/analytics/internal/zza:zzPX	Lcom/google/android/gms/analytics/internal/zzaj;
    //   6: astore_1
    //   7: ldc2_w 173
    //   10: lstore_2
    //   11: aload_1
    //   12: lload_2
    //   13: invokevirtual 180	com/google/android/gms/analytics/internal/zzaj:zzv	(J)Z
    //   16: istore 4
    //   18: iload 4
    //   20: ifeq +42 -> 62
    //   23: aload_0
    //   24: getfield 41	com/google/android/gms/analytics/internal/zza:zzPX	Lcom/google/android/gms/analytics/internal/zzaj;
    //   27: astore_1
    //   28: aload_1
    //   29: invokevirtual 183	com/google/android/gms/analytics/internal/zzaj:start	()V
    //   32: aload_0
    //   33: invokevirtual 187	com/google/android/gms/analytics/internal/zza:zzja	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   36: astore_1
    //   37: aload_0
    //   38: getfield 189	com/google/android/gms/analytics/internal/zza:zzPW	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   41: astore 5
    //   43: aload_0
    //   44: aload 5
    //   46: aload_1
    //   47: invokespecial 192	com/google/android/gms/analytics/internal/zza:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;)Z
    //   50: istore 6
    //   52: iload 6
    //   54: ifeq +17 -> 71
    //   57: aload_0
    //   58: aload_1
    //   59: putfield 189	com/google/android/gms/analytics/internal/zza:zzPW	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   62: aload_0
    //   63: getfield 189	com/google/android/gms/analytics/internal/zza:zzPW	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: areturn
    //   71: ldc -62
    //   73: astore_1
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual 197	com/google/android/gms/analytics/internal/zza:zzbh	(Ljava/lang/String;)V
    //   79: new 50	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   82: astore_1
    //   83: ldc -57
    //   85: astore 5
    //   87: aload_1
    //   88: aload 5
    //   90: iconst_0
    //   91: invokespecial 202	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   94: aload_0
    //   95: aload_1
    //   96: putfield 189	com/google/android/gms/analytics/internal/zza:zzPW	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   99: goto -37 -> 62
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	zza
    //   6	90	1	localObject1	Object
    //   102	4	1	localObject2	Object
    //   10	3	2	l	long
    //   16	3	4	bool1	boolean
    //   41	48	5	localObject3	Object
    //   50	3	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	102	finally
    //   12	16	102	finally
    //   23	27	102	finally
    //   28	32	102	finally
    //   32	36	102	finally
    //   37	41	102	finally
    //   46	50	102	finally
    //   58	62	102	finally
    //   62	66	102	finally
    //   75	79	102	finally
    //   79	82	102	finally
    //   90	94	102	finally
    //   95	99	102	finally
  }
  
  protected void zziJ() {}
  
  public boolean zziU()
  {
    boolean bool1 = false;
    zzjv();
    AdvertisingIdClient.Info localInfo = zziZ();
    if (localInfo != null)
    {
      boolean bool2 = localInfo.isLimitAdTrackingEnabled();
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public String zziY()
  {
    Object localObject1 = null;
    zzjv();
    Object localObject2 = zziZ();
    if (localObject2 != null) {}
    for (localObject2 = ((AdvertisingIdClient.Info)localObject2).getId();; localObject2 = null)
    {
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool) {}
      for (;;)
      {
        return (String)localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  protected AdvertisingIdClient.Info zzja()
  {
    AdvertisingIdClient.Info localInfo = null;
    try
    {
      Context localContext = getContext();
      localInfo = AdvertisingIdClient.getAdvertisingIdInfo(localContext);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        String str1 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.";
        zzbg(str1);
      }
    }
    finally
    {
      for (;;)
      {
        boolean bool = zzPV;
        if (!bool)
        {
          bool = true;
          zzPV = bool;
          String str2 = "Error getting advertiser id";
          zzd(str2, localObject);
        }
      }
    }
    return localInfo;
  }
  
  protected String zzjb()
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject3 = getContext();
        localObject5 = "gaClientIdData";
        localObject5 = ((Context)localObject3).openFileInput((String)localObject5);
        int i = 128;
        arrayOfByte = new byte[i];
        i = 0;
        localObject3 = null;
        j = 128;
        j = ((FileInputStream)localObject5).read(arrayOfByte, 0, j);
        i = ((FileInputStream)localObject5).available();
        if (i <= 0) {
          continue;
        }
        localObject3 = "Hash file seems corrupted, deleting it.";
        zzbg((String)localObject3);
        ((FileInputStream)localObject5).close();
        localObject3 = getContext();
        localObject5 = "gaClientIdData";
        ((Context)localObject3).deleteFile((String)localObject5);
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        Object localObject3;
        byte[] arrayOfByte;
        int j;
        continue;
        str = new java/lang/String;
        str.<init>(arrayOfByte, 0, j);
      }
      catch (IOException localIOException1)
      {
        try
        {
          String str;
          ((FileInputStream)localObject5).close();
          localObject1 = str;
        }
        catch (IOException localIOException2)
        {
          Object localObject5;
          localObject1 = localObject4;
          localObject4 = localIOException2;
          continue;
        }
        catch (FileNotFoundException localFileNotFoundException1)
        {
          Object localObject4;
          Object localObject2 = localObject4;
        }
        localIOException1 = localIOException1;
        zzd("Error reading Hash file, deleting it", localIOException1);
        localObject4 = getContext();
        localObject5 = "gaClientIdData";
        ((Context)localObject4).deleteFile((String)localObject5);
        continue;
        continue;
      }
      return (String)localObject1;
      if (j > 0) {
        continue;
      }
      localObject3 = "Hash file is empty.";
      zzbd((String)localObject3);
      ((FileInputStream)localObject5).close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */