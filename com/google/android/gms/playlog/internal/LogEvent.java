package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

public class LogEvent
  implements SafeParcelable
{
  public static final zzc CREATOR;
  public final String tag;
  public final int versionCode;
  public final long zzbdA;
  public final long zzbdB;
  public final byte[] zzbdC;
  public final Bundle zzbdD;
  
  static
  {
    zzc localzzc = new com/google/android/gms/playlog/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  LogEvent(int paramInt, long paramLong1, long paramLong2, String paramString, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.versionCode = paramInt;
    this.zzbdA = paramLong1;
    this.zzbdB = paramLong2;
    this.tag = paramString;
    this.zzbdC = paramArrayOfByte;
    this.zzbdD = paramBundle;
  }
  
  public LogEvent(long paramLong1, long paramLong2, String paramString, byte[] paramArrayOfByte, String... paramVarArgs)
  {
    this.versionCode = 1;
    this.zzbdA = paramLong1;
    this.zzbdB = paramLong2;
    this.tag = paramString;
    this.zzbdC = paramArrayOfByte;
    Bundle localBundle = zzd(paramVarArgs);
    this.zzbdD = localBundle;
  }
  
  private static Bundle zzd(String... paramVarArgs)
  {
    Object localObject = null;
    if (paramVarArgs == null) {}
    for (;;)
    {
      return (Bundle)localObject;
      int i = paramVarArgs.length % 2;
      if (i != 0)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("extras must have an even number of elements");
        throw ((Throwable)localObject);
      }
      i = paramVarArgs.length;
      int j = i / 2;
      if (j != 0)
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>(j);
        i = 0;
        while (i < j)
        {
          int k = i * 2;
          String str1 = paramVarArgs[k];
          int m = i * 2 + 1;
          String str2 = paramVarArgs[m];
          ((Bundle)localObject).putString(str1, str2);
          i += 1;
        }
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = localStringBuilder.append("tag=");
    Object localObject2 = this.tag;
    ((StringBuilder)localObject1).append((String)localObject2).append(",");
    localObject1 = localStringBuilder.append("eventTime=");
    long l = this.zzbdA;
    ((StringBuilder)localObject1).append(l).append(",");
    localObject1 = localStringBuilder.append("eventUptime=");
    l = this.zzbdB;
    localObject1 = ((StringBuilder)localObject1).append(l);
    localObject2 = ",";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.zzbdD;
    if (localObject1 != null)
    {
      localObject1 = this.zzbdD;
      boolean bool = ((Bundle)localObject1).isEmpty();
      if (!bool)
      {
        localStringBuilder.append("keyValues=");
        localObject1 = this.zzbdD.keySet();
        localObject2 = ((Set)localObject1).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject2).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (String)((Iterator)localObject2).next();
          Object localObject3 = localStringBuilder.append("(").append((String)localObject1);
          String str = ",";
          ((StringBuilder)localObject3).append(str);
          localObject1 = this.zzbdD.getString((String)localObject1);
          localObject1 = localStringBuilder.append((String)localObject1);
          localObject3 = ")";
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = " ";
          localStringBuilder.append((String)localObject1);
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\LogEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */