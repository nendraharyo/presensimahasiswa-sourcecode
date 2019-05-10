package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import org.json.JSONException;
import org.json.JSONObject;

public class zzi
{
  public void zza(Context paramContext, boolean paramBoolean, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", paramBoolean);
    GInAppPurchaseManagerInfoParcel.zza(localIntent, paramGInAppPurchaseManagerInfoParcel);
    zzr.zzbC().zzb(paramContext, localIntent);
  }
  
  public String zzaq(String paramString)
  {
    String str1 = null;
    if (paramString == null) {}
    for (;;)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str3 = "developerPayload";
        str1 = localJSONObject.getString(str3);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "Fail to parse purchase data";
        zzin.zzaK(str2);
      }
    }
  }
  
  public String zzar(String paramString)
  {
    String str1 = null;
    if (paramString == null) {}
    for (;;)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str3 = "purchaseToken";
        str1 = localJSONObject.getString(str3);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "Fail to parse purchase data";
        zzin.zzaK(str2);
      }
    }
  }
  
  public int zzd(Intent paramIntent)
  {
    int i = 5;
    int j;
    if (paramIntent == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      Object localObject1 = paramIntent.getExtras();
      Object localObject2 = "RESPONSE_CODE";
      localObject1 = ((Bundle)localObject1).get((String)localObject2);
      if (localObject1 == null)
      {
        zzin.zzaK("Intent with no response code, assuming OK (known issue)");
        j = 0;
        localObject1 = null;
      }
      else
      {
        boolean bool = localObject1 instanceof Integer;
        if (bool)
        {
          localObject1 = (Integer)localObject1;
          j = ((Integer)localObject1).intValue();
        }
        else
        {
          bool = localObject1 instanceof Long;
          if (bool)
          {
            localObject1 = (Long)localObject1;
            long l = ((Long)localObject1).longValue();
            j = (int)l;
          }
          else
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "Unexpected type for intent response code. ";
            localObject2 = ((StringBuilder)localObject2).append(str);
            localObject1 = localObject1.getClass().getName();
            localObject1 = (String)localObject1;
            zzin.zzaK((String)localObject1);
            j = i;
          }
        }
      }
    }
  }
  
  public int zzd(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    int i;
    if (localObject == null)
    {
      zzin.zzaK("Bundle with null response code, assuming OK (known issue)");
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      boolean bool = localObject instanceof Integer;
      if (bool)
      {
        localObject = (Integer)localObject;
        i = ((Integer)localObject).intValue();
      }
      else
      {
        bool = localObject instanceof Long;
        if (bool)
        {
          localObject = (Long)localObject;
          long l = ((Long)localObject).longValue();
          i = (int)l;
        }
        else
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "Unexpected type for intent response code. ";
          localStringBuilder = localStringBuilder.append(str);
          localObject = localObject.getClass().getName();
          localObject = (String)localObject;
          zzin.zzaK((String)localObject);
          i = 5;
        }
      }
    }
  }
  
  public String zze(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (String str = null;; str = paramIntent.getStringExtra("INAPP_PURCHASE_DATA")) {
      return str;
    }
  }
  
  public String zzf(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (String str = null;; str = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE")) {
      return str;
    }
  }
  
  public void zzz(Context paramContext)
  {
    zzi.1 local1 = new com/google/android/gms/ads/internal/purchase/zzi$1;
    local1.<init>(this, paramContext);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    paramContext.bindService(localIntent, local1, 1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */