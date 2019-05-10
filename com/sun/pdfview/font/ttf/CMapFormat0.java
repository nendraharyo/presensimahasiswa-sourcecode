package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class CMapFormat0
  extends CMap
{
  private byte[] glyphIndex;
  
  protected CMapFormat0(short paramShort)
  {
    super((short)0, paramShort);
    int j = 256;
    byte[] arrayOfByte = new byte[j];
    for (;;)
    {
      int k = arrayOfByte.length;
      if (i >= k)
      {
        setMap(arrayOfByte);
        return;
      }
      k = (byte)i;
      arrayOfByte[i] = k;
      i += 1;
    }
  }
  
  public b getData()
  {
    b localb = b.g(262);
    short s = getFormat();
    localb.a(s);
    s = getLength();
    localb.a(s);
    s = getLanguage();
    localb.a(s);
    byte[] arrayOfByte = getMap();
    localb.c(arrayOfByte);
    localb.j();
    return localb;
  }
  
  public short getLength()
  {
    return 262;
  }
  
  protected byte[] getMap()
  {
    return this.glyphIndex;
  }
  
  public byte map(byte paramByte)
  {
    int i = paramByte & 0xFF;
    return this.glyphIndex[i];
  }
  
  public char map(char paramChar)
  {
    if (paramChar >= 0)
    {
      c = 'ÿ';
      if (paramChar <= c) {
        break label17;
      }
    }
    for (char c = '\000';; c = (char)(map(c) & 0xFF))
    {
      return c;
      label17:
      c = (byte)paramChar;
    }
  }
  
  public char reverseMap(short paramShort)
  {
    char c = '\000';
    int i = 0;
    for (;;)
    {
      byte[] arrayOfByte = this.glyphIndex;
      short s = arrayOfByte.length;
      if (i >= s) {}
      for (;;)
      {
        return c;
        arrayOfByte = this.glyphIndex;
        s = arrayOfByte[i] & 0xFF;
        if (s != paramShort) {
          break;
        }
        c = (char)i;
      }
      i += 1;
    }
  }
  
  public void setData(int paramInt, b paramb)
  {
    int i = 256;
    int j = 262;
    if (paramInt != j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Bad length for CMap format 0");
      throw ((Throwable)localObject);
    }
    j = paramb.c();
    if (j != i)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Wrong amount of data for CMap format 0");
      throw ((Throwable)localObject);
    }
    Object localObject = new byte[i];
    paramb.a((byte[])localObject);
    setMap((byte[])localObject);
  }
  
  public void setMap(byte paramByte1, byte paramByte2)
  {
    int i = paramByte1 & 0xFF;
    this.glyphIndex[i] = paramByte2;
  }
  
  public void setMap(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 256;
    if (i != j)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Glyph map must be size 256!");
      throw localIllegalArgumentException;
    }
    this.glyphIndex = paramArrayOfByte;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CMapFormat0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */