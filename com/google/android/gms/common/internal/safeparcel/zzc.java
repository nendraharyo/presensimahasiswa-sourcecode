package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzx;

public final class zzc
{
  public static SafeParcelable zza(Intent paramIntent, String paramString, Parcelable.Creator paramCreator)
  {
    Object localObject = paramIntent.getByteArrayExtra(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = zza((byte[])localObject, paramCreator)) {
      return (SafeParcelable)localObject;
    }
  }
  
  public static SafeParcelable zza(byte[] paramArrayOfByte, Parcelable.Creator paramCreator)
  {
    zzx.zzz(paramCreator);
    Parcel localParcel = Parcel.obtain();
    int i = paramArrayOfByte.length;
    localParcel.unmarshall(paramArrayOfByte, 0, i);
    localParcel.setDataPosition(0);
    SafeParcelable localSafeParcelable = (SafeParcelable)paramCreator.createFromParcel(localParcel);
    localParcel.recycle();
    return localSafeParcelable;
  }
  
  public static void zza(SafeParcelable paramSafeParcelable, Intent paramIntent, String paramString)
  {
    byte[] arrayOfByte = zza(paramSafeParcelable);
    paramIntent.putExtra(paramString, arrayOfByte);
  }
  
  public static byte[] zza(SafeParcelable paramSafeParcelable)
  {
    Parcel localParcel = Parcel.obtain();
    paramSafeParcelable.writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\safeparcel\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */