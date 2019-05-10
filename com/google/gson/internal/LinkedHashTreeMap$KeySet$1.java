package com.google.gson.internal;

class LinkedHashTreeMap$KeySet$1
  extends LinkedHashTreeMap.LinkedTreeMapIterator
{
  LinkedHashTreeMap$KeySet$1(LinkedHashTreeMap.KeySet paramKeySet)
  {
    super(localLinkedHashTreeMap);
  }
  
  public Object next()
  {
    return nextNode().key;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$KeySet$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */