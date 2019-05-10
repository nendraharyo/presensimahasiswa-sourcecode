package com.google.android.gms.nearby.messages.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

public class zzj
{
  public static Parcelable zzc(Intent paramIntent, String paramString)
  {
    Object localObject = paramIntent.getBundleExtra(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((Bundle)localObject).getParcelable(paramString)) {
      return (Parcelable)localObject;
    }
  }
  
  public static List zzd(Intent paramIntent, String paramString)
  {
    Object localObject = paramIntent.getBundleExtra(paramString);
    if (localObject == null) {}
    for (localObject = Collections.emptyList();; localObject = ((Bundle)localObject).getParcelableArrayList(paramString)) {
      return (List)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */