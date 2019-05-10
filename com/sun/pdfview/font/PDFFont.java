package com.sun.pdfview.font;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class PDFFont
{
  public static boolean sUseFontSubstitution = false;
  private String baseFont;
  private Map charCache;
  private PDFFontDescriptor descriptor;
  private PDFFontEncoding encoding;
  private String subtype;
  private PDFCMap unicodeMap;
  
  protected PDFFont(String paramString, PDFFontDescriptor paramPDFFontDescriptor)
  {
    setBaseFont(paramString);
    setDescriptor(paramPDFFontDescriptor);
  }
  
  public static PDFFont getFont(PDFObject paramPDFObject, HashMap paramHashMap)
  {
    Object localObject1 = null;
    for (;;)
    {
      Object localObject5;
      Object localObject6;
      Object localObject7;
      boolean bool;
      synchronized (PDFFont.class)
      {
        Object localObject2 = paramPDFObject.getCache();
        localObject2 = (PDFFont)localObject2;
        if (localObject2 != null) {
          return (PDFFont)localObject2;
        }
        localObject2 = "Subtype";
        localObject2 = paramPDFObject.getDictRef((String)localObject2);
        localObject2 = ((PDFObject)localObject2).getStringValue();
        if (localObject2 != null) {
          break label626;
        }
        localObject2 = "S";
        localObject2 = paramPDFObject.getDictRef((String)localObject2);
        localObject2 = ((PDFObject)localObject2).getStringValue();
        localObject5 = localObject2;
        localObject2 = "BaseFont";
        localObject2 = paramPDFObject.getDictRef((String)localObject2);
        localObject6 = "Encoding";
        localObject6 = paramPDFObject.getDictRef((String)localObject6);
        localObject7 = "FontDescriptor";
        PDFObject localPDFObject = paramPDFObject.getDictRef((String)localObject7);
        if (localObject2 != null)
        {
          localObject2 = ((PDFObject)localObject2).getStringValue();
          localObject7 = localObject2;
          if (localObject6 == null) {
            break label614;
          }
          localObject2 = new com/sun/pdfview/font/PDFFontEncoding;
          ((PDFFontEncoding)localObject2).<init>((String)localObject5, (PDFObject)localObject6);
          localObject6 = localObject2;
          if (localPDFObject == null) {
            break label265;
          }
          localObject2 = new com/sun/pdfview/font/PDFFontDescriptor;
          ((PDFFontDescriptor)localObject2).<init>(localPDFObject);
          localObject1 = localObject2;
          localObject2 = "Type0";
          bool = ((String)localObject5).equals(localObject2);
          if (!bool) {
            break label283;
          }
          localObject2 = new com/sun/pdfview/font/Type0Font;
          ((Type0Font)localObject2).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
          ((PDFFont)localObject2).setSubtype((String)localObject5);
          ((PDFFont)localObject2).setEncoding((PDFFontEncoding)localObject6);
          paramPDFObject.setCache(localObject2);
        }
      }
      Object localObject4 = "Name";
      localObject4 = paramPDFObject.getDictRef((String)localObject4);
      if (localObject4 != null)
      {
        localObject4 = ((PDFObject)localObject4).getStringValue();
        localObject7 = localObject4;
        continue;
        label265:
        localObject4 = new com/sun/pdfview/font/PDFFontDescriptor;
        ((PDFFontDescriptor)localObject4).<init>((String)localObject7);
        localObject1 = localObject4;
        continue;
        label283:
        localObject4 = "Type1";
        bool = ((String)localObject5).equals(localObject4);
        if (bool)
        {
          if (localObject1 == null)
          {
            localObject4 = new com/sun/pdfview/font/BuiltinFont;
            ((BuiltinFont)localObject4).<init>((String)localObject7, paramPDFObject);
          }
          else
          {
            localObject4 = ((PDFFontDescriptor)localObject1).getFontFile();
            if (localObject4 != null)
            {
              localObject4 = new com/sun/pdfview/font/Type1Font;
              ((Type1Font)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
            }
            else
            {
              localObject4 = ((PDFFontDescriptor)localObject1).getFontFile3();
              if (localObject4 != null)
              {
                localObject4 = new com/sun/pdfview/font/Type1CFont;
                ((Type1CFont)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
              }
              else
              {
                localObject4 = new com/sun/pdfview/font/BuiltinFont;
                ((BuiltinFont)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
              }
            }
          }
        }
        else
        {
          localObject4 = "TrueType";
          bool = ((String)localObject5).equals(localObject4);
          if (bool)
          {
            localObject4 = ((PDFFontDescriptor)localObject1).getFontFile2();
            if (localObject4 != null)
            {
              localObject4 = new com/sun/pdfview/font/TTFFont;
              ((TTFFont)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
            }
            else
            {
              localObject4 = new com/sun/pdfview/font/BuiltinFont;
              ((BuiltinFont)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
            }
          }
          else
          {
            localObject4 = "Type3";
            bool = ((String)localObject5).equals(localObject4);
            if (bool)
            {
              localObject4 = new com/sun/pdfview/font/Type3Font;
              ((Type3Font)localObject4).<init>((String)localObject7, paramPDFObject, paramHashMap, (PDFFontDescriptor)localObject1);
            }
            else
            {
              localObject4 = "CIDFontType2";
              bool = ((String)localObject5).equals(localObject4);
              if (bool)
              {
                localObject4 = new com/sun/pdfview/font/CIDFontType2;
                ((CIDFontType2)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
              }
              else
              {
                localObject4 = "CIDFontType0";
                bool = ((String)localObject5).equals(localObject4);
                if (bool)
                {
                  localObject4 = new com/sun/pdfview/font/CIDFontType2;
                  ((CIDFontType2)localObject4).<init>((String)localObject7, paramPDFObject, (PDFFontDescriptor)localObject1);
                }
                else
                {
                  localObject4 = new com/sun/pdfview/PDFParseException;
                  localObject1 = new java/lang/StringBuilder;
                  localObject6 = "Don't know how to handle a '";
                  ((StringBuilder)localObject1).<init>((String)localObject6);
                  localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
                  localObject6 = "' font";
                  localObject1 = ((StringBuilder)localObject1).append((String)localObject6);
                  localObject1 = ((StringBuilder)localObject1).toString();
                  ((PDFParseException)localObject4).<init>((String)localObject1);
                  throw ((Throwable)localObject4);
                  label614:
                  localObject6 = null;
                }
              }
            }
          }
        }
      }
      else
      {
        localObject7 = null;
        continue;
        label626:
        localObject5 = localObject4;
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof PDFFont;
    String str1;
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (PDFFont)paramObject;
      str1 = ((PDFFont)paramObject).getBaseFont();
      String str2 = getBaseFont();
      bool = str1.equals(str2);
    }
  }
  
  public String getBaseFont()
  {
    return this.baseFont;
  }
  
  public PDFGlyph getCachedGlyph(char paramChar, String paramString)
  {
    Object localObject1 = this.charCache;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.charCache = ((Map)localObject1);
    }
    localObject1 = this.charCache;
    Object localObject2 = new java/lang/Character;
    ((Character)localObject2).<init>(paramChar);
    localObject1 = (PDFGlyph)((Map)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = getGlyph(paramChar, paramString);
      localObject2 = this.charCache;
      Character localCharacter = new java/lang/Character;
      localCharacter.<init>(paramChar);
      ((Map)localObject2).put(localCharacter, localObject1);
    }
    return (PDFGlyph)localObject1;
  }
  
  public PDFFontDescriptor getDescriptor()
  {
    return this.descriptor;
  }
  
  public PDFFontEncoding getEncoding()
  {
    return this.encoding;
  }
  
  protected abstract PDFGlyph getGlyph(char paramChar, String paramString);
  
  public List getGlyphs(String paramString)
  {
    Object localObject = this.encoding;
    if (localObject != null)
    {
      localObject = this.encoding.getGlyphs(this, paramString);
      return (List)localObject;
    }
    char[] arrayOfChar = paramString.toCharArray();
    ArrayList localArrayList = new java/util/ArrayList;
    int i = arrayOfChar.length;
    localArrayList.<init>(i);
    i = 0;
    localObject = null;
    for (;;)
    {
      int j = arrayOfChar.length;
      if (i >= j)
      {
        localObject = localArrayList;
        break;
      }
      j = (char)(arrayOfChar[i] & 0xFF);
      PDFGlyph localPDFGlyph = getCachedGlyph(j, null);
      localArrayList.add(localPDFGlyph);
      i += 1;
    }
  }
  
  public String getSubtype()
  {
    return this.subtype;
  }
  
  public PDFCMap getUnicodeMap()
  {
    return this.unicodeMap;
  }
  
  public int hashCode()
  {
    return getBaseFont().hashCode();
  }
  
  public void setBaseFont(String paramString)
  {
    this.baseFont = paramString;
  }
  
  public void setDescriptor(PDFFontDescriptor paramPDFFontDescriptor)
  {
    this.descriptor = paramPDFFontDescriptor;
  }
  
  public void setEncoding(PDFFontEncoding paramPDFFontEncoding)
  {
    this.encoding = paramPDFFontEncoding;
  }
  
  public void setSubtype(String paramString)
  {
    this.subtype = paramString;
  }
  
  public void setUnicodeMap(PDFCMap paramPDFCMap)
  {
    this.unicodeMap = paramPDFCMap;
  }
  
  public String toString()
  {
    return getBaseFont();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\PDFFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */