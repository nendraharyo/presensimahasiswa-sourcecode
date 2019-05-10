package org.apache.http.impl.auth;

 enum NTLMScheme$State
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("UNINITIATED", 0);
    UNINITIATED = (State)localObject;
    localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("CHALLENGE_RECEIVED", m);
    CHALLENGE_RECEIVED = (State)localObject;
    localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("MSG_TYPE1_GENERATED", k);
    MSG_TYPE1_GENERATED = (State)localObject;
    localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("MSG_TYPE2_RECEVIED", j);
    MSG_TYPE2_RECEVIED = (State)localObject;
    localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("MSG_TYPE3_GENERATED", i);
    MSG_TYPE3_GENERATED = (State)localObject;
    localObject = new org/apache/http/impl/auth/NTLMScheme$State;
    ((State)localObject).<init>("FAILED", 5);
    FAILED = (State)localObject;
    localObject = new State[6];
    State localState1 = UNINITIATED;
    localObject[0] = localState1;
    localState1 = CHALLENGE_RECEIVED;
    localObject[m] = localState1;
    localState1 = MSG_TYPE1_GENERATED;
    localObject[k] = localState1;
    localState1 = MSG_TYPE2_RECEVIED;
    localObject[j] = localState1;
    localState1 = MSG_TYPE3_GENERATED;
    localObject[i] = localState1;
    State localState2 = FAILED;
    localObject[5] = localState2;
    $VALUES = (State[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMScheme$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */