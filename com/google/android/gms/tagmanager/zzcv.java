package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

class zzcv
{
  static void zza(SharedPreferences.Editor paramEditor)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 9;
    if (i >= j) {
      paramEditor.apply();
    }
    for (;;)
    {
      return;
      Thread localThread = new java/lang/Thread;
      zzcv.1 local1 = new com/google/android/gms/tagmanager/zzcv$1;
      local1.<init>(paramEditor);
      localThread.<init>(local1);
      localThread.start();
    }
  }
  
  static void zzb(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
    localEditor.putString(paramString2, paramString3);
    zza(localEditor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */