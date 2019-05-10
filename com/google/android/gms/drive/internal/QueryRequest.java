package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final Query zzasB;
  
  static
  {
    zzbo localzzbo = new com/google/android/gms/drive/internal/zzbo;
    localzzbo.<init>();
    CREATOR = localzzbo;
  }
  
  QueryRequest(int paramInt, Query paramQuery)
  {
    this.mVersionCode = paramInt;
    this.zzasB = paramQuery;
  }
  
  public QueryRequest(Query paramQuery)
  {
    this(1, paramQuery);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\QueryRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */