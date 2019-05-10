package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeader
  implements Serializable, Cloneable, Header
{
  private static final long serialVersionUID = -5427236326487562174L;
  private final String name;
  private final String value;
  
  public BasicHeader(String paramString1, String paramString2)
  {
    String str = (String)Args.notNull(paramString1, "Name");
    this.name = str;
    this.value = paramString2;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public HeaderElement[] getElements()
  {
    Object localObject = this.value;
    if (localObject != null) {}
    for (localObject = BasicHeaderValueParser.parseElements(this.value, null);; localObject = new HeaderElement[0]) {
      return (HeaderElement[])localObject;
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
  
  public String toString()
  {
    return BasicLineFormatter.INSTANCE.formatHeader(null, this).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */