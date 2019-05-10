package org.apache.http.auth;

public enum ChallengeState
{
  static
  {
    int i = 1;
    Object localObject = new org/apache/http/auth/ChallengeState;
    ((ChallengeState)localObject).<init>("TARGET", 0);
    TARGET = (ChallengeState)localObject;
    localObject = new org/apache/http/auth/ChallengeState;
    ((ChallengeState)localObject).<init>("PROXY", i);
    PROXY = (ChallengeState)localObject;
    localObject = new ChallengeState[2];
    ChallengeState localChallengeState = TARGET;
    localObject[0] = localChallengeState;
    localChallengeState = PROXY;
    localObject[i] = localChallengeState;
    $VALUES = (ChallengeState[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\ChallengeState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */