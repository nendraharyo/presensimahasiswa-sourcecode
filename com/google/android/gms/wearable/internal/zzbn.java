package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;

public final class zzbn
{
  public static IntentFilter zza(String paramString, Uri paramUri, int paramInt)
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>(paramString);
    String str1 = paramUri.getScheme();
    if (str1 != null)
    {
      str1 = paramUri.getScheme();
      localIntentFilter.addDataScheme(str1);
    }
    str1 = paramUri.getAuthority();
    if (str1 != null)
    {
      str1 = paramUri.getAuthority();
      int i = paramUri.getPort();
      String str2 = Integer.toString(i);
      localIntentFilter.addDataAuthority(str1, str2);
    }
    str1 = paramUri.getPath();
    if (str1 != null)
    {
      str1 = paramUri.getPath();
      localIntentFilter.addDataPath(str1, paramInt);
    }
    return localIntentFilter;
  }
  
  public static IntentFilter zzgM(String paramString)
  {
    IntentFilter localIntentFilter = new android/content/IntentFilter;
    localIntentFilter.<init>(paramString);
    localIntentFilter.addDataScheme("wear");
    localIntentFilter.addDataAuthority("*", null);
    return localIntentFilter;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */