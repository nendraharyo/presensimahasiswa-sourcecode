package io.fabric.sdk.android.services.network;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class HttpRequest$Base64
{
  private static final byte EQUALS_SIGN = 61;
  private static final String PREFERRED_ENCODING = "US-ASCII";
  private static final byte[] _STANDARD_ALPHABET;
  
  static
  {
    byte[] arrayOfByte = new byte[64];
    arrayOfByte[0] = 65;
    arrayOfByte[1] = 66;
    arrayOfByte[2] = 67;
    arrayOfByte[3] = 68;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 70;
    arrayOfByte[6] = 71;
    arrayOfByte[7] = 72;
    arrayOfByte[8] = 73;
    arrayOfByte[9] = 74;
    arrayOfByte[10] = 75;
    arrayOfByte[11] = 76;
    arrayOfByte[12] = 77;
    arrayOfByte[13] = 78;
    arrayOfByte[14] = 79;
    arrayOfByte[15] = 80;
    arrayOfByte[16] = 81;
    arrayOfByte[17] = 82;
    arrayOfByte[18] = 83;
    arrayOfByte[19] = 84;
    arrayOfByte[20] = 85;
    arrayOfByte[21] = 86;
    arrayOfByte[22] = 87;
    arrayOfByte[23] = 88;
    arrayOfByte[24] = 89;
    arrayOfByte[25] = 90;
    arrayOfByte[26] = 97;
    arrayOfByte[27] = 98;
    arrayOfByte[28] = 99;
    arrayOfByte[29] = 100;
    arrayOfByte[30] = 101;
    arrayOfByte[31] = 102;
    arrayOfByte[32] = 103;
    arrayOfByte[33] = 104;
    arrayOfByte[34] = 105;
    arrayOfByte[35] = 106;
    arrayOfByte[36] = 107;
    arrayOfByte[37] = 108;
    arrayOfByte[38] = 109;
    arrayOfByte[39] = 110;
    arrayOfByte[40] = 111;
    arrayOfByte[41] = 112;
    arrayOfByte[42] = 113;
    arrayOfByte[43] = 114;
    arrayOfByte[44] = 115;
    arrayOfByte[45] = 116;
    arrayOfByte[46] = 117;
    arrayOfByte[47] = 118;
    arrayOfByte[48] = 119;
    arrayOfByte[49] = 120;
    arrayOfByte[50] = 121;
    arrayOfByte[51] = 122;
    arrayOfByte[52] = 48;
    arrayOfByte[53] = 49;
    arrayOfByte[54] = 50;
    arrayOfByte[55] = 51;
    arrayOfByte[56] = 52;
    arrayOfByte[57] = 53;
    arrayOfByte[58] = 54;
    arrayOfByte[59] = 55;
    arrayOfByte[60] = 56;
    arrayOfByte[61] = 57;
    arrayOfByte[62] = 43;
    arrayOfByte[63] = 47;
    _STANDARD_ALPHABET = arrayOfByte;
  }
  
  public static String encode(String paramString)
  {
    Object localObject = "US-ASCII";
    try
    {
      localObject = paramString.getBytes((String)localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        byte[] arrayOfByte = paramString.getBytes();
      }
    }
    return encodeBytes((byte[])localObject);
  }
  
  private static byte[] encode3to4(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = 61;
    int j = 0;
    byte[] arrayOfByte = _STANDARD_ALPHABET;
    int k;
    int m;
    if (paramInt2 > 0)
    {
      k = paramArrayOfByte1[paramInt1] << 24 >>> 8;
      m = k;
      k = 1;
      if (paramInt2 <= k) {
        break label132;
      }
      k = paramInt1 + 1;
      k = paramArrayOfByte1[k] << 24 >>> 16;
      label57:
      k |= m;
      m = 2;
      if (paramInt2 > m)
      {
        j = paramInt1 + 2;
        j = paramArrayOfByte1[j] << 24 >>> 24;
      }
      j |= k;
      switch (paramInt2)
      {
      }
    }
    for (;;)
    {
      return paramArrayOfByte2;
      m = 0;
      break;
      label132:
      k = 0;
      break label57;
      k = j >>> 18;
      k = arrayOfByte[k];
      paramArrayOfByte2[paramInt3] = k;
      k = paramInt3 + 1;
      m = j >>> 12 & 0x3F;
      m = arrayOfByte[m];
      paramArrayOfByte2[k] = m;
      k = paramInt3 + 2;
      m = j >>> 6 & 0x3F;
      m = arrayOfByte[m];
      paramArrayOfByte2[k] = m;
      k = paramInt3 + 3;
      j &= 0x3F;
      j = arrayOfByte[j];
      paramArrayOfByte2[k] = j;
      continue;
      k = j >>> 18;
      k = arrayOfByte[k];
      paramArrayOfByte2[paramInt3] = k;
      k = paramInt3 + 1;
      m = j >>> 12 & 0x3F;
      m = arrayOfByte[m];
      paramArrayOfByte2[k] = m;
      k = paramInt3 + 2;
      j = j >>> 6 & 0x3F;
      j = arrayOfByte[j];
      paramArrayOfByte2[k] = j;
      j = paramInt3 + 3;
      paramArrayOfByte2[j] = i;
      continue;
      k = j >>> 18;
      k = arrayOfByte[k];
      paramArrayOfByte2[paramInt3] = k;
      k = paramInt3 + 1;
      j = j >>> 12 & 0x3F;
      j = arrayOfByte[j];
      paramArrayOfByte2[k] = j;
      j = paramInt3 + 2;
      paramArrayOfByte2[j] = i;
      j = paramInt3 + 3;
      paramArrayOfByte2[j] = i;
    }
  }
  
  public static String encodeBytes(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return encodeBytes(paramArrayOfByte, 0, i);
  }
  
  public static String encodeBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    arrayOfByte = encodeBytesToBytes(paramArrayOfByte, paramInt1, paramInt2);
    try
    {
      str1 = new java/lang/String;
      String str3 = "US-ASCII";
      str1.<init>(arrayOfByte, str3);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        String str2 = new java/lang/String;
        str2.<init>(arrayOfByte);
      }
    }
    return str1;
  }
  
  public static byte[] encodeBytesToBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 3;
    Object localObject1 = null;
    if (paramArrayOfByte == null)
    {
      localObject2 = new java/lang/NullPointerException;
      ((NullPointerException)localObject2).<init>("Cannot serialize a null array.");
      throw ((Throwable)localObject2);
    }
    if (paramInt1 < 0)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Cannot have negative offset: " + paramInt1;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    if (paramInt2 < 0)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Cannot have length offset: " + paramInt2;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    int j = paramInt1 + paramInt2;
    int k = paramArrayOfByte.length;
    Object localObject3;
    if (j > k)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject3 = Locale.ENGLISH;
      Object[] arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt1);
      arrayOfObject[0] = localInteger;
      localInteger = Integer.valueOf(paramInt2);
      arrayOfObject[1] = localInteger;
      localInteger = Integer.valueOf(paramArrayOfByte.length);
      arrayOfObject[2] = localInteger;
      localObject1 = String.format((Locale)localObject3, "Cannot have offset of %d and length of %d with array of length %d", arrayOfObject);
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    k = paramInt2 / 3 * 4;
    j = paramInt2 % 3;
    if (j > 0) {
      j = 4;
    }
    byte[] arrayOfByte;
    int m;
    for (;;)
    {
      arrayOfByte = new byte[j + k];
      m = paramInt2 + -2;
      j = 0;
      localObject2 = null;
      k = 0;
      localObject3 = null;
      while (k < m)
      {
        int n = k + paramInt1;
        encode3to4(paramArrayOfByte, n, i, arrayOfByte, j);
        k += 3;
        j += 4;
      }
      j = 0;
      localObject2 = null;
    }
    if (k < paramInt2)
    {
      m = k + paramInt1;
      k = paramInt2 - k;
      encode3to4(paramArrayOfByte, m, k, arrayOfByte, j);
      j += 4;
    }
    k = arrayOfByte.length + -1;
    if (j <= k)
    {
      localObject3 = new byte[j];
      System.arraycopy(arrayOfByte, 0, localObject3, 0, j);
    }
    for (Object localObject2 = localObject3;; localObject2 = arrayOfByte) {
      return (byte[])localObject2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$Base64.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */