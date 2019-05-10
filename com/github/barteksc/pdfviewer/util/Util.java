package com.github.barteksc.pdfviewer.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Util
{
  private static final int DEFAULT_BUFFER_SIZE = 4096;
  
  public static int getDP(Context paramContext, int paramInt)
  {
    float f = paramInt;
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)TypedValue.applyDimension(1, f, localDisplayMetrics);
  }
  
  public static byte[] toByteArray(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    int i = 4096;
    byte[] arrayOfByte = new byte[i];
    for (;;)
    {
      int j = -1;
      int k = paramInputStream.read(arrayOfByte);
      if (j == k) {
        break;
      }
      j = 0;
      localByteArrayOutputStream.write(arrayOfByte, 0, k);
    }
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewe\\util\Util.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */