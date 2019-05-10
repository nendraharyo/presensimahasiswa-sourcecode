package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.OutputStream;

class LoggingOutputStream
  extends OutputStream
{
  private final OutputStream out;
  private final Wire wire;
  
  public LoggingOutputStream(OutputStream paramOutputStream, Wire paramWire)
  {
    this.out = paramOutputStream;
    this.wire = paramWire;
  }
  
  public void close()
  {
    try
    {
      OutputStream localOutputStream = this.out;
      localOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[close] I/O error: ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire.output((String)localObject);
      throw localIOException;
    }
  }
  
  public void flush()
  {
    try
    {
      OutputStream localOutputStream = this.out;
      localOutputStream.flush();
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[flush] I/O error: ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire.output((String)localObject);
      throw localIOException;
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      Wire localWire1 = this.wire;
      localWire1.output(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire2 = this.wire;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("[write] I/O error: ");
      String str = localIOException.getMessage();
      localObject = str;
      localWire2.output((String)localObject);
      throw localIOException;
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject1 = this.wire;
      ((Wire)localObject1).output(paramArrayOfByte);
      localObject1 = this.out;
      ((OutputStream)localObject1).write(paramArrayOfByte);
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("[write] I/O error: ");
      String str = localIOException.getMessage();
      localObject2 = str;
      localWire.output((String)localObject2);
      throw localIOException;
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      Object localObject1 = this.wire;
      ((Wire)localObject1).output(paramArrayOfByte, paramInt1, paramInt2);
      localObject1 = this.out;
      ((OutputStream)localObject1).write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      Wire localWire = this.wire;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("[write] I/O error: ");
      String str = localIOException.getMessage();
      localObject2 = str;
      localWire.output((String)localObject2);
      throw localIOException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\LoggingOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */