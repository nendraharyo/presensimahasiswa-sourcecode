package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Session;

public class SessionsApi$ViewIntentBuilder
{
  private final Context mContext;
  private String zzavW;
  private Session zzavX;
  private boolean zzavY = false;
  
  public SessionsApi$ViewIntentBuilder(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private Intent zzl(Intent paramIntent)
  {
    Object localObject1 = this.zzavW;
    if (localObject1 == null) {}
    for (;;)
    {
      return paramIntent;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>(paramIntent);
      Object localObject2 = this.zzavW;
      localObject1 = ((Intent)localObject1).setPackage((String)localObject2);
      localObject2 = this.mContext.getPackageManager();
      ComponentName localComponentName = null;
      localObject2 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, 0);
      if (localObject2 != null)
      {
        localObject2 = ((ResolveInfo)localObject2).activityInfo.name;
        localComponentName = new android/content/ComponentName;
        String str = this.zzavW;
        localComponentName.<init>(str, (String)localObject2);
        ((Intent)localObject1).setComponent(localComponentName);
        paramIntent = (Intent)localObject1;
      }
    }
  }
  
  public Intent build()
  {
    Object localObject1 = this.zzavX;
    boolean bool1;
    if (localObject1 != null) {
      bool1 = true;
    }
    for (;;)
    {
      zzx.zza(bool1, "Session must be set");
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>("vnd.google.fitness.VIEW");
      Object localObject2 = Session.getMimeType(this.zzavX.getActivity());
      ((Intent)localObject1).setType((String)localObject2);
      localObject2 = this.zzavX;
      String str = "vnd.google.fitness.session";
      zzc.zza((SafeParcelable)localObject2, (Intent)localObject1, str);
      boolean bool2 = this.zzavY;
      if (!bool2)
      {
        localObject2 = this.zzavX.getAppPackageName();
        this.zzavW = ((String)localObject2);
      }
      return zzl((Intent)localObject1);
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public ViewIntentBuilder setPreferredApplication(String paramString)
  {
    this.zzavW = paramString;
    this.zzavY = true;
    return this;
  }
  
  public ViewIntentBuilder setSession(Session paramSession)
  {
    this.zzavX = paramSession;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\SessionsApi$ViewIntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */