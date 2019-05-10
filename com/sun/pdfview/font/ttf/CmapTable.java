package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CmapTable
  extends TrueTypeTable
{
  private SortedMap subtables;
  private short version;
  
  protected CmapTable()
  {
    super(1668112752);
    setVersion((short)0);
    Object localObject = new java/util/TreeMap;
    ((TreeMap)localObject).<init>();
    localObject = Collections.synchronizedSortedMap((SortedMap)localObject);
    this.subtables = ((SortedMap)localObject);
  }
  
  public void addCMap(short paramShort1, short paramShort2, CMap paramCMap)
  {
    CmapTable.CmapSubtable localCmapSubtable = new com/sun/pdfview/font/ttf/CmapTable$CmapSubtable;
    localCmapSubtable.<init>(this, paramShort1, paramShort2);
    this.subtables.put(localCmapSubtable, paramCMap);
  }
  
  public CMap getCMap(short paramShort1, short paramShort2)
  {
    CmapTable.CmapSubtable localCmapSubtable = new com/sun/pdfview/font/ttf/CmapTable$CmapSubtable;
    localCmapSubtable.<init>(this, paramShort1, paramShort2);
    return (CMap)this.subtables.get(localCmapSubtable);
  }
  
  public CMap[] getCMaps()
  {
    Collection localCollection = this.subtables.values();
    CMap[] arrayOfCMap = new CMap[localCollection.size()];
    localCollection.toArray(arrayOfCMap);
    return arrayOfCMap;
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    short s1 = getVersion();
    localb.a(s1);
    s1 = (short)this.subtables.size();
    localb.a(s1);
    Object localObject1 = this.subtables;
    int i = ((SortedMap)localObject1).size() * 8 + 4;
    Object localObject2 = this.subtables.keySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    int k = i;
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      localObject1 = this.subtables.values();
      localObject2 = ((Collection)localObject1).iterator();
    }
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool)
      {
        localb.j();
        return localb;
        localObject1 = (CmapTable.CmapSubtable)localIterator.next();
        localObject2 = (CMap)this.subtables.get(localObject1);
        short s3 = ((CmapTable.CmapSubtable)localObject1).platformID;
        localb.a(s3);
        short s2 = ((CmapTable.CmapSubtable)localObject1).platformSpecificID;
        localb.a(s2);
        localb.f(k);
        int j = ((CMap)localObject2).getLength() + k;
        k = j;
        break;
      }
      localObject1 = ((CMap)((Iterator)localObject2).next()).getData();
      localb.a((b)localObject1);
    }
  }
  
  public int getLength()
  {
    int i = this.subtables.size() * 8;
    int j = 4 + i;
    Collection localCollection = this.subtables.values();
    Iterator localIterator = localCollection.iterator();
    int k;
    for (i = j;; i = k)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        return i;
      }
      CMap localCMap = (CMap)localIterator.next();
      k = localCMap.getLength() + i;
    }
  }
  
  public short getNumberSubtables()
  {
    return (short)this.subtables.size();
  }
  
  public short getVersion()
  {
    return this.version;
  }
  
  public void removeCMap(short paramShort1, short paramShort2)
  {
    CmapTable.CmapSubtable localCmapSubtable = new com/sun/pdfview/font/ttf/CmapTable$CmapSubtable;
    localCmapSubtable.<init>(this, paramShort1, paramShort2);
    this.subtables.remove(localCmapSubtable);
  }
  
  public void setData(b paramb)
  {
    short s1 = paramb.o();
    setVersion(s1);
    int j = paramb.o();
    s1 = 0;
    Object localObject1 = null;
    int i;
    for (int k = 0;; k = i)
    {
      if (k >= j) {
        return;
      }
      s2 = paramb.o();
      s3 = paramb.o();
      i = paramb.l();
      paramb.p();
      paramb.a(i);
      localObject1 = paramb.d();
      paramb.q();
      try
      {
        localObject1 = CMap.getMap((b)localObject1);
        if (localObject1 != null) {
          addCMap(s2, s3, (CMap)localObject1);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject2 = System.out;
          Object localObject3 = new java/lang/StringBuilder;
          String str2 = "Error reading map.  PlatformID=";
          ((StringBuilder)localObject3).<init>(str2);
          Object localObject4 = ((StringBuilder)localObject3).append(s2);
          localObject3 = ", PlatformSpecificID=";
          localObject4 = (String)localObject3 + s3;
          ((PrintStream)localObject2).println((String)localObject4);
          localObject4 = System.out;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localObject2 = "Reason: ";
          localStringBuilder.<init>((String)localObject2);
          String str1 = localException;
          ((PrintStream)localObject4).println(str1);
        }
      }
      i = k + 1;
    }
  }
  
  public void setVersion(short paramShort)
  {
    this.version = paramShort;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str1 = "    ";
    Object localObject1 = new java/lang/StringBuilder;
    Object localObject2 = String.valueOf(str1);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("Version: ");
    int i = getVersion();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    localObject2 = String.valueOf(str1);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("NumMaps: ");
    i = getNumberSubtables();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = this.subtables.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        return localStringBuffer.toString();
      }
      localObject1 = (CmapTable.CmapSubtable)((Iterator)localObject2).next();
      Object localObject3 = new java/lang/StringBuilder;
      String str2 = String.valueOf(str1);
      ((StringBuilder)localObject3).<init>(str2);
      localObject3 = ((StringBuilder)localObject3).append("Map: platformID: ");
      int j = ((CmapTable.CmapSubtable)localObject1).platformID;
      localObject3 = ((StringBuilder)localObject3).append(j).append(" PlatformSpecificID: ");
      j = ((CmapTable.CmapSubtable)localObject1).platformSpecificID;
      localObject3 = ((StringBuilder)localObject3).append(j);
      str2 = "\n";
      localObject3 = str2;
      localStringBuffer.append((String)localObject3);
      localObject3 = this.subtables;
      localObject1 = ((CMap)((SortedMap)localObject3).get(localObject1)).toString();
      localStringBuffer.append((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\CmapTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */