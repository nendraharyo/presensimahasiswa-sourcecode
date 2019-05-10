package org.apache.http.impl.auth;

public abstract interface SpnegoTokenGenerator
{
  public abstract byte[] generateSpnegoDERObject(byte[] paramArrayOfByte);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\SpnegoTokenGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */