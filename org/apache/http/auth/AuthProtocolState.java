package org.apache.http.auth;

public enum AuthProtocolState
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new org/apache/http/auth/AuthProtocolState;
    ((AuthProtocolState)localObject).<init>("UNCHALLENGED", 0);
    UNCHALLENGED = (AuthProtocolState)localObject;
    localObject = new org/apache/http/auth/AuthProtocolState;
    ((AuthProtocolState)localObject).<init>("CHALLENGED", m);
    CHALLENGED = (AuthProtocolState)localObject;
    localObject = new org/apache/http/auth/AuthProtocolState;
    ((AuthProtocolState)localObject).<init>("HANDSHAKE", k);
    HANDSHAKE = (AuthProtocolState)localObject;
    localObject = new org/apache/http/auth/AuthProtocolState;
    ((AuthProtocolState)localObject).<init>("FAILURE", j);
    FAILURE = (AuthProtocolState)localObject;
    localObject = new org/apache/http/auth/AuthProtocolState;
    ((AuthProtocolState)localObject).<init>("SUCCESS", i);
    SUCCESS = (AuthProtocolState)localObject;
    localObject = new AuthProtocolState[5];
    AuthProtocolState localAuthProtocolState = UNCHALLENGED;
    localObject[0] = localAuthProtocolState;
    localAuthProtocolState = CHALLENGED;
    localObject[m] = localAuthProtocolState;
    localAuthProtocolState = HANDSHAKE;
    localObject[k] = localAuthProtocolState;
    localAuthProtocolState = FAILURE;
    localObject[j] = localAuthProtocolState;
    localAuthProtocolState = SUCCESS;
    localObject[i] = localAuthProtocolState;
    $VALUES = (AuthProtocolState[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthProtocolState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */