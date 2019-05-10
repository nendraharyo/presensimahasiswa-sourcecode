package com.sun.pdfview.font;

import android.graphics.RectF;
import com.sun.pdfview.PDFObject;
import java.util.HashMap;

public class PDFFontDescriptor
{
  public static final int ALLCAP = 65536;
  public static final int FIXED_PITCH = 1;
  public static final int FORCEBOLD = 262144;
  public static final int ITALIC = 64;
  public static final int NONSYMBOLIC = 32;
  public static final int SCRIPT = 8;
  public static final int SERIF = 2;
  public static final int SMALLCAP = 131072;
  public static final int SYMBOLIC = 4;
  private int ascent;
  private int avgWidth = 0;
  private int capHeight;
  private PDFObject charSet;
  private int descent;
  private int flags;
  private RectF fontBBox;
  private String fontFamily;
  private PDFObject fontFile;
  private PDFObject fontFile2;
  private PDFObject fontFile3;
  private String fontName;
  private String fontStretch;
  private int fontWeight;
  private int italicAngle;
  private int leading = 0;
  private int maxWidth = 0;
  private int missingWidth = 0;
  private int stemH = 0;
  private int stemV;
  private int xHeight = 0;
  
  public PDFFontDescriptor(PDFObject paramPDFObject)
  {
    int k = paramPDFObject.getDictRef("Ascent").getIntValue();
    setAscent(k);
    k = paramPDFObject.getDictRef("CapHeight").getIntValue();
    setCapHeight(k);
    k = paramPDFObject.getDictRef("Descent").getIntValue();
    setDescent(k);
    k = paramPDFObject.getDictRef("Flags").getIntValue();
    setFlags(k);
    Object localObject = paramPDFObject.getDictRef("FontName").getStringValue();
    setFontName((String)localObject);
    k = paramPDFObject.getDictRef("ItalicAngle").getIntValue();
    setItalicAngle(k);
    k = paramPDFObject.getDictRef("StemV").getIntValue();
    setStemV(k);
    PDFObject[] arrayOfPDFObject = paramPDFObject.getDictRef("FontBBox").getArray();
    float[] arrayOfFloat = new float[i];
    k = 0;
    localObject = null;
    for (;;)
    {
      boolean bool8;
      if (k >= i)
      {
        localObject = new android/graphics/RectF;
        float f3 = arrayOfFloat[0];
        f4 = arrayOfFloat[j];
        f1 = arrayOfFloat[2];
        f2 = arrayOfFloat[0];
        f2 = f1 - f2;
        i = 3;
        f1 = arrayOfFloat[i];
        float f5 = arrayOfFloat[j];
        f5 = f1 - f5;
        ((RectF)localObject).<init>(f3, f4, f2, f5);
        setFontBBox((RectF)localObject);
        localObject = paramPDFObject.getDictionary();
        str = "AvgWidth";
        boolean bool1 = ((HashMap)localObject).containsKey(str);
        if (bool1)
        {
          localObject = paramPDFObject.getDictRef("AvgWidth");
          int m = ((PDFObject)localObject).getIntValue();
          setAvgWidth(m);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontFile";
        boolean bool2 = ((HashMap)localObject).containsKey(str);
        if (bool2)
        {
          localObject = paramPDFObject.getDictRef("FontFile");
          setFontFile((PDFObject)localObject);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontFile2";
        bool2 = ((HashMap)localObject).containsKey(str);
        if (bool2)
        {
          localObject = paramPDFObject.getDictRef("FontFile2");
          setFontFile2((PDFObject)localObject);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontFile3";
        bool2 = ((HashMap)localObject).containsKey(str);
        if (bool2)
        {
          localObject = paramPDFObject.getDictRef("FontFile3");
          setFontFile3((PDFObject)localObject);
        }
        localObject = paramPDFObject.getDictionary();
        str = "Leading";
        bool2 = ((HashMap)localObject).containsKey(str);
        if (bool2)
        {
          localObject = paramPDFObject.getDictRef("Leading");
          int n = ((PDFObject)localObject).getIntValue();
          setLeading(n);
        }
        localObject = paramPDFObject.getDictionary();
        str = "MaxWidth";
        boolean bool3 = ((HashMap)localObject).containsKey(str);
        if (bool3)
        {
          localObject = paramPDFObject.getDictRef("MaxWidth");
          int i1 = ((PDFObject)localObject).getIntValue();
          setMaxWidth(i1);
        }
        localObject = paramPDFObject.getDictionary();
        str = "MissingWidth";
        boolean bool4 = ((HashMap)localObject).containsKey(str);
        if (bool4)
        {
          localObject = paramPDFObject.getDictRef("MissingWidth");
          int i2 = ((PDFObject)localObject).getIntValue();
          setMissingWidth(i2);
        }
        localObject = paramPDFObject.getDictionary();
        str = "StemH";
        boolean bool5 = ((HashMap)localObject).containsKey(str);
        if (bool5)
        {
          localObject = paramPDFObject.getDictRef("StemH");
          int i3 = ((PDFObject)localObject).getIntValue();
          setStemH(i3);
        }
        localObject = paramPDFObject.getDictionary();
        str = "XHeight";
        boolean bool6 = ((HashMap)localObject).containsKey(str);
        if (bool6)
        {
          localObject = paramPDFObject.getDictRef("XHeight");
          int i4 = ((PDFObject)localObject).getIntValue();
          setXHeight(i4);
        }
        localObject = paramPDFObject.getDictionary();
        str = "CharSet";
        boolean bool7 = ((HashMap)localObject).containsKey(str);
        if (bool7)
        {
          localObject = paramPDFObject.getDictRef("CharSet");
          setCharSet((PDFObject)localObject);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontFamily";
        bool7 = ((HashMap)localObject).containsKey(str);
        if (bool7)
        {
          localObject = paramPDFObject.getDictRef("FontFamily").getStringValue();
          setFontFamily((String)localObject);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontWeight";
        bool7 = ((HashMap)localObject).containsKey(str);
        if (bool7)
        {
          localObject = paramPDFObject.getDictRef("FontWeight");
          int i5 = ((PDFObject)localObject).getIntValue();
          setFontWeight(i5);
        }
        localObject = paramPDFObject.getDictionary();
        str = "FontStretch";
        bool8 = ((HashMap)localObject).containsKey(str);
        if (bool8)
        {
          localObject = paramPDFObject.getDictRef("FontStretch").getStringValue();
          setFontStretch((String)localObject);
        }
        return;
      }
      PDFObject localPDFObject = arrayOfPDFObject[bool8];
      float f4 = localPDFObject.getFloatValue();
      arrayOfFloat[bool8] = f4;
      int i6;
      bool8 += true;
    }
  }
  
  public PDFFontDescriptor(String paramString)
  {
    setFontName(paramString);
  }
  
  public int getAscent()
  {
    return this.ascent;
  }
  
  public int getAvgWidth()
  {
    return this.avgWidth;
  }
  
  public int getCapHeight()
  {
    return this.capHeight;
  }
  
  public PDFObject getCharSet()
  {
    return this.charSet;
  }
  
  public int getDescent()
  {
    return this.descent;
  }
  
  public int getFlags()
  {
    return this.flags;
  }
  
  public RectF getFontBBox()
  {
    return this.fontBBox;
  }
  
  public String getFontFamily()
  {
    return this.fontFamily;
  }
  
  public PDFObject getFontFile()
  {
    return this.fontFile;
  }
  
  public PDFObject getFontFile2()
  {
    return this.fontFile2;
  }
  
  public PDFObject getFontFile3()
  {
    return this.fontFile3;
  }
  
  public String getFontName()
  {
    return this.fontName;
  }
  
  public String getFontStretch()
  {
    return this.fontStretch;
  }
  
  public int getFontWeight()
  {
    return this.fontWeight;
  }
  
  public int getItalicAngle()
  {
    return this.italicAngle;
  }
  
  public int getLeading()
  {
    return this.leading;
  }
  
  public int getMaxWidth()
  {
    return this.maxWidth;
  }
  
  public int getMissingWidth()
  {
    return this.missingWidth;
  }
  
  public int getStemH()
  {
    return this.stemH;
  }
  
  public int getStemV()
  {
    return this.stemV;
  }
  
  public int getXHeight()
  {
    return this.xHeight;
  }
  
  public void setAscent(int paramInt)
  {
    this.ascent = paramInt;
  }
  
  public void setAvgWidth(int paramInt)
  {
    this.avgWidth = paramInt;
  }
  
  public void setCapHeight(int paramInt)
  {
    this.capHeight = paramInt;
  }
  
  public void setCharSet(PDFObject paramPDFObject)
  {
    this.charSet = paramPDFObject;
  }
  
  public void setDescent(int paramInt)
  {
    this.descent = paramInt;
  }
  
  public void setFlags(int paramInt)
  {
    this.flags = paramInt;
  }
  
  public void setFontBBox(RectF paramRectF)
  {
    this.fontBBox = paramRectF;
  }
  
  public void setFontFamily(String paramString)
  {
    this.fontFamily = paramString;
  }
  
  public void setFontFile(PDFObject paramPDFObject)
  {
    this.fontFile = paramPDFObject;
  }
  
  public void setFontFile2(PDFObject paramPDFObject)
  {
    this.fontFile2 = paramPDFObject;
  }
  
  public void setFontFile3(PDFObject paramPDFObject)
  {
    this.fontFile3 = paramPDFObject;
  }
  
  public void setFontName(String paramString)
  {
    this.fontName = paramString;
  }
  
  public void setFontStretch(String paramString)
  {
    this.fontStretch = paramString;
  }
  
  public void setFontWeight(int paramInt)
  {
    this.fontWeight = paramInt;
  }
  
  public void setItalicAngle(int paramInt)
  {
    this.italicAngle = paramInt;
  }
  
  public void setLeading(int paramInt)
  {
    this.leading = paramInt;
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.maxWidth = paramInt;
  }
  
  public void setMissingWidth(int paramInt)
  {
    this.missingWidth = paramInt;
  }
  
  public void setStemH(int paramInt)
  {
    this.stemH = paramInt;
  }
  
  public void setStemV(int paramInt)
  {
    this.stemV = paramInt;
  }
  
  public void setXHeight(int paramInt)
  {
    this.xHeight = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\PDFFontDescriptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */