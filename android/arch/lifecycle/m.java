package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class m
  extends Fragment
{
  private m.a a;
  
  public static void a(Activity paramActivity)
  {
    FragmentManager localFragmentManager = paramActivity.getFragmentManager();
    Object localObject = localFragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    if (localObject == null)
    {
      localObject = localFragmentManager.beginTransaction();
      m localm = new android/arch/lifecycle/m;
      localm.<init>();
      String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
      localObject = ((FragmentTransaction)localObject).add(localm, str);
      ((FragmentTransaction)localObject).commit();
      localFragmentManager.executePendingTransactions();
    }
  }
  
  private void a(c.a parama)
  {
    Object localObject = getActivity();
    boolean bool = localObject instanceof g;
    if (bool)
    {
      localObject = ((g)localObject).a();
      ((f)localObject).a(parama);
    }
    for (;;)
    {
      return;
      bool = localObject instanceof e;
      if (bool)
      {
        localObject = ((e)localObject).getLifecycle();
        bool = localObject instanceof f;
        if (bool)
        {
          localObject = (f)localObject;
          ((f)localObject).a(parama);
        }
      }
    }
  }
  
  private void a(m.a parama)
  {
    if (parama != null) {
      parama.a();
    }
  }
  
  private void b(m.a parama)
  {
    if (parama != null) {
      parama.b();
    }
  }
  
  private void c(m.a parama)
  {
    if (parama != null) {
      parama.c();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    Object localObject = this.a;
    a((m.a)localObject);
    localObject = c.a.ON_CREATE;
    a((c.a)localObject);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    c.a locala = c.a.ON_DESTROY;
    a(locala);
    this.a = null;
  }
  
  public void onPause()
  {
    super.onPause();
    c.a locala = c.a.ON_PAUSE;
    a(locala);
  }
  
  public void onResume()
  {
    super.onResume();
    Object localObject = this.a;
    c((m.a)localObject);
    localObject = c.a.ON_RESUME;
    a((c.a)localObject);
  }
  
  public void onStart()
  {
    super.onStart();
    Object localObject = this.a;
    b((m.a)localObject);
    localObject = c.a.ON_START;
    a((c.a)localObject);
  }
  
  public void onStop()
  {
    super.onStop();
    c.a locala = c.a.ON_STOP;
    a(locala);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */