package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

public class zza
{
  public boolean zza(Context paramContext, Intent paramIntent, zzp paramzzp)
  {
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Launching an intent: ";
      localObject = ((StringBuilder)localObject).append(str);
      str = paramIntent.toURI();
      localObject = ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
      zzin.v((String)localObject);
      localObject = zzr.zzbC();
      ((zzir)localObject).zzb(paramContext, paramIntent);
      if (paramzzp != null) {
        paramzzp.zzaO();
      }
      bool = true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        zzin.zzaK(localActivityNotFoundException.getMessage());
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public boolean zza(Context paramContext, AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, zzp paramzzp)
  {
    int i = 2;
    boolean bool1 = false;
    Intent localIntent = null;
    Object localObject1;
    if (paramAdLauncherIntentInfoParcel == null)
    {
      localObject1 = "No intent data for launcher overlay.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return bool1;
      localObject1 = paramAdLauncherIntentInfoParcel.intent;
      Object localObject2;
      if (localObject1 != null)
      {
        localIntent = paramAdLauncherIntentInfoParcel.intent;
        bool1 = zza(paramContext, localIntent, paramzzp);
      }
      else
      {
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject2 = paramAdLauncherIntentInfoParcel.url;
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool3)
        {
          localObject1 = "Open GMSG did not contain a URL.";
          zzin.zzaK((String)localObject1);
        }
        else
        {
          localObject2 = paramAdLauncherIntentInfoParcel.mimeType;
          bool3 = TextUtils.isEmpty((CharSequence)localObject2);
          if (!bool3)
          {
            localObject2 = Uri.parse(paramAdLauncherIntentInfoParcel.url);
            str2 = paramAdLauncherIntentInfoParcel.mimeType;
            ((Intent)localObject1).setDataAndType((Uri)localObject2, str2);
          }
          for (;;)
          {
            ((Intent)localObject1).setAction("android.intent.action.VIEW");
            localObject2 = paramAdLauncherIntentInfoParcel.packageName;
            bool3 = TextUtils.isEmpty((CharSequence)localObject2);
            if (!bool3)
            {
              localObject2 = paramAdLauncherIntentInfoParcel.packageName;
              ((Intent)localObject1).setPackage((String)localObject2);
            }
            localObject2 = paramAdLauncherIntentInfoParcel.zzDK;
            bool3 = TextUtils.isEmpty((CharSequence)localObject2);
            if (bool3) {
              break label320;
            }
            localObject2 = paramAdLauncherIntentInfoParcel.zzDK;
            str2 = "/";
            localObject2 = ((String)localObject2).split(str2, i);
            int k = localObject2.length;
            if (k >= i) {
              break label294;
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append("Could not parse component name from open GMSG: ");
            localObject2 = paramAdLauncherIntentInfoParcel.zzDK;
            localObject1 = (String)localObject2;
            zzin.zzaK((String)localObject1);
            break;
            localObject2 = Uri.parse(paramAdLauncherIntentInfoParcel.url);
            ((Intent)localObject1).setData((Uri)localObject2);
          }
          label294:
          String str2 = localObject2[0];
          i = 1;
          localObject2 = localObject2[i];
          ((Intent)localObject1).setClassName(str2, (String)localObject2);
          label320:
          localObject2 = paramAdLauncherIntentInfoParcel.zzDL;
          boolean bool4 = TextUtils.isEmpty((CharSequence)localObject2);
          if (bool4) {}
        }
      }
      try
      {
        j = Integer.parseInt((String)localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          int j;
          boolean bool2;
          String str1 = "Could not parse intent flags.";
          zzin.zzaK(str1);
        }
      }
      ((Intent)localObject1).addFlags(j);
      bool2 = zza(paramContext, (Intent)localObject1, paramzzp);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */