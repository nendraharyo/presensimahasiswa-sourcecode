package com.sun.pdfview.font;

import android.graphics.Path;
import android.graphics.PointF;
import com.sun.pdfview.PDFObject;

public abstract class OutlineFont
  extends PDFFont
{
  private int firstChar;
  private int lastChar;
  private float[] widths;
  
  public OutlineFont(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFFontDescriptor);
    this.firstChar = i;
    this.lastChar = i;
    Object localObject1 = paramPDFObject.getDictRef("FirstChar");
    Object localObject2 = paramPDFObject.getDictRef("LastChar");
    Object localObject3 = paramPDFObject.getDictRef("Widths");
    if (localObject1 != null)
    {
      i = ((PDFObject)localObject1).getIntValue();
      this.firstChar = i;
    }
    if (localObject2 != null)
    {
      i = ((PDFObject)localObject2).getIntValue();
      this.lastChar = i;
    }
    if (localObject3 != null)
    {
      localObject2 = ((PDFObject)localObject3).getArray();
      localObject1 = new float[localObject2.length];
      this.widths = ((float[])localObject1);
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      int j = localObject2.length;
      if (i >= j) {
        return;
      }
      localObject3 = this.widths;
      Object localObject4 = localObject2[i];
      float f1 = ((PDFObject)localObject4).getFloatValue();
      int k = getDefaultWidth();
      float f2 = k;
      f1 /= f2;
      localObject3[i] = f1;
      i += 1;
    }
  }
  
  public int getCharCount()
  {
    int i = getLastChar();
    int j = getFirstChar();
    return i - j + 1;
  }
  
  public int getDefaultWidth()
  {
    return 1000;
  }
  
  public int getFirstChar()
  {
    return this.firstChar;
  }
  
  protected PDFGlyph getGlyph(char paramChar, String paramString)
  {
    Path localPath = null;
    float f = getWidth(paramChar, paramString);
    if (paramString != null) {
      localPath = getOutline(paramString, f);
    }
    if (localPath == null) {
      localPath = getOutline(paramChar, f);
    }
    PointF localPointF = new android/graphics/PointF;
    localPointF.<init>(f, 0.0F);
    PDFGlyph localPDFGlyph = new com/sun/pdfview/font/PDFGlyph;
    localPDFGlyph.<init>(paramChar, paramString, localPath, localPointF);
    return localPDFGlyph;
  }
  
  public int getLastChar()
  {
    return this.lastChar;
  }
  
  protected abstract Path getOutline(char paramChar, float paramFloat);
  
  protected abstract Path getOutline(String paramString, float paramFloat);
  
  public float getWidth(char paramChar, String paramString)
  {
    int i = paramChar & 0xFF;
    int j = getFirstChar();
    i -= j;
    float[] arrayOfFloat;
    if (i >= 0)
    {
      arrayOfFloat = this.widths;
      if (arrayOfFloat != null)
      {
        arrayOfFloat = this.widths;
        j = arrayOfFloat.length;
        if (i < j) {
          break label90;
        }
      }
    }
    PDFFontDescriptor localPDFFontDescriptor = getDescriptor();
    float f;
    if (localPDFFontDescriptor != null)
    {
      localPDFFontDescriptor = getDescriptor();
      i = localPDFFontDescriptor.getMissingWidth();
      f = i;
    }
    for (;;)
    {
      return f;
      i = 0;
      f = 0.0F;
      localPDFFontDescriptor = null;
      continue;
      label90:
      arrayOfFloat = this.widths;
      f = arrayOfFloat[i];
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\OutlineFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */