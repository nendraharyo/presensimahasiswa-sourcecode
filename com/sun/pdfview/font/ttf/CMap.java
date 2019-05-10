package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.io.PrintStream;

public abstract class CMap
{
  private short format;
  private short language;
  
  protected CMap(short paramShort1, short paramShort2)
  {
    this.format = paramShort1;
    this.language = paramShort2;
  }
  
  public static CMap createMap(short paramShort1, short paramShort2)
  {
    Object localObject1;
    switch (paramShort1)
    {
    default: 
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      String str = "Unsupport CMap format: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = paramShort1;
      ((PrintStream)localObject1).println((String)localObject2);
      localObject1 = null;
    }
    for (;;)
    {
      return (CMap)localObject1;
      localObject1 = new com/sun/pdfview/font/ttf/CMapFormat0;
      ((CMapFormat0)localObject1).<init>(paramShort2);
      continue;
      localObject1 = new com/sun/pdfview/font/ttf/CMapFormat4;
      ((CMapFormat4)localObject1).<init>(paramShort2);
      continue;
      localObject1 = new com/sun/pdfview/font/ttf/CMapFormat6;
      ((CMapFormat6)localObject1).<init>(paramShort2);
    }
  }
  
  public static CMap getMap(b paramb)
  {
    short s = paramb.o();
    int i = paramb.o() & (char)-1;
    int k = paramb.f();
    i = Math.min(i, k);
    paramb.d(i);
    i = paramb.o();
    CMap localCMap = createMap(s, i);
    if (localCMap == null)
    {
      s = 0;
      localCMap = null;
    }
    for (;;)
    {
      return localCMap;
      int j = paramb.f();
      localCMap.setData(j, paramb);
    }
  }
  
  public abstract b getData();
  
  public short getFormat()
  {
    return this.format;
  }
  
  public short getLanguage()
  {
    return this.language;
  }
  
  public abstract short getLength();
  
  public abstract byte map(byte paramByte);
  
  public abstract char map(char paramChar);
  
  public abstract char reverseMap(short paramShort);
  
  public abstract void setData(int paramInt, b paramb);
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject = String.valueOf("        ");
    localStringBuilder.<init>((String)localObject);
    localObject = localStringBuilder.append(" format: ");
    int i = getFormat();
    localObject = ((StringBuilder)localObject).append(i).append(" length: ");
    i = getLength();
    localObject = ((StringBuilder)localObject).append(i).append(" language: ");
    i = getLanguage();
    return i + "\n";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */