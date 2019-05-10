package android.support.v7.widget;

import android.content.Intent;

class ShareActionProvider$ShareActivityChooserModelPolicy
  implements ActivityChooserModel.OnChooseActivityListener
{
  ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider paramShareActionProvider) {}
  
  public boolean onChooseActivity(ActivityChooserModel paramActivityChooserModel, Intent paramIntent)
  {
    ShareActionProvider.OnShareTargetSelectedListener localOnShareTargetSelectedListener = this.this$0.mOnShareTargetSelectedListener;
    if (localOnShareTargetSelectedListener != null)
    {
      localOnShareTargetSelectedListener = this.this$0.mOnShareTargetSelectedListener;
      ShareActionProvider localShareActionProvider = this.this$0;
      localOnShareTargetSelectedListener.onShareTargetSelected(localShareActionProvider, paramIntent);
    }
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ShareActionProvider$ShareActivityChooserModelPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */