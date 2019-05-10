package com.google.android.gms.plus.internal.model.people;

public class PersonEntity$zza
{
  public static int zzfH(String paramString)
  {
    Object localObject1 = "person";
    int i = paramString.equals(localObject1);
    if (i != 0)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = "page";
      boolean bool = paramString.equals(localObject1);
      if (!bool) {
        break;
      }
      bool = true;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unknown objectType string: " + paramString;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */