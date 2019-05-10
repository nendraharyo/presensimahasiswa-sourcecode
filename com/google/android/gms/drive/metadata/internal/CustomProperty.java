package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class CustomProperty
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final String mValue;
  final int mVersionCode;
  final CustomPropertyKey zzasN;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/metadata/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  CustomProperty(int paramInt, CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    this.mVersionCode = paramInt;
    zzx.zzb(paramCustomPropertyKey, "key");
    this.zzasN = paramCustomPropertyKey;
    this.mValue = paramString;
  }
  
  public CustomProperty(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    this(1, paramCustomPropertyKey, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        localObject1 = paramObject.getClass();
        localObject2 = getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (CustomProperty)paramObject;
      Object localObject1 = this.zzasN;
      Object localObject2 = ((CustomProperty)paramObject).zzasN;
      boolean bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = this.mValue;
        localObject2 = ((CustomProperty)paramObject).mValue;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzasN;
    arrayOfObject[0] = localObject;
    localObject = this.mValue;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public CustomPropertyKey zztB()
  {
    return this.zzasN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\CustomProperty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */