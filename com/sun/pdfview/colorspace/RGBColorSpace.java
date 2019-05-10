package com.sun.pdfview.colorspace;

import android.graphics.Color;

public class RGBColorSpace
  extends PDFColorSpace
{
  public String getName()
  {
    return "RGB";
  }
  
  public int getNumComponents()
  {
    return 3;
  }
  
  public int getType()
  {
    return 1;
  }
  
  public int toColor(float[] paramArrayOfFloat)
  {
    float f = 255.0F;
    int i = (int)(paramArrayOfFloat[0] * f);
    int j = (int)(paramArrayOfFloat[1] * f);
    int k = (int)(paramArrayOfFloat[2] * f);
    return Color.rgb(i, j, k);
  }
  
  public int toColor(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramArrayOfInt[2];
    return Color.rgb(i, j, k);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\colorspace\RGBColorSpace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */