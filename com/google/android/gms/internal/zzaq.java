package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzaq
{
  private final zzap zznF;
  private final SecureRandom zzox;
  
  public zzaq(zzap paramzzap, SecureRandom paramSecureRandom)
  {
    this.zznF = paramzzap;
    this.zzox = paramSecureRandom;
  }
  
  static void zze(byte[] paramArrayOfByte)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = (byte)(paramArrayOfByte[i] ^ 0x44);
      paramArrayOfByte[i] = j;
      i += 1;
    }
  }
  
  public byte[] zzc(byte[] paramArrayOfByte, String paramString)
  {
    int i = 16;
    int j = paramArrayOfByte.length;
    Object localObject1;
    if (j != i)
    {
      localObject1 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject1).<init>(this);
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.zznF;
      k = 0;
      localObject2 = null;
      localObject1 = ((zzap)localObject1).zza(paramString, false);
      k = localObject1.length;
      if (k <= i)
      {
        localObject1 = new com/google/android/gms/internal/zzaq$zza;
        ((zzaq.zza)localObject1).<init>(this);
        throw ((Throwable)localObject1);
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
      int k = localNoSuchAlgorithmException.length;
      localObject2 = ByteBuffer.allocate(k);
      ((ByteBuffer)localObject2).put(localNoSuchAlgorithmException);
      ((ByteBuffer)localObject2).flip();
      i = 16;
      byte[] arrayOfByte2 = new byte[i];
      j = localNoSuchAlgorithmException.length + -16;
      byte[] arrayOfByte1 = new byte[j];
      ((ByteBuffer)localObject2).get(arrayOfByte2);
      ((ByteBuffer)localObject2).get(arrayOfByte1);
      localObject2 = new javax/crypto/spec/SecretKeySpec;
      Object localObject3 = "AES";
      ((SecretKeySpec)localObject2).<init>(paramArrayOfByte, (String)localObject3);
      localObject3 = "AES/CBC/PKCS5Padding";
      localObject3 = Cipher.getInstance((String)localObject3);
      int m = 2;
      IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
      localIvParameterSpec.<init>(arrayOfByte2);
      ((Cipher)localObject3).init(m, (Key)localObject2, localIvParameterSpec);
      return ((Cipher)localObject3).doFinal(arrayOfByte1);
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localInvalidKeyException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localIllegalBlockSizeException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localNoSuchPaddingException);
      throw ((Throwable)localObject2);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localBadPaddingException);
      throw ((Throwable)localObject2);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localInvalidAlgorithmParameterException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Object localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localIllegalArgumentException);
      throw ((Throwable)localObject2);
    }
  }
  
  public byte[] zzl(String paramString)
  {
    try
    {
      Object localObject1 = this.zznF;
      i = 0;
      localObject2 = null;
      localObject1 = ((zzap)localObject1).zza(paramString, false);
      i = localObject1.length;
      j = 32;
      if (i != j)
      {
        localObject1 = new com/google/android/gms/internal/zzaq$zza;
        ((zzaq.zza)localObject1).<init>(this);
        throw ((Throwable)localObject1);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject2 = new com/google/android/gms/internal/zzaq$zza;
      ((zzaq.zza)localObject2).<init>(this, localIllegalArgumentException);
      throw ((Throwable)localObject2);
    }
    int i = 4;
    int j = 16;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(localIllegalArgumentException, i, j);
    i = 16;
    Object localObject2 = new byte[i];
    localByteBuffer.get((byte[])localObject2);
    zze((byte[])localObject2);
    return (byte[])localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */