package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class FACLConfig
  implements SafeParcelable
{
  public static final zza CREATOR;
  final int version;
  boolean zzYm;
  String zzYn;
  boolean zzYo;
  boolean zzYp;
  boolean zzYq;
  boolean zzYr;
  
  static
  {
    zza localzza = new com/google/android/gms/auth/firstparty/shared/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  FACLConfig(int paramInt, boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    this.version = paramInt;
    this.zzYm = paramBoolean1;
    this.zzYn = paramString;
    this.zzYo = paramBoolean2;
    this.zzYp = paramBoolean3;
    this.zzYq = paramBoolean4;
    this.zzYr = paramBoolean5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof FACLConfig;
    if (bool2)
    {
      paramObject = (FACLConfig)paramObject;
      bool2 = this.zzYm;
      boolean bool3 = ((FACLConfig)paramObject).zzYm;
      if (bool2 == bool3)
      {
        String str1 = this.zzYn;
        String str2 = ((FACLConfig)paramObject).zzYn;
        bool2 = TextUtils.equals(str1, str2);
        if (bool2)
        {
          bool2 = this.zzYo;
          bool3 = ((FACLConfig)paramObject).zzYo;
          if (bool2 == bool3)
          {
            bool2 = this.zzYp;
            bool3 = ((FACLConfig)paramObject).zzYp;
            if (bool2 == bool3)
            {
              bool2 = this.zzYq;
              bool3 = ((FACLConfig)paramObject).zzYq;
              if (bool2 == bool3)
              {
                bool2 = this.zzYr;
                bool3 = ((FACLConfig)paramObject).zzYr;
                if (bool2 == bool3) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = Boolean.valueOf(this.zzYm);
    arrayOfObject[0] = localObject;
    localObject = this.zzYn;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzYo);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzYp);
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(this.zzYq);
    arrayOfObject[4] = localObject;
    localObject = Boolean.valueOf(this.zzYr);
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\firstparty\shared\FACLConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */