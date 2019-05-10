package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;

class zzi
{
  final String mName;
  final String zzaUa;
  final long zzaVP;
  final long zzaVQ;
  final long zzaVR;
  
  zzi(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    boolean bool2 = paramLong1 < l;
    if (!bool2)
    {
      bool2 = bool1;
      zzx.zzac(bool2);
      bool2 = paramLong2 < l;
      if (bool2) {
        break label91;
      }
    }
    for (;;)
    {
      zzx.zzac(bool1);
      this.zzaUa = paramString1;
      this.mName = paramString2;
      this.zzaVP = paramLong1;
      this.zzaVQ = paramLong2;
      this.zzaVR = paramLong3;
      return;
      bool2 = false;
      break;
      label91:
      bool1 = false;
    }
  }
  
  zzi zzCB()
  {
    long l1 = 1L;
    zzi localzzi = new com/google/android/gms/measurement/internal/zzi;
    String str1 = this.zzaUa;
    String str2 = this.mName;
    long l2 = this.zzaVP + l1;
    long l3 = this.zzaVQ + l1;
    l1 = this.zzaVR;
    localzzi.<init>(str1, str2, l2, l3, l1);
    return localzzi;
  }
  
  zzi zzab(long paramLong)
  {
    zzi localzzi = new com/google/android/gms/measurement/internal/zzi;
    String str1 = this.zzaUa;
    String str2 = this.mName;
    long l1 = this.zzaVP;
    long l2 = this.zzaVQ;
    localzzi.<init>(str1, str2, l1, l2, paramLong);
    return localzzi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */