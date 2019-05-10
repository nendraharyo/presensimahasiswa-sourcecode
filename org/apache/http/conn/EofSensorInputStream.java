package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.Args;

public class EofSensorInputStream
  extends InputStream
  implements ConnectionReleaseTrigger
{
  private final EofSensorWatcher eofWatcher;
  private boolean selfClosed;
  protected InputStream wrappedStream;
  
  public EofSensorInputStream(InputStream paramInputStream, EofSensorWatcher paramEofSensorWatcher)
  {
    Args.notNull(paramInputStream, "Wrapped stream");
    this.wrappedStream = paramInputStream;
    this.selfClosed = false;
    this.eofWatcher = paramEofSensorWatcher;
  }
  
  public void abortConnection()
  {
    this.selfClosed = true;
    checkAbort();
  }
  
  public int available()
  {
    int i = 0;
    InputStream localInputStream = null;
    boolean bool = isReadAllowed();
    if (bool) {}
    try
    {
      localInputStream = this.wrappedStream;
      i = localInputStream.available();
      return i;
    }
    catch (IOException localIOException)
    {
      checkAbort();
      throw localIOException;
    }
  }
  
  protected void checkAbort()
  {
    Object localObject1 = this.wrappedStream;
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.eofWatcher;
      if (localObject3 != null)
      {
        localObject1 = this.eofWatcher;
        localObject3 = this.wrappedStream;
        bool = ((EofSensorWatcher)localObject1).streamAbort((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.wrappedStream;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.wrappedStream = null;
    }
  }
  
  protected void checkClose()
  {
    Object localObject1 = this.wrappedStream;
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.eofWatcher;
      if (localObject3 != null)
      {
        localObject1 = this.eofWatcher;
        localObject3 = this.wrappedStream;
        bool = ((EofSensorWatcher)localObject1).streamClosed((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.wrappedStream;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.wrappedStream = null;
    }
  }
  
  protected void checkEOF(int paramInt)
  {
    Object localObject1 = this.wrappedStream;
    boolean bool;
    if ((localObject1 != null) && (paramInt < 0)) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.eofWatcher;
      if (localObject3 != null)
      {
        localObject1 = this.eofWatcher;
        localObject3 = this.wrappedStream;
        bool = ((EofSensorWatcher)localObject1).eofDetected((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.wrappedStream;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.wrappedStream = null;
    }
  }
  
  public void close()
  {
    this.selfClosed = true;
    checkClose();
  }
  
  InputStream getWrappedStream()
  {
    return this.wrappedStream;
  }
  
  protected boolean isReadAllowed()
  {
    boolean bool = this.selfClosed;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted read on closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.wrappedStream;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  boolean isSelfClosed()
  {
    return this.selfClosed;
  }
  
  public int read()
  {
    int i = -1;
    boolean bool = isReadAllowed();
    if (bool) {}
    try
    {
      InputStream localInputStream = this.wrappedStream;
      i = localInputStream.read();
      checkEOF(i);
      return i;
    }
    catch (IOException localIOException)
    {
      checkAbort();
      throw localIOException;
    }
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return read(paramArrayOfByte, 0, i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool = isReadAllowed();
    if (bool) {}
    try
    {
      InputStream localInputStream = this.wrappedStream;
      i = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      checkEOF(i);
      return i;
    }
    catch (IOException localIOException)
    {
      checkAbort();
      throw localIOException;
    }
  }
  
  public void releaseConnection()
  {
    close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\EofSensorInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */