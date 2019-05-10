package com.sun.pdfview.font;

import com.sun.pdfview.PDFObject;
import java.io.IOException;
import java.util.HashMap;

public abstract class PDFCMap
{
  private static HashMap cache;
  
  public static PDFCMap getCMap(PDFObject paramPDFObject)
  {
    int i = paramPDFObject.getType();
    int j = 4;
    if (i == j) {}
    for (Object localObject = getCMap(paramPDFObject.getStringValue());; localObject = parseCMap(paramPDFObject))
    {
      return (PDFCMap)localObject;
      i = paramPDFObject.getType();
      j = 7;
      if (i != j) {
        break;
      }
    }
    localObject = new java/io/IOException;
    ((IOException)localObject).<init>("CMap type not Name or Stream!");
    throw ((Throwable)localObject);
  }
  
  public static PDFCMap getCMap(String paramString)
  {
    Object localObject1 = cache;
    if (localObject1 == null) {
      populateCache();
    }
    localObject1 = cache;
    boolean bool = ((HashMap)localObject1).containsKey(paramString);
    if (!bool)
    {
      localObject1 = new java/io/IOException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown CMap: ");
      localObject2 = paramString;
      ((IOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (PDFCMap)cache.get(paramString);
  }
  
  protected static PDFCMap parseCMap(PDFObject paramPDFObject)
  {
    IOException localIOException = new java/io/IOException;
    localIOException.<init>("Parsing CMap Files Unsupported!");
    throw localIOException;
  }
  
  protected static void populateCache()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    cache = localHashMap;
    localHashMap = cache;
    PDFCMap.1 local1 = new com/sun/pdfview/font/PDFCMap$1;
    local1.<init>();
    localHashMap.put("Identity-H", local1);
  }
  
  public int getFontID(char paramChar)
  {
    return 0;
  }
  
  public abstract char map(char paramChar);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\PDFCMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */