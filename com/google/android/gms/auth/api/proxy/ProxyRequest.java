package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ProxyRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int HTTP_METHOD_DELETE = 0;
  public static final int HTTP_METHOD_GET = 0;
  public static final int HTTP_METHOD_HEAD = 0;
  public static final int HTTP_METHOD_OPTIONS = 0;
  public static final int HTTP_METHOD_PATCH = 0;
  public static final int HTTP_METHOD_POST = 0;
  public static final int HTTP_METHOD_PUT = 0;
  public static final int HTTP_METHOD_TRACE = 0;
  public static final int LAST_CODE = 0;
  public static final int VERSION_CODE = 2;
  public final byte[] body;
  public final int httpMethod;
  public final long timeoutMillis;
  public final String url;
  final int versionCode;
  Bundle zzWB;
  
  static
  {
    int i = 7;
    zzb localzzb = new com/google/android/gms/auth/api/proxy/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
    HTTP_METHOD_GET = 0;
    HTTP_METHOD_POST = 1;
    HTTP_METHOD_PUT = 2;
    HTTP_METHOD_DELETE = 3;
    HTTP_METHOD_HEAD = 4;
    HTTP_METHOD_OPTIONS = 5;
    HTTP_METHOD_TRACE = 6;
    HTTP_METHOD_PATCH = i;
    LAST_CODE = i;
  }
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.versionCode = paramInt1;
    this.url = paramString;
    this.httpMethod = paramInt2;
    this.timeoutMillis = paramLong;
    this.body = paramArrayOfByte;
    this.zzWB = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Map getHeaderMap()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    int i = this.zzWB.size();
    localLinkedHashMap.<init>(i);
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
      localLinkedHashMap.put(localObject, str);
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ProxyRequest[ url: ");
    String str = this.url;
    localStringBuilder = localStringBuilder.append(str).append(", method: ");
    int i = this.httpMethod;
    return i + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\ProxyRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */