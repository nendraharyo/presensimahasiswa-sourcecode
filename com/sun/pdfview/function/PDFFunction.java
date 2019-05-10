package com.sun.pdfview.function;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public abstract class PDFFunction
{
  public static final int TYPE_0 = 0;
  public static final int TYPE_2 = 2;
  public static final int TYPE_3 = 3;
  public static final int TYPE_4 = 4;
  private float[] domain;
  private float[] range;
  private int type;
  
  protected PDFFunction(int paramInt)
  {
    this.type = paramInt;
  }
  
  public static PDFFunction getFunction(PDFObject paramPDFObject)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    Object localObject1 = (float[])null;
    Object localObject2 = (float[])null;
    localObject1 = paramPDFObject.getDictRef("FunctionType");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No FunctionType specified in function!");
      throw ((Throwable)localObject1);
    }
    int m = ((PDFObject)localObject1).getIntValue();
    localObject1 = paramPDFObject.getDictRef("Domain");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No Domain specified in function!");
      throw ((Throwable)localObject1);
    }
    PDFObject[] arrayOfPDFObject = ((PDFObject)localObject1).getArray();
    float[] arrayOfFloat = new float[arrayOfPDFObject.length];
    k = 0;
    localObject1 = null;
    label100:
    int n = arrayOfPDFObject.length;
    if (k >= n)
    {
      localObject1 = paramPDFObject.getDictRef("Range");
      if (localObject1 != null)
      {
        arrayOfPDFObject = ((PDFObject)localObject1).getArray();
        i = arrayOfPDFObject.length;
        localObject2 = new float[i];
      }
    }
    for (;;)
    {
      n = arrayOfPDFObject.length;
      if (j >= n) {}
      switch (m)
      {
      case 1: 
      default: 
        localObject1 = new com/sun/pdfview/PDFParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Unsupported function type: ");
        localObject2 = m;
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        PDFObject localPDFObject = arrayOfPDFObject[k];
        float f = localPDFObject.getFloatValue();
        arrayOfFloat[k] = f;
        k += 1;
        break label100;
        localPDFObject = arrayOfPDFObject[j];
        f = localPDFObject.getFloatValue();
        localObject2[j] = f;
        j += 1;
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No Range specified in Type 0 Function!");
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/sun/pdfview/function/FunctionType0;
    ((FunctionType0)localObject1).<init>();
    for (;;)
    {
      ((PDFFunction)localObject1).setDomain(arrayOfFloat);
      if (localObject2 != null) {
        ((PDFFunction)localObject1).setRange((float[])localObject2);
      }
      ((PDFFunction)localObject1).parse(paramPDFObject);
      return (PDFFunction)localObject1;
      localObject1 = new com/sun/pdfview/function/FunctionType2;
      ((FunctionType2)localObject1).<init>();
      continue;
      localObject1 = new com/sun/pdfview/function/FunctionType3;
      ((FunctionType3)localObject1).<init>();
      continue;
      if (localObject1 == null)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("No Range specified in Type 4 Function!");
        throw ((Throwable)localObject1);
      }
      localObject1 = new com/sun/pdfview/function/FunctionType4;
      ((FunctionType4)localObject1).<init>();
    }
  }
  
  public float[] calculate(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[getNumOutputs()];
    calculate(paramArrayOfFloat, 0, arrayOfFloat, 0);
    return arrayOfFloat;
  }
  
  public float[] calculate(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    int i = 0;
    int j = paramArrayOfFloat1.length - paramInt1;
    int k = getNumInputs();
    if (j < k)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Wrong number of inputs to function!");
      throw ((Throwable)localObject);
    }
    Object localObject = this.range;
    if (localObject != null)
    {
      j = paramArrayOfFloat2.length - paramInt2;
      k = getNumOutputs();
      if (j < k)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Wrong number of outputs for function!");
        throw ((Throwable)localObject);
      }
    }
    j = 0;
    localObject = null;
    float f1 = 0.0F;
    k = paramArrayOfFloat1.length;
    if (j >= k) {
      doFunction(paramArrayOfFloat1, paramInt1, paramArrayOfFloat2, paramInt2);
    }
    for (;;)
    {
      localObject = this.range;
      if (localObject != null)
      {
        j = paramArrayOfFloat2.length;
        if (i < j) {}
      }
      else
      {
        return paramArrayOfFloat2;
        f2 = paramArrayOfFloat1[j];
        int m = j * 2;
        float f3 = getDomain(m);
        f2 = Math.max(f2, f3);
        paramArrayOfFloat1[j] = f2;
        f2 = paramArrayOfFloat1[j];
        m = j * 2 + 1;
        f3 = getDomain(m);
        f2 = Math.min(f2, f3);
        paramArrayOfFloat1[j] = f2;
        j += 1;
        break;
      }
      f1 = paramArrayOfFloat2[i];
      k = i * 2;
      float f2 = getRange(k);
      f1 = Math.max(f1, f2);
      paramArrayOfFloat2[i] = f1;
      f1 = paramArrayOfFloat2[i];
      k = i * 2 + 1;
      f2 = getRange(k);
      f1 = Math.min(f1, f2);
      paramArrayOfFloat2[i] = f1;
      i += 1;
    }
  }
  
  protected abstract void doFunction(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2);
  
  protected float getDomain(int paramInt)
  {
    return this.domain[paramInt];
  }
  
  public int getNumInputs()
  {
    return this.domain.length / 2;
  }
  
  public int getNumOutputs()
  {
    float[] arrayOfFloat = this.range;
    int i;
    if (arrayOfFloat == null)
    {
      i = 0;
      arrayOfFloat = null;
    }
    for (;;)
    {
      return i;
      arrayOfFloat = this.range;
      i = arrayOfFloat.length / 2;
    }
  }
  
  protected float getRange(int paramInt)
  {
    float[] arrayOfFloat = this.range;
    int i;
    float f;
    if (arrayOfFloat == null)
    {
      i = paramInt % 2;
      if (i == 0)
      {
        i = 1;
        f = Float.MIN_VALUE;
      }
    }
    for (;;)
    {
      return f;
      i = 2139095039;
      f = Float.MAX_VALUE;
      continue;
      arrayOfFloat = this.range;
      f = arrayOfFloat[paramInt];
    }
  }
  
  public int getType()
  {
    return this.type;
  }
  
  protected abstract void parse(PDFObject paramPDFObject);
  
  protected void setDomain(float[] paramArrayOfFloat)
  {
    this.domain = paramArrayOfFloat;
  }
  
  protected void setRange(float[] paramArrayOfFloat)
  {
    this.range = paramArrayOfFloat;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\PDFFunction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */