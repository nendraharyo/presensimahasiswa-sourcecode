package org.apache.http.entity.mime;

public class MinimalField
{
  private final String name;
  private final String value;
  
  public MinimalField(String paramString1, String paramString2)
  {
    this.name = paramString1;
    this.value = paramString2;
  }
  
  public String getBody()
  {
    return this.value;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.name;
    localStringBuilder.append(str);
    localStringBuilder.append(": ");
    str = this.value;
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\MinimalField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */