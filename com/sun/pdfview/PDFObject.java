package com.sun.pdfview;

import com.sun.pdfview.decode.PDFDecoder;
import com.sun.pdfview.decrypt.IdentityDecrypter;
import com.sun.pdfview.decrypt.PDFDecrypter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class PDFObject
{
  public static final int ARRAY = 5;
  public static final int BOOLEAN = 1;
  public static final int DICTIONARY = 6;
  public static final int INDIRECT = 0;
  public static final int KEYWORD = 9;
  public static final int NAME = 4;
  public static final int NULL = 8;
  public static final int NUMBER = 2;
  public static final int OBJ_NUM_EMBEDDED = 254;
  public static final int OBJ_NUM_TRAILER = 255;
  public static final int STREAM = 7;
  public static final int STRING = 3;
  public static final PDFObject nullObj;
  private c.a.a.d.b cache;
  private c.a.a.d.b decodedStream;
  private int objGen;
  private int objNum;
  private PDFFile owner;
  private c.a.a.b.b stream;
  private int type;
  private Object value;
  
  static
  {
    Object localObject = PDFObject.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new com/sun/pdfview/PDFObject;
      ((PDFObject)localObject).<init>(null, 8, null);
      nullObj = (PDFObject)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public PDFObject(PDFFile paramPDFFile, int paramInt, Object paramObject)
  {
    this.objNum = k;
    this.objGen = k;
    this.type = paramInt;
    k = 4;
    if (paramInt == k) {
      paramObject = ((String)paramObject).intern();
    }
    for (;;)
    {
      this.value = paramObject;
      this.owner = paramPDFFile;
      return;
      String str;
      boolean bool;
      if (paramInt == i)
      {
        str = "true";
        bool = paramObject.equals(str);
        if (bool)
        {
          this.type = j;
          paramObject = Boolean.TRUE;
          continue;
        }
      }
      if (paramInt == i)
      {
        str = "false";
        bool = paramObject.equals(str);
        if (bool)
        {
          this.type = j;
          paramObject = Boolean.FALSE;
        }
      }
    }
  }
  
  public PDFObject(PDFFile paramPDFFile, PDFXref paramPDFXref)
  {
    this.objNum = i;
    this.objGen = i;
    this.type = 0;
    this.value = paramPDFXref;
    this.owner = paramPDFFile;
  }
  
  public PDFObject(Object paramObject)
  {
    this.objNum = k;
    this.objGen = k;
    Object localObject1 = null;
    this.owner = null;
    this.value = paramObject;
    boolean bool1 = paramObject instanceof Double;
    if (!bool1)
    {
      bool1 = paramObject instanceof Integer;
      if (!bool1) {}
    }
    else
    {
      int m = 2;
      this.type = m;
    }
    for (;;)
    {
      return;
      int n = paramObject instanceof String;
      if (n != 0)
      {
        this.type = j;
      }
      else
      {
        n = paramObject instanceof PDFObject[];
        if (n != 0)
        {
          this.type = i;
        }
        else
        {
          n = paramObject instanceof Object[];
          if (n != 0)
          {
            paramObject = (Object[])paramObject;
            localObject2 = new PDFObject[paramObject.length];
            n = 0;
            localObject1 = null;
            for (;;)
            {
              i3 = paramObject.length;
              if (n >= i3)
              {
                this.value = localObject2;
                this.type = i;
                break;
              }
              PDFObject localPDFObject = new com/sun/pdfview/PDFObject;
              Object localObject3 = paramObject[n];
              localPDFObject.<init>(localObject3);
              localObject2[n] = localPDFObject;
              int i1;
              n += 1;
            }
          }
          boolean bool2 = paramObject instanceof HashMap;
          if (bool2)
          {
            int i2 = 6;
            this.type = i2;
          }
          else
          {
            boolean bool3 = paramObject instanceof Boolean;
            if (bool3)
            {
              this.type = i3;
            }
            else
            {
              bool3 = paramObject instanceof PDFParser.Tok;
              if (!bool3) {
                break;
              }
              paramObject = (PDFParser.Tok)paramObject;
              localObject1 = ((PDFParser.Tok)paramObject).name;
              localObject2 = "true";
              bool3 = ((String)localObject1).equals(localObject2);
              if (bool3)
              {
                localObject1 = Boolean.TRUE;
                this.value = localObject1;
                this.type = i3;
              }
              else
              {
                localObject1 = ((PDFParser.Tok)paramObject).name;
                localObject2 = "false";
                bool3 = ((String)localObject1).equals(localObject2);
                if (bool3)
                {
                  localObject1 = Boolean.FALSE;
                  this.value = localObject1;
                  this.type = i3;
                }
                else
                {
                  localObject1 = ((PDFParser.Tok)paramObject).name;
                  this.value = localObject1;
                  this.type = j;
                }
              }
            }
          }
        }
      }
    }
    localObject1 = new com/sun/pdfview/PDFParseException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Bad type for raw PDFObject: ");
    localObject2 = paramObject;
    ((PDFParseException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private c.a.a.b.b decodeStream()
  {
    c.a.a.b.b localb = null;
    c.a.a.d.b localb1 = this.decodedStream;
    if (localb1 != null) {
      localb = (c.a.a.b.b)this.decodedStream.a();
    }
    if (localb == null)
    {
      this.stream.e();
      localb = this.stream;
      localb = PDFDecoder.decodeStream(this, localb);
      localb1 = new c/a/a/d/b;
      localb1.<init>(localb);
      this.decodedStream = localb1;
    }
    return localb;
  }
  
  public PDFObject cachedDereference()
  {
    int i = this.type;
    if (i == 0)
    {
      i = 0;
      PDFObject localPDFObject = null;
      Object localObject1 = this.cache;
      if (localObject1 != null) {
        localPDFObject = (PDFObject)this.cache.a();
      }
      if (localPDFObject != null)
      {
        localObject1 = localPDFObject.value;
        if (localObject1 != null) {}
      }
      else
      {
        localObject1 = this.owner;
        if (localObject1 == null)
        {
          localObject1 = System.out;
          Object localObject2 = new java/lang/StringBuilder;
          String str = "Bad seed (owner==null)!  Object=";
          ((StringBuilder)localObject2).<init>(str);
          localObject2 = this;
          ((PrintStream)localObject1).println((String)localObject2);
        }
      }
      this = localPDFObject;
    }
    return this;
  }
  
  public PDFObject dereference()
  {
    int i = this.type;
    Object localObject1;
    if (i == 0)
    {
      i = 0;
      localObject1 = null;
      Object localObject2 = this.cache;
      if (localObject2 != null) {
        localObject1 = (PDFObject)this.cache.a();
      }
      if (localObject1 != null)
      {
        localObject2 = ((PDFObject)localObject1).value;
        if (localObject2 != null) {}
      }
      else
      {
        localObject1 = this.owner;
        if (localObject1 == null)
        {
          localObject1 = System.out;
          localObject2 = new java/lang/StringBuilder;
          localObject3 = "Bad seed (owner==null)!  Object=";
          ((StringBuilder)localObject2).<init>((String)localObject3);
          localObject2 = this;
          ((PrintStream)localObject1).println((String)localObject2);
        }
        localObject2 = this.owner;
        localObject1 = (PDFXref)this.value;
        Object localObject3 = getDecrypter();
        localObject1 = ((PDFFile)localObject2).dereference((PDFXref)localObject1, (PDFDecrypter)localObject3);
        localObject2 = new c/a/a/d/b;
        ((c.a.a.d.b)localObject2).<init>(localObject1);
        this.cache = ((c.a.a.d.b)localObject2);
      }
    }
    for (;;)
    {
      return (PDFObject)localObject1;
      localObject1 = this;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = super.equals(paramObject);
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      int i = this.type;
      if (i == 0)
      {
        boolean bool3 = paramObject instanceof PDFObject;
        if (bool3)
        {
          paramObject = (PDFObject)paramObject;
          int j = ((PDFObject)paramObject).type;
          if (j == 0)
          {
            localPDFXref1 = (PDFXref)this.value;
            PDFXref localPDFXref2 = (PDFXref)((PDFObject)paramObject).value;
            int k = localPDFXref1.getID();
            int m = localPDFXref2.getID();
            if (k == m)
            {
              k = localPDFXref1.getGeneration();
              m = localPDFXref2.getGeneration();
              if (k == m)
              {
                bool4 = localPDFXref1.getCompressed();
                boolean bool5 = localPDFXref2.getCompressed();
                if (bool4 == bool5)
                {
                  bool4 = bool1;
                  continue;
                }
              }
            }
            bool4 = false;
            localPDFXref1 = null;
            continue;
          }
        }
      }
      boolean bool4 = false;
      PDFXref localPDFXref1 = null;
    }
  }
  
  public PDFObject[] getArray()
  {
    int i = this.type;
    PDFObject[] arrayOfPDFObject;
    if (i == 0) {
      arrayOfPDFObject = dereference().getArray();
    }
    for (;;)
    {
      return arrayOfPDFObject;
      i = this.type;
      int j = 5;
      if (i == j)
      {
        arrayOfPDFObject = (PDFObject[])this.value;
      }
      else
      {
        i = 1;
        arrayOfPDFObject = new PDFObject[i];
        j = 0;
        arrayOfPDFObject[0] = this;
      }
    }
  }
  
  public PDFObject getAt(int paramInt)
  {
    int i = this.type;
    PDFObject localPDFObject;
    if (i == 0) {
      localPDFObject = dereference().getAt(paramInt);
    }
    for (;;)
    {
      return localPDFObject;
      i = this.type;
      int j = 5;
      if (i == j)
      {
        localPDFObject = ((PDFObject[])this.value)[paramInt];
      }
      else
      {
        i = 0;
        localPDFObject = null;
      }
    }
  }
  
  public boolean getBooleanValue()
  {
    int i = 1;
    int j = this.type;
    PDFObject localPDFObject;
    if (j == 0)
    {
      localPDFObject = dereference();
      i = localPDFObject.getBooleanValue();
    }
    for (;;)
    {
      return i;
      j = this.type;
      if (j == i)
      {
        Object localObject = this.value;
        Boolean localBoolean = Boolean.TRUE;
        if (localObject != localBoolean)
        {
          i = 0;
          localPDFObject = null;
        }
      }
      else
      {
        i = 0;
        localPDFObject = null;
      }
    }
  }
  
  public Object getCache()
  {
    int i = this.type;
    Object localObject;
    if (i == 0) {
      localObject = dereference().getCache();
    }
    for (;;)
    {
      return localObject;
      localObject = this.cache;
      if (localObject != null)
      {
        localObject = this.cache.a();
      }
      else
      {
        i = 0;
        localObject = null;
      }
    }
  }
  
  public PDFDecrypter getDecrypter()
  {
    Object localObject = this.owner;
    if (localObject != null) {}
    for (localObject = this.owner.getDefaultDecrypter();; localObject = IdentityDecrypter.getInstance()) {
      return (PDFDecrypter)localObject;
    }
  }
  
  public Iterator getDictKeys()
  {
    int i = this.type;
    Object localObject;
    if (i == 0) {
      localObject = dereference().getDictKeys();
    }
    for (;;)
    {
      return (Iterator)localObject;
      i = this.type;
      int j = 6;
      if (i != j)
      {
        i = this.type;
        j = 7;
        if (i != j) {}
      }
      else
      {
        localObject = ((HashMap)this.value).keySet().iterator();
        continue;
      }
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      localObject = ((ArrayList)localObject).iterator();
    }
  }
  
  public PDFObject getDictRef(String paramString)
  {
    int i = this.type;
    Object localObject;
    if (i == 0) {
      localObject = dereference().getDictRef(paramString);
    }
    for (;;)
    {
      return (PDFObject)localObject;
      i = this.type;
      int j = 6;
      if (i != j)
      {
        i = this.type;
        j = 7;
        if (i != j) {}
      }
      else
      {
        String str = paramString.intern();
        localObject = (HashMap)this.value;
        str = str.intern();
        localObject = (PDFObject)((HashMap)localObject).get(str);
        continue;
      }
      i = 0;
      localObject = null;
    }
  }
  
  public HashMap getDictionary()
  {
    int i = this.type;
    HashMap localHashMap;
    if (i == 0) {
      localHashMap = dereference().getDictionary();
    }
    for (;;)
    {
      return localHashMap;
      i = this.type;
      int j = 6;
      if (i != j)
      {
        i = this.type;
        j = 7;
        if (i != j) {}
      }
      else
      {
        localHashMap = (HashMap)this.value;
        continue;
      }
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
    }
  }
  
  public double getDoubleValue()
  {
    int i = this.type;
    Object localObject;
    double d;
    if (i == 0)
    {
      localObject = dereference();
      d = ((PDFObject)localObject).getDoubleValue();
    }
    for (;;)
    {
      return d;
      i = this.type;
      int j = 2;
      if (i == j)
      {
        localObject = (Double)this.value;
        d = ((Double)localObject).doubleValue();
      }
      else
      {
        d = 0.0D;
      }
    }
  }
  
  public float getFloatValue()
  {
    int i = this.type;
    Object localObject;
    float f;
    if (i == 0)
    {
      localObject = dereference();
      f = ((PDFObject)localObject).getFloatValue();
    }
    for (;;)
    {
      return f;
      i = this.type;
      int j = 2;
      if (i == j)
      {
        localObject = (Double)this.value;
        f = ((Double)localObject).floatValue();
      }
      else
      {
        i = 0;
        f = 0.0F;
        localObject = null;
      }
    }
  }
  
  public int getIntValue()
  {
    int i = this.type;
    Object localObject;
    if (i == 0)
    {
      localObject = dereference();
      i = ((PDFObject)localObject).getIntValue();
    }
    for (;;)
    {
      return i;
      i = this.type;
      int j = 2;
      if (i == j)
      {
        localObject = (Double)this.value;
        i = ((Double)localObject).intValue();
      }
      else
      {
        i = 0;
        localObject = null;
      }
    }
  }
  
  public int getObjGen()
  {
    return this.objGen;
  }
  
  public int getObjNum()
  {
    return this.objNum;
  }
  
  public byte[] getStream()
  {
    boolean bool = false;
    byte[] arrayOfByte1 = null;
    int j = this.type;
    if (j == 0) {
      arrayOfByte1 = dereference().getStream();
    }
    for (;;)
    {
      return arrayOfByte1;
      j = this.type;
      int k = 7;
      byte[] arrayOfByte2;
      if (j == k)
      {
        ??? = this.stream;
        if (??? != null)
        {
          arrayOfByte1 = (byte[])null;
          c.a.a.b.b localb2;
          synchronized (this.stream)
          {
            localb2 = decodeStream();
            bool = localb2.g();
            if (bool)
            {
              i = localb2.h();
              if (i == 0)
              {
                arrayOfByte1 = localb2.i();
                int m = arrayOfByte1.length;
                int n = localb2.c();
                if (m != n) {}
              }
            }
          }
          int i = localb2.c();
          arrayOfByte2 = new byte[i];
          localb2.a(arrayOfByte2);
          localb2.j();
          continue;
        }
      }
      j = this.type;
      k = 3;
      if (j == k) {
        arrayOfByte2 = PDFStringUtil.asBytes(getStringValue());
      }
    }
  }
  
  public c.a.a.b.b getStreamBuffer()
  {
    int i = this.type;
    c.a.a.b.b localb1;
    if (i == 0) {
      localb1 = dereference().getStreamBuffer();
    }
    for (;;)
    {
      return localb1;
      i = this.type;
      int j = 7;
      if (i == j)
      {
        localb1 = this.stream;
        if (localb1 != null) {
          synchronized (this.stream)
          {
            localb1 = decodeStream();
            localb1 = localb1.k();
          }
        }
      }
      i = this.type;
      j = 3;
      c.a.a.b.b localb2;
      if (i == j)
      {
        localb2 = c.a.a.b.b.d(getStringValue().getBytes());
      }
      else
      {
        i = 0;
        localb2 = null;
      }
    }
  }
  
  public String getStringValue()
  {
    int i = this.type;
    String str;
    if (i == 0) {
      str = dereference().getStringValue();
    }
    for (;;)
    {
      return str;
      i = this.type;
      int j = 3;
      if (i != j)
      {
        i = this.type;
        j = 4;
        if (i != j)
        {
          i = this.type;
          j = 9;
          if (i != j) {
            break label67;
          }
        }
      }
      str = (String)this.value;
      continue;
      label67:
      i = 0;
      str = null;
    }
  }
  
  public String getTextStringValue()
  {
    return PDFStringUtil.asTextString(getStringValue());
  }
  
  public int getType()
  {
    int i = this.type;
    PDFObject localPDFObject;
    if (i == 0) {
      localPDFObject = dereference();
    }
    for (i = localPDFObject.getType();; i = this.type) {
      return i;
    }
  }
  
  public boolean isDictType(String paramString)
  {
    boolean bool1 = false;
    PDFObject localPDFObject = null;
    int i = this.type;
    if (i == 0)
    {
      localPDFObject = dereference();
      bool1 = localPDFObject.isDictType(paramString);
    }
    for (;;)
    {
      return bool1;
      i = this.type;
      int j = 6;
      if (i != j)
      {
        i = this.type;
        j = 7;
        if (i != j) {}
      }
      else
      {
        Object localObject = getDictRef("Type");
        if (localObject != null)
        {
          localObject = ((PDFObject)localObject).getStringValue();
          boolean bool2 = ((String)localObject).equals(paramString);
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public boolean isIndirect()
  {
    int i = this.type;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void setCache(Object paramObject)
  {
    int i = this.type;
    Object localObject;
    if (i == 0)
    {
      localObject = dereference();
      ((PDFObject)localObject).setCache(paramObject);
    }
    for (;;)
    {
      return;
      localObject = new c/a/a/d/b;
      ((c.a.a.d.b)localObject).<init>(paramObject);
      this.cache = ((c.a.a.d.b)localObject);
    }
  }
  
  public void setObjectId(int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool = $assertionsDisabled;
    AssertionError localAssertionError;
    if ((!bool) && (paramInt1 < i))
    {
      localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>();
      throw localAssertionError;
    }
    bool = $assertionsDisabled;
    if ((!bool) && (paramInt2 < i))
    {
      localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>();
      throw localAssertionError;
    }
    this.objNum = paramInt1;
    this.objGen = paramInt2;
  }
  
  public void setStream(c.a.a.b.b paramb)
  {
    this.type = 7;
    this.stream = paramb;
  }
  
  public String toString()
  {
    int i = 30;
    for (;;)
    {
      try
      {
        n = this.type;
        if (n != 0) {
          continue;
        }
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject2 = new java/lang/StringBuilder;
        localObject3 = "Indirect to #";
        ((StringBuilder)localObject2).<init>((String)localObject3);
        localObject3 = this.value;
        localObject3 = (PDFXref)localObject3;
        i = ((PDFXref)localObject3).getID();
        localObject2 = ((StringBuilder)localObject2).append(i);
        localObject3 = this.value;
        localObject3 = (PDFXref)localObject3;
        bool = ((PDFXref)localObject3).getCompressed();
        if (bool)
        {
          localObject3 = " comp";
          localObject3 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((StringBuffer)localObject1).append((String)localObject3);
        }
      }
      catch (IOException localIOException)
      {
        Object localObject3;
        String str;
        Object localObject1 = new java/lang/StringBuilder;
        Object localObject2 = "Caught an error: ";
        ((StringBuilder)localObject1).<init>((String)localObject2);
        Object localObject5 = localIOException;
        continue;
        int n = this.type;
        int i1 = 1;
        if (n != i1) {
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        localObject5 = "Boolean: ";
        ((StringBuilder)localObject1).<init>((String)localObject5);
        boolean bool = getBooleanValue();
        if (!bool) {
          continue;
        }
        localObject5 = "true";
        localObject5 = ((StringBuilder)localObject1).append((String)localObject5);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        localObject5 = "false";
        continue;
        n = this.type;
        i1 = 2;
        if (n != i1) {
          continue;
        }
        localObject5 = new java/lang/StringBuilder;
        localObject1 = "Number: ";
        ((StringBuilder)localObject5).<init>((String)localObject1);
        double d = getDoubleValue();
        localObject5 = ((StringBuilder)localObject5).append(d);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        n = this.type;
        i1 = 3;
        if (n != i1) {
          continue;
        }
        localObject5 = new java/lang/StringBuilder;
        localObject1 = "String: ";
        ((StringBuilder)localObject5).<init>((String)localObject1);
        localObject1 = getStringValue();
        localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        n = this.type;
        i1 = 4;
        if (n != i1) {
          continue;
        }
        localObject5 = new java/lang/StringBuilder;
        localObject1 = "Name: /";
        ((StringBuilder)localObject5).<init>((String)localObject1);
        localObject1 = getStringValue();
        localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        n = this.type;
        i1 = 5;
        if (n != i1) {
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        localObject5 = "Array, length=";
        ((StringBuilder)localObject1).<init>((String)localObject5);
        localObject5 = this.value;
        localObject5 = (PDFObject[])localObject5;
        int j = localObject5.length;
        localObject5 = ((StringBuilder)localObject1).append(j);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        n = this.type;
        i1 = 6;
        if (n != i1) {
          continue;
        }
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject5 = "Type";
        localObject5 = getDictRef((String)localObject5);
        if (localObject5 == null) {
          continue;
        }
        localObject5 = ((PDFObject)localObject5).getStringValue();
        ((StringBuffer)localObject1).append((String)localObject5);
        localObject5 = "Subtype";
        localObject5 = getDictRef((String)localObject5);
        if (localObject5 != null) {
          continue;
        }
        localObject5 = "S";
        localObject5 = getDictRef((String)localObject5);
        if (localObject5 == null) {
          continue;
        }
        localObject2 = new java/lang/StringBuilder;
        Object localObject6 = "/";
        ((StringBuilder)localObject2).<init>((String)localObject6);
        localObject5 = ((PDFObject)localObject5).getStringValue();
        localObject5 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject5 = ((StringBuilder)localObject5).toString();
        ((StringBuffer)localObject1).append((String)localObject5);
        localObject5 = " dictionary. Keys:";
        ((StringBuffer)localObject1).append((String)localObject5);
        localObject5 = this.value;
        localObject5 = (HashMap)localObject5;
        localObject5 = ((HashMap)localObject5).entrySet();
        localObject2 = ((Set)localObject5).iterator();
        int k = ((Iterator)localObject2).hasNext();
        if (k != 0) {
          continue;
        }
        localObject5 = ((StringBuffer)localObject1).toString();
        continue;
        localObject5 = "Untyped";
        ((StringBuffer)localObject1).append((String)localObject5);
        continue;
        localObject5 = ((Iterator)localObject2).next();
        localObject5 = (Map.Entry)localObject5;
        localObject6 = new java/lang/StringBuilder;
        Object localObject7 = "\n   ";
        ((StringBuilder)localObject6).<init>((String)localObject7);
        localObject7 = ((Map.Entry)localObject5).getKey();
        localObject6 = ((StringBuilder)localObject6).append(localObject7);
        localObject7 = "  ";
        localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
        localObject5 = ((Map.Entry)localObject5).getValue();
        localObject5 = ((StringBuilder)localObject6).append(localObject5);
        localObject5 = ((StringBuilder)localObject5).toString();
        ((StringBuffer)localObject1).append((String)localObject5);
        continue;
        n = this.type;
        i1 = 7;
        if (n != i1) {
          continue;
        }
        localObject1 = getStream();
        if (localObject1 != null) {
          continue;
        }
        localObject5 = "Broken stream";
        continue;
        localObject2 = new java/lang/StringBuilder;
        localObject6 = "Stream: [[";
        ((StringBuilder)localObject2).<init>((String)localObject6);
        localObject6 = new java/lang/String;
        localObject7 = null;
        int i2 = localObject1.length;
        if (i2 <= k) {
          continue;
        }
        ((String)localObject6).<init>((byte[])localObject1, 0, k);
        localObject5 = ((StringBuilder)localObject2).append((String)localObject6);
        localObject1 = "]]";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        int m = localObject1.length;
        continue;
        m = this.type;
        n = 8;
        if (m != n) {
          continue;
        }
        localObject5 = "Null";
        continue;
        m = this.type;
        n = 9;
        if (m != n) {
          continue;
        }
        localObject5 = new java/lang/StringBuilder;
        localObject1 = "Keyword: ";
        ((StringBuilder)localObject5).<init>((String)localObject1);
        localObject1 = getStringValue();
        localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
        localObject5 = ((StringBuilder)localObject5).toString();
        continue;
        localObject5 = "Whoops!  big error!  Unknown type";
        continue;
      }
      try
      {
        localObject3 = cachedDereference();
        localObject2 = new java/lang/StringBuilder;
        localObject6 = "\n";
        ((StringBuilder)localObject2).<init>((String)localObject6);
        if (localObject3 != null) {
          continue;
        }
        localObject3 = "<ref>";
        localObject3 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((StringBuffer)localObject1).append((String)localObject3);
      }
      finally
      {
        str = ((Throwable)localObject4).toString();
        ((StringBuffer)localObject1).append(str);
        continue;
      }
      localObject3 = ((StringBuffer)localObject1).toString();
      return (String)localObject3;
      localObject3 = "";
      continue;
      localObject3 = ((PDFObject)localObject3).toString();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */