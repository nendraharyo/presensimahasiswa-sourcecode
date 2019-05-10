package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzas;
import com.google.android.gms.internal.zzsu;

public class ChangeSequenceNumber
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final long zzaot;
  final long zzaou;
  final long zzaov;
  private volatile String zzaow = null;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ChangeSequenceNumber(int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool2 = paramLong1 < l;
    if (bool2)
    {
      bool2 = bool1;
      zzx.zzac(bool2);
      bool2 = paramLong2 < l;
      if (!bool2) {
        break label103;
      }
      bool2 = bool1;
      label52:
      zzx.zzac(bool2);
      bool2 = paramLong3 < l;
      if (!bool2) {
        break label109;
      }
    }
    for (;;)
    {
      zzx.zzac(bool1);
      this.mVersionCode = paramInt;
      this.zzaot = paramLong1;
      this.zzaou = paramLong2;
      this.zzaov = paramLong3;
      return;
      bool2 = false;
      break;
      label103:
      bool2 = false;
      break label52;
      label109:
      bool1 = false;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String encodeToString()
  {
    Object localObject = this.zzaow;
    if (localObject == null)
    {
      localObject = zzsu();
      int i = 10;
      localObject = Base64.encodeToString((byte[])localObject, i);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "ChangeSequenceNumber:";
      localStringBuilder = localStringBuilder.append(str);
      localObject = (String)localObject;
      this.zzaow = ((String)localObject);
    }
    return this.zzaow;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof ChangeSequenceNumber;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (ChangeSequenceNumber)paramObject;
      long l1 = ((ChangeSequenceNumber)paramObject).zzaou;
      long l2 = this.zzaou;
      bool2 = l1 < l2;
      if (!bool2)
      {
        l1 = ((ChangeSequenceNumber)paramObject).zzaov;
        l2 = this.zzaov;
        bool2 = l1 < l2;
        if (!bool2)
        {
          l1 = ((ChangeSequenceNumber)paramObject).zzaot;
          l2 = this.zzaot;
          bool2 = l1 < l2;
          if (!bool2) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = String.valueOf(this.zzaot);
    localStringBuilder = localStringBuilder.append(str);
    str = String.valueOf(this.zzaou);
    localStringBuilder = localStringBuilder.append(str);
    str = String.valueOf(this.zzaov);
    return str.hashCode();
  }
  
  public String toString()
  {
    return encodeToString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  final byte[] zzsu()
  {
    zzas localzzas = new com/google/android/gms/drive/internal/zzas;
    localzzas.<init>();
    int i = this.mVersionCode;
    localzzas.versionCode = i;
    long l = this.zzaot;
    localzzas.zzarV = l;
    l = this.zzaou;
    localzzas.zzarW = l;
    l = this.zzaov;
    localzzas.zzarX = l;
    return zzsu.toByteArray(localzzas);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\ChangeSequenceNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */