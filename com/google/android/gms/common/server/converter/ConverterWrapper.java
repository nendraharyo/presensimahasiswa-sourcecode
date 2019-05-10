package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.zza;

public class ConverterWrapper
  implements SafeParcelable
{
  public static final zza CREATOR;
  private final int mVersionCode;
  private final StringToIntConverter zzamF;
  
  static
  {
    zza localzza = new com/google/android/gms/common/server/converter/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ConverterWrapper(int paramInt, StringToIntConverter paramStringToIntConverter)
  {
    this.mVersionCode = paramInt;
    this.zzamF = paramStringToIntConverter;
  }
  
  private ConverterWrapper(StringToIntConverter paramStringToIntConverter)
  {
    this.mVersionCode = 1;
    this.zzamF = paramStringToIntConverter;
  }
  
  public static ConverterWrapper zza(FastJsonResponse.zza paramzza)
  {
    boolean bool = paramzza instanceof StringToIntConverter;
    if (bool)
    {
      localObject = new com/google/android/gms/common/server/converter/ConverterWrapper;
      paramzza = (StringToIntConverter)paramzza;
      ((ConverterWrapper)localObject).<init>(paramzza);
      return (ConverterWrapper)localObject;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Unsupported safe parcelable field converter class.");
    throw ((Throwable)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  StringToIntConverter zzrg()
  {
    return this.zzamF;
  }
  
  public FastJsonResponse.zza zzrh()
  {
    Object localObject = this.zzamF;
    if (localObject != null) {
      return this.zzamF;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("There was no converter wrapped in this ConverterWrapper.");
    throw ((Throwable)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\converter\ConverterWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */