package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class Glyf
{
  private boolean isCompound;
  private short maxX;
  private short maxY;
  private short minX;
  private short minY;
  private short numContours;
  
  public static Glyf getGlyf(b paramb)
  {
    short s1 = paramb.o();
    if (s1 == 0)
    {
      localObject = new com/sun/pdfview/font/ttf/Glyf;
      ((Glyf)localObject).<init>();
    }
    for (;;)
    {
      ((Glyf)localObject).setNumContours(s1);
      s1 = paramb.o();
      ((Glyf)localObject).setMinX(s1);
      s1 = paramb.o();
      ((Glyf)localObject).setMinY(s1);
      s1 = paramb.o();
      ((Glyf)localObject).setMaxX(s1);
      s1 = paramb.o();
      ((Glyf)localObject).setMaxY(s1);
      ((Glyf)localObject).setData(paramb);
      return (Glyf)localObject;
      short s2 = -1;
      if (s1 == s2)
      {
        localObject = new com/sun/pdfview/font/ttf/GlyfCompound;
        ((GlyfCompound)localObject).<init>();
      }
      else
      {
        if (s1 <= 0) {
          break;
        }
        localObject = new com/sun/pdfview/font/ttf/GlyfSimple;
        ((GlyfSimple)localObject).<init>();
      }
    }
    Object localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Unknown glyf type: ");
    String str = s1;
    ((IllegalArgumentException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    short s = getNumContours();
    localb.a(s);
    s = getMinX();
    localb.a(s);
    s = getMinY();
    localb.a(s);
    s = getMaxX();
    localb.a(s);
    s = getMaxY();
    localb.a(s);
    return localb;
  }
  
  public short getLength()
  {
    return 10;
  }
  
  public short getMaxX()
  {
    return this.maxX;
  }
  
  public short getMaxY()
  {
    return this.maxY;
  }
  
  public short getMinX()
  {
    return this.minX;
  }
  
  public short getMinY()
  {
    return this.minY;
  }
  
  public short getNumContours()
  {
    return this.numContours;
  }
  
  public boolean isCompound()
  {
    return this.isCompound;
  }
  
  protected void setCompound(boolean paramBoolean)
  {
    this.isCompound = paramBoolean;
  }
  
  public void setData(b paramb) {}
  
  protected void setMaxX(short paramShort)
  {
    this.maxX = paramShort;
  }
  
  protected void setMaxY(short paramShort)
  {
    this.maxY = paramShort;
  }
  
  protected void setMinX(short paramShort)
  {
    this.minX = paramShort;
  }
  
  protected void setMinY(short paramShort)
  {
    this.minY = paramShort;
  }
  
  protected void setNumContours(short paramShort)
  {
    this.numContours = paramShort;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\Glyf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */