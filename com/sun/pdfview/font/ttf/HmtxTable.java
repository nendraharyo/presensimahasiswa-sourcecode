package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.util.Arrays;

public class HmtxTable
  extends TrueTypeTable
{
  short[] advanceWidths;
  short[] leftSideBearings;
  
  protected HmtxTable(TrueTypeFont paramTrueTypeFont)
  {
    super(1752003704);
    int i = ((MaxpTable)paramTrueTypeFont.getTable("maxp")).getNumGlyphs();
    short[] arrayOfShort = new short[((HheaTable)paramTrueTypeFont.getTable("hhea")).getNumOfLongHorMetrics()];
    this.advanceWidths = arrayOfShort;
    arrayOfShort = new short[i];
    this.leftSideBearings = arrayOfShort;
  }
  
  public short getAdvance(int paramInt)
  {
    short[] arrayOfShort1 = this.advanceWidths;
    int i = arrayOfShort1.length;
    if (paramInt < i) {
      arrayOfShort1 = this.advanceWidths;
    }
    int j;
    for (i = arrayOfShort1[paramInt];; i = arrayOfShort1[j])
    {
      return i;
      arrayOfShort1 = this.advanceWidths;
      short[] arrayOfShort2 = this.advanceWidths;
      j = arrayOfShort2.length + -1;
    }
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = 0;
    for (;;)
    {
      short[] arrayOfShort = this.leftSideBearings;
      int j = arrayOfShort.length;
      if (i >= j)
      {
        localb.j();
        return localb;
      }
      arrayOfShort = this.advanceWidths;
      j = arrayOfShort.length;
      if (i < j)
      {
        arrayOfShort = this.advanceWidths;
        j = arrayOfShort[i];
        localb.a(j);
      }
      arrayOfShort = this.leftSideBearings;
      short s = arrayOfShort[i];
      localb.a(s);
      i += 1;
    }
  }
  
  public short getLeftSideBearing(int paramInt)
  {
    return this.leftSideBearings[paramInt];
  }
  
  public int getLength()
  {
    int i = this.advanceWidths.length * 2;
    int j = this.leftSideBearings.length * 2;
    return i + j;
  }
  
  public void setData(b paramb)
  {
    int i = 0;
    for (;;)
    {
      short[] arrayOfShort1 = this.leftSideBearings;
      int j = arrayOfShort1.length;
      if (i < j)
      {
        boolean bool = paramb.s();
        if (bool) {}
      }
      else
      {
        arrayOfShort1 = this.advanceWidths;
        k = arrayOfShort1.length;
        short[] arrayOfShort2;
        if (i < k)
        {
          arrayOfShort1 = this.advanceWidths;
          arrayOfShort2 = this.advanceWidths;
          m = arrayOfShort2.length + -1;
          Arrays.fill(arrayOfShort1, i, m, (short)0);
        }
        arrayOfShort1 = this.leftSideBearings;
        k = arrayOfShort1.length;
        if (i < k)
        {
          arrayOfShort1 = this.leftSideBearings;
          arrayOfShort2 = this.leftSideBearings;
          m = arrayOfShort2.length + -1;
          Arrays.fill(arrayOfShort1, i, m, (short)0);
        }
        return;
      }
      arrayOfShort1 = this.advanceWidths;
      int k = arrayOfShort1.length;
      if (i < k)
      {
        arrayOfShort1 = this.advanceWidths;
        m = paramb.o();
        arrayOfShort1[i] = m;
      }
      arrayOfShort1 = this.leftSideBearings;
      int m = paramb.o();
      arrayOfShort1[i] = m;
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\HmtxTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */