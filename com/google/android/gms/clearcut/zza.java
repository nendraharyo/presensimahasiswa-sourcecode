package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.SharedPreferences;

public class zza
{
  private static int zzaeO = -1;
  public static final zza zzaeP;
  
  static
  {
    zza localzza = new com/google/android/gms/clearcut/zza;
    localzza.<init>();
    zzaeP = localzza;
  }
  
  public int zzah(Context paramContext)
  {
    int i = zzaeO;
    if (i < 0)
    {
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("bootCount", 0);
      String str = "bootCount";
      int j = 1;
      i = localSharedPreferences.getInt(str, j);
      zzaeO = i;
    }
    return zzaeO;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\clearcut\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */