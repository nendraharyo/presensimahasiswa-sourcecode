package org.apache.http.config;

public class MessageConstraints$Builder
{
  private int maxHeaderCount;
  private int maxLineLength;
  
  MessageConstraints$Builder()
  {
    this.maxLineLength = i;
    this.maxHeaderCount = i;
  }
  
  public MessageConstraints build()
  {
    MessageConstraints localMessageConstraints = new org/apache/http/config/MessageConstraints;
    int i = this.maxLineLength;
    int j = this.maxHeaderCount;
    localMessageConstraints.<init>(i, j);
    return localMessageConstraints;
  }
  
  public Builder setMaxHeaderCount(int paramInt)
  {
    this.maxHeaderCount = paramInt;
    return this;
  }
  
  public Builder setMaxLineLength(int paramInt)
  {
    this.maxLineLength = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\MessageConstraints$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */