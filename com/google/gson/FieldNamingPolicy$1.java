package com.google.gson;

import java.lang.reflect.Field;

 enum FieldNamingPolicy$1
{
  FieldNamingPolicy$1()
  {
    super(paramString, paramInt, null);
  }
  
  public String translateName(Field paramField)
  {
    return paramField.getName();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\FieldNamingPolicy$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */