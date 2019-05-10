package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class zzbl
{
  private final Context mContext;
  
  public zzbl(Context paramContext)
  {
    zzx.zzb(paramContext, "Context can not be null");
    this.mContext = paramContext;
  }
  
  public static boolean zzdn()
  {
    String str = Environment.getExternalStorageState();
    return "mounted".equals(str);
  }
  
  public boolean zza(Intent paramIntent)
  {
    boolean bool1 = false;
    zzx.zzb(paramIntent, "Intent can not be null");
    List localList = this.mContext.getPackageManager().queryIntentActivities(paramIntent, 0);
    boolean bool2 = localList.isEmpty();
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public boolean zzdj()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.DIAL");
    Uri localUri = Uri.parse("tel:");
    localIntent.setData(localUri);
    return zza(localIntent);
  }
  
  public boolean zzdk()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.VIEW");
    Uri localUri = Uri.parse("sms:");
    localIntent.setData(localUri);
    return zza(localIntent);
  }
  
  public boolean zzdl()
  {
    boolean bool = zzdn();
    Context localContext;
    int i;
    if (bool)
    {
      localContext = this.mContext;
      String str = "android.permission.WRITE_EXTERNAL_STORAGE";
      i = localContext.checkCallingOrSelfPermission(str);
      if (i == 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localContext = null;
    }
  }
  
  public boolean zzdm()
  {
    return true;
  }
  
  public boolean zzdo()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.INSERT");
    String str = "vnd.android.cursor.dir/event";
    localIntent = localIntent.setType(str);
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    boolean bool;
    if (i >= j)
    {
      bool = zza(localIntent);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIntent = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */