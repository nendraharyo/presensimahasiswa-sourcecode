package com.sun.pdfview.font.ttf;

import c.a.a.b.b;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class NameTable
  extends TrueTypeTable
{
  public static final short ENCODINGID_MAC_ROMAN = 0;
  public static final short ENCODINGID_UNICODE_DEFAULT = 0;
  public static final short ENCODINGID_UNICODE_V11 = 1;
  public static final short ENCODINGID_UNICODE_V2 = 3;
  public static final short LANGUAGEID_MAC_ENGLISH = 0;
  public static final short NAMEID_COPYRIGHT = 0;
  public static final short NAMEID_FAMILY = 1;
  public static final short NAMEID_FULL_NAME = 4;
  public static final short NAMEID_POSTSCRIPT_NAME = 6;
  public static final short NAMEID_SUBFAMILY = 2;
  public static final short NAMEID_SUBFAMILY_UNIQUE = 3;
  public static final short NAMEID_TRADEMARK = 7;
  public static final short NAMEID_VERSION = 5;
  public static final short PLATFORMID_MACINTOSH = 1;
  public static final short PLATFORMID_MICROSOFT = 3;
  public static final short PLATFORMID_UNICODE;
  private short format;
  private SortedMap records;
  
  protected NameTable()
  {
    super(1851878757);
    Object localObject = new java/util/TreeMap;
    ((TreeMap)localObject).<init>();
    localObject = Collections.synchronizedSortedMap((SortedMap)localObject);
    this.records = ((SortedMap)localObject);
  }
  
  public static String getCharsetName(int paramInt1, int paramInt2)
  {
    String str = "US-ASCII";
    switch (paramInt1)
    {
    }
    for (;;)
    {
      return str;
      str = "UTF-16";
      continue;
      str = "UTF-16";
    }
  }
  
  public void addRecord(short paramShort1, short paramShort2, short paramShort3, short paramShort4, String paramString)
  {
    NameTable.NameRecord localNameRecord = new com/sun/pdfview/font/ttf/NameTable$NameRecord;
    localNameRecord.<init>(this, paramShort1, paramShort2, paramShort3, paramShort4);
    this.records.put(localNameRecord, paramString);
  }
  
  public short getCount()
  {
    return (short)this.records.size();
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    short s1 = (short)(getCount() * 12 + 6);
    short s2 = getFormat();
    localb.a(s2);
    s2 = getCount();
    localb.a(s2);
    localb.a(s1);
    s2 = 0;
    NameTable.NameRecord localNameRecord = null;
    Object localObject = this.records.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    int j;
    for (short s3 = 0;; s3 = j)
    {
      boolean bool = localIterator.hasNext();
      if (!bool)
      {
        i = s1 + s3;
        localb.a(i);
        localb.j();
        return localb;
      }
      localNameRecord = (NameTable.NameRecord)localIterator.next();
      localObject = (String)this.records.get(localNameRecord);
      short s4 = localNameRecord.platformID;
      short s5 = localNameRecord.platformSpecificID;
      Charset localCharset = Charset.forName(getCharsetName(s4, s5));
      localObject = b.a(localCharset.encode((String)localObject));
      s4 = (short)(((b)localObject).c() & (char)-1);
      s5 = localNameRecord.platformID;
      localb.a(s5);
      s5 = localNameRecord.platformSpecificID;
      localb.a(s5);
      s5 = localNameRecord.languageID;
      localb.a(s5);
      int i = localNameRecord.nameID;
      localb.a(i);
      localb.a(s4);
      localb.a(s3);
      localb.p();
      j = s1 + s3;
      localb.a(j);
      localb.a((b)localObject);
      localb.q();
      j = (short)(s3 + s4);
    }
  }
  
  public short getFormat()
  {
    return this.format;
  }
  
  public int getLength()
  {
    int i = getCount() * 12 + 6;
    Object localObject1 = this.records.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    int j;
    for (int k = i;; k = j)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        return k;
      }
      Object localObject2 = (NameTable.NameRecord)localIterator.next();
      localObject1 = (String)this.records.get(localObject2);
      int m = ((NameTable.NameRecord)localObject2).platformID;
      j = ((NameTable.NameRecord)localObject2).platformSpecificID;
      localObject2 = b.a(Charset.forName(getCharsetName(m, j)).encode((String)localObject1));
      j = ((b)localObject2).c() + k;
    }
  }
  
  public String getRecord(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    NameTable.NameRecord localNameRecord = new com/sun/pdfview/font/ttf/NameTable$NameRecord;
    localNameRecord.<init>(this, paramShort1, paramShort2, paramShort3, paramShort4);
    return (String)this.records.get(localNameRecord);
  }
  
  public boolean hasRecords(short paramShort)
  {
    Object localObject = this.records.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = (NameTable.NameRecord)localIterator.next();
      short s = ((NameTable.NameRecord)localObject).platformID;
      if (s != paramShort) {
        break;
      }
      s = 1;
    }
  }
  
  public boolean hasRecords(short paramShort1, short paramShort2)
  {
    Object localObject = this.records.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = (NameTable.NameRecord)localIterator.next();
      short s2 = ((NameTable.NameRecord)localObject).platformID;
      if (s2 != paramShort1) {
        break;
      }
      short s1 = ((NameTable.NameRecord)localObject).platformSpecificID;
      if (s1 != paramShort2) {
        break;
      }
      s1 = 1;
    }
  }
  
  public void removeRecord(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    NameTable.NameRecord localNameRecord = new com/sun/pdfview/font/ttf/NameTable$NameRecord;
    localNameRecord.<init>(this, paramShort1, paramShort2, paramShort3, paramShort4);
    this.records.remove(localNameRecord);
  }
  
  public void setData(b paramb)
  {
    int i = (char)-1;
    short s1 = paramb.o();
    setFormat(s1);
    int k = paramb.o();
    int m = paramb.o();
    s1 = 0;
    Object localObject1 = null;
    int j;
    for (int n = 0;; n = j)
    {
      if (n >= k) {
        return;
      }
      short s2 = paramb.o();
      short s3 = paramb.o();
      short s4 = paramb.o();
      short s5 = paramb.o();
      s1 = paramb.o() & i;
      int i1 = paramb.o() & i;
      paramb.p();
      i1 += m;
      paramb.a(i1);
      Object localObject2 = paramb.d();
      ((b)localObject2).d(s1);
      paramb.q();
      localObject1 = Charset.forName(getCharsetName(s2, s3));
      localObject2 = ((b)localObject2).r();
      localObject2 = ((Charset)localObject1).decode((ByteBuffer)localObject2).toString();
      localObject1 = this;
      addRecord(s2, s3, s4, s5, (String)localObject2);
      j = n + 1;
    }
  }
  
  public void setFormat(short paramShort)
  {
    this.format = paramShort;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str = "    ";
    Object localObject1 = new java/lang/StringBuilder;
    Object localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("Format: ");
    int i = getFormat();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    localObject2 = String.valueOf(str);
    ((StringBuilder)localObject1).<init>((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).append("Count : ");
    i = getCount();
    localObject1 = i + "\n";
    localStringBuffer.append((String)localObject1);
    localObject1 = this.records.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        return localStringBuffer.toString();
      }
      localObject1 = (NameTable.NameRecord)((Iterator)localObject2).next();
      Object localObject3 = new java/lang/StringBuilder;
      Object localObject4 = String.valueOf(str);
      ((StringBuilder)localObject3).<init>((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append(" platformID: ");
      int j = ((NameTable.NameRecord)localObject1).platformID;
      localObject3 = j;
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(" platformSpecificID: ");
      j = ((NameTable.NameRecord)localObject1).platformSpecificID;
      localObject3 = j;
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(" languageID: ");
      j = ((NameTable.NameRecord)localObject1).languageID;
      localObject3 = j;
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(" nameID: ");
      j = ((NameTable.NameRecord)localObject1).nameID;
      localObject3 = j + "\n";
      localStringBuffer.append((String)localObject3);
      localObject3 = new java/lang/StringBuilder;
      localObject4 = String.valueOf(str);
      ((StringBuilder)localObject3).<init>((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append("  ");
      localObject4 = this.records;
      localObject1 = (String)((SortedMap)localObject4).get(localObject1);
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "\n";
      localObject1 = (String)localObject3;
      localStringBuffer.append((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\NameTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */