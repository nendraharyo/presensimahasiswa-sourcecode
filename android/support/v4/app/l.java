package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class l
  extends j
{
  private final Activity a;
  final Context b;
  final int c;
  final n d;
  private final Handler e;
  
  l(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    n localn = new android/support/v4/app/n;
    localn.<init>();
    this.d = localn;
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }
  
  l(i parami)
  {
    this(parami, parami, localHandler, 0);
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    if (paramInt != i)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Starting activity with a requestCode requires a FragmentActivity host");
      throw localIllegalStateException;
    }
    this.b.startActivity(paramIntent);
  }
  
  public void a(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    int i = -1;
    if (paramInt1 != i)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Starting intent sender with a requestCode requires a FragmentActivity host");
      throw localIllegalStateException;
    }
    a.a(this.a, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public boolean a()
  {
    return true;
  }
  
  public boolean a(Fragment paramFragment)
  {
    return true;
  }
  
  public boolean a(String paramString)
  {
    return false;
  }
  
  public LayoutInflater b()
  {
    return LayoutInflater.from(this.b);
  }
  
  void b(Fragment paramFragment) {}
  
  public void d() {}
  
  public boolean e()
  {
    return true;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public abstract Object g();
  
  Activity h()
  {
    return this.a;
  }
  
  Context i()
  {
    return this.b;
  }
  
  Handler j()
  {
    return this.e;
  }
  
  n k()
  {
    return this.d;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */