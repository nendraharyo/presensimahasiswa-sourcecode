package org.apache.http.impl.auth;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.util.EncodingUtils;

class NTLMEngineImpl$NTLMMessage
{
  private int currentOutputPosition = 0;
  private byte[] messageContents = null;
  
  NTLMEngineImpl$NTLMMessage() {}
  
  NTLMEngineImpl$NTLMMessage(String paramString, int paramInt)
  {
    Object localObject2 = Base64.decodeBase64(EncodingUtils.getBytes(paramString, "ASCII"));
    this.messageContents = ((byte[])localObject2);
    localObject2 = this.messageContents;
    int j = localObject2.length;
    Object localObject3 = NTLMEngineImpl.access$1000();
    int k = localObject3.length;
    if (j < k)
    {
      localObject1 = new org/apache/http/impl/auth/NTLMEngineException;
      ((NTLMEngineException)localObject1).<init>("NTLM message decoding error - packet too short");
      throw ((Throwable)localObject1);
    }
    do
    {
      i += 1;
      localObject2 = NTLMEngineImpl.access$1000();
      j = localObject2.length;
      if (i >= j) {
        break;
      }
      localObject2 = this.messageContents;
      j = localObject2[i];
      localObject3 = NTLMEngineImpl.access$1000();
      k = localObject3[i];
    } while (j == k);
    localObject1 = new org/apache/http/impl/auth/NTLMEngineException;
    ((NTLMEngineException)localObject1).<init>("NTLM message expected - instead got unrecognized bytes");
    throw ((Throwable)localObject1);
    localObject1 = NTLMEngineImpl.access$1000();
    i = localObject1.length;
    i = readULong(i);
    if (i != paramInt)
    {
      localObject2 = new org/apache/http/impl/auth/NTLMEngineException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("NTLM type ");
      String str = Integer.toString(paramInt);
      localObject3 = ((StringBuilder)localObject3).append(str).append(" message expected - instead got type ");
      localObject1 = Integer.toString(i);
      localObject1 = (String)localObject1;
      ((NTLMEngineException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    i = this.messageContents.length;
    this.currentOutputPosition = i;
  }
  
  protected void addByte(byte paramByte)
  {
    byte[] arrayOfByte = this.messageContents;
    int i = this.currentOutputPosition;
    arrayOfByte[i] = paramByte;
    int j = this.currentOutputPosition + 1;
    this.currentOutputPosition = j;
  }
  
  protected void addBytes(byte[] paramArrayOfByte)
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
        byte[] arrayOfByte = this.messageContents;
        int m = this.currentOutputPosition;
        arrayOfByte[m] = k;
        k = this.currentOutputPosition + 1;
        this.currentOutputPosition = k;
        j += 1;
      }
    }
  }
  
  protected void addULong(int paramInt)
  {
    byte b = (byte)(paramInt & 0xFF);
    addByte(b);
    b = (byte)(paramInt >> 8 & 0xFF);
    addByte(b);
    b = (byte)(paramInt >> 16 & 0xFF);
    addByte(b);
    b = (byte)(paramInt >> 24 & 0xFF);
    addByte(b);
  }
  
  protected void addUShort(int paramInt)
  {
    byte b = (byte)(paramInt & 0xFF);
    addByte(b);
    b = (byte)(paramInt >> 8 & 0xFF);
    addByte(b);
  }
  
  protected int getMessageLength()
  {
    return this.currentOutputPosition;
  }
  
  protected int getPreambleLength()
  {
    return NTLMEngineImpl.access$1000().length + 4;
  }
  
  String getResponse()
  {
    byte[] arrayOfByte1 = this.messageContents;
    int i = arrayOfByte1.length;
    int j = this.currentOutputPosition;
    if (i > j)
    {
      i = this.currentOutputPosition;
      arrayOfByte1 = new byte[i];
      byte[] arrayOfByte2 = this.messageContents;
      int k = this.currentOutputPosition;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
    }
    for (;;)
    {
      return EncodingUtils.getAsciiString(Base64.encodeBase64(arrayOfByte1));
      arrayOfByte1 = this.messageContents;
    }
  }
  
  protected void prepareResponse(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt1];
    this.messageContents = arrayOfByte;
    this.currentOutputPosition = 0;
    arrayOfByte = NTLMEngineImpl.access$1000();
    addBytes(arrayOfByte);
    addULong(paramInt2);
  }
  
  protected byte readByte(int paramInt)
  {
    Object localObject = this.messageContents;
    int i = localObject.length;
    int j = paramInt + 1;
    if (i < j)
    {
      localObject = new org/apache/http/impl/auth/NTLMEngineException;
      ((NTLMEngineException)localObject).<init>("NTLM: Message too short");
      throw ((Throwable)localObject);
    }
    return this.messageContents[paramInt];
  }
  
  protected void readBytes(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = this.messageContents;
    int i = localObject.length;
    int j = paramArrayOfByte.length + paramInt;
    if (i < j)
    {
      localObject = new org/apache/http/impl/auth/NTLMEngineException;
      ((NTLMEngineException)localObject).<init>("NTLM: Message too short");
      throw ((Throwable)localObject);
    }
    localObject = this.messageContents;
    int k = paramArrayOfByte.length;
    System.arraycopy(localObject, paramInt, paramArrayOfByte, 0, k);
  }
  
  protected byte[] readSecurityBuffer(int paramInt)
  {
    return NTLMEngineImpl.access$1300(this.messageContents, paramInt);
  }
  
  protected int readULong(int paramInt)
  {
    return NTLMEngineImpl.access$1200(this.messageContents, paramInt);
  }
  
  protected int readUShort(int paramInt)
  {
    return NTLMEngineImpl.access$1100(this.messageContents, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$NTLMMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */