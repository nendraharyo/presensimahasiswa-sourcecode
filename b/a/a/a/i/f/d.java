package b.a.a.a.i.f;

import b.a.a.a.j.g;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public abstract class d
  implements b.a.a.a.j.a, g
{
  private static final byte[] a;
  private OutputStream b;
  private b.a.a.a.o.c c;
  private Charset d;
  private boolean e;
  private int f;
  private k g;
  private CodingErrorAction h;
  private CodingErrorAction i;
  private CharsetEncoder j;
  private ByteBuffer k;
  
  static
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = 13;
    arrayOfByte[1] = 10;
    a = arrayOfByte;
  }
  
  private void a(CharBuffer paramCharBuffer)
  {
    boolean bool1 = paramCharBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = this.j;
      if (localObject1 == null)
      {
        localObject1 = this.d.newEncoder();
        this.j = ((CharsetEncoder)localObject1);
        localObject1 = this.j;
        localObject2 = this.h;
        ((CharsetEncoder)localObject1).onMalformedInput((CodingErrorAction)localObject2);
        localObject1 = this.j;
        localObject2 = this.i;
        ((CharsetEncoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject2);
      }
      localObject1 = this.k;
      if (localObject1 == null)
      {
        int m = 1024;
        localObject1 = ByteBuffer.allocate(m);
        this.k = ((ByteBuffer)localObject1);
      }
      localObject1 = this.j;
      ((CharsetEncoder)localObject1).reset();
      for (;;)
      {
        boolean bool2 = paramCharBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject1 = this.j;
        localObject2 = this.k;
        boolean bool3 = true;
        localObject1 = ((CharsetEncoder)localObject1).encode(paramCharBuffer, (ByteBuffer)localObject2, bool3);
        a((CoderResult)localObject1);
      }
      localObject1 = this.j;
      Object localObject2 = this.k;
      localObject1 = ((CharsetEncoder)localObject1).flush((ByteBuffer)localObject2);
      a((CoderResult)localObject1);
      localObject1 = this.k;
      ((ByteBuffer)localObject1).clear();
    }
  }
  
  private void a(CoderResult paramCoderResult)
  {
    boolean bool = paramCoderResult.isError();
    if (bool) {
      paramCoderResult.throwException();
    }
    ByteBuffer localByteBuffer = this.k;
    localByteBuffer.flip();
    for (;;)
    {
      localByteBuffer = this.k;
      bool = localByteBuffer.hasRemaining();
      if (!bool) {
        break;
      }
      localByteBuffer = this.k;
      int m = localByteBuffer.get();
      a(m);
    }
    this.k.compact();
  }
  
  public void a()
  {
    d();
    this.b.flush();
  }
  
  public void a(int paramInt)
  {
    b.a.a.a.o.c localc = this.c;
    boolean bool = localc.g();
    if (bool) {
      d();
    }
    this.c.a(paramInt);
  }
  
  public void a(b.a.a.a.o.d paramd)
  {
    int m = 0;
    if (paramd == null) {}
    for (;;)
    {
      return;
      boolean bool1 = this.e;
      if (bool1)
      {
        int n = paramd.c();
        while (n > 0)
        {
          b.a.a.a.o.c localc1 = this.c;
          i1 = localc1.c();
          b.a.a.a.o.c localc2 = this.c;
          int i2 = localc2.d();
          i1 = Math.min(i1 - i2, n);
          if (i1 > 0)
          {
            localc2 = this.c;
            localc2.a(paramd, m, i1);
          }
          localc2 = this.c;
          boolean bool2 = localc2.g();
          if (bool2) {
            d();
          }
          m += i1;
          n -= i1;
        }
      }
      Object localObject = paramd.b();
      int i1 = paramd.c();
      localObject = CharBuffer.wrap((char[])localObject, 0, i1);
      a((CharBuffer)localObject);
      localObject = a;
      a((byte[])localObject);
    }
  }
  
  protected void a(OutputStream paramOutputStream, int paramInt, b.a.a.a.l.e parame)
  {
    b.a.a.a.o.a.a(paramOutputStream, "Input stream");
    b.a.a.a.o.a.b(paramInt, "Buffer size");
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.b = paramOutputStream;
    Object localObject = new b/a/a/a/o/c;
    ((b.a.a.a.o.c)localObject).<init>(paramInt);
    this.c = ((b.a.a.a.o.c)localObject);
    localObject = (String)parame.a("http.protocol.element-charset");
    if (localObject != null)
    {
      localObject = Charset.forName((String)localObject);
      this.d = ((Charset)localObject);
      localObject = this.d;
      Charset localCharset = b.a.a.a.c.b;
      boolean bool = ((Charset)localObject).equals(localCharset);
      this.e = bool;
      this.j = null;
      int n = 512;
      int m = parame.a("http.connection.min-chunk-limit", n);
      this.f = m;
      localObject = c();
      this.g = ((k)localObject);
      localObject = (CodingErrorAction)parame.a("http.malformed.input.action");
      if (localObject == null) {
        break label197;
      }
      label158:
      this.h = ((CodingErrorAction)localObject);
      localObject = (CodingErrorAction)parame.a("http.unmappable.input.action");
      if (localObject == null) {
        break label205;
      }
    }
    for (;;)
    {
      this.i = ((CodingErrorAction)localObject);
      return;
      localObject = b.a.a.a.c.b;
      break;
      label197:
      localObject = CodingErrorAction.REPORT;
      break label158;
      label205:
      localObject = CodingErrorAction.REPORT;
    }
  }
  
  public void a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      int m = paramString.length();
      if (m > 0)
      {
        int n = this.e;
        if (n != 0)
        {
          n = 0;
          localObject = null;
          for (;;)
          {
            int i2 = paramString.length();
            if (n >= i2) {
              break;
            }
            int i3 = paramString.charAt(n);
            a(i3);
            int i1;
            n += 1;
          }
        }
        localObject = CharBuffer.wrap(paramString);
        a((CharBuffer)localObject);
      }
      Object localObject = a;
      a((byte[])localObject);
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int m = paramArrayOfByte.length;
      a(paramArrayOfByte, 0, m);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int m = this.f;
      if (paramInt2 <= m)
      {
        localObject = this.c;
        m = ((b.a.a.a.o.c)localObject).c();
        if (paramInt2 <= m) {}
      }
      else
      {
        d();
        this.b.write(paramArrayOfByte, paramInt1, paramInt2);
        localObject = this.g;
        long l = paramInt2;
        ((k)localObject).a(l);
        continue;
      }
      Object localObject = this.c;
      m = ((b.a.a.a.o.c)localObject).c();
      b.a.a.a.o.c localc = this.c;
      int n = localc.d();
      m -= n;
      if (paramInt2 > m) {
        d();
      }
      localObject = this.c;
      ((b.a.a.a.o.c)localObject).a(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public b.a.a.a.j.e b()
  {
    return this.g;
  }
  
  protected k c()
  {
    k localk = new b/a/a/a/i/f/k;
    localk.<init>();
    return localk;
  }
  
  protected void d()
  {
    b.a.a.a.o.c localc = this.c;
    int m = localc.d();
    if (m > 0)
    {
      Object localObject = this.b;
      byte[] arrayOfByte = this.c.e();
      ((OutputStream)localObject).write(arrayOfByte, 0, m);
      this.c.a();
      localObject = this.g;
      long l = m;
      ((k)localObject).a(l);
    }
  }
  
  public int e()
  {
    return this.c.d();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */