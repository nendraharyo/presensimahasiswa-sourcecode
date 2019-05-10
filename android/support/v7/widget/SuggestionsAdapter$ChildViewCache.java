package android.support.v7.widget;

import android.support.v7.appcompat.R.id;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class SuggestionsAdapter$ChildViewCache
{
  public final ImageView mIcon1;
  public final ImageView mIcon2;
  public final ImageView mIconRefine;
  public final TextView mText1;
  public final TextView mText2;
  
  public SuggestionsAdapter$ChildViewCache(View paramView)
  {
    Object localObject = (TextView)paramView.findViewById(16908308);
    this.mText1 = ((TextView)localObject);
    localObject = (TextView)paramView.findViewById(16908309);
    this.mText2 = ((TextView)localObject);
    localObject = (ImageView)paramView.findViewById(16908295);
    this.mIcon1 = ((ImageView)localObject);
    localObject = (ImageView)paramView.findViewById(16908296);
    this.mIcon2 = ((ImageView)localObject);
    int i = R.id.edit_query;
    localObject = (ImageView)paramView.findViewById(i);
    this.mIconRefine = ((ImageView)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SuggestionsAdapter$ChildViewCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */