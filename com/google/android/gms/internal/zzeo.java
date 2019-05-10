package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzeo
{
  public final List zzBO;
  public final long zzBP;
  public final List zzBQ;
  public final List zzBR;
  public final List zzBS;
  public final String zzBT;
  public final long zzBU;
  public final String zzBV;
  public final int zzBW;
  public final int zzBX;
  public final long zzBY;
  public int zzBZ;
  public int zzCa;
  
  public zzeo(String paramString)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>(paramString);
    boolean bool1 = zzin.zzQ(i);
    Object localObject2;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Mediation Response JSON: ");
      localObject2 = localJSONObject1.toString(i);
      localObject1 = (String)localObject2;
      zzin.v((String)localObject1);
    }
    JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
    ArrayList localArrayList = new java/util/ArrayList;
    int k = localJSONArray.length();
    localArrayList.<init>(k);
    k = 0;
    Object localObject1 = null;
    int m = j;
    for (;;)
    {
      int n = localJSONArray.length();
      if (k >= n) {
        break;
      }
      zzen localzzen = new com/google/android/gms/internal/zzen;
      JSONObject localJSONObject2 = localJSONArray.getJSONObject(k);
      localzzen.<init>(localJSONObject2);
      localArrayList.add(localzzen);
      if (m < 0)
      {
        boolean bool2 = zza(localzzen);
        if (bool2) {
          m = k;
        }
      }
      k += 1;
    }
    this.zzBZ = m;
    k = localJSONArray.length();
    this.zzCa = k;
    localObject1 = Collections.unmodifiableList(localArrayList);
    this.zzBO = ((List)localObject1);
    localObject1 = localJSONObject1.getString("qdata");
    this.zzBT = ((String)localObject1);
    k = localJSONObject1.optInt("fs_model_type", j);
    this.zzBX = k;
    long l2 = localJSONObject1.optLong("timeout_ms", l1);
    this.zzBY = l2;
    localObject1 = localJSONObject1.optJSONObject("settings");
    if (localObject1 != null)
    {
      l2 = ((JSONObject)localObject1).optLong("ad_network_timeout_millis", l1);
      this.zzBP = l2;
      localObject2 = zzr.zzbP().zza((JSONObject)localObject1, "click_urls");
      this.zzBQ = ((List)localObject2);
      localObject2 = zzr.zzbP().zza((JSONObject)localObject1, "imp_urls");
      this.zzBR = ((List)localObject2);
      localObject2 = zzr.zzbP();
      String str2 = "nofill_urls";
      localObject2 = ((zzet)localObject2).zza((JSONObject)localObject1, str2);
      this.zzBS = ((List)localObject2);
      localObject2 = "refresh";
      l2 = ((JSONObject)localObject1).optLong((String)localObject2, l1);
      long l3 = 0L;
      boolean bool3 = l2 < l3;
      if (bool3)
      {
        l1 = 1000L;
        l2 *= l1;
        this.zzBU = l2;
        localObject2 = "rewards";
        localObject1 = RewardItemParcel.zza(((JSONObject)localObject1).optJSONArray((String)localObject2));
        if (localObject1 != null) {
          break label454;
        }
        this.zzBV = null;
        this.zzBW = 0;
      }
    }
    for (;;)
    {
      return;
      l2 = l1;
      break;
      label454:
      str1 = ((RewardItemParcel)localObject1).type;
      this.zzBV = str1;
      k = ((RewardItemParcel)localObject1).zzKS;
      this.zzBW = k;
      continue;
      this.zzBP = l1;
      this.zzBQ = null;
      this.zzBR = null;
      this.zzBS = null;
      this.zzBU = l1;
      this.zzBV = null;
      this.zzBW = 0;
    }
  }
  
  public zzeo(List paramList1, long paramLong1, List paramList2, List paramList3, List paramList4, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3)
  {
    this.zzBO = paramList1;
    this.zzBP = paramLong1;
    this.zzBQ = paramList2;
    this.zzBR = paramList3;
    this.zzBS = paramList4;
    this.zzBT = paramString1;
    this.zzBU = paramLong2;
    this.zzBZ = paramInt1;
    this.zzCa = paramInt2;
    this.zzBV = paramString2;
    this.zzBW = paramInt3;
    this.zzBX = paramInt4;
    this.zzBY = paramLong3;
  }
  
  private boolean zza(zzen paramzzen)
  {
    Object localObject = paramzzen.zzBB;
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = "com.google.ads.mediation.admob.AdMobAdapter";
      bool = ((String)localObject).equals(str);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */