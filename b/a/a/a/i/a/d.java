package b.a.a.a.i.a;

import b.a.a.a.a.i;
import b.a.a.a.ae;
import b.a.a.a.k;
import b.a.a.a.k.p;
import b.a.a.a.q;
import b.a.a.a.y;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class d
  extends m
{
  private static final char[] a;
  private boolean b = false;
  private String c;
  private long d;
  private String e;
  private String f;
  private String g;
  
  static
  {
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = 48;
    arrayOfChar[1] = 49;
    arrayOfChar[2] = 50;
    arrayOfChar[3] = 51;
    arrayOfChar[4] = 52;
    arrayOfChar[5] = 53;
    arrayOfChar[6] = 54;
    arrayOfChar[7] = 55;
    arrayOfChar[8] = 56;
    arrayOfChar[9] = 57;
    arrayOfChar[10] = 97;
    arrayOfChar[11] = 98;
    arrayOfChar[12] = 99;
    arrayOfChar[13] = 100;
    arrayOfChar[14] = 101;
    arrayOfChar[15] = 102;
    a = arrayOfChar;
  }
  
  public d()
  {
    this(localCharset);
  }
  
  public d(Charset paramCharset)
  {
    super(paramCharset);
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[i * 2];
    int j = 0;
    String str = null;
    while (j < i)
    {
      int k = paramArrayOfByte[j] & 0xF;
      int m = (paramArrayOfByte[j] & 0xF0) >> 4;
      int n = j * 2;
      char[] arrayOfChar2 = a;
      m = arrayOfChar2[m];
      arrayOfChar1[n] = m;
      m = j * 2 + 1;
      char[] arrayOfChar3 = a;
      k = arrayOfChar3[k];
      arrayOfChar1[m] = k;
      j += 1;
    }
    str = new java/lang/String;
    str.<init>(arrayOfChar1);
    return str;
  }
  
  private b.a.a.a.e b(b.a.a.a.a.m paramm, q paramq)
  {
    Object localObject1 = this;
    Object localObject2 = a("uri");
    Object localObject3 = a("realm");
    String str1 = a("nonce");
    String str2 = a("opaque");
    Object localObject4 = a("methodname");
    Object localObject5 = a("algorithm");
    if (localObject5 == null) {
      localObject5 = "MD5";
    }
    Object localObject6 = new java/util/HashSet;
    ((HashSet)localObject6).<init>(8);
    int i = -1;
    Object localObject7 = "qop";
    localObject1 = this;
    Object localObject8 = a((String)localObject7);
    Object localObject9;
    Object localObject10;
    int j;
    if (localObject8 != null)
    {
      localObject7 = new java/util/StringTokenizer;
      localObject9 = ",";
      ((StringTokenizer)localObject7).<init>((String)localObject8, (String)localObject9);
      for (;;)
      {
        boolean bool1 = ((StringTokenizer)localObject7).hasMoreTokens();
        if (!bool1) {
          break;
        }
        localObject9 = ((StringTokenizer)localObject7).nextToken().trim();
        localObject10 = Locale.ENGLISH;
        localObject9 = ((String)localObject9).toLowerCase((Locale)localObject10);
        ((Set)localObject6).add(localObject9);
      }
      localObject1 = paramq;
      j = paramq instanceof b.a.a.a.l;
      if (j != 0)
      {
        localObject7 = "auth-int";
        j = ((Set)localObject6).contains(localObject7);
        if (j != 0)
        {
          i = 1;
          j = i;
        }
      }
    }
    int k;
    for (;;)
    {
      i = -1;
      if (j != i) {
        break label287;
      }
      localObject5 = new b/a/a/a/a/i;
      localObject11 = new java/lang/StringBuilder;
      ((StringBuilder)localObject11).<init>();
      localObject11 = "None of the qop methods is supported: " + (String)localObject8;
      ((i)localObject5).<init>((String)localObject11);
      throw ((Throwable)localObject5);
      localObject7 = "auth";
      k = ((Set)localObject6).contains(localObject7);
      if (k == 0) {
        break;
      }
      i = 2;
      break;
      k = 0;
      localObject7 = null;
    }
    label287:
    localObject1 = this;
    Object localObject11 = a("charset");
    if (localObject11 == null) {
      localObject11 = "ISO-8859-1";
    }
    localObject8 = "MD5-sess";
    boolean bool3 = ((String)localObject5).equalsIgnoreCase((String)localObject8);
    if (bool3) {}
    label1508:
    label1588:
    label1918:
    label2048:
    label2063:
    label2070:
    label2079:
    p localp;
    for (localObject8 = "MD5";; localObject8 = localp)
    {
      for (;;)
      {
        long l1;
        Object localObject13;
        boolean bool2;
        i locali;
        try
        {
          localObject9 = b((String)localObject8);
          localObject10 = paramm.a().getName();
          localObject8 = paramm.b();
          localObject1 = this;
          localObject12 = this.c;
          bool5 = str1.equals(localObject12);
          if (bool5)
          {
            l1 = this.d;
            long l2 = 1L;
            l1 += l2;
            this.d = l1;
            localObject12 = new java/lang/StringBuilder;
            int i2 = 256;
            ((StringBuilder)localObject12).<init>(i2);
            localObject13 = new java/util/Formatter;
            localObject14 = Locale.US;
            localObject1 = localObject14;
            ((Formatter)localObject13).<init>((Appendable)localObject12, (Locale)localObject14);
            c1 = '\001';
            c2 = c1;
            Object[] arrayOfObject = new Object[c1];
            localObject1 = this;
            long l3 = this.d;
            Long localLong = Long.valueOf(l3);
            arrayOfObject[0] = localLong;
            ((Formatter)localObject13).format("%08x", arrayOfObject);
            ((Formatter)localObject13).close();
            localObject13 = ((StringBuilder)localObject12).toString();
            localObject1 = this.e;
            localObject14 = localObject1;
            if (localObject1 == null)
            {
              localObject14 = f();
              localObject1 = localObject14;
              this.e = ((String)localObject14);
            }
            this.f = null;
            c2 = '\000';
            this.g = null;
            localObject14 = "MD5-sess";
            localObject1 = localObject14;
            boolean bool7 = ((String)localObject5).equalsIgnoreCase((String)localObject14);
            if (!bool7) {
              break label1508;
            }
            ((StringBuilder)localObject12).setLength(0);
            localObject14 = ((StringBuilder)localObject12).append((String)localObject10).append(':');
            localObject1 = localObject14;
            localObject14 = ((StringBuilder)localObject14).append((String)localObject3);
            c1 = ':';
            localObject14 = ((StringBuilder)localObject14).append(c1);
            localObject1 = localObject14;
            ((StringBuilder)localObject14).append((String)localObject8);
            localObject8 = b.a.a.a.o.e.a(((StringBuilder)localObject12).toString(), (String)localObject11);
            localObject8 = a(((MessageDigest)localObject9).digest((byte[])localObject8));
            ((StringBuilder)localObject12).setLength(0);
            localObject8 = ((StringBuilder)localObject12).append((String)localObject8);
            c2 = ':';
            localObject8 = ((StringBuilder)localObject8).append(c2).append(str1);
            c3 = ':';
            c2 = c3;
            localObject8 = ((StringBuilder)localObject8).append(c3);
            localObject1 = this;
            localObject1 = this.e;
            localObject14 = localObject1;
            ((StringBuilder)localObject8).append((String)localObject1);
            localObject8 = ((StringBuilder)localObject12).toString();
            localObject1 = this;
            this.f = ((String)localObject8);
            localObject1 = this;
            localObject8 = b.a.a.a.o.e.a(this.f, (String)localObject11);
            localObject8 = ((MessageDigest)localObject9).digest((byte[])localObject8);
            localObject14 = a((byte[])localObject8);
            int i1 = 2;
            if (k != i1) {
              break label1588;
            }
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
            char c4 = ':';
            localObject8 = c4 + (String)localObject2;
            this.g = ((String)localObject8);
            localObject1 = this;
            localObject11 = b.a.a.a.o.e.a(this.g, (String)localObject11);
            localObject11 = ((MessageDigest)localObject9).digest((byte[])localObject11);
            localObject8 = a((byte[])localObject11);
            if (k != 0) {
              break label1918;
            }
            i = 0;
            ((StringBuilder)localObject12).setLength(0);
            localObject1 = localObject14;
            localObject11 = ((StringBuilder)localObject12).append((String)localObject14).append(':').append(str1);
            c4 = ':';
            ((StringBuilder)localObject11).append(c4).append((String)localObject8);
            localObject11 = ((StringBuilder)localObject12).toString();
            localObject11 = b.a.a.a.o.e.a((String)localObject11);
            localObject11 = a(((MessageDigest)localObject9).digest((byte[])localObject11));
            localObject8 = new b/a/a/a/o/d;
            ((b.a.a.a.o.d)localObject8).<init>(128);
            boolean bool8 = e();
            if (!bool8) {
              break label2048;
            }
            localObject4 = "Proxy-Authorization";
            ((b.a.a.a.o.d)localObject8).a((String)localObject4);
            ((b.a.a.a.o.d)localObject8).a(": Digest ");
            localObject4 = new java/util/ArrayList;
            int i4 = 20;
            ((ArrayList)localObject4).<init>(i4);
            localObject6 = new b/a/a/a/k/l;
            ((b.a.a.a.k.l)localObject6).<init>("username", (String)localObject10);
            ((List)localObject4).add(localObject6);
            localObject6 = new b/a/a/a/k/l;
            localObject9 = "realm";
            ((b.a.a.a.k.l)localObject6).<init>((String)localObject9, (String)localObject3);
            ((List)localObject4).add(localObject6);
            localObject3 = new b/a/a/a/k/l;
            localObject6 = "nonce";
            ((b.a.a.a.k.l)localObject3).<init>((String)localObject6, str1);
            ((List)localObject4).add(localObject3);
            localObject3 = new b/a/a/a/k/l;
            str1 = "uri";
            ((b.a.a.a.k.l)localObject3).<init>(str1, (String)localObject2);
            ((List)localObject4).add(localObject3);
            localObject2 = new b/a/a/a/k/l;
            localObject3 = "response";
            ((b.a.a.a.k.l)localObject2).<init>((String)localObject3, (String)localObject11);
            ((List)localObject4).add(localObject2);
            if (k != 0)
            {
              localObject2 = new b/a/a/a/k/l;
              localObject3 = "qop";
              i = 1;
              if (k != i) {
                break label2063;
              }
              localObject11 = "auth-int";
              ((b.a.a.a.k.l)localObject2).<init>((String)localObject3, (String)localObject11);
              ((List)localObject4).add(localObject2);
              localObject11 = new b/a/a/a/k/l;
              ((b.a.a.a.k.l)localObject11).<init>("nc", (String)localObject13);
              ((List)localObject4).add(localObject11);
              localObject11 = new b/a/a/a/k/l;
              localObject7 = "cnonce";
              localObject1 = this;
              localObject2 = this.e;
              ((b.a.a.a.k.l)localObject11).<init>((String)localObject7, (String)localObject2);
              ((List)localObject4).add(localObject11);
            }
            localObject11 = new b/a/a/a/k/l;
            localObject7 = "algorithm";
            ((b.a.a.a.k.l)localObject11).<init>((String)localObject7, (String)localObject5);
            ((List)localObject4).add(localObject11);
            if (str2 != null)
            {
              localObject5 = new b/a/a/a/k/l;
              localObject11 = "opaque";
              ((b.a.a.a.k.l)localObject5).<init>((String)localObject11, str2);
              ((List)localObject4).add(localObject5);
            }
            int i5 = 0;
            localObject5 = null;
            i = 0;
            localObject11 = null;
            i5 = ((List)localObject4).size();
            if (i >= i5) {
              break;
            }
            localObject5 = (b.a.a.a.k.l)((List)localObject4).get(i);
            if (i > 0)
            {
              localObject7 = ", ";
              ((b.a.a.a.o.d)localObject8).a((String)localObject7);
            }
            localObject7 = ((b.a.a.a.k.l)localObject5).a();
            localObject2 = "nc";
            boolean bool9 = ((String)localObject2).equals(localObject7);
            if (!bool9)
            {
              localObject2 = "qop";
              bool9 = ((String)localObject2).equals(localObject7);
              if (!bool9)
              {
                localObject2 = "algorithm";
                bool2 = ((String)localObject2).equals(localObject7);
                if (!bool2) {
                  break label2070;
                }
              }
            }
            bool2 = true;
            localObject2 = b.a.a.a.k.e.b;
            if (bool2) {
              break label2079;
            }
            bool2 = true;
            ((b.a.a.a.k.e)localObject2).a((b.a.a.a.o.d)localObject8, (y)localObject5, bool2);
            int i6 = i + 1;
            i = i6;
            continue;
          }
          l1 = 1L;
        }
        catch (n localn)
        {
          locali = new b/a/a/a/a/i;
          localObject11 = new java/lang/StringBuilder;
          ((StringBuilder)localObject11).<init>();
          localObject11 = "Unsuppported digest algorithm: " + (String)localObject8;
          locali.<init>((String)localObject11);
          throw locali;
        }
        this.d = l1;
        boolean bool5 = false;
        Object localObject12 = null;
        this.e = null;
        this.c = str1;
        continue;
        char c3 = '\000';
        char c2 = '\000';
        ((StringBuilder)localObject12).setLength(0);
        Object localObject14 = ((StringBuilder)localObject12).append((String)localObject10).append(':');
        localObject1 = localObject14;
        localObject14 = ((StringBuilder)localObject14).append((String)localObject3);
        char c1 = ':';
        localObject14 = ((StringBuilder)localObject14).append(c1);
        localObject1 = localObject14;
        ((StringBuilder)localObject14).append((String)localObject8);
        localObject8 = ((StringBuilder)localObject12).toString();
        localObject1 = this;
        this.f = ((String)localObject8);
        continue;
        boolean bool4 = true;
        int m;
        char c5;
        if (bool2 == bool4)
        {
          bool4 = false;
          localObject8 = null;
          localObject1 = paramq;
          int i3 = paramq instanceof b.a.a.a.l;
          c1 = i3;
          if (i3 != 0)
          {
            paramq = (b.a.a.a.l)paramq;
            localObject8 = paramq.getEntity();
          }
          if (localObject8 != null)
          {
            boolean bool6 = ((k)localObject8).isRepeatable();
            if (!bool6)
            {
              localObject7 = "auth";
              bool2 = ((Set)localObject6).contains(localObject7);
              if (bool2)
              {
                m = 2;
                localObject8 = new java/lang/StringBuilder;
                ((StringBuilder)localObject8).<init>();
                localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
                c5 = ':';
                localObject8 = c5 + (String)localObject2;
                localObject1 = this;
                this.g = ((String)localObject8);
                continue;
              }
              locali = new b/a/a/a/a/i;
              locali.<init>("Qop auth-int cannot be used with a non-repeatable entity");
              throw locali;
            }
          }
          localObject6 = new b/a/a/a/i/a/g;
          ((g)localObject6).<init>((MessageDigest)localObject9);
          if (localObject8 != null) {}
          try
          {
            ((k)localObject8).writeTo((OutputStream)localObject6);
            ((g)localObject6).close();
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject8 = ((StringBuilder)localObject8).append((String)localObject4).append(':').append((String)localObject2);
            c5 = ':';
            localObject8 = ((StringBuilder)localObject8).append(c5);
            localObject4 = a(((g)localObject6).a());
            localObject8 = (String)localObject4;
            localObject1 = this;
            this.g = ((String)localObject8);
          }
          catch (IOException localIOException)
          {
            localObject11 = new b/a/a/a/a/i;
            ((i)localObject11).<init>("I/O error reading entity content", localIOException);
            throw ((Throwable)localObject11);
          }
        }
        else
        {
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
          c5 = ':';
          localObject8 = c5 + (String)localObject2;
          this.g = ((String)localObject8);
          continue;
          ((StringBuilder)localObject12).setLength(0);
          localObject1 = localObject14;
          localObject11 = ((StringBuilder)localObject12).append((String)localObject14).append(':').append(str1).append(':').append((String)localObject13).append(':');
          localObject1 = this;
          localObject4 = this.e;
          localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
          c5 = ':';
          localObject4 = ((StringBuilder)localObject11).append(c5);
          i = 1;
          if (m == i) {}
          for (localObject11 = "auth-int";; localObject11 = "auth")
          {
            localObject11 = ((StringBuilder)localObject4).append((String)localObject11);
            c5 = ':';
            ((StringBuilder)localObject11).append(c5).append((String)localObject8);
            localObject11 = ((StringBuilder)localObject12).toString();
            break;
          }
          localObject4 = "Authorization";
          ((b.a.a.a.o.d)localObject8).a((String)localObject4);
          continue;
          localObject11 = "auth";
          continue;
          int n = 0;
          localObject7 = null;
          continue;
          n = 0;
          localObject7 = null;
        }
      }
      localp = new b/a/a/a/k/p;
      localp.<init>((b.a.a.a.o.d)localObject8);
      return localp;
    }
  }
  
  private static MessageDigest b(String paramString)
  {
    try
    {
      return MessageDigest.getInstance(paramString);
    }
    catch (Exception localException)
    {
      n localn = new b/a/a/a/i/a/n;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unsupported algorithm in HTTP Digest authentication: " + paramString;
      localn.<init>((String)localObject);
      throw localn;
    }
  }
  
  public static String f()
  {
    SecureRandom localSecureRandom = new java/security/SecureRandom;
    localSecureRandom.<init>();
    byte[] arrayOfByte = new byte[8];
    localSecureRandom.nextBytes(arrayOfByte);
    return a(arrayOfByte);
  }
  
  public b.a.a.a.e a(b.a.a.a.a.m paramm, q paramq)
  {
    b.a.a.a.n.a locala = new b/a/a/a/n/a;
    locala.<init>();
    return a(paramm, paramq, locala);
  }
  
  public b.a.a.a.e a(b.a.a.a.a.m paramm, q paramq, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramm, "Credentials");
    b.a.a.a.o.a.a(paramq, "HTTP request");
    Object localObject = a("realm");
    if (localObject == null)
    {
      localObject = new b/a/a/a/a/i;
      ((i)localObject).<init>("missing realm in challenge");
      throw ((Throwable)localObject);
    }
    localObject = a("nonce");
    if (localObject == null)
    {
      localObject = new b/a/a/a/a/i;
      ((i)localObject).<init>("missing nonce in challenge");
      throw ((Throwable)localObject);
    }
    localObject = h();
    String str1 = paramq.getRequestLine().a();
    ((Map)localObject).put("methodname", str1);
    localObject = h();
    String str2 = "uri";
    str1 = paramq.getRequestLine().c();
    ((Map)localObject).put(str2, str1);
    localObject = a("charset");
    if (localObject == null)
    {
      localObject = h();
      str2 = "charset";
      str1 = a(paramq);
      ((Map)localObject).put(str2, str1);
    }
    return b(paramm, paramq);
  }
  
  public String a()
  {
    return "digest";
  }
  
  public void a(b.a.a.a.e parame)
  {
    super.a(parame);
    this.b = true;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    String str1 = a("stale");
    String str2 = "true";
    boolean bool = str2.equalsIgnoreCase(str1);
    if (bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      bool = this.b;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("DIGEST [complete=");
    boolean bool = this.b;
    localStringBuilder2 = localStringBuilder2.append(bool).append(", nonce=");
    String str = this.c;
    localStringBuilder2 = localStringBuilder2.append(str).append(", nc=");
    long l = this.d;
    localStringBuilder2.append(l).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */