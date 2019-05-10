package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder
  implements SafeParcelable
{
  public static final zzc CREATOR;
  final int mVersionCode;
  final String zzasF;
  final boolean zzauj;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/query/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  FieldWithSortOrder(int paramInt, String paramString, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzasF = paramString;
    this.zzauj = paramBoolean;
  }
  
  public FieldWithSortOrder(String paramString, boolean paramBoolean)
  {
    this(1, paramString, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    String str1 = "FieldWithSortOrder[%s %s]";
    Object[] arrayOfObject = new Object[2];
    String str2 = null;
    String str3 = this.zzasF;
    arrayOfObject[0] = str3;
    int i = 1;
    boolean bool = this.zzauj;
    if (bool) {}
    for (str2 = "ASC";; str2 = "DESC")
    {
      arrayOfObject[i] = str2;
      return String.format(localLocale, str1, arrayOfObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\FieldWithSortOrder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */