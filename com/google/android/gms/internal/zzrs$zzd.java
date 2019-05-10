package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzrs$zzd
{
  private String zzadc;
  private final List zzbmj;
  private final Map zzbmk;
  private int zzbml;
  
  private zzrs$zzd()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzbmj = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbmk = ((Map)localObject);
    this.zzadc = "";
    this.zzbml = 0;
  }
  
  public zzrs.zzc zzHN()
  {
    zzrs.zzc localzzc = new com/google/android/gms/internal/zzrs$zzc;
    List localList = this.zzbmj;
    Map localMap = this.zzbmk;
    String str = this.zzadc;
    int i = this.zzbml;
    localzzc.<init>(localList, localMap, str, i, null);
    return localzzc;
  }
  
  public zzd zzb(zzrs.zze paramzze)
  {
    this.zzbmj.add(paramzze);
    return this;
  }
  
  public zzd zzc(zzrs.zza paramzza)
  {
    Object localObject = paramzza.zzHI();
    String str = zzae.zzfR.toString();
    str = zzdf.zzg((zzag.zza)((Map)localObject).get(str));
    localObject = (List)this.zzbmk.get(str);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.zzbmk;
      localMap.put(str, localObject);
    }
    ((List)localObject).add(paramzza);
    return this;
  }
  
  public zzd zzgD(String paramString)
  {
    this.zzadc = paramString;
    return this;
  }
  
  public zzd zzko(int paramInt)
  {
    this.zzbml = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrs$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */