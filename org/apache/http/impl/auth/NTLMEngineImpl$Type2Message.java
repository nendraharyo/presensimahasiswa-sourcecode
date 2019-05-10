package org.apache.http.impl.auth;

import java.io.UnsupportedEncodingException;

class NTLMEngineImpl$Type2Message
  extends NTLMEngineImpl.NTLMMessage
{
  protected byte[] challenge;
  protected int flags;
  protected String target;
  protected byte[] targetInfo;
  
  NTLMEngineImpl$Type2Message(String paramString)
  {
    super(paramString, 2);
    Object localObject1 = new byte[8];
    this.challenge = ((byte[])localObject1);
    localObject1 = this.challenge;
    int j = 24;
    readBytes((byte[])localObject1, j);
    int k = readULong(i);
    this.flags = k;
    k = this.flags & 0x1;
    Object localObject2;
    String str;
    if (k == 0)
    {
      localObject1 = new org/apache/http/impl/auth/NTLMEngineException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("NTLM type 2 message indicates no support for Unicode. Flags are: ");
      str = Integer.toString(this.flags);
      localObject2 = str;
      ((NTLMEngineException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.target = null;
    k = getMessageLength();
    if (k >= i)
    {
      k = 12;
      localObject1 = readSecurityBuffer(k);
      j = localObject1.length;
      if (j == 0) {}
    }
    try
    {
      localObject2 = new java/lang/String;
      str = "UnicodeLittleUnmarked";
      ((String)localObject2).<init>((byte[])localObject1, str);
      this.target = ((String)localObject2);
      this.targetInfo = null;
      k = getMessageLength();
      j = 48;
      if (k >= j)
      {
        k = 40;
        localObject1 = readSecurityBuffer(k);
        j = localObject1.length;
        if (j != 0) {
          this.targetInfo = ((byte[])localObject1);
        }
      }
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject2 = new org/apache/http/impl/auth/NTLMEngineException;
      str = localUnsupportedEncodingException.getMessage();
      ((NTLMEngineException)localObject2).<init>(str, localUnsupportedEncodingException);
      throw ((Throwable)localObject2);
    }
  }
  
  byte[] getChallenge()
  {
    return this.challenge;
  }
  
  int getFlags()
  {
    return this.flags;
  }
  
  String getTarget()
  {
    return this.target;
  }
  
  byte[] getTargetInfo()
  {
    return this.targetInfo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$Type2Message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */