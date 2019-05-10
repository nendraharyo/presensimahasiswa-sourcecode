package com.google.android.gms.common;

import com.google.android.gms.common.internal.zzx;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzd$zza
{
  private int zzafG;
  
  protected zzd$zza(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int k = 25;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      zzx.zzb(i, "cert hash data has incorrect length");
      j = Arrays.hashCode(paramArrayOfByte);
      this.zzafG = j;
      return;
    }
  }
  
  protected static byte[] zzcs(String paramString)
  {
    String str = "ISO-8859-1";
    try
    {
      return paramString.getBytes(str);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localUnsupportedEncodingException);
      throw localAssertionError;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    byte[] arrayOfByte1;
    if (paramObject != null)
    {
      bool = paramObject instanceof zza;
      if (bool) {}
    }
    else
    {
      bool = false;
      arrayOfByte1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (zza)paramObject;
      arrayOfByte1 = getBytes();
      byte[] arrayOfByte2 = ((zza)paramObject).getBytes();
      bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
    }
  }
  
  abstract byte[] getBytes();
  
  public int hashCode()
  {
    return this.zzafG;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */