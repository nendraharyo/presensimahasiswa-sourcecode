package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class InstanceID
{
  public static final String ERROR_BACKOFF = "RETRY_LATER";
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String ERROR_TIMEOUT = "TIMEOUT";
  static Map zzaMP;
  private static zzd zzaMQ;
  private static zzc zzaMR;
  static String zzaMV;
  Context mContext;
  KeyPair zzaMS;
  String zzaMT = "";
  long zzaMU;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    zzaMP = localHashMap;
  }
  
  protected InstanceID(Context paramContext, String paramString, Bundle paramBundle)
  {
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
    this.zzaMT = paramString;
  }
  
  public static InstanceID getInstance(Context paramContext)
  {
    return zza(paramContext, null);
  }
  
  public static InstanceID zza(Context paramContext, Bundle paramBundle)
  {
    Class localClass = InstanceID.class;
    Object localObject1;
    if (paramBundle == null)
    {
      localObject1 = "";
      if (localObject1 != null) {
        break label153;
      }
      localObject1 = "";
    }
    label153:
    for (Object localObject3 = localObject1;; localObject3 = localObject2)
    {
      try
      {
        Object localObject4 = paramContext.getApplicationContext();
        localObject1 = zzaMQ;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/iid/zzd;
          ((zzd)localObject1).<init>((Context)localObject4);
          zzaMQ = (zzd)localObject1;
          localObject1 = new com/google/android/gms/iid/zzc;
          ((zzc)localObject1).<init>((Context)localObject4);
          zzaMR = (zzc)localObject1;
        }
        int i = zzaL((Context)localObject4);
        localObject1 = Integer.toString(i);
        zzaMV = (String)localObject1;
        localObject1 = zzaMP;
        localObject1 = ((Map)localObject1).get(localObject3);
        localObject1 = (InstanceID)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/iid/InstanceID;
          ((InstanceID)localObject1).<init>((Context)localObject4, (String)localObject3, paramBundle);
          localObject4 = zzaMP;
          ((Map)localObject4).put(localObject3, localObject1);
        }
        return (InstanceID)localObject1;
      }
      finally {}
      localObject1 = "subtype";
      localObject1 = paramBundle.getString((String)localObject1);
      break;
    }
  }
  
  static String zza(KeyPair paramKeyPair)
  {
    Object localObject1 = paramKeyPair.getPublic().getEncoded();
    localObject3 = "SHA1";
    try
    {
      localObject3 = MessageDigest.getInstance((String)localObject3);
      localObject1 = ((MessageDigest)localObject3).digest((byte[])localObject1);
      int i = 0;
      localObject3 = null;
      i = (localObject1[0] & 0xF) + 112;
      int j = 0;
      i = (byte)(i & 0xFF);
      localObject1[0] = i;
      i = 0;
      localObject3 = null;
      j = 8;
      int k = 11;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0, j, k);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localObject3 = "Unexpected error, device missing required alghorithms";
        Log.w("InstanceID", (String)localObject3);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  static int zzaL(Context paramContext)
  {
    int i = 0;
    try
    {
      Object localObject = paramContext.getPackageManager();
      str2 = paramContext.getPackageName();
      localStringBuilder = null;
      localObject = ((PackageManager)localObject).getPackageInfo(str2, 0);
      i = ((PackageInfo)localObject).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str2 = "InstanceID";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = "Never happens: can't find own package ";
        localStringBuilder = localStringBuilder.append(str3);
        String str1 = localNameNotFoundException;
        Log.w(str2, str1);
      }
    }
    return i;
  }
  
  static String zzn(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  public void deleteInstanceID()
  {
    zzb("*", "*", null);
    zzyA();
  }
  
  public void deleteToken(String paramString1, String paramString2)
  {
    zzb(paramString1, paramString2, null);
  }
  
  public long getCreationTime()
  {
    long l1 = this.zzaMU;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      Object localObject = zzaMQ;
      String str1 = this.zzaMT;
      String str2 = "cre";
      localObject = ((zzd)localObject).get(str1, str2);
      if (localObject != null)
      {
        l1 = Long.parseLong((String)localObject);
        this.zzaMU = l1;
      }
    }
    return this.zzaMU;
  }
  
  public String getId()
  {
    return zza(zzyz());
  }
  
  public String getToken(String paramString1, String paramString2)
  {
    return getToken(paramString1, paramString2, null);
  }
  
  public String getToken(String paramString1, String paramString2, Bundle paramBundle)
  {
    int i = 0;
    String str1 = null;
    Object localObject1 = Looper.getMainLooper();
    Object localObject2 = Looper.myLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("MAIN_THREAD");
      throw ((Throwable)localObject1);
    }
    int j = 1;
    boolean bool = zzyD();
    if (bool) {}
    for (String str2 = null; str2 != null; str2 = ((zzd)localObject2).zzi(str3, paramString1, paramString2))
    {
      return str2;
      localObject2 = zzaMQ;
      str3 = this.zzaMT;
    }
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    localObject2 = paramBundle.getString("ttl");
    if (localObject2 != null)
    {
      j = 0;
      localObject1 = null;
    }
    localObject2 = "jwt";
    String str3 = paramBundle.getString("type");
    bool = ((String)localObject2).equals(str3);
    if (bool) {}
    for (;;)
    {
      str2 = zzc(paramString1, paramString2, paramBundle);
      localObject1 = "InstanceID";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = "token: ";
      localObject2 = str3 + str2;
      Log.w((String)localObject1, (String)localObject2);
      if ((str2 == null) || (i == 0)) {
        break;
      }
      localObject1 = zzaMQ;
      str1 = this.zzaMT;
      String str4 = zzaMV;
      localObject2 = paramString1;
      str3 = paramString2;
      ((zzd)localObject1).zza(str1, paramString1, paramString2, str2, str4);
      break;
      i = j;
    }
  }
  
  public void zzb(String paramString1, String paramString2, Bundle paramBundle)
  {
    Object localObject1 = Looper.getMainLooper();
    Object localObject2 = Looper.myLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("MAIN_THREAD");
      throw ((Throwable)localObject1);
    }
    localObject1 = zzaMQ;
    localObject2 = this.zzaMT;
    ((zzd)localObject1).zzj((String)localObject2, paramString1, paramString2);
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    localObject1 = "sender";
    paramBundle.putString((String)localObject1, paramString1);
    if (paramString2 != null)
    {
      localObject1 = "scope";
      paramBundle.putString((String)localObject1, paramString2);
    }
    paramBundle.putString("subscription", paramString1);
    paramBundle.putString("delete", "1");
    paramBundle.putString("X-delete", "1");
    localObject2 = "subtype";
    localObject1 = "";
    String str = this.zzaMT;
    boolean bool1 = ((String)localObject1).equals(str);
    if (bool1)
    {
      localObject1 = paramString1;
      paramBundle.putString((String)localObject2, (String)localObject1);
      localObject1 = "X-subtype";
      localObject2 = "";
      str = this.zzaMT;
      boolean bool2 = ((String)localObject2).equals(str);
      if (!bool2) {
        break label235;
      }
    }
    for (;;)
    {
      paramBundle.putString((String)localObject1, paramString1);
      localObject1 = zzaMR;
      localObject2 = zzyz();
      localObject1 = ((zzc)localObject1).zza(paramBundle, (KeyPair)localObject2);
      zzaMR.zzu((Intent)localObject1);
      return;
      localObject1 = this.zzaMT;
      break;
      label235:
      paramString1 = this.zzaMT;
    }
  }
  
  public String zzc(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2 != null)
    {
      localObject1 = "scope";
      paramBundle.putString((String)localObject1, paramString2);
    }
    paramBundle.putString("sender", paramString1);
    Object localObject1 = "";
    Object localObject2 = this.zzaMT;
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (bool1) {}
    for (localObject1 = paramString1;; localObject1 = this.zzaMT)
    {
      localObject2 = "legacy.register";
      boolean bool2 = paramBundle.containsKey((String)localObject2);
      if (!bool2)
      {
        paramBundle.putString("subscription", paramString1);
        paramBundle.putString("subtype", (String)localObject1);
        paramBundle.putString("X-subscription", paramString1);
        localObject2 = "X-subtype";
        paramBundle.putString((String)localObject2, (String)localObject1);
      }
      localObject1 = zzaMR;
      localObject2 = zzyz();
      localObject1 = ((zzc)localObject1).zza(paramBundle, (KeyPair)localObject2);
      return zzaMR.zzu((Intent)localObject1);
    }
  }
  
  void zzyA()
  {
    this.zzaMU = 0L;
    zzd localzzd = zzaMQ;
    String str = this.zzaMT;
    localzzd.zzee(str);
    this.zzaMS = null;
  }
  
  public zzd zzyB()
  {
    return zzaMQ;
  }
  
  zzc zzyC()
  {
    return zzaMR;
  }
  
  boolean zzyD()
  {
    boolean bool1 = true;
    Object localObject = zzaMQ;
    String str = "appVersion";
    localObject = ((zzd)localObject).get(str);
    boolean bool2;
    if (localObject != null)
    {
      str = zzaMV;
      bool2 = ((String)localObject).equals(str);
      if (bool2) {
        break label38;
      }
    }
    for (;;)
    {
      return bool1;
      label38:
      localObject = zzaMQ;
      str = "lastToken";
      localObject = ((zzd)localObject).get(str);
      if (localObject != null)
      {
        localObject = Long.valueOf(Long.parseLong((String)localObject));
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = ((Long)localObject).longValue();
        l1 -= l2;
        l2 = 604800L;
        bool2 = l1 < l2;
        if (!bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  KeyPair zzyz()
  {
    Object localObject = this.zzaMS;
    String str;
    if (localObject == null)
    {
      localObject = zzaMQ;
      str = this.zzaMT;
      localObject = ((zzd)localObject).zzed(str);
      this.zzaMS = ((KeyPair)localObject);
    }
    localObject = this.zzaMS;
    if (localObject == null)
    {
      long l1 = System.currentTimeMillis();
      this.zzaMU = l1;
      localObject = zzaMQ;
      str = this.zzaMT;
      long l2 = this.zzaMU;
      localObject = ((zzd)localObject).zzd(str, l2);
      this.zzaMS = ((KeyPair)localObject);
    }
    return this.zzaMS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\InstanceID.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */