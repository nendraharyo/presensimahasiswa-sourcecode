package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class zza
{
  public static BigDecimal[] zzA(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    BigDecimal[] arrayOfBigDecimal;
    if (i == 0) {
      arrayOfBigDecimal = null;
    }
    for (;;)
    {
      return arrayOfBigDecimal;
      int k = paramParcel.readInt();
      arrayOfBigDecimal = new BigDecimal[k];
      int m = 0;
      while (m < k)
      {
        byte[] arrayOfByte = paramParcel.createByteArray();
        int n = paramParcel.readInt();
        BigDecimal localBigDecimal = new java/math/BigDecimal;
        BigInteger localBigInteger = new java/math/BigInteger;
        localBigInteger.<init>(arrayOfByte);
        localBigDecimal.<init>(localBigInteger, n);
        arrayOfBigDecimal[m] = localBigDecimal;
        m += 1;
      }
      m = j + i;
      paramParcel.setDataPosition(m);
    }
  }
  
  public static String[] zzB(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    String[] arrayOfString;
    if (i == 0) {
      arrayOfString = null;
    }
    for (;;)
    {
      return arrayOfString;
      arrayOfString = paramParcel.createStringArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static ArrayList zzC(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    ArrayList localArrayList;
    if (i == 0) {
      localArrayList = null;
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int k = paramParcel.readInt();
      int m = 0;
      while (m < k)
      {
        int n = paramParcel.readInt();
        Integer localInteger = Integer.valueOf(n);
        localArrayList.add(localInteger);
        m += 1;
      }
      m = j + i;
      paramParcel.setDataPosition(m);
    }
  }
  
  public static ArrayList zzD(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    ArrayList localArrayList;
    if (i == 0) {
      localArrayList = null;
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = paramParcel.createStringArrayList();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static Parcel zzE(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Parcel localParcel;
    if (i == 0) {
      localParcel = null;
    }
    for (;;)
    {
      return localParcel;
      localParcel = Parcel.obtain();
      localParcel.appendFrom(paramParcel, j, i);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static Parcel[] zzF(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    int j = zza(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (j == 0) {}
    for (;;)
    {
      return (Parcel[])localObject;
      int m = paramParcel.readInt();
      Parcel[] arrayOfParcel = new Parcel[m];
      int n = 0;
      if (n < m)
      {
        int i1 = paramParcel.readInt();
        if (i1 != 0)
        {
          int i2 = paramParcel.dataPosition();
          Parcel localParcel = Parcel.obtain();
          localParcel.appendFrom(paramParcel, i2, i1);
          arrayOfParcel[n] = localParcel;
          i1 += i2;
          paramParcel.setDataPosition(i1);
        }
        for (;;)
        {
          n += 1;
          break;
          arrayOfParcel[n] = null;
        }
      }
      i = k + j;
      paramParcel.setDataPosition(i);
      localObject = arrayOfParcel;
    }
  }
  
  public static int zza(Parcel paramParcel, int paramInt)
  {
    int i = -65536;
    int j = paramInt & i;
    if (j != i)
    {
      j = paramInt >> 16;
      i = (char)-1;
      j &= i;
    }
    for (;;)
    {
      return j;
      j = paramParcel.readInt();
    }
  }
  
  public static Parcelable zza(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Parcelable localParcelable;
    if (i == 0) {
      localParcelable = null;
    }
    for (;;)
    {
      return localParcelable;
      localParcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  private static void zza(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i = zza(paramParcel, paramInt1);
    if (i != paramInt2)
    {
      zza.zza localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("Expected size ").append(paramInt2).append(" got ").append(i).append(" (0x");
      String str = Integer.toHexString(i);
      str = str + ")";
      localzza.<init>(str, paramParcel);
      throw localzza;
    }
  }
  
  private static void zza(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 != paramInt3)
    {
      zza.zza localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Expected size ").append(paramInt3).append(" got ").append(paramInt2).append(" (0x");
      String str = Integer.toHexString(paramInt2);
      localObject = str + ")";
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
  }
  
  public static void zza(Parcel paramParcel, int paramInt, List paramList, ClassLoader paramClassLoader)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0) {}
    for (;;)
    {
      return;
      paramParcel.readList(paramList, paramClassLoader);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static int zzat(Parcel paramParcel)
  {
    return paramParcel.readInt();
  }
  
  public static int zzau(Parcel paramParcel)
  {
    int i = zzat(paramParcel);
    int j = zza(paramParcel, i);
    int k = paramParcel.dataPosition();
    int m = zzca(i);
    int n = 20293;
    zza.zza localzza;
    String str;
    if (m != n)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1 = localStringBuilder1.append("Expected object header. Got 0x");
      str = Integer.toHexString(i);
      str = str;
      localzza.<init>(str, paramParcel);
      throw localzza;
    }
    i = k + j;
    if (i >= k)
    {
      j = paramParcel.dataSize();
      if (i <= j) {}
    }
    else
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      str = "Size read is invalid start=" + k + " end=" + i;
      localzza.<init>(str, paramParcel);
      throw localzza;
    }
    return i;
  }
  
  public static void zzb(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    i += j;
    paramParcel.setDataPosition(i);
  }
  
  public static Object[] zzb(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Object[] arrayOfObject;
    if (i == 0) {
      arrayOfObject = null;
    }
    for (;;)
    {
      return arrayOfObject;
      arrayOfObject = paramParcel.createTypedArray(paramCreator);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static ArrayList zzc(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    ArrayList localArrayList;
    if (i == 0) {
      localArrayList = null;
    }
    for (;;)
    {
      return localArrayList;
      localArrayList = paramParcel.createTypedArrayList(paramCreator);
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static boolean zzc(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 4);
    int i = paramParcel.readInt();
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static int zzca(int paramInt)
  {
    return (char)-1 & paramInt;
  }
  
  public static Boolean zzd(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    Boolean localBoolean;
    if (i == 0)
    {
      i = 0;
      localBoolean = null;
      return localBoolean;
    }
    int k = 4;
    zza(paramParcel, paramInt, i, k);
    i = paramParcel.readInt();
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      localBoolean = Boolean.valueOf(i);
      break;
      int j = 0;
      localBoolean = null;
    }
  }
  
  public static byte zze(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 4);
    return (byte)paramParcel.readInt();
  }
  
  public static short zzf(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 4);
    return (short)paramParcel.readInt();
  }
  
  public static int zzg(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Integer zzh(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    if (i == 0) {
      i = 0;
    }
    for (Integer localInteger = null;; localInteger = Integer.valueOf(i))
    {
      return localInteger;
      int j = 4;
      zza(paramParcel, paramInt, i, j);
      i = paramParcel.readInt();
    }
  }
  
  public static long zzi(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long zzj(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    if (i == 0) {
      i = 0;
    }
    long l;
    for (Long localLong = null;; localLong = Long.valueOf(l))
    {
      return localLong;
      int j = 8;
      zza(paramParcel, paramInt, i, j);
      l = paramParcel.readLong();
    }
  }
  
  public static BigInteger zzk(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    BigInteger localBigInteger;
    if (i == 0)
    {
      i = 0;
      localBigInteger = null;
    }
    for (;;)
    {
      return localBigInteger;
      byte[] arrayOfByte = paramParcel.createByteArray();
      i += j;
      paramParcel.setDataPosition(i);
      localBigInteger = new java/math/BigInteger;
      localBigInteger.<init>(arrayOfByte);
    }
  }
  
  public static float zzl(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static Float zzm(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    float f;
    if (i == 0)
    {
      i = 0;
      f = 0.0F;
    }
    for (Float localFloat = null;; localFloat = Float.valueOf(f))
    {
      return localFloat;
      int j = 4;
      zza(paramParcel, paramInt, i, j);
      f = paramParcel.readFloat();
    }
  }
  
  public static double zzn(Parcel paramParcel, int paramInt)
  {
    zza(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  public static BigDecimal zzo(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    BigDecimal localBigDecimal;
    if (i == 0)
    {
      i = 0;
      localBigDecimal = null;
    }
    for (;;)
    {
      return localBigDecimal;
      byte[] arrayOfByte = paramParcel.createByteArray();
      int k = paramParcel.readInt();
      i += j;
      paramParcel.setDataPosition(i);
      localBigDecimal = new java/math/BigDecimal;
      BigInteger localBigInteger = new java/math/BigInteger;
      localBigInteger.<init>(arrayOfByte);
      localBigDecimal.<init>(localBigInteger, k);
    }
  }
  
  public static String zzp(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    String str;
    if (i == 0) {
      str = null;
    }
    for (;;)
    {
      return str;
      str = paramParcel.readString();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static IBinder zzq(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    IBinder localIBinder;
    if (i == 0) {
      localIBinder = null;
    }
    for (;;)
    {
      return localIBinder;
      localIBinder = paramParcel.readStrongBinder();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static Bundle zzr(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    Bundle localBundle;
    if (i == 0) {
      localBundle = null;
    }
    for (;;)
    {
      return localBundle;
      localBundle = paramParcel.readBundle();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static byte[] zzs(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    byte[] arrayOfByte;
    if (i == 0) {
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      arrayOfByte = paramParcel.createByteArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static byte[][] zzt(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    byte[][] arrayOfByte;
    if (i == 0) {
      arrayOfByte = (byte[][])null;
    }
    for (;;)
    {
      return arrayOfByte;
      int k = paramParcel.readInt();
      arrayOfByte = new byte[k][];
      int m = 0;
      while (m < k)
      {
        byte[] arrayOfByte1 = paramParcel.createByteArray();
        arrayOfByte[m] = arrayOfByte1;
        m += 1;
      }
      m = j + i;
      paramParcel.setDataPosition(m);
    }
  }
  
  public static boolean[] zzu(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    boolean[] arrayOfBoolean;
    if (i == 0) {
      arrayOfBoolean = null;
    }
    for (;;)
    {
      return arrayOfBoolean;
      arrayOfBoolean = paramParcel.createBooleanArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static int[] zzv(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    int[] arrayOfInt;
    if (i == 0) {
      arrayOfInt = null;
    }
    for (;;)
    {
      return arrayOfInt;
      arrayOfInt = paramParcel.createIntArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static long[] zzw(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    long[] arrayOfLong;
    if (i == 0) {
      arrayOfLong = null;
    }
    for (;;)
    {
      return arrayOfLong;
      arrayOfLong = paramParcel.createLongArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static BigInteger[] zzx(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    BigInteger[] arrayOfBigInteger;
    if (i == 0) {
      arrayOfBigInteger = null;
    }
    for (;;)
    {
      return arrayOfBigInteger;
      int k = paramParcel.readInt();
      arrayOfBigInteger = new BigInteger[k];
      int m = 0;
      while (m < k)
      {
        BigInteger localBigInteger = new java/math/BigInteger;
        byte[] arrayOfByte = paramParcel.createByteArray();
        localBigInteger.<init>(arrayOfByte);
        arrayOfBigInteger[m] = localBigInteger;
        m += 1;
      }
      m = j + i;
      paramParcel.setDataPosition(m);
    }
  }
  
  public static float[] zzy(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    float[] arrayOfFloat;
    if (i == 0) {
      arrayOfFloat = null;
    }
    for (;;)
    {
      return arrayOfFloat;
      arrayOfFloat = paramParcel.createFloatArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
  
  public static double[] zzz(Parcel paramParcel, int paramInt)
  {
    int i = zza(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    double[] arrayOfDouble;
    if (i == 0) {
      arrayOfDouble = null;
    }
    for (;;)
    {
      return arrayOfDouble;
      arrayOfDouble = paramParcel.createDoubleArray();
      i += j;
      paramParcel.setDataPosition(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\safeparcel\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */