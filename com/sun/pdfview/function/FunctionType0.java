package com.sun.pdfview.function;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.io.PrintStream;
import java.lang.reflect.Array;

public class FunctionType0
  extends PDFFunction
{
  protected static final int CUBIC_INTERPOLATION = 3;
  protected static final int LINEAR_INTERPOLATION = 1;
  private int bitsPerSample;
  private float[] decode;
  private float[] encode;
  private int order = 1;
  private int[][] samples;
  private int[] size;
  
  protected FunctionType0()
  {
    super(0);
  }
  
  private float getSample(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramArrayOfFloat.length];
    int i = 0;
    int j = arrayOfInt.length;
    if (i >= j) {
      return getSample(arrayOfInt, paramInt2);
    }
    float f = Float.MIN_VALUE;
    j = 1 << i & paramInt1;
    double d;
    if (j == 0)
    {
      f = paramArrayOfFloat[i];
      d = Math.floor(f);
      j = (int)d;
      arrayOfInt[i] = j;
    }
    for (;;)
    {
      i += 1;
      break;
      f = paramArrayOfFloat[i];
      d = Math.ceil(f);
      j = (int)d;
      arrayOfInt[i] = j;
    }
  }
  
  public static float interpolate(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    float f1 = paramFloat5 - paramFloat4;
    float f2 = paramFloat3 - paramFloat2;
    f1 /= f2;
    f2 = paramFloat1 - paramFloat2;
    return f1 * f2 + paramFloat4;
  }
  
  private float multicubicInterpolate(float[] paramArrayOfFloat, int paramInt)
  {
    System.out.println("Cubic interpolation not supported!");
    return multilinearInterpolate(paramArrayOfFloat, paramInt);
  }
  
  private float multilinearInterpolate(float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = -1.0F;
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    int i = 0;
    float f2 = 0.0F;
    float f3;
    float f4;
    int k;
    for (;;)
    {
      int j = arrayOfFloat.length;
      if (i >= j)
      {
        f2 = getSample(paramArrayOfFloat, 0, paramInt);
        f3 = f2;
        f4 = f2;
        k = 0;
        f5 = 0.0F;
        i = 0;
        f2 = 0.0F;
        m = arrayOfFloat.length;
        if (i < m) {
          break;
        }
        return f4;
      }
      double d1 = paramArrayOfFloat[i];
      float f5 = paramArrayOfFloat[i];
      double d2 = Math.floor(f5);
      d1 -= d2;
      f3 = (float)d1;
      arrayOfFloat[i] = f3;
      i += 1;
    }
    int m = 0;
    float f6 = 0.0F;
    float f7 = f1;
    int n = 0;
    for (;;)
    {
      int i1 = arrayOfFloat.length;
      if (m >= i1)
      {
        m = 1 << n;
        k |= m;
        f6 = getSample(paramArrayOfFloat, k, paramInt);
        f7 = arrayOfFloat[n];
        f3 = (f6 - f3) * f7 + f4;
        arrayOfFloat[n] = f1;
        i += 1;
        f4 = f3;
        break;
      }
      float f8 = arrayOfFloat[m];
      boolean bool = f8 < f7;
      if (bool)
      {
        f7 = arrayOfFloat[m];
        n = m;
      }
      m += 1;
    }
  }
  
  private int[][] readSamples(b paramb)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    int k = getNumInputs();
    if (j >= k)
    {
      j = getNumOutputs();
      localObject1 = new int[] { i, j };
      localObject1 = (int[][])Array.newInstance(Integer.TYPE, (int[])localObject1);
      m = 0;
      n = 0;
      k = 0;
      i = 0;
    }
    int i1;
    for (;;)
    {
      i1 = getNumInputs();
      if (i >= i1)
      {
        return (int[][])localObject1;
        k = getSize(j);
        i *= k;
        j += 1;
        break;
      }
      i1 = 0;
      i2 = getSize(i);
      if (i1 < i2) {
        break label119;
      }
      i += 1;
    }
    label119:
    int i3 = 0;
    int i2 = m;
    int m = n;
    int n = 0;
    int i4;
    int i6;
    Object localObject2;
    for (;;)
    {
      i4 = getNumOutputs();
      if (n >= i4)
      {
        n = k + 1;
        i1 += 1;
        k = n;
        n = m;
        m = i2;
        break;
      }
      i5 = getBitsPerSample();
      i4 = paramb.b(m);
      i3 = i5;
      i5 = 0;
      i6 = i3;
      if (i6 > 0) {
        break label226;
      }
      localObject2 = localObject1[k];
      localObject2[n] = i5;
      n += 1;
    }
    label226:
    int i7 = 7 - i2;
    i7 = i4 >> i7 & 0x1;
    int i8 = i6 + -1;
    i7 = i7 << i8 | i5;
    i2 += 1;
    int i5 = 8;
    if (i2 == i5)
    {
      i5 = 0;
      i2 = m + 1;
      m = 1;
      if (i6 > m)
      {
        m = paramb.b(i2);
        i4 = 0;
        localObject2 = null;
      }
    }
    for (;;)
    {
      i6 += -1;
      i5 = i7;
      i3 = m;
      m = i2;
      i2 = i4;
      i4 = i3;
      break;
      m = i4;
      i4 = 0;
      localObject2 = null;
      continue;
      i3 = i4;
      i4 = i2;
      i2 = m;
      m = i3;
    }
  }
  
  protected void doFunction(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    int i = 0;
    float[] arrayOfFloat = new float[getNumInputs()];
    int j = 0;
    int k = getNumInputs();
    if (j >= k)
    {
      j = 0;
      k = getNumOutputs();
      if (j < k) {
        break label219;
      }
    }
    for (;;)
    {
      j = paramArrayOfFloat2.length;
      if (i >= j)
      {
        return;
        k = j + paramInt1;
        f1 = paramArrayOfFloat1[k];
        m = j * 2;
        f2 = getDomain(m);
        n = j * 2 + 1;
        f3 = getDomain(n);
        int i1 = j * 2;
        float f4 = getEncode(i1);
        int i2 = j * 2 + 1;
        float f5 = getEncode(i2);
        f1 = interpolate(f1, f2, f3, f4, f5);
        arrayOfFloat[j] = f1;
        f1 = Math.max(arrayOfFloat[j], 0.0F);
        arrayOfFloat[j] = f1;
        f1 = arrayOfFloat[j];
        int[] arrayOfInt = this.size;
        m = arrayOfInt[j] + -1;
        f2 = m;
        f1 = Math.min(f1, f2);
        arrayOfFloat[j] = f1;
        j += 1;
        break;
        label219:
        k = getOrder();
        m = 1;
        f2 = Float.MIN_VALUE;
        if (k == m)
        {
          k = j + paramInt2;
          f2 = multilinearInterpolate(arrayOfFloat, j);
          paramArrayOfFloat2[k] = f2;
        }
        for (;;)
        {
          j += 1;
          break;
          k = j + paramInt2;
          f2 = multicubicInterpolate(arrayOfFloat, j);
          paramArrayOfFloat2[k] = f2;
        }
      }
      j = i + paramInt2;
      int i3 = i + paramInt2;
      float f6 = paramArrayOfFloat2[i3];
      k = getBitsPerSample();
      double d1 = k;
      double d2 = Math.pow(2.0D, d1);
      float f1 = (float)d2 - 1.0F;
      int m = i * 2;
      float f2 = getDecode(m);
      int n = i * 2 + 1;
      float f3 = getDecode(n);
      f6 = interpolate(f6, 0.0F, f1, f2, f3);
      paramArrayOfFloat2[j] = f6;
      i += 1;
    }
  }
  
  protected int getBitsPerSample()
  {
    return this.bitsPerSample;
  }
  
  protected float getDecode(int paramInt)
  {
    float[] arrayOfFloat = this.decode;
    if (arrayOfFloat != null) {
      arrayOfFloat = this.decode;
    }
    for (float f = arrayOfFloat[paramInt];; f = getRange(paramInt)) {
      return f;
    }
  }
  
  protected float getEncode(int paramInt)
  {
    float[] arrayOfFloat = this.encode;
    float f;
    if (arrayOfFloat != null)
    {
      arrayOfFloat = this.encode;
      f = arrayOfFloat[paramInt];
    }
    for (;;)
    {
      return f;
      int i = paramInt % 2;
      if (i == 0)
      {
        i = 0;
        f = 0.0F;
        arrayOfFloat = null;
      }
      else
      {
        i = paramInt / 2;
        i = getSize(i) + -1;
        f = i;
      }
    }
  }
  
  protected int getOrder()
  {
    return this.order;
  }
  
  protected int getSample(int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    int j = 1;
    int k = 0;
    for (;;)
    {
      int m = paramArrayOfInt.length;
      if (i >= m) {
        return this.samples[k][paramInt];
      }
      m = paramArrayOfInt[i] * j;
      k += m;
      m = getSize(i);
      j *= m;
      i += 1;
    }
  }
  
  protected int getSize(int paramInt)
  {
    return this.size[paramInt];
  }
  
  protected void parse(PDFObject paramPDFObject)
  {
    int i = 0;
    Object localObject1 = paramPDFObject.getDictRef("Size");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Size required for function type 0!");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = ((PDFObject)localObject1).getArray();
    Object localObject3 = new int[localObject2.length];
    int j = 0;
    localObject1 = null;
    int k;
    Object localObject4;
    for (;;)
    {
      k = localObject2.length;
      if (j >= k)
      {
        setSize((int[])localObject3);
        localObject1 = paramPDFObject.getDictRef("BitsPerSample");
        if (localObject1 != null) {
          break;
        }
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("BitsPerSample required for function type 0!");
        throw ((Throwable)localObject1);
      }
      localObject4 = localObject2[j];
      k = ((PDFObject)localObject4).getIntValue();
      localObject3[j] = k;
      j += 1;
    }
    j = ((PDFObject)localObject1).getIntValue();
    setBitsPerSample(j);
    localObject1 = paramPDFObject.getDictRef("Order");
    if (localObject1 != null)
    {
      j = ((PDFObject)localObject1).getIntValue();
      setOrder(j);
    }
    localObject1 = paramPDFObject.getDictRef("Encode");
    if (localObject1 != null)
    {
      localObject2 = ((PDFObject)localObject1).getArray();
      localObject3 = new float[localObject2.length];
      j = 0;
      localObject1 = null;
      k = localObject2.length;
      if (j >= k) {
        setEncode((float[])localObject3);
      }
    }
    else
    {
      localObject1 = paramPDFObject.getDictRef("Decode");
      if (localObject1 != null)
      {
        localObject1 = ((PDFObject)localObject1).getArray();
        int m = localObject1.length;
        localObject2 = new float[m];
      }
    }
    for (;;)
    {
      int n = localObject1.length;
      if (i >= n)
      {
        setDecode((float[])localObject2);
        localObject1 = paramPDFObject.getStreamBuffer();
        localObject1 = readSamples((b)localObject1);
        setSamples((int[][])localObject1);
        return;
        localObject4 = localObject2[j];
        float f1 = ((PDFObject)localObject4).getFloatValue();
        localObject3[j] = f1;
        j += 1;
        break;
      }
      localObject3 = localObject1[i];
      float f2 = ((PDFObject)localObject3).getFloatValue();
      localObject2[i] = f2;
      i += 1;
    }
  }
  
  protected void setBitsPerSample(int paramInt)
  {
    this.bitsPerSample = paramInt;
  }
  
  protected void setDecode(float[] paramArrayOfFloat)
  {
    this.decode = paramArrayOfFloat;
  }
  
  protected void setEncode(float[] paramArrayOfFloat)
  {
    this.encode = paramArrayOfFloat;
  }
  
  protected void setOrder(int paramInt)
  {
    this.order = paramInt;
  }
  
  protected void setSamples(int[][] paramArrayOfInt)
  {
    this.samples = paramArrayOfInt;
  }
  
  protected void setSize(int[] paramArrayOfInt)
  {
    this.size = paramArrayOfInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */