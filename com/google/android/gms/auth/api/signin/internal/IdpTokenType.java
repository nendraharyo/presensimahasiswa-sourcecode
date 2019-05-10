package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class IdpTokenType
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final IdpTokenType zzXA;
  public static final IdpTokenType zzXB;
  final int versionCode;
  private final String zzXC;
  
  static
  {
    Object localObject = new com/google/android/gms/auth/api/signin/internal/IdpTokenType;
    ((IdpTokenType)localObject).<init>("accessToken");
    zzXA = (IdpTokenType)localObject;
    localObject = new com/google/android/gms/auth/api/signin/internal/IdpTokenType;
    ((IdpTokenType)localObject).<init>("idToken");
    zzXB = (IdpTokenType)localObject;
    localObject = new com/google/android/gms/auth/api/signin/internal/zzj;
    ((zzj)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  IdpTokenType(int paramInt, String paramString)
  {
    this.versionCode = paramInt;
    String str = zzx.zzcM(paramString);
    this.zzXC = str;
  }
  
  private IdpTokenType(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null) {}
    try
    {
      String str1 = this.zzXC;
      paramObject = (IdpTokenType)paramObject;
      String str2 = ((IdpTokenType)paramObject).zzng();
      boolean bool2 = str1.equals(str2);
      if (bool2) {
        bool1 = true;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;) {}
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return this.zzXC.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public String zzng()
  {
    return this.zzXC;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\IdpTokenType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */