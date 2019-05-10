package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class DeflateInputStream
  extends InputStream
{
  private InputStream sourceStream;
  
  public DeflateInputStream(InputStream paramInputStream)
  {
    int j = 6;
    Object localObject1 = new byte[j];
    PushbackInputStream localPushbackInputStream = new java/io/PushbackInputStream;
    int k = localObject1.length;
    localPushbackInputStream.<init>(paramInputStream, k);
    k = localPushbackInputStream.read((byte[])localObject1);
    if (k == i)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Unable to read the response");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new byte[bool1];
    Inflater localInflater1 = new java/util/zip/Inflater;
    localInflater1.<init>();
    for (;;)
    {
      Object localObject4;
      Object localObject3;
      try
      {
        m = localInflater1.inflate((byte[])localObject2);
        if (m == 0)
        {
          bool3 = localInflater1.finished();
          if (bool3)
          {
            localObject2 = new java/io/IOException;
            localObject4 = "Unable to read the response";
            ((IOException)localObject2).<init>((String)localObject4);
            throw ((Throwable)localObject2);
          }
        }
      }
      catch (DataFormatException localDataFormatException)
      {
        int m;
        bool1 = false;
        localObject3 = null;
        localPushbackInputStream.unread((byte[])localObject1, 0, k);
        localObject1 = new org/apache/http/client/entity/DeflateInputStream$DeflateStream;
        Inflater localInflater2 = new java/util/zip/Inflater;
        bool1 = true;
        localInflater2.<init>(bool1);
        ((DeflateInputStream.DeflateStream)localObject1).<init>(localPushbackInputStream, localInflater2);
        this.sourceStream = ((InputStream)localObject1);
        return;
        boolean bool3 = localInflater1.needsDictionary();
        if (bool3)
        {
          if (m != i) {
            break label251;
          }
          localObject3 = new java/io/IOException;
          localObject4 = "Unable to read the response";
          ((IOException)localObject3).<init>((String)localObject4);
          throw ((Throwable)localObject3);
        }
      }
      finally
      {
        localInflater1.end();
      }
      boolean bool2 = localInflater1.needsInput();
      if (bool2)
      {
        localInflater1.setInput(arrayOfByte);
        continue;
        label251:
        bool1 = false;
        localObject3 = null;
        localPushbackInputStream.unread(arrayOfByte, 0, k);
        localObject3 = new org/apache/http/client/entity/DeflateInputStream$DeflateStream;
        localObject4 = new java/util/zip/Inflater;
        ((Inflater)localObject4).<init>();
        ((DeflateInputStream.DeflateStream)localObject3).<init>(localPushbackInputStream, (Inflater)localObject4);
        this.sourceStream = ((InputStream)localObject3);
        localInflater1.end();
      }
    }
  }
  
  public int available()
  {
    return this.sourceStream.available();
  }
  
  public void close()
  {
    this.sourceStream.close();
  }
  
  public void mark(int paramInt)
  {
    this.sourceStream.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return this.sourceStream.markSupported();
  }
  
  public int read()
  {
    return this.sourceStream.read();
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return this.sourceStream.read(paramArrayOfByte);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.sourceStream.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void reset()
  {
    this.sourceStream.reset();
  }
  
  public long skip(long paramLong)
  {
    return this.sourceStream.skip(paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\DeflateInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */