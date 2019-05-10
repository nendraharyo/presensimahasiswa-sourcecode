package com.google.android.gms.appindexing;

import android.net.Uri;
import android.view.View;

public final class AppIndexApi$AppIndexingLink
{
  public final Uri appIndexingUrl;
  public final int viewId;
  public final Uri webUrl;
  
  public AppIndexApi$AppIndexingLink(Uri paramUri1, Uri paramUri2, View paramView)
  {
    this.appIndexingUrl = paramUri1;
    this.webUrl = paramUri2;
    int i = paramView.getId();
    this.viewId = i;
  }
  
  public AppIndexApi$AppIndexingLink(Uri paramUri, View paramView)
  {
    this(paramUri, null, paramView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\AppIndexApi$AppIndexingLink.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */