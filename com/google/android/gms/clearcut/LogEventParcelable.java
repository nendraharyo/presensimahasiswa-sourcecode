package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzsz.zzd;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable
  implements SafeParcelable
{
  public static final zzd CREATOR;
  public final int versionCode;
  public PlayLoggerContext zzafh;
  public byte[] zzafi;
  public int[] zzafj;
  public final zzsz.zzd zzafk;
  public final zzb.zzb zzafl;
  public final zzb.zzb zzafm;
  
  static
  {
    zzd localzzd = new com/google/android/gms/clearcut/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    this.versionCode = paramInt;
    this.zzafh = paramPlayLoggerContext;
    this.zzafi = paramArrayOfByte;
    this.zzafj = paramArrayOfInt;
    this.zzafk = null;
    this.zzafl = null;
    this.zzafm = null;
  }
  
  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, zzsz.zzd paramzzd, zzb.zzb paramzzb1, zzb.zzb paramzzb2, int[] paramArrayOfInt)
  {
    this.versionCode = 1;
    this.zzafh = paramPlayLoggerContext;
    this.zzafk = paramzzd;
    this.zzafl = paramzzb1;
    this.zzafm = paramzzb2;
    this.zzafj = paramArrayOfInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof LogEventParcelable;
      if (bool2)
      {
        paramObject = (LogEventParcelable)paramObject;
        int i = this.versionCode;
        int j = ((LogEventParcelable)paramObject).versionCode;
        if (i == j)
        {
          Object localObject1 = this.zzafh;
          Object localObject2 = ((LogEventParcelable)paramObject).zzafh;
          boolean bool3 = zzw.equal(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.zzafi;
            localObject2 = ((LogEventParcelable)paramObject).zzafi;
            bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            if (bool3)
            {
              localObject1 = this.zzafj;
              localObject2 = ((LogEventParcelable)paramObject).zzafj;
              bool3 = Arrays.equals((int[])localObject1, (int[])localObject2);
              if (bool3)
              {
                localObject1 = this.zzafk;
                localObject2 = ((LogEventParcelable)paramObject).zzafk;
                bool3 = zzw.equal(localObject1, localObject2);
                if (bool3)
                {
                  localObject1 = this.zzafl;
                  localObject2 = ((LogEventParcelable)paramObject).zzafl;
                  bool3 = zzw.equal(localObject1, localObject2);
                  if (bool3)
                  {
                    localObject1 = this.zzafm;
                    localObject2 = ((LogEventParcelable)paramObject).zzafm;
                    bool3 = zzw.equal(localObject1, localObject2);
                    if (bool3) {
                      continue;
                    }
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
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = Integer.valueOf(this.versionCode);
    arrayOfObject[0] = localObject;
    localObject = this.zzafh;
    arrayOfObject[1] = localObject;
    localObject = this.zzafi;
    arrayOfObject[2] = localObject;
    localObject = this.zzafj;
    arrayOfObject[3] = localObject;
    localObject = this.zzafk;
    arrayOfObject[4] = localObject;
    localObject = this.zzafl;
    arrayOfObject[5] = localObject;
    localObject = this.zzafm;
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object localObject1 = null;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("LogEventParcelable[");
    int i = this.versionCode;
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    Object localObject2 = this.zzafh;
    localStringBuilder.append(localObject2);
    localStringBuilder.append(", ");
    localObject2 = this.zzafi;
    if (localObject2 == null)
    {
      i = 0;
      localObject2 = null;
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(", ");
      localObject2 = this.zzafj;
      if (localObject2 != null) {
        break label189;
      }
    }
    for (localObject1 = (String)null;; localObject1 = ((zzv)localObject1).zza((Iterable)localObject2))
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(", ");
      localObject1 = this.zzafk;
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", ");
      localObject1 = this.zzafl;
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", ");
      localObject1 = this.zzafm;
      localStringBuilder.append(localObject1);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localObject2 = new java/lang/String;
      byte[] arrayOfByte = this.zzafi;
      ((String)localObject2).<init>(arrayOfByte);
      break;
      label189:
      localObject1 = zzv.zzcL(", ");
      i = 1;
      localObject2 = new int[i][];
      arrayOfByte = null;
      int[] arrayOfInt = this.zzafj;
      localObject2[0] = arrayOfInt;
      localObject2 = Arrays.asList((Object[])localObject2);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\clearcut\LogEventParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */