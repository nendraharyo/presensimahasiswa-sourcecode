package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.util.Date;

public class HeadTable
  extends TrueTypeTable
{
  private int checksumAdjustment;
  private long created;
  private short flags;
  private short fontDirectionHint;
  private int fontRevision;
  private short glyphDataFormat;
  private short indexToLocFormat;
  private short lowestRecPPem;
  private short macStyle;
  private int magicNumber;
  private long modified;
  private short unitsPerEm;
  private int version;
  private short xMax;
  private short xMin;
  private short yMax;
  private short yMin;
  
  protected HeadTable()
  {
    super(1751474532);
    setVersion(i);
    setFontRevision(i);
    setChecksumAdjustment(0);
    setMagicNumber(1594834165);
    setFlags((short)0);
    setUnitsPerEm((short)64);
    long l = System.currentTimeMillis();
    setCreated(l);
    l = System.currentTimeMillis();
    setModified(l);
    setXMin((short)0);
    setXMax(s);
    setYMin((short)0);
    setYMax(s);
    setMacStyle((short)0);
    setLowestRecPPem((short)0);
    setFontDirectionHint((short)0);
    setIndexToLocFormat((short)0);
    setGlyphDataFormat((short)0);
  }
  
  public int getChecksumAdjustment()
  {
    return this.checksumAdjustment;
  }
  
  public long getCreated()
  {
    return this.created;
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = getVersion();
    localb.f(i);
    i = getFontRevision();
    localb.f(i);
    i = getChecksumAdjustment();
    localb.f(i);
    i = getMagicNumber();
    localb.f(i);
    i = getFlags();
    localb.a(i);
    short s = getUnitsPerEm();
    localb.a(s);
    long l = getCreated();
    localb.a(l);
    l = getModified();
    localb.a(l);
    s = getXMin();
    localb.a(s);
    s = getXMax();
    localb.a(s);
    s = getYMin();
    localb.a(s);
    s = getYMax();
    localb.a(s);
    s = getMacStyle();
    localb.a(s);
    s = getLowestRecPPem();
    localb.a(s);
    s = getFontDirectionHint();
    localb.a(s);
    s = getIndexToLocFormat();
    localb.a(s);
    s = getGlyphDataFormat();
    localb.a(s);
    localb.j();
    return localb;
  }
  
  public short getFlags()
  {
    return this.flags;
  }
  
  public short getFontDirectionHint()
  {
    return this.fontDirectionHint;
  }
  
  public int getFontRevision()
  {
    return this.fontRevision;
  }
  
  public short getGlyphDataFormat()
  {
    return this.glyphDataFormat;
  }
  
  public short getIndexToLocFormat()
  {
    return this.indexToLocFormat;
  }
  
  public int getLength()
  {
    return 54;
  }
  
  public short getLowestRecPPem()
  {
    return this.lowestRecPPem;
  }
  
  public short getMacStyle()
  {
    return this.macStyle;
  }
  
  public int getMagicNumber()
  {
    return this.magicNumber;
  }
  
  public long getModified()
  {
    return this.modified;
  }
  
  public short getUnitsPerEm()
  {
    return this.unitsPerEm;
  }
  
  public int getVersion()
  {
    return this.version;
  }
  
  public short getXMax()
  {
    return this.xMax;
  }
  
  public short getXMin()
  {
    return this.xMin;
  }
  
  public short getYMax()
  {
    return this.yMax;
  }
  
  public short getYMin()
  {
    return this.yMin;
  }
  
  public void setChecksumAdjustment(int paramInt)
  {
    this.checksumAdjustment = paramInt;
  }
  
  public void setCreated(long paramLong)
  {
    this.created = paramLong;
  }
  
  public void setData(b paramb)
  {
    int i = paramb.c();
    int j = 54;
    if (i != j)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Bad Head table size");
      throw localIllegalArgumentException;
    }
    i = paramb.l();
    setVersion(i);
    i = paramb.l();
    setFontRevision(i);
    i = paramb.l();
    setChecksumAdjustment(i);
    i = paramb.l();
    setMagicNumber(i);
    i = paramb.o();
    setFlags(i);
    short s = paramb.o();
    setUnitsPerEm(s);
    long l = paramb.m();
    setCreated(l);
    l = paramb.m();
    setModified(l);
    s = paramb.o();
    setXMin(s);
    s = paramb.o();
    setXMax(s);
    s = paramb.o();
    setYMin(s);
    s = paramb.o();
    setYMax(s);
    s = paramb.o();
    setMacStyle(s);
    s = paramb.o();
    setLowestRecPPem(s);
    s = paramb.o();
    setFontDirectionHint(s);
    s = paramb.o();
    setIndexToLocFormat(s);
    s = paramb.o();
    setGlyphDataFormat(s);
  }
  
  public void setFlags(short paramShort)
  {
    this.flags = paramShort;
  }
  
  public void setFontDirectionHint(short paramShort)
  {
    this.fontDirectionHint = paramShort;
  }
  
  public void setFontRevision(int paramInt)
  {
    this.fontRevision = paramInt;
  }
  
  public void setGlyphDataFormat(short paramShort)
  {
    this.glyphDataFormat = paramShort;
  }
  
  public void setIndexToLocFormat(short paramShort)
  {
    this.indexToLocFormat = paramShort;
  }
  
  public void setLowestRecPPem(short paramShort)
  {
    this.lowestRecPPem = paramShort;
  }
  
  public void setMacStyle(short paramShort)
  {
    this.macStyle = paramShort;
  }
  
  public void setMagicNumber(int paramInt)
  {
    this.magicNumber = paramInt;
  }
  
  public void setModified(long paramLong)
  {
    this.modified = paramLong;
  }
  
  public void setUnitsPerEm(short paramShort)
  {
    this.unitsPerEm = paramShort;
  }
  
  public void setVersion(int paramInt)
  {
    this.version = paramInt;
  }
  
  public void setXMax(short paramShort)
  {
    this.xMax = paramShort;
  }
  
  public void setXMin(short paramShort)
  {
    this.xMin = paramShort;
  }
  
  public void setYMax(short paramShort)
  {
    this.yMax = paramShort;
  }
  
  public void setYMin(short paramShort)
  {
    this.yMin = paramShort;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = "    ";
    Object localObject2 = new java/lang/StringBuilder;
    Object localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("Version          : ");
    localObject3 = Integer.toHexString(getVersion());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("Revision         : ");
    localObject3 = Integer.toHexString(getFontRevision());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("ChecksumAdj      : ");
    localObject3 = Integer.toHexString(getChecksumAdjustment());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("MagicNumber      : ");
    localObject3 = Integer.toHexString(getMagicNumber());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("Flags            : ");
    localObject3 = Integer.toBinaryString(getFlags());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("UnitsPerEm       : ");
    int i = getUnitsPerEm();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("Created          : ");
    localObject3 = new java/util/Date;
    long l = getCreated();
    ((Date)localObject3).<init>(l);
    localObject2 = localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("Modified         : ");
    localObject3 = new java/util/Date;
    l = getModified();
    ((Date)localObject3).<init>(l);
    localObject2 = localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("XMin             : ");
    i = getXMin();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("XMax             : ");
    i = getXMax();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("YMin             : ");
    i = getYMin();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("YMax             : ");
    i = getYMax();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("MacStyle         : ");
    localObject3 = Integer.toBinaryString(getMacStyle());
    localObject2 = (String)localObject3 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("LowestPPem       : ");
    i = getLowestRecPPem();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("FontDirectionHint: ");
    i = getFontDirectionHint();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject3 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).append("IndexToLocFormat : ");
    i = getIndexToLocFormat();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject1 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject1);
    localObject1 = ((StringBuilder)localObject2).append("GlyphDataFormat  : ");
    int j = getGlyphDataFormat();
    localObject1 = j + "\n";
    localStringBuffer.append((String)localObject1);
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\HeadTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */