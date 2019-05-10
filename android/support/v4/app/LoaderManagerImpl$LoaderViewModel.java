package android.support.v4.app;

import android.arch.lifecycle.o;
import android.arch.lifecycle.o.a;
import android.arch.lifecycle.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl$LoaderViewModel
  extends android.arch.lifecycle.n
{
  private static final o.a a;
  private android.support.v4.h.n b;
  
  static
  {
    LoaderManagerImpl.LoaderViewModel.1 local1 = new android/support/v4/app/LoaderManagerImpl$LoaderViewModel$1;
    local1.<init>();
    a = local1;
  }
  
  LoaderManagerImpl$LoaderViewModel()
  {
    android.support.v4.h.n localn = new android/support/v4/h/n;
    localn.<init>();
    this.b = localn;
  }
  
  static LoaderViewModel a(p paramp)
  {
    o localo = new android/arch/lifecycle/o;
    o.a locala = a;
    localo.<init>(paramp, locala);
    return (LoaderViewModel)localo.a(LoaderViewModel.class);
  }
  
  LoaderManagerImpl.a a(int paramInt)
  {
    return (LoaderManagerImpl.a)this.b.a(paramInt);
  }
  
  protected void a()
  {
    super.a();
    int i = this.b.b();
    int j = 0;
    LoaderManagerImpl.a locala = null;
    for (int k = 0; k < i; k = j)
    {
      locala = (LoaderManagerImpl.a)this.b.e(k);
      boolean bool = true;
      locala.a(bool);
      j = k + 1;
    }
    this.b.c();
  }
  
  void a(int paramInt, LoaderManagerImpl.a parama)
  {
    this.b.b(paramInt, parama);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject = this.b;
    int i = ((android.support.v4.h.n)localObject).b();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loaders:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str1 = paramString + "    ";
      i = 0;
      localObject = null;
      for (int j = 0;; j = i)
      {
        localObject = this.b;
        i = ((android.support.v4.h.n)localObject).b();
        if (j >= i) {
          break;
        }
        localObject = (LoaderManagerImpl.a)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        int k = this.b.d(j);
        paramPrintWriter.print(k);
        paramPrintWriter.print(": ");
        String str2 = ((LoaderManagerImpl.a)localObject).toString();
        paramPrintWriter.println(str2);
        ((LoaderManagerImpl.a)localObject).a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i = j + 1;
      }
    }
  }
  
  void b()
  {
    int i = this.b.b();
    int j = 0;
    LoaderManagerImpl.a locala = null;
    for (int k = 0; k < i; k = j)
    {
      locala = (LoaderManagerImpl.a)this.b.e(k);
      locala.g();
      j = k + 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\LoaderManagerImpl$LoaderViewModel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */