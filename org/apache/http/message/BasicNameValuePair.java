package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class BasicNameValuePair
  implements Serializable, Cloneable, NameValuePair
{
  private static final long serialVersionUID = -6437800749411518984L;
  private final String name;
  private final String value;
  
  public BasicNameValuePair(String paramString1, String paramString2)
  {
    String str = (String)Args.notNull(paramString1, "Name");
    this.name = str;
    this.value = paramString2;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof NameValuePair;
      if (bool2)
      {
        paramObject = (BasicNameValuePair)paramObject;
        String str1 = this.name;
        String str2 = ((BasicNameValuePair)paramObject).name;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          str1 = this.value;
          str2 = ((BasicNameValuePair)paramObject).value;
          bool2 = LangUtils.equals(str1, str2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    String str = this.name;
    int i = LangUtils.hashCode(17, str);
    str = this.value;
    return LangUtils.hashCode(i, str);
  }
  
  public String toString()
  {
    String str = this.value;
    if (str == null) {}
    StringBuilder localStringBuilder;
    for (str = this.name;; str = localStringBuilder.toString())
    {
      return str;
      int i = this.name.length() + 1;
      int j = this.value.length();
      i += j;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      str = this.name;
      localStringBuilder.append(str);
      localStringBuilder.append("=");
      str = this.value;
      localStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicNameValuePair.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */