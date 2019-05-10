package com.bumptech.glide.util.pool;

public final class GlideTrace
{
  private static final int MAX_LENGTH = 127;
  private static final boolean TRACING_ENABLED;
  
  public static void beginSection(String paramString) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject1, Object paramObject2) {}
  
  public static void beginSectionFormat(String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public static void endSection() {}
  
  private static String truncateTag(String paramString)
  {
    int i = paramString.length();
    int j = 127;
    if (i > j)
    {
      i = 0;
      j = 126;
      paramString = paramString.substring(0, j);
    }
    return paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\GlideTrace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */