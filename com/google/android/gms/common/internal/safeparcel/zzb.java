package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class zzb
{
  private static int zzG(Parcel paramParcel, int paramInt)
  {
    int i = 0xFFFF0000 | paramInt;
    paramParcel.writeInt(i);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void zzH(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    int j = i - paramInt;
    int k = paramInt + -4;
    paramParcel.setDataPosition(k);
    paramParcel.writeInt(j);
    paramParcel.setDataPosition(i);
  }
  
  public static void zzI(Parcel paramParcel, int paramInt)
  {
    zzH(paramParcel, paramInt);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte paramByte)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramByte);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, double paramDouble)
  {
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, float paramFloat)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, long paramLong)
  {
    zzb(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    int i;
    if (paramBundle == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeBundle(paramBundle);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    int i;
    if (paramIBinder == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeStrongBinder(paramIBinder);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean)
  {
    if (paramParcel2 == null) {
      if (paramBoolean) {
        zzb(paramParcel1, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      int i = zzG(paramParcel1, paramInt);
      int j = paramParcel2.dataSize();
      paramParcel1.appendFrom(paramParcel2, 0, j);
      zzH(paramParcel1, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramParcelable == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt1, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt1);
      paramParcelable.writeToParcel(paramParcel, paramInt2);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    int i = 0;
    if (paramBoolean == null) {
      if (paramBoolean1) {
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      zzb(paramParcel, paramInt, 4);
      boolean bool = paramBoolean.booleanValue();
      if (bool) {
        i = 1;
      }
      paramParcel.writeInt(i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    int i;
    float f;
    if (paramFloat == null) {
      if (paramBoolean)
      {
        i = 0;
        f = 0.0F;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = 4;
      zzb(paramParcel, paramInt, i);
      f = paramFloat.floatValue();
      paramParcel.writeFloat(f);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    int i;
    if (paramInteger == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      zzb(paramParcel, paramInt, 4);
      i = paramInteger.intValue();
      paramParcel.writeInt(i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    int i;
    if (paramLong == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = 8;
      zzb(paramParcel, paramInt, i);
      long l = paramLong.longValue();
      paramParcel.writeLong(l);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    int i;
    if (paramString == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeString(paramString);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    Integer localInteger = null;
    if (paramList == null) {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      int j = zzG(paramParcel, paramInt);
      int k = paramList.size();
      paramParcel.writeInt(k);
      for (int m = 0; m < k; m = i)
      {
        localInteger = (Integer)paramList.get(m);
        i = localInteger.intValue();
        paramParcel.writeInt(i);
        i = m + 1;
      }
      zzH(paramParcel, j);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, short paramShort)
  {
    zzb(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramShort);
  }
  
  public static void zza(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    int i = 4;
    zzb(paramParcel, paramInt, i);
    if (paramBoolean) {}
    for (i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i;
    if (paramArrayOfByte == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeByteArray(paramArrayOfByte);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    int i;
    if (paramArrayOfFloat == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeFloatArray(paramArrayOfFloat);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i;
    if (paramArrayOfInt == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeIntArray(paramArrayOfInt);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfParcelable == null) {
      if (paramBoolean) {
        zzb(paramParcel, paramInt1, 0);
      }
    }
    for (;;)
    {
      return;
      int i = zzG(paramParcel, paramInt1);
      int j = paramArrayOfParcelable.length;
      paramParcel.writeInt(j);
      int k = 0;
      if (k < j)
      {
        Parcelable localParcelable = paramArrayOfParcelable[k];
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          k += 1;
          break;
          zza(paramParcel, localParcelable, paramInt2);
        }
      }
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    int i;
    if (paramArrayOfString == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeStringArray(paramArrayOfString);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    int i;
    if (paramArrayOfBoolean == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeBooleanArray(paramArrayOfBoolean);
      zzH(paramParcel, i);
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfByte == null) {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      int j = zzG(paramParcel, paramInt);
      int k = paramArrayOfByte.length;
      paramParcel.writeInt(k);
      while (i < k)
      {
        byte[] arrayOfByte = paramArrayOfByte[i];
        paramParcel.writeByteArray(arrayOfByte);
        i += 1;
      }
      zzH(paramParcel, j);
    }
  }
  
  private static void zza(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    i = k - j;
    paramParcel.writeInt(i);
    paramParcel.setDataPosition(k);
  }
  
  public static int zzav(Parcel paramParcel)
  {
    return zzG(paramParcel, 20293);
  }
  
  private static void zzb(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i = (char)-1;
    if (paramInt2 >= i)
    {
      i = 0xFFFF0000 | paramInt1;
      paramParcel.writeInt(i);
      paramParcel.writeInt(paramInt2);
    }
    for (;;)
    {
      return;
      i = paramInt2 << 16 | paramInt1;
      paramParcel.writeInt(i);
    }
  }
  
  public static void zzb(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    int i;
    if (paramList == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeStringList(paramList);
      zzH(paramParcel, i);
    }
  }
  
  public static void zzc(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    zzb(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void zzc(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null) {
      if (paramBoolean) {
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      int i = zzG(paramParcel, paramInt);
      int j = paramList.size();
      paramParcel.writeInt(j);
      int k = 0;
      if (k < j)
      {
        Parcelable localParcelable = (Parcelable)paramList.get(k);
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          int m = k + 1;
          k = m;
          break;
          zza(paramParcel, localParcelable, 0);
        }
      }
      zzH(paramParcel, i);
    }
  }
  
  public static void zzd(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    int i;
    if (paramList == null) {
      if (paramBoolean)
      {
        i = 0;
        zzb(paramParcel, paramInt, 0);
      }
    }
    for (;;)
    {
      return;
      i = zzG(paramParcel, paramInt);
      paramParcel.writeList(paramList);
      zzH(paramParcel, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\safeparcel\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */