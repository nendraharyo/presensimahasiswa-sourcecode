package b.a.a.a.i.a;

import b.a.a.a.h.a;
import b.a.a.a.o.e;

class j$d
{
  private byte[] a = null;
  private int b = 0;
  
  j$d() {}
  
  j$d(String paramString, int paramInt)
  {
    Object localObject2 = a.a(e.a(paramString, "ASCII"), 2);
    this.a = ((byte[])localObject2);
    localObject2 = this.a;
    int j = localObject2.length;
    Object localObject3 = j.c();
    int k = localObject3.length;
    if (j < k)
    {
      localObject1 = new b/a/a/a/i/a/i;
      ((i)localObject1).<init>("NTLM message decoding error - packet too short");
      throw ((Throwable)localObject1);
    }
    do
    {
      i += 1;
      localObject2 = j.c();
      j = localObject2.length;
      if (i >= j) {
        break;
      }
      localObject2 = this.a;
      j = localObject2[i];
      localObject3 = j.c();
      k = localObject3[i];
    } while (j == k);
    localObject1 = new b/a/a/a/i/a/i;
    ((i)localObject1).<init>("NTLM message expected - instead got unrecognized bytes");
    throw ((Throwable)localObject1);
    localObject1 = j.c();
    i = localObject1.length;
    i = a(i);
    if (i != paramInt)
    {
      localObject2 = new b/a/a/a/i/a/i;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("NTLM type ");
      String str = Integer.toString(paramInt);
      localObject3 = ((StringBuilder)localObject3).append(str).append(" message expected - instead got type ");
      localObject1 = Integer.toString(i);
      localObject1 = (String)localObject1;
      ((i)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    i = this.a.length;
    this.b = i;
  }
  
  protected int a()
  {
    return this.b;
  }
  
  protected int a(int paramInt)
  {
    return j.b(this.a, paramInt);
  }
  
  protected void a(byte paramByte)
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    arrayOfByte[i] = paramByte;
    int j = this.b + 1;
    this.b = j;
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt1];
    this.a = arrayOfByte;
    this.b = 0;
    arrayOfByte = j.c();
    a(arrayOfByte);
    d(paramInt2);
  }
  
  protected void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i = paramArrayOfByte.length;
      int j = 0;
      while (j < i)
      {
        int k = paramArrayOfByte[j];
        byte[] arrayOfByte = this.a;
        int m = this.b;
        arrayOfByte[m] = k;
        k = this.b + 1;
        this.b = k;
        j += 1;
      }
    }
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = this.a;
    int i = localObject.length;
    int j = paramArrayOfByte.length + paramInt;
    if (i < j)
    {
      localObject = new b/a/a/a/i/a/i;
      ((i)localObject).<init>("NTLM: Message too short");
      throw ((Throwable)localObject);
    }
    localObject = this.a;
    int k = paramArrayOfByte.length;
    System.arraycopy(localObject, paramInt, paramArrayOfByte, 0, k);
  }
  
  String b()
  {
    byte[] arrayOfByte1 = this.a;
    int i = arrayOfByte1.length;
    int j = this.b;
    if (i > j)
    {
      i = this.b;
      arrayOfByte1 = new byte[i];
      byte[] arrayOfByte2 = this.a;
      int k = this.b;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
    }
    for (;;)
    {
      return e.a(a.b(arrayOfByte1, 2));
      arrayOfByte1 = this.a;
    }
  }
  
  protected byte[] b(int paramInt)
  {
    return j.c(this.a, paramInt);
  }
  
  protected void c(int paramInt)
  {
    byte b1 = (byte)(paramInt & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 8 & 0xFF);
    a(b1);
  }
  
  protected void d(int paramInt)
  {
    byte b1 = (byte)(paramInt & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 8 & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 16 & 0xFF);
    a(b1);
    b1 = (byte)(paramInt >> 24 & 0xFF);
    a(b1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\j$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */