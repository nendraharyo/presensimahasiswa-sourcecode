package org.apache.http.impl.cookie;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

public class BasicClientCookie
  implements Serializable, Cloneable, ClientCookie, SetCookie
{
  private static final long serialVersionUID = -3869795591041535538L;
  private Map attribs;
  private String cookieComment;
  private String cookieDomain;
  private Date cookieExpiryDate;
  private String cookiePath;
  private int cookieVersion;
  private boolean isSecure;
  private final String name;
  private String value;
  
  public BasicClientCookie(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Name");
    this.name = paramString1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.attribs = localHashMap;
    this.value = paramString2;
  }
  
  public Object clone()
  {
    BasicClientCookie localBasicClientCookie = (BasicClientCookie)super.clone();
    HashMap localHashMap = new java/util/HashMap;
    Map localMap = this.attribs;
    localHashMap.<init>(localMap);
    localBasicClientCookie.attribs = localHashMap;
    return localBasicClientCookie;
  }
  
  public boolean containsAttribute(String paramString)
  {
    Object localObject = this.attribs.get(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public String getAttribute(String paramString)
  {
    return (String)this.attribs.get(paramString);
  }
  
  public String getComment()
  {
    return this.cookieComment;
  }
  
  public String getCommentURL()
  {
    return null;
  }
  
  public String getDomain()
  {
    return this.cookieDomain;
  }
  
  public Date getExpiryDate()
  {
    return this.cookieExpiryDate;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPath()
  {
    return this.cookiePath;
  }
  
  public int[] getPorts()
  {
    return null;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public int getVersion()
  {
    return this.cookieVersion;
  }
  
  public boolean isExpired(Date paramDate)
  {
    Args.notNull(paramDate, "Date");
    Date localDate = this.cookieExpiryDate;
    boolean bool;
    if (localDate != null)
    {
      localDate = this.cookieExpiryDate;
      long l1 = localDate.getTime();
      long l2 = paramDate.getTime();
      bool = l1 < l2;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDate = null;
    }
  }
  
  public boolean isPersistent()
  {
    Date localDate = this.cookieExpiryDate;
    boolean bool;
    if (localDate != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDate = null;
    }
  }
  
  public boolean isSecure()
  {
    return this.isSecure;
  }
  
  public void setAttribute(String paramString1, String paramString2)
  {
    this.attribs.put(paramString1, paramString2);
  }
  
  public void setComment(String paramString)
  {
    this.cookieComment = paramString;
  }
  
  public void setDomain(String paramString)
  {
    Object localObject;
    if (paramString != null)
    {
      localObject = Locale.ENGLISH;
      localObject = paramString.toLowerCase((Locale)localObject);
    }
    for (this.cookieDomain = ((String)localObject);; this.cookieDomain = null)
    {
      return;
      localObject = null;
    }
  }
  
  public void setExpiryDate(Date paramDate)
  {
    this.cookieExpiryDate = paramDate;
  }
  
  public void setPath(String paramString)
  {
    this.cookiePath = paramString;
  }
  
  public void setSecure(boolean paramBoolean)
  {
    this.isSecure = paramBoolean;
  }
  
  public void setValue(String paramString)
  {
    this.value = paramString;
  }
  
  public void setVersion(int paramInt)
  {
    this.cookieVersion = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[version: ");
    Object localObject = Integer.toString(this.cookieVersion);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[name: ");
    localObject = this.name;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[value: ");
    localObject = this.value;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[domain: ");
    localObject = this.cookieDomain;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[path: ");
    localObject = this.cookiePath;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("]");
    localStringBuilder.append("[expiry: ");
    localObject = this.cookieExpiryDate;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicClientCookie.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */