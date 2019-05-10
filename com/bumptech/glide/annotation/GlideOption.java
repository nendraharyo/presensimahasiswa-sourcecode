package com.bumptech.glide.annotation;

import java.lang.annotation.Annotation;

public @interface GlideOption
{
  public static final int OVERRIDE_EXTEND = 1;
  public static final int OVERRIDE_NONE = 0;
  public static final int OVERRIDE_REPLACE = 2;
  
  boolean memoizeStaticMethod();
  
  int override();
  
  boolean skipStaticMethod();
  
  String staticMethodName();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\annotation\GlideOption.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */