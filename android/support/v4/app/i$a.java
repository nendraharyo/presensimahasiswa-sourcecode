package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class i$a
  extends l
{
  public i$a(i parami)
  {
    super(parami);
  }
  
  public View a(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.a.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
  }
  
  public void a(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    this.a.startIntentSenderFromFragment(paramFragment, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    this.a.requestPermissionsFromFragment(paramFragment, paramArrayOfString, paramInt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public boolean a()
  {
    Object localObject = this.a.getWindow();
    boolean bool;
    if (localObject != null)
    {
      localObject = ((Window)localObject).peekDecorView();
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean a(Fragment paramFragment)
  {
    i locali = this.a;
    boolean bool = locali.isFinishing();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locali = null;
    }
  }
  
  public boolean a(String paramString)
  {
    return a.a(this.a, paramString);
  }
  
  public LayoutInflater b()
  {
    LayoutInflater localLayoutInflater = this.a.getLayoutInflater();
    i locali = this.a;
    return localLayoutInflater.cloneInContext(locali);
  }
  
  public void b(Fragment paramFragment)
  {
    this.a.onAttachFragment(paramFragment);
  }
  
  public i c()
  {
    return this.a;
  }
  
  public void d()
  {
    this.a.supportInvalidateOptionsMenu();
  }
  
  public boolean e()
  {
    Window localWindow = this.a.getWindow();
    boolean bool;
    if (localWindow != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindow = null;
    }
  }
  
  public int f()
  {
    Object localObject = this.a.getWindow();
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = ((Window)localObject).getAttributes();
      i = ((WindowManager.LayoutParams)localObject).windowAnimations;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\i$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */