package com.loopj.android.http;

import java.io.UnsupportedEncodingException;

public class Base64
{
  public static final int CRLF = 4;
  public static final int DEFAULT = 0;
  public static final int NO_CLOSE = 16;
  public static final int NO_PADDING = 1;
  public static final int NO_WRAP = 2;
  public static final int URL_SAFE = 8;
  
  public static byte[] decode(String paramString, int paramInt)
  {
    return decode(paramString.getBytes(), paramInt);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    return decode(paramArrayOfByte, 0, i, paramInt);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Base64.Decoder localDecoder = new com/loopj/android/http/Base64$Decoder;
    Object localObject = new byte[paramInt2 * 3 / 4];
    localDecoder.<init>(paramInt3, (byte[])localObject);
    boolean bool = localDecoder.process(paramArrayOfByte, paramInt1, paramInt2, true);
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("bad base-64");
      throw ((Throwable)localObject);
    }
    int i = localDecoder.op;
    byte[] arrayOfByte = localDecoder.output;
    int j = arrayOfByte.length;
    if (i == j) {
      localObject = localDecoder.output;
    }
    for (;;)
    {
      return (byte[])localObject;
      i = localDecoder.op;
      localObject = new byte[i];
      arrayOfByte = localDecoder.output;
      int k = localDecoder.op;
      System.arraycopy(arrayOfByte, 0, localObject, 0, k);
    }
  }
  
  public static byte[] encode(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    return encode(paramArrayOfByte, 0, i, paramInt);
  }
  
  public static byte[] encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    Base64.Encoder localEncoder = new com/loopj/android/http/Base64$Encoder;
    byte[] arrayOfByte = null;
    localEncoder.<init>(paramInt3, null);
    int j = paramInt2 / 3 * 4;
    boolean bool1 = localEncoder.do_padding;
    int n;
    if (bool1)
    {
      int k = paramInt2 % 3;
      if (k > 0) {
        j += 4;
      }
      boolean bool2 = localEncoder.do_newline;
      if ((bool2) && (paramInt2 > 0))
      {
        n = (paramInt2 + -1) / 57 + 1;
        bool2 = localEncoder.do_cr;
        if (!bool2) {
          break label193;
        }
      }
    }
    label193:
    for (int m = 2;; m = i)
    {
      m *= n;
      j += m;
      arrayOfByte = new byte[j];
      localEncoder.output = arrayOfByte;
      localEncoder.process(paramArrayOfByte, paramInt1, paramInt2, i);
      return localEncoder.output;
      m = paramInt2 % 3;
      switch (m)
      {
      case 0: 
      default: 
        break;
      case 1: 
        j += 2;
        break;
      case 2: 
        j += 3;
        break;
      }
    }
  }
  
  public static String encodeToString(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      String str1 = new java/lang/String;
      localObject = encode(paramArrayOfByte, paramInt);
      String str2 = "US-ASCII";
      str1.<init>((byte[])localObject, str2);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
  
  public static String encodeToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      String str1 = new java/lang/String;
      localObject = encode(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      String str2 = "US-ASCII";
      str1.<init>((byte[])localObject, str2);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\Base64.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */