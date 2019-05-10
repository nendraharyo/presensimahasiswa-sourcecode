package b.a.a.a.i.f;

import b.a.a.a.j.f;
import b.a.a.a.o.d;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public abstract class c
  implements b.a.a.a.j.a, f
{
  private InputStream a;
  private byte[] b;
  private b.a.a.a.o.c c;
  private Charset d;
  private boolean e;
  private int f;
  private int g;
  private k h;
  private CodingErrorAction i;
  private CodingErrorAction j;
  private int k;
  private int l;
  private CharsetDecoder m;
  private CharBuffer n;
  
  private int a(d paramd, int paramInt)
  {
    int i1 = this.k;
    int i2 = paramInt + 1;
    this.k = i2;
    Object localObject;
    if (paramInt > i1)
    {
      localObject = this.b;
      int i3 = paramInt + -1;
      i2 = localObject[i3];
      i3 = 13;
      if (i2 == i3) {
        paramInt += -1;
      }
    }
    i2 = paramInt - i1;
    boolean bool = this.e;
    byte[] arrayOfByte;
    if (bool)
    {
      arrayOfByte = this.b;
      paramd.a(arrayOfByte, i1, i2);
    }
    for (;;)
    {
      return i2;
      arrayOfByte = this.b;
      localObject = ByteBuffer.wrap(arrayOfByte, i1, i2);
      i2 = a(paramd, (ByteBuffer)localObject);
    }
  }
  
  private int a(d paramd, ByteBuffer paramByteBuffer)
  {
    int i1 = 0;
    boolean bool1 = paramByteBuffer.hasRemaining();
    if (!bool1) {}
    for (;;)
    {
      return i1;
      Object localObject1 = this.m;
      if (localObject1 == null)
      {
        localObject1 = this.d.newDecoder();
        this.m = ((CharsetDecoder)localObject1);
        localObject1 = this.m;
        localObject2 = this.i;
        ((CharsetDecoder)localObject1).onMalformedInput((CodingErrorAction)localObject2);
        localObject1 = this.m;
        localObject2 = this.j;
        ((CharsetDecoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject2);
      }
      localObject1 = this.n;
      if (localObject1 == null)
      {
        int i2 = 1024;
        localObject1 = CharBuffer.allocate(i2);
        this.n = ((CharBuffer)localObject1);
      }
      localObject1 = this.m;
      ((CharsetDecoder)localObject1).reset();
      for (;;)
      {
        boolean bool2 = paramByteBuffer.hasRemaining();
        if (!bool2) {
          break;
        }
        localObject1 = this.m;
        localObject2 = this.n;
        boolean bool3 = true;
        localObject1 = ((CharsetDecoder)localObject1).decode(paramByteBuffer, (CharBuffer)localObject2, bool3);
        i3 = a((CoderResult)localObject1, paramd, paramByteBuffer);
        i1 += i3;
      }
      localObject1 = this.m;
      Object localObject2 = this.n;
      localObject1 = ((CharsetDecoder)localObject1).flush((CharBuffer)localObject2);
      int i3 = a((CoderResult)localObject1, paramd, paramByteBuffer);
      i1 += i3;
      localObject1 = this.n;
      ((CharBuffer)localObject1).clear();
    }
  }
  
  private int a(CoderResult paramCoderResult, d paramd, ByteBuffer paramByteBuffer)
  {
    boolean bool1 = paramCoderResult.isError();
    if (bool1) {
      paramCoderResult.throwException();
    }
    this.n.flip();
    CharBuffer localCharBuffer1 = this.n;
    int i1 = localCharBuffer1.remaining();
    for (;;)
    {
      CharBuffer localCharBuffer2 = this.n;
      boolean bool2 = localCharBuffer2.hasRemaining();
      if (!bool2) {
        break;
      }
      localCharBuffer2 = this.n;
      char c1 = localCharBuffer2.get();
      paramd.a(c1);
    }
    this.n.compact();
    return i1;
  }
  
  private int b(d paramd)
  {
    Object localObject1 = this.c;
    int i1 = ((b.a.a.a.o.c)localObject1).d();
    Object localObject2;
    if (i1 > 0)
    {
      localObject2 = this.c;
      int i2 = i1 + -1;
      int i3 = ((b.a.a.a.o.c)localObject2).b(i2);
      i2 = 10;
      if (i3 == i2) {
        i1 += -1;
      }
      if (i1 > 0)
      {
        localObject2 = this.c;
        i2 = i1 + -1;
        i3 = ((b.a.a.a.o.c)localObject2).b(i2);
        i2 = 13;
        if (i3 == i2) {
          i1 += -1;
        }
      }
    }
    boolean bool = this.e;
    if (bool)
    {
      localObject2 = this.c;
      paramd.a((b.a.a.a.o.c)localObject2, 0, i1);
    }
    for (;;)
    {
      this.c.a();
      return i1;
      localObject2 = this.c.e();
      localObject1 = ByteBuffer.wrap((byte[])localObject2, 0, i1);
      i1 = a(paramd, (ByteBuffer)localObject1);
    }
  }
  
  private int c()
  {
    int i1 = this.k;
    int i2 = this.l;
    if (i1 < i2)
    {
      byte[] arrayOfByte = this.b;
      i2 = arrayOfByte[i1];
      int i3 = 10;
      if (i2 != i3) {}
    }
    for (;;)
    {
      return i1;
      i1 += 1;
      break;
      i1 = -1;
    }
  }
  
  public int a()
  {
    int i1 = -1;
    int i2;
    do
    {
      boolean bool = g();
      if (bool) {
        break;
      }
      i2 = f();
    } while (i2 != i1);
    for (;;)
    {
      return i1;
      byte[] arrayOfByte = this.b;
      i2 = this.k;
      int i3 = i2 + 1;
      this.k = i3;
      i1 = arrayOfByte[i2] & 0xFF;
    }
  }
  
  public int a(d paramd)
  {
    int i1 = -1;
    Object localObject1 = "Char array buffer";
    b.a.a.a.o.a.a(paramd, (String)localObject1);
    boolean bool1 = true;
    boolean bool3 = false;
    int i5;
    int i2;
    if (bool1)
    {
      i5 = c();
      if (i5 != i1)
      {
        localObject1 = this.c;
        bool1 = ((b.a.a.a.o.c)localObject1).f();
        if (bool1) {
          i2 = a(paramd, i5);
        }
      }
    }
    for (;;)
    {
      return i2;
      i2 = i5 + 1;
      int i6 = this.k;
      i2 -= i6;
      Object localObject2 = this.c;
      byte[] arrayOfByte = this.b;
      int i7 = this.k;
      ((b.a.a.a.o.c)localObject2).a(arrayOfByte, i7, i2);
      i2 = i5 + 1;
      this.k = i2;
      i2 = 0;
      localObject1 = null;
      int i4;
      for (;;)
      {
        i5 = this.f;
        if (i5 <= 0) {
          break;
        }
        b.a.a.a.o.c localc = this.c;
        i5 = localc.d();
        i6 = this.f;
        if (i5 < i6) {
          break;
        }
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Maximum line length limit exceeded");
        throw ((Throwable)localObject1);
        bool3 = g();
        if (bool3)
        {
          i4 = this.l;
          i5 = this.k;
          i4 -= i5;
          localc = this.c;
          localObject2 = this.b;
          int i8 = this.k;
          localc.a((byte[])localObject2, i8, i4);
          i4 = this.l;
          this.k = i4;
        }
        i4 = f();
        if (i4 == i1)
        {
          i2 = 0;
          localObject1 = null;
        }
      }
      if (i4 == i1)
      {
        localObject1 = this.c;
        boolean bool2 = ((b.a.a.a.o.c)localObject1).f();
        if (bool2)
        {
          bool2 = i1;
          continue;
        }
      }
      int i3 = b(paramd);
    }
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = -1;
    InputStream localInputStream;
    if (paramArrayOfByte == null)
    {
      i1 = 0;
      localInputStream = null;
    }
    for (;;)
    {
      return i1;
      boolean bool1 = g();
      int i2;
      Object localObject;
      int i4;
      if (bool1)
      {
        i1 = this.l;
        i2 = this.k;
        i1 -= i2;
        i1 = Math.min(paramInt2, i1);
        localObject = this.b;
        i4 = this.k;
        System.arraycopy(localObject, i4, paramArrayOfByte, paramInt1, i1);
        i2 = this.k + i1;
        this.k = i2;
      }
      else
      {
        i2 = this.g;
        if (paramInt2 > i2)
        {
          localInputStream = this.a;
          i1 = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
          if (i1 > 0)
          {
            localObject = this.h;
            long l1 = i1;
            ((k)localObject).a(l1);
          }
        }
        else
        {
          do
          {
            boolean bool2 = g();
            if (bool2) {
              break;
            }
            i3 = f();
          } while (i3 != i1);
          continue;
          i1 = this.l;
          int i3 = this.k;
          i1 -= i3;
          i1 = Math.min(paramInt2, i1);
          localObject = this.b;
          i4 = this.k;
          System.arraycopy(localObject, i4, paramArrayOfByte, paramInt1, i1);
          i3 = this.k + i1;
          this.k = i3;
        }
      }
    }
  }
  
  protected void a(InputStream paramInputStream, int paramInt, b.a.a.a.l.e parame)
  {
    int i1 = 0;
    Charset localCharset = null;
    b.a.a.a.o.a.a(paramInputStream, "Input stream");
    b.a.a.a.o.a.b(paramInt, "Buffer size");
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.a = paramInputStream;
    Object localObject = new byte[paramInt];
    this.b = ((byte[])localObject);
    this.k = 0;
    this.l = 0;
    localObject = new b/a/a/a/o/c;
    ((b.a.a.a.o.c)localObject).<init>(paramInt);
    this.c = ((b.a.a.a.o.c)localObject);
    localObject = (String)parame.a("http.protocol.element-charset");
    if (localObject != null)
    {
      localObject = Charset.forName((String)localObject);
      this.d = ((Charset)localObject);
      localObject = this.d;
      localCharset = b.a.a.a.c.b;
      boolean bool = ((Charset)localObject).equals(localCharset);
      this.e = bool;
      this.m = null;
      int i2 = parame.a("http.connection.max-line-length", -1);
      this.f = i2;
      i1 = 512;
      i2 = parame.a("http.connection.min-chunk-limit", i1);
      this.g = i2;
      localObject = d();
      this.h = ((k)localObject);
      localObject = (CodingErrorAction)parame.a("http.malformed.input.action");
      if (localObject == null) {
        break label244;
      }
      label204:
      this.i = ((CodingErrorAction)localObject);
      localObject = (CodingErrorAction)parame.a("http.unmappable.input.action");
      if (localObject == null) {
        break label252;
      }
    }
    for (;;)
    {
      this.j = ((CodingErrorAction)localObject);
      return;
      localObject = b.a.a.a.c.b;
      break;
      label244:
      localObject = CodingErrorAction.REPORT;
      break label204;
      label252:
      localObject = CodingErrorAction.REPORT;
    }
  }
  
  public b.a.a.a.j.e b()
  {
    return this.h;
  }
  
  protected k d()
  {
    k localk = new b/a/a/a/i/f/k;
    localk.<init>();
    return localk;
  }
  
  public int e()
  {
    int i1 = this.l;
    int i2 = this.k;
    return i1 - i2;
  }
  
  protected int f()
  {
    int i1 = -1;
    int i2 = this.k;
    if (i2 > 0)
    {
      i2 = this.l;
      i3 = this.k;
      i2 -= i3;
      if (i2 > 0)
      {
        byte[] arrayOfByte1 = this.b;
        int i4 = this.k;
        arrayOfByte2 = this.b;
        System.arraycopy(arrayOfByte1, i4, arrayOfByte2, 0, i2);
      }
      this.k = 0;
      this.l = i2;
    }
    int i3 = this.l;
    byte[] arrayOfByte3 = this.b;
    i2 = arrayOfByte3.length - i3;
    InputStream localInputStream = this.a;
    byte[] arrayOfByte2 = this.b;
    i2 = localInputStream.read(arrayOfByte2, i3, i2);
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = i3 + i2;
      this.l = i1;
      k localk = this.h;
      long l1 = i2;
      localk.a(l1);
      i1 = i2;
    }
  }
  
  protected boolean g()
  {
    int i1 = this.k;
    int i3 = this.l;
    if (i1 < i3) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */