package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

class ConstructorConstructor$2
  implements ObjectConstructor
{
  ConstructorConstructor$2(ConstructorConstructor paramConstructorConstructor, InstanceCreator paramInstanceCreator, Type paramType) {}
  
  public Object construct()
  {
    InstanceCreator localInstanceCreator = this.val$rawTypeCreator;
    Type localType = this.val$type;
    return localInstanceCreator.createInstance(localType);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\ConstructorConstructor$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */