package com.sun.pdfview.function;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public class FunctionType2
  extends PDFFunction
{
  private float[] c0;
  private float[] c1;
  private float n;
  
  public FunctionType2()
  {
    super(2);
    float[] arrayOfFloat = new float[i];
    arrayOfFloat[0] = 0.0F;
    this.c0 = arrayOfFloat;
    arrayOfFloat = new float[i];
    arrayOfFloat[0] = 1.0F;
    this.c1 = arrayOfFloat;
  }
  
  protected void doFunction(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    float f1 = paramArrayOfFloat1[paramInt1];
    int i = 0;
    for (;;)
    {
      int j = getNumOutputs();
      if (i >= j) {
        return;
      }
      j = i + paramInt2;
      float f2 = getC0(i);
      double d1 = f1;
      double d2 = getN();
      d1 = Math.pow(d1, d2);
      float f3 = getC1(i);
      float f4 = getC0(i);
      f3 -= f4;
      d2 = f3;
      d1 *= d2;
      float f5 = (float)d1;
      f2 += f5;
      paramArrayOfFloat2[j] = f2;
      i += 1;
    }
  }
  
  public float getC0(int paramInt)
  {
    return this.c0[paramInt];
  }
  
  public float getC1(int paramInt)
  {
    return this.c1[paramInt];
  }
  
  public float getN()
  {
    return this.n;
  }
  
  protected void parse(PDFObject paramPDFObject)
  {
    int i = 0;
    Object localObject1 = paramPDFObject.getDictRef("N");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Exponent required for function type 2!");
      throw ((Throwable)localObject1);
    }
    float f1 = ((PDFObject)localObject1).getFloatValue();
    setN(f1);
    localObject1 = paramPDFObject.getDictRef("C0");
    Object localObject2;
    float[] arrayOfFloat;
    int j;
    if (localObject1 != null)
    {
      localObject2 = ((PDFObject)localObject1).getArray();
      arrayOfFloat = new float[localObject2.length];
      j = 0;
      localObject1 = null;
      f1 = 0.0F;
      int k = localObject2.length;
      if (j >= k) {
        setC0(arrayOfFloat);
      }
    }
    else
    {
      localObject1 = paramPDFObject.getDictRef("C1");
      if (localObject1 != null)
      {
        localObject1 = ((PDFObject)localObject1).getArray();
        int m = localObject1.length;
        localObject2 = new float[m];
      }
    }
    for (;;)
    {
      int i1 = localObject1.length;
      if (i >= i1)
      {
        setC1((float[])localObject2);
        return;
        Object localObject3 = localObject2[j];
        float f2 = ((PDFObject)localObject3).getFloatValue();
        arrayOfFloat[j] = f2;
        j += 1;
        break;
      }
      arrayOfFloat = localObject1[i];
      float f3 = arrayOfFloat.getFloatValue();
      localObject2[i] = f3;
      i += 1;
    }
  }
  
  protected void setC0(float[] paramArrayOfFloat)
  {
    this.c0 = paramArrayOfFloat;
  }
  
  protected void setC1(float[] paramArrayOfFloat)
  {
    this.c1 = paramArrayOfFloat;
  }
  
  protected void setN(float paramFloat)
  {
    this.n = paramFloat;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */