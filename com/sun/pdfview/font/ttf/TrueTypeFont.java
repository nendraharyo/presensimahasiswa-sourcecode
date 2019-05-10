package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TrueTypeFont
{
  private SortedMap tables;
  private int type;
  
  public TrueTypeFont(int paramInt)
  {
    this.type = paramInt;
    Object localObject = new java/util/TreeMap;
    ((TreeMap)localObject).<init>();
    localObject = Collections.synchronizedSortedMap((SortedMap)localObject);
    this.tables = ((SortedMap)localObject);
  }
  
  private static int calculateChecksum(String paramString, b paramb)
  {
    int i = 0;
    paramb.p();
    String str = "head";
    boolean bool = paramString.equals(str);
    if (bool)
    {
      j = 8;
      paramb.a(j, 0);
    }
    int k = (paramb.c() + 3) / 4;
    int j = 0;
    str = null;
    if (j >= k)
    {
      paramb.q();
      return i;
    }
    int m = paramb.c();
    switch (m)
    {
    default: 
      m = paramb.l();
      i += m;
    }
    for (;;)
    {
      j += 1;
      break;
      m = paramb.o() << 16;
      int n = paramb.b() << 8;
      m += n;
      i += m;
      continue;
      m = paramb.o() << 16;
      i += m;
      continue;
      m = (paramb.b() & 0xFF) << 24;
      i += m;
    }
  }
  
  private int getLength()
  {
    int i = getNumTables() * 16 + 12;
    Collection localCollection = this.tables.values();
    Iterator localIterator = localCollection.iterator();
    int k = i;
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        return k;
      }
      Object localObject = localIterator.next();
      boolean bool2 = localObject instanceof TrueTypeTable;
      if (bool2) {
        localObject = (TrueTypeTable)localObject;
      }
      for (int j = ((TrueTypeTable)localObject).getLength() + k;; j = ((b)localObject).c() + k)
      {
        k = j % 4;
        if (k == 0) {
          break label132;
        }
        k = j % 4;
        k = 4 - k;
        j += k;
        k = j;
        break;
        localObject = (b)localObject;
      }
      label132:
      k = j;
    }
  }
  
  private static void parseDirectories(b paramb, int paramInt, TrueTypeFont paramTrueTypeFont)
  {
    int i = 0;
    if (i >= paramInt) {
      return;
    }
    int j = paramb.l();
    String str = TrueTypeTable.tagToString(j);
    int k = paramb.l();
    int m = paramb.l();
    int n = paramb.l();
    paramb.p();
    paramb.a(m);
    b localb = paramb.d();
    localb.d(n);
    n = calculateChecksum(str, localb);
    if (n == k) {
      paramTrueTypeFont.addTable(str, localb);
    }
    for (;;)
    {
      paramb.q();
      i += 1;
      break;
      paramTrueTypeFont.addTable(str, localb);
    }
  }
  
  public static TrueTypeFont parseFont(b paramb)
  {
    int i = paramb.l();
    int j = paramb.o();
    paramb.o();
    paramb.o();
    paramb.o();
    TrueTypeFont localTrueTypeFont = new com/sun/pdfview/font/ttf/TrueTypeFont;
    localTrueTypeFont.<init>(i);
    parseDirectories(paramb, j, localTrueTypeFont);
    return localTrueTypeFont;
  }
  
  public static TrueTypeFont parseFont(byte[] paramArrayOfByte)
  {
    return parseFont(b.d(paramArrayOfByte));
  }
  
  private void updateChecksumAdj(b paramb)
  {
    Object localObject1 = "";
    int i = calculateChecksum((String)localObject1, paramb);
    int k = -1313820742 - i;
    i = getNumTables() * 16 + 12;
    Set localSet = this.tables.keySet();
    Iterator localIterator = localSet.iterator();
    int m = i;
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {}
      for (;;)
      {
        return;
        localObject1 = (String)localIterator.next();
        localObject2 = "head";
        bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2) {
          break;
        }
        j = m + 8;
        paramb.a(j, k);
      }
      Object localObject2 = this.tables;
      localObject1 = ((SortedMap)localObject2).get(localObject1);
      boolean bool2 = localObject1 instanceof TrueTypeTable;
      if (bool2) {
        localObject1 = (TrueTypeTable)localObject1;
      }
      for (int j = ((TrueTypeTable)localObject1).getLength() + m;; j = ((b)localObject1).c() + m)
      {
        m = j % 4;
        if (m == 0) {
          break label193;
        }
        m = j % 4;
        m = 4 - m;
        j += m;
        m = j;
        break;
        localObject1 = (b)localObject1;
      }
      label193:
      m = j;
    }
  }
  
  public void addTable(String paramString, b paramb)
  {
    this.tables.put(paramString, paramb);
  }
  
  public void addTable(String paramString, TrueTypeTable paramTrueTypeTable)
  {
    this.tables.put(paramString, paramTrueTypeTable);
  }
  
  public short getEntrySelector()
  {
    double d1 = 2.0D;
    double d2 = Math.log(getNumTables());
    double d3 = Math.log(d1);
    d2 = Math.floor(d2 / d3);
    d2 = Math.log(Math.pow(d1, d2));
    d3 = Math.log(d1);
    return (short)(int)(d2 / d3);
  }
  
  public short getNumTables()
  {
    return (short)this.tables.size();
  }
  
  public short getRangeShift()
  {
    double d1 = 2.0D;
    double d2 = Math.log(getNumTables());
    double d3 = Math.log(d1);
    d2 = Math.floor(d2 / d3);
    d2 = Math.pow(d1, d2) * 16.0D;
    d3 = getSearchRange();
    return (short)(int)(d2 - d3);
  }
  
  public short getSearchRange()
  {
    double d1 = 2.0D;
    double d2 = Math.log(getNumTables());
    double d3 = Math.log(d1);
    d2 = Math.floor(d2 / d3);
    return (short)(int)(Math.pow(d1, d2) * 16.0D);
  }
  
  public TrueTypeTable getTable(String paramString)
  {
    Object localObject = this.tables.get(paramString);
    boolean bool = localObject instanceof b;
    if (bool)
    {
      localObject = (b)localObject;
      localObject = TrueTypeTable.createTable(this, paramString, (b)localObject);
      addTable(paramString, (TrueTypeTable)localObject);
    }
    for (;;)
    {
      return (TrueTypeTable)localObject;
      localObject = (TrueTypeTable)localObject;
    }
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public void removeTable(String paramString)
  {
    this.tables.remove(paramString);
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = System.out;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Type         : ");
    int i = getType();
    localObject2 = i;
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = System.out;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("NumTables    : ");
    i = getNumTables();
    localObject2 = i;
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = System.out;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("SearchRange  : ");
    i = getSearchRange();
    localObject2 = i;
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = System.out;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("EntrySelector: ");
    i = getEntrySelector();
    localObject2 = i;
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = System.out;
    localObject2 = new java/lang/StringBuilder;
    Object localObject3 = "RangeShift   : ";
    ((StringBuilder)localObject2).<init>((String)localObject3);
    i = getRangeShift();
    localObject2 = i;
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = this.tables.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    boolean bool2 = ((Iterator)localObject2).hasNext();
    if (!bool2) {
      return localStringBuffer.toString();
    }
    localObject1 = (Map.Entry)((Iterator)localObject2).next();
    localObject3 = ((Map.Entry)localObject1).getValue();
    boolean bool1 = localObject3 instanceof b;
    if (bool1) {
      localObject1 = (String)((Map.Entry)localObject1).getKey();
    }
    for (localObject1 = getTable((String)localObject1);; localObject1 = (TrueTypeTable)((Map.Entry)localObject1).getValue())
    {
      localObject3 = System.out;
      ((PrintStream)localObject3).println(localObject1);
      break;
    }
  }
  
  public byte[] writeFont()
  {
    b localb = b.g(getLength());
    int i = getType();
    localb.f(i);
    i = getNumTables();
    localb.a(i);
    short s = getSearchRange();
    localb.a(s);
    s = getEntrySelector();
    localb.a(s);
    s = getRangeShift();
    localb.a(s);
    int j = getNumTables() * 16 + 12;
    Object localObject = this.tables.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    int m = j;
    boolean bool1 = localIterator.hasNext();
    if (!bool1)
    {
      localb.a(m);
      localb.j();
      updateChecksumAdj(localb);
      return localb.i();
    }
    String str = (String)localIterator.next();
    int n = TrueTypeTable.stringToTag(str);
    localObject = this.tables.get(str);
    boolean bool2 = localObject instanceof TrueTypeTable;
    label172:
    int k;
    if (bool2)
    {
      localObject = ((TrueTypeTable)localObject).getData();
      int i1 = ((b)localObject).c();
      localb.f(n);
      k = calculateChecksum(str, (b)localObject);
      localb.f(k);
      localb.f(m);
      localb.f(i1);
      localb.p();
      localb.a(m);
      localb.a((b)localObject);
      ((b)localObject).j();
      localb.q();
      k = m + i1;
    }
    for (;;)
    {
      int i2 = k % 4;
      if (i2 <= 0)
      {
        m = k;
        break;
        localObject = (b)localObject;
        break label172;
      }
      k += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\TrueTypeFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */