package org.apache.http.io;

import org.apache.http.config.MessageConstraints;

public abstract interface HttpMessageParserFactory
{
  public abstract HttpMessageParser create(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\io\HttpMessageParserFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */