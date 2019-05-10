package b.a.a.a.b.f;

import b.a.a.a.c;
import b.a.a.a.k.f;
import b.a.a.a.k.l;
import b.a.a.a.k.u;
import b.a.a.a.o.d;
import b.a.a.a.y;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class e
{
  private static final char[] a;
  private static final String b;
  private static final BitSet c;
  private static final BitSet d;
  private static final BitSet e;
  private static final BitSet f;
  private static final BitSet g;
  private static final BitSet h;
  private static final BitSet i;
  
  static
  {
    int j = 44;
    int k = 43;
    int m = 38;
    int n = 36;
    int i1 = 256;
    Object localObject1 = new char[2];
    Object tmp24_22 = localObject1;
    tmp24_22[0] = 38;
    tmp24_22[1] = 59;
    a = (char[])localObject1;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("[");
    Object localObject2 = new java/lang/String;
    char[] arrayOfChar = a;
    ((String)localObject2).<init>(arrayOfChar);
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = "]";
    b = (String)localObject2;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    c = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    d = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    e = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    f = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    g = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    h = (BitSet)localObject1;
    localObject1 = new java/util/BitSet;
    ((BitSet)localObject1).<init>(i1);
    i = (BitSet)localObject1;
    int i2 = 97;
    int i3;
    for (;;)
    {
      i3 = 122;
      if (i2 > i3) {
        break;
      }
      localObject2 = c;
      ((BitSet)localObject2).set(i2);
      i2 += 1;
    }
    i2 = 65;
    for (;;)
    {
      i3 = 90;
      if (i2 > i3) {
        break;
      }
      localObject2 = c;
      ((BitSet)localObject2).set(i2);
      i2 += 1;
    }
    i2 = 48;
    for (;;)
    {
      i3 = 57;
      if (i2 > i3) {
        break;
      }
      localObject2 = c;
      ((BitSet)localObject2).set(i2);
      i2 += 1;
    }
    c.set(95);
    c.set(45);
    c.set(46);
    c.set(42);
    localObject1 = i;
    localObject2 = c;
    ((BitSet)localObject1).or((BitSet)localObject2);
    c.set(33);
    c.set(126);
    c.set(39);
    c.set(40);
    c.set(41);
    d.set(j);
    d.set(59);
    d.set(58);
    d.set(n);
    d.set(m);
    d.set(k);
    d.set(61);
    localObject1 = e;
    localObject2 = c;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = e;
    localObject2 = d;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = f;
    localObject2 = c;
    ((BitSet)localObject1).or((BitSet)localObject2);
    f.set(47);
    f.set(59);
    f.set(58);
    f.set(64);
    f.set(m);
    f.set(61);
    f.set(k);
    f.set(n);
    f.set(j);
    h.set(59);
    h.set(47);
    h.set(63);
    h.set(58);
    h.set(64);
    h.set(m);
    h.set(61);
    h.set(k);
    h.set(n);
    h.set(j);
    h.set(91);
    h.set(93);
    localObject1 = g;
    localObject2 = h;
    ((BitSet)localObject1).or((BitSet)localObject2);
    localObject1 = g;
    localObject2 = c;
    ((BitSet)localObject1).or((BitSet)localObject2);
  }
  
  public static String a(Iterable paramIterable, char paramChar, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (y)localIterator.next();
      String str = f(((y)localObject).a(), paramCharset);
      localObject = f(((y)localObject).b(), paramCharset);
      int j = localStringBuilder.length();
      if (j > 0) {
        localStringBuilder.append(paramChar);
      }
      localStringBuilder.append(str);
      if (localObject != null)
      {
        str = "=";
        localStringBuilder.append(str);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String a(Iterable paramIterable, Charset paramCharset)
  {
    return a(paramIterable, '&', paramCharset);
  }
  
  private static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramString2 != null) {}
    for (Object localObject = Charset.forName(paramString2);; localObject = c.a)
    {
      BitSet localBitSet = i;
      boolean bool = true;
      localObject = a(paramString1, (Charset)localObject, localBitSet, bool);
      break;
    }
  }
  
  private static String a(String paramString, Charset paramCharset, BitSet paramBitSet, boolean paramBoolean)
  {
    int j = 16;
    if (paramString == null) {}
    for (Object localObject = null;; localObject = ((StringBuilder)localObject).toString())
    {
      return (String)localObject;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ByteBuffer localByteBuffer = paramCharset.encode(paramString);
      for (;;)
      {
        boolean bool1 = localByteBuffer.hasRemaining();
        if (!bool1) {
          break;
        }
        int k = localByteBuffer.get() & 0xFF;
        boolean bool2 = paramBitSet.get(k);
        if (bool2)
        {
          k = (char)k;
          ((StringBuilder)localObject).append(k);
        }
        else
        {
          if (paramBoolean)
          {
            int m = 32;
            if (k == m)
            {
              c1 = '+';
              ((StringBuilder)localObject).append(c1);
              continue;
            }
          }
          String str = "%";
          ((StringBuilder)localObject).append(str);
          char c2 = Character.toUpperCase(Character.forDigit(c1 >> '\004' & 0xF, j));
          char c1 = Character.toUpperCase(Character.forDigit(c1 & 0xF, j));
          ((StringBuilder)localObject).append(c2);
          ((StringBuilder)localObject).append(c1);
        }
      }
    }
  }
  
  private static String a(String paramString, Charset paramCharset, boolean paramBoolean)
  {
    int j = 37;
    int k = 16;
    int m = -1;
    int n;
    if (paramString == null) {
      n = 0;
    }
    for (Object localObject = null;; localObject = paramCharset.decode((ByteBuffer)localObject).toString())
    {
      return (String)localObject;
      n = paramString.length();
      localObject = ByteBuffer.allocate(n);
      CharBuffer localCharBuffer = CharBuffer.wrap(paramString);
      for (;;)
      {
        boolean bool = localCharBuffer.hasRemaining();
        if (!bool) {
          break;
        }
        int i1 = localCharBuffer.get();
        if (i1 == j)
        {
          int i2 = localCharBuffer.remaining();
          int i3 = 2;
          if (i2 >= i3)
          {
            char c1 = localCharBuffer.get();
            i2 = localCharBuffer.get();
            int i4 = Character.digit(c1, k);
            int i5 = Character.digit(i2, k);
            if ((i4 != m) && (i5 != m))
            {
              b1 = (byte)((i4 << 4) + i5);
              ((ByteBuffer)localObject).put(b1);
              continue;
            }
            ((ByteBuffer)localObject).put(j);
            b1 = (byte)b1;
            ((ByteBuffer)localObject).put(b1);
            b1 = (byte)i2;
            ((ByteBuffer)localObject).put(b1);
            continue;
          }
        }
        if (paramBoolean)
        {
          byte b2 = 43;
          if (b1 == b2)
          {
            b1 = 32;
            ((ByteBuffer)localObject).put(b1);
            continue;
          }
        }
        byte b1 = (byte)b1;
        ((ByteBuffer)localObject).put(b1);
      }
      ((ByteBuffer)localObject).flip();
    }
  }
  
  public static String a(List paramList, char paramChar, String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (y)localIterator.next();
      String str = a(((y)localObject).a(), paramString);
      localObject = a(((y)localObject).b(), paramString);
      int j = localStringBuilder.length();
      if (j > 0) {
        localStringBuilder.append(paramChar);
      }
      localStringBuilder.append(str);
      if (localObject != null)
      {
        str = "=";
        localStringBuilder.append(str);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String a(List paramList, String paramString)
  {
    return a(paramList, '&', paramString);
  }
  
  public static List a(String paramString, Charset paramCharset)
  {
    char[] arrayOfChar = a;
    return a(paramString, paramCharset, arrayOfChar);
  }
  
  public static List a(String paramString, Charset paramCharset, char... paramVarArgs)
  {
    if (paramString == null)
    {
      localObject1 = Collections.emptyList();
      return (List)localObject1;
    }
    f localf = f.b;
    d locald = new b/a/a/a/o/d;
    int j = paramString.length();
    locald.<init>(j);
    locald.a(paramString);
    u localu = new b/a/a/a/k/u;
    j = 0;
    int k = locald.c();
    localu.<init>(0, k);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    for (;;)
    {
      boolean bool = localu.c();
      if (bool) {
        break;
      }
      Object localObject2 = localf.a(locald, localu, paramVarArgs);
      Object localObject3 = ((y)localObject2).a();
      int m = ((String)localObject3).length();
      if (m > 0)
      {
        localObject3 = new b/a/a/a/k/l;
        String str = e(((y)localObject2).a(), paramCharset);
        localObject2 = e(((y)localObject2).b(), paramCharset);
        ((l)localObject3).<init>(str, (String)localObject2);
        ((List)localObject1).add(localObject3);
      }
    }
  }
  
  static String b(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = e;
    return a(paramString, paramCharset, localBitSet, false);
  }
  
  static String c(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = g;
    return a(paramString, paramCharset, localBitSet, false);
  }
  
  static String d(String paramString, Charset paramCharset)
  {
    BitSet localBitSet = f;
    return a(paramString, paramCharset, localBitSet, false);
  }
  
  private static String e(String paramString, Charset paramCharset)
  {
    boolean bool;
    String str;
    if (paramString == null)
    {
      bool = false;
      str = null;
      return str;
    }
    if (paramCharset != null) {}
    for (;;)
    {
      bool = true;
      str = a(paramString, paramCharset, bool);
      break;
      paramCharset = c.a;
    }
  }
  
  private static String f(String paramString, Charset paramCharset)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramCharset != null) {}
    for (;;)
    {
      localObject = i;
      boolean bool = true;
      localObject = a(paramString, paramCharset, (BitSet)localObject, bool);
      break;
      paramCharset = c.a;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */