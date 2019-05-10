package b.a.a.a.o;

public class b
{
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " is null";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(paramString);
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */