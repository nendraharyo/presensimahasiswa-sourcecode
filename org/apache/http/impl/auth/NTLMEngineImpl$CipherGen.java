package org.apache.http.impl.auth;

import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;

public class NTLMEngineImpl$CipherGen
{
  protected final byte[] challenge;
  protected byte[] clientChallenge;
  protected byte[] clientChallenge2;
  protected final String domain;
  protected byte[] lanManagerSessionKey = null;
  protected byte[] lm2SessionResponse = null;
  protected byte[] lmHash = null;
  protected byte[] lmResponse = null;
  protected byte[] lmUserSessionKey = null;
  protected byte[] lmv2Hash = null;
  protected byte[] lmv2Response = null;
  protected byte[] ntlm2SessionResponse = null;
  protected byte[] ntlm2SessionResponseUserSessionKey = null;
  protected byte[] ntlmHash = null;
  protected byte[] ntlmResponse = null;
  protected byte[] ntlmUserSessionKey = null;
  protected byte[] ntlmv2Blob = null;
  protected byte[] ntlmv2Hash = null;
  protected byte[] ntlmv2Response = null;
  protected byte[] ntlmv2UserSessionKey = null;
  protected final String password;
  protected byte[] secondaryKey;
  protected final String target;
  protected final byte[] targetInformation;
  protected byte[] timestamp;
  protected final String user;
  
  public NTLMEngineImpl$CipherGen(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte1, String paramString4, byte[] paramArrayOfByte2)
  {
    this(paramString1, paramString2, paramString3, paramArrayOfByte1, paramString4, paramArrayOfByte2, null, null, null, null);
  }
  
  public NTLMEngineImpl$CipherGen(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte1, String paramString4, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6)
  {
    this.domain = paramString1;
    this.target = paramString4;
    this.user = paramString2;
    this.password = paramString3;
    this.challenge = paramArrayOfByte1;
    this.targetInformation = paramArrayOfByte2;
    this.clientChallenge = paramArrayOfByte3;
    this.clientChallenge2 = paramArrayOfByte4;
    this.secondaryKey = paramArrayOfByte5;
    this.timestamp = paramArrayOfByte6;
  }
  
  public byte[] getClientChallenge()
  {
    byte[] arrayOfByte = this.clientChallenge;
    if (arrayOfByte == null)
    {
      arrayOfByte = NTLMEngineImpl.access$000();
      this.clientChallenge = arrayOfByte;
    }
    return this.clientChallenge;
  }
  
  public byte[] getClientChallenge2()
  {
    byte[] arrayOfByte = this.clientChallenge2;
    if (arrayOfByte == null)
    {
      arrayOfByte = NTLMEngineImpl.access$000();
      this.clientChallenge2 = arrayOfByte;
    }
    return this.clientChallenge2;
  }
  
  public byte[] getLM2SessionResponse()
  {
    byte[] arrayOfByte1 = this.lm2SessionResponse;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getClientChallenge();
      int i = 24;
      byte[] arrayOfByte2 = new byte[i];
      this.lm2SessionResponse = arrayOfByte2;
      arrayOfByte2 = this.lm2SessionResponse;
      int j = arrayOfByte1.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
      arrayOfByte2 = this.lm2SessionResponse;
      int k = arrayOfByte1.length;
      byte[] arrayOfByte3 = this.lm2SessionResponse;
      j = arrayOfByte3.length;
      Arrays.fill(arrayOfByte2, k, j, (byte)0);
    }
    return this.lm2SessionResponse;
  }
  
  public byte[] getLMHash()
  {
    byte[] arrayOfByte = this.lmHash;
    if (arrayOfByte == null)
    {
      arrayOfByte = NTLMEngineImpl.access$200(this.password);
      this.lmHash = arrayOfByte;
    }
    return this.lmHash;
  }
  
  public byte[] getLMResponse()
  {
    byte[] arrayOfByte1 = this.lmResponse;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getLMHash();
      byte[] arrayOfByte2 = this.challenge;
      arrayOfByte1 = NTLMEngineImpl.access$300(arrayOfByte1, arrayOfByte2);
      this.lmResponse = arrayOfByte1;
    }
    return this.lmResponse;
  }
  
  public byte[] getLMUserSessionKey()
  {
    int i = 16;
    int j = 8;
    byte[] arrayOfByte1 = this.lmUserSessionKey;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = new byte[i];
      this.lmUserSessionKey = arrayOfByte1;
      arrayOfByte1 = getLMHash();
      byte[] arrayOfByte2 = this.lmUserSessionKey;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
      arrayOfByte1 = this.lmUserSessionKey;
      Arrays.fill(arrayOfByte1, j, i, (byte)0);
    }
    return this.lmUserSessionKey;
  }
  
  public byte[] getLMv2Hash()
  {
    Object localObject = this.lmv2Hash;
    if (localObject == null)
    {
      localObject = this.domain;
      String str = this.user;
      byte[] arrayOfByte = getNTLMHash();
      localObject = NTLMEngineImpl.access$500((String)localObject, str, arrayOfByte);
      this.lmv2Hash = ((byte[])localObject);
    }
    return this.lmv2Hash;
  }
  
  public byte[] getLMv2Response()
  {
    byte[] arrayOfByte1 = this.lmv2Response;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getLMv2Hash();
      byte[] arrayOfByte2 = this.challenge;
      byte[] arrayOfByte3 = getClientChallenge();
      arrayOfByte1 = NTLMEngineImpl.access$800(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.lmv2Response = arrayOfByte1;
    }
    return this.lmv2Response;
  }
  
  public byte[] getLanManagerSessionKey()
  {
    Object localObject1 = this.lanManagerSessionKey;
    int i;
    if (localObject1 == null) {
      i = 14;
    }
    try
    {
      localObject1 = new byte[i];
      localObject2 = getLMHash();
      int j = 0;
      localObject3 = null;
      byte b = 0;
      Object localObject4 = null;
      int k = 8;
      System.arraycopy(localObject2, 0, localObject1, 0, k);
      int m = 8;
      j = localObject1.length;
      b = -67;
      Arrays.fill((byte[])localObject1, m, j, b);
      m = 0;
      localObject2 = null;
      localObject2 = NTLMEngineImpl.access$900((byte[])localObject1, 0);
      j = 7;
      localObject1 = NTLMEngineImpl.access$900((byte[])localObject1, j);
      j = 8;
      localObject3 = new byte[j];
      localObject4 = getLMResponse();
      k = 0;
      int n = 0;
      int i1 = localObject3.length;
      System.arraycopy(localObject4, 0, localObject3, 0, i1);
      localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      k = 1;
      ((Cipher)localObject4).init(k, (Key)localObject2);
      localObject2 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      localObject4 = "DES/ECB/NoPadding";
      localObject4 = Cipher.getInstance((String)localObject4);
      k = 1;
      ((Cipher)localObject4).init(k, (Key)localObject1);
      localObject1 = ((Cipher)localObject4).doFinal((byte[])localObject3);
      j = 16;
      localObject3 = new byte[j];
      this.lanManagerSessionKey = ((byte[])localObject3);
      j = 0;
      localObject3 = null;
      localObject4 = this.lanManagerSessionKey;
      k = 0;
      n = localObject2.length;
      System.arraycopy(localObject2, 0, localObject4, 0, n);
      j = 0;
      localObject3 = null;
      localObject4 = this.lanManagerSessionKey;
      m = localObject2.length;
      k = localObject1.length;
      System.arraycopy(localObject1, 0, localObject4, m, k);
      return this.lanManagerSessionKey;
    }
    catch (Exception localException)
    {
      Object localObject2 = new org/apache/http/impl/auth/NTLMEngineException;
      Object localObject3 = localException.getMessage();
      ((NTLMEngineException)localObject2).<init>((String)localObject3, localException);
      throw ((Throwable)localObject2);
    }
  }
  
  public byte[] getNTLM2SessionResponse()
  {
    byte[] arrayOfByte1 = this.ntlm2SessionResponse;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getNTLMHash();
      byte[] arrayOfByte2 = this.challenge;
      byte[] arrayOfByte3 = getClientChallenge();
      arrayOfByte1 = NTLMEngineImpl.ntlm2SessionResponse(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.ntlm2SessionResponse = arrayOfByte1;
    }
    return this.ntlm2SessionResponse;
  }
  
  public byte[] getNTLM2SessionResponseUserSessionKey()
  {
    byte[] arrayOfByte1 = this.ntlm2SessionResponseUserSessionKey;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getLM2SessionResponse();
      int i = this.challenge.length;
      int j = arrayOfByte1.length;
      i += j;
      byte[] arrayOfByte2 = new byte[i];
      byte[] arrayOfByte3 = this.challenge;
      byte[] arrayOfByte4 = this.challenge;
      int k = arrayOfByte4.length;
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, k);
      arrayOfByte3 = this.challenge;
      j = arrayOfByte3.length;
      k = arrayOfByte1.length;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, k);
      arrayOfByte1 = getNTLMUserSessionKey();
      arrayOfByte1 = NTLMEngineImpl.hmacMD5(arrayOfByte2, arrayOfByte1);
      this.ntlm2SessionResponseUserSessionKey = arrayOfByte1;
    }
    return this.ntlm2SessionResponseUserSessionKey;
  }
  
  public byte[] getNTLMHash()
  {
    byte[] arrayOfByte = this.ntlmHash;
    if (arrayOfByte == null)
    {
      arrayOfByte = NTLMEngineImpl.access$400(this.password);
      this.ntlmHash = arrayOfByte;
    }
    return this.ntlmHash;
  }
  
  public byte[] getNTLMResponse()
  {
    byte[] arrayOfByte1 = this.ntlmResponse;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getNTLMHash();
      byte[] arrayOfByte2 = this.challenge;
      arrayOfByte1 = NTLMEngineImpl.access$300(arrayOfByte1, arrayOfByte2);
      this.ntlmResponse = arrayOfByte1;
    }
    return this.ntlmResponse;
  }
  
  public byte[] getNTLMUserSessionKey()
  {
    Object localObject = this.ntlmUserSessionKey;
    if (localObject == null)
    {
      localObject = new org/apache/http/impl/auth/NTLMEngineImpl$MD4;
      ((NTLMEngineImpl.MD4)localObject).<init>();
      byte[] arrayOfByte = getNTLMHash();
      ((NTLMEngineImpl.MD4)localObject).update(arrayOfByte);
      localObject = ((NTLMEngineImpl.MD4)localObject).getOutput();
      this.ntlmUserSessionKey = ((byte[])localObject);
    }
    return this.ntlmUserSessionKey;
  }
  
  public byte[] getNTLMv2Blob()
  {
    byte[] arrayOfByte1 = this.ntlmv2Blob;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getClientChallenge2();
      byte[] arrayOfByte2 = this.targetInformation;
      byte[] arrayOfByte3 = getTimestamp();
      arrayOfByte1 = NTLMEngineImpl.access$700(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.ntlmv2Blob = arrayOfByte1;
    }
    return this.ntlmv2Blob;
  }
  
  public byte[] getNTLMv2Hash()
  {
    Object localObject = this.ntlmv2Hash;
    if (localObject == null)
    {
      localObject = this.domain;
      String str = this.user;
      byte[] arrayOfByte = getNTLMHash();
      localObject = NTLMEngineImpl.access$600((String)localObject, str, arrayOfByte);
      this.ntlmv2Hash = ((byte[])localObject);
    }
    return this.ntlmv2Hash;
  }
  
  public byte[] getNTLMv2Response()
  {
    byte[] arrayOfByte1 = this.ntlmv2Response;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getNTLMv2Hash();
      byte[] arrayOfByte2 = this.challenge;
      byte[] arrayOfByte3 = getNTLMv2Blob();
      arrayOfByte1 = NTLMEngineImpl.access$800(arrayOfByte1, arrayOfByte2, arrayOfByte3);
      this.ntlmv2Response = arrayOfByte1;
    }
    return this.ntlmv2Response;
  }
  
  public byte[] getNTLMv2UserSessionKey()
  {
    int i = 16;
    byte[] arrayOfByte1 = this.ntlmv2UserSessionKey;
    if (arrayOfByte1 == null)
    {
      arrayOfByte1 = getNTLMv2Hash();
      byte[] arrayOfByte2 = new byte[i];
      byte[] arrayOfByte3 = getNTLMv2Response();
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, i);
      arrayOfByte1 = NTLMEngineImpl.hmacMD5(arrayOfByte2, arrayOfByte1);
      this.ntlmv2UserSessionKey = arrayOfByte1;
    }
    return this.ntlmv2UserSessionKey;
  }
  
  public byte[] getSecondaryKey()
  {
    byte[] arrayOfByte = this.secondaryKey;
    if (arrayOfByte == null)
    {
      arrayOfByte = NTLMEngineImpl.access$100();
      this.secondaryKey = arrayOfByte;
    }
    return this.secondaryKey;
  }
  
  public byte[] getTimestamp()
  {
    int i = 8;
    byte[] arrayOfByte1 = this.timestamp;
    if (arrayOfByte1 == null)
    {
      long l1 = System.currentTimeMillis() + 11644473600000L;
      long l2 = 10000L * l1;
      arrayOfByte1 = new byte[i];
      this.timestamp = arrayOfByte1;
      int j = 0;
      arrayOfByte1 = null;
      while (j < i)
      {
        byte[] arrayOfByte2 = this.timestamp;
        int k = (byte)(int)l2;
        arrayOfByte2[j] = k;
        l2 >>>= i;
        j += 1;
      }
    }
    return this.timestamp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$CipherGen.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */