package org.apache.http.impl.cookie;

public enum BrowserCompatSpecFactory$SecurityLevel
{
  static
  {
    int i = 1;
    Object localObject = new org/apache/http/impl/cookie/BrowserCompatSpecFactory$SecurityLevel;
    ((SecurityLevel)localObject).<init>("SECURITYLEVEL_DEFAULT", 0);
    SECURITYLEVEL_DEFAULT = (SecurityLevel)localObject;
    localObject = new org/apache/http/impl/cookie/BrowserCompatSpecFactory$SecurityLevel;
    ((SecurityLevel)localObject).<init>("SECURITYLEVEL_IE_MEDIUM", i);
    SECURITYLEVEL_IE_MEDIUM = (SecurityLevel)localObject;
    localObject = new SecurityLevel[2];
    SecurityLevel localSecurityLevel = SECURITYLEVEL_DEFAULT;
    localObject[0] = localSecurityLevel;
    localSecurityLevel = SECURITYLEVEL_IE_MEDIUM;
    localObject[i] = localSecurityLevel;
    $VALUES = (SecurityLevel[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BrowserCompatSpecFactory$SecurityLevel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */