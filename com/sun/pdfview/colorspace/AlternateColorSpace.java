package com.sun.pdfview.colorspace;

import android.graphics.Color;
import com.sun.pdfview.function.PDFFunction;

public class AlternateColorSpace
  extends PDFColorSpace
{
  private PDFColorSpace alternate;
  private PDFFunction function;
  
  public AlternateColorSpace(PDFColorSpace paramPDFColorSpace, PDFFunction paramPDFFunction)
  {
    this.alternate = paramPDFColorSpace;
    this.function = paramPDFFunction;
  }
  
  public String getName()
  {
    return "ALTERNATE";
  }
  
  public int getNumComponents()
  {
    Object localObject = this.function;
    if (localObject != null) {
      localObject = this.function;
    }
    for (int i = ((PDFFunction)localObject).getNumInputs();; i = ((PDFColorSpace)localObject).getNumComponents())
    {
      return i;
      localObject = this.alternate;
    }
  }
  
  public int getType()
  {
    return 5;
  }
  
  public int toColor(float[] paramArrayOfFloat)
  {
    float f1 = 1.0F;
    PDFFunction localPDFFunction = this.function;
    if (localPDFFunction != null)
    {
      localPDFFunction = this.function;
      paramArrayOfFloat = localPDFFunction.calculate(paramArrayOfFloat);
    }
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
    float[] arrayOfFloat = new float[paramArrayOfInt.length];
    int i = 0;
    for (;;)
    {
      int j = arrayOfFloat.length;
      if (i >= j) {
        return toColor(arrayOfFloat);
      }
      j = paramArrayOfInt[i] / 255;
      float f = j;
      arrayOfFloat[i] = f;
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\colorspace\AlternateColorSpace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */