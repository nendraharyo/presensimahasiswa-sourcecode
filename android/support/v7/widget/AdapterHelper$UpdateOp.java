package android.support.v7.widget;

class AdapterHelper$UpdateOp
{
  static final int ADD = 1;
  static final int MOVE = 8;
  static final int POOL_SIZE = 30;
  static final int REMOVE = 2;
  static final int UPDATE = 4;
  int cmd;
  int itemCount;
  Object payload;
  int positionStart;
  
  AdapterHelper$UpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    this.cmd = paramInt1;
    this.positionStart = paramInt2;
    this.itemCount = paramInt3;
    this.payload = paramObject;
  }
  
  String cmdToString()
  {
    int i = this.cmd;
    String str;
    switch (i)
    {
    default: 
      str = "??";
    }
    for (;;)
    {
      return str;
      str = "add";
      continue;
      str = "rm";
      continue;
      str = "up";
      continue;
      str = "mv";
    }
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject) {}
    for (;;)
    {
      return i;
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        i = 0;
        continue;
      }
      paramObject = (UpdateOp)paramObject;
      int j = this.cmd;
      int m = ((UpdateOp)paramObject).cmd;
      if (j != m)
      {
        i = 0;
      }
      else
      {
        j = this.cmd;
        int n = 8;
        if (j == n)
        {
          j = this.itemCount;
          int i1 = this.positionStart;
          j = Math.abs(j - i1);
          if (j == i)
          {
            k = this.itemCount;
            i2 = ((UpdateOp)paramObject).positionStart;
            if (k == i2)
            {
              k = this.positionStart;
              i2 = ((UpdateOp)paramObject).itemCount;
              if (k == i2) {
                continue;
              }
            }
          }
        }
        int k = this.itemCount;
        int i2 = ((UpdateOp)paramObject).itemCount;
        if (k != i2)
        {
          i = 0;
        }
        else
        {
          k = this.positionStart;
          i2 = ((UpdateOp)paramObject).positionStart;
          if (k != i2)
          {
            i = 0;
          }
          else
          {
            localObject1 = this.payload;
            if (localObject1 != null)
            {
              localObject1 = this.payload;
              localObject2 = ((UpdateOp)paramObject).payload;
              boolean bool = localObject1.equals(localObject2);
              if (!bool) {
                i = 0;
              }
            }
            else
            {
              localObject1 = ((UpdateOp)paramObject).payload;
              if (localObject1 != null) {
                i = 0;
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.cmd * 31;
    int j = this.positionStart;
    i = (i + j) * 31;
    j = this.itemCount;
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append((String)localObject).append("[");
    localObject = cmdToString();
    localStringBuilder = localStringBuilder.append((String)localObject).append(",s:");
    int i = this.positionStart;
    localStringBuilder = localStringBuilder.append(i).append("c:");
    i = this.itemCount;
    localStringBuilder = localStringBuilder.append(i).append(",p:");
    localObject = this.payload;
    return localObject + "]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AdapterHelper$UpdateOp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */