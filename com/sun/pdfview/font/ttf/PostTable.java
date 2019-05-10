package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.io.PrintStream;

public class PostTable
  extends TrueTypeTable
{
  private int format;
  private short isFixedPitch;
  private int italicAngle;
  private int maxMemType1;
  private int maxMemType42;
  private int minMemType1;
  private int minMemType42;
  private PostTable.PostMap nameMap;
  private short underlinePosition;
  private short underlineThickness;
  
  protected PostTable()
  {
    super(1886352244);
    PostTable.PostMap localPostMap = new com/sun/pdfview/font/ttf/PostTable$PostMap;
    localPostMap.<init>(this);
    this.nameMap = localPostMap;
  }
  
  public b getData()
  {
    b localb1 = b.g(getLength());
    int i = getFormat();
    localb1.f(i);
    i = getItalicAngle();
    localb1.f(i);
    i = getUnderlinePosition();
    localb1.a(i);
    short s = getUnderlineThickness();
    localb1.a(s);
    s = getIsFixedPitch();
    localb1.a(s);
    localb1.a((short)0);
    int j = getMinMemType42();
    localb1.f(j);
    j = getMaxMemType42();
    localb1.f(j);
    j = getMinMemType1();
    localb1.f(j);
    j = getMaxMemType1();
    localb1.f(j);
    b localb2 = this.nameMap.getData();
    localb1.a(localb2);
    localb1.j();
    return localb1;
  }
  
  public int getFormat()
  {
    return this.format;
  }
  
  public String getGlyphName(char paramChar)
  {
    return this.nameMap.getCharName(paramChar);
  }
  
  public short getGlyphNameIndex(String paramString)
  {
    return this.nameMap.getCharIndex(paramString);
  }
  
  public short getIsFixedPitch()
  {
    return this.isFixedPitch;
  }
  
  public int getItalicAngle()
  {
    return this.italicAngle;
  }
  
  public int getLength()
  {
    int i = 32;
    PostTable.PostMap localPostMap = this.nameMap;
    if (localPostMap != null)
    {
      localPostMap = this.nameMap;
      int j = localPostMap.getLength();
      i += j;
    }
    return i;
  }
  
  public int getMaxMemType1()
  {
    return this.maxMemType1;
  }
  
  public int getMaxMemType42()
  {
    return this.maxMemType42;
  }
  
  public int getMinMemType1()
  {
    return this.minMemType1;
  }
  
  public int getMinMemType42()
  {
    return this.minMemType42;
  }
  
  public short getUnderlinePosition()
  {
    return this.underlinePosition;
  }
  
  public short getUnderlineThickness()
  {
    return this.underlineThickness;
  }
  
  public void setData(b paramb)
  {
    int i = paramb.l();
    setFormat(i);
    i = paramb.l();
    setItalicAngle(i);
    i = paramb.o();
    setUnderlinePosition(i);
    short s = paramb.o();
    setUnderlineThickness(s);
    s = paramb.o();
    setIsFixedPitch(s);
    paramb.o();
    int j = paramb.l();
    setMinMemType42(j);
    j = paramb.l();
    setMaxMemType42(j);
    j = paramb.l();
    setMinMemType1(j);
    j = paramb.l();
    setMaxMemType1(j);
    j = this.format;
    Object localObject1;
    switch (j)
    {
    default: 
      localObject1 = new com/sun/pdfview/font/ttf/PostTable$PostMap;
      ((PostTable.PostMap)localObject1).<init>(this);
      this.nameMap = ((PostTable.PostMap)localObject1);
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown post map type: ");
      int k = this.format;
      String str = Integer.toHexString(k);
      localObject2 = str;
      ((PrintStream)localObject1).println((String)localObject2);
    }
    for (;;)
    {
      this.nameMap.setData(paramb);
      return;
      localObject1 = new com/sun/pdfview/font/ttf/PostTable$PostMapFormat0;
      ((PostTable.PostMapFormat0)localObject1).<init>(this);
      this.nameMap = ((PostTable.PostMap)localObject1);
      continue;
      localObject1 = new com/sun/pdfview/font/ttf/PostTable$PostMapFormat2;
      ((PostTable.PostMapFormat2)localObject1).<init>(this);
      this.nameMap = ((PostTable.PostMap)localObject1);
      continue;
      localObject1 = new com/sun/pdfview/font/ttf/PostTable$PostMap;
      ((PostTable.PostMap)localObject1).<init>(this);
      this.nameMap = ((PostTable.PostMap)localObject1);
    }
  }
  
  public void setFormat(int paramInt)
  {
    this.format = paramInt;
  }
  
  public void setIsFixedPitch(short paramShort)
  {
    this.isFixedPitch = paramShort;
  }
  
  public void setItalicAngle(int paramInt)
  {
    this.italicAngle = paramInt;
  }
  
  public void setMaxMemType1(int paramInt)
  {
    this.maxMemType1 = paramInt;
  }
  
  public void setMaxMemType42(int paramInt)
  {
    this.maxMemType42 = paramInt;
  }
  
  public void setMinMemType1(int paramInt)
  {
    this.minMemType1 = paramInt;
  }
  
  public void setMinMemType42(int paramInt)
  {
    this.minMemType42 = paramInt;
  }
  
  public void setUnderlinePosition(short paramShort)
  {
    this.underlinePosition = paramShort;
  }
  
  public void setUnderlineThickness(short paramShort)
  {
    this.underlineThickness = paramShort;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\PostTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */