package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.FormattedHeader;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BufferedHeader
  implements Serializable, Cloneable, FormattedHeader
{
  private static final long serialVersionUID = -2768352615787625448L;
  private final CharArrayBuffer buffer;
  private final String name;
  private final int valuePos;
  
  public BufferedHeader(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject1 = "Char array buffer";
    Args.notNull(paramCharArrayBuffer, (String)localObject1);
    int i = paramCharArrayBuffer.indexOf(58);
    int j = -1;
    String str;
    if (i == j)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid header: ");
      str = paramCharArrayBuffer.toString();
      localObject2 = str;
      ((ParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = 0;
    Object localObject2 = paramCharArrayBuffer.substringTrimmed(0, i);
    int k = ((String)localObject2).length();
    if (k == 0)
    {
      localObject1 = new org/apache/http/ParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid header: ");
      str = paramCharArrayBuffer.toString();
      localObject2 = str;
      ((ParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.buffer = paramCharArrayBuffer;
    this.name = ((String)localObject2);
    i += 1;
    this.valuePos = i;
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public CharArrayBuffer getBuffer()
  {
    return this.buffer;
  }
  
  public HeaderElement[] getElements()
  {
    ParserCursor localParserCursor = new org/apache/http/message/ParserCursor;
    int i = this.buffer.length();
    localParserCursor.<init>(0, i);
    int j = this.valuePos;
    localParserCursor.updatePos(j);
    BasicHeaderValueParser localBasicHeaderValueParser = BasicHeaderValueParser.INSTANCE;
    CharArrayBuffer localCharArrayBuffer = this.buffer;
    return localBasicHeaderValueParser.parseElements(localCharArrayBuffer, localParserCursor);
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getValue()
  {
    CharArrayBuffer localCharArrayBuffer = this.buffer;
    int i = this.valuePos;
    int j = this.buffer.length();
    return localCharArrayBuffer.substringTrimmed(i, j);
  }
  
  public int getValuePos()
  {
    return this.valuePos;
  }
  
  public String toString()
  {
    return this.buffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BufferedHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */