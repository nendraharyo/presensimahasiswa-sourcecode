package com.sun.pdfview;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.RectF;

class PDFChangeStrokeCmd
  extends PDFCmd
{
  float[] ary;
  Paint.Cap cap;
  Paint.Join join;
  float limit;
  float phase;
  float w;
  
  public PDFChangeStrokeCmd()
  {
    this.w = f;
    Object localObject = PDFRenderer.NOCAP;
    this.cap = ((Paint.Cap)localObject);
    localObject = PDFRenderer.NOJOIN;
    this.join = ((Paint.Join)localObject);
    this.limit = f;
    localObject = PDFRenderer.NODASH;
    this.ary = ((float[])localObject);
    this.phase = f;
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    float f1 = this.w;
    Paint.Cap localCap = this.cap;
    Paint.Join localJoin = this.join;
    float f2 = this.limit;
    float[] arrayOfFloat = this.ary;
    float f3 = this.phase;
    paramPDFRenderer.setStrokeParts(f1, localCap, localJoin, f2, arrayOfFloat, f3);
    return null;
  }
  
  public void setDash(float[] paramArrayOfFloat, float paramFloat)
  {
    int i;
    if (paramArrayOfFloat != null) {
      i = 0;
    }
    for (;;)
    {
      int j = paramArrayOfFloat.length + -1;
      if (i >= j) {}
      for (;;)
      {
        this.ary = paramArrayOfFloat;
        this.phase = paramFloat;
        return;
        float f = paramArrayOfFloat[i];
        boolean bool = f < 0.0F;
        if (bool) {
          break;
        }
        int k = 925353388;
        f = 1.0E-5F;
        paramArrayOfFloat[i] = f;
      }
      i += 2;
    }
  }
  
  public void setEndCap(Paint.Cap paramCap)
  {
    this.cap = paramCap;
  }
  
  public void setLineJoin(Paint.Join paramJoin)
  {
    this.join = paramJoin;
  }
  
  public void setMiterLimit(float paramFloat)
  {
    this.limit = paramFloat;
  }
  
  public void setWidth(float paramFloat)
  {
    this.w = paramFloat;
  }
  
  public String toString(PDFRenderer paramPDFRenderer)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("STROKE: w=");
    float f = this.w;
    localStringBuilder = localStringBuilder.append(f).append(" cap=");
    Object localObject = this.cap;
    localStringBuilder = localStringBuilder.append(localObject).append(" join=");
    localObject = this.join;
    localStringBuilder = localStringBuilder.append(localObject).append(" limit=");
    f = this.limit;
    localStringBuilder = localStringBuilder.append(f).append(" ary=");
    localObject = this.ary;
    localStringBuilder = localStringBuilder.append(localObject).append(" phase=");
    f = this.phase;
    return f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFChangeStrokeCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */