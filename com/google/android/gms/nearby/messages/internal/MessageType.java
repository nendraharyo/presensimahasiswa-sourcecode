package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class MessageType
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String type;
  public final String zzamD;
  
  static
  {
    zzk localzzk = new com/google/android/gms/nearby/messages/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  MessageType(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzamD = paramString1;
    this.type = paramString2;
  }
  
  public MessageType(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
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
      boolean bool2 = paramObject instanceof MessageType;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (MessageType)paramObject;
        String str1 = this.zzamD;
        String str2 = ((MessageType)paramObject).zzamD;
        bool2 = zzw.equal(str1, str2);
        if (bool2)
        {
          str1 = this.type;
          str2 = ((MessageType)paramObject).type;
          bool2 = zzw.equal(str1, str2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.zzamD;
    arrayOfObject[0] = str;
    str = this.type;
    arrayOfObject[1] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("namespace=");
    String str = this.zzamD;
    localStringBuilder = localStringBuilder.append(str).append(", type=");
    str = this.type;
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\MessageType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */