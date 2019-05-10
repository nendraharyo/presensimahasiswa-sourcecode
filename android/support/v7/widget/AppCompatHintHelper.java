package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class AppCompatHintHelper
{
  static InputConnection onCreateInputConnection(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if (paramInputConnection != null)
    {
      localObject = paramEditorInfo.hintText;
      if (localObject != null) {}
    }
    for (Object localObject = paramView.getParent();; localObject = ((ViewParent)localObject).getParent())
    {
      boolean bool = localObject instanceof View;
      if (bool)
      {
        bool = localObject instanceof WithHint;
        if (bool)
        {
          localObject = ((WithHint)localObject).getHint();
          paramEditorInfo.hintText = ((CharSequence)localObject);
        }
      }
      else
      {
        return paramInputConnection;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatHintHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */