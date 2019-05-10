package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GcmPubSub
{
  private static GcmPubSub zzaLE;
  private static final Pattern zzaLG = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
  private InstanceID zzaLF;
  
  private GcmPubSub(Context paramContext)
  {
    InstanceID localInstanceID = InstanceID.getInstance(paramContext);
    this.zzaLF = localInstanceID;
  }
  
  public static GcmPubSub getInstance(Context paramContext)
  {
    synchronized (GcmPubSub.class)
    {
      GcmPubSub localGcmPubSub = zzaLE;
      if (localGcmPubSub == null)
      {
        localGcmPubSub = new com/google/android/gms/gcm/GcmPubSub;
        localGcmPubSub.<init>(paramContext);
        zzaLE = localGcmPubSub;
      }
      localGcmPubSub = zzaLE;
      return localGcmPubSub;
    }
  }
  
  public void subscribe(String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool;
    Object localObject1;
    Object localObject2;
    if (paramString1 != null)
    {
      bool = paramString1.isEmpty();
      if (!bool) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid appInstanceToken: " + paramString1;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramString2 != null)
    {
      localObject1 = zzaLG.matcher(paramString2);
      bool = ((Matcher)localObject1).matches();
      if (bool) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid topic name: " + paramString2;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    paramBundle.putString("gcm.topic", paramString2);
    this.zzaLF.getToken(paramString1, paramString2, paramBundle);
  }
  
  public void unsubscribe(String paramString1, String paramString2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("gcm.topic", paramString2);
    this.zzaLF.zzb(paramString1, paramString2, localBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\GcmPubSub.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */