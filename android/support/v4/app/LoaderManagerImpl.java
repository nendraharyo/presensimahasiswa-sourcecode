package android.support.v4.app;

import android.arch.lifecycle.e;
import android.arch.lifecycle.p;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.a.c;
import android.support.v4.h.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl
  extends t
{
  static boolean a = false;
  private final e b;
  private final LoaderManagerImpl.LoaderViewModel c;
  private boolean d;
  
  LoaderManagerImpl(e parame, p paramp)
  {
    this.b = parame;
    LoaderManagerImpl.LoaderViewModel localLoaderViewModel = LoaderManagerImpl.LoaderViewModel.a(paramp);
    this.c = localLoaderViewModel;
  }
  
  private c a(int paramInt, Bundle paramBundle, t.a parama, c paramc)
  {
    boolean bool1 = true;
    Object localObject4;
    String str;
    try
    {
      this.d = bool1;
      Object localObject1 = parama.onCreateLoader(paramInt, paramBundle);
      localObject3 = localObject1.getClass();
      boolean bool2 = ((Class)localObject3).isMemberClass();
      if (bool2)
      {
        localObject3 = localObject1.getClass();
        int i = ((Class)localObject3).getModifiers();
        boolean bool3 = Modifier.isStatic(i);
        if (!bool3)
        {
          localObject3 = new java/lang/IllegalArgumentException;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "Object returned from onCreateLoader must not be a non-static inner member class: ";
          localObject4 = ((StringBuilder)localObject4).append(str);
          localObject1 = ((StringBuilder)localObject4).append(localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((IllegalArgumentException)localObject3).<init>((String)localObject1);
          throw ((Throwable)localObject3);
        }
      }
    }
    finally
    {
      this.d = false;
    }
    Object localObject3 = new android/support/v4/app/LoaderManagerImpl$a;
    ((LoaderManagerImpl.a)localObject3).<init>(paramInt, paramBundle, localc, paramc);
    bool1 = a;
    if (bool1)
    {
      localObject2 = "LoaderManager";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str = "  Created new loader ";
      localObject4 = ((StringBuilder)localObject4).append(str);
      localObject4 = ((StringBuilder)localObject4).append(localObject3);
      localObject4 = ((StringBuilder)localObject4).toString();
      Log.v((String)localObject2, (String)localObject4);
    }
    Object localObject2 = this.c;
    ((LoaderManagerImpl.LoaderViewModel)localObject2).a(paramInt, (LoaderManagerImpl.a)localObject3);
    this.d = false;
    localObject2 = this.b;
    return ((LoaderManagerImpl.a)localObject3).a((e)localObject2, parama);
  }
  
  public c a(int paramInt, Bundle paramBundle, t.a parama)
  {
    boolean bool1 = this.d;
    if (bool1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Called while creating a loader");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = Looper.getMainLooper();
    Object localObject2 = Looper.myLooper();
    if (localObject1 != localObject2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("initLoader must be called on the main thread");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.c.a(paramInt);
    boolean bool2 = a;
    Object localObject3;
    String str;
    if (bool2)
    {
      localObject2 = "LoaderManager";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("initLoader in ").append(this);
      str = ": args=";
      localObject3 = str + paramBundle;
      Log.v((String)localObject2, (String)localObject3);
    }
    if (localObject1 == null) {
      bool1 = false;
    }
    for (localObject1 = a(paramInt, paramBundle, parama, null);; localObject1 = ((LoaderManagerImpl.a)localObject1).a((e)localObject2, parama))
    {
      return (c)localObject1;
      bool2 = a;
      if (bool2)
      {
        localObject2 = "LoaderManager";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "  Re-using existing loader ";
        localObject3 = str + localObject1;
        Log.v((String)localObject2, (String)localObject3);
      }
      localObject2 = this.b;
    }
  }
  
  void a()
  {
    this.c.b();
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.c.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("LoaderManager{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" in ");
    d.a(this.b, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\LoaderManagerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */