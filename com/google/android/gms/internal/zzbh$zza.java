package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class zzbh$zza
{
  ByteArrayOutputStream zztu;
  Base64OutputStream zztv;
  
  public zzbh$zza()
  {
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>(4096);
    this.zztu = ((ByteArrayOutputStream)localObject);
    localObject = new android/util/Base64OutputStream;
    ByteArrayOutputStream localByteArrayOutputStream = this.zztu;
    ((Base64OutputStream)localObject).<init>(localByteArrayOutputStream, 10);
    this.zztv = ((Base64OutputStream)localObject);
  }
  
  public String toString()
  {
    try
    {
      localObject1 = this.zztv;
      ((Base64OutputStream)localObject1).close();
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        Object localObject1;
        label38:
        str2 = "HashManager: Unable to convert to Base64.";
        zzin.zzb(str2, localIOException1);
      }
    }
    try
    {
      localObject1 = this.zztu;
      ((ByteArrayOutputStream)localObject1).close();
      localObject1 = this.zztu;
      localObject1 = ((ByteArrayOutputStream)localObject1).toString();
    }
    catch (IOException localIOException2)
    {
      str2 = "HashManager: Unable to convert to Base64.";
      zzin.zzb(str2, localIOException2);
      String str1 = "";
      this.zztu = null;
      this.zztv = null;
      break label38;
    }
    finally
    {
      this.zztu = null;
      this.zztv = null;
    }
    return (String)localObject1;
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.zztv.write(paramArrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */