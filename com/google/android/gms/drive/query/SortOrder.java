package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Locale;

public class SortOrder
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzaud;
  final boolean zzaue;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/query/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  SortOrder(int paramInt, List paramList, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzaud = paramList;
    this.zzaue = paramBoolean;
  }
  
  private SortOrder(List paramList, boolean paramBoolean)
  {
    this(1, paramList, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    List localList = this.zzaud;
    Object localObject = TextUtils.join(",", localList);
    arrayOfObject[0] = localObject;
    localObject = Boolean.valueOf(this.zzaue);
    arrayOfObject[1] = localObject;
    return String.format(localLocale, "SortOrder[%s, %s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\SortOrder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */