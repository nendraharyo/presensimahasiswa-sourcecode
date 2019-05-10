package com.bumptech.glide.util;

public class MultiClassKey
{
  private Class first;
  private Class second;
  private Class third;
  
  public MultiClassKey() {}
  
  public MultiClassKey(Class paramClass1, Class paramClass2)
  {
    set(paramClass1, paramClass2);
  }
  
  public MultiClassKey(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    set(paramClass1, paramClass2, paramClass3);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        localClass1 = getClass();
        localClass2 = paramObject.getClass();
        if (localClass1 == localClass2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (MultiClassKey)paramObject;
      Class localClass1 = this.first;
      Class localClass2 = ((MultiClassKey)paramObject).first;
      boolean bool2 = localClass1.equals(localClass2);
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        localClass1 = this.second;
        localClass2 = ((MultiClassKey)paramObject).second;
        bool2 = localClass1.equals(localClass2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localClass1 = this.third;
          localClass2 = ((MultiClassKey)paramObject).third;
          bool2 = Util.bothNullOrEqual(localClass1, localClass2);
          if (!bool2) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.first.hashCode() * 31;
    Class localClass1 = this.second;
    int j = localClass1.hashCode();
    i += j;
    j = i * 31;
    Class localClass2 = this.third;
    if (localClass2 != null)
    {
      localClass2 = this.third;
      i = localClass2.hashCode();
    }
    for (;;)
    {
      return i + j;
      i = 0;
      localClass2 = null;
    }
  }
  
  public void set(Class paramClass1, Class paramClass2)
  {
    set(paramClass1, paramClass2, null);
  }
  
  public void set(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    this.first = paramClass1;
    this.second = paramClass2;
    this.third = paramClass3;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MultiClassKey{first=");
    Class localClass = this.first;
    localStringBuilder = localStringBuilder.append(localClass).append(", second=");
    localClass = this.second;
    return localClass + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\MultiClassKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */