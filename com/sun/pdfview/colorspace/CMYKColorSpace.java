package com.sun.pdfview.colorspace;

import android.graphics.Color;

public class CMYKColorSpace
  extends PDFColorSpace
{
  public String getName()
  {
    return "CMYK";
  }
  
  public int getNumComponents()
  {
    return 4;
  }
  
  public int getType()
  {
    return 2;
  }
  
  public int toColor(float[] paramArrayOfFloat)
  {
    float f1 = 1.0F;
    float f2 = paramArrayOfFloat[3];
    f2 = (f1 - f2) * 255.0F;
    float f3 = paramArrayOfFloat[0];
    f3 = (f1 - f3) * f2;
    float f4 = paramArrayOfFloat[1];
    f4 = (f1 - f4) * f2;
    float f5 = paramArrayOfFloat[2];
    f5 = f1 - f5;
    f2 *= f5;
    int i = (int)f3;
    int j = (int)f4;
    int k = (int)f2;
    return Color.rgb(i, j, k);
  }
  
  public int toColor(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[3];
    i = 255 - i;
    int j = paramArrayOfInt[0];
    j = (255 - j) * i / 255;
    int k = paramArrayOfInt[1];
    k = (255 - k) * i / 255;
    int m = paramArrayOfInt[2];
    m = 255 - m;
    i = i * m / 255;
    return Color.rgb(j, k, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\colorspace\CMYKColorSpace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */