package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProxyResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int STATUS_CODE_NO_CONNECTION = 255;
  public final byte[] body;
  public final int googlePlayServicesStatusCode;
  public final PendingIntent recoveryAction;
  public final int statusCode;
  final int versionCode;
  final Bundle zzWB;
  
  static
  {
    zzc localzzc = new com/google/android/gms/auth/api/proxy/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.versionCode = paramInt1;
    this.googlePlayServicesStatusCode = paramInt2;
    this.statusCode = paramInt3;
    this.zzWB = paramBundle;
    this.body = paramArrayOfByte;
    this.recoveryAction = paramPendingIntent;
  }
  
  public ProxyResponse(int paramInt1, PendingIntent paramPendingIntent, int paramInt2, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this(1, paramInt1, paramPendingIntent, paramInt2, paramBundle, paramArrayOfByte);
  }
  
  private ProxyResponse(int paramInt, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this(1, 0, null, paramInt, paramBundle, paramArrayOfByte);
  }
  
  public ProxyResponse(int paramInt, Map paramMap, byte[] paramArrayOfByte)
  {
    this(paramInt, localBundle, paramArrayOfByte);
  }
  
  public static ProxyResponse createErrorProxyResponse(int paramInt1, PendingIntent paramPendingIntent, int paramInt2, Map paramMap, byte[] paramArrayOfByte)
  {
    ProxyResponse localProxyResponse = new com/google/android/gms/auth/api/proxy/ProxyResponse;
    Bundle localBundle = zzL(paramMap);
    localProxyResponse.<init>(1, paramInt1, paramPendingIntent, paramInt2, localBundle, paramArrayOfByte);
    return localProxyResponse;
  }
  
  private static Bundle zzL(Map paramMap)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    if (paramMap == null) {}
    for (Object localObject = localBundle;; localObject = localBundle)
    {
      return (Bundle)localObject;
      localObject = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        localBundle.putString(str, (String)localObject);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Map getHeaders()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzWB.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = this.zzWB.getString((String)localObject);
      localHashMap.put(localObject, str);
    }
    return localHashMap;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\ProxyResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */