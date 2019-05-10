package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldMappingDictionary$FieldMapPair
  implements SafeParcelable
{
  public static final zzb CREATOR;
  final String key;
  final int versionCode;
  final FastJsonResponse.Field zzamZ;
  
  static
  {
    zzb localzzb = new com/google/android/gms/common/server/response/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  FieldMappingDictionary$FieldMapPair(int paramInt, String paramString, FastJsonResponse.Field paramField)
  {
    this.versionCode = paramInt;
    this.key = paramString;
    this.zzamZ = paramField;
  }
  
  FieldMappingDictionary$FieldMapPair(String paramString, FastJsonResponse.Field paramField)
  {
    this.versionCode = 1;
    this.key = paramString;
    this.zzamZ = paramField;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\FieldMappingDictionary$FieldMapPair.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */