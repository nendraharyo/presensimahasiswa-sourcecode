package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

class SearchView$5
  implements View.OnClickListener
{
  SearchView$5(SearchView paramSearchView) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.this$0.mSearchButton;
    if (paramView == localObject)
    {
      localObject = this.this$0;
      ((SearchView)localObject).onSearchClicked();
    }
    for (;;)
    {
      return;
      localObject = this.this$0.mCloseButton;
      if (paramView == localObject)
      {
        localObject = this.this$0;
        ((SearchView)localObject).onCloseClicked();
      }
      else
      {
        localObject = this.this$0.mGoButton;
        if (paramView == localObject)
        {
          localObject = this.this$0;
          ((SearchView)localObject).onSubmitQuery();
        }
        else
        {
          localObject = this.this$0.mVoiceButton;
          if (paramView == localObject)
          {
            localObject = this.this$0;
            ((SearchView)localObject).onVoiceClicked();
          }
          else
          {
            localObject = this.this$0.mSearchSrcTextView;
            if (paramView == localObject)
            {
              localObject = this.this$0;
              ((SearchView)localObject).forceSuggestionQuery();
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */