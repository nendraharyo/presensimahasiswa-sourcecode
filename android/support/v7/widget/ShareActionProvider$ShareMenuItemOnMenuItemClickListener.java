package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class ShareActionProvider$ShareMenuItemOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider paramShareActionProvider) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Object localObject1 = this.this$0.mContext;
    Object localObject2 = this.this$0.mShareHistoryFileName;
    localObject1 = ActivityChooserModel.get((Context)localObject1, (String)localObject2);
    int i = paramMenuItem.getItemId();
    localObject1 = ((ActivityChooserModel)localObject1).chooseActivity(i);
    if (localObject1 != null)
    {
      localObject2 = ((Intent)localObject1).getAction();
      String str = "android.intent.action.SEND";
      boolean bool2 = str.equals(localObject2);
      if (!bool2)
      {
        str = "android.intent.action.SEND_MULTIPLE";
        boolean bool1 = str.equals(localObject2);
        if (!bool1) {}
      }
      else
      {
        localObject2 = this.this$0;
        ((ShareActionProvider)localObject2).updateIntent((Intent)localObject1);
      }
      localObject2 = this.this$0.mContext;
      ((Context)localObject2).startActivity((Intent)localObject1);
    }
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ShareActionProvider$ShareMenuItemOnMenuItemClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */