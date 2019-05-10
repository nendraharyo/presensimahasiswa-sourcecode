package com.sun.pdfview.font;

import com.sun.pdfview.PDFObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PDFFontEncoding
{
  private static final int TYPE_CMAP = 1;
  private static final int TYPE_ENCODING;
  private int[] baseEncoding;
  private PDFCMap cmap;
  private Map differences;
  private int type;
  
  public PDFFontEncoding(String paramString, PDFObject paramPDFObject)
  {
    int k = paramPDFObject.getType();
    int m = 4;
    boolean bool1;
    if (k == m)
    {
      localObject1 = "Type0";
      bool1 = paramString.equals(localObject1);
      if (bool1)
      {
        this.type = i;
        localObject1 = PDFCMap.getCMap(paramPDFObject.getStringValue());
        this.cmap = ((PDFCMap)localObject1);
      }
    }
    for (;;)
    {
      return;
      this.type = 0;
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.differences = ((Map)localObject1);
      localObject1 = paramPDFObject.getStringValue();
      localObject1 = getBaseEncoding((String)localObject1);
      this.baseEncoding = ((int[])localObject1);
      continue;
      localObject1 = paramPDFObject.getDictRef("Type").getStringValue();
      localObject2 = "Encoding";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      if (bool2)
      {
        this.type = 0;
        parseEncoding(paramPDFObject);
      }
      else
      {
        localObject2 = "CMap";
        bool1 = ((String)localObject1).equals(localObject2);
        if (!bool1) {
          break;
        }
        this.type = i;
        localObject1 = PDFCMap.getCMap(paramPDFObject);
        this.cmap = ((PDFCMap)localObject1);
      }
    }
    Object localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Uknown encoding type: ");
    j = this.type;
    localObject2 = j;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private int[] getBaseEncoding(String paramString)
  {
    Object localObject1 = "MacRomanEncoding";
    boolean bool = paramString.equals(localObject1);
    if (bool) {
      localObject1 = FontSupport.macRomanEncoding;
    }
    for (;;)
    {
      return (int[])localObject1;
      localObject1 = "MacExpertEncoding";
      bool = paramString.equals(localObject1);
      if (bool)
      {
        localObject1 = FontSupport.type1CExpertCharset;
      }
      else
      {
        localObject1 = "WinAnsiEncoding";
        bool = paramString.equals(localObject1);
        if (!bool) {
          break;
        }
        localObject1 = FontSupport.winAnsiEncoding;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Unknown encoding: ");
    localObject2 = paramString;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private PDFGlyph getGlyphFromCMap(PDFFont paramPDFFont, char paramChar)
  {
    PDFCMap localPDFCMap1 = this.cmap;
    int i = localPDFCMap1.getFontID(paramChar);
    PDFCMap localPDFCMap2 = this.cmap;
    char c = localPDFCMap2.map(paramChar);
    boolean bool = paramPDFFont instanceof Type0Font;
    if (bool) {
      paramPDFFont = ((Type0Font)paramPDFFont).getDescendantFont(i);
    }
    return paramPDFFont.getCachedGlyph(c, null);
  }
  
  private PDFGlyph getGlyphFromEncoding(PDFFont paramPDFFont, char paramChar)
  {
    int i = 0;
    Object localObject1 = null;
    char c = (char)(paramChar & 0xFF);
    Object localObject2 = this.differences;
    Character localCharacter = new java/lang/Character;
    localCharacter.<init>(c);
    boolean bool = ((Map)localObject2).containsKey(localCharacter);
    if (bool)
    {
      localObject1 = this.differences;
      localObject2 = new java/lang/Character;
      ((Character)localObject2).<init>(c);
      localObject1 = (String)((Map)localObject1).get(localObject2);
    }
    for (;;)
    {
      return paramPDFFont.getCachedGlyph(c, (String)localObject1);
      localObject2 = this.baseEncoding;
      if (localObject2 != null)
      {
        i = this.baseEncoding[c];
        localObject1 = FontSupport.getName(i);
      }
    }
  }
  
  public List getGlyphs(PDFFont paramPDFFont, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramString.length();
    localArrayList.<init>(i);
    char[] arrayOfChar = paramString.toCharArray();
    i = 0;
    PDFGlyph localPDFGlyph1 = null;
    int j = arrayOfChar.length;
    if (i >= j) {
      return localArrayList;
    }
    int k = this.type;
    switch (k)
    {
    default: 
    case 0: 
      for (;;)
      {
        i += 1;
        break;
        k = arrayOfChar[i];
        PDFGlyph localPDFGlyph2 = getGlyphFromEncoding(paramPDFFont, k);
        localArrayList.add(localPDFGlyph2);
      }
    }
    int m = (char)((arrayOfChar[i] & 0xFF) << '\b');
    int n = arrayOfChar.length + -1;
    if (i < n)
    {
      int i1 = i + 1;
      i = (char)((char)(arrayOfChar[i1] & 0xFF) | m);
      m = i1;
    }
    for (;;)
    {
      localPDFGlyph1 = getGlyphFromCMap(paramPDFFont, i);
      localArrayList.add(localPDFGlyph1);
      i = m;
      break;
      int i2 = m;
      m = i;
      i = i2;
    }
  }
  
  public void parseEncoding(PDFObject paramPDFObject)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.differences = ((Map)localObject1);
    localObject1 = paramPDFObject.getDictRef("BaseEncoding");
    if (localObject1 != null)
    {
      localObject1 = ((PDFObject)localObject1).getStringValue();
      localObject1 = getBaseEncoding((String)localObject1);
      this.baseEncoding = ((int[])localObject1);
    }
    localObject1 = paramPDFObject.getDictRef("Differences");
    PDFObject[] arrayOfPDFObject;
    int i;
    int j;
    if (localObject1 != null)
    {
      arrayOfPDFObject = ((PDFObject)localObject1).getArray();
      i = -1;
      j = 0;
      localObject1 = null;
      k = arrayOfPDFObject.length;
      if (j < k) {}
    }
    else
    {
      return;
    }
    Object localObject2 = arrayOfPDFObject[j];
    int k = ((PDFObject)localObject2).getType();
    int m = 2;
    if (k == m)
    {
      localObject3 = arrayOfPDFObject[j];
      i = ((PDFObject)localObject3).getIntValue();
    }
    for (;;)
    {
      j += 1;
      break;
      localObject2 = arrayOfPDFObject[j];
      k = ((PDFObject)localObject2).getType();
      m = 4;
      if (k != m) {
        break label197;
      }
      localObject2 = new java/lang/Character;
      m = (char)i;
      ((Character)localObject2).<init>(m);
      Map localMap = this.differences;
      String str = arrayOfPDFObject[j].getStringValue();
      localMap.put(localObject2, str);
      i += 1;
    }
    label197:
    Object localObject3 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Unexpected type in diff array: ");
    localObject1 = arrayOfPDFObject[j];
    localObject1 = localObject1;
    ((IllegalArgumentException)localObject3).<init>((String)localObject1);
    throw ((Throwable)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\PDFFontEncoding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */