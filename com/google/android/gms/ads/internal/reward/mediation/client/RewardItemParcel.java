package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class RewardItemParcel
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public final String type;
  public final int versionCode;
  public final int zzKS;
  
  static
  {
    zzc localzzc = new com/google/android/gms/ads/internal/reward/mediation/client/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public RewardItemParcel(int paramInt1, String paramString, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.type = paramString;
    this.zzKS = paramInt2;
  }
  
  public RewardItemParcel(RewardItem paramRewardItem)
  {
    this(1, str, i);
  }
  
  public RewardItemParcel(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  public static RewardItemParcel zza(JSONArray paramJSONArray)
  {
    String str1 = null;
    int i;
    RewardItemParcel localRewardItemParcel;
    if (paramJSONArray != null)
    {
      i = paramJSONArray.length();
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localRewardItemParcel = null;
    }
    for (;;)
    {
      return localRewardItemParcel;
      localRewardItemParcel = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
      String str2 = paramJSONArray.getJSONObject(0).optString("rb_type");
      JSONObject localJSONObject = paramJSONArray.getJSONObject(0);
      str1 = "rb_amount";
      int j = localJSONObject.optInt(str1);
      localRewardItemParcel.<init>(str2, j);
    }
  }
  
  public static RewardItemParcel zzay(String paramString)
  {
    RewardItemParcel localRewardItemParcel = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localRewardItemParcel;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        localRewardItemParcel = zza(localJSONArray);
      }
      catch (JSONException localJSONException) {}
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != null)
    {
      bool2 = paramObject instanceof RewardItemParcel;
      if (bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      paramObject = (RewardItemParcel)paramObject;
      Object localObject1 = this.type;
      Object localObject2 = ((RewardItemParcel)paramObject).type;
      bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = Integer.valueOf(this.zzKS);
        int i = ((RewardItemParcel)paramObject).zzKS;
        localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.type;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzKS);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public JSONArray zzgR()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = this.type;
    localJSONObject.put("rb_type", str);
    int i = this.zzKS;
    localJSONObject.put("rb_amount", i);
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    localJSONArray.put(localJSONObject);
    return localJSONArray;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\mediation\client\RewardItemParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */