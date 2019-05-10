package org.apache.http.client.entity;

import java.io.InputStream;

class LazyDecompressingInputStream
  extends InputStream
{
  private final DecompressingEntity decompressingEntity;
  private final InputStream wrappedStream;
  private InputStream wrapperStream;
  
  public LazyDecompressingInputStream(InputStream paramInputStream, DecompressingEntity paramDecompressingEntity)
  {
    this.wrappedStream = paramInputStream;
    this.decompressingEntity = paramDecompressingEntity;
  }
  
  private void initWrapper()
  {
    Object localObject = this.wrapperStream;
    if (localObject == null)
    {
      localObject = this.decompressingEntity;
      InputStream localInputStream = this.wrappedStream;
      localObject = ((DecompressingEntity)localObject).decorate(localInputStream);
      this.wrapperStream = ((InputStream)localObject);
    }
  }
  
  public int available()
  {
    initWrapper();
    return this.wrapperStream.available();
  }
  
  public void close()
  {
    try
    {
      InputStream localInputStream = this.wrapperStream;
      if (localInputStream != null)
      {
        localInputStream = this.wrapperStream;
        localInputStream.close();
      }
      return;
    }
    finally
    {
      this.wrappedStream.close();
    }
  }
  
  public boolean markSupported()
  {
    return false;
  }
  
  public int read()
  {
    initWrapper();
    return this.wrapperStream.read();
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    initWrapper();
    return this.wrapperStream.read(paramArrayOfByte);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    initWrapper();
    return this.wrapperStream.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public long skip(long paramLong)
  {
    initWrapper();
    return this.wrapperStream.skip(paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\LazyDecompressingInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */