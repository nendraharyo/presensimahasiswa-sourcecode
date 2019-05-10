package com.sun.pdfview.font;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c.a.a.e.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.PDFParser;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Type3Font
  extends PDFFont
{
  Matrix at;
  RectF bbox;
  Map charProcs;
  int firstChar;
  int lastChar;
  HashMap rsrc;
  float[] widths;
  
  public Type3Font(String paramString, PDFObject paramPDFObject, HashMap paramHashMap, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFFontDescriptor);
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.rsrc = ((HashMap)localObject1);
    if (paramHashMap != null)
    {
      localObject1 = this.rsrc;
      ((HashMap)localObject1).putAll(paramHashMap);
    }
    Object localObject2 = paramPDFObject.getDictRef("FontMatrix");
    float[] arrayOfFloat = new float[i];
    int i1 = 0;
    localObject1 = null;
    float f3 = 0.0F;
    label202:
    float f5;
    float f6;
    int i2;
    int i4;
    if (i1 >= i)
    {
      localObject1 = b.a(arrayOfFloat);
      this.at = ((Matrix)localObject1);
      f3 = arrayOfFloat[0];
      float f4 = arrayOfFloat[k];
      f3 += f4;
      localObject1 = paramPDFObject.getDictRef("Resources");
      if (localObject1 != null)
      {
        localObject2 = this.rsrc;
        localObject1 = ((PDFObject)localObject1).getDictionary();
        ((HashMap)localObject2).putAll((Map)localObject1);
      }
      localObject1 = paramPDFObject.getDictRef("CharProcs").getDictionary();
      this.charProcs = ((Map)localObject1);
      localObject2 = paramPDFObject.getDictRef("FontBBox").getArray();
      arrayOfFloat = new float[j];
      i1 = 0;
      localObject1 = null;
      f3 = 0.0F;
      if (i1 < j) {
        break label429;
      }
      localObject1 = new android/graphics/RectF;
      f4 = arrayOfFloat[0];
      f5 = arrayOfFloat[m];
      f2 = arrayOfFloat[k];
      f1 = arrayOfFloat[0];
      f2 -= f1;
      j = 3;
      f1 = arrayOfFloat[j];
      f6 = arrayOfFloat[m];
      f6 = f1 - f6;
      ((RectF)localObject1).<init>(f4, f5, f2, f6);
      this.bbox = ((RectF)localObject1);
      localObject1 = this.bbox;
      i2 = ((RectF)localObject1).isEmpty();
      if (i2 != 0)
      {
        i2 = 0;
        f3 = 0.0F;
        localObject1 = null;
        this.bbox = null;
      }
      localObject1 = paramPDFObject.getDictRef("Widths").getArray();
      i4 = localObject1.length;
      localObject2 = new float[i4];
      this.widths = ((float[])localObject2);
    }
    for (;;)
    {
      i4 = localObject1.length;
      if (n >= i4)
      {
        n = paramPDFObject.getDictRef("FirstChar").getIntValue();
        this.firstChar = n;
        n = paramPDFObject.getDictRef("LastChar").getIntValue();
        this.lastChar = n;
        return;
        PDFObject localPDFObject = ((PDFObject)localObject2).getAt(i2);
        f5 = localPDFObject.getFloatValue();
        arrayOfFloat[i2] = f5;
        int i3;
        i2 += 1;
        break;
        label429:
        localPDFObject = localObject2[i3];
        f5 = localPDFObject.getFloatValue();
        arrayOfFloat[i3] = f5;
        i3 += 1;
        break label202;
      }
      localObject2 = this.widths;
      arrayOfFloat = localObject1[n];
      f6 = arrayOfFloat.getFloatValue();
      localObject2[n] = f6;
      n += 1;
    }
  }
  
  public int getFirstChar()
  {
    return this.firstChar;
  }
  
  protected PDFGlyph getGlyph(char paramChar, String paramString)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    Object localObject4;
    if (paramString == null)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("Glyph name required for Type3 font!Source character: ");
      localObject4 = paramChar;
      ((IllegalArgumentException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = (PDFObject)this.charProcs.get(paramString);
    Object localObject5;
    if (localObject2 == null)
    {
      localObject2 = new com/sun/pdfview/font/PDFGlyph;
      localObject4 = new android/graphics/Path;
      ((Path)localObject4).<init>();
      localObject5 = new android/graphics/PointF;
      ((PointF)localObject5).<init>(0.0F, 0.0F);
      ((PDFGlyph)localObject2).<init>(paramChar, paramString, (Path)localObject4, (PointF)localObject5);
    }
    for (;;)
    {
      return (PDFGlyph)localObject2;
      try
      {
        localObject4 = new com/sun/pdfview/PDFPage;
        localObject5 = this.bbox;
        i = 0;
        f1 = 0.0F;
        localObject1 = null;
        ((PDFPage)localObject4).<init>((RectF)localObject5, 0);
        localObject5 = this.at;
        ((PDFPage)localObject4).addXform((Matrix)localObject5);
        localObject5 = new com/sun/pdfview/PDFParser;
        localObject2 = ((PDFObject)localObject2).getStream();
        localObject1 = this.rsrc;
        ((PDFParser)localObject5).<init>((PDFPage)localObject4, (byte[])localObject2, (HashMap)localObject1);
        boolean bool = true;
        f2 = Float.MIN_VALUE;
        ((PDFParser)localObject5).go(bool);
        localObject2 = this.widths;
        char c = this.firstChar;
        c = paramChar - c;
        f2 = localObject2[c];
        localObject5 = new android/graphics/PointF;
        i = 0;
        f1 = 0.0F;
        localObject1 = null;
        ((PointF)localObject5).<init>(f2, 0.0F);
        j = 2;
        f2 = 2.8E-45F;
        localObject2 = new float[j];
        i = 0;
        f1 = 0.0F;
        localObject1 = null;
        float f3 = ((PointF)localObject5).x;
        localObject2[0] = f3;
        i = 1;
        f1 = Float.MIN_VALUE;
        f3 = ((PointF)localObject5).y;
        localObject2[i] = f3;
        localObject1 = this.at;
        ((Matrix)localObject1).mapPoints((float[])localObject2);
        i = 0;
        f1 = 0.0F;
        localObject1 = null;
        f1 = localObject2[0];
        ((PointF)localObject5).x = f1;
        i = 1;
        f1 = Float.MIN_VALUE;
        f2 = localObject2[i];
        ((PointF)localObject5).y = f2;
        localObject2 = new com/sun/pdfview/font/PDFGlyph;
        ((PDFGlyph)localObject2).<init>(paramChar, paramString, (PDFPage)localObject4, (PointF)localObject5);
      }
      catch (IOException localIOException)
      {
        localObject4 = System.out;
        localObject5 = new java/lang/StringBuilder;
        localObject1 = "IOException in Type3 font: ";
        ((StringBuilder)localObject5).<init>((String)localObject1);
        localObject5 = localIOException;
        ((PrintStream)localObject4).println((String)localObject5);
        localIOException.printStackTrace();
        int j = 0;
        float f2 = 0.0F;
        Object localObject3 = null;
      }
    }
  }
  
  public int getLastChar()
  {
    return this.lastChar;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type3Font.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */