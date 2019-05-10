package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DocumentId
  implements SafeParcelable
{
  public static final zzc CREATOR;
  final int mVersionCode;
  final String zzTJ;
  final String zzTK;
  final String zzTL;
  
  static
  {
    zzc localzzc = new com/google/android/gms/appdatasearch/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  DocumentId(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    this.zzTJ = paramString1;
    this.zzTK = paramString2;
    this.zzTL = paramString3;
  }
  
  public DocumentId(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, paramString2, paramString3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.zzTJ;
    arrayOfObject[0] = str;
    str = this.zzTK;
    arrayOfObject[1] = str;
    str = this.zzTL;
    arrayOfObject[2] = str;
    return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\DocumentId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */