package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.a.b;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zzd
{
  Context context;
  SharedPreferences zzaNt;
  
  public zzd(Context paramContext)
  {
    this(paramContext, "com.google.android.gms.appid");
  }
  
  public zzd(Context paramContext, String paramString)
  {
    this.context = paramContext;
    Object localObject = paramContext.getSharedPreferences(paramString, 4);
    this.zzaNt = ((SharedPreferences)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "-no-backup";
    zzeb((String)localObject);
  }
  
  private void zzeb(String paramString)
  {
    Object localObject1 = new android/support/v4/a/b;
    ((b)localObject1).<init>();
    Object localObject2 = this.context;
    localObject1 = ((b)localObject1).a((Context)localObject2);
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((File)localObject1, paramString);
    boolean bool1 = ((File)localObject2).exists();
    if (bool1) {}
    for (;;)
    {
      return;
      boolean bool2;
      try
      {
        bool1 = ((File)localObject2).createNewFile();
        if (!bool1) {
          continue;
        }
        bool1 = isEmpty();
        if (bool1) {
          continue;
        }
        localObject1 = "InstanceID/Store";
        localObject2 = "App restored, clearing state";
        Log.i((String)localObject1, (String)localObject2);
        localObject1 = this.context;
        InstanceIDListenerService.zza((Context)localObject1, this);
      }
      catch (IOException localIOException)
      {
        localObject2 = "InstanceID/Store";
        int i = 3;
        bool2 = Log.isLoggable((String)localObject2, i);
      }
      if (bool2)
      {
        localObject2 = "InstanceID/Store";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = "Error creating file in no backup dir: ";
        localStringBuilder = localStringBuilder.append(str2);
        String str1 = localIOException.getMessage();
        str1 = str1;
        Log.d((String)localObject2, str1);
      }
    }
  }
  
  private String zzh(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return paramString1 + "|T|" + paramString2 + "|" + paramString3;
  }
  
  String get(String paramString)
  {
    try
    {
      Object localObject1 = this.zzaNt;
      localObject1 = ((SharedPreferences)localObject1).getString(paramString, null);
      return (String)localObject1;
    }
    finally {}
  }
  
  String get(String paramString1, String paramString2)
  {
    try
    {
      Object localObject1 = this.zzaNt;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(paramString1);
      String str = "|S|";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).append(paramString2);
      localObject3 = ((StringBuilder)localObject3).toString();
      str = null;
      localObject1 = ((SharedPreferences)localObject1).getString((String)localObject3, null);
      return (String)localObject1;
    }
    finally {}
  }
  
  boolean isEmpty()
  {
    return this.zzaNt.getAll().isEmpty();
  }
  
  void zza(SharedPreferences.Editor paramEditor, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString1);
      String str = "|S|";
      localObject1 = ((StringBuilder)localObject1).append(str);
      localObject1 = ((StringBuilder)localObject1).append(paramString2);
      localObject1 = ((StringBuilder)localObject1).toString();
      paramEditor.putString((String)localObject1, paramString3);
      return;
    }
    finally {}
  }
  
  public void zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      String str1 = zzh(paramString1, paramString2, paramString3);
      Object localObject2 = this.zzaNt;
      localObject2 = ((SharedPreferences)localObject2).edit();
      ((SharedPreferences.Editor)localObject2).putString(str1, paramString4);
      str1 = "appVersion";
      ((SharedPreferences.Editor)localObject2).putString(str1, paramString5);
      str1 = "lastToken";
      long l1 = System.currentTimeMillis();
      long l2 = 1000L;
      l1 /= l2;
      String str2 = Long.toString(l1);
      ((SharedPreferences.Editor)localObject2).putString(str1, str2);
      ((SharedPreferences.Editor)localObject2).commit();
      return;
    }
    finally {}
  }
  
  KeyPair zzd(String paramString, long paramLong)
  {
    try
    {
      KeyPair localKeyPair = zza.zzyy();
      Object localObject2 = this.zzaNt;
      localObject2 = ((SharedPreferences)localObject2).edit();
      String str = "|P|";
      Object localObject3 = localKeyPair.getPublic();
      localObject3 = ((PublicKey)localObject3).getEncoded();
      localObject3 = InstanceID.zzn((byte[])localObject3);
      zza((SharedPreferences.Editor)localObject2, paramString, str, (String)localObject3);
      str = "|K|";
      localObject3 = localKeyPair.getPrivate();
      localObject3 = ((PrivateKey)localObject3).getEncoded();
      localObject3 = InstanceID.zzn((byte[])localObject3);
      zza((SharedPreferences.Editor)localObject2, paramString, str, (String)localObject3);
      str = "cre";
      localObject3 = Long.toString(paramLong);
      zza((SharedPreferences.Editor)localObject2, paramString, str, (String)localObject3);
      ((SharedPreferences.Editor)localObject2).commit();
      return localKeyPair;
    }
    finally {}
  }
  
  public void zzec(String paramString)
  {
    try
    {
      Object localObject1 = this.zzaNt;
      SharedPreferences.Editor localEditor = ((SharedPreferences)localObject1).edit();
      localObject1 = this.zzaNt;
      localObject1 = ((SharedPreferences)localObject1).getAll();
      localObject1 = ((Map)localObject1).keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        boolean bool2 = ((String)localObject1).startsWith(paramString);
        if (bool2) {
          localEditor.remove((String)localObject1);
        }
      }
      localEditor.commit();
    }
    finally {}
  }
  
  public KeyPair zzed(String paramString)
  {
    return zzeg(paramString);
  }
  
  void zzee(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "|";
    zzec((String)localObject);
  }
  
  public void zzef(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "|T|";
    zzec((String)localObject);
  }
  
  KeyPair zzeg(String paramString)
  {
    Object localObject1 = get(paramString, "|P|");
    Object localObject2 = get(paramString, "|K|");
    if (localObject2 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (KeyPair)localObject1;
      int i = 8;
      try
      {
        localObject1 = Base64.decode((String)localObject1, i);
        i = 8;
        localObject2 = Base64.decode((String)localObject2, i);
        localObject3 = "RSA";
        localObject3 = KeyFactory.getInstance((String)localObject3);
        localObject4 = new java/security/spec/X509EncodedKeySpec;
        ((X509EncodedKeySpec)localObject4).<init>((byte[])localObject1);
        localObject4 = ((KeyFactory)localObject3).generatePublic((KeySpec)localObject4);
        localObject1 = new java/security/spec/PKCS8EncodedKeySpec;
        ((PKCS8EncodedKeySpec)localObject1).<init>((byte[])localObject2);
        localObject2 = ((KeyFactory)localObject3).generatePrivate((KeySpec)localObject1);
        localObject1 = new java/security/KeyPair;
        ((KeyPair)localObject1).<init>((PublicKey)localObject4, (PrivateKey)localObject2);
      }
      catch (InvalidKeySpecException localInvalidKeySpecException)
      {
        localObject2 = "InstanceID/Store";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = "Invalid key stored ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        String str = localInvalidKeySpecException;
        Log.w((String)localObject2, str);
        InstanceIDListenerService.zza(this.context, this);
        str = null;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
  }
  
  public String zzi(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = zzh(paramString1, paramString2, paramString3);
      SharedPreferences localSharedPreferences = this.zzaNt;
      str = localSharedPreferences.getString(str, null);
      return str;
    }
    finally {}
  }
  
  public void zzj(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = zzh(paramString1, paramString2, paramString3);
      Object localObject2 = this.zzaNt;
      localObject2 = ((SharedPreferences)localObject2).edit();
      ((SharedPreferences.Editor)localObject2).remove(str);
      ((SharedPreferences.Editor)localObject2).commit();
      return;
    }
    finally {}
  }
  
  public void zzyG()
  {
    try
    {
      Object localObject1 = this.zzaNt;
      localObject1 = ((SharedPreferences)localObject1).edit();
      localObject1 = ((SharedPreferences.Editor)localObject1).clear();
      ((SharedPreferences.Editor)localObject1).commit();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */