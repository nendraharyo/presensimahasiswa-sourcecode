package org.apache.http.config;

import org.apache.http.util.Args;

public class MessageConstraints
  implements Cloneable
{
  public static final MessageConstraints DEFAULT;
  private final int maxHeaderCount;
  private final int maxLineLength;
  
  static
  {
    MessageConstraints.Builder localBuilder = new org/apache/http/config/MessageConstraints$Builder;
    localBuilder.<init>();
    DEFAULT = localBuilder.build();
  }
  
  MessageConstraints(int paramInt1, int paramInt2)
  {
    this.maxLineLength = paramInt1;
    this.maxHeaderCount = paramInt2;
  }
  
  public static MessageConstraints.Builder copy(MessageConstraints paramMessageConstraints)
  {
    Args.notNull(paramMessageConstraints, "Message constraints");
    MessageConstraints.Builder localBuilder = new org/apache/http/config/MessageConstraints$Builder;
    localBuilder.<init>();
    int i = paramMessageConstraints.getMaxHeaderCount();
    localBuilder = localBuilder.setMaxHeaderCount(i);
    i = paramMessageConstraints.getMaxLineLength();
    return localBuilder.setMaxLineLength(i);
  }
  
  public static MessageConstraints.Builder custom()
  {
    MessageConstraints.Builder localBuilder = new org/apache/http/config/MessageConstraints$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static MessageConstraints lineLen(int paramInt)
  {
    MessageConstraints localMessageConstraints = new org/apache/http/config/MessageConstraints;
    int i = Args.notNegative(paramInt, "Max line length");
    localMessageConstraints.<init>(i, -1);
    return localMessageConstraints;
  }
  
  protected MessageConstraints clone()
  {
    return (MessageConstraints)super.clone();
  }
  
  public int getMaxHeaderCount()
  {
    return this.maxHeaderCount;
  }
  
  public int getMaxLineLength()
  {
    return this.maxLineLength;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[maxLineLength=");
    int i = this.maxLineLength;
    localStringBuilder2 = localStringBuilder2.append(i).append(", maxHeaderCount=");
    i = this.maxHeaderCount;
    localStringBuilder2.append(i).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\MessageConstraints.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */