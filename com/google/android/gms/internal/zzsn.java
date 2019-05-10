package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzsn
{
  private final ByteBuffer zzbui;
  
  private zzsn(ByteBuffer paramByteBuffer)
  {
    this.zzbui = paramByteBuffer;
    ByteBuffer localByteBuffer = this.zzbui;
    ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN;
    localByteBuffer.order(localByteOrder);
  }
  
  private zzsn(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(localByteBuffer);
  }
  
  public static int zzC(int paramInt1, int paramInt2)
  {
    int i = zzmA(paramInt1);
    int j = zzmx(paramInt2);
    return i + j;
  }
  
  public static int zzD(int paramInt1, int paramInt2)
  {
    int i = zzmA(paramInt1);
    int j = zzmy(paramInt2);
    return i + j;
  }
  
  public static zzsn zzE(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zzb(paramArrayOfByte, 0, i);
  }
  
  public static int zzG(byte[] paramArrayOfByte)
  {
    int i = zzmC(paramArrayOfByte.length);
    int j = paramArrayOfByte.length;
    return i + j;
  }
  
  private static int zza(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    int j = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    int k = paramInt;
    if (k < i)
    {
      int m = paramCharSequence.charAt(k);
      int n = 2048;
      if (m < n)
      {
        m = 127 - m >>> 31;
        j += m;
      }
      for (;;)
      {
        k += 1;
        break;
        j += 2;
        n = 55296;
        if (n <= m)
        {
          n = 57343;
          if (m <= n)
          {
            m = Character.codePointAt(paramCharSequence, k);
            n = 65536;
            if (m < n)
            {
              localIllegalArgumentException = new java/lang/IllegalArgumentException;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              String str = "Unpaired surrogate at index " + k;
              localIllegalArgumentException.<init>(str);
              throw localIllegalArgumentException;
            }
            k += 1;
          }
        }
      }
    }
    return j;
  }
  
  private static int zza(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 57343;
    int j = 55296;
    int k = 128;
    int m = paramCharSequence.length();
    int n = 0;
    Object localObject1 = null;
    int i1 = paramInt1 + paramInt2;
    int i2;
    int i4;
    while (n < m)
    {
      i2 = n + paramInt1;
      if (i2 >= i1) {
        break;
      }
      i2 = paramCharSequence.charAt(n);
      if (i2 >= k) {
        break;
      }
      i4 = paramInt1 + n;
      i2 = (byte)i2;
      paramArrayOfByte[i4] = i2;
      n += 1;
    }
    if (n == m) {}
    int i7;
    for (n = paramInt1 + m;; n = i7)
    {
      return n;
      i4 = paramInt1 + n;
      if (n < m)
      {
        int i8 = paramCharSequence.charAt(n);
        if ((i8 < k) && (i4 < i1))
        {
          i2 = i4 + 1;
          i8 = (byte)i8;
          paramArrayOfByte[i4] = i8;
        }
        StringBuilder localStringBuilder;
        int i10;
        int i3;
        for (;;)
        {
          n += 1;
          i4 = i2;
          break;
          i2 = 2048;
          int i5;
          if (i8 < i2)
          {
            i2 = i1 + -2;
            if (i4 <= i2)
            {
              i11 = i4 + 1;
              i2 = (byte)(i8 >>> 6 | 0x3C0);
              paramArrayOfByte[i4] = i2;
              i2 = i11 + 1;
              i5 = (byte)(i8 & 0x3F | 0x80);
              paramArrayOfByte[i11] = i5;
              continue;
            }
          }
          int i6;
          int i9;
          if ((i8 < j) || (i < i8))
          {
            i2 = i1 + -3;
            if (i5 <= i2)
            {
              i2 = i5 + 1;
              i11 = (byte)(i8 >>> 12 | 0x1E0);
              paramArrayOfByte[i5] = i11;
              i6 = i2 + 1;
              i11 = (byte)(i8 >>> 6 & 0x3F | 0x80);
              paramArrayOfByte[i2] = i11;
              i2 = i6 + 1;
              i9 = (byte)(i8 & 0x3F | 0x80);
              paramArrayOfByte[i6] = i9;
              continue;
            }
          }
          i2 = i1 + -4;
          if (i6 > i2) {
            break label592;
          }
          i2 = n + 1;
          int i11 = paramCharSequence.length();
          if (i2 != i11)
          {
            n += 1;
            i2 = paramCharSequence.charAt(n);
            boolean bool2 = Character.isSurrogatePair(i9, i2);
            if (bool2) {}
          }
          else
          {
            localObject2 = new java/lang/IllegalArgumentException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder = localStringBuilder.append("Unpaired surrogate at index ");
            n += -1;
            localObject1 = n;
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
          i10 = Character.toCodePoint(i9, i2);
          i3 = i6 + 1;
          int i12 = (byte)(i10 >>> 18 | 0xF0);
          paramArrayOfByte[i6] = i12;
          i7 = i3 + 1;
          i12 = (byte)(i10 >>> 12 & 0x3F | 0x80);
          paramArrayOfByte[i3] = i12;
          i12 = i7 + 1;
          i3 = (byte)(i10 >>> 6 & 0x3F | 0x80);
          paramArrayOfByte[i7] = i3;
          i3 = i12 + 1;
          i7 = (byte)(i10 & 0x3F | 0x80);
          paramArrayOfByte[i12] = i7;
        }
        label592:
        if ((j <= i10) && (i10 <= i))
        {
          i3 = n + 1;
          m = paramCharSequence.length();
          if (i3 != m)
          {
            i3 = n + 1;
            i3 = paramCharSequence.charAt(i3);
            boolean bool1 = Character.isSurrogatePair(i10, i3);
            if (bool1) {}
          }
          else
          {
            localObject2 = new java/lang/IllegalArgumentException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject1 = "Unpaired surrogate at index " + n;
            ((IllegalArgumentException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
          }
        }
        localObject1 = new java/lang/ArrayIndexOutOfBoundsException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Failed writing " + i10 + " at index " + i7;
        ((ArrayIndexOutOfBoundsException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
  }
  
  private static void zza(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    boolean bool = paramByteBuffer.isReadOnly();
    Object localObject;
    if (bool)
    {
      localObject = new java/nio/ReadOnlyBufferException;
      ((ReadOnlyBufferException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    bool = paramByteBuffer.hasArray();
    if (bool) {}
    for (;;)
    {
      try
      {
        localObject = paramByteBuffer.array();
        int j = paramByteBuffer.arrayOffset();
        int k = paramByteBuffer.position();
        j += k;
        k = paramByteBuffer.remaining();
        int i = zza(paramCharSequence, (byte[])localObject, j, k);
        j = paramByteBuffer.arrayOffset();
        i -= j;
        paramByteBuffer.position(i);
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        BufferOverflowException localBufferOverflowException = new java/nio/BufferOverflowException;
        localBufferOverflowException.<init>();
        localBufferOverflowException.initCause(localArrayIndexOutOfBoundsException);
        throw localBufferOverflowException;
      }
      zzb(paramCharSequence, paramByteBuffer);
    }
  }
  
  public static int zzaA(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int zzar(long paramLong)
  {
    return zzav(paramLong);
  }
  
  public static int zzas(long paramLong)
  {
    return zzav(paramLong);
  }
  
  public static int zzat(long paramLong)
  {
    return zzav(zzax(paramLong));
  }
  
  public static int zzav(long paramLong)
  {
    long l1 = 0L;
    long l2 = Byte.MIN_VALUE & paramLong;
    int i = l2 < l1;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      l2 = 0xFFFFFFFFFFFFC000 & paramLong;
      boolean bool1 = l2 < l1;
      if (!bool1)
      {
        int j = 2;
      }
      else
      {
        l2 = 0xFFE00000 & paramLong;
        boolean bool2 = l2 < l1;
        if (!bool2)
        {
          int k = 3;
        }
        else
        {
          l2 = 0xF0000000 & paramLong;
          boolean bool3 = l2 < l1;
          if (!bool3)
          {
            int m = 4;
          }
          else
          {
            l2 = 0xFFFFFFF800000000 & paramLong;
            boolean bool4 = l2 < l1;
            if (!bool4)
            {
              int n = 5;
            }
            else
            {
              l2 = 0xFFFFFC0000000000 & paramLong;
              boolean bool5 = l2 < l1;
              if (!bool5)
              {
                int i1 = 6;
              }
              else
              {
                l2 = 0xFFFE000000000000 & paramLong;
                boolean bool6 = l2 < l1;
                if (!bool6)
                {
                  int i2 = 7;
                }
                else
                {
                  l2 = 0xFF00000000000000 & paramLong;
                  boolean bool7 = l2 < l1;
                  if (!bool7)
                  {
                    int i3 = 8;
                  }
                  else
                  {
                    l2 = 0x8000000000000000 & paramLong;
                    boolean bool8 = l2 < l1;
                    int i4;
                    if (!bool8) {
                      i4 = 9;
                    } else {
                      i4 = 10;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static long zzax(long paramLong)
  {
    long l1 = paramLong << 1;
    long l2 = paramLong >> 63;
    return l1 ^ l2;
  }
  
  public static int zzb(int paramInt, double paramDouble)
  {
    int i = zzmA(paramInt);
    int j = zzl(paramDouble);
    return i + j;
  }
  
  public static int zzb(int paramInt, zzsu paramzzsu)
  {
    int i = zzmA(paramInt) * 2;
    int j = zzd(paramzzsu);
    return i + j;
  }
  
  public static int zzb(int paramInt, byte[] paramArrayOfByte)
  {
    int i = zzmA(paramInt);
    int j = zzG(paramArrayOfByte);
    return i + j;
  }
  
  public static zzsn zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzsn localzzsn = new com/google/android/gms/internal/zzsn;
    localzzsn.<init>(paramArrayOfByte, paramInt1, paramInt2);
    return localzzsn;
  }
  
  private static void zzb(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = 0;
    String str = null;
    if (j < i)
    {
      int k = paramCharSequence.charAt(j);
      int i1 = 128;
      if (k < i1)
      {
        k = (byte)k;
        paramByteBuffer.put(k);
      }
      for (;;)
      {
        j += 1;
        break;
        int i2 = 2048;
        int m;
        if (k < i2)
        {
          byte b1 = (byte)(k >>> 6 | 0x3C0);
          paramByteBuffer.put(b1);
          m = (byte)(k & 0x3F | 0x80);
          paramByteBuffer.put(m);
        }
        else
        {
          int i3 = 55296;
          if (m >= i3)
          {
            int i4 = 57343;
            if (i4 >= m) {}
          }
          else
          {
            byte b2 = (byte)(m >>> 12 | 0x1E0);
            paramByteBuffer.put(b2);
            b2 = (byte)(m >>> 6 & 0x3F | 0x80);
            paramByteBuffer.put(b2);
            m = (byte)(m & 0x3F | 0x80);
            paramByteBuffer.put(m);
            continue;
          }
          int i5 = j + 1;
          int i6 = paramCharSequence.length();
          if (i5 != i6)
          {
            j += 1;
            i5 = paramCharSequence.charAt(j);
            boolean bool = Character.isSurrogatePair(m, i5);
            if (bool) {}
          }
          else
          {
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder = localStringBuilder.append("Unpaired surrogate at index ");
            j += -1;
            str = j;
            localIllegalArgumentException.<init>(str);
            throw localIllegalArgumentException;
          }
          int n = Character.toCodePoint(m, i5);
          byte b3 = (byte)(n >>> 18 | 0xF0);
          paramByteBuffer.put(b3);
          b3 = (byte)(n >>> 12 & 0x3F | 0x80);
          paramByteBuffer.put(b3);
          b3 = (byte)(n >>> 6 & 0x3F | 0x80);
          paramByteBuffer.put(b3);
          n = (byte)(n & 0x3F | 0x80);
          paramByteBuffer.put(n);
        }
      }
    }
  }
  
  public static int zzc(int paramInt, float paramFloat)
  {
    int i = zzmA(paramInt);
    int j = zzk(paramFloat);
    return i + j;
  }
  
  public static int zzc(int paramInt, zzsu paramzzsu)
  {
    int i = zzmA(paramInt);
    int j = zze(paramzzsu);
    return i + j;
  }
  
  private static int zzc(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = 0;
    String str = null;
    int k;
    int m;
    while (j < i)
    {
      k = paramCharSequence.charAt(j);
      m = 128;
      if (k >= m) {
        break;
      }
      j += 1;
    }
    for (;;)
    {
      if (k < i)
      {
        m = paramCharSequence.charAt(k);
        int n = 2048;
        if (m < n)
        {
          m = (127 - m >>> 31) + j;
          k += 1;
          j = m;
        }
        else
        {
          k = zza(paramCharSequence, k);
          j += k;
        }
      }
      else
      {
        if (j < i)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder = localStringBuilder.append("UTF-8 length does not fit in int: ");
          long l = j + 4294967296L;
          str = l;
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
        return j;
        k = j;
        j = i;
      }
    }
  }
  
  public static int zzd(int paramInt, long paramLong)
  {
    int i = zzmA(paramInt);
    int j = zzas(paramLong);
    return i + j;
  }
  
  public static int zzd(zzsu paramzzsu)
  {
    return paramzzsu.getSerializedSize();
  }
  
  public static int zze(int paramInt, long paramLong)
  {
    int i = zzmA(paramInt);
    int j = zzat(paramLong);
    return i + j;
  }
  
  public static int zze(zzsu paramzzsu)
  {
    int i = paramzzsu.getSerializedSize();
    int j = zzmC(i);
    return i + j;
  }
  
  public static int zzf(int paramInt, boolean paramBoolean)
  {
    int i = zzmA(paramInt);
    int j = zzaA(paramBoolean);
    return i + j;
  }
  
  public static int zzgO(String paramString)
  {
    int i = zzc(paramString);
    int j = zzmC(i);
    return i + j;
  }
  
  public static int zzk(float paramFloat)
  {
    return 4;
  }
  
  public static int zzl(double paramDouble)
  {
    return 8;
  }
  
  public static int zzmA(int paramInt)
  {
    return zzmC(zzsx.zzF(paramInt, 0));
  }
  
  public static int zzmC(int paramInt)
  {
    int i = paramInt & 0xFFFFFF80;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = paramInt & 0xC000;
      if (i == 0)
      {
        i = 2;
      }
      else
      {
        i = 0xFFE00000 & paramInt;
        if (i == 0)
        {
          i = 3;
        }
        else
        {
          i = 0xF0000000 & paramInt;
          if (i == 0) {
            i = 4;
          } else {
            i = 5;
          }
        }
      }
    }
  }
  
  public static int zzmE(int paramInt)
  {
    int i = paramInt << 1;
    int j = paramInt >> 31;
    return i ^ j;
  }
  
  public static int zzmx(int paramInt)
  {
    if (paramInt >= 0) {}
    for (int i = zzmC(paramInt);; i = 10) {
      return i;
    }
  }
  
  public static int zzmy(int paramInt)
  {
    return zzmC(zzmE(paramInt));
  }
  
  public static int zzo(int paramInt, String paramString)
  {
    int i = zzmA(paramInt);
    int j = zzgO(paramString);
    return i + j;
  }
  
  public void zzA(int paramInt1, int paramInt2)
  {
    zzE(paramInt1, 0);
    zzmv(paramInt2);
  }
  
  public void zzB(int paramInt1, int paramInt2)
  {
    zzE(paramInt1, 0);
    zzmw(paramInt2);
  }
  
  public void zzE(int paramInt1, int paramInt2)
  {
    int i = zzsx.zzF(paramInt1, paramInt2);
    zzmB(i);
  }
  
  public void zzF(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    zzmB(i);
    zzH(paramArrayOfByte);
  }
  
  public void zzH(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    zzc(paramArrayOfByte, 0, i);
  }
  
  public int zzJn()
  {
    return this.zzbui.remaining();
  }
  
  public void zzJo()
  {
    int i = zzJn();
    if (i != 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Did not write as much data as expected.");
      throw localIllegalStateException;
    }
  }
  
  public void zza(int paramInt, double paramDouble)
  {
    zzE(paramInt, 1);
    zzk(paramDouble);
  }
  
  public void zza(int paramInt, long paramLong)
  {
    zzE(paramInt, 0);
    zzao(paramLong);
  }
  
  public void zza(int paramInt, zzsu paramzzsu)
  {
    zzE(paramInt, 2);
    zzc(paramzzsu);
  }
  
  public void zza(int paramInt, byte[] paramArrayOfByte)
  {
    zzE(paramInt, 2);
    zzF(paramArrayOfByte);
  }
  
  public void zzao(long paramLong)
  {
    zzau(paramLong);
  }
  
  public void zzap(long paramLong)
  {
    zzau(paramLong);
  }
  
  public void zzaq(long paramLong)
  {
    long l = zzax(paramLong);
    zzau(l);
  }
  
  public void zzau(long paramLong)
  {
    for (;;)
    {
      long l1 = Byte.MIN_VALUE & paramLong;
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        i = (int)paramLong;
        zzmz(i);
        return;
      }
      int i = (int)paramLong & 0x7F | 0x80;
      zzmz(i);
      i = 7;
      paramLong >>>= i;
    }
  }
  
  public void zzaw(long paramLong)
  {
    Object localObject = this.zzbui;
    int i = ((ByteBuffer)localObject).remaining();
    int j = 8;
    if (i < j)
    {
      localObject = new com/google/android/gms/internal/zzsn$zza;
      j = this.zzbui.position();
      int k = this.zzbui.limit();
      ((zzsn.zza)localObject).<init>(j, k);
      throw ((Throwable)localObject);
    }
    this.zzbui.putLong(paramLong);
  }
  
  public void zzaz(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      zzmz(i);
      return;
    }
  }
  
  public void zzb(byte paramByte)
  {
    Object localObject = this.zzbui;
    boolean bool = ((ByteBuffer)localObject).hasRemaining();
    if (!bool)
    {
      localObject = new com/google/android/gms/internal/zzsn$zza;
      int i = this.zzbui.position();
      int j = this.zzbui.limit();
      ((zzsn.zza)localObject).<init>(i, j);
      throw ((Throwable)localObject);
    }
    this.zzbui.put(paramByte);
  }
  
  public void zzb(int paramInt, float paramFloat)
  {
    zzE(paramInt, 5);
    zzj(paramFloat);
  }
  
  public void zzb(int paramInt, long paramLong)
  {
    zzE(paramInt, 0);
    zzap(paramLong);
  }
  
  public void zzb(zzsu paramzzsu)
  {
    paramzzsu.writeTo(this);
  }
  
  public void zzc(int paramInt, long paramLong)
  {
    zzE(paramInt, 0);
    zzaq(paramLong);
  }
  
  public void zzc(zzsu paramzzsu)
  {
    int i = paramzzsu.getCachedSize();
    zzmB(i);
    paramzzsu.writeTo(this);
  }
  
  public void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = this.zzbui;
    int i = ((ByteBuffer)localObject).remaining();
    if (i >= paramInt2)
    {
      this.zzbui.put(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    localObject = new com/google/android/gms/internal/zzsn$zza;
    int j = this.zzbui.position();
    int k = this.zzbui.limit();
    ((zzsn.zza)localObject).<init>(j, k);
    throw ((Throwable)localObject);
  }
  
  public void zze(int paramInt, boolean paramBoolean)
  {
    zzE(paramInt, 0);
    zzaz(paramBoolean);
  }
  
  public void zzgN(String paramString)
  {
    try
    {
      i = paramString.length();
      i = zzmC(i);
      j = paramString.length() * 3;
      j = zzmC(j);
      if (i != j) {
        break label220;
      }
      localObject1 = this.zzbui;
      j = ((ByteBuffer)localObject1).position();
      localObject2 = this.zzbui;
      k = ((ByteBuffer)localObject2).remaining();
      if (k < i)
      {
        localObject2 = new com/google/android/gms/internal/zzsn$zza;
        i += j;
        localObject1 = this.zzbui;
        j = ((ByteBuffer)localObject1).limit();
        ((zzsn.zza)localObject2).<init>(i, j);
        throw ((Throwable)localObject2);
      }
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      Object localObject1 = new com/google/android/gms/internal/zzsn$zza;
      k = this.zzbui.position();
      m = this.zzbui.limit();
      ((zzsn.zza)localObject1).<init>(k, m);
      ((zzsn.zza)localObject1).initCause(localBufferOverflowException);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = this.zzbui;
    int m = j + i;
    ((ByteBuffer)localObject2).position(m);
    localObject2 = this.zzbui;
    zza(paramString, (ByteBuffer)localObject2);
    localObject2 = this.zzbui;
    int k = ((ByteBuffer)localObject2).position();
    ByteBuffer localByteBuffer2 = this.zzbui;
    localByteBuffer2.position(j);
    int j = k - j;
    int i = j - i;
    zzmB(i);
    ByteBuffer localByteBuffer1 = this.zzbui;
    localByteBuffer1.position(k);
    for (;;)
    {
      return;
      label220:
      i = zzc(paramString);
      zzmB(i);
      localByteBuffer1 = this.zzbui;
      zza(paramString, localByteBuffer1);
    }
  }
  
  public void zzj(float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    zzmD(i);
  }
  
  public void zzk(double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    zzaw(l);
  }
  
  public void zzmB(int paramInt)
  {
    for (;;)
    {
      int i = paramInt & 0xFFFFFF80;
      if (i == 0)
      {
        zzmz(paramInt);
        return;
      }
      i = paramInt & 0x7F | 0x80;
      zzmz(i);
      paramInt >>>= 7;
    }
  }
  
  public void zzmD(int paramInt)
  {
    Object localObject = this.zzbui;
    int i = ((ByteBuffer)localObject).remaining();
    int j = 4;
    if (i < j)
    {
      localObject = new com/google/android/gms/internal/zzsn$zza;
      j = this.zzbui.position();
      int k = this.zzbui.limit();
      ((zzsn.zza)localObject).<init>(j, k);
      throw ((Throwable)localObject);
    }
    this.zzbui.putInt(paramInt);
  }
  
  public void zzmv(int paramInt)
  {
    if (paramInt >= 0) {
      zzmB(paramInt);
    }
    for (;;)
    {
      return;
      long l = paramInt;
      zzau(l);
    }
  }
  
  public void zzmw(int paramInt)
  {
    int i = zzmE(paramInt);
    zzmB(i);
  }
  
  public void zzmz(int paramInt)
  {
    byte b = (byte)paramInt;
    zzb(b);
  }
  
  public void zzn(int paramInt, String paramString)
  {
    zzE(paramInt, 2);
    zzgN(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */