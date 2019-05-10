package b.a.a.a.b.f;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

final class b$a
{
  private static final ThreadLocal a;
  
  static
  {
    b.a.1 local1 = new b/a/a/a/b/f/b$a$1;
    local1.<init>();
    a = local1;
  }
  
  public static SimpleDateFormat a(String paramString)
  {
    Object localObject1 = (Map)((SoftReference)a.get()).get();
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      localObject2 = a;
      localObject3 = new java/lang/ref/SoftReference;
      ((SoftReference)localObject3).<init>(localObject1);
      ((ThreadLocal)localObject2).set(localObject3);
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      localObject1 = (SimpleDateFormat)((Map)localObject2).get(paramString);
      if (localObject1 == null)
      {
        localObject1 = new java/text/SimpleDateFormat;
        localObject3 = Locale.US;
        ((SimpleDateFormat)localObject1).<init>(paramString, (Locale)localObject3);
        localObject3 = TimeZone.getTimeZone("GMT");
        ((SimpleDateFormat)localObject1).setTimeZone((TimeZone)localObject3);
        ((Map)localObject2).put(paramString, localObject1);
      }
      return (SimpleDateFormat)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */