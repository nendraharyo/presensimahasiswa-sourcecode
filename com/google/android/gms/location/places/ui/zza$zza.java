package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.google.android.gms.common.GoogleApiAvailability;

public abstract class zza$zza
{
  protected final Intent mIntent;
  
  public zza$zza(String paramString)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>(paramString);
    this.mIntent = localIntent;
    this.mIntent.setPackage("com.google.android.gms");
  }
  
  protected Intent build(Activity paramActivity)
  {
    boolean bool1 = true;
    Object localObject1 = paramActivity.getTheme();
    Object localObject2 = new android/util/TypedValue;
    ((TypedValue)localObject2).<init>();
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    boolean bool2 = ((Resources.Theme)localObject1).resolveAttribute(16843827, (TypedValue)localObject2, bool1);
    if (bool2)
    {
      Intent localIntent = this.mIntent;
      String str = "primary_color";
      bool2 = localIntent.hasExtra(str);
      if (!bool2)
      {
        localIntent = this.mIntent;
        str = "primary_color";
        i = ((TypedValue)localObject2).data;
        localIntent.putExtra(str, i);
      }
    }
    int i = 16843828;
    boolean bool3 = ((Resources.Theme)localObject1).resolveAttribute(i, localTypedValue, bool1);
    if (bool3)
    {
      localObject1 = this.mIntent;
      localObject2 = "primary_color_dark";
      bool3 = ((Intent)localObject1).hasExtra((String)localObject2);
      if (!bool3)
      {
        localObject1 = this.mIntent;
        localObject2 = "primary_color_dark";
        int j = localTypedValue.data;
        ((Intent)localObject1).putExtra((String)localObject2, j);
      }
    }
    GoogleApiAvailability.getInstance().zzak(paramActivity);
    return this.mIntent;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */