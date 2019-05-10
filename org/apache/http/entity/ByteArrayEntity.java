package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class ByteArrayEntity
  extends AbstractHttpEntity
  implements Cloneable
{
  private final byte[] b;
  protected final byte[] content;
  private final int len;
  private final int off;
  
  public ByteArrayEntity(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, null);
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(paramArrayOfByte, paramInt1, paramInt2, null);
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, int paramInt1, int paramInt2, ContentType paramContentType)
  {
    Object localObject1 = "Source byte array";
    Args.notNull(paramArrayOfByte, (String)localObject1);
    if (paramInt1 >= 0)
    {
      int i = paramArrayOfByte.length;
      if ((paramInt1 <= i) && (paramInt2 >= 0))
      {
        i = paramInt1 + paramInt2;
        if (i >= 0)
        {
          i = paramInt1 + paramInt2;
          int j = paramArrayOfByte.length;
          if (i <= j) {
            break label127;
          }
        }
      }
    }
    localObject1 = new java/lang/IndexOutOfBoundsException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("off: ").append(paramInt1).append(" len: ").append(paramInt2).append(" b.length: ");
    int k = paramArrayOfByte.length;
    localObject2 = k;
    ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
    label127:
    this.content = paramArrayOfByte;
    this.b = paramArrayOfByte;
    this.off = paramInt1;
    this.len = paramInt2;
    if (paramContentType != null)
    {
      localObject1 = paramContentType.toString();
      setContentType((String)localObject1);
    }
  }
  
  public ByteArrayEntity(byte[] paramArrayOfByte, ContentType paramContentType)
  {
    Args.notNull(paramArrayOfByte, "Source byte array");
    this.content = paramArrayOfByte;
    this.b = paramArrayOfByte;
    this.off = 0;
    Object localObject = this.b;
    int i = localObject.length;
    this.len = i;
    if (paramContentType != null)
    {
      localObject = paramContentType.toString();
      setContentType((String)localObject);
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.b;
    int i = this.off;
    int j = this.len;
    localByteArrayInputStream.<init>(arrayOfByte, i, j);
    return localByteArrayInputStream;
  }
  
  public long getContentLength()
  {
    return this.len;
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    byte[] arrayOfByte = this.b;
    int i = this.off;
    int j = this.len;
    paramOutputStream.write(arrayOfByte, i, j);
    paramOutputStream.flush();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\ByteArrayEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */