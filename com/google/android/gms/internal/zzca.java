package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzca
{
  private final zzcb zzpe;
  private final Map zzxy;
  
  public zzca(zzcb paramzzcb)
  {
    this.zzpe = paramzzcb;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzxy = localHashMap;
  }
  
  public void zza(String paramString, zzbz paramzzbz)
  {
    this.zzxy.put(paramString, paramzzbz);
  }
  
  public void zza(String paramString1, String paramString2, long paramLong)
  {
    Object localObject1 = this.zzpe;
    Object localObject2 = (zzbz)this.zzxy.get(paramString2);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString1;
    zzbx.zza((zzcb)localObject1, (zzbz)localObject2, paramLong, arrayOfString);
    localObject2 = this.zzxy;
    localObject1 = zzbx.zza(this.zzpe, paramLong);
    ((Map)localObject2).put(paramString1, localObject1);
  }
  
  public zzcb zzdA()
  {
    return this.zzpe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzca.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */