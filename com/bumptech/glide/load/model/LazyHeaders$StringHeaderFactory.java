package com.bumptech.glide.load.model;

final class LazyHeaders$StringHeaderFactory
  implements LazyHeaderFactory
{
  private final String value;
  
  LazyHeaders$StringHeaderFactory(String paramString)
  {
    this.value = paramString;
  }
  
  public String buildHeader()
  {
    return this.value;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof StringHeaderFactory;
    String str1;
    if (bool)
    {
      paramObject = (StringHeaderFactory)paramObject;
      str1 = this.value;
      String str2 = ((StringHeaderFactory)paramObject).value;
      bool = str1.equals(str2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.value.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("StringHeaderFactory{value='");
    String str = this.value;
    return str + '\'' + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\LazyHeaders$StringHeaderFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */