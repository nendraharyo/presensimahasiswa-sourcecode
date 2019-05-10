package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{
  private final long zzSL;
  private final long zzbiX;
  private final long zzbiY;
  private String zzbiZ;
  
  zzaq(long paramLong1, long paramLong2, long paramLong3)
  {
    this.zzbiX = paramLong1;
    this.zzSL = paramLong2;
    this.zzbiY = paramLong3;
  }
  
  long zzGD()
  {
    return this.zzbiX;
  }
  
  long zzGE()
  {
    return this.zzbiY;
  }
  
  String zzGF()
  {
    return this.zzbiZ;
  }
  
  void zzgf(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.trim();
      boolean bool = TextUtils.isEmpty(str);
      if (!bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      this.zzbiZ = paramString;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzaq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */