package android.support.v7.app;

class AppCompatDelegateImplV9$1
  implements Runnable
{
  AppCompatDelegateImplV9$1(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void run()
  {
    AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
    int i = localAppCompatDelegateImplV9.mInvalidatePanelMenuFeatures & 0x1;
    if (i != 0)
    {
      localAppCompatDelegateImplV9 = this.this$0;
      localAppCompatDelegateImplV9.doInvalidatePanelMenu(0);
    }
    localAppCompatDelegateImplV9 = this.this$0;
    i = localAppCompatDelegateImplV9.mInvalidatePanelMenuFeatures & 0x1000;
    if (i != 0)
    {
      localAppCompatDelegateImplV9 = this.this$0;
      int j = 108;
      localAppCompatDelegateImplV9.doInvalidatePanelMenu(j);
    }
    this.this$0.mInvalidatePanelMenuPosted = false;
    this.this$0.mInvalidatePanelMenuFeatures = 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */