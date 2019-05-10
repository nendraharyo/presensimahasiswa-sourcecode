package c.a.a.b;

import java.nio.ByteBuffer;

public final class a
  extends b
{
  private final byte[] b;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public a(byte[] paramArrayOfByte) {}
  
  public a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramArrayOfByte;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public static b b(byte[] paramArrayOfByte)
  {
    a locala = new c/a/a/b/a;
    locala.<init>(paramArrayOfByte);
    return locala;
  }
  
  public static b c(int paramInt)
  {
    a locala = new c/a/a/b/a;
    byte[] arrayOfByte = new byte[paramInt];
    locala.<init>(arrayOfByte);
    return locala;
  }
  
  public int a()
  {
    int i = this.d;
    int j = this.c;
    return i - j;
  }
  
  public void a(byte paramByte)
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    int j = i + 1;
    this.d = j;
    arrayOfByte[i] = paramByte;
  }
  
  public void a(char paramChar)
  {
    byte b1 = (byte)(paramChar >> '\b' & 0xFF);
    a(b1);
    b1 = (byte)(paramChar & 0xFF);
    a(b1);
  }
  
  public void a(int paramInt)
  {
    int i = this.c + paramInt;
    this.d = i;
  }
  
  public void a(int paramInt, byte paramByte)
  {
    byte[] arrayOfByte = this.b;
    int i = this.c + paramInt;
    arrayOfByte[i] = paramByte;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    byte b1 = (byte)(paramInt2 >> 24 & 0xFF);
    a(paramInt1, b1);
    int i = paramInt1 + 1;
    byte b2 = (byte)(paramInt2 >> 16 & 0xFF);
    a(i, b2);
    i = paramInt1 + 2;
    b2 = (byte)(paramInt2 >> 8 & 0xFF);
    a(i, b2);
    i = paramInt1 + 3;
    b2 = (byte)(paramInt2 & 0xFF);
    a(i, b2);
  }
  
  public void a(long paramLong)
  {
    long l = 255L;
    byte b1 = (byte)(int)(paramLong >> 56 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 48 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 40 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 32 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 24 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 16 & l);
    a(b1);
    b1 = (byte)(int)(paramLong >> 8 & l);
    a(b1);
    b1 = (byte)(int)(paramLong & l);
    a(b1);
  }
  
  public void a(b paramb)
  {
    int i = paramb.c();
    byte[] arrayOfByte1 = paramb.i();
    int j = paramb.a();
    int k = paramb.h();
    j += k;
    byte[] arrayOfByte2 = this.b;
    int m = this.d;
    System.arraycopy(arrayOfByte1, j, arrayOfByte2, m, i);
    int n = this.d;
    i += n;
    this.d = i;
  }
  
  public void a(short paramShort)
  {
    byte b1 = (byte)(paramShort >> 8 & 0xFF);
    a(b1);
    b1 = (byte)(paramShort & 0xFF);
    a(b1);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    int j = paramArrayOfByte.length;
    System.arraycopy(arrayOfByte, i, paramArrayOfByte, 0, j);
    int k = this.d;
    i = paramArrayOfByte.length;
    k += i;
    this.d = k;
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    System.arraycopy(arrayOfByte, i, paramArrayOfByte, paramInt1, paramInt2);
    int j = this.d + paramInt2;
    this.d = j;
  }
  
  public byte b()
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    int j = i + 1;
    this.d = j;
    return arrayOfByte[i];
  }
  
  public byte b(int paramInt)
  {
    byte[] arrayOfByte = this.b;
    int i = this.c + paramInt;
    return arrayOfByte[i];
  }
  
  public int c()
  {
    int i = this.e;
    int j = this.d;
    return i - j;
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = this.b;
    int j = this.d;
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, j, i);
    int k = this.d;
    i += k;
    this.d = i;
  }
  
  public b d()
  {
    a locala = new c/a/a/b/a;
    byte[] arrayOfByte = this.b;
    int i = this.d;
    int j = this.d;
    int k = this.e;
    locala.<init>(arrayOfByte, i, j, k);
    return locala;
  }
  
  public void d(int paramInt)
  {
    int i = this.c + paramInt;
    this.e = i;
  }
  
  public char e(int paramInt)
  {
    int i = (b(paramInt) & 0xFF) << 8;
    int j = paramInt + 1;
    j = b(j) & 0xFF;
    return (char)(i + j);
  }
  
  public void e()
  {
    int i = this.c;
    this.d = i;
  }
  
  public int f()
  {
    int i = this.e;
    int j = this.c;
    return i - j;
  }
  
  public void f(int paramInt)
  {
    byte b1 = (byte)(paramInt >> 24 & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 16 & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 8 & 0xFF);
    a(b1);
    b1 = (byte)(paramInt & 0xFF);
    a(b1);
  }
  
  public boolean g()
  {
    return true;
  }
  
  public int h()
  {
    return this.c;
  }
  
  public byte[] i()
  {
    return this.b;
  }
  
  public void j()
  {
    int i = this.d;
    this.e = i;
    i = this.c;
    this.d = i;
  }
  
  public b k()
  {
    a locala = new c/a/a/b/a;
    byte[] arrayOfByte = this.b;
    int i = this.c;
    int j = this.d;
    int k = this.e;
    locala.<init>(arrayOfByte, i, j, k);
    return locala;
  }
  
  public int l()
  {
    int i = this.d;
    byte[] arrayOfByte = this.b;
    int j = (arrayOfByte[i] & 0xFF) << 24;
    int k = i + 1;
    k = (arrayOfByte[k] & 0xFF) << 16;
    j += k;
    k = i + 2;
    k = (arrayOfByte[k] & 0xFF) << 8;
    j += k;
    i += 3;
    i = (arrayOfByte[i] & 0xFF) + j;
    int m = this.d + 4;
    this.d = m;
    return i;
  }
  
  public long m()
  {
    int i = 8;
    long l1 = (b() & 0xFF) << i;
    long l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    l1 = l1 + l2 << i;
    l2 = b() & 0xFF;
    return l1 + l2;
  }
  
  public char n()
  {
    int i = (b() & 0xFF) << 8;
    int j = b() & 0xFF;
    return (char)(i + j);
  }
  
  public short o()
  {
    byte[] arrayOfByte1 = this.b;
    int i = this.d;
    int j = (arrayOfByte1[i] & 0xFF) << 8;
    byte[] arrayOfByte2 = this.b;
    int k = this.d + 1;
    i = arrayOfByte2[k] & 0xFF;
    j += i;
    i = this.d + 2;
    this.d = i;
    return (short)j;
  }
  
  public void p()
  {
    int i = this.d;
    this.f = i;
  }
  
  public void q()
  {
    int i = this.f;
    this.d = i;
  }
  
  public ByteBuffer r()
  {
    byte[] arrayOfByte = this.b;
    int i = this.d;
    int j = this.e;
    int k = this.d;
    j -= k;
    return ByteBuffer.wrap(arrayOfByte, i, j);
  }
  
  public boolean s()
  {
    int i = this.d;
    int k = this.e;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\b\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */