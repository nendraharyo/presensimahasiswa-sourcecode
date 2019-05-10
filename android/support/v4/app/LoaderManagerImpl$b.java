package android.support.v4.app;

import android.arch.lifecycle.k;
import android.support.v4.a.c;
import android.util.Log;
import java.io.PrintWriter;

class LoaderManagerImpl$b
  implements k
{
  private final c a;
  private final t.a b;
  private boolean c = false;
  
  LoaderManagerImpl$b(c paramc, t.a parama)
  {
    this.a = paramc;
    this.b = parama;
  }
  
  public void a(Object paramObject)
  {
    boolean bool = LoaderManagerImpl.a;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("  onLoadFinished in ");
      Object localObject3 = this.a;
      localObject2 = ((StringBuilder)localObject2).append(localObject3).append(": ");
      localObject3 = this.a.dataToString(paramObject);
      localObject2 = (String)localObject3;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = this.b;
    Object localObject2 = this.a;
    ((t.a)localObject1).onLoadFinished((c)localObject2, paramObject);
    this.c = true;
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mDeliveredData=");
    boolean bool = this.c;
    paramPrintWriter.println(bool);
  }
  
  boolean a()
  {
    return this.c;
  }
  
  void b()
  {
    boolean bool = this.c;
    if (bool)
    {
      bool = LoaderManagerImpl.a;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("  Resetting: ");
        c localc = this.a;
        localObject2 = localc;
        Log.v((String)localObject1, (String)localObject2);
      }
      Object localObject1 = this.b;
      Object localObject2 = this.a;
      ((t.a)localObject1).onLoaderReset((c)localObject2);
    }
  }
  
  public String toString()
  {
    return this.b.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\LoaderManagerImpl$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */