package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class LocaTable
  extends TrueTypeTable
{
  private boolean isLong;
  private int[] offsets;
  
  protected LocaTable(TrueTypeFont paramTrueTypeFont)
  {
    super(1819239265);
    int j = ((MaxpTable)paramTrueTypeFont.getTable("maxp")).getNumGlyphs();
    Object localObject = (HeadTable)paramTrueTypeFont.getTable("head");
    int k = ((HeadTable)localObject).getIndexToLocFormat();
    if (k == i) {
      k = i;
    }
    for (;;)
    {
      this.isLong = k;
      localObject = new int[j + 1];
      this.offsets = ((int[])localObject);
      return;
      k = 0;
      localObject = null;
    }
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = 0;
    int[] arrayOfInt = this.offsets;
    int j = arrayOfInt.length;
    if (i >= j)
    {
      localb.j();
      return localb;
    }
    boolean bool = isLongFormat();
    int k;
    if (bool)
    {
      arrayOfInt = this.offsets;
      k = arrayOfInt[i];
      localb.f(k);
    }
    for (;;)
    {
      i += 1;
      break;
      arrayOfInt = this.offsets;
      k = (short)(arrayOfInt[i] / 2);
      localb.a(k);
    }
  }
  
  public int getLength()
  {
    boolean bool = isLongFormat();
    int[] arrayOfInt;
    if (bool) {
      arrayOfInt = this.offsets;
    }
    for (int i = arrayOfInt.length * 4;; i = arrayOfInt.length * 2)
    {
      return i;
      arrayOfInt = this.offsets;
    }
  }
  
  public int getOffset(int paramInt)
  {
    return this.offsets[paramInt];
  }
  
  public int getSize(int paramInt)
  {
    int[] arrayOfInt = this.offsets;
    int i = paramInt + 1;
    int j = arrayOfInt[i];
    i = this.offsets[paramInt];
    return j - i;
  }
  
  public boolean isLongFormat()
  {
    return this.isLong;
  }
  
  public void setData(b paramb)
  {
    int i = 0;
    int[] arrayOfInt = this.offsets;
    int j = arrayOfInt.length;
    if (i >= j) {
      return;
    }
    boolean bool = isLongFormat();
    int k;
    if (bool)
    {
      arrayOfInt = this.offsets;
      k = paramb.l();
      arrayOfInt[i] = k;
    }
    for (;;)
    {
      i += 1;
      break;
      arrayOfInt = this.offsets;
      int m = paramb.o();
      k = ((char)-1 & m) * '\002';
      arrayOfInt[i] = k;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\LocaTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */