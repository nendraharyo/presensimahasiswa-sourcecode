package org.apache.http.auth;

import org.apache.http.util.Args;

public final class AuthOption
{
  private final AuthScheme authScheme;
  private final Credentials creds;
  
  public AuthOption(AuthScheme paramAuthScheme, Credentials paramCredentials)
  {
    Args.notNull(paramAuthScheme, "Auth scheme");
    Args.notNull(paramCredentials, "User credentials");
    this.authScheme = paramAuthScheme;
    this.creds = paramCredentials;
  }
  
  public AuthScheme getAuthScheme()
  {
    return this.authScheme;
  }
  
  public Credentials getCredentials()
  {
    return this.creds;
  }
  
  public String toString()
  {
    return this.authScheme.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthOption.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */