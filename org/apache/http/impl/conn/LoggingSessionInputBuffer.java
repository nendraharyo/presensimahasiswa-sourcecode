package org.apache.http.impl.conn;

import java.nio.charset.Charset;
import org.apache.http.Consts;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

public class LoggingSessionInputBuffer
  implements EofSensor, SessionInputBuffer
{
  private final String charset;
  private final EofSensor eofSensor;
  private final SessionInputBuffer in;
  private final Wire wire;
  
  public LoggingSessionInputBuffer(SessionInputBuffer paramSessionInputBuffer, Wire paramWire)
  {
    this(paramSessionInputBuffer, paramWire, null);
  }
  
  public LoggingSessionInputBuffer(SessionInputBuffer paramSessionInputBuffer, Wire paramWire, String paramString)
  {
    this.in = paramSessionInputBuffer;
    boolean bool = paramSessionInputBuffer instanceof EofSensor;
    if (bool)
    {
      paramSessionInputBuffer = (EofSensor)paramSessionInputBuffer;
      this.eofSensor = paramSessionInputBuffer;
      this.wire = paramWire;
      if (paramString == null) {
        break label50;
      }
    }
    for (;;)
    {
      this.charset = paramString;
      return;
      paramSessionInputBuffer = null;
      break;
      label50:
      Charset localCharset = Consts.ASCII;
      paramString = localCharset.name();
    }
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.in.getMetrics();
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    return this.in.isDataAvailable(paramInt);
  }
  
  public boolean isEof()
  {
    EofSensor localEofSensor = this.eofSensor;
    boolean bool;
    if (localEofSensor != null)
    {
      localEofSensor = this.eofSensor;
      bool = localEofSensor.isEof();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localEofSensor = null;
    }
  }
  
  public int read()
  {
    SessionInputBuffer localSessionInputBuffer = this.in;
    int i = localSessionInputBuffer.read();
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if (bool)
    {
      int j = -1;
      if (i != j)
      {
        localWire = this.wire;
        localWire.input(i);
      }
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    SessionInputBuffer localSessionInputBuffer = this.in;
    int i = localSessionInputBuffer.read(paramArrayOfByte);
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if ((bool) && (i > 0))
    {
      localWire = this.wire;
      localWire.input(paramArrayOfByte, 0, i);
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    SessionInputBuffer localSessionInputBuffer = this.in;
    int i = localSessionInputBuffer.read(paramArrayOfByte, paramInt1, paramInt2);
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if ((bool) && (i > 0))
    {
      localWire = this.wire;
      localWire.input(paramArrayOfByte, paramInt1, i);
    }
    return i;
  }
  
  public int readLine(CharArrayBuffer paramCharArrayBuffer)
  {
    SessionInputBuffer localSessionInputBuffer = this.in;
    int i = localSessionInputBuffer.readLine(paramCharArrayBuffer);
    Object localObject1 = this.wire;
    boolean bool = ((Wire)localObject1).enabled();
    if ((bool) && (i >= 0))
    {
      int j = paramCharArrayBuffer.length() - i;
      Object localObject2 = new java/lang/String;
      Object localObject3 = paramCharArrayBuffer.buffer();
      ((String)localObject2).<init>((char[])localObject3, j, i);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = (String)localObject2 + "\r\n";
      localObject2 = this.wire;
      localObject3 = this.charset;
      localObject1 = ((String)localObject1).getBytes((String)localObject3);
      ((Wire)localObject2).input((byte[])localObject1);
    }
    return i;
  }
  
  public String readLine()
  {
    String str1 = this.in.readLine();
    Object localObject = this.wire;
    boolean bool = ((Wire)localObject).enabled();
    if ((bool) && (str1 != null))
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = str1 + "\r\n";
      Wire localWire = this.wire;
      String str2 = this.charset;
      localObject = ((String)localObject).getBytes(str2);
      localWire.input((byte[])localObject);
    }
    return str1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\LoggingSessionInputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */