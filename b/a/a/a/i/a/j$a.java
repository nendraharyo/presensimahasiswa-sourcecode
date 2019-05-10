package b.a.a.a.i.a;

import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;

public class j$a
{
  protected final String a;
  protected final String b;
  protected final String c;
  protected final byte[] d;
  protected final String e;
  protected final byte[] f;
  protected byte[] g;
  protected byte[] h;
  protected byte[] i;
  protected byte[] j;
  protected byte[] k = null;
  protected byte[] l = null;
  protected byte[] m = null;
  protected byte[] n = null;
  protected byte[] o = null;
  protected byte[] p = null;
  protected byte[] q = null;
  protected byte[] r = null;
  protected byte[] s = null;
  protected byte[] t = null;
  protected byte[] u = null;
  protected byte[] v = null;
  protected byte[] w = null;
  protected byte[] x = null;
  protected byte[] y = null;
  protected byte[] z = null;
  
  public j$a(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte1, String paramString4, byte[] paramArrayOfByte2)
  {
    this(paramString1, paramString2, paramString3, paramArrayOfByte1, paramString4, paramArrayOfByte2, null, null, null, null);
  }
  
  public j$a(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte1, String paramString4, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6)
  {
    this.a = paramString1;
    this.e = paramString4;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramArrayOfByte1;
    this.f = paramArrayOfByte2;
    this.g = paramArrayOfByte3;
    this.h = paramArrayOfByte4;
    this.i = paramArrayOfByte5;
    this.j = paramArrayOfByte6;
  }
  
  public byte[] a()
  {
    byte[] arrayOfByte = this.g;
    if (arrayOfByte == null)
    {
      arrayOfByte = j.a();
      this.g = arrayOfByte;
    }
    return this.g;
  }
  
  public byte[] b()
  {
    byte[] arrayOfByte = this.h;
    if (arrayOfByte == null)
    {
      arrayOfByte = j.a();
      this.h = arrayOfByte;
    }
    return this.h;
  }
  
  public byte[] c()
  {
    byte[] arrayOfByte = this.i;
    if (arrayOfByte == null)
    {
      arrayOfByte = j.b();
      this.i = arrayOfByte;
    }
    return this.i;
  }
  
  public byte[] d()
  {
    byte[] arrayOfByte = this.k;
    if (arrayOfByte == null)
    {
      arrayOfByte = j.a(this.c);
      this.k = arrayOfByte;
    }
    return this.k;
  }
  
  public byte[] e()
  {
    byte[] arrayOfByte1 = this.l;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = d();
      byte[] arrayOfByte2 = this.d;
      arrayOfByte1 = j.c(arrayOfByte1, arrayOfByte2);
      this.l = arrayOfByte1;
    }
    return this.l;
  }
  
  public byte[] f()
  {
    byte[] arrayOfByte = this.m;
    if (arrayOfByte == null)
    {
      arrayOfByte = j.b(this.c);
      this.m = arrayOfByte;
    }
    return this.m;
  }
  
  public byte[] g()
  {
    byte[] arrayOfByte1 = this.n;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = f();
      byte[] arrayOfByte2 = this.d;
      arrayOfByte1 = j.c(arrayOfByte1, arrayOfByte2);
      this.n = arrayOfByte1;
    }
    return this.n;
  }
  
  public byte[] h()
  {
    Object localObject = this.p;
    if (localObject == null)
    {
      localObject = this.a;
      String str = this.b;
      byte[] arrayOfByte = f();
      localObject = j.a((String)localObject, str, arrayOfByte);
      this.p = ((byte[])localObject);
    }
    return this.p;
  }
  
  public byte[] i()
  {
    Object localObject = this.o;
    if (localObject == null)
    {
      localObject = this.a;
      String str = this.b;
      byte[] arrayOfByte = f();
      localObject = j.b((String)localObject, str, arrayOfByte);
      this.o = ((byte[])localObject);
    }
    return this.o;
  }
  
  public byte[] j()
  {
    int i1 = 8;
    byte[] arrayOfByte1 = this.j;
    if (arrayOfByte1 == null)
    {
      long l1 = System.currentTimeMillis() + 11644473600000L;
      long l2 = 10000L * l1;
      arrayOfByte1 = new byte[i1];
      this.j = arrayOfByte1;
      int i2 = 0;
      arrayOfByte1 = null;
      while (i2 < i1)
      {
        byte[] arrayOfByte2 = this.j;
        int i3 = (byte)(int)l2;
        arrayOfByte2[i2] = i3;
        l2 >>>= i1;
        i2 += 1;
      }
    }
    return this.j;
  }
  
  public byte[] k()
  {
    byte[] arrayOfByte1 = this.r;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = b();
      byte[] arrayOfByte2 = this.f;
      byte[] arrayOfByte3 = j();
      arrayOfByte1 = j.b(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.r = arrayOfByte1;
    }
    return this.r;
  }
  
  public byte[] l()
  {
    byte[] arrayOfByte1 = this.s;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = i();
      byte[] arrayOfByte2 = this.d;
      byte[] arrayOfByte3 = k();
      arrayOfByte1 = j.c(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.s = arrayOfByte1;
    }
    return this.s;
  }
  
  public byte[] m()
  {
    byte[] arrayOfByte1 = this.q;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = h();
      byte[] arrayOfByte2 = this.d;
      byte[] arrayOfByte3 = a();
      arrayOfByte1 = j.c(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.q = arrayOfByte1;
    }
    return this.q;
  }
  
  public byte[] n()
  {
    byte[] arrayOfByte1 = this.t;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = f();
      byte[] arrayOfByte2 = this.d;
      byte[] arrayOfByte3 = a();
      arrayOfByte1 = j.a(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.t = arrayOfByte1;
    }
    return this.t;
  }
  
  public byte[] o()
  {
    byte[] arrayOfByte1 = this.u;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = a();
      int i1 = 24;
      byte[] arrayOfByte2 = new byte[i1];
      this.u = arrayOfByte2;
      arrayOfByte2 = this.u;
      int i2 = arrayOfByte1.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i2);
      arrayOfByte2 = this.u;
      int i3 = arrayOfByte1.length;
      byte[] arrayOfByte3 = this.u;
      i2 = arrayOfByte3.length;
      Arrays.fill(arrayOfByte2, i3, i2, (byte)0);
    }
    return this.u;
  }
  
  public byte[] p()
  {
    int i1 = 16;
    int i2 = 8;
    byte[] arrayOfByte1 = this.v;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = new byte[i1];
      this.v = arrayOfByte1;
      arrayOfByte1 = d();
      byte[] arrayOfByte2 = this.v;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i2);
      arrayOfByte1 = this.v;
      Arrays.fill(arrayOfByte1, i2, i1, (byte)0);
    }
    return this.v;
  }
  
  public byte[] q()
  {
    Object localObject = this.w;
    if (localObject == null)
    {
      localObject = new b/a/a/a/i/a/j$c;
      ((j.c)localObject).<init>();
      byte[] arrayOfByte = f();
      ((j.c)localObject).a(arrayOfByte);
      localObject = ((j.c)localObject).a();
      this.w = ((byte[])localObject);
    }
    return this.w;
  }
  
  public byte[] r()
  {
    int i1 = 16;
    byte[] arrayOfByte1 = this.x;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = i();
      byte[] arrayOfByte2 = new byte[i1];
      byte[] arrayOfByte3 = l();
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, i1);
      arrayOfByte1 = j.a(arrayOfByte2, arrayOfByte1);
      this.x = arrayOfByte1;
    }
    return this.x;
  }
  
  public byte[] s()
  {
    byte[] arrayOfByte1 = this.y;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = o();
      int i1 = this.d.length;
      int i2 = arrayOfByte1.length;
      i1 += i2;
      byte[] arrayOfByte2 = new byte[i1];
      byte[] arrayOfByte3 = this.d;
      byte[] arrayOfByte4 = this.d;
      int i3 = arrayOfByte4.length;
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, i3);
      arrayOfByte3 = this.d;
      i2 = arrayOfByte3.length;
      i3 = arrayOfByte1.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i2, i3);
      arrayOfByte1 = q();
      arrayOfByte1 = j.a(arrayOfByte2, arrayOfByte1);
      this.y = arrayOfByte1;
    }
    return this.y;
  }
  
  public byte[] t()
  {
    Object localObject1 = this.z;
    int i1;
    if (localObject1 == null) {
      i1 = 14;
    }
    try
    {
      localObject1 = new byte[i1];
      localObject2 = d();
      int i2 = 0;
      localObject3 = null;
      byte b1 = 0;
      Object localObject4 = null;
      int i3 = 8;
      System.arraycopy(localObject2, 0, localObject1, 0, i3);
      int i4 = 8;
      i2 = localObject1.length;
      b1 = -67;
      Arrays.fill((byte[])localObject1, i4, i2, b1);
      i4 = 0;
      localObject2 = null;
      localObject2 = j.a((byte[])localObject1, 0);
      i2 = 7;
      localObject1 = j.a((byte[])localObject1, i2);
      i2 = 8;
      localObject3 = new byte[i2];
      localObject4 = e();
      i3 = 0;
      int i5 = 0;
      int i6 = localObject3.length;
      System.arraycopy(localObject4, 0, localObject3, 0, i6);
      localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      i3 = 1;
      ((Cipher)localObject4).init(i3, (Key)localObject2);
      localObject2 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      i3 = 1;
      ((Cipher)localObject4).init(i3, (Key)localObject1);
      localObject1 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      i2 = 16;
      localObject3 = new byte[i2];
      this.z = ((byte[])localObject3);
      i2 = 0;
      localObject3 = null;
      localObject4 = this.z;
      i3 = 0;
      i5 = localObject2.length;
      System.arraycopy(localObject2, 0, localObject4, 0, i5);
      i2 = 0;
      localObject3 = null;
      localObject4 = this.z;
      i4 = localObject2.length;
      i3 = localObject1.length;
      System.arraycopy(localObject1, 0, localObject4, i4, i3);
      return this.z;
    }
    catch (Exception localException)
    {
      Object localObject2 = new b/a/a/a/i/a/i;
      Object localObject3 = localException.getMessage();
      ((i)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\j$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */