package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class BasicHeaderElement
  implements Cloneable, HeaderElement
{
  private final String name;
  private final NameValuePair[] parameters;
  private final String value;
  
  public BasicHeaderElement(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }
  
  public BasicHeaderElement(String paramString1, String paramString2, NameValuePair[] paramArrayOfNameValuePair)
  {
    Object localObject = (String)Args.notNull(paramString1, "Name");
    this.name = ((String)localObject);
    this.value = paramString2;
    if (paramArrayOfNameValuePair != null) {}
    for (this.parameters = paramArrayOfNameValuePair;; this.parameters = ((NameValuePair[])localObject))
    {
      return;
      localObject = new NameValuePair[0];
    }
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
      boolean bool2 = paramObject instanceof HeaderElement;
      if (bool2)
      {
        paramObject = (BasicHeaderElement)paramObject;
        Object localObject1 = this.name;
        Object localObject2 = ((BasicHeaderElement)paramObject).name;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.value;
          localObject2 = ((BasicHeaderElement)paramObject).value;
          bool2 = LangUtils.equals(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.parameters;
            localObject2 = ((BasicHeaderElement)paramObject).parameters;
            bool2 = LangUtils.equals((Object[])localObject1, (Object[])localObject2);
            if (bool2) {
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
  
  public String getName()
  {
    return this.name;
  }
  
  public NameValuePair getParameter(int paramInt)
  {
    return this.parameters[paramInt];
  }
  
  public NameValuePair getParameterByName(String paramString)
  {
    Args.notNull(paramString, "Name");
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int i = arrayOfNameValuePair.length;
    int j = 0;
    NameValuePair localNameValuePair = null;
    int k = 0;
    if (k < i)
    {
      localNameValuePair = arrayOfNameValuePair[k];
      String str = localNameValuePair.getName();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return localNameValuePair;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localNameValuePair = null;
    }
  }
  
  public int getParameterCount()
  {
    return this.parameters.length;
  }
  
  public NameValuePair[] getParameters()
  {
    return (NameValuePair[])this.parameters.clone();
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
    int j = LangUtils.hashCode(i, str);
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int k = arrayOfNameValuePair.length;
    i = 0;
    while (i < k)
    {
      NameValuePair localNameValuePair = arrayOfNameValuePair[i];
      j = LangUtils.hashCode(j, localNameValuePair);
      i += 1;
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = this.name;
    localStringBuilder.append(str1);
    str1 = this.value;
    if (str1 != null)
    {
      localStringBuilder.append("=");
      str1 = this.value;
      localStringBuilder.append(str1);
    }
    NameValuePair[] arrayOfNameValuePair = this.parameters;
    int i = arrayOfNameValuePair.length;
    int j = 0;
    str1 = null;
    while (j < i)
    {
      NameValuePair localNameValuePair = arrayOfNameValuePair[j];
      String str2 = "; ";
      localStringBuilder.append(str2);
      localStringBuilder.append(localNameValuePair);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeaderElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */