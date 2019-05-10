package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderElementIterator
  implements HeaderElementIterator
{
  private CharArrayBuffer buffer = null;
  private HeaderElement currentElement = null;
  private ParserCursor cursor = null;
  private final HeaderIterator headerIt;
  private final HeaderValueParser parser;
  
  public BasicHeaderElementIterator(HeaderIterator paramHeaderIterator)
  {
    this(paramHeaderIterator, localBasicHeaderValueParser);
  }
  
  public BasicHeaderElementIterator(HeaderIterator paramHeaderIterator, HeaderValueParser paramHeaderValueParser)
  {
    Object localObject = (HeaderIterator)Args.notNull(paramHeaderIterator, "Header iterator");
    this.headerIt = ((HeaderIterator)localObject);
    localObject = (HeaderValueParser)Args.notNull(paramHeaderValueParser, "Parser");
    this.parser = ((HeaderValueParser)localObject);
  }
  
  private void bufferHeaderValue()
  {
    boolean bool = false;
    Object localObject1 = null;
    this.cursor = null;
    this.buffer = null;
    localObject1 = this.headerIt;
    bool = ((HeaderIterator)localObject1).hasNext();
    Object localObject2;
    int i;
    int j;
    if (bool)
    {
      localObject1 = this.headerIt;
      localObject2 = ((HeaderIterator)localObject1).nextHeader();
      bool = localObject2 instanceof FormattedHeader;
      if (!bool) {
        break label122;
      }
      localObject1 = localObject2;
      localObject1 = ((FormattedHeader)localObject2).getBuffer();
      this.buffer = ((CharArrayBuffer)localObject1);
      localObject1 = new org/apache/http/message/ParserCursor;
      CharArrayBuffer localCharArrayBuffer = this.buffer;
      i = localCharArrayBuffer.length();
      ((ParserCursor)localObject1).<init>(0, i);
      this.cursor = ((ParserCursor)localObject1);
      localObject1 = this.cursor;
      localObject2 = (FormattedHeader)localObject2;
      j = ((FormattedHeader)localObject2).getValuePos();
      ((ParserCursor)localObject1).updatePos(j);
    }
    for (;;)
    {
      return;
      label122:
      localObject1 = ((Header)localObject2).getValue();
      if (localObject1 == null) {
        break;
      }
      localObject2 = new org/apache/http/util/CharArrayBuffer;
      i = ((String)localObject1).length();
      ((CharArrayBuffer)localObject2).<init>(i);
      this.buffer = ((CharArrayBuffer)localObject2);
      this.buffer.append((String)localObject1);
      localObject1 = new org/apache/http/message/ParserCursor;
      localObject2 = this.buffer;
      j = ((CharArrayBuffer)localObject2).length();
      ((ParserCursor)localObject1).<init>(0, j);
      this.cursor = ((ParserCursor)localObject1);
    }
  }
  
  private void parseNextElement()
  {
    for (;;)
    {
      Object localObject1 = this.headerIt;
      boolean bool = ((HeaderIterator)localObject1).hasNext();
      if (!bool)
      {
        localObject1 = this.cursor;
        if (localObject1 == null) {}
      }
      else
      {
        localObject1 = this.cursor;
        if (localObject1 != null)
        {
          localObject1 = this.cursor;
          bool = ((ParserCursor)localObject1).atEnd();
          if (!bool) {}
        }
        else
        {
          bufferHeaderValue();
        }
        localObject1 = this.cursor;
        if (localObject1 == null) {
          continue;
        }
        Object localObject2;
        do
        {
          localObject1 = this.cursor;
          bool = ((ParserCursor)localObject1).atEnd();
          if (bool) {
            break label136;
          }
          localObject1 = this.parser;
          localObject2 = this.buffer;
          ParserCursor localParserCursor = this.cursor;
          localObject1 = ((HeaderValueParser)localObject1).parseHeaderElement((CharArrayBuffer)localObject2, localParserCursor);
          localObject2 = ((HeaderElement)localObject1).getName();
          int i = ((String)localObject2).length();
          if (i != 0) {
            break;
          }
          localObject2 = ((HeaderElement)localObject1).getValue();
        } while (localObject2 == null);
        this.currentElement = ((HeaderElement)localObject1);
      }
      return;
      label136:
      localObject1 = this.cursor;
      bool = ((ParserCursor)localObject1).atEnd();
      if (bool)
      {
        this.cursor = null;
        this.buffer = null;
      }
    }
  }
  
  public boolean hasNext()
  {
    HeaderElement localHeaderElement = this.currentElement;
    if (localHeaderElement == null) {
      parseNextElement();
    }
    localHeaderElement = this.currentElement;
    boolean bool;
    if (localHeaderElement != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localHeaderElement = null;
    }
  }
  
  public final Object next()
  {
    return nextElement();
  }
  
  public HeaderElement nextElement()
  {
    Object localObject = this.currentElement;
    if (localObject == null) {
      parseNextElement();
    }
    localObject = this.currentElement;
    if (localObject == null)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>("No more header elements available");
      throw ((Throwable)localObject);
    }
    localObject = this.currentElement;
    this.currentElement = null;
    return (HeaderElement)localObject;
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Remove not supported");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHeaderElementIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */