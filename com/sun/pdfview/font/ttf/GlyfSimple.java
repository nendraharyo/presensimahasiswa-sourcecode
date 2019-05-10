package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class GlyfSimple
  extends Glyf
{
  private short[] contourEndPts;
  private byte[] flags;
  private byte[] instructions;
  private short[] xCoords;
  private short[] yCoords;
  
  public short getContourEndPoint(int paramInt)
  {
    return this.contourEndPts[paramInt];
  }
  
  public b getData()
  {
    int i = 0;
    b localb = super.getData();
    int j = 0;
    int i1 = getNumContours();
    if (j >= i1)
    {
      j = getNumInstructions();
      localb.a(j);
      j = 0;
    }
    for (;;)
    {
      int i2 = getNumInstructions();
      if (j >= i2)
      {
        j = 0;
        int i3 = getNumPoints();
        if (j < i3) {
          break label125;
        }
        j = 0;
        int i4 = getNumPoints();
        if (j < i4) {
          break label210;
        }
        j = getNumPoints();
        if (i < j) {
          break label271;
        }
        return localb;
        i5 = getContourEndPoint(j);
        localb.a(i5);
        j += 1;
        break;
      }
      i5 = getInstruction(k);
      localb.a(i5);
      k += 1;
    }
    label125:
    int i5 = k;
    int k = 0;
    label130:
    if (i5 > 0)
    {
      int i7 = getFlag(i5);
      int i8 = i5 + -1;
      i8 = getFlag(i8);
      if (i7 == i8) {}
    }
    else
    {
      if (k <= 0) {
        break label195;
      }
      localb.a(k);
    }
    int m;
    for (;;)
    {
      m = i5 + 1;
      break;
      m = (byte)(m + 1);
      int i6;
      i5 += 1;
      break label130;
      label195:
      m = getFlag(i6);
      localb.a(m);
    }
    label210:
    boolean bool3 = xIsByte(m);
    if (bool3)
    {
      byte b2 = (byte)getXCoord(m);
      localb.a(b2);
    }
    for (;;)
    {
      int n;
      m += 1;
      break;
      boolean bool4 = xIsSame(n);
      if (!bool4)
      {
        short s2 = getXCoord(n);
        localb.a(s2);
      }
    }
    label271:
    boolean bool1 = yIsByte(i);
    if (bool1)
    {
      byte b1 = (byte)getYCoord(i);
      localb.a(b1);
    }
    for (;;)
    {
      i += 1;
      break;
      boolean bool2 = yIsSame(i);
      if (!bool2)
      {
        short s1 = getYCoord(i);
        localb.a(s1);
      }
    }
  }
  
  public byte getFlag(int paramInt)
  {
    return this.flags[paramInt];
  }
  
  public byte getInstruction(int paramInt)
  {
    return this.instructions[paramInt];
  }
  
  public short getLength()
  {
    int i = 0;
    int j = super.getLength();
    int i2 = getNumContours() * 2;
    j = (short)(j + i2);
    i2 = getNumInstructions() + 2;
    i2 = (short)(j + i2);
    j = 0;
    int i3;
    for (;;)
    {
      int i4 = getNumPoints();
      if (j >= i4)
      {
        j = getNumPoints();
        if (i < j) {
          break;
        }
        return i2;
      }
      int i5;
      do
      {
        if (j <= 0) {
          break;
        }
        i4 = getFlag(j);
        i5 = j + -1;
        i5 = getFlag(i5);
      } while (i4 == i5);
      i3 = (short)(i2 + 1);
      j += 1;
    }
    boolean bool1 = xIsByte(i);
    if (bool1)
    {
      int k = i3 + 1;
      i3 = (short)k;
      label117:
      boolean bool2 = yIsByte(i);
      if (!bool2) {
        break label161;
      }
      int m = i3 + 1;
      i3 = (short)m;
    }
    for (;;)
    {
      i += 1;
      break;
      boolean bool3 = xIsSame(i);
      if (bool3) {
        break label117;
      }
      int n = i3 + 2;
      i3 = (short)n;
      break label117;
      label161:
      boolean bool4 = yIsSame(i);
      if (!bool4)
      {
        int i1 = i3 + 2;
        i3 = (short)i1;
      }
    }
  }
  
  public short getNumInstructions()
  {
    return (short)this.instructions.length;
  }
  
  public short getNumPoints()
  {
    return (short)this.flags.length;
  }
  
  public short getXCoord(int paramInt)
  {
    return this.xCoords[paramInt];
  }
  
  public short getYCoord(int paramInt)
  {
    return this.yCoords[paramInt];
  }
  
  public boolean onCurve(int paramInt)
  {
    int i = getFlag(paramInt) & 0x1;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean repeat(int paramInt)
  {
    int i = getFlag(paramInt) & 0x8;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected void setContourEndPoints(short[] paramArrayOfShort)
  {
    this.contourEndPts = paramArrayOfShort;
  }
  
  public void setData(b paramb)
  {
    int i = 0;
    short[] arrayOfShort1 = new short[getNumContours()];
    int j = arrayOfShort1.length;
    int k = 0;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2;
    short[] arrayOfShort2;
    for (;;)
    {
      if (k >= j)
      {
        setContourEndPoints(arrayOfShort1);
        k = getNumContours() + -1;
        i3 = getContourEndPoint(k) + 1;
        arrayOfByte1 = new byte[paramb.o()];
        paramb.a(arrayOfByte1);
        setInstructions(arrayOfByte1);
        arrayOfByte2 = new byte[i3];
        int i5 = arrayOfByte2.length;
        k = 0;
        arrayOfByte1 = null;
        if (k < i5) {
          break;
        }
        setFlags(arrayOfByte2);
        arrayOfShort2 = new short[i3];
        int i7 = arrayOfShort2.length;
        i8 = 0;
        arrayOfShort1 = null;
        if (i8 < i7) {
          break label262;
        }
        setXCoords(arrayOfShort2);
        arrayOfShort1 = new short[i3];
        j = arrayOfShort1.length;
        if (i < j) {
          break label407;
        }
        setYCoords(arrayOfShort1);
        return;
      }
      int i3 = paramb.o();
      arrayOfShort1[k] = i3;
      k += 1;
    }
    int i8 = paramb.b();
    arrayOfByte2[k] = i8;
    i8 = arrayOfByte2[k] & 0x8;
    int i9;
    int i10;
    if (i8 != 0)
    {
      i9 = arrayOfByte2[k];
      i10 = paramb.b() & 0xFF;
      i8 = 0;
      arrayOfShort1 = null;
    }
    for (;;)
    {
      if (i8 >= i10)
      {
        k += 1;
        break;
      }
      j = k + 1;
      arrayOfByte2[j] = i9;
      i8 += 1;
      k = j;
    }
    label262:
    if (i8 > 0)
    {
      k = i8 + -1;
      k = arrayOfShort2[k];
      arrayOfShort2[i8] = k;
    }
    boolean bool1 = xIsByte(i8);
    int m;
    int i6;
    if (bool1)
    {
      m = paramb.b() & 0xFF;
      boolean bool6 = xIsSame(i8);
      if (!bool6) {
        m = -m;
      }
      i6 = arrayOfShort2[i8];
      m = (short)(m + i6);
      arrayOfShort2[i8] = m;
    }
    int n;
    for (;;)
    {
      m = i8 + 1;
      i8 = m;
      break;
      boolean bool2 = xIsSame(i8);
      if (!bool2)
      {
        n = arrayOfShort2[i8];
        i6 = paramb.o();
        n = (short)(n + i6);
        arrayOfShort2[i8] = n;
      }
    }
    label407:
    if (i > 0)
    {
      n = i + -1;
      n = arrayOfShort1[n];
      arrayOfShort1[i] = n;
    }
    boolean bool3 = yIsByte(i);
    int i1;
    int i4;
    if (bool3)
    {
      i1 = paramb.b() & 0xFF;
      boolean bool5 = yIsSame(i);
      if (!bool5) {
        i1 = -i1;
      }
      i4 = arrayOfShort1[i];
      i1 = (short)(i1 + i4);
      arrayOfShort1[i] = i1;
    }
    for (;;)
    {
      i1 = i + 1;
      i = i1;
      break;
      boolean bool4 = yIsSame(i);
      if (!bool4)
      {
        int i2 = arrayOfShort1[i];
        i4 = paramb.o();
        i2 = (short)(i2 + i4);
        arrayOfShort1[i] = i2;
      }
    }
  }
  
  protected void setFlags(byte[] paramArrayOfByte)
  {
    this.flags = paramArrayOfByte;
  }
  
  protected void setInstructions(byte[] paramArrayOfByte)
  {
    this.instructions = paramArrayOfByte;
  }
  
  protected void setXCoords(short[] paramArrayOfShort)
  {
    this.xCoords = paramArrayOfShort;
  }
  
  protected void setYCoords(short[] paramArrayOfShort)
  {
    this.yCoords = paramArrayOfShort;
  }
  
  protected boolean xIsByte(int paramInt)
  {
    int i = getFlag(paramInt) & 0x2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean xIsSame(int paramInt)
  {
    int i = getFlag(paramInt) & 0x10;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean yIsByte(int paramInt)
  {
    int i = getFlag(paramInt) & 0x4;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean yIsSame(int paramInt)
  {
    int i = getFlag(paramInt) & 0x20;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\GlyfSimple.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */