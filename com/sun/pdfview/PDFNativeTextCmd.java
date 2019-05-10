package com.sun.pdfview;

import android.graphics.Matrix;
import android.graphics.RectF;

public class PDFNativeTextCmd
  extends PDFCmd
{
  public static final int BOTH = 3;
  public static final int CLIP = 4;
  public static final int FILL = 2;
  public static final int STROKE = 1;
  private static final String TAG = "ANDPDF.natTXT";
  private RectF bounds;
  private float h;
  private Matrix mat;
  private int style;
  private String text;
  private float w;
  private float x;
  private float y;
  
  public PDFNativeTextCmd(String paramString, Matrix paramMatrix)
  {
    this.text = paramString;
    this.mat = paramMatrix;
    Object localObject = new float[9];
    paramMatrix.getValues((float[])localObject);
    float f1 = localObject[2];
    this.x = f1;
    f1 = localObject[5];
    this.y = f1;
    f1 = localObject[0];
    this.w = f1;
    float f2 = localObject[4];
    this.h = f2;
    localObject = new android/graphics/RectF;
    f1 = this.x;
    float f3 = this.y;
    float f4 = this.x;
    float f5 = this.w;
    f4 += f5;
    f5 = this.y;
    float f6 = this.h;
    f5 += f6;
    ((RectF)localObject).<init>(f1, f3, f4, f5);
    this.bounds = ((RectF)localObject);
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    String str = this.text;
    RectF localRectF = this.bounds;
    return paramPDFRenderer.drawNativeText(str, localRectF);
  }
  
  public String getDetails()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("NativeTextCommand Text: '");
    Object localObject2 = this.text;
    localObject1 = (String)localObject2 + "'\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("matrix: ");
    localObject2 = this.mat;
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = "\n";
    localObject1 = (String)localObject2;
    localStringBuffer.append((String)localObject1);
    localObject1 = "Mode: ";
    localStringBuffer.append((String)localObject1);
    int i = this.style & 0x2;
    if (i != 0)
    {
      localObject1 = "FILL ";
      localStringBuffer.append((String)localObject1);
    }
    i = this.style & 0x1;
    if (i != 0)
    {
      localObject1 = "STROKE ";
      localStringBuffer.append((String)localObject1);
    }
    i = this.style & 0x4;
    if (i != 0)
    {
      localObject1 = "CLIP";
      localStringBuffer.append((String)localObject1);
    }
    return localStringBuffer.toString();
  }
  
  public float getWidth()
  {
    float f = this.text.length();
    return 6.0F * f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFNativeTextCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */