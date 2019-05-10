package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class FieldAttributes
{
  private final Field field;
  
  public FieldAttributes(Field paramField)
  {
    .Gson.Preconditions.checkNotNull(paramField);
    this.field = paramField;
  }
  
  Object get(Object paramObject)
  {
    return this.field.get(paramObject);
  }
  
  public Annotation getAnnotation(Class paramClass)
  {
    return this.field.getAnnotation(paramClass);
  }
  
  public Collection getAnnotations()
  {
    return Arrays.asList(this.field.getAnnotations());
  }
  
  public Class getDeclaredClass()
  {
    return this.field.getType();
  }
  
  public Type getDeclaredType()
  {
    return this.field.getGenericType();
  }
  
  public Class getDeclaringClass()
  {
    return this.field.getDeclaringClass();
  }
  
  public String getName()
  {
    return this.field.getName();
  }
  
  public boolean hasModifier(int paramInt)
  {
    Field localField = this.field;
    int i = localField.getModifiers() & paramInt;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localField = null;
    }
  }
  
  boolean isSynthetic()
  {
    return this.field.isSynthetic();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\FieldAttributes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */