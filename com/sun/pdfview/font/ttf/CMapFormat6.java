package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.util.HashMap;

public class CMapFormat6
  extends CMap
{
  private short entryCount;
  private short firstCode;
  private short[] glyphIndexArray;
  private HashMap glyphLookup;
  
  protected CMapFormat6(short paramShort)
  {
    super((short)6, paramShort);
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.glyphLookup = localHashMap;
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = getFormat();
    localb.a(i);
    i = getLength();
    localb.a(i);
    i = getLanguage();
    localb.a(i);
    i = this.firstCode;
    localb.a(i);
    i = this.entryCount;
    localb.a(i);
    i = 0;
    for (;;)
    {
      short[] arrayOfShort = this.glyphIndexArray;
      int k = arrayOfShort.length;
      if (i >= k)
      {
        localb.j();
        return localb;
      }
      arrayOfShort = this.glyphIndexArray;
      short s = arrayOfShort[i];
      localb.a(s);
      int j;
      i += 1;
    }
  }
  
  public short getLength()
  {
    int i = this.entryCount * 2;
    return (short)(10 + i);
  }
  
  public byte map(byte paramByte)
  {
    int i = (char)paramByte;
    i = map(i);
    int k = -128;
    if (i >= k)
    {
      int m = 127;
      if (i <= m) {
        break label29;
      }
    }
    label29:
    int j;
    for (i = 0;; j = (byte)i) {
      return i;
    }
  }
  
  public char map(char paramChar)
  {
    char c1 = this.firstCode;
    char c2;
    short[] arrayOfShort;
    if (paramChar >= c1)
    {
      c1 = this.firstCode;
      c2 = this.entryCount;
      c1 += c2;
      if (paramChar <= c1) {}
    }
    else
    {
      c1 = '\000';
      arrayOfShort = null;
    }
    for (;;)
    {
      return c1;
      arrayOfShort = this.glyphIndexArray;
      c2 = this.firstCode;
      c2 = paramChar - c2;
      c1 = (char)arrayOfShort[c2];
    }
  }
  
  public char reverseMap(short paramShort)
  {
    Object localObject = this.glyphLookup;
    Short localShort = new java/lang/Short;
    localShort.<init>(paramShort);
    localObject = (Short)((HashMap)localObject).get(localShort);
    char c;
    if (localObject == null)
    {
      c = '\000';
      localObject = null;
    }
    for (;;)
    {
      return c;
      c = (char)((Short)localObject).shortValue();
    }
  }
  
  public void setData(int paramInt, b paramb)
  {
    int i = paramb.o();
    this.firstCode = i;
    i = paramb.o();
    this.entryCount = i;
    short[] arrayOfShort = new short[this.entryCount];
    this.glyphIndexArray = arrayOfShort;
    i = 0;
    arrayOfShort = null;
    for (;;)
    {
      Object localObject = this.glyphIndexArray;
      int j = localObject.length;
      if (i >= j) {
        return;
      }
      localObject = this.glyphIndexArray;
      int k = paramb.o();
      localObject[i] = k;
      localObject = this.glyphLookup;
      Short localShort1 = new java/lang/Short;
      short s1 = this.glyphIndexArray[i];
      localShort1.<init>(s1);
      Short localShort2 = new java/lang/Short;
      short s2 = (short)(this.firstCode + i);
      localShort2.<init>(s2);
      ((HashMap)localObject).put(localShort1, localShort2);
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CMapFormat6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */