package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.util.ArrayList;
import java.util.List;

public class GlyfCompound
  extends Glyf
{
  private static final int ARGS_ARE_XY_VALUES = 2;
  private static final int ARG_1_AND_2_ARE_WORDS = 1;
  private static final int MORE_COMPONENTS = 32;
  private static final int OVERLAP_COMPOUND = 1024;
  private static final int ROUND_XY_TO_GRID = 4;
  private static final int USE_MY_METRICS = 512;
  private static final int WE_HAVE_AN_X_AND_Y_SCALE = 64;
  private static final int WE_HAVE_A_SCALE = 8;
  private static final int WE_HAVE_A_TWO_BY_TWO = 128;
  private static final int WE_HAVE_INSTRUCTIONS = 256;
  private GlyfCompound.GlyfComponent[] components;
  private byte[] instructions;
  
  public boolean argsAreWords(int paramInt)
  {
    int i = getFlag(paramInt) & 0x1;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean argsAreXYValues(int paramInt)
  {
    int i = getFlag(paramInt) & 0x2;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int getComponentPoint(int paramInt)
  {
    return this.components[paramInt].componentPoint;
  }
  
  public int getCompoundPoint(int paramInt)
  {
    return this.components[paramInt].compoundPoint;
  }
  
  public b getData()
  {
    return super.getData();
  }
  
  public short getFlag(int paramInt)
  {
    return this.components[paramInt].flags;
  }
  
  public short getGlyphIndex(int paramInt)
  {
    return this.components[paramInt].glyphIndex;
  }
  
  public byte getInstruction(int paramInt)
  {
    return this.instructions[paramInt];
  }
  
  public short getLength()
  {
    return super.getLength();
  }
  
  public int getNumComponents()
  {
    return this.components.length;
  }
  
  public short getNumInstructions()
  {
    return (short)this.instructions.length;
  }
  
  public float[] getTransform(int paramInt)
  {
    float f1 = 2.0F;
    float f2 = 0.0F;
    GlyfCompound.GlyfComponent[] arrayOfGlyfComponent = this.components;
    GlyfCompound.GlyfComponent localGlyfComponent = arrayOfGlyfComponent[paramInt];
    float f3 = Math.abs(localGlyfComponent.a);
    float f4 = Math.abs(localGlyfComponent.b);
    f3 = Math.max(f3, f4);
    f4 = Math.abs(localGlyfComponent.a);
    float f5 = Math.abs(localGlyfComponent.c);
    f4 = Math.abs(f4 - f5);
    boolean bool1 = f4 < 0.0F;
    if (bool1) {
      f3 *= f1;
    }
    f4 = Math.abs(localGlyfComponent.c);
    f5 = Math.abs(localGlyfComponent.d);
    f4 = Math.max(f4, f5);
    f5 = Math.abs(localGlyfComponent.c);
    float f6 = Math.abs(localGlyfComponent.d);
    f5 = Math.abs(f5 - f6);
    boolean bool2 = f5 < 0.0F;
    if (bool2) {
      f4 *= f1;
    }
    f5 = localGlyfComponent.e;
    f3 *= f5;
    f5 = localGlyfComponent.f;
    f4 *= f5;
    float[] arrayOfFloat = new float[6];
    f2 = localGlyfComponent.a;
    arrayOfFloat[0] = f2;
    f2 = localGlyfComponent.b;
    arrayOfFloat[1] = f2;
    f2 = localGlyfComponent.c;
    arrayOfFloat[2] = f2;
    float f7 = localGlyfComponent.d;
    arrayOfFloat[3] = f7;
    arrayOfFloat[4] = f3;
    arrayOfFloat[5] = f4;
    return arrayOfFloat;
  }
  
  public boolean hasAScale(int paramInt)
  {
    int i = getFlag(paramInt) & 0x8;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean hasInstructions(int paramInt)
  {
    int i = getFlag(paramInt) & 0x100;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean hasTwoByTwo(int paramInt)
  {
    int i = getFlag(paramInt) & 0x80;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean hasXYScale(int paramInt)
  {
    int i = getFlag(paramInt) & 0x40;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  protected boolean moreComponents(int paramInt)
  {
    int i = getFlag(paramInt) & 0x20;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean overlapCompound(int paramInt)
  {
    int i = getFlag(paramInt) & 0x400;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean roundXYToGrid(int paramInt)
  {
    int i = getFlag(paramInt) & 0x4;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void setComponents(GlyfCompound.GlyfComponent[] paramArrayOfGlyfComponent)
  {
    this.components = paramArrayOfGlyfComponent;
  }
  
  public void setData(b paramb)
  {
    int i = 0;
    float f1 = 16384.0F;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    Object localObject = null;
    float f2 = 0.0F;
    GlyfCompound.GlyfComponent localGlyfComponent = new com/sun/pdfview/font/ttf/GlyfCompound$GlyfComponent;
    localGlyfComponent.<init>(this);
    int k = paramb.o();
    localGlyfComponent.flags = k;
    k = paramb.o();
    localGlyfComponent.glyphIndex = k;
    k = localGlyfComponent.flags & 0x1;
    if (k != 0)
    {
      k = localGlyfComponent.flags & 0x2;
      if (k != 0)
      {
        f3 = paramb.o();
        localGlyfComponent.e = f3;
        k = paramb.o();
        f3 = k;
        localGlyfComponent.f = f3;
        k = localGlyfComponent.flags & 0x8;
        if (k == 0) {
          break label450;
        }
        k = paramb.o();
        f3 = k / f1;
        localGlyfComponent.a = f3;
        f3 = localGlyfComponent.a;
        localGlyfComponent.d = f3;
        label170:
        k = localGlyfComponent.flags & 0x100;
        if (k == 0) {
          break label629;
        }
        j = 1;
        f2 = Float.MIN_VALUE;
        k = j;
      }
    }
    for (float f3 = f2;; f3 = f2)
    {
      localArrayList.add(localGlyfComponent);
      j = localGlyfComponent.flags & 0x20;
      if (j == 0)
      {
        localObject = new GlyfCompound.GlyfComponent[localArrayList.size()];
        localArrayList.toArray((Object[])localObject);
        setComponents((GlyfCompound.GlyfComponent[])localObject);
        j = 0;
        f2 = 0.0F;
        localObject = (byte[])null;
        if (k != 0)
        {
          j = paramb.o();
          localObject = new byte[j];
          label283:
          k = localObject.length;
          if (i < k) {}
        }
        for (;;)
        {
          setInstructions((byte[])localObject);
          return;
          k = localGlyfComponent.flags & 0x1;
          if (k == 0)
          {
            k = localGlyfComponent.flags & 0x2;
            if (k != 0)
            {
              f3 = paramb.b();
              localGlyfComponent.e = f3;
              k = paramb.b();
              f3 = k;
              localGlyfComponent.f = f3;
              break;
            }
          }
          k = localGlyfComponent.flags & 0x1;
          if (k != 0)
          {
            k = localGlyfComponent.flags & 0x2;
            if (k == 0)
            {
              k = paramb.o();
              localGlyfComponent.compoundPoint = k;
              k = paramb.o();
              localGlyfComponent.componentPoint = k;
              break;
            }
          }
          k = paramb.b();
          localGlyfComponent.compoundPoint = k;
          k = paramb.b();
          localGlyfComponent.componentPoint = k;
          break;
          label450:
          k = localGlyfComponent.flags & 0x40;
          if (k != 0)
          {
            f3 = paramb.o() / f1;
            localGlyfComponent.a = f3;
            k = paramb.o();
            f3 = k / f1;
            localGlyfComponent.d = f3;
            break label170;
          }
          k = localGlyfComponent.flags & 0x80;
          if (k == 0) {
            break label170;
          }
          f3 = paramb.o() / f1;
          localGlyfComponent.a = f3;
          f3 = paramb.o() / f1;
          localGlyfComponent.b = f3;
          f3 = paramb.o() / f1;
          localGlyfComponent.c = f3;
          k = paramb.o();
          f3 = k / f1;
          localGlyfComponent.d = f3;
          break label170;
          k = paramb.b();
          localObject[i] = k;
          i += 1;
          break label283;
          localObject = new byte[0];
        }
      }
      j = k;
      f2 = f3;
      break;
      label629:
      k = j;
    }
  }
  
  protected void setInstructions(byte[] paramArrayOfByte)
  {
    this.instructions = paramArrayOfByte;
  }
  
  public boolean useMetrics(int paramInt)
  {
    int i = getFlag(paramInt) & 0x200;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\GlyfCompound.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */