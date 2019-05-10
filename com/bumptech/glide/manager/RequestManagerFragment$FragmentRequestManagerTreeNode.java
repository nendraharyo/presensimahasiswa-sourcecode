package com.bumptech.glide.manager;

import com.bumptech.glide.RequestManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class RequestManagerFragment$FragmentRequestManagerTreeNode
  implements RequestManagerTreeNode
{
  RequestManagerFragment$FragmentRequestManagerTreeNode(RequestManagerFragment paramRequestManagerFragment) {}
  
  public Set getDescendants()
  {
    Object localObject = this.this$0.getDescendantRequestManagerFragments();
    HashSet localHashSet = new java/util/HashSet;
    int i = ((Set)localObject).size();
    localHashSet.<init>(i);
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (RequestManagerFragment)localIterator.next();
      RequestManager localRequestManager = ((RequestManagerFragment)localObject).getRequestManager();
      if (localRequestManager != null)
      {
        localObject = ((RequestManagerFragment)localObject).getRequestManager();
        localHashSet.add(localObject);
      }
    }
    return localHashSet;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = super.toString();
    localStringBuilder = localStringBuilder.append((String)localObject).append("{fragment=");
    localObject = this.this$0;
    return localObject + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\RequestManagerFragment$FragmentRequestManagerTreeNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */