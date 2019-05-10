package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersion;
  final long zzUZ;
  final String zzVa;
  final int zzVb;
  final int zzVc;
  final String zzVd;
  
  static
  {
    zza localzza = new com/google/android/gms/auth/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.mVersion = paramInt1;
    this.zzUZ = paramLong;
    String str = (String)zzx.zzz(paramString1);
    this.zzVa = str;
    this.zzVb = paramInt2;
    this.zzVc = paramInt3;
    this.zzVd = paramString2;
  }
  
  public AccountChangeEvent(long paramLong, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.mVersion = 1;
    this.zzUZ = paramLong;
    String str = (String)zzx.zzz(paramString1);
    this.zzVa = str;
    this.zzVb = paramInt1;
    this.zzVc = paramInt2;
    this.zzVd = paramString2;
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
      boolean bool2 = paramObject instanceof AccountChangeEvent;
      if (bool2)
      {
        paramObject = (AccountChangeEvent)paramObject;
        int i = this.mVersion;
        int k = ((AccountChangeEvent)paramObject).mVersion;
        if (i == k)
        {
          long l1 = this.zzUZ;
          long l2 = ((AccountChangeEvent)paramObject).zzUZ;
          boolean bool3 = l1 < l2;
          if (!bool3)
          {
            String str1 = this.zzVa;
            String str2 = ((AccountChangeEvent)paramObject).zzVa;
            bool3 = zzw.equal(str1, str2);
            if (bool3)
            {
              int j = this.zzVb;
              k = ((AccountChangeEvent)paramObject).zzVb;
              if (j == k)
              {
                j = this.zzVc;
                k = ((AccountChangeEvent)paramObject).zzVc;
                if (j == k)
                {
                  str1 = this.zzVd;
                  str2 = ((AccountChangeEvent)paramObject).zzVd;
                  boolean bool4 = zzw.equal(str1, str2);
                  if (bool4) {
                    continue;
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String getAccountName()
  {
    return this.zzVa;
  }
  
  public String getChangeData()
  {
    return this.zzVd;
  }
  
  public int getChangeType()
  {
    return this.zzVb;
  }
  
  public int getEventIndex()
  {
    return this.zzVc;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = Integer.valueOf(this.mVersion);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzUZ);
    arrayOfObject[1] = localObject;
    localObject = this.zzVa;
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzVb);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzVc);
    arrayOfObject[4] = localObject;
    localObject = this.zzVd;
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object localObject1 = "UNKNOWN";
    int i = this.zzVb;
    switch (i)
    {
    }
    for (;;)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("AccountChangeEvent {accountName = ");
      String str = this.zzVa;
      localObject1 = ((StringBuilder)localObject2).append(str).append(", changeType = ").append((String)localObject1).append(", changeData = ");
      localObject2 = this.zzVd;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", eventIndex = ");
      i = this.zzVc;
      return i + "}";
      localObject1 = "ADDED";
      continue;
      localObject1 = "REMOVED";
      continue;
      localObject1 = "RENAMED_TO";
      continue;
      localObject1 = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\AccountChangeEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */