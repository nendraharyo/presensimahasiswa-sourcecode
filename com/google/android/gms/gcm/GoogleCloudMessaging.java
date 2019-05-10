package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import com.google.android.gms.iid.zzd;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String INSTANCE_ID_SCOPE = "GCM";
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
  public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
  public static int zzaLM = 5000000;
  public static int zzaLN = 6500000;
  public static int zzaLO = 7000000;
  static GoogleCloudMessaging zzaLP;
  private static final AtomicInteger zzaLS;
  private Context context;
  private PendingIntent zzaLQ;
  private Map zzaLR;
  private final BlockingQueue zzaLT;
  final Messenger zzaLU;
  
  static
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    zzaLS = localAtomicInteger;
  }
  
  public GoogleCloudMessaging()
  {
    Object localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.zzaLT = ((BlockingQueue)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.zzaLR = ((Map)localObject);
    localObject = new android/os/Messenger;
    GoogleCloudMessaging.1 local1 = new com/google/android/gms/gcm/GoogleCloudMessaging$1;
    Looper localLooper = Looper.getMainLooper();
    local1.<init>(this, localLooper);
    ((Messenger)localObject).<init>(local1);
    this.zzaLU = ((Messenger)localObject);
  }
  
  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    synchronized (GoogleCloudMessaging.class)
    {
      GoogleCloudMessaging localGoogleCloudMessaging = zzaLP;
      if (localGoogleCloudMessaging == null)
      {
        localGoogleCloudMessaging = new com/google/android/gms/gcm/GoogleCloudMessaging;
        localGoogleCloudMessaging.<init>();
        zzaLP = localGoogleCloudMessaging;
        localGoogleCloudMessaging = zzaLP;
        Context localContext = paramContext.getApplicationContext();
        localGoogleCloudMessaging.context = localContext;
      }
      localGoogleCloudMessaging = zzaLP;
      return localGoogleCloudMessaging;
    }
  }
  
  static String zza(Intent paramIntent, String paramString)
  {
    if (paramIntent == null)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("SERVICE_NOT_AVAILABLE");
      throw ((Throwable)localObject);
    }
    Object localObject = paramIntent.getStringExtra(paramString);
    if (localObject != null) {
      return (String)localObject;
    }
    localObject = paramIntent.getStringExtra("error");
    if (localObject != null)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>((String)localObject);
      throw localIOException;
    }
    localObject = new java/io/IOException;
    ((IOException)localObject).<init>("SERVICE_NOT_AVAILABLE");
    throw ((Throwable)localObject);
  }
  
  private void zza(String paramString1, String paramString2, long paramLong, int paramInt, Bundle paramBundle)
  {
    if (paramString1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Missing 'to'");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/content/Intent;
    Object localObject2 = "com.google.android.gcm.intent.SEND";
    ((Intent)localObject1).<init>((String)localObject2);
    if (paramBundle != null) {
      ((Intent)localObject1).putExtras(paramBundle);
    }
    zzs((Intent)localObject1);
    localObject2 = zzaJ(this.context);
    ((Intent)localObject1).setPackage((String)localObject2);
    ((Intent)localObject1).putExtra("google.to", paramString1);
    ((Intent)localObject1).putExtra("google.message_id", paramString2);
    Object localObject3 = Long.toString(paramLong);
    ((Intent)localObject1).putExtra("google.ttl", (String)localObject3);
    localObject3 = Integer.toString(paramInt);
    ((Intent)localObject1).putExtra("google.delay", (String)localObject3);
    localObject3 = zzdZ(paramString1);
    ((Intent)localObject1).putExtra("google.from", (String)localObject3);
    localObject2 = zzaJ(this.context);
    localObject3 = ".gsf";
    boolean bool1 = ((String)localObject2).contains((CharSequence)localObject3);
    if (bool1)
    {
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
      localObject1 = paramBundle.keySet();
      Object localObject4 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject4).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (String)((Iterator)localObject4).next();
        localObject2 = paramBundle.get((String)localObject1);
        boolean bool3 = localObject2 instanceof String;
        if (bool3)
        {
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          String str = "gcm.";
          localObject5 = str + (String)localObject1;
          localObject1 = localObject2;
          localObject1 = (String)localObject2;
          ((Bundle)localObject3).putString((String)localObject5, (String)localObject1);
        }
      }
      ((Bundle)localObject3).putString("google.to", paramString1);
      ((Bundle)localObject3).putString("google.message_id", paramString2);
      localObject1 = InstanceID.getInstance(this.context);
      localObject2 = "GCM";
      localObject4 = "upstream";
      ((InstanceID)localObject1).zzc((String)localObject2, (String)localObject4, (Bundle)localObject3);
    }
    for (;;)
    {
      return;
      localObject2 = this.context;
      localObject3 = "com.google.android.gtalkservice.permission.GTALK_SERVICE";
      ((Context)localObject2).sendOrderedBroadcast((Intent)localObject1, (String)localObject3);
    }
  }
  
  public static String zzaJ(Context paramContext)
  {
    return zzc.zzaN(paramContext);
  }
  
  public static int zzaK(Context paramContext)
  {
    Object localObject = paramContext.getPackageManager();
    try
    {
      String str = zzaJ(paramContext);
      localObject = ((PackageManager)localObject).getPackageInfo(str, 0);
      i = ((PackageInfo)localObject).versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i = -1;
      }
    }
    return i;
  }
  
  private String zzdZ(String paramString)
  {
    int i = paramString.indexOf('@');
    if (i > 0) {
      paramString = paramString.substring(0, i);
    }
    return InstanceID.getInstance(this.context).zzyB().zzi("", paramString, "GCM");
  }
  
  private boolean zzr(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getStringExtra("In-Reply-To");
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = "error";
      boolean bool1 = paramIntent.hasExtra((String)localObject2);
      if (bool1) {
        localObject1 = paramIntent.getStringExtra("google.message_id");
      }
    }
    boolean bool2;
    if (localObject1 != null)
    {
      localObject2 = this.zzaLR;
      localObject1 = (Handler)((Map)localObject2).remove(localObject1);
      if (localObject1 != null)
      {
        localObject2 = Message.obtain();
        ((Message)localObject2).obj = paramIntent;
        bool2 = ((Handler)localObject1).sendMessage((Message)localObject2);
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private String zzyk()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("google.rpc");
    String str = String.valueOf(zzaLS.getAndIncrement());
    return str;
  }
  
  public void close()
  {
    zzaLP = null;
    zzb.zzaLC = null;
    zzyl();
  }
  
  public String getMessageType(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    String str2 = "com.google.android.c2dm.intent.RECEIVE";
    boolean bool = str2.equals(str1);
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return str1;
      str1 = paramIntent.getStringExtra("message_type");
      if (str1 == null) {
        str1 = "gcm";
      }
    }
  }
  
  /* Error */
  public String register(String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 355	com/google/android/gms/gcm/GoogleCloudMessaging:zzc	([Ljava/lang/String;)Ljava/lang/String;
    //   7: astore_2
    //   8: new 189	android/os/Bundle
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 190	android/os/Bundle:<init>	()V
    //   16: aload_0
    //   17: getfield 114	com/google/android/gms/gcm/GoogleCloudMessaging:context	Landroid/content/Context;
    //   20: astore 4
    //   22: aload 4
    //   24: invokestatic 147	com/google/android/gms/gcm/GoogleCloudMessaging:zzaJ	(Landroid/content/Context;)Ljava/lang/String;
    //   27: astore 4
    //   29: ldc -75
    //   31: astore 5
    //   33: aload 4
    //   35: aload 5
    //   37: invokevirtual 187	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   40: istore 6
    //   42: iload 6
    //   44: ifeq +46 -> 90
    //   47: ldc_w 357
    //   50: astore 4
    //   52: aload_3
    //   53: aload 4
    //   55: aload_2
    //   56: invokevirtual 230	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: aload_0
    //   60: getfield 114	com/google/android/gms/gcm/GoogleCloudMessaging:context	Landroid/content/Context;
    //   63: astore 4
    //   65: aload 4
    //   67: invokestatic 236	com/google/android/gms/iid/InstanceID:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/iid/InstanceID;
    //   70: astore 4
    //   72: ldc 15
    //   74: astore 5
    //   76: aload 4
    //   78: aload_2
    //   79: aload 5
    //   81: aload_3
    //   82: invokevirtual 360	com/google/android/gms/iid/InstanceID:getToken	(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: areturn
    //   90: ldc_w 362
    //   93: astore 4
    //   95: aload_3
    //   96: aload 4
    //   98: aload_2
    //   99: invokevirtual 230	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload_0
    //   103: aload_3
    //   104: invokevirtual 365	com/google/android/gms/gcm/GoogleCloudMessaging:zzE	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   107: astore_2
    //   108: ldc_w 367
    //   111: astore_3
    //   112: aload_2
    //   113: aload_3
    //   114: invokestatic 371	com/google/android/gms/gcm/GoogleCloudMessaging:zza	(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    //   117: astore_2
    //   118: goto -32 -> 86
    //   121: astore_2
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_2
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	GoogleCloudMessaging
    //   0	126	1	paramVarArgs	String[]
    //   7	111	2	localObject1	Object
    //   121	4	2	localObject2	Object
    //   11	103	3	localObject3	Object
    //   20	77	4	localObject4	Object
    //   31	49	5	str	String
    //   40	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	121	finally
    //   8	11	121	finally
    //   12	16	121	finally
    //   16	20	121	finally
    //   22	27	121	finally
    //   35	40	121	finally
    //   55	59	121	finally
    //   59	63	121	finally
    //   65	70	121	finally
    //   81	85	121	finally
    //   98	102	121	finally
    //   103	107	121	finally
    //   113	117	121	finally
  }
  
  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
  {
    zza(paramString1, paramString2, paramLong, -1, paramBundle);
  }
  
  public void send(String paramString1, String paramString2, Bundle paramBundle)
  {
    send(paramString1, paramString2, -1, paramBundle);
  }
  
  public void unregister()
  {
    try
    {
      Object localObject1 = Looper.getMainLooper();
      Object localObject4 = Looper.myLooper();
      if (localObject1 == localObject4)
      {
        localObject1 = new java/io/IOException;
        localObject4 = "MAIN_THREAD";
        ((IOException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.context;
    localObject3 = InstanceID.getInstance((Context)localObject3);
    ((InstanceID)localObject3).deleteInstanceID();
  }
  
  Intent zzE(Bundle paramBundle)
  {
    Object localObject1 = Looper.getMainLooper();
    Object localObject2 = Looper.myLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("MAIN_THREAD");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.context;
    int i = zzaK((Context)localObject1);
    if (i < 0)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Google Play Services missing");
      throw ((Throwable)localObject1);
    }
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("com.google.android.c2dm.intent.REGISTER");
    localObject2 = zzaJ(this.context);
    ((Intent)localObject1).setPackage((String)localObject2);
    zzs((Intent)localObject1);
    localObject2 = zzyk();
    ((Intent)localObject1).putExtra("google.message_id", (String)localObject2);
    ((Intent)localObject1).putExtras(paramBundle);
    Messenger localMessenger = this.zzaLU;
    ((Intent)localObject1).putExtra("google.messenger", localMessenger);
    localObject2 = this.context;
    ((Context)localObject2).startService((Intent)localObject1);
    try
    {
      localObject1 = this.zzaLT;
      long l = 30000L;
      localObject2 = TimeUnit.MILLISECONDS;
      localObject1 = ((BlockingQueue)localObject1).poll(l, (TimeUnit)localObject2);
      return (Intent)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localObject2 = new java/io/IOException;
      String str = localInterruptedException.getMessage();
      ((IOException)localObject2).<init>(str);
      throw ((Throwable)localObject2);
    }
  }
  
  String zzc(String... paramVarArgs)
  {
    if (paramVarArgs != null)
    {
      i = paramVarArgs.length;
      if (i != 0) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("No senderIds");
      throw ((Throwable)localObject);
    }
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    Object localObject = paramVarArgs[0];
    localStringBuilder1.<init>((String)localObject);
    int i = 1;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      j = 44;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(j);
      String str = paramVarArgs[i];
      localStringBuilder2.append(str);
      i += 1;
    }
    return localStringBuilder1.toString();
  }
  
  void zzs(Intent paramIntent)
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
  
  void zzyl()
  {
    try
    {
      PendingIntent localPendingIntent = this.zzaLQ;
      if (localPendingIntent != null)
      {
        localPendingIntent = this.zzaLQ;
        localPendingIntent.cancel();
        localPendingIntent = null;
        this.zzaLQ = null;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GoogleCloudMessaging.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */