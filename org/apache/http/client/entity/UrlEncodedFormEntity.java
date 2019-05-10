package org.apache.http.client.entity;

import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

public class UrlEncodedFormEntity
  extends StringEntity
{
  public UrlEncodedFormEntity(Iterable paramIterable)
  {
    this(paramIterable, null);
  }
  
  public UrlEncodedFormEntity(Iterable paramIterable, Charset paramCharset) {}
  
  public UrlEncodedFormEntity(List paramList)
  {
    this(paramList, null);
  }
  
  public UrlEncodedFormEntity(List paramList, String paramString) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\UrlEncodedFormEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */