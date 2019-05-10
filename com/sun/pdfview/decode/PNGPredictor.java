package com.sun.pdfview.decode;

import c.a.a.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PNGPredictor
  extends Predictor
{
  public PNGPredictor()
  {
    super(1);
  }
  
  protected void doAverageLine(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = getBitsPerComponent();
    int j = getColors();
    double d1 = i * j;
    double d2 = 8.0D;
    d1 = Math.ceil(d1 / d2);
    int k = (int)d1;
    i = 0;
    j = paramArrayOfByte1.length;
    if (i >= j) {
      return;
    }
    j = i - k;
    if (j >= 0) {
      j = paramArrayOfByte1[j] & 0xFF;
    }
    for (int m = j;; m = 0)
    {
      if (paramArrayOfByte2 != null) {}
      for (j = paramArrayOfByte2[i] & 0xFF;; j = 0)
      {
        int n = paramArrayOfByte1[i];
        d1 = Math.floor((j + m) / 2);
        j = (byte)((byte)(int)d1 + n);
        paramArrayOfByte1[i] = j;
        i += 1;
        break;
      }
    }
  }
  
  protected void doPaethLine(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = getBitsPerComponent();
    int j = getColors();
    double d1 = i * j;
    double d2 = 8.0D;
    d1 = Math.ceil(d1 / d2);
    int k = (int)d1;
    i = 0;
    j = paramArrayOfByte1.length;
    if (i >= j) {
      return;
    }
    int m = i - k;
    if (m >= 0) {
      j = paramArrayOfByte1[m] & 0xFF;
    }
    for (int n = j;; n = 0)
    {
      if (paramArrayOfByte2 != null) {
        j = paramArrayOfByte2[i] & 0xFF;
      }
      for (int i1 = j;; i1 = 0)
      {
        if ((m > 0) && (paramArrayOfByte2 != null)) {}
        for (j = paramArrayOfByte2[m] & 0xFF;; j = 0)
        {
          m = paramArrayOfByte1[i];
          j = (byte)((byte)paeth(n, i1, j) + m);
          paramArrayOfByte1[i] = j;
          i += 1;
          break;
        }
      }
    }
  }
  
  protected void doSubLine(byte[] paramArrayOfByte)
  {
    int i = getBitsPerComponent();
    int j = getColors();
    double d1 = i * j;
    double d2 = 8.0D;
    d1 = Math.ceil(d1 / d2);
    j = (int)d1;
    i = 0;
    for (;;)
    {
      int k = paramArrayOfByte.length;
      if (i >= k) {
        return;
      }
      k = i - j;
      if (k >= 0)
      {
        int m = paramArrayOfByte[i];
        k = (byte)(paramArrayOfByte[k] + m);
        paramArrayOfByte[i] = k;
      }
      i += 1;
    }
  }
  
  protected void doUpLine(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte2 == null) {
      return;
    }
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfByte1.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte1[i];
      int k = paramArrayOfByte2[i];
      j = (byte)(j + k);
      paramArrayOfByte1[i] = j;
      i += 1;
    }
  }
  
  protected int paeth(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + paramInt2 - paramInt3;
    int j = Math.abs(i - paramInt1);
    int k = Math.abs(i - paramInt2);
    i = Math.abs(i - paramInt3);
    if ((j <= k) && (j <= i)) {}
    for (;;)
    {
      return paramInt1;
      if (k <= i) {
        paramInt1 = paramInt2;
      } else {
        paramInt1 = paramInt3;
      }
    }
  }
  
  public b unpredict(b paramb)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    byte[] arrayOfByte = (byte[])null;
    Object localObject2 = (byte[])null;
    int i = getColumns();
    int k = getColors();
    i *= k;
    k = getBitsPerComponent();
    i *= k;
    double d1 = i;
    double d2 = 8.0D;
    d1 = Math.ceil(d1 / d2);
    k = (int)d1;
    i = paramb.c();
    int m = k + 1;
    if (i < m)
    {
      i = ((List)localObject1).size() * k;
      localObject2 = b.g(i);
      localObject1 = ((List)localObject1).iterator();
    }
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool)
      {
        ((b)localObject2).j();
        return (b)localObject2;
        int j = paramb.b();
        m = j & 0xFF;
        arrayOfByte = new byte[k];
        paramb.a(arrayOfByte);
        switch (m)
        {
        }
        for (;;)
        {
          ((List)localObject1).add(arrayOfByte);
          localObject2 = arrayOfByte;
          break;
          doSubLine(arrayOfByte);
          continue;
          doUpLine(arrayOfByte, (byte[])localObject2);
          continue;
          doAverageLine(arrayOfByte, (byte[])localObject2);
          continue;
          doPaethLine(arrayOfByte, (byte[])localObject2);
        }
      }
      arrayOfByte = (byte[])((Iterator)localObject1).next();
      ((b)localObject2).c(arrayOfByte);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\PNGPredictor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */