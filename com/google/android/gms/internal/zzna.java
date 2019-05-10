package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzna
{
  public static long zza(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
  {
    return zza(paramInputStream, paramOutputStream, paramBoolean, 1024);
  }
  
  public static long zza(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    long l1 = 0L;
    for (;;)
    {
      int i = 0;
      try
      {
        int j = arrayOfByte.length;
        i = paramInputStream.read(arrayOfByte, 0, j);
        j = -1;
        if (i != j)
        {
          long l2 = i;
          l1 += l2;
          j = 0;
          paramOutputStream.write(arrayOfByte, 0, i);
        }
      }
      finally
      {
        if (paramBoolean)
        {
          zzb(paramInputStream);
          zzb(paramOutputStream);
        }
      }
    }
    if (paramBoolean)
    {
      zzb(paramInputStream);
      zzb(paramOutputStream);
    }
    return l1;
  }
  
  public static void zza(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor != null) {}
    try
    {
      paramParcelFileDescriptor.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static byte[] zza(InputStream paramInputStream, boolean paramBoolean)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    zza(paramInputStream, localByteArrayOutputStream, paramBoolean);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static void zzb(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static byte[] zzk(InputStream paramInputStream)
  {
    return zza(paramInputStream, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzna.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */