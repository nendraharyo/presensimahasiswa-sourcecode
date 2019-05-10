package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;
import java.io.UnsupportedEncodingException;

public class e
  extends Service
  implements LocationListener
{
  private static final byte[] a;
  
  static
  {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[0] = 48;
    arrayOfByte[1] = 49;
    arrayOfByte[2] = 50;
    arrayOfByte[3] = 51;
    arrayOfByte[4] = 52;
    arrayOfByte[5] = 53;
    arrayOfByte[6] = 54;
    arrayOfByte[7] = 55;
    arrayOfByte[8] = 56;
    arrayOfByte[9] = 57;
    arrayOfByte[10] = 97;
    arrayOfByte[11] = 98;
    arrayOfByte[12] = 99;
    arrayOfByte[13] = 100;
    arrayOfByte[14] = 101;
    arrayOfByte[15] = 102;
    a = arrayOfByte;
  }
  
  public static String a(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    }
    for (;;)
    {
      return str;
      str = "Januari";
      continue;
      str = "Februari";
      continue;
      str = "Maret";
      continue;
      str = "April";
      continue;
      str = "Mei";
      continue;
      str = "Juni";
      continue;
      str = "Juli";
      continue;
      str = "Agustus";
      continue;
      str = "September";
      continue;
      str = "Oktober";
      continue;
      str = "November";
      continue;
      str = "Desember";
    }
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    byte[] arrayOfByte1 = new byte[2];
    int i = paramArrayOfByte.length;
    int j = 0;
    for (;;)
    {
      if (j >= i) {
        break label158;
      }
      int k = paramArrayOfByte[j] & 0xFF;
      int m = 1;
      byte[] arrayOfByte2 = a;
      int n = k >>> 4;
      int i1 = arrayOfByte2[n];
      arrayOfByte1[0] = i1;
      arrayOfByte2 = a;
      k &= 0xF;
      k = arrayOfByte2[k];
      arrayOfByte1[m] = k;
      try
      {
        str1 = new java/lang/String;
        String str3 = "ASCII";
        str1.<init>(arrayOfByte1, str3);
        localStringBuffer.append(str1);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          String str1;
          String str2 = new java/lang/String;
          str2.<init>(arrayOfByte1);
          localStringBuffer.append(str2);
        }
      }
      if (paramBoolean)
      {
        str1 = " ";
        localStringBuffer.append(str1);
      }
      j += 1;
    }
    label158:
    return localStringBuffer.toString().toUpperCase();
  }
  
  public static byte[] a(String paramString)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    if (paramString == null) {}
    for (;;)
    {
      return arrayOfByte;
      int j = paramString.length();
      int k = 2;
      if (j >= k)
      {
        i = paramString.length();
        k = i / 2;
        arrayOfByte = new byte[k];
        j = 0;
        while (j < k)
        {
          int m = j * 2;
          int n = j * 2 + 2;
          String str = paramString.substring(m, n);
          n = 16;
          m = (byte)Integer.parseInt(str, n);
          arrayOfByte[j] = m;
          j += 1;
        }
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onLocationChanged(Location paramLocation) {}
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */