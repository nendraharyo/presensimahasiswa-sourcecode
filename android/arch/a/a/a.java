package android.arch.a.a;

import java.util.concurrent.Executor;

public class a
  extends c
{
  private static volatile a a;
  private static final Executor d;
  private static final Executor e;
  private c b;
  private c c;
  
  static
  {
    Object localObject = new android/arch/a/a/a$1;
    ((a.1)localObject).<init>();
    d = (Executor)localObject;
    localObject = new android/arch/a/a/a$2;
    ((a.2)localObject).<init>();
    e = (Executor)localObject;
  }
  
  private a()
  {
    Object localObject = new android/arch/a/a/b;
    ((b)localObject).<init>();
    this.c = ((c)localObject);
    localObject = this.c;
    this.b = ((c)localObject);
  }
  
  public static a a()
  {
    a locala = a;
    if (locala != null) {
      locala = a;
    }
    for (;;)
    {
      return locala;
      synchronized (a.class)
      {
        locala = a;
        if (locala == null)
        {
          locala = new android/arch/a/a/a;
          locala.<init>();
          a = locala;
        }
        locala = a;
      }
    }
  }
  
  public void a(Runnable paramRunnable)
  {
    this.b.a(paramRunnable);
  }
  
  public void b(Runnable paramRunnable)
  {
    this.b.b(paramRunnable);
  }
  
  public boolean b()
  {
    return this.b.b();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */