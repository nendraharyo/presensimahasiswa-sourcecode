package com.google.android.gms.tagmanager;

public class zzk
{
  public static byte[] zzfO(String paramString)
  {
    int i = 16;
    int j = -1;
    int k = paramString.length();
    int m = k % 2;
    if (m != 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("purported base16 string has odd number of characters");
      throw localIllegalArgumentException;
    }
    byte[] arrayOfByte = new byte[k / 2];
    m = 0;
    IllegalArgumentException localIllegalArgumentException = null;
    while (m < k)
    {
      int n = Character.digit(paramString.charAt(m), i);
      int i1 = m + 1;
      i1 = Character.digit(paramString.charAt(i1), i);
      if ((n == j) || (i1 == j))
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("purported base16 string has illegal char");
        throw localIllegalArgumentException;
      }
      int i2 = m / 2;
      n = (byte)((n << 4) + i1);
      arrayOfByte[i2] = n;
      m += 2;
    }
    return arrayOfByte;
  }
  
  public static String zzj(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = paramArrayOfByte.length;
    int j = 0;
    while (j < i)
    {
      int k = paramArrayOfByte[j];
      int m = k & 0xF0;
      if (m == 0)
      {
        String str1 = "0";
        localStringBuilder.append(str1);
      }
      k &= 0xFF;
      String str2 = Integer.toHexString(k);
      localStringBuilder.append(str2);
      j += 1;
    }
    return localStringBuilder.toString().toUpperCase();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */