package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableCollaborator
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzLq;
  final String zzWQ;
  final boolean zzaeW;
  final boolean zzauI;
  final String zzauJ;
  final String zzauK;
  final String zzrG;
  
  static
  {
    zzq localzzq = new com/google/android/gms/drive/realtime/internal/zzq;
    localzzq.<init>();
    CREATOR = localzzq;
  }
  
  ParcelableCollaborator(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.mVersionCode = paramInt;
    this.zzauI = paramBoolean1;
    this.zzaeW = paramBoolean2;
    this.zzLq = paramString1;
    this.zzrG = paramString2;
    this.zzWQ = paramString3;
    this.zzauJ = paramString4;
    this.zzauK = paramString5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof ParcelableCollaborator;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        paramObject = (ParcelableCollaborator)paramObject;
        str1 = this.zzLq;
        String str2 = ((ParcelableCollaborator)paramObject).zzLq;
        bool = str1.equals(str2);
      }
    }
  }
  
  public int hashCode()
  {
    return this.zzLq.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Collaborator [isMe=");
    boolean bool = this.zzauI;
    localStringBuilder = localStringBuilder.append(bool).append(", isAnonymous=");
    bool = this.zzaeW;
    localStringBuilder = localStringBuilder.append(bool).append(", sessionId=");
    String str = this.zzLq;
    localStringBuilder = localStringBuilder.append(str).append(", userId=");
    str = this.zzrG;
    localStringBuilder = localStringBuilder.append(str).append(", displayName=");
    str = this.zzWQ;
    localStringBuilder = localStringBuilder.append(str).append(", color=");
    str = this.zzauJ;
    localStringBuilder = localStringBuilder.append(str).append(", photoUrl=");
    str = this.zzauK;
    return str + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\ParcelableCollaborator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */