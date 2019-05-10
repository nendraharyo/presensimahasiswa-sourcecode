package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class HheaTable
  extends TrueTypeTable
{
  private short advanceWidthMax;
  private short ascent;
  private short caretOffset;
  private short caretSlopeRise;
  private short caretSlopeRun;
  private short descent;
  private short lineGap;
  private short metricDataFormat;
  private short minLeftSideBearing;
  private short minRightSideBearing;
  private short numOfLongHorMetrics;
  private int version;
  private short xMaxExtent;
  
  protected HheaTable()
  {
    super(1751474532);
    setVersion(65536);
  }
  
  public short getAdvanceWidthMax()
  {
    return this.advanceWidthMax;
  }
  
  public short getAscent()
  {
    return this.ascent;
  }
  
  public short getCaretOffset()
  {
    return this.caretOffset;
  }
  
  public short getCaretSlopeRise()
  {
    return this.caretSlopeRise;
  }
  
  public short getCaretSlopeRun()
  {
    return this.caretSlopeRun;
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = getVersion();
    localb.f(i);
    i = getAscent();
    localb.a(i);
    short s = getDescent();
    localb.a(s);
    s = getLineGap();
    localb.a(s);
    s = getAdvanceWidthMax();
    localb.a(s);
    s = getMinLeftSideBearing();
    localb.a(s);
    s = getMinRightSideBearing();
    localb.a(s);
    s = getXMaxExtent();
    localb.a(s);
    s = getCaretSlopeRise();
    localb.a(s);
    s = getCaretSlopeRun();
    localb.a(s);
    s = getCaretOffset();
    localb.a(s);
    localb.a((short)0);
    localb.a((short)0);
    localb.a((short)0);
    localb.a((short)0);
    s = getMetricDataFormat();
    localb.a(s);
    s = (short)getNumOfLongHorMetrics();
    localb.a(s);
    localb.j();
    return localb;
  }
  
  public short getDescent()
  {
    return this.descent;
  }
  
  public int getLength()
  {
    return 36;
  }
  
  public short getLineGap()
  {
    return this.lineGap;
  }
  
  public short getMetricDataFormat()
  {
    return this.metricDataFormat;
  }
  
  public short getMinLeftSideBearing()
  {
    return this.minLeftSideBearing;
  }
  
  public short getMinRightSideBearing()
  {
    return this.minRightSideBearing;
  }
  
  public int getNumOfLongHorMetrics()
  {
    return this.numOfLongHorMetrics & (char)-1;
  }
  
  public int getVersion()
  {
    return this.version;
  }
  
  public short getXMaxExtent()
  {
    return this.xMaxExtent;
  }
  
  public void setAdvanceWidthMax(short paramShort)
  {
    this.advanceWidthMax = paramShort;
  }
  
  public void setAscent(short paramShort)
  {
    this.ascent = paramShort;
  }
  
  public void setCaretOffset(short paramShort)
  {
    this.caretOffset = paramShort;
  }
  
  public void setCaretSlopeRise(short paramShort)
  {
    this.caretSlopeRise = paramShort;
  }
  
  public void setCaretSlopeRun(short paramShort)
  {
    this.caretSlopeRun = paramShort;
  }
  
  public void setData(b paramb)
  {
    int i = paramb.c();
    int j = 36;
    if (i != j)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Bad Head table size");
      throw localIllegalArgumentException;
    }
    i = paramb.l();
    setVersion(i);
    i = paramb.o();
    setAscent(i);
    short s = paramb.o();
    setDescent(s);
    s = paramb.o();
    setLineGap(s);
    s = paramb.o();
    setAdvanceWidthMax(s);
    s = paramb.o();
    setMinLeftSideBearing(s);
    s = paramb.o();
    setMinRightSideBearing(s);
    s = paramb.o();
    setXMaxExtent(s);
    s = paramb.o();
    setCaretSlopeRise(s);
    s = paramb.o();
    setCaretSlopeRun(s);
    s = paramb.o();
    setCaretOffset(s);
    paramb.o();
    paramb.o();
    paramb.o();
    paramb.o();
    s = paramb.o();
    setMetricDataFormat(s);
    s = paramb.o();
    setNumOfLongHorMetrics(s);
  }
  
  public void setDescent(short paramShort)
  {
    this.descent = paramShort;
  }
  
  public void setLineGap(short paramShort)
  {
    this.lineGap = paramShort;
  }
  
  public void setMetricDataFormat(short paramShort)
  {
    this.metricDataFormat = paramShort;
  }
  
  public void setMinLeftSideBearing(short paramShort)
  {
    this.minLeftSideBearing = paramShort;
  }
  
  public void setMinRightSideBearing(short paramShort)
  {
    this.minRightSideBearing = paramShort;
  }
  
  public void setNumOfLongHorMetrics(short paramShort)
  {
    this.numOfLongHorMetrics = paramShort;
  }
  
  public void setVersion(int paramInt)
  {
    this.version = paramInt;
  }
  
  public void setXMaxExtent(short paramShort)
  {
    this.xMaxExtent = paramShort;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = "    ";
    Object localObject2 = new java/lang/StringBuilder;
    String str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("Version             : ");
    str = Integer.toHexString(getVersion());
    localObject2 = str + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("Ascent              : ");
    int i = getAscent();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("Descent             : ");
    i = getDescent();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("LineGap             : ");
    i = getLineGap();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("AdvanceWidthMax     : ");
    i = getAdvanceWidthMax();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MinLSB              : ");
    i = getMinLeftSideBearing();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MinRSB              : ");
    i = getMinRightSideBearing();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxExtent           : ");
    i = getXMaxExtent();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("CaretSlopeRise      : ");
    i = getCaretSlopeRise();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("CaretSlopeRun       : ");
    i = getCaretSlopeRun();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("CaretOffset         : ");
    i = getCaretOffset();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MetricDataFormat    : ");
    i = getMetricDataFormat();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject1 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject1);
    localObject1 = ((StringBuilder)localObject2).append("NumOfLongHorMetrics : ");
    int j = getNumOfLongHorMetrics();
    localObject1 = j + "\n";
    localStringBuffer.append((String)localObject1);
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\HheaTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */