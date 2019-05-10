package org.apache.http.auth;

import java.util.Queue;
import org.apache.http.util.Args;

public class AuthState
{
  private Queue authOptions;
  private AuthScheme authScheme;
  private AuthScope authScope;
  private Credentials credentials;
  private AuthProtocolState state;
  
  public AuthState()
  {
    AuthProtocolState localAuthProtocolState = AuthProtocolState.UNCHALLENGED;
    this.state = localAuthProtocolState;
  }
  
  public Queue getAuthOptions()
  {
    return this.authOptions;
  }
  
  public AuthScheme getAuthScheme()
  {
    return this.authScheme;
  }
  
  public AuthScope getAuthScope()
  {
    return this.authScope;
  }
  
  public Credentials getCredentials()
  {
    return this.credentials;
  }
  
  public AuthProtocolState getState()
  {
    return this.state;
  }
  
  public boolean hasAuthOptions()
  {
    Queue localQueue = this.authOptions;
    boolean bool;
    if (localQueue != null)
    {
      localQueue = this.authOptions;
      bool = localQueue.isEmpty();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localQueue = null;
    }
  }
  
  public void invalidate()
  {
    reset();
  }
  
  public boolean isValid()
  {
    AuthScheme localAuthScheme = this.authScheme;
    boolean bool;
    if (localAuthScheme != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAuthScheme = null;
    }
  }
  
  public void reset()
  {
    AuthProtocolState localAuthProtocolState = AuthProtocolState.UNCHALLENGED;
    this.state = localAuthProtocolState;
    this.authOptions = null;
    this.authScheme = null;
    this.authScope = null;
    this.credentials = null;
  }
  
  public void setAuthScheme(AuthScheme paramAuthScheme)
  {
    if (paramAuthScheme == null) {
      reset();
    }
    for (;;)
    {
      return;
      this.authScheme = paramAuthScheme;
    }
  }
  
  public void setAuthScope(AuthScope paramAuthScope)
  {
    this.authScope = paramAuthScope;
  }
  
  public void setCredentials(Credentials paramCredentials)
  {
    this.credentials = paramCredentials;
  }
  
  public void setState(AuthProtocolState paramAuthProtocolState)
  {
    if (paramAuthProtocolState != null) {}
    for (;;)
    {
      this.state = paramAuthProtocolState;
      return;
      paramAuthProtocolState = AuthProtocolState.UNCHALLENGED;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = localStringBuilder.append("state:");
    Object localObject2 = this.state;
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = ";";
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.authScheme;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("auth scheme:");
      localObject2 = this.authScheme.getSchemeName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ";";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject1 = this.credentials;
    if (localObject1 != null)
    {
      localObject1 = "credentials present";
      localStringBuilder.append((String)localObject1);
    }
    return localStringBuilder.toString();
  }
  
  public void update(Queue paramQueue)
  {
    Args.notEmpty(paramQueue, "Queue of auth options");
    this.authOptions = paramQueue;
    this.authScheme = null;
    this.credentials = null;
  }
  
  public void update(AuthScheme paramAuthScheme, Credentials paramCredentials)
  {
    Args.notNull(paramAuthScheme, "Auth scheme");
    Args.notNull(paramCredentials, "Credentials");
    this.authScheme = paramAuthScheme;
    this.credentials = paramCredentials;
    this.authOptions = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */