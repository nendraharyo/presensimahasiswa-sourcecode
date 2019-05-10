package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

public class AmsEntityUpdateParcelable
  implements SafeParcelable, zzb
{
  public static final Parcelable.Creator CREATOR;
  private final String mValue;
  final int mVersionCode;
  private byte zzbrF;
  private final byte zzbrG;
  
  static
  {
    zzf localzzf = new com/google/android/gms/wearable/internal/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  AmsEntityUpdateParcelable(int paramInt, byte paramByte1, byte paramByte2, String paramString)
  {
    this.zzbrF = paramByte1;
    this.mVersionCode = paramInt;
    this.zzbrG = paramByte2;
    this.mValue = paramString;
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
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (AmsEntityUpdateParcelable)paramObject;
      int i = this.zzbrF;
      int j = ((AmsEntityUpdateParcelable)paramObject).zzbrF;
      if (i != j)
      {
        bool1 = false;
      }
      else
      {
        i = this.mVersionCode;
        j = ((AmsEntityUpdateParcelable)paramObject).mVersionCode;
        if (i != j)
        {
          bool1 = false;
        }
        else
        {
          i = this.zzbrG;
          j = ((AmsEntityUpdateParcelable)paramObject).zzbrG;
          if (i != j)
          {
            bool1 = false;
          }
          else
          {
            localObject1 = this.mValue;
            localObject2 = ((AmsEntityUpdateParcelable)paramObject).mValue;
            boolean bool2 = ((String)localObject1).equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public int hashCode()
  {
    int i = this.mVersionCode * 31;
    int j = this.zzbrF;
    i = (i + j) * 31;
    j = this.zzbrG;
    i = (i + j) * 31;
    j = this.mValue.hashCode();
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("AmsEntityUpdateParcelable{mVersionCode=");
    int i = this.mVersionCode;
    localStringBuilder = localStringBuilder.append(i).append(", mEntityId=");
    i = this.zzbrF;
    localStringBuilder = localStringBuilder.append(i).append(", mAttributeId=");
    i = this.zzbrG;
    localStringBuilder = localStringBuilder.append(i).append(", mValue='");
    String str = this.mValue;
    return str + '\'' + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public byte zzIA()
  {
    return this.zzbrG;
  }
  
  public byte zzIz()
  {
    return this.zzbrF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\AmsEntityUpdateParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */