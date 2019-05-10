package com.sun.pdfview.font;

import android.graphics.Path;
import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import java.util.HashMap;
import java.util.Map;

public class CIDFontType2
  extends TTFFont
{
  private b cidToGidMap;
  private int defaultWidth;
  private int defaultWidthVertical;
  private Map widths = null;
  private Map widthsVertical = null;
  
  public CIDFontType2(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFObject, paramPDFFontDescriptor);
    this.defaultWidth = j;
    this.defaultWidthVertical = j;
    parseWidths(paramPDFObject);
    paramPDFObject.getDictRef("CIDSystemInfo");
    Object localObject = paramPDFObject.getDictRef("CIDToGIDMap");
    if (localObject != null)
    {
      i = ((PDFObject)localObject).getType();
      int k = 7;
      if (i == k)
      {
        localObject = ((PDFObject)localObject).getStreamBuffer();
        this.cidToGidMap = ((b)localObject);
      }
    }
  }
  
  private void parseWidths(PDFObject paramPDFObject)
  {
    int i = 5;
    int j = 1;
    int k = -1;
    PDFObject localPDFObject1 = paramPDFObject.getDictRef("DW");
    int m;
    if (localPDFObject1 != null)
    {
      m = localPDFObject1.getIntValue();
      this.defaultWidth = m;
    }
    localPDFObject1 = paramPDFObject.getDictRef("W");
    HashMap localHashMap;
    PDFObject[] arrayOfPDFObject;
    int n;
    int i1;
    PDFObject localPDFObject2;
    if (localPDFObject1 != null)
    {
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      this.widths = localHashMap;
      arrayOfPDFObject = localPDFObject1.getArray();
      m = 0;
      localPDFObject1 = null;
      n = 0;
      localHashMap = null;
      i1 = 0;
      localPDFObject2 = null;
      i2 = 0;
      localPDFObject3 = null;
      i3 = arrayOfPDFObject.length;
      if (m < i3) {}
    }
    else
    {
      localPDFObject1 = paramPDFObject.getDictRef("DW2");
      if (localPDFObject1 != null)
      {
        m = localPDFObject1.getIntValue();
        this.defaultWidthVertical = m;
      }
      localPDFObject1 = paramPDFObject.getDictRef("W2");
      if (localPDFObject1 != null)
      {
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        this.widthsVertical = localHashMap;
        arrayOfPDFObject = localPDFObject1.getArray();
        m = 0;
        localPDFObject1 = null;
        n = 0;
        localHashMap = null;
        i1 = 0;
        localPDFObject2 = null;
        i2 = 0;
        localPDFObject3 = null;
        i3 = arrayOfPDFObject.length;
        if (m < i3) {
          break label487;
        }
      }
      return;
    }
    if (i2 == 0)
    {
      localPDFObject2 = arrayOfPDFObject[m];
      i1 = localPDFObject2.getIntValue();
    }
    Object localObject1;
    int i4;
    Object localObject2;
    Character localCharacter;
    int i5;
    float f1;
    Object localObject3;
    Float localFloat;
    for (;;)
    {
      i2 += 1;
      m += 1;
      break;
      if (i2 != j) {
        break label394;
      }
      localObject1 = arrayOfPDFObject[m];
      i3 = ((PDFObject)localObject1).getType();
      if (i3 == i)
      {
        localObject1 = arrayOfPDFObject[m].getArray();
        i2 = 0;
        localPDFObject3 = null;
        for (;;)
        {
          i4 = localObject1.length;
          if (i2 >= i4)
          {
            i2 = k;
            break;
          }
          localObject2 = new java/lang/Character;
          char c1 = (char)(i2 + i1);
          ((Character)localObject2).<init>(c1);
          localCharacter = localObject1[i2];
          i5 = localCharacter.getIntValue();
          f1 = i5;
          localObject3 = this.widths;
          localFloat = new java/lang/Float;
          localFloat.<init>(f1);
          ((Map)localObject3).put(localObject2, localFloat);
          i2 += 1;
        }
      }
      localHashMap = arrayOfPDFObject[m];
      n = localHashMap.getIntValue();
    }
    label394:
    PDFObject localPDFObject3 = arrayOfPDFObject[m];
    int i3 = localPDFObject3.getIntValue();
    int i2 = i1;
    char c2;
    float f2;
    for (;;)
    {
      if (i2 > n)
      {
        i2 = k;
        break;
      }
      localObject2 = this.widths;
      localCharacter = new java/lang/Character;
      c2 = (char)i2;
      localCharacter.<init>(c2);
      localObject3 = new java/lang/Float;
      f2 = i3;
      ((Float)localObject3).<init>(f2);
      ((Map)localObject2).put(localCharacter, localObject3);
      i2 += 1;
    }
    label487:
    if (i2 == 0)
    {
      localPDFObject2 = arrayOfPDFObject[m];
      i1 = localPDFObject2.getIntValue();
    }
    for (;;)
    {
      i2 += 1;
      m += 1;
      break;
      if (i2 != j) {
        break label677;
      }
      localObject1 = arrayOfPDFObject[m];
      i3 = ((PDFObject)localObject1).getType();
      if (i3 == i)
      {
        localObject1 = arrayOfPDFObject[m].getArray();
        i2 = 0;
        localPDFObject3 = null;
        for (;;)
        {
          i4 = localObject1.length;
          if (i2 >= i4)
          {
            i2 = k;
            break;
          }
          localObject2 = new java/lang/Character;
          i5 = (char)(i2 + i1);
          ((Character)localObject2).<init>(i5);
          localCharacter = localObject1[i2];
          int i6 = localCharacter.getIntValue();
          f1 = i6;
          localObject3 = this.widthsVertical;
          localFloat = new java/lang/Float;
          localFloat.<init>(f1);
          ((Map)localObject3).put(localObject2, localFloat);
          i2 += 1;
        }
      }
      localHashMap = arrayOfPDFObject[m];
      n = localHashMap.getIntValue();
    }
    label677:
    localPDFObject3 = arrayOfPDFObject[m];
    i3 = localPDFObject3.getIntValue();
    i2 = i1;
    for (;;)
    {
      if (i2 > n)
      {
        i2 = k;
        break;
      }
      localObject2 = this.widthsVertical;
      localCharacter = new java/lang/Character;
      c2 = (char)i2;
      localCharacter.<init>(c2);
      localObject3 = new java/lang/Float;
      f2 = i3;
      ((Float)localObject3).<init>(f2);
      ((Map)localObject2).put(localCharacter, localObject3);
      i2 += 1;
    }
  }
  
  public int getDefaultWidth()
  {
    return this.defaultWidth;
  }
  
  public int getDefaultWidthVertical()
  {
    return this.defaultWidthVertical;
  }
  
  protected Path getOutline(char paramChar, float paramFloat)
  {
    int i = (char)-1 & paramChar;
    try
    {
      b localb = this.cidToGidMap;
      if (localb != null)
      {
        localb = this.cidToGidMap;
        i *= 2;
        i = localb.e(i);
      }
      Path localPath = getOutline(i, paramFloat);
      return localPath;
    }
    finally {}
  }
  
  public float getWidth(char paramChar, String paramString)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    Object localObject = this.widths;
    float f2;
    if (localObject == null) {
      f2 = f1;
    }
    for (;;)
    {
      return f2;
      localObject = this.widths;
      Character localCharacter = new java/lang/Character;
      localCharacter.<init>(paramChar);
      localObject = (Float)((Map)localObject).get(localCharacter);
      if (localObject == null)
      {
        f2 = f1;
      }
      else
      {
        f2 = ((Float)localObject).floatValue();
        i = getDefaultWidth();
        f1 = i;
        f2 /= f1;
      }
    }
  }
  
  public float getWidthVertical(char paramChar, String paramString)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    Object localObject = this.widthsVertical;
    float f2;
    if (localObject == null) {
      f2 = f1;
    }
    for (;;)
    {
      return f2;
      localObject = this.widthsVertical;
      Character localCharacter = new java/lang/Character;
      localCharacter.<init>(paramChar);
      localObject = (Float)((Map)localObject).get(localCharacter);
      if (localObject == null)
      {
        f2 = f1;
      }
      else
      {
        f2 = ((Float)localObject).floatValue();
        i = getDefaultWidth();
        f1 = i;
        f2 /= f1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\CIDFontType2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */