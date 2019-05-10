package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CMapFormat4
  extends CMap
{
  public SortedMap segments;
  
  protected CMapFormat4(short paramShort)
  {
    super((short)4, paramShort);
    Object localObject = new java/util/TreeMap;
    ((TreeMap)localObject).<init>();
    localObject = Collections.synchronizedSortedMap((SortedMap)localObject);
    this.segments = ((SortedMap)localObject);
    localObject = new char[1];
    localObject[0] = 0;
    addSegment(s, s, (char[])localObject);
  }
  
  public void addSegment(short paramShort1, short paramShort2, short paramShort3)
  {
    CMapFormat4.Segment localSegment = new com/sun/pdfview/font/ttf/CMapFormat4$Segment;
    localSegment.<init>(this, paramShort1, paramShort2, false);
    this.segments.remove(localSegment);
    SortedMap localSortedMap = this.segments;
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramShort3);
    localSortedMap.put(localSegment, localInteger);
  }
  
  public void addSegment(short paramShort1, short paramShort2, char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = paramShort2 - paramShort1 + 1;
    if (i != j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Wrong number of entries in map");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/sun/pdfview/font/ttf/CMapFormat4$Segment;
    ((CMapFormat4.Segment)localObject).<init>(this, paramShort1, paramShort2, true);
    this.segments.remove(localObject);
    this.segments.put(localObject, paramArrayOfChar);
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    short s1 = getFormat();
    localb.a(s1);
    s1 = getLength();
    localb.a(s1);
    s1 = getLanguage();
    localb.a(s1);
    s1 = (short)(getSegmentCount() * 2);
    localb.a(s1);
    s1 = getSearchRange();
    localb.a(s1);
    s1 = getEntrySelector();
    localb.a(s1);
    s1 = getRangeShift();
    localb.a(s1);
    Object localObject1 = this.segments.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    boolean bool1 = ((Iterator)localObject2).hasNext();
    label134:
    label164:
    Iterator localIterator;
    int k;
    if (!bool1)
    {
      localb.a((short)0);
      localObject1 = this.segments.keySet();
      localObject2 = ((Set)localObject1).iterator();
      bool1 = ((Iterator)localObject2).hasNext();
      if (bool1) {
        break label259;
      }
      localObject1 = this.segments.keySet();
      localObject2 = ((Set)localObject1).iterator();
      bool1 = ((Iterator)localObject2).hasNext();
      if (bool1) {
        break label284;
      }
      int i = getSegmentCount() * 8 + 16;
      localObject2 = this.segments.keySet();
      localIterator = ((Set)localObject2).iterator();
      k = i;
    }
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      label259:
      label284:
      SortedMap localSortedMap;
      if (!bool2)
      {
        localb.a(k);
        localb.j();
        return localb;
        localObject1 = (CMapFormat4.Segment)((Iterator)localObject2).next();
        short s2 = (short)((CMapFormat4.Segment)localObject1).endCode;
        localb.a(s2);
        break;
        localObject1 = (CMapFormat4.Segment)((Iterator)localObject2).next();
        s2 = (short)((CMapFormat4.Segment)localObject1).startCode;
        localb.a(s2);
        break label134;
        localObject1 = (CMapFormat4.Segment)((Iterator)localObject2).next();
        bool3 = ((CMapFormat4.Segment)localObject1).hasMap;
        if (!bool3)
        {
          localSortedMap = this.segments;
          localObject1 = (Integer)localSortedMap.get(localObject1);
          s2 = ((Integer)localObject1).shortValue();
          localb.a(s2);
          break label164;
        }
        localb.a((short)0);
        break label164;
      }
      localObject1 = (CMapFormat4.Segment)localIterator.next();
      boolean bool3 = ((CMapFormat4.Segment)localObject1).hasMap;
      if (bool3)
      {
        int m = localb.a();
        m = (short)(k - m);
        localb.a(m);
        localb.p();
        localb.a(k);
        localObject1 = (char[])this.segments.get(localObject1);
        int n = 0;
        localSortedMap = null;
        for (;;)
        {
          int i1 = localObject1.length;
          if (n >= i1)
          {
            localb.q();
            int j = localObject1.length * 2 + k;
            k = j;
            break;
          }
          i1 = localObject1[n];
          localb.a(i1);
          n += 1;
        }
      }
      localb.a((short)0);
    }
  }
  
  public short getEntrySelector()
  {
    double d1 = Math.log(getSearchRange() / 2);
    double d2 = Math.log(2.0D);
    return (short)(int)(d1 / d2);
  }
  
  public short getLength()
  {
    int i = this.segments.size() * 8;
    int j = (short)(16 + i);
    Set localSet = this.segments.keySet();
    Iterator localIterator = localSet.iterator();
    i = j;
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        return i;
      }
      Object localObject = (CMapFormat4.Segment)localIterator.next();
      boolean bool2 = ((CMapFormat4.Segment)localObject).hasMap;
      if (bool2)
      {
        SortedMap localSortedMap = this.segments;
        localObject = (char[])localSortedMap.get(localObject);
        int k = (short)(localObject.length * 2 + i);
        i = k;
      }
    }
  }
  
  public short getRangeShift()
  {
    int i = getSegmentCount() * 2;
    int j = getSearchRange();
    return (short)(i - j);
  }
  
  public short getSearchRange()
  {
    double d1 = 2.0D;
    double d2 = Math.log(getSegmentCount());
    double d3 = Math.log(d1);
    d2 = Math.floor(d2 / d3);
    return (short)(int)(Math.pow(d1, d2) * d1);
  }
  
  public short getSegmentCount()
  {
    return (short)this.segments.size();
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
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.segments.keySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    int i = localIterator.hasNext();
    if (i == 0)
    {
      i = 0;
      localObject2 = null;
    }
    for (;;)
    {
      return i;
      localObject2 = (CMapFormat4.Segment)localIterator.next();
      char c2 = ((CMapFormat4.Segment)localObject2).endCode;
      if (c2 < paramChar) {
        break;
      }
      char c3 = ((CMapFormat4.Segment)localObject2).startCode;
      char c1;
      if (c3 <= paramChar)
      {
        bool = ((CMapFormat4.Segment)localObject2).hasMap;
        if (bool)
        {
          localObject1 = (char[])this.segments.get(localObject2);
          c1 = ((CMapFormat4.Segment)localObject2).startCode;
          c1 = paramChar - c1;
          c1 = localObject1[c1];
        }
        else
        {
          localObject1 = this.segments;
          localObject2 = (Integer)((SortedMap)localObject1).get(localObject2);
          c1 = (char)(((Integer)localObject2).intValue() + paramChar);
        }
      }
      else
      {
        c1 = '\000';
        localObject2 = null;
      }
    }
  }
  
  public void removeSegment(short paramShort1, short paramShort2)
  {
    CMapFormat4.Segment localSegment = new com/sun/pdfview/font/ttf/CMapFormat4$Segment;
    localSegment.<init>(this, paramShort1, paramShort2, true);
    this.segments.remove(localSegment);
  }
  
  public char reverseMap(short paramShort)
  {
    char c = '\000';
    Object localObject1 = this.segments.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    boolean bool1 = localIterator.hasNext();
    if (!bool1) {}
    for (;;)
    {
      label34:
      return c;
      localObject1 = (CMapFormat4.Segment)localIterator.next();
      boolean bool2 = ((CMapFormat4.Segment)localObject1).hasMap;
      if (bool2)
      {
        localObject2 = (char[])this.segments.get(localObject1);
        s2 = 0;
        for (;;)
        {
          s3 = localObject2.length;
          if (s2 >= s3) {
            break;
          }
          s3 = localObject2[s2];
          if (s3 == paramShort)
          {
            s1 = ((CMapFormat4.Segment)localObject1).startCode + s2;
            c = (char)s1;
            break label34;
          }
          s2 += 1;
        }
      }
      Object localObject2 = (Integer)this.segments.get(localObject1);
      short s2 = ((CMapFormat4.Segment)localObject1).startCode;
      short s3 = ((Integer)localObject2).intValue();
      s2 += s3;
      short s1 = ((CMapFormat4.Segment)localObject1).endCode;
      s3 = ((Integer)localObject2).intValue();
      s1 += s3;
      if ((paramShort < s2) || (paramShort > s1)) {
        break;
      }
      s1 = ((Integer)localObject2).intValue();
      s1 = paramShort - s1;
      c = (char)s1;
    }
  }
  
  public void setData(int paramInt, b paramb)
  {
    int i = (short)(paramb.o() / 2);
    paramb.o();
    paramb.o();
    paramb.o();
    short[] arrayOfShort1 = new short[i];
    short[] arrayOfShort2 = new short[i];
    short[] arrayOfShort3 = new short[i];
    short[] arrayOfShort4 = new short[i];
    int j = i * 8 + 16;
    j = 0;
    if (j >= i)
    {
      paramb.o();
      j = 0;
      label69:
      if (j < i) {
        break label116;
      }
      j = 0;
      label78:
      if (j < i) {
        break label138;
      }
    }
    for (int n = 0;; n = k)
    {
      if (n >= i)
      {
        return;
        n = paramb.o();
        arrayOfShort1[j] = n;
        j += 1;
        break;
        label116:
        n = paramb.o();
        arrayOfShort2[j] = n;
        j += 1;
        break label69;
        label138:
        n = paramb.o();
        arrayOfShort3[j] = n;
        j += 1;
        break label78;
      }
      j = paramb.o();
      arrayOfShort4[n] = j;
      j = arrayOfShort4[n];
      if (j > 0) {
        break label229;
      }
      j = arrayOfShort2[n];
      short s = arrayOfShort1[n];
      i2 = arrayOfShort3[n];
      addSegment(j, s, i2);
      k = n + 1;
    }
    label229:
    int k = paramb.a() + -2;
    int i1 = arrayOfShort4[n] + k;
    k = arrayOfShort1[n];
    int i2 = arrayOfShort2[n];
    int i3 = k - i2 + 1;
    char[] arrayOfChar = new char[i3];
    paramb.p();
    k = 0;
    for (;;)
    {
      if (k >= i3)
      {
        paramb.q();
        k = arrayOfShort2[n];
        i1 = arrayOfShort1[n];
        addSegment(k, i1, arrayOfChar);
        break;
      }
      int i4 = k * 2 + i1;
      paramb.a(i4);
      i4 = paramb.n();
      arrayOfChar[k] = i4;
      int m;
      k += 1;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str = "        ";
    Object localObject1 = super.toString();
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    Object localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("SegmentCount : ");
    int i = getSegmentCount();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("SearchRange  : ");
    i = getSearchRange();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("EntrySelector: ");
    i = getEntrySelector();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("RangeShift   : ");
    i = getRangeShift();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = this.segments.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        return localStringBuffer.toString();
      }
      localObject1 = (CMapFormat4.Segment)((Iterator)localObject2).next();
      localStringBuffer.append(str);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Segment: ");
      Object localObject4 = Integer.toHexString(((CMapFormat4.Segment)localObject1).startCode);
      localObject3 = (String)localObject4;
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("-");
      localObject4 = Integer.toHexString(((CMapFormat4.Segment)localObject1).endCode);
      localObject3 = (String)localObject4 + " ";
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("hasMap: ");
      boolean bool2 = ((CMapFormat4.Segment)localObject1).hasMap;
      localObject3 = ((StringBuilder)localObject3).append(bool2);
      localObject4 = " ";
      localObject3 = (String)localObject4;
      localStringBuffer.append((String)localObject3);
      boolean bool3 = ((CMapFormat4.Segment)localObject1).hasMap;
      if (!bool3)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("delta: ");
        localObject4 = this.segments;
        localObject1 = ((SortedMap)localObject4).get(localObject1);
        localObject1 = localObject1;
        localStringBuffer.append((String)localObject1);
      }
      localObject1 = "\n";
      localStringBuffer.append((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CMapFormat4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */