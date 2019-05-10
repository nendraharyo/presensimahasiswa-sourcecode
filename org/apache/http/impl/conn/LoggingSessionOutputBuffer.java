package org.apache.http.impl.conn;

import java.nio.charset.Charset;
import org.apache.http.Consts;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

public class LoggingSessionOutputBuffer
  implements SessionOutputBuffer
{
  private final String charset;
  private final SessionOutputBuffer out;
  private final Wire wire;
  
  public LoggingSessionOutputBuffer(SessionOutputBuffer paramSessionOutputBuffer, Wire paramWire)
  {
    this(paramSessionOutputBuffer, paramWire, null);
  }
  
  public LoggingSessionOutputBuffer(SessionOutputBuffer paramSessionOutputBuffer, Wire paramWire, String paramString)
  {
    this.out = paramSessionOutputBuffer;
    this.wire = paramWire;
    if (paramString != null) {}
    for (;;)
    {
      this.charset = paramString;
      return;
      Charset localCharset = Consts.ASCII;
      paramString = localCharset.name();
    }
  }
  
  public void flush()
  {
    this.out.flush();
  }
  
  public HttpTransportMetrics getMetrics()
  {
    return this.out.getMetrics();
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if (bool)
    {
      localWire = this.wire;
      localWire.output(paramInt);
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.out.write(paramArrayOfByte);
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if (bool)
    {
      localWire = this.wire;
      localWire.output(paramArrayOfByte);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    Wire localWire = this.wire;
    boolean bool = localWire.enabled();
    if (bool)
    {
      localWire = this.wire;
      localWire.output(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public void writeLine(String paramString)
  {
    this.out.writeLine(paramString);
    Object localObject = this.wire;
    boolean bool = ((Wire)localObject).enabled();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + "\r\n";
      Wire localWire = this.wire;
      String str = this.charset;
      localObject = ((String)localObject).getBytes(str);
      localWire.output((byte[])localObject);
    }
  }
  
  public void writeLine(CharArrayBuffer paramCharArrayBuffer)
  {
    this.out.writeLine(paramCharArrayBuffer);
    Object localObject1 = this.wire;
    boolean bool = ((Wire)localObject1).enabled();
    if (bool)
    {
      localObject1 = new java/lang/String;
      Object localObject2 = paramCharArrayBuffer.buffer();
      int i = paramCharArrayBuffer.length();
      ((String)localObject1).<init>((char[])localObject2, 0, i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = (String)localObject1 + "\r\n";
      localObject2 = this.wire;
      String str = this.charset;
      localObject1 = ((String)localObject1).getBytes(str);
      ((Wire)localObject2).output((byte[])localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\LoggingSessionOutputBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */