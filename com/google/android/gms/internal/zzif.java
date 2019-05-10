package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class zzif
{
  public final int errorCode;
  public final int orientation;
  public final List zzBQ;
  public final List zzBR;
  public final long zzBU;
  public final zzen zzCp;
  public final zzey zzCq;
  public final String zzCr;
  public final zzeq zzCs;
  public final zzjp zzED;
  public final long zzHS;
  public final boolean zzHT;
  public final long zzHU;
  public final List zzHV;
  public final String zzHY;
  public final AdRequestParcel zzHt;
  public final String zzHw;
  public final RewardItemParcel zzIj;
  public final List zzIl;
  public final boolean zzIm;
  public final JSONObject zzKT;
  public boolean zzKU;
  public final zzeo zzKV;
  public final AdSizeParcel zzKW;
  public final List zzKX;
  public final long zzKY;
  public final long zzKZ;
  public final zzh.zza zzLa;
  public boolean zzLb = false;
  public boolean zzLc = false;
  
  public zzif(AdRequestParcel paramAdRequestParcel, zzjp paramzzjp, List paramList1, int paramInt1, List paramList2, List paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, zzen paramzzen, zzey paramzzey, String paramString2, zzeo paramzzeo, zzeq paramzzeq, long paramLong2, AdSizeParcel paramAdSizeParcel, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, zzh.zza paramzza, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean2)
  {
    this.zzHt = paramAdRequestParcel;
    this.zzED = paramzzjp;
    List localList = zzj(paramList1);
    this.zzBQ = localList;
    this.errorCode = paramInt1;
    localList = zzj(paramList2);
    this.zzBR = localList;
    localList = zzj(paramList3);
    this.zzHV = localList;
    this.orientation = paramInt2;
    this.zzBU = paramLong1;
    this.zzHw = paramString1;
    this.zzHT = paramBoolean1;
    this.zzCp = paramzzen;
    this.zzCq = paramzzey;
    this.zzCr = paramString2;
    this.zzKV = paramzzeo;
    this.zzCs = paramzzeq;
    this.zzHU = paramLong2;
    this.zzKW = paramAdSizeParcel;
    this.zzHS = paramLong3;
    this.zzKY = paramLong4;
    this.zzKZ = paramLong5;
    this.zzHY = paramString3;
    this.zzKT = paramJSONObject;
    this.zzLa = paramzza;
    this.zzIj = paramRewardItemParcel;
    localList = zzj(paramList4);
    this.zzKX = localList;
    localList = zzj(paramList5);
    this.zzIl = localList;
    this.zzIm = paramBoolean2;
  }
  
  public zzif(zzif.zza paramzza, zzjp paramzzjp, zzen paramzzen, zzey paramzzey, String paramString, zzeq paramzzeq, zzh.zza paramzza1)
  {
    this(localAdRequestParcel, paramzzjp, localList1, i, localList2, localList3, j, l1, str1, bool1, paramzzen, paramzzey, paramString, localzzeo, paramzzeq, l2, localAdSizeParcel, l3, l4, l5, str2, localJSONObject, paramzza1, localRewardItemParcel, localList4, localList5, bool2);
  }
  
  private static List zzj(List paramList)
  {
    if (paramList == null) {}
    for (List localList = null;; localList = Collections.unmodifiableList(paramList)) {
      return localList;
    }
  }
  
  public boolean zzcv()
  {
    Object localObject = this.zzED;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.zzED.zzhU();
      if (localObject != null) {}
    }
    else
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = this.zzED.zzhU();
      bool = ((zzjq)localObject).zzcv();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzif.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */