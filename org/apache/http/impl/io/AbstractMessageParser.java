package org.apache.http.impl.io;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageParser
  implements HttpMessageParser
{
  private static final int HEADERS = 1;
  private static final int HEAD_LINE;
  private final List headerLines;
  protected final LineParser lineParser;
  private HttpMessage message;
  private final MessageConstraints messageConstraints;
  private final SessionInputBuffer sessionBuffer;
  private int state;
  
  public AbstractMessageParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, MessageConstraints paramMessageConstraints)
  {
    Object localObject = (SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Session input buffer");
    this.sessionBuffer = ((SessionInputBuffer)localObject);
    if (paramLineParser != null)
    {
      this.lineParser = paramLineParser;
      if (paramMessageConstraints == null) {
        break label68;
      }
    }
    for (;;)
    {
      this.messageConstraints = paramMessageConstraints;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.headerLines = ((List)localObject);
      this.state = 0;
      return;
      paramLineParser = BasicLineParser.INSTANCE;
      break;
      label68:
      paramMessageConstraints = MessageConstraints.DEFAULT;
    }
  }
  
  public AbstractMessageParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpParams paramHttpParams)
  {
    Args.notNull(paramSessionInputBuffer, "Session input buffer");
    Args.notNull(paramHttpParams, "HTTP parameters");
    this.sessionBuffer = paramSessionInputBuffer;
    Object localObject = HttpParamConfig.getMessageConstraints(paramHttpParams);
    this.messageConstraints = ((MessageConstraints)localObject);
    if (paramLineParser != null) {}
    for (;;)
    {
      this.lineParser = paramLineParser;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.headerLines = ((List)localObject);
      this.state = 0;
      return;
      paramLineParser = BasicLineParser.INSTANCE;
    }
  }
  
  public static Header[] parseHeaders(SessionInputBuffer paramSessionInputBuffer, int paramInt1, int paramInt2, LineParser paramLineParser)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramLineParser != null) {}
    for (;;)
    {
      return parseHeaders(paramSessionInputBuffer, paramInt1, paramInt2, paramLineParser, localArrayList);
      paramLineParser = BasicLineParser.INSTANCE;
    }
  }
  
  public static Header[] parseHeaders(SessionInputBuffer paramSessionInputBuffer, int paramInt1, int paramInt2, LineParser paramLineParser, List paramList)
  {
    int i = 9;
    int j = 32;
    int k = 0;
    Args.notNull(paramSessionInputBuffer, "Session input buffer");
    Args.notNull(paramLineParser, "Line parser");
    Args.notNull(paramList, "Header line list");
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    Object localObject3;
    for (Object localObject2 = null;; localObject2 = localObject3)
    {
      if (localObject2 == null)
      {
        localObject2 = new org/apache/http/util/CharArrayBuffer;
        i1 = 64;
        ((CharArrayBuffer)localObject2).<init>(i1);
      }
      for (;;)
      {
        i1 = paramSessionInputBuffer.readLine((CharArrayBuffer)localObject2);
        int i3 = -1;
        if (i1 != i3)
        {
          i1 = ((CharArrayBuffer)localObject2).length();
          int i4 = 1;
          if (i1 >= i4) {
            break;
          }
        }
        n = paramList.size();
        localObject3 = new Header[n];
        for (;;)
        {
          n = paramList.size();
          if (k >= n) {
            break;
          }
          localObject2 = (CharArrayBuffer)paramList.get(k);
          try
          {
            localObject2 = paramLineParser.parseHeader((CharArrayBuffer)localObject2);
            localObject3[k] = localObject2;
            k += 1;
          }
          catch (ParseException localParseException)
          {
            int i2;
            int i6;
            localObject3 = new org/apache/http/ProtocolException;
            String str = localParseException.getMessage();
            ((ProtocolException)localObject3).<init>(str);
            throw ((Throwable)localObject3);
          }
        }
        ((CharArrayBuffer)localObject2).clear();
      }
      int i1 = ((CharArrayBuffer)localObject2).charAt(0);
      if (i1 != j)
      {
        i2 = ((CharArrayBuffer)localObject2).charAt(0);
        if (i2 != i) {}
      }
      else if (localObject1 != null)
      {
        i2 = 0;
        localObject3 = null;
        for (;;)
        {
          int i5 = ((CharArrayBuffer)localObject2).length();
          if (i2 < i5)
          {
            i5 = ((CharArrayBuffer)localObject2).charAt(i2);
            if ((i5 == j) || (i5 == i)) {}
          }
          else
          {
            if (paramInt2 <= 0) {
              break;
            }
            i6 = ((CharArrayBuffer)localObject1).length() + 1;
            int i7 = ((CharArrayBuffer)localObject2).length();
            i6 = i6 + i7 - i2;
            if (i6 <= paramInt2) {
              break;
            }
            localObject2 = new org/apache/http/MessageConstraintException;
            ((MessageConstraintException)localObject2).<init>("Maximum line length limit exceeded");
            throw ((Throwable)localObject2);
          }
          i2 += 1;
        }
        ((CharArrayBuffer)localObject1).append(j);
        i6 = ((CharArrayBuffer)localObject2).length() - i2;
        ((CharArrayBuffer)localObject1).append((CharArrayBuffer)localObject2, i2, i6);
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      while (paramInt1 > 0)
      {
        m = paramList.size();
        if (m < paramInt1) {
          break;
        }
        localObject2 = new org/apache/http/MessageConstraintException;
        ((MessageConstraintException)localObject2).<init>("Maximum header count exceeded");
        throw ((Throwable)localObject2);
        paramList.add(localObject2);
        i2 = 0;
        localObject3 = null;
      }
      localObject1 = localObject2;
    }
    return (Header[])localObject3;
  }
  
  public HttpMessage parse()
  {
    int i = this.state;
    Object localObject;
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Inconsistent parser state");
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.sessionBuffer;
      localObject = parseHead((SessionInputBuffer)localObject);
      this.message = ((HttpMessage)localObject);
      i = 1;
      this.state = i;
      localObject = this.sessionBuffer;
      int j = this.messageConstraints.getMaxHeaderCount();
      int k = this.messageConstraints.getMaxLineLength();
      LineParser localLineParser = this.lineParser;
      List localList = this.headerLines;
      localObject = parseHeaders((SessionInputBuffer)localObject, j, k, localLineParser, localList);
      this.message.setHeaders((Header[])localObject);
      localObject = this.message;
      this.message = null;
      this.headerLines.clear();
      this.state = 0;
      return (HttpMessage)localObject;
    }
    catch (ParseException localParseException)
    {
      ProtocolException localProtocolException = new org/apache/http/ProtocolException;
      String str = localParseException.getMessage();
      localProtocolException.<init>(str, localParseException);
      throw localProtocolException;
    }
  }
  
  protected abstract HttpMessage parseHead(SessionInputBuffer paramSessionInputBuffer);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\AbstractMessageParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */