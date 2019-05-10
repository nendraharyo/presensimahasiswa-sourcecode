package org.apache.http.conn.scheme;

import java.util.Locale;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public final class Scheme
{
  private final int defaultPort;
  private final boolean layered;
  private final String name;
  private final SchemeSocketFactory socketFactory;
  private String stringRep;
  
  public Scheme(String paramString, int paramInt, SchemeSocketFactory paramSchemeSocketFactory)
  {
    Object localObject = "Scheme name";
    Args.notNull(paramString, (String)localObject);
    boolean bool;
    if (paramInt > 0)
    {
      int j = (char)-1;
      if (paramInt <= j)
      {
        j = i;
        String str = "Port is invalid";
        Args.check(j, str);
        Args.notNull(paramSchemeSocketFactory, "Socket factory");
        localObject = Locale.ENGLISH;
        localObject = paramString.toLowerCase((Locale)localObject);
        this.name = ((String)localObject);
        this.defaultPort = paramInt;
        bool = paramSchemeSocketFactory instanceof SchemeLayeredSocketFactory;
        if (!bool) {
          break label113;
        }
        this.layered = i;
        this.socketFactory = ((SchemeSocketFactory)paramSchemeSocketFactory);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label113:
      bool = paramSchemeSocketFactory instanceof LayeredSchemeSocketFactory;
      if (bool)
      {
        this.layered = i;
        localObject = new org/apache/http/conn/scheme/SchemeLayeredSocketFactoryAdaptor2;
        paramSchemeSocketFactory = (LayeredSchemeSocketFactory)paramSchemeSocketFactory;
        ((SchemeLayeredSocketFactoryAdaptor2)localObject).<init>(paramSchemeSocketFactory);
        this.socketFactory = ((SchemeSocketFactory)localObject);
      }
      else
      {
        this.layered = false;
        this.socketFactory = paramSchemeSocketFactory;
      }
    }
  }
  
  public Scheme(String paramString, SocketFactory paramSocketFactory, int paramInt)
  {
    Args.notNull(paramString, "Scheme name");
    Object localObject = "Socket factory";
    Args.notNull(paramSocketFactory, (String)localObject);
    boolean bool;
    if (paramInt > 0)
    {
      int j = (char)-1;
      if (paramInt <= j)
      {
        j = i;
        String str = "Port is invalid";
        Args.check(j, str);
        localObject = Locale.ENGLISH;
        localObject = paramString.toLowerCase((Locale)localObject);
        this.name = ((String)localObject);
        bool = paramSocketFactory instanceof LayeredSocketFactory;
        if (!bool) {
          break label127;
        }
        localObject = new org/apache/http/conn/scheme/SchemeLayeredSocketFactoryAdaptor;
        paramSocketFactory = (LayeredSocketFactory)paramSocketFactory;
        ((SchemeLayeredSocketFactoryAdaptor)localObject).<init>(paramSocketFactory);
        this.socketFactory = ((SchemeSocketFactory)localObject);
      }
    }
    for (this.layered = i;; this.layered = false)
    {
      this.defaultPort = paramInt;
      return;
      bool = false;
      localObject = null;
      break;
      label127:
      localObject = new org/apache/http/conn/scheme/SchemeSocketFactoryAdaptor;
      ((SchemeSocketFactoryAdaptor)localObject).<init>(paramSocketFactory);
      this.socketFactory = ((SchemeSocketFactory)localObject);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Scheme;
      if (bool2)
      {
        paramObject = (Scheme)paramObject;
        String str1 = this.name;
        String str2 = ((Scheme)paramObject).name;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.defaultPort;
          int j = ((Scheme)paramObject).defaultPort;
          if (i == j)
          {
            boolean bool3 = this.layered;
            boolean bool4 = ((Scheme)paramObject).layered;
            if (bool3 == bool4) {
              continue;
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final int getDefaultPort()
  {
    return this.defaultPort;
  }
  
  public final String getName()
  {
    return this.name;
  }
  
  public final SchemeSocketFactory getSchemeSocketFactory()
  {
    return this.socketFactory;
  }
  
  public final SocketFactory getSocketFactory()
  {
    Object localObject1 = this.socketFactory;
    boolean bool = localObject1 instanceof SchemeSocketFactoryAdaptor;
    if (bool) {
      localObject1 = ((SchemeSocketFactoryAdaptor)this.socketFactory).getFactory();
    }
    for (;;)
    {
      return (SocketFactory)localObject1;
      bool = this.layered;
      Object localObject2;
      if (bool)
      {
        localObject2 = new org/apache/http/conn/scheme/LayeredSocketFactoryAdaptor;
        localObject1 = (LayeredSchemeSocketFactory)this.socketFactory;
        ((LayeredSocketFactoryAdaptor)localObject2).<init>((LayeredSchemeSocketFactory)localObject1);
        localObject1 = localObject2;
      }
      else
      {
        localObject1 = new org/apache/http/conn/scheme/SocketFactoryAdaptor;
        localObject2 = this.socketFactory;
        ((SocketFactoryAdaptor)localObject1).<init>((SchemeSocketFactory)localObject2);
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.defaultPort;
    int j = LangUtils.hashCode(17, i);
    String str = this.name;
    j = LangUtils.hashCode(j, str);
    boolean bool = this.layered;
    return LangUtils.hashCode(j, bool);
  }
  
  public final boolean isLayered()
  {
    return this.layered;
  }
  
  public final int resolvePort(int paramInt)
  {
    if (paramInt <= 0) {
      paramInt = this.defaultPort;
    }
    return paramInt;
  }
  
  public final String toString()
  {
    Object localObject = this.stringRep;
    if (localObject == null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.name;
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(':');
      int i = this.defaultPort;
      str = Integer.toString(i);
      ((StringBuilder)localObject).append(str);
      localObject = ((StringBuilder)localObject).toString();
      this.stringRep = ((String)localObject);
    }
    return this.stringRep;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\scheme\Scheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */