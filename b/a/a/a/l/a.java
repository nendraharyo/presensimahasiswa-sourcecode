package b.a.a.a.l;

public abstract class a
  implements e
{
  public int a(String paramString, int paramInt)
  {
    Object localObject = a(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramInt;
      localObject = (Integer)localObject;
      paramInt = ((Integer)localObject).intValue();
    }
  }
  
  public long a(String paramString, long paramLong)
  {
    Object localObject = a(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramLong;
      localObject = (Long)localObject;
      paramLong = ((Long)localObject).longValue();
    }
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    Object localObject = a(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramBoolean;
      localObject = (Boolean)localObject;
      paramBoolean = ((Boolean)localObject).booleanValue();
    }
  }
  
  public e b(String paramString, int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    a(paramString, localInteger);
    return this;
  }
  
  public e b(String paramString, long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    a(paramString, localLong);
    return this;
  }
  
  public e b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE)
    {
      a(paramString, localBoolean);
      return this;
    }
  }
  
  public boolean b(String paramString)
  {
    return a(paramString, false);
  }
  
  public boolean c(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = a(paramString, false);
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\l\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */