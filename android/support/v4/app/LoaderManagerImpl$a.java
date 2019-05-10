package android.support.v4.app;

import android.arch.lifecycle.e;
import android.arch.lifecycle.j;
import android.arch.lifecycle.k;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.a.c;
import android.support.v4.a.c.b;
import android.support.v4.h.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LoaderManagerImpl$a
  extends j
  implements c.b
{
  private final int a;
  private final Bundle b;
  private final c c;
  private e d;
  private LoaderManagerImpl.b e;
  private c f;
  
  LoaderManagerImpl$a(int paramInt, Bundle paramBundle, c paramc1, c paramc2)
  {
    this.a = paramInt;
    this.b = paramBundle;
    this.c = paramc1;
    this.f = paramc2;
    this.c.registerListener(paramInt, this);
  }
  
  c a(e parame, t.a parama)
  {
    LoaderManagerImpl.b localb = new android/support/v4/app/LoaderManagerImpl$b;
    Object localObject = this.c;
    localb.<init>((c)localObject, parama);
    a(parame, localb);
    localObject = this.e;
    if (localObject != null)
    {
      localObject = this.e;
      a((k)localObject);
    }
    this.d = parame;
    this.e = localb;
    return this.c;
  }
  
  c a(boolean paramBoolean)
  {
    boolean bool = LoaderManagerImpl.a;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "  Destroying: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    this.c.cancelLoad();
    this.c.abandon();
    Object localObject1 = this.e;
    if (localObject1 != null)
    {
      a((k)localObject1);
      if (paramBoolean) {
        ((LoaderManagerImpl.b)localObject1).b();
      }
    }
    Object localObject2 = this.c;
    ((c)localObject2).unregisterListener(this);
    if (localObject1 != null)
    {
      bool = ((LoaderManagerImpl.b)localObject1).a();
      if (!bool) {}
    }
    else
    {
      if (!paramBoolean) {
        break label128;
      }
    }
    this.c.reset();
    label128:
    for (localObject1 = this.f;; localObject1 = this.c) {
      return (c)localObject1;
    }
  }
  
  public void a(k paramk)
  {
    super.a(paramk);
    this.d = null;
    this.e = null;
  }
  
  public void a(c paramc, Object paramObject)
  {
    boolean bool = LoaderManagerImpl.a;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "onLoadComplete: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2) {
      b(paramObject);
    }
    for (;;)
    {
      return;
      bool = LoaderManagerImpl.a;
      if (bool)
      {
        localObject1 = "LoaderManager";
        localObject2 = "onLoadComplete was incorrectly called on a background thread";
        Log.w((String)localObject1, (String)localObject2);
      }
      a(paramObject);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    int i = this.a;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mArgs=");
    Object localObject1 = this.b;
    paramPrintWriter.println(localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    localObject1 = this.c;
    paramPrintWriter.println(localObject1);
    localObject1 = this.c;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append(paramString);
    String str = "  ";
    localObject2 = str;
    ((c)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    localObject1 = this.e;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      localObject1 = this.e;
      paramPrintWriter.println(localObject1);
      localObject1 = this.e;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((LoaderManagerImpl.b)localObject1).a((String)localObject2, paramPrintWriter);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mData=");
    localObject1 = f();
    localObject2 = a();
    localObject1 = ((c)localObject1).dataToString(localObject2);
    paramPrintWriter.println((String)localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    boolean bool = d();
    paramPrintWriter.println(bool);
  }
  
  protected void b()
  {
    boolean bool = LoaderManagerImpl.a;
    if (bool)
    {
      String str1 = "LoaderManager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "  Starting: ";
      localObject = str2 + this;
      Log.v(str1, (String)localObject);
    }
    this.c.startLoading();
  }
  
  public void b(Object paramObject)
  {
    super.b(paramObject);
    c localc = this.f;
    if (localc != null)
    {
      this.f.reset();
      localc = null;
      this.f = null;
    }
  }
  
  protected void c()
  {
    boolean bool = LoaderManagerImpl.a;
    if (bool)
    {
      String str1 = "LoaderManager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "  Stopping: ";
      localObject = str2 + this;
      Log.v(str1, (String)localObject);
    }
    this.c.stopLoading();
  }
  
  c f()
  {
    return this.c;
  }
  
  void g()
  {
    e locale = this.d;
    LoaderManagerImpl.b localb = this.e;
    if ((locale != null) && (localb != null))
    {
      super.a(localb);
      a(locale, localb);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    localStringBuilder.append("LoaderInfo{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" #");
    int i = this.a;
    localStringBuilder.append(i);
    localStringBuilder.append(" : ");
    d.a(this.c, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\LoaderManagerImpl$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */