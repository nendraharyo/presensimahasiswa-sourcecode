package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

 enum FieldNamingPolicy$4
{
  FieldNamingPolicy$4()
  {
    super(paramString, paramInt, null);
  }
  
  public String translateName(Field paramField)
  {
    String str = separateCamelCase(paramField.getName(), "_");
    Locale localLocale = Locale.ENGLISH;
    return str.toLowerCase(localLocale);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\FieldNamingPolicy$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */