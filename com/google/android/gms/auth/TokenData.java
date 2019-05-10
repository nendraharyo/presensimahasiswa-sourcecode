package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class TokenData
  implements SafeParcelable
{
  public static final zze CREATOR;
  final int mVersionCode;
  private final String zzVo;
  private final Long zzVp;
  private final boolean zzVq;
  private final boolean zzVr;
  private final List zzVs;
  
  static
  {
    zze localzze = new com/google/android/gms/auth/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  TokenData(int paramInt, String paramString, Long paramLong, boolean paramBoolean1, boolean paramBoolean2, List paramList)
  {
    this.mVersionCode = paramInt;
    String str = zzx.zzcM(paramString);
    this.zzVo = str;
    this.zzVp = paramLong;
    this.zzVq = paramBoolean1;
    this.zzVr = paramBoolean2;
    this.zzVs = paramList;
  }
  
  public static TokenData zzc(Bundle paramBundle, String paramString)
  {
    Object localObject1 = TokenData.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject1);
    localObject1 = paramBundle.getBundle(paramString);
    if (localObject1 == null) {}
    Object localObject2;
    for (localObject1 = null;; localObject1 = (TokenData)((Bundle)localObject1).getParcelable((String)localObject2))
    {
      return (TokenData)localObject1;
      localObject2 = TokenData.class.getClassLoader();
      ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
      localObject2 = "TokenData";
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof TokenData;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (TokenData)paramObject;
      Object localObject1 = this.zzVo;
      Object localObject2 = ((TokenData)paramObject).zzVo;
      bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
      if (bool2)
      {
        localObject1 = this.zzVp;
        localObject2 = ((TokenData)paramObject).zzVp;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          bool2 = this.zzVq;
          boolean bool3 = ((TokenData)paramObject).zzVq;
          if (bool2 == bool3)
          {
            bool2 = this.zzVr;
            bool3 = ((TokenData)paramObject).zzVr;
            if (bool2 == bool3)
            {
              localObject1 = this.zzVs;
              localObject2 = ((TokenData)paramObject).zzVs;
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
  
  public String getToken()
  {
    return this.zzVo;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.zzVo;
    arrayOfObject[0] = localObject;
    localObject = this.zzVp;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzVq);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzVr);
    arrayOfObject[3] = localObject;
    localObject = this.zzVs;
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public Long zzmn()
  {
    return this.zzVp;
  }
  
  public boolean zzmo()
  {
    return this.zzVq;
  }
  
  public boolean zzmp()
  {
    return this.zzVr;
  }
  
  public List zzmq()
  {
    return this.zzVs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\TokenData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */