package com.google.android.gms.common.stats;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;

public class zzg
{
  public static String zza(PowerManager.WakeLock paramWakeLock, String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    long l1 = Process.myPid() << 32;
    long l2 = System.identityHashCode(paramWakeLock);
    l1 |= l2;
    String str = String.valueOf(l1);
    localStringBuilder = localStringBuilder.append(str);
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      paramString = "";
    }
    return paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */