package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class zzc
{
  static String zzaNg = null;
  static int zzaNh = 0;
  static int zzaNi = 0;
  static int zzaNj = 0;
  Context context;
  PendingIntent zzaLQ;
  Messenger zzaLU;
  Map zzaNk;
  Messenger zzaNl;
  MessengerCompat zzaNm;
  long zzaNn;
  long zzaNo;
  int zzaNp;
  int zzaNq;
  long zzaNr;
  
  public zzc(Context paramContext)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaNk = localHashMap;
    this.context = paramContext;
  }
  
  private void zzE(Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject1 = this.zzaNk;
      localObject1 = ((Map)localObject1).keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        Object localObject3 = this.zzaNk;
        localObject3 = ((Map)localObject3).get(localObject1);
        Map localMap = this.zzaNk;
        localMap.put(localObject1, paramObject);
        zzg(localObject3, paramObject);
      }
    }
  }
  
  static String zza(KeyPair paramKeyPair, String... paramVarArgs)
  {
    String str1 = null;
    Object localObject1 = "\n";
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      try
      {
        localObject1 = TextUtils.join((CharSequence)localObject1, paramVarArgs);
        localObject2 = "UTF-8";
        localObject2 = ((String)localObject1).getBytes((String)localObject2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        boolean bool;
        localObject2 = "InstanceID/Rpc";
        localObject3 = "Unable to encode string";
        Log.e((String)localObject2, (String)localObject3, localUnsupportedEncodingException);
        continue;
        String str2 = "SHA256withECDSA";
        continue;
      }
      try
      {
        localObject3 = paramKeyPair.getPrivate();
        bool = localObject3 instanceof RSAPrivateKey;
        if (!bool) {
          continue;
        }
        localObject1 = "SHA256withRSA";
        localObject1 = Signature.getInstance((String)localObject1);
        ((Signature)localObject1).initSign((PrivateKey)localObject3);
        ((Signature)localObject1).update((byte[])localObject2);
        localObject1 = ((Signature)localObject1).sign();
        str1 = InstanceID.zzn((byte[])localObject1);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localObject2 = "InstanceID/Rpc";
        localObject3 = "Unable to sign registration request";
        Log.e((String)localObject2, (String)localObject3, localGeneralSecurityException);
      }
    }
    return str1;
  }
  
  public static String zzaN(Context paramContext)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = zzaNg;
    if (localObject2 != null)
    {
      localObject2 = zzaNg;
      return (String)localObject2;
    }
    int j = Process.myUid();
    zzaNh = j;
    Object localObject5 = paramContext.getPackageManager();
    localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("com.google.android.c2dm.intent.REGISTER");
    localObject2 = ((PackageManager)localObject5).queryIntentServices((Intent)localObject2, 0);
    Object localObject6 = ((List)localObject2).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject6).hasNext();
      if (bool)
      {
        localObject2 = (ResolveInfo)((Iterator)localObject6).next();
        localObject1 = "com.google.android.c2dm.permission.RECEIVE";
        localObject7 = ((ResolveInfo)localObject2).serviceInfo.packageName;
        i = ((PackageManager)localObject5).checkPermission((String)localObject1, (String)localObject7);
        if (i != 0) {}
      }
      try
      {
        localObject1 = ((ResolveInfo)localObject2).serviceInfo;
        localObject1 = ((ServiceInfo)localObject1).packageName;
        localObject7 = null;
        localObject1 = ((PackageManager)localObject5).getApplicationInfo((String)localObject1, 0);
        localObject7 = "InstanceID/Rpc";
        localObject8 = new java/lang/StringBuilder;
        ((StringBuilder)localObject8).<init>();
        String str = "Found ";
        localObject8 = ((StringBuilder)localObject8).append(str);
        int m = ((ApplicationInfo)localObject1).uid;
        localObject8 = ((StringBuilder)localObject8).append(m);
        localObject8 = ((StringBuilder)localObject8).toString();
        Log.w((String)localObject7, (String)localObject8);
        i = ((ApplicationInfo)localObject1).uid;
        zzaNi = i;
        localObject2 = ((ResolveInfo)localObject2).serviceInfo;
        localObject2 = ((ServiceInfo)localObject2).packageName;
        zzaNg = (String)localObject2;
        localObject2 = zzaNg;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException3) {}
      localObject1 = "InstanceID/Rpc";
      Object localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      Object localObject8 = "Possible malicious package ";
      localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
      localObject2 = ((ResolveInfo)localObject2).serviceInfo.packageName;
      localObject2 = ((StringBuilder)localObject7).append((String)localObject2).append(" declares ").append("com.google.android.c2dm.intent.REGISTER");
      localObject7 = " without permission";
      localObject2 = (String)localObject7;
      Log.w((String)localObject1, (String)localObject2);
      continue;
      Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
      localObject2 = "com.google.android.gms";
      localObject6 = null;
      try
      {
        localObject2 = ((PackageManager)localObject5).getApplicationInfo((String)localObject2, 0);
        localObject6 = ((ApplicationInfo)localObject2).packageName;
        zzaNg = (String)localObject6;
        k = ((ApplicationInfo)localObject2).uid;
        zzaNi = k;
        localObject2 = zzaNg;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        int k;
        Object localObject3 = "com.google.android.gsf";
        localObject6 = null;
        try
        {
          localObject3 = ((PackageManager)localObject5).getApplicationInfo((String)localObject3, 0);
          localObject5 = ((ApplicationInfo)localObject3).packageName;
          zzaNg = (String)localObject5;
          k = ((ApplicationInfo)localObject3).uid;
          zzaNi = k;
          localObject3 = zzaNg;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          localObject5 = "Both Google Play Services and legacy GSF package are missing";
          Log.w("InstanceID/Rpc", (String)localObject5);
          k = 0;
          Object localObject4 = null;
        }
      }
      break;
    }
  }
  
  private Intent zzb(Bundle paramBundle, KeyPair paramKeyPair)
  {
    Object localObject1 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject1).<init>();
    Object localObject5 = zzyF();
    synchronized (getClass())
    {
      localObject6 = this.zzaNk;
      ((Map)localObject6).put(localObject5, localObject1);
      zza(paramBundle, paramKeyPair, (String)localObject5);
      long l = 30000L;
      ((ConditionVariable)localObject1).block(l);
    }
    synchronized (getClass())
    {
      localObject1 = this.zzaNk;
      localObject1 = ((Map)localObject1).remove(localObject5);
      boolean bool = localObject1 instanceof Intent;
      if (bool)
      {
        localObject1 = (Intent)localObject1;
        return (Intent)localObject1;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      bool = localObject2 instanceof String;
      if (bool)
      {
        localObject5 = new java/io/IOException;
        String str1 = (String)localObject2;
        ((IOException)localObject5).<init>(str1);
        throw ((Throwable)localObject5);
      }
    }
    localObject5 = "InstanceID/Rpc";
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    String str2 = "No response ";
    localObject6 = ((StringBuilder)localObject6).append(str2);
    Object localObject4 = ((StringBuilder)localObject6).append(localObject3);
    localObject4 = ((StringBuilder)localObject4).toString();
    Log.w((String)localObject5, (String)localObject4);
    localObject4 = new java/io/IOException;
    localObject5 = "TIMEOUT";
    ((IOException)localObject4).<init>((String)localObject5);
    throw ((Throwable)localObject4);
  }
  
  private void zzea(String paramString)
  {
    int i = 3;
    Object localObject1 = "com.google.android.gsf";
    Object localObject2 = zzaNg;
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool) {}
    for (;;)
    {
      return;
      int j = this.zzaNp + 1;
      this.zzaNp = j;
      j = this.zzaNp;
      if (j >= i)
      {
        j = this.zzaNp;
        if (j == i)
        {
          localObject1 = new java/util/Random;
          ((Random)localObject1).<init>();
          int k = 1000;
          j = ((Random)localObject1).nextInt(k) + 1000;
          this.zzaNq = j;
        }
        j = this.zzaNq * 2;
        this.zzaNq = j;
        long l1 = SystemClock.elapsedRealtime();
        long l2 = this.zzaNq;
        l1 += l2;
        this.zzaNr = l1;
        localObject1 = "InstanceID/Rpc";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Backoff due to ").append(paramString);
        String str = " for ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        i = this.zzaNq;
        localObject2 = i;
        Log.w((String)localObject1, (String)localObject2);
      }
    }
  }
  
  private void zzg(Object paramObject1, Object paramObject2)
  {
    boolean bool = paramObject1 instanceof ConditionVariable;
    Object localObject;
    if (bool)
    {
      localObject = paramObject1;
      localObject = (ConditionVariable)paramObject1;
      ((ConditionVariable)localObject).open();
    }
    bool = paramObject1 instanceof Messenger;
    if (bool)
    {
      paramObject1 = (Messenger)paramObject1;
      localObject = Message.obtain();
      ((Message)localObject).obj = paramObject2;
    }
    try
    {
      ((Messenger)paramObject1).send((Message)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str2 = "InstanceID/Rpc";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = "Failed to send response ";
        localStringBuilder = localStringBuilder.append(str3);
        String str1 = localRemoteException;
        Log.w(str2, str1);
      }
    }
  }
  
  private void zzi(String paramString, Object paramObject)
  {
    synchronized (getClass())
    {
      Object localObject1 = this.zzaNk;
      localObject1 = ((Map)localObject1).get(paramString);
      Map localMap = this.zzaNk;
      localMap.put(paramString, paramObject);
      zzg(localObject1, paramObject);
      return;
    }
  }
  
  public static String zzyF()
  {
    synchronized (zzc.class)
    {
      int i = zzaNj;
      int j = i + 1;
      zzaNj = j;
      String str = Integer.toString(i);
      return str;
    }
  }
  
  Intent zza(Bundle paramBundle, KeyPair paramKeyPair)
  {
    Intent localIntent = zzb(paramBundle, paramKeyPair);
    if (localIntent != null)
    {
      String str = "google.messenger";
      boolean bool = localIntent.hasExtra(str);
      if (bool) {
        localIntent = zzb(paramBundle, paramKeyPair);
      }
    }
    return localIntent;
  }
  
  void zza(Bundle paramBundle, KeyPair paramKeyPair, String paramString)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.zzaNr;
    long l3 = 0L;
    boolean bool = l2 < l3;
    if (bool)
    {
      l2 = this.zzaNr;
      bool = l1 < l2;
      if (!bool)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Backoff mode, next request attempt: ");
        l1 = this.zzaNr - l1;
        localObject2 = ((StringBuilder)localObject1).append(l1).append(" interval: ");
        int i = this.zzaNq;
        localObject2 = i;
        Log.w("InstanceID/Rpc", (String)localObject2);
        localObject2 = new java/io/IOException;
        ((IOException)localObject2).<init>("RETRY_LATER");
        throw ((Throwable)localObject2);
      }
    }
    zzyE();
    Object localObject2 = zzaNg;
    if (localObject2 == null)
    {
      localObject2 = new java/io/IOException;
      ((IOException)localObject2).<init>("MISSING_INSTANCEID_SERVICE");
      throw ((Throwable)localObject2);
    }
    l1 = SystemClock.elapsedRealtime();
    this.zzaNn = l1;
    localObject2 = new android/content/Intent;
    ((Intent)localObject2).<init>("com.google.android.c2dm.intent.REGISTER");
    String str1 = zzaNg;
    ((Intent)localObject2).setPackage(str1);
    str1 = Integer.toString(GoogleCloudMessaging.zzaK(this.context));
    paramBundle.putString("gmsv", str1);
    String str2 = Integer.toString(Build.VERSION.SDK_INT);
    paramBundle.putString("osv", str2);
    str2 = Integer.toString(InstanceID.zzaL(this.context));
    paramBundle.putString("app_ver", str2);
    paramBundle.putString("cliv", "1");
    str2 = InstanceID.zza(paramKeyPair);
    paramBundle.putString("appid", str2);
    str1 = InstanceID.zzn(paramKeyPair.getPublic().getEncoded());
    paramBundle.putString("pub2", str1);
    Object localObject1 = new String[2];
    String str3 = this.context.getPackageName();
    localObject1[0] = str3;
    localObject1[1] = str1;
    str1 = zza(paramKeyPair, (String[])localObject1);
    paramBundle.putString("sig", str1);
    ((Intent)localObject2).putExtras(paramBundle);
    zzt((Intent)localObject2);
    zzb((Intent)localObject2, paramString);
  }
  
  protected void zzb(Intent paramIntent, String paramString)
  {
    int i = 3;
    long l = SystemClock.elapsedRealtime();
    this.zzaNn = l;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "|ID|" + paramString + "|";
    paramIntent.putExtra("kid", (String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("|ID|").append(paramString);
    Object localObject3 = "|";
    localObject1 = (String)localObject3;
    paramIntent.putExtra("X-kid", (String)localObject1);
    Object localObject4 = "com.google.android.gsf";
    localObject1 = zzaNg;
    boolean bool1 = ((String)localObject4).equals(localObject1);
    localObject1 = paramIntent.getStringExtra("useGsf");
    if (localObject1 != null)
    {
      localObject4 = "1";
      bool1 = ((String)localObject4).equals(localObject1);
    }
    localObject1 = "InstanceID/Rpc";
    boolean bool2 = Log.isLoggable((String)localObject1, i);
    if (bool2)
    {
      localObject1 = "InstanceID/Rpc";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Sending ");
      Bundle localBundle = paramIntent.getExtras();
      localObject3 = localBundle;
      Log.d((String)localObject1, (String)localObject3);
    }
    localObject1 = this.zzaNl;
    if (localObject1 != null)
    {
      localObject3 = this.zzaLU;
      paramIntent.putExtra("google.messenger", (Parcelable)localObject3);
      localObject1 = Message.obtain();
      ((Message)localObject1).obj = paramIntent;
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject3 = this.zzaNl;
        ((Messenger)localObject3).send((Message)localObject1);
        return;
      }
      catch (RemoteException localRemoteException1)
      {
        localObject2 = "InstanceID/Rpc";
        bool2 = Log.isLoggable((String)localObject2, i);
        if (bool2)
        {
          localObject2 = "InstanceID/Rpc";
          localObject3 = "Messenger failed, fallback to startService";
          Log.d((String)localObject2, (String)localObject3);
        }
      }
      if (bool1)
      {
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>("com.google.android.gms.iid.InstanceID");
        localObject2 = this.context.getPackageName();
        ((Intent)localObject4).setPackage((String)localObject2);
        ((Intent)localObject4).putExtra("GSF", paramIntent);
        localObject2 = this.context;
        ((Context)localObject2).startService((Intent)localObject4);
      }
      else
      {
        localObject2 = this.zzaLU;
        paramIntent.putExtra("google.messenger", (Parcelable)localObject2);
        localObject2 = "1";
        paramIntent.putExtra("messenger2", (String)localObject2);
        localObject4 = this.zzaNm;
        Object localObject5;
        if (localObject4 != null)
        {
          localObject4 = Message.obtain();
          ((Message)localObject4).obj = paramIntent;
          try
          {
            localObject2 = this.zzaNm;
            ((MessengerCompat)localObject2).send((Message)localObject4);
          }
          catch (RemoteException localRemoteException2)
          {
            localObject5 = "InstanceID/Rpc";
            bool1 = Log.isLoggable((String)localObject5, i);
            if (bool1)
            {
              localObject5 = "InstanceID/Rpc";
              localObject2 = "Messenger failed, fallback to startService";
              Log.d((String)localObject5, (String)localObject2);
            }
          }
        }
        else
        {
          localObject5 = this.context;
          ((Context)localObject5).startService(paramIntent);
        }
      }
    }
  }
  
  public void zze(Message paramMessage)
  {
    if (paramMessage == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramMessage.obj;
      boolean bool1 = localObject1 instanceof Intent;
      Object localObject2;
      if (bool1)
      {
        localObject1 = (Intent)paramMessage.obj;
        localObject2 = MessengerCompat.class.getClassLoader();
        ((Intent)localObject1).setExtrasClassLoader((ClassLoader)localObject2);
        localObject2 = "google.messenger";
        boolean bool2 = ((Intent)localObject1).hasExtra((String)localObject2);
        if (bool2)
        {
          localObject2 = ((Intent)localObject1).getParcelableExtra("google.messenger");
          bool1 = localObject2 instanceof MessengerCompat;
          if (bool1)
          {
            localObject1 = localObject2;
            localObject1 = (MessengerCompat)localObject2;
            this.zzaNm = ((MessengerCompat)localObject1);
          }
          bool1 = localObject2 instanceof Messenger;
          if (bool1)
          {
            localObject2 = (Messenger)localObject2;
            this.zzaNl = ((Messenger)localObject2);
          }
        }
        localObject1 = (Intent)paramMessage.obj;
        zzw((Intent)localObject1);
      }
      else
      {
        localObject1 = "InstanceID/Rpc";
        localObject2 = "Dropping invalid message";
        Log.w((String)localObject1, (String)localObject2);
      }
    }
  }
  
  void zzt(Intent paramIntent)
  {
    try
    {
      Object localObject1 = this.zzaLQ;
      if (localObject1 == null)
      {
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject3 = "com.google.example.invalidpackage";
        ((Intent)localObject1).setPackage((String)localObject3);
        localObject3 = this.context;
        localObject1 = PendingIntent.getBroadcast((Context)localObject3, 0, (Intent)localObject1, 0);
        this.zzaLQ = ((PendingIntent)localObject1);
      }
      localObject1 = "app";
      Object localObject3 = this.zzaLQ;
      paramIntent.putExtra((String)localObject1, (Parcelable)localObject3);
      return;
    }
    finally {}
  }
  
  String zzu(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("SERVICE_NOT_AVAILABLE");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = paramIntent.getStringExtra("registration_id");
    if (localObject1 == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    Object localObject2 = "Retry-After";
    long l = 0L;
    paramIntent.getLongExtra((String)localObject2, l);
    if ((localObject1 == null) || (localObject1 == null))
    {
      localObject1 = paramIntent.getStringExtra("error");
      if (localObject1 != null)
      {
        localObject2 = new java/io/IOException;
        ((IOException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unexpected response from GCM ");
      Object localObject3 = paramIntent.getExtras();
      localObject2 = localObject3;
      localObject3 = new java/lang/Throwable;
      ((Throwable)localObject3).<init>();
      Log.w("InstanceID/Rpc", (String)localObject2, (Throwable)localObject3);
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("SERVICE_NOT_AVAILABLE");
      throw ((Throwable)localObject1);
    }
    return (String)localObject1;
  }
  
  void zzv(Intent paramIntent)
  {
    long l1 = 0L;
    int i = 3;
    int j = 2;
    int k = 1;
    String str1 = "error";
    Object localObject1 = paramIntent.getStringExtra(str1);
    Object localObject2;
    if (localObject1 == null)
    {
      str1 = "InstanceID/Rpc";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Unexpected response, no error or registration id ");
      localObject2 = paramIntent.getExtras();
      localObject1 = localObject2;
      Log.w(str1, (String)localObject1);
    }
    for (;;)
    {
      return;
      str1 = "InstanceID/Rpc";
      boolean bool1 = Log.isLoggable(str1, i);
      String str2;
      if (bool1)
      {
        str1 = "InstanceID/Rpc";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str2 = "Received InstanceID error ";
        localObject2 = str2 + (String)localObject1;
        Log.d(str1, (String)localObject2);
      }
      bool1 = false;
      str1 = null;
      localObject2 = "|";
      boolean bool3 = ((String)localObject1).startsWith((String)localObject2);
      if (bool3)
      {
        localObject2 = ((String)localObject1).split("\\|");
        str2 = "ID";
        Object localObject3 = localObject2[k];
        boolean bool4 = str2.equals(localObject3);
        if (!bool4)
        {
          str2 = "InstanceID/Rpc";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str3 = "Unexpected structured response ";
          localObject3 = ((StringBuilder)localObject3).append(str3);
          localObject1 = (String)localObject1;
          Log.w(str2, (String)localObject1);
        }
        int i1 = localObject2.length;
        if (i1 > j)
        {
          str1 = localObject2[j];
          localObject1 = localObject2[i];
          localObject2 = ":";
          bool3 = ((String)localObject1).startsWith((String)localObject2);
          if (bool3) {
            localObject1 = ((String)localObject1).substring(k);
          }
          label305:
          localObject2 = "error";
          paramIntent.putExtra((String)localObject2, (String)localObject1);
        }
      }
      else
      {
        if (str1 != null) {
          break label471;
        }
        zzE(localObject1);
      }
      for (;;)
      {
        str1 = "Retry-After";
        long l2 = paramIntent.getLongExtra(str1, l1);
        bool1 = l2 < l1;
        if (!bool1) {
          break label482;
        }
        long l3 = SystemClock.elapsedRealtime();
        this.zzaNo = l3;
        int m = (int)l2 * 1000;
        this.zzaNq = m;
        l3 = SystemClock.elapsedRealtime();
        l2 = this.zzaNq;
        l3 += l2;
        this.zzaNr = l3;
        str1 = "InstanceID/Rpc";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Explicit request from server to backoff: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        int n = this.zzaNq;
        localObject1 = n;
        Log.w(str1, (String)localObject1);
        break;
        localObject1 = "UNKNOWN";
        break label305;
        label471:
        zzi(str1, localObject1);
      }
      label482:
      str1 = "SERVICE_NOT_AVAILABLE";
      boolean bool2 = str1.equals(localObject1);
      if (!bool2)
      {
        str1 = "AUTHENTICATION_FAILED";
        bool2 = str1.equals(localObject1);
        if (!bool2) {}
      }
      else
      {
        zzea((String)localObject1);
      }
    }
  }
  
  void zzw(Intent paramIntent)
  {
    int i = 1;
    String str = null;
    int j = 3;
    boolean bool1;
    if (paramIntent == null)
    {
      localObject1 = "InstanceID/Rpc";
      bool1 = Log.isLoggable((String)localObject1, j);
      if (bool1)
      {
        localObject1 = "InstanceID/Rpc";
        localObject2 = "Unexpected response: null";
        Log.d((String)localObject1, (String)localObject2);
      }
    }
    Object localObject3;
    for (;;)
    {
      return;
      localObject1 = paramIntent.getAction();
      localObject2 = "com.google.android.c2dm.intent.REGISTRATION";
      boolean bool2 = ((String)localObject2).equals(localObject1);
      if (bool2) {
        break;
      }
      localObject2 = "com.google.android.gms.iid.InstanceID";
      bool1 = ((String)localObject2).equals(localObject1);
      if (bool1) {
        break;
      }
      localObject1 = "InstanceID/Rpc";
      bool1 = Log.isLoggable((String)localObject1, j);
      if (bool1)
      {
        localObject1 = "InstanceID/Rpc";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unexpected response ");
        localObject3 = paramIntent.getAction();
        localObject2 = (String)localObject3;
        Log.d((String)localObject1, (String)localObject2);
      }
    }
    Object localObject1 = paramIntent.getStringExtra("registration_id");
    if (localObject1 == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      if (localObject2 == null)
      {
        zzv(paramIntent);
        break;
      }
      long l = SystemClock.elapsedRealtime();
      this.zzaNn = l;
      l = 0L;
      this.zzaNr = l;
      this.zzaNp = 0;
      this.zzaNq = 0;
      localObject1 = "InstanceID/Rpc";
      bool1 = Log.isLoggable((String)localObject1, j);
      Object localObject4;
      if (bool1)
      {
        localObject1 = "InstanceID/Rpc";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("AppIDResponse: ").append((String)localObject2).append(" ");
        localObject4 = paramIntent.getExtras();
        localObject3 = localObject4;
        Log.d((String)localObject1, (String)localObject3);
      }
      bool1 = false;
      localObject1 = null;
      localObject3 = "|";
      boolean bool3 = ((String)localObject2).startsWith((String)localObject3);
      if (bool3)
      {
        localObject1 = ((String)localObject2).split("\\|");
        localObject3 = "ID";
        localObject4 = localObject1[i];
        bool3 = ((String)localObject3).equals(localObject4);
        if (!bool3)
        {
          localObject3 = "InstanceID/Rpc";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "Unexpected structured response ";
          localObject4 = ((StringBuilder)localObject4).append(str);
          localObject2 = (String)localObject2;
          Log.w((String)localObject3, (String)localObject2);
        }
        int k = 2;
        localObject2 = localObject1[k];
        int m = localObject1.length;
        int i1 = 4;
        if (m > i1)
        {
          localObject3 = "SYNC";
          localObject4 = localObject1[j];
          boolean bool4 = ((String)localObject3).equals(localObject4);
          if (!bool4) {
            break label551;
          }
          localObject3 = this.context;
          InstanceIDListenerService.zzaM((Context)localObject3);
        }
      }
      boolean bool5;
      label551:
      do
      {
        int n = localObject1.length + -1;
        localObject1 = localObject1[n];
        localObject3 = ":";
        bool5 = ((String)localObject1).startsWith((String)localObject3);
        if (bool5) {
          localObject1 = ((String)localObject1).substring(i);
        }
        localObject3 = "registration_id";
        paramIntent.putExtra((String)localObject3, (String)localObject1);
        localObject1 = localObject2;
        if (localObject1 != null) {
          break label623;
        }
        zzE(paramIntent);
        break;
        localObject3 = "RST";
        localObject4 = localObject1[j];
        bool5 = ((String)localObject3).equals(localObject4);
      } while (!bool5);
      localObject1 = this.context;
      localObject3 = InstanceID.getInstance(this.context).zzyB();
      InstanceIDListenerService.zza((Context)localObject1, (zzd)localObject3);
      localObject1 = "registration_id";
      paramIntent.removeExtra((String)localObject1);
      zzi((String)localObject2, paramIntent);
      break;
      label623:
      zzi((String)localObject1, paramIntent);
      break;
    }
  }
  
  void zzyE()
  {
    Messenger localMessenger = this.zzaLU;
    if (localMessenger != null) {}
    for (;;)
    {
      return;
      zzaN(this.context);
      localMessenger = new android/os/Messenger;
      zzc.1 local1 = new com/google/android/gms/iid/zzc$1;
      Looper localLooper = Looper.getMainLooper();
      local1.<init>(this, localLooper);
      localMessenger.<init>(local1);
      this.zzaLU = localMessenger;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */