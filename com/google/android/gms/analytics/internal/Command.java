package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private String mValue;
  private String zzRt;
  private String zzyv;
  
  static
  {
    Command.1 local1 = new com/google/android/gms/analytics/internal/Command$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Command() {}
  
  Command(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }
  
  private void readFromParcel(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.zzyv = str;
    str = paramParcel.readString();
    this.zzRt = str;
    str = paramParcel.readString();
    this.mValue = str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.zzyv;
    paramParcel.writeString(str);
    str = this.zzRt;
    paramParcel.writeString(str);
    str = this.mValue;
    paramParcel.writeString(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\Command.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */