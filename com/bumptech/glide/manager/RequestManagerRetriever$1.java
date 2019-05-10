package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

class RequestManagerRetriever$1
  implements RequestManagerRetriever.RequestManagerFactory
{
  public RequestManager build(Glide paramGlide, Lifecycle paramLifecycle, RequestManagerTreeNode paramRequestManagerTreeNode, Context paramContext)
  {
    RequestManager localRequestManager = new com/bumptech/glide/RequestManager;
    localRequestManager.<init>(paramGlide, paramLifecycle, paramRequestManagerTreeNode, paramContext);
    return localRequestManager;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\RequestManagerRetriever$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */