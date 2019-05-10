package com.sun.pdfview;

import android.graphics.Matrix;
import android.graphics.PointF;
import c.a.a.e.b;
import com.sun.pdfview.font.OutlineFont;
import com.sun.pdfview.font.PDFFont;
import com.sun.pdfview.font.PDFGlyph;
import java.util.Iterator;
import java.util.List;

public class PDFTextFormat
  implements Cloneable
{
  private final Matrix cur;
  private PDFFont font;
  private float fsize;
  private boolean inuse;
  private Matrix line;
  private final PointF prevEnd;
  private float tc = 0.0F;
  private float th;
  private float tk;
  private float tl;
  private int tm;
  private float tr;
  private float tw = 0.0F;
  private StringBuffer word;
  private PointF wordStart;
  
  public PDFTextFormat()
  {
    this.th = f1;
    this.tl = 0.0F;
    this.tr = 0.0F;
    this.tm = i;
    this.tk = 0.0F;
    this.fsize = f1;
    this.inuse = false;
    Object localObject = new java/lang/StringBuffer;
    ((StringBuffer)localObject).<init>();
    this.word = ((StringBuffer)localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.cur = ((Matrix)localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.line = ((Matrix)localObject);
    localObject = new android/graphics/PointF;
    ((PointF)localObject).<init>(f2, f2);
    this.wordStart = ((PointF)localObject);
    localObject = new android/graphics/PointF;
    ((PointF)localObject).<init>(f2, f2);
    this.prevEnd = ((PointF)localObject);
    this.tk = 0.0F;
    this.tr = 0.0F;
    this.tw = 0.0F;
    this.tc = 0.0F;
    this.tm = i;
    this.th = f1;
  }
  
  private void doTextFontSubst(PDFPage paramPDFPage, String paramString)
  {
    int i = 1;
    float f1 = 0.0F;
    PointF localPointF = new android/graphics/PointF;
    localPointF.<init>();
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    float f2 = this.fsize;
    float f3 = this.fsize;
    float f4 = this.th * f3;
    float f5 = this.tr;
    char c1 = '\000';
    f3 = 0.0F;
    b.a((Matrix)localObject1, f2, 0.0F, 0.0F, f4, 0.0F, f5);
    Object localObject2 = new android/graphics/Matrix;
    ((Matrix)localObject2).<init>();
    Matrix localMatrix = this.cur;
    ((Matrix)localObject2).set(localMatrix);
    ((Matrix)localObject2).preConcat((Matrix)localObject1);
    localObject1 = new com/sun/pdfview/PDFNativeTextCmd;
    ((PDFNativeTextCmd)localObject1).<init>(paramString, (Matrix)localObject2);
    paramPDFPage.addCommand((PDFCmd)localObject1);
    int j = 0;
    localObject2 = null;
    f2 = 0.0F;
    for (;;)
    {
      int k = paramString.length();
      if (j >= k)
      {
        localObject1 = new float[2];
        f2 = localPointF.x;
        localObject1[0] = f2;
        f2 = localPointF.y;
        localObject1[i] = f2;
        localObject2 = new float[localObject1.length];
        this.cur.mapPoints((float[])localObject2, (float[])localObject1);
        localObject1 = this.prevEnd;
        f1 = localObject2[0];
        f2 = localObject2[i];
        ((PointF)localObject1).set(f1, f2);
        return;
      }
      c1 = paramString.charAt(0);
      k = 1058642330;
      float f6 = 0.6F;
      PDFFont localPDFFont = this.font;
      boolean bool = localPDFFont instanceof OutlineFont;
      if (bool)
      {
        localObject1 = (OutlineFont)this.font;
        bool = false;
        f4 = 0.0F;
        localPDFFont = null;
        f6 = ((OutlineFont)localObject1).getWidth(c1, null);
      }
      f4 = this.fsize;
      f6 *= f4;
      f4 = this.tc;
      f6 += f4;
      char c2 = ' ';
      f4 = 4.5E-44F;
      if (c1 == c2)
      {
        f3 = this.tw;
        f6 += f3;
      }
      f3 = this.th;
      f6 *= f3;
      localMatrix = this.cur;
      localMatrix.preTranslate(f6, 0.0F);
      k = j + 1;
      j = k;
    }
  }
  
  private void doTextNormal(PDFPage paramPDFPage, String paramString)
  {
    int i = 1;
    int j = 0;
    float f1 = 0.0F;
    Matrix localMatrix1 = null;
    PointF localPointF1 = new android/graphics/PointF;
    localPointF1.<init>();
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    float f2 = this.fsize;
    float f3 = this.fsize;
    float f4 = this.th * f3;
    float f5 = this.tr;
    f3 = 0.0F;
    PointF localPointF2 = null;
    float f6 = 0.0F;
    b.a((Matrix)localObject1, f2, 0.0F, 0.0F, f4, 0.0F, f5);
    Matrix localMatrix2 = new android/graphics/Matrix;
    localMatrix2.<init>();
    Object localObject2 = this.font.getGlyphs(paramString);
    Iterator localIterator = ((List)localObject2).iterator();
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      localObject1 = new float[2];
      f2 = localPointF1.x;
      localObject1[0] = f2;
      f2 = localPointF1.y;
      localObject1[i] = f2;
      localObject2 = new float[localObject1.length];
      this.cur.mapPoints((float[])localObject2, (float[])localObject1);
      localObject1 = this.prevEnd;
      f1 = localObject2[0];
      f2 = localObject2[i];
      ((PointF)localObject1).set(f1, f2);
      return;
    }
    localObject2 = (PDFGlyph)localIterator.next();
    localMatrix1 = this.cur;
    localMatrix2.set(localMatrix1);
    localMatrix2.preConcat((Matrix)localObject1);
    j = this.tm;
    localPointF2 = ((PDFGlyph)localObject2).addCommands(paramPDFPage, localMatrix2, j);
    f1 = localPointF2.x;
    f5 = this.fsize;
    f1 *= f5;
    f5 = this.tc;
    f1 += f5;
    int k = ((PDFGlyph)localObject2).getChar();
    int m = 32;
    f5 = 4.5E-44F;
    if (k == m) {}
    for (f2 = this.tw + f1;; f2 = f1)
    {
      f1 = this.th;
      f2 *= f1;
      localMatrix1 = this.cur;
      f6 = localPointF2.y;
      localMatrix1.preTranslate(f2, f6);
      break;
    }
  }
  
  public void carriageReturn()
  {
    float f = -this.tl;
    carriageReturn(0.0F, f);
  }
  
  public void carriageReturn(float paramFloat1, float paramFloat2)
  {
    Matrix localMatrix1 = new android/graphics/Matrix;
    localMatrix1.<init>();
    localMatrix1.setTranslate(paramFloat1, paramFloat2);
    this.line.preConcat(localMatrix1);
    localMatrix1 = this.cur;
    Matrix localMatrix2 = this.line;
    localMatrix1.set(localMatrix2);
  }
  
  public Object clone()
  {
    PDFTextFormat localPDFTextFormat = new com/sun/pdfview/PDFTextFormat;
    localPDFTextFormat.<init>();
    float f1 = getCharSpacing();
    localPDFTextFormat.setCharSpacing(f1);
    f1 = getWordSpacing();
    localPDFTextFormat.setWordSpacing(f1);
    f1 = getHorizontalScale();
    localPDFTextFormat.setHorizontalScale(f1);
    f1 = getLeading();
    localPDFTextFormat.setLeading(f1);
    int i = getMode();
    localPDFTextFormat.setTextFormatMode(i);
    f1 = getRise();
    localPDFTextFormat.setRise(f1);
    PDFFont localPDFFont = getFont();
    float f2 = getFontSize();
    localPDFTextFormat.setFont(localPDFFont, f2);
    return localPDFTextFormat;
  }
  
  public void doText(PDFPage paramPDFPage, String paramString)
  {
    boolean bool = PDFFont.sUseFontSubstitution;
    if (bool) {
      doTextFontSubst(paramPDFPage, paramString);
    }
    for (;;)
    {
      return;
      doTextNormal(paramPDFPage, paramString);
    }
  }
  
  public void doText(PDFPage paramPDFPage, Object[] paramArrayOfObject)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject = null;
    int j = paramArrayOfObject.length;
    int k = 0;
    if (k >= j) {
      return;
    }
    localObject = paramArrayOfObject[k];
    bool1 = localObject instanceof String;
    if (bool1)
    {
      localObject = (String)paramArrayOfObject[k];
      doText(paramPDFPage, (String)localObject);
    }
    for (;;)
    {
      int i = k + 1;
      k = i;
      break;
      localObject = paramArrayOfObject[k];
      boolean bool2 = localObject instanceof Double;
      if (!bool2) {
        break label161;
      }
      localObject = (Double)paramArrayOfObject[k];
      f1 = ((Double)localObject).floatValue();
      float f2 = 1000.0F;
      f1 /= f2;
      Matrix localMatrix = this.cur;
      f1 = -f1;
      float f3 = this.fsize;
      f1 *= f3;
      f3 = this.th;
      f1 *= f3;
      f3 = 0.0F;
      localMatrix.preTranslate(f1, 0.0F);
    }
    label161:
    localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("Bad element in TJ array");
    throw ((Throwable)localObject);
  }
  
  public void end()
  {
    this.inuse = false;
  }
  
  public void flush() {}
  
  public float getCharSpacing()
  {
    return this.tc;
  }
  
  public PDFFont getFont()
  {
    return this.font;
  }
  
  public float getFontSize()
  {
    return this.fsize;
  }
  
  public float getHorizontalScale()
  {
    return this.th * 100.0F;
  }
  
  public float getLeading()
  {
    return this.tl;
  }
  
  public int getMode()
  {
    return this.tm;
  }
  
  public float getRise()
  {
    return this.tr;
  }
  
  public Matrix getTransform()
  {
    return this.cur;
  }
  
  public float getWordSpacing()
  {
    return this.tw;
  }
  
  public void reset()
  {
    this.cur.reset();
    this.line.reset();
    this.inuse = true;
    this.word.setLength(0);
  }
  
  public void setCharSpacing(float paramFloat)
  {
    this.tc = paramFloat;
  }
  
  public void setFont(PDFFont paramPDFFont, float paramFloat)
  {
    this.font = paramPDFFont;
    this.fsize = paramFloat;
  }
  
  public void setHorizontalScale(float paramFloat)
  {
    float f = paramFloat / 100.0F;
    this.th = f;
  }
  
  public void setLeading(float paramFloat)
  {
    this.tl = paramFloat;
  }
  
  public void setMatrix(float[] paramArrayOfFloat)
  {
    Matrix localMatrix1 = new android/graphics/Matrix;
    localMatrix1.<init>();
    this.line = localMatrix1;
    b.a(this.line, paramArrayOfFloat);
    localMatrix1 = this.cur;
    Matrix localMatrix2 = this.line;
    localMatrix1.set(localMatrix2);
  }
  
  public void setMode(int paramInt)
  {
    int i = 0;
    int j = paramInt & 0x1;
    if (j == 0) {
      i = 2;
    }
    j = paramInt & 0x4;
    if (j != 0) {
      i |= 0x4;
    }
    j = paramInt & 0x1;
    int k = (paramInt & 0x2) >> 1;
    j ^= k;
    if (j != 0) {
      i |= 0x1;
    }
    this.tm = i;
  }
  
  public void setRise(float paramFloat)
  {
    this.tr = paramFloat;
  }
  
  public void setTextFormatMode(int paramInt)
  {
    this.tm = paramInt;
  }
  
  public void setWordSpacing(float paramFloat)
  {
    this.tw = paramFloat;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFTextFormat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */