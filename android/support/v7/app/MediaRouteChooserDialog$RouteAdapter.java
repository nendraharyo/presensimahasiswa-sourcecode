package android.support.v7.app;

import android.content.Context;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

final class MediaRouteChooserDialog$RouteAdapter
  extends ArrayAdapter
  implements AdapterView.OnItemClickListener
{
  private final LayoutInflater mInflater;
  
  public MediaRouteChooserDialog$RouteAdapter(MediaRouteChooserDialog paramMediaRouteChooserDialog, Context paramContext, List paramList)
  {
    super(paramContext, 0, paramList);
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    this.mInflater = localLayoutInflater;
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      localObject1 = this.mInflater;
      i = R.layout.mr_media_route_list_item;
      paramView = ((LayoutInflater)localObject1).inflate(i, paramViewGroup, false);
    }
    Object localObject1 = (MediaRouter.RouteInfo)getItem(paramInt);
    int i = 16908308;
    Object localObject2 = (TextView)paramView.findViewById(i);
    int j = 16908309;
    TextView localTextView = (TextView)paramView.findViewById(j);
    String str = ((MediaRouter.RouteInfo)localObject1).getName();
    ((TextView)localObject2).setText(str);
    localObject2 = ((MediaRouter.RouteInfo)localObject1).getDescription();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool1)
    {
      i = 8;
      localTextView.setVisibility(i);
      localObject2 = "";
      localTextView.setText((CharSequence)localObject2);
    }
    for (;;)
    {
      boolean bool2 = ((MediaRouter.RouteInfo)localObject1).isEnabled();
      paramView.setEnabled(bool2);
      return paramView;
      localTextView.setVisibility(0);
      localTextView.setText((CharSequence)localObject2);
    }
  }
  
  public boolean isEnabled(int paramInt)
  {
    return ((MediaRouter.RouteInfo)getItem(paramInt)).isEnabled();
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = (MediaRouter.RouteInfo)getItem(paramInt);
    boolean bool = ((MediaRouter.RouteInfo)localObject).isEnabled();
    if (bool)
    {
      ((MediaRouter.RouteInfo)localObject).select();
      localObject = this.this$0;
      ((MediaRouteChooserDialog)localObject).dismiss();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteChooserDialog$RouteAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */