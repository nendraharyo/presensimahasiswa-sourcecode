package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

class zzdg$zzd
{
  private final String zzxY;
  private final String zzzp;
  private final int zzzw;
  private final List zzzx;
  
  public zzdg$zzd(String paramString1, int paramInt, List paramList, String paramString2)
  {
    this.zzzp = paramString1;
    this.zzzw = paramInt;
    ArrayList localArrayList;
    if (paramList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
    }
    for (this.zzzx = localArrayList;; this.zzzx = paramList)
    {
      this.zzxY = paramString2;
      return;
    }
  }
  
  public String getBody()
  {
    return this.zzxY;
  }
  
  public int getResponseCode()
  {
    return this.zzzw;
  }
  
  public String zzdU()
  {
    return this.zzzp;
  }
  
  public Iterable zzdZ()
  {
    return this.zzzx;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdg$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */