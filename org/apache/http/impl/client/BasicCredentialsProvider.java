package org.apache.http.impl.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.util.Args;

public class BasicCredentialsProvider
  implements CredentialsProvider
{
  private final ConcurrentHashMap credMap;
  
  public BasicCredentialsProvider()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.credMap = localConcurrentHashMap;
  }
  
  private static Credentials matchCredentials(Map paramMap, AuthScope paramAuthScope)
  {
    Credentials localCredentials = (Credentials)paramMap.get(paramAuthScope);
    int i;
    Object localObject1;
    Object localObject2;
    int k;
    if (localCredentials == null)
    {
      i = -1;
      j = 0;
      localObject1 = null;
      localObject2 = paramMap.keySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = (AuthScope)localIterator.next();
        k = paramAuthScope.match((AuthScope)localObject2);
        if (k <= i) {
          break label113;
        }
      }
    }
    for (int j = k;; j = i)
    {
      i = j;
      localObject1 = localObject2;
      break;
      if (localObject1 != null) {
        localCredentials = (Credentials)paramMap.get(localObject1);
      }
      return localCredentials;
      label113:
      localObject2 = localObject1;
    }
  }
  
  public void clear()
  {
    this.credMap.clear();
  }
  
  public Credentials getCredentials(AuthScope paramAuthScope)
  {
    Args.notNull(paramAuthScope, "Authentication scope");
    return matchCredentials(this.credMap, paramAuthScope);
  }
  
  public void setCredentials(AuthScope paramAuthScope, Credentials paramCredentials)
  {
    Args.notNull(paramAuthScope, "Authentication scope");
    this.credMap.put(paramAuthScope, paramCredentials);
  }
  
  public String toString()
  {
    return this.credMap.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\BasicCredentialsProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */