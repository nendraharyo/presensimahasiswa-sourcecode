package org.apache.http.impl.auth;

 enum GGSSchemeBase$State
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new org/apache/http/impl/auth/GGSSchemeBase$State;
    ((State)localObject).<init>("UNINITIATED", 0);
    UNINITIATED = (State)localObject;
    localObject = new org/apache/http/impl/auth/GGSSchemeBase$State;
    ((State)localObject).<init>("CHALLENGE_RECEIVED", k);
    CHALLENGE_RECEIVED = (State)localObject;
    localObject = new org/apache/http/impl/auth/GGSSchemeBase$State;
    ((State)localObject).<init>("TOKEN_GENERATED", j);
    TOKEN_GENERATED = (State)localObject;
    localObject = new org/apache/http/impl/auth/GGSSchemeBase$State;
    ((State)localObject).<init>("FAILED", i);
    FAILED = (State)localObject;
    localObject = new State[4];
    State localState = UNINITIATED;
    localObject[0] = localState;
    localState = CHALLENGE_RECEIVED;
    localObject[k] = localState;
    localState = TOKEN_GENERATED;
    localObject[j] = localState;
    localState = FAILED;
    localObject[i] = localState;
    $VALUES = (State[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\GGSSchemeBase$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */