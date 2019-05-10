package com.google.android.gms.internal;

class zzhd$2$1
  implements zzji.zzc
{
  zzhd$2$1(zzhd.2 param2, zzbz paramzzbz) {}
  
  public void zzd(zzeh paramzzeh)
  {
    Object localObject1 = this.zzJc.zzpt;
    Object localObject2 = this.zzJb;
    int i = 1;
    String[] arrayOfString = new String[i];
    String str = "jsf";
    arrayOfString[0] = str;
    ((zzcb)localObject1).zza((zzbz)localObject2, arrayOfString);
    this.zzJc.zzpt.zzdC();
    localObject2 = this.zzJc.zzIY.zzJk;
    paramzzeh.zza("/invalidRequest", (zzdf)localObject2);
    localObject2 = this.zzJc.zzIY.zzJl;
    paramzzeh.zza("/loadAdURL", (zzdf)localObject2);
    localObject1 = "AFMA_buildAdURL";
    try
    {
      localObject2 = this.zzJc;
      localObject2 = ((zzhd.2)localObject2).zzJa;
      paramzzeh.zze((String)localObject1, (String)localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject2 = "Error requesting an ad url";
        zzin.zzb((String)localObject2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhd$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */