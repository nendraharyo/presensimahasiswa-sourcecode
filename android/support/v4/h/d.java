package android.support.v4.h;

public class d
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    String str;
    if (paramObject == null)
    {
      str = "null";
      paramStringBuilder.append(str);
    }
    for (;;)
    {
      return;
      str = paramObject.getClass().getSimpleName();
      int i;
      if (str != null)
      {
        i = str.length();
        if (i > 0) {}
      }
      else
      {
        str = paramObject.getClass().getName();
        i = str.lastIndexOf('.');
        if (i > 0)
        {
          i += 1;
          str = str.substring(i);
        }
      }
      paramStringBuilder.append(str);
      paramStringBuilder.append('{');
      int j = System.identityHashCode(paramObject);
      str = Integer.toHexString(j);
      paramStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */