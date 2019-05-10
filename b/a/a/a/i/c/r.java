package b.a.a.a.i.c;

import b.a.a.a.h.b;
import b.a.a.a.o.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class r
{
  public b a;
  private final String b;
  
  public r(b paramb)
  {
    this(paramb, "");
  }
  
  public r(b paramb, String paramString)
  {
    this.a = paramb;
    this.b = paramString;
  }
  
  private void a(String paramString, InputStream paramInputStream)
  {
    char c = '"';
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2;
    Object localObject3;
    String str;
    for (;;)
    {
      int i = paramInputStream.read();
      int k = -1;
      if (i == k) {
        break;
      }
      int m = 13;
      if (i == m)
      {
        localObject2 = "[\\r]";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        int n = 10;
        if (i == n)
        {
          ((StringBuilder)localObject1).append("[\\n]\"");
          ((StringBuilder)localObject1).insert(0, "\"");
          ((StringBuilder)localObject1).insert(0, paramString);
          localObject2 = this.a;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = this.b;
          localObject3 = ((StringBuilder)localObject3).append(str).append(" ");
          str = ((StringBuilder)localObject1).toString();
          localObject3 = str;
          ((b)localObject2).a(localObject3);
          ((StringBuilder)localObject1).setLength(0);
        }
        else
        {
          int i1 = 32;
          if (i >= i1)
          {
            int i2 = 127;
            if (i <= i2) {}
          }
          else
          {
            localObject3 = "[0x";
            ((StringBuilder)localObject1).append((String)localObject3);
            localObject2 = Integer.toHexString(i);
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = "]";
            ((StringBuilder)localObject1).append((String)localObject2);
            continue;
          }
          i = (char)i;
          ((StringBuilder)localObject1).append(i);
        }
      }
    }
    int j = ((StringBuilder)localObject1).length();
    if (j > 0)
    {
      ((StringBuilder)localObject1).append(c);
      ((StringBuilder)localObject1).insert(0, c);
      ((StringBuilder)localObject1).insert(0, paramString);
      localObject2 = this.a;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str = this.b;
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = " ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject1 = (String)localObject1;
      ((b)localObject2).a(localObject1);
    }
  }
  
  public void a(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    int i = (byte)paramInt;
    arrayOfByte[0] = i;
    a(arrayOfByte);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a.a(paramArrayOfByte, "Output");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    a(">> ", localByteArrayInputStream);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.a(paramArrayOfByte, "Output");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte, paramInt1, paramInt2);
    a(">> ", localByteArrayInputStream);
  }
  
  public boolean a()
  {
    return this.a.a();
  }
  
  public void b(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    int i = (byte)paramInt;
    arrayOfByte[0] = i;
    b(arrayOfByte);
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    a.a(paramArrayOfByte, "Input");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    a("<< ", localByteArrayInputStream);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.a(paramArrayOfByte, "Input");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte, paramInt1, paramInt2);
    a("<< ", localByteArrayInputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */