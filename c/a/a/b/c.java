package c.a.a.b;

import java.nio.ByteBuffer;

public final class c
  extends b
{
  private ByteBuffer b;
  
  public c(ByteBuffer paramByteBuffer)
  {
    this.b = paramByteBuffer;
  }
  
  public static c b(ByteBuffer paramByteBuffer)
  {
    c localc = new c/a/a/b/c;
    localc.<init>(paramByteBuffer);
    return localc;
  }
  
  public static c b(byte[] paramArrayOfByte)
  {
    c localc = new c/a/a/b/c;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    localc.<init>(localByteBuffer);
    return localc;
  }
  
  public static c c(int paramInt)
  {
    c localc = new c/a/a/b/c;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt);
    localc.<init>(localByteBuffer);
    return localc;
  }
  
  public int a()
  {
    return this.b.position();
  }
  
  public void a(byte paramByte)
  {
    this.b.put(paramByte);
  }
  
  public void a(char paramChar)
  {
    this.b.putChar(paramChar);
  }
  
  public void a(int paramInt)
  {
    this.b.position(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b.putInt(paramInt1, paramInt2);
  }
  
  public void a(long paramLong)
  {
    this.b.putLong(paramLong);
  }
  
  public void a(b paramb)
  {
    ByteBuffer localByteBuffer1 = this.b;
    ByteBuffer localByteBuffer2 = paramb.r();
    localByteBuffer1.put(localByteBuffer2);
  }
  
  public void a(short paramShort)
  {
    this.b.putShort(paramShort);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.b.get(paramArrayOfByte);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b.get(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public byte b()
  {
    return this.b.get();
  }
  
  public byte b(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public int c()
  {
    return this.b.remaining();
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    this.b.put(paramArrayOfByte);
  }
  
  public void d(int paramInt)
  {
    this.b.limit(paramInt);
  }
  
  public char e(int paramInt)
  {
    return this.b.getChar(paramInt);
  }
  
  public void e()
  {
    this.b.rewind();
  }
  
  public boolean equals(Object paramObject)
  {
    return this.b.equals(paramObject);
  }
  
  public int f()
  {
    return this.b.limit();
  }
  
  public void f(int paramInt)
  {
    this.b.putInt(paramInt);
  }
  
  public boolean g()
  {
    return this.b.hasArray();
  }
  
  public int h()
  {
    return this.b.arrayOffset();
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public byte[] i()
  {
    return this.b.array();
  }
  
  public void j()
  {
    this.b.flip();
  }
  
  public int l()
  {
    return this.b.getInt();
  }
  
  public long m()
  {
    return this.b.getLong();
  }
  
  public char n()
  {
    return this.b.getChar();
  }
  
  public short o()
  {
    return this.b.getShort();
  }
  
  public void p()
  {
    this.b.mark();
  }
  
  public void q()
  {
    this.b.reset();
  }
  
  public ByteBuffer r()
  {
    return this.b;
  }
  
  public boolean s()
  {
    return this.b.hasRemaining();
  }
  
  public c t()
  {
    c localc = new c/a/a/b/c;
    ByteBuffer localByteBuffer = this.b.duplicate();
    localc.<init>(localByteBuffer);
    return localc;
  }
  
  public String toString()
  {
    return this.b.toString();
  }
  
  public c u()
  {
    c localc = new c/a/a/b/c;
    ByteBuffer localByteBuffer = this.b.slice();
    localc.<init>(localByteBuffer);
    return localc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\b\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */