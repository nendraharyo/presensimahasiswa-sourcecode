package android.support.v4.g;

abstract class c$d
  implements b
{
  private final c.c a;
  
  c$d(c.c paramc)
  {
    this.a = paramc;
  }
  
  private boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    c.c localc = this.a;
    int i = localc.a(paramCharSequence, paramInt1, paramInt2);
    boolean bool;
    switch (i)
    {
    default: 
      bool = a();
    }
    for (;;)
    {
      return bool;
      bool = true;
      continue;
      bool = false;
      localc = null;
    }
  }
  
  protected abstract boolean a();
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence != null) && (paramInt1 >= 0) && (paramInt2 >= 0))
    {
      int i = paramCharSequence.length() - paramInt2;
      if (i >= paramInt1) {}
    }
    else
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = this.a;
    if (localObject == null) {}
    for (boolean bool = a();; bool = b(paramCharSequence, paramInt1, paramInt2)) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\g\c$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */