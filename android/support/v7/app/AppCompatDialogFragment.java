package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.h;
import android.view.Window;

public class AppCompatDialogFragment
  extends h
{
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    AppCompatDialog localAppCompatDialog = new android/support/v7/app/AppCompatDialog;
    Context localContext = getContext();
    int i = getTheme();
    localAppCompatDialog.<init>(localContext, i);
    return localAppCompatDialog;
  }
  
  public void setupDialog(Dialog paramDialog, int paramInt)
  {
    boolean bool = paramDialog instanceof AppCompatDialog;
    Object localObject;
    if (bool)
    {
      localObject = paramDialog;
      localObject = (AppCompatDialog)paramDialog;
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      return;
      Window localWindow = ((Dialog)paramDialog).getWindow();
      int i = 24;
      localWindow.addFlags(i);
      int j = 1;
      ((AppCompatDialog)localObject).supportRequestWindowFeature(j);
      continue;
      super.setupDialog(paramDialog, paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDialogFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */