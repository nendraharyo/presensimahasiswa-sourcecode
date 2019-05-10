package org.apache.http;

import java.io.Serializable;
import org.apache.http.util.Args;

public class ProtocolVersion
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = 8950662842175091068L;
  protected final int major;
  protected final int minor;
  protected final String protocol;
  
  public ProtocolVersion(String paramString, int paramInt1, int paramInt2)
  {
    String str = (String)Args.notNull(paramString, "Protocol name");
    this.protocol = str;
    int i = Args.notNegative(paramInt1, "Protocol minor version");
    this.major = i;
    i = Args.notNegative(paramInt2, "Protocol minor version");
    this.minor = i;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public int compareToVersion(ProtocolVersion paramProtocolVersion)
  {
    Args.notNull(paramProtocolVersion, "Protocol version");
    String str1 = this.protocol;
    String str2 = paramProtocolVersion.protocol;
    boolean bool = str1.equals(str2);
    str2 = "Versions for different protocols cannot be compared: %s %s";
    int j = 2;
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = this;
    int k = 1;
    arrayOfObject[k] = paramProtocolVersion;
    Args.check(bool, str2, arrayOfObject);
    int i = getMajor();
    int m = paramProtocolVersion.getMajor();
    i -= m;
    if (i == 0)
    {
      i = getMinor();
      m = paramProtocolVersion.getMinor();
      i -= m;
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ProtocolVersion;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ProtocolVersion)paramObject;
        String str1 = this.protocol;
        String str2 = ((ProtocolVersion)paramObject).protocol;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          int i = this.major;
          int j = ((ProtocolVersion)paramObject).major;
          if (i == j)
          {
            i = this.minor;
            j = ((ProtocolVersion)paramObject).minor;
            if (i == j) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public ProtocolVersion forVersion(int paramInt1, int paramInt2)
  {
    int i = this.major;
    if (paramInt1 == i)
    {
      i = this.minor;
      if (paramInt2 != i) {}
    }
    for (;;)
    {
      return this;
      ProtocolVersion localProtocolVersion = new org/apache/http/ProtocolVersion;
      String str = this.protocol;
      localProtocolVersion.<init>(str, paramInt1, paramInt2);
      this = localProtocolVersion;
    }
  }
  
  public final int getMajor()
  {
    return this.major;
  }
  
  public final int getMinor()
  {
    return this.minor;
  }
  
  public final String getProtocol()
  {
    return this.protocol;
  }
  
  public final boolean greaterEquals(ProtocolVersion paramProtocolVersion)
  {
    boolean bool = isComparable(paramProtocolVersion);
    if (bool)
    {
      i = compareToVersion(paramProtocolVersion);
      if (i < 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public final int hashCode()
  {
    int i = this.protocol.hashCode();
    int j = this.major * 100000;
    i ^= j;
    j = this.minor;
    return i ^ j;
  }
  
  public boolean isComparable(ProtocolVersion paramProtocolVersion)
  {
    String str1;
    boolean bool;
    if (paramProtocolVersion != null)
    {
      str1 = this.protocol;
      String str2 = paramProtocolVersion.protocol;
      bool = str1.equals(str2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public final boolean lessEquals(ProtocolVersion paramProtocolVersion)
  {
    boolean bool = isComparable(paramProtocolVersion);
    if (bool)
    {
      i = compareToVersion(paramProtocolVersion);
      if (i > 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.protocol;
    localStringBuilder.append(str);
    localStringBuilder.append('/');
    str = Integer.toString(this.major);
    localStringBuilder.append(str);
    localStringBuilder.append('.');
    str = Integer.toString(this.minor);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\ProtocolVersion.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */