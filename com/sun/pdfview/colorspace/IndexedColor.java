package com.sun.pdfview.colorspace;

import com.sun.pdfview.PDFObject;

public class IndexedColor
  extends PDFColorSpace
{
  int count;
  int[] table;
  
  public IndexedColor(PDFColorSpace paramPDFColorSpace, int paramInt, PDFObject paramPDFObject)
  {
    int i = paramInt + 1;
    this.count = i;
    byte[] arrayOfByte = paramPDFObject.getStream();
    int j = paramPDFColorSpace.getNumComponents();
    int k = arrayOfByte.length / j;
    if (k < i) {}
    int[] arrayOfInt1 = new int[i];
    this.table = arrayOfInt1;
    float[] arrayOfFloat = new float[j];
    int m = 0;
    j = 0;
    int[] arrayOfInt2 = null;
    for (;;)
    {
      if (m >= i) {
        return;
      }
      k = j;
      j = 0;
      arrayOfInt2 = null;
      n = arrayOfFloat.length;
      if (j < n) {
        break;
      }
      arrayOfInt2 = this.table;
      n = paramPDFColorSpace.toColor(arrayOfFloat);
      arrayOfInt2[m] = n;
      m += 1;
      j = k;
    }
    int n = arrayOfByte.length;
    if (k < n)
    {
      n = k + 1;
      float f1 = arrayOfByte[k] & 0xFF;
      float f2 = 255.0F;
      f1 /= f2;
      arrayOfFloat[j] = f1;
      k = n;
    }
    for (;;)
    {
      j += 1;
      break;
      n = 1065353216;
      float f3 = 1.0F;
      arrayOfFloat[j] = f3;
    }
  }
  
  public IndexedColor(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    this.count = i;
    this.table = paramArrayOfInt;
  }
  
  public int[] getColorTable()
  {
    return this.table;
  }
  
  public int getCount()
  {
    return this.count;
  }
  
  public String getName()
  {
    return "I";
  }
  
  public int getNumComponents()
  {
    return 1;
  }
  
  public int getType()
  {
    return 4;
  }
  
  public int toColor(float[] paramArrayOfFloat)
  {
    int[] arrayOfInt = this.table;
    float f = paramArrayOfFloat[0];
    int i = (int)(255.0F * f);
    return arrayOfInt[i];
  }
  
  public int toColor(int[] paramArrayOfInt)
  {
    int[] arrayOfInt = this.table;
    int i = paramArrayOfInt[0];
    return arrayOfInt[i];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\colorspace\IndexedColor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */