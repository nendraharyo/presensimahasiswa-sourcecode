package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class ClientIdentity
  implements SafeParcelable
{
  public static final zzc CREATOR;
  private final int mVersionCode;
  public final String packageName;
  public final int uid;
  
  static
  {
    zzc localzzc = new com/google/android/gms/location/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  ClientIdentity(int paramInt1, int paramInt2, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.uid = paramInt2;
    this.packageName = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        boolean bool2 = paramObject instanceof ClientIdentity;
        if (bool2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (ClientIdentity)paramObject;
      int i = ((ClientIdentity)paramObject).uid;
      int j = this.uid;
      if (i == j)
      {
        String str1 = ((ClientIdentity)paramObject).packageName;
        String str2 = this.packageName;
        boolean bool3 = zzw.equal(str1, str2);
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return this.uid;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.uid);
    arrayOfObject[0] = localObject;
    localObject = this.packageName;
    arrayOfObject[1] = localObject;
    return String.format("%d:%s", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\ClientIdentity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */