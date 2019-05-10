package org.apache.http.impl.conn;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.util.Args;

public class Wire
{
  private final String id;
  private final Log log;
  
  public Wire(Log paramLog)
  {
    this(paramLog, "");
  }
  
  public Wire(Log paramLog, String paramString)
  {
    this.log = paramLog;
    this.id = paramString;
  }
  
  private void wire(String paramString, InputStream paramInputStream)
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
          localObject2 = this.log;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = this.id;
          localObject3 = ((StringBuilder)localObject3).append(str).append(" ");
          str = ((StringBuilder)localObject1).toString();
          localObject3 = str;
          ((Log)localObject2).debug(localObject3);
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
      localObject2 = this.log;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str = this.id;
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = " ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject1 = (String)localObject1;
      ((Log)localObject2).debug(localObject1);
    }
  }
  
  public boolean enabled()
  {
    return this.log.isDebugEnabled();
  }
  
  public void input(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    int i = (byte)paramInt;
    arrayOfByte[0] = i;
    input(arrayOfByte);
  }
  
  public void input(InputStream paramInputStream)
  {
    Args.notNull(paramInputStream, "Input");
    wire("<< ", paramInputStream);
  }
  
  public void input(String paramString)
  {
    Args.notNull(paramString, "Input");
    byte[] arrayOfByte = paramString.getBytes();
    input(arrayOfByte);
  }
  
  public void input(byte[] paramArrayOfByte)
  {
    Args.notNull(paramArrayOfByte, "Input");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    wire("<< ", localByteArrayInputStream);
  }
  
  public void input(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Args.notNull(paramArrayOfByte, "Input");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte, paramInt1, paramInt2);
    wire("<< ", localByteArrayInputStream);
  }
  
  public void output(int paramInt)
  {
    byte[] arrayOfByte = new byte[1];
    int i = (byte)paramInt;
    arrayOfByte[0] = i;
    output(arrayOfByte);
  }
  
  public void output(InputStream paramInputStream)
  {
    Args.notNull(paramInputStream, "Output");
    wire(">> ", paramInputStream);
  }
  
  public void output(String paramString)
  {
    Args.notNull(paramString, "Output");
    byte[] arrayOfByte = paramString.getBytes();
    output(arrayOfByte);
  }
  
  public void output(byte[] paramArrayOfByte)
  {
    Args.notNull(paramArrayOfByte, "Output");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte);
    wire(">> ", localByteArrayInputStream);
  }
  
  public void output(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Args.notNull(paramArrayOfByte, "Output");
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    localByteArrayInputStream.<init>(paramArrayOfByte, paramInt1, paramInt2);
    wire(">> ", localByteArrayInputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\Wire.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */