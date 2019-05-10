package com.sun.pdfview.function;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public class FunctionType3
  extends PDFFunction
{
  private int[][] samples;
  
  protected FunctionType3()
  {
    super(3);
  }
  
  protected void doFunction(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    new float[getNumInputs()];
    int i = 0;
    for (;;)
    {
      int j = getNumOutputs();
      if (i >= j) {
        return;
      }
      i += 1;
    }
  }
  
  protected void parse(PDFObject paramPDFObject)
  {
    int i = 0;
    Object localObject1 = paramPDFObject.getDictRef("Functions");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Functions required for function type 3!");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = ((PDFObject)localObject1).getArray();
    int[] arrayOfInt = new int[localObject2.length];
    int j = 0;
    localObject1 = null;
    int k;
    Object localObject3;
    for (;;)
    {
      k = localObject2.length;
      if (j >= k)
      {
        localObject1 = paramPDFObject.getDictRef("Bounds");
        if (localObject1 != null) {
          break;
        }
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Bounds required for function type 3!");
        throw ((Throwable)localObject1);
      }
      localObject3 = localObject2[j];
      k = ((PDFObject)localObject3).getIntValue();
      arrayOfInt[j] = k;
      j += 1;
    }
    localObject2 = ((PDFObject)localObject1).getArray();
    arrayOfInt = new int[localObject2.length];
    j = 0;
    localObject1 = null;
    for (;;)
    {
      k = localObject2.length;
      if (j >= k)
      {
        localObject1 = paramPDFObject.getDictRef("Encode");
        if (localObject1 == null) {
          break;
        }
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Encode required for function type 3!");
        throw ((Throwable)localObject1);
      }
      localObject3 = localObject2[j];
      k = ((PDFObject)localObject3).getIntValue();
      arrayOfInt[j] = k;
      j += 1;
    }
    localObject1 = ((PDFObject)localObject1).getArray();
    int m = localObject1.length;
    localObject2 = new float[m];
    for (;;)
    {
      int n = localObject1.length;
      if (i >= n)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Unsupported function type 3.");
        throw ((Throwable)localObject1);
      }
      arrayOfInt = localObject1[i];
      float f = arrayOfInt.getFloatValue();
      localObject2[i] = f;
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\function\FunctionType3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */