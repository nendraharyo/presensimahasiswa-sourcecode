package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public class zzn
{
  private static final Uri zzamj = Uri.parse("http://plus.google.com/");
  private static final Uri zzamk = zzamj.buildUpon().appendPath("circles").appendPath("find").build();
  
  public static Intent zzcJ(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }
  
  public static Intent zzqU()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }
  
  private static Uri zzw(String paramString1, String paramString2)
  {
    Uri.Builder localBuilder = Uri.parse("market://details").buildUpon();
    String str = "id";
    localBuilder = localBuilder.appendQueryParameter(str, paramString1);
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      str = "pcampaignid";
      localBuilder.appendQueryParameter(str, paramString2);
    }
    return localBuilder.build();
  }
  
  public static Intent zzx(String paramString1, String paramString2)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.VIEW");
    Uri localUri = zzw(paramString1, paramString2);
    localIntent.setData(localUri);
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */