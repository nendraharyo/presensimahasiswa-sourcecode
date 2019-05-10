package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$UrlBookmark
  implements SafeParcelable
{
  public static final zzl CREATOR;
  public String title;
  public String url;
  final int versionCode;
  
  static
  {
    zzl localzzl = new com/google/android/gms/vision/barcode/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  public Barcode$UrlBookmark()
  {
    this.versionCode = 1;
  }
  
  public Barcode$UrlBookmark(int paramInt, String paramString1, String paramString2)
  {
    this.versionCode = paramInt;
    this.title = paramString1;
    this.url = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\Barcode$UrlBookmark.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */