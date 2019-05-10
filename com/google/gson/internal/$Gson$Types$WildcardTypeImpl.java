package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class $Gson$Types$WildcardTypeImpl
  implements Serializable, WildcardType
{
  private static final long serialVersionUID;
  private final Type lowerBound;
  private final Type upperBound;
  
  public $Gson$Types$WildcardTypeImpl(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    int j = paramArrayOfType2.length;
    label37:
    Object localObject;
    if (j <= i)
    {
      j = i;
      .Gson.Preconditions.checkArgument(j);
      int k = paramArrayOfType1.length;
      if (k != i) {
        break label119;
      }
      k = i;
      .Gson.Preconditions.checkArgument(k);
      int m = paramArrayOfType2.length;
      if (m != i) {
        break label133;
      }
      .Gson.Preconditions.checkNotNull(paramArrayOfType2[0]);
      .Gson.Types.checkNotPrimitive(paramArrayOfType2[0]);
      localObject = paramArrayOfType1[0];
      Class localClass = Object.class;
      if (localObject != localClass) {
        break label128;
      }
      label81:
      .Gson.Preconditions.checkArgument(i);
      localObject = .Gson.Types.canonicalize(paramArrayOfType2[0]);
      this.lowerBound = ((Type)localObject);
      localObject = Object.class;
    }
    for (this.upperBound = ((Type)localObject);; this.upperBound = ((Type)localObject))
    {
      return;
      int n = 0;
      localObject = null;
      break;
      label119:
      n = 0;
      localObject = null;
      break label37;
      label128:
      i = 0;
      break label81;
      label133:
      .Gson.Preconditions.checkNotNull(paramArrayOfType1[0]);
      .Gson.Types.checkNotPrimitive(paramArrayOfType1[0]);
      n = 0;
      this.lowerBound = null;
      localObject = .Gson.Types.canonicalize(paramArrayOfType1[0]);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof WildcardType;
    if (bool)
    {
      paramObject = (WildcardType)paramObject;
      bool = .Gson.Types.equals(this, (Type)paramObject);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Type[] getLowerBounds()
  {
    Object localObject = this.lowerBound;
    if (localObject != null)
    {
      int i = 1;
      localObject = new Type[i];
      Type localType = this.lowerBound;
      localObject[0] = localType;
    }
    for (;;)
    {
      return (Type[])localObject;
      localObject = .Gson.Types.EMPTY_TYPE_ARRAY;
    }
  }
  
  public Type[] getUpperBounds()
  {
    Type[] arrayOfType = new Type[1];
    Type localType = this.upperBound;
    arrayOfType[0] = localType;
    return arrayOfType;
  }
  
  public int hashCode()
  {
    Type localType = this.lowerBound;
    if (localType != null) {
      localType = this.lowerBound;
    }
    for (int i = localType.hashCode() + 31;; i = 1)
    {
      int j = this.upperBound.hashCode() + 31;
      return i ^ j;
    }
  }
  
  public String toString()
  {
    Object localObject1 = this.lowerBound;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("? super ");
      localObject2 = .Gson.Types.typeToString(this.lowerBound);
      localObject1 = (String)localObject2;
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = this.upperBound;
      localObject2 = Object.class;
      if (localObject1 == localObject2)
      {
        localObject1 = "?";
      }
      else
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("? extends ");
        localObject2 = .Gson.Types.typeToString(this.upperBound);
        localObject1 = (String)localObject2;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\$Gson$Types$WildcardTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */