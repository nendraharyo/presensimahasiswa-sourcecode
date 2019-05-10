package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class TrueTypeTable
{
  public static final int CMAP_TABLE = 1668112752;
  public static final int GLYF_TABLE = 1735162214;
  public static final int HEAD_TABLE = 1751474532;
  public static final int HHEA_TABLE = 1751672161;
  public static final int HMTX_TABLE = 1752003704;
  public static final int LOCA_TABLE = 1819239265;
  public static final int MAXP_TABLE = 1835104368;
  public static final int NAME_TABLE = 1851878757;
  public static final int POST_TABLE = 1886352244;
  private b data;
  private int tag;
  
  protected TrueTypeTable(int paramInt)
  {
    this.tag = paramInt;
  }
  
  public static TrueTypeTable createTable(TrueTypeFont paramTrueTypeFont, String paramString)
  {
    return createTable(paramTrueTypeFont, paramString, null);
  }
  
  public static TrueTypeTable createTable(TrueTypeFont paramTrueTypeFont, String paramString, b paramb)
  {
    int i = stringToTag(paramString);
    Object localObject;
    switch (i)
    {
    default: 
      localObject = new com/sun/pdfview/font/ttf/TrueTypeTable;
      ((TrueTypeTable)localObject).<init>(i);
    }
    for (;;)
    {
      if (paramb != null) {
        ((TrueTypeTable)localObject).setData(paramb);
      }
      return (TrueTypeTable)localObject;
      localObject = new com/sun/pdfview/font/ttf/CmapTable;
      ((CmapTable)localObject).<init>();
      continue;
      localObject = new com/sun/pdfview/font/ttf/GlyfTable;
      ((GlyfTable)localObject).<init>(paramTrueTypeFont);
      continue;
      localObject = new com/sun/pdfview/font/ttf/HeadTable;
      ((HeadTable)localObject).<init>();
      continue;
      localObject = new com/sun/pdfview/font/ttf/HheaTable;
      ((HheaTable)localObject).<init>();
      continue;
      localObject = new com/sun/pdfview/font/ttf/HmtxTable;
      ((HmtxTable)localObject).<init>(paramTrueTypeFont);
      continue;
      localObject = new com/sun/pdfview/font/ttf/LocaTable;
      ((LocaTable)localObject).<init>(paramTrueTypeFont);
      continue;
      localObject = new com/sun/pdfview/font/ttf/MaxpTable;
      ((MaxpTable)localObject).<init>();
      continue;
      localObject = new com/sun/pdfview/font/ttf/NameTable;
      ((NameTable)localObject).<init>();
      continue;
      localObject = new com/sun/pdfview/font/ttf/PostTable;
      ((PostTable)localObject).<init>();
    }
  }
  
  public static int stringToTag(String paramString)
  {
    Object localObject1 = paramString.toCharArray();
    int i = localObject1.length;
    int j = 4;
    if (i != j)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Bad tag length: ");
      localObject2 = paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    i = localObject1[0] << '\030';
    j = localObject1[1] << '\020';
    i |= j;
    j = localObject1[2] << '\b';
    i |= j;
    return localObject1[3] | i;
  }
  
  public static String tagToString(int paramInt)
  {
    char[] arrayOfChar = new char[4];
    int i = (char)(paramInt >> 24 & 0xFF);
    arrayOfChar[0] = i;
    i = (char)(paramInt >> 16 & 0xFF);
    arrayOfChar[1] = i;
    i = (char)(paramInt >> 8 & 0xFF);
    arrayOfChar[2] = i;
    i = (char)(paramInt & 0xFF);
    arrayOfChar[3] = i;
    String str = new java/lang/String;
    str.<init>(arrayOfChar);
    return str;
  }
  
  public b getData()
  {
    return this.data;
  }
  
  public int getLength()
  {
    return getData().c();
  }
  
  public int getTag()
  {
    return this.tag;
  }
  
  public void setData(b paramb)
  {
    this.data = paramb;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("    ");
    int i = getTag();
    Object localObject2 = tagToString(i);
    localObject1 = (String)localObject2 + " Table.  Data is: ";
    localObject2 = getData();
    if (localObject2 == null)
    {
      localObject2 = new java/lang/StringBuilder;
      localObject1 = String.valueOf(localObject1);
      ((StringBuilder)localObject2).<init>((String)localObject1);
    }
    for (localObject1 = "not set";; localObject1 = "set")
    {
      return (String)localObject1;
      localObject2 = new java/lang/StringBuilder;
      localObject1 = String.valueOf(localObject1);
      ((StringBuilder)localObject2).<init>((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\TrueTypeTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */