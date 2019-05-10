package com.google.android.gms.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;

public final class zza
{
  private static volatile zza zzaUe;
  private final String zzaUa;
  private final Status zzaUb;
  private final boolean zzaUc;
  private final boolean zzaUd;
  
  zza(Context paramContext)
  {
    Object localObject2 = paramContext.getResources();
    int m = R.string.common_google_play_services_unknown_issue;
    String str1 = ((Resources)localObject2).getResourcePackageName(m);
    Object localObject3 = "google_app_measurement_enable";
    String str2 = "integer";
    m = ((Resources)localObject2).getIdentifier((String)localObject3, str2, str1);
    float f2;
    label91:
    label103:
    Object localObject4;
    int k;
    if (m != 0)
    {
      m = ((Resources)localObject2).getInteger(m);
      if (m != 0)
      {
        m = j;
        f2 = f1;
        if (m != 0) {
          break label182;
        }
        this.zzaUd = j;
        j = m;
        f1 = f2;
        this.zzaUc = j;
        localObject4 = "google_app_id";
        localObject1 = "string";
        j = ((Resources)localObject2).getIdentifier((String)localObject4, (String)localObject1, str1);
        if (j != 0) {
          break label215;
        }
        k = this.zzaUc;
        if (k == 0) {
          break label201;
        }
        localObject4 = new com/google/android/gms/common/api/Status;
        localObject1 = "Missing an expected resource: 'R.string.google_app_id' for initializing Google services.  Possible causes are missing google-services.json or com.google.gms.google-services gradle plugin.";
        ((Status)localObject4).<init>(i, (String)localObject1);
        this.zzaUb = ((Status)localObject4);
        label164:
        this.zzaUa = null;
      }
    }
    for (;;)
    {
      return;
      m = 0;
      localObject3 = null;
      f2 = 0.0F;
      break;
      label182:
      k = 0;
      localObject4 = null;
      f1 = 0.0F;
      break label91;
      this.zzaUd = false;
      break label103;
      label201:
      localObject4 = Status.zzagC;
      this.zzaUb = ((Status)localObject4);
      break label164;
      label215:
      localObject4 = ((Resources)localObject2).getString(k);
      bool = TextUtils.isEmpty((CharSequence)localObject4);
      if (bool)
      {
        bool = this.zzaUc;
        if (bool)
        {
          localObject1 = new com/google/android/gms/common/api/Status;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject2 = "The resource 'R.string.google_app_id' is invalid, expected an app  identifier and found: '";
          localObject4 = ((StringBuilder)localObject3).append((String)localObject2).append((String)localObject4);
          localObject3 = "'.";
          localObject4 = (String)localObject3;
          ((Status)localObject1).<init>(i, (String)localObject4);
        }
        for (this.zzaUb = ((Status)localObject1);; this.zzaUb = ((Status)localObject4))
        {
          this.zzaUa = null;
          break;
          localObject4 = Status.zzagC;
        }
      }
      this.zzaUa = ((String)localObject4);
      localObject4 = Status.zzagC;
      this.zzaUb = ((Status)localObject4);
    }
  }
  
  zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    this.zzaUa = paramString;
    Status localStatus = Status.zzagC;
    this.zzaUb = localStatus;
    this.zzaUc = paramBoolean;
    boolean bool;
    if (!paramBoolean) {
      bool = true;
    }
    for (;;)
    {
      this.zzaUd = bool;
      return;
      bool = false;
      localStatus = null;
    }
  }
  
  public static String zzAp()
  {
    Object localObject1 = zzaUe;
    if (localObject1 == null) {
      synchronized (zza.class)
      {
        localObject1 = zzaUe;
        if (localObject1 == null)
        {
          localObject1 = new java/lang/IllegalStateException;
          String str = "Initialize must be called before getGoogleAppId.";
          ((IllegalStateException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
    return zzaUe.zzAq();
  }
  
  public static boolean zzAr()
  {
    Object localObject1 = zzaUe;
    if (localObject1 == null) {
      synchronized (zza.class)
      {
        localObject1 = zzaUe;
        if (localObject1 == null)
        {
          localObject1 = new java/lang/IllegalStateException;
          String str = "Initialize must be called before isMeasurementEnabled.";
          ((IllegalStateException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
    return zzaUe.zzAt();
  }
  
  public static boolean zzAs()
  {
    Object localObject1 = zzaUe;
    if (localObject1 == null) {
      synchronized (zza.class)
      {
        localObject1 = zzaUe;
        if (localObject1 == null)
        {
          localObject1 = new java/lang/IllegalStateException;
          String str = "Initialize must be called before isMeasurementExplicitlyDisabled.";
          ((IllegalStateException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
    }
    return zzaUe.zzaUd;
  }
  
  public static Status zzaR(Context paramContext)
  {
    zzx.zzb(paramContext, "Context must not be null.");
    zza localzza = zzaUe;
    if (localzza == null) {}
    synchronized (zza.class)
    {
      localzza = zzaUe;
      if (localzza == null)
      {
        localzza = new com/google/android/gms/measurement/zza;
        localzza.<init>(paramContext);
        zzaUe = localzza;
      }
      return zzaUe.zzaUb;
    }
  }
  
  public static Status zzb(Context paramContext, String paramString, boolean paramBoolean)
  {
    zzx.zzb(paramContext, "Context must not be null.");
    Object localObject1 = "App ID must be nonempty.";
    zzx.zzh(paramString, localObject1);
    synchronized (zza.class)
    {
      localObject1 = zzaUe;
      if (localObject1 != null)
      {
        localObject1 = zzaUe;
        localObject1 = ((zza)localObject1).zzeu(paramString);
        return (Status)localObject1;
      }
      localObject1 = new com/google/android/gms/measurement/zza;
      ((zza)localObject1).<init>(paramContext, paramString, paramBoolean);
      zzaUe = (zza)localObject1;
      localObject1 = zzaUe.zzaUb;
    }
  }
  
  String zzAq()
  {
    return this.zzaUa;
  }
  
  boolean zzAt()
  {
    Status localStatus = this.zzaUb;
    boolean bool = localStatus.isSuccess();
    if (bool)
    {
      bool = this.zzaUc;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStatus = null;
    }
  }
  
  Status zzeu(String paramString)
  {
    Object localObject1 = this.zzaUa;
    if (localObject1 != null)
    {
      localObject1 = this.zzaUa;
      boolean bool = ((String)localObject1).equals(paramString);
      if (!bool)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        int i = 10;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        String str = this.zzaUa;
        localObject2 = ((StringBuilder)localObject2).append(str);
        str = "'.";
        localObject2 = str;
        ((Status)localObject1).<init>(i, (String)localObject2);
      }
    }
    for (;;)
    {
      return (Status)localObject1;
      localObject1 = Status.zzagC;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */