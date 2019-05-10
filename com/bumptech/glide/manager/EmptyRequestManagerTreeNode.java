package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Set;

final class EmptyRequestManagerTreeNode
  implements RequestManagerTreeNode
{
  public Set getDescendants()
  {
    return Collections.emptySet();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\EmptyRequestManagerTreeNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */