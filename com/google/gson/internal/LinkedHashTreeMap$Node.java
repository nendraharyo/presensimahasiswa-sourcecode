package com.google.gson.internal;

import java.util.Map.Entry;

final class LinkedHashTreeMap$Node
  implements Map.Entry
{
  final int hash;
  int height;
  final Object key;
  Node left;
  Node next;
  Node parent;
  Node prev;
  Node right;
  Object value;
  
  LinkedHashTreeMap$Node()
  {
    this.key = null;
    this.hash = -1;
    this.prev = this;
    this.next = this;
  }
  
  LinkedHashTreeMap$Node(Node paramNode1, Object paramObject, int paramInt, Node paramNode2, Node paramNode3)
  {
    this.parent = paramNode1;
    this.key = paramObject;
    this.hash = paramInt;
    this.height = 1;
    this.next = paramNode2;
    this.prev = paramNode3;
    paramNode3.next = this;
    paramNode2.prev = this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Map.Entry;
    Object localObject1;
    if (bool2)
    {
      paramObject = (Map.Entry)paramObject;
      localObject1 = this.key;
      if (localObject1 != null) {
        break label68;
      }
      localObject1 = ((Map.Entry)paramObject).getKey();
      if (localObject1 == null)
      {
        localObject1 = this.value;
        if (localObject1 != null) {
          break label97;
        }
        localObject1 = ((Map.Entry)paramObject).getValue();
        if (localObject1 != null) {}
      }
    }
    for (;;)
    {
      bool1 = true;
      label68:
      label97:
      do
      {
        do
        {
          return bool1;
          localObject1 = this.key;
          localObject2 = ((Map.Entry)paramObject).getKey();
          bool2 = localObject1.equals(localObject2);
        } while (!bool2);
        break;
        localObject1 = this.value;
        Object localObject2 = ((Map.Entry)paramObject).getValue();
        bool2 = localObject1.equals(localObject2);
      } while (!bool2);
    }
  }
  
  public Node first()
  {
    Node localNode;
    for (Object localObject = this.left; localObject != null; localObject = localNode)
    {
      localNode = ((Node)localObject).left;
      this = (Node)localObject;
    }
    return this;
  }
  
  public Object getKey()
  {
    return this.key;
  }
  
  public Object getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.key;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      Object localObject3 = this.value;
      if (localObject3 != null) {
        break label48;
      }
    }
    for (;;)
    {
      return j ^ i;
      localObject2 = this.key;
      j = localObject2.hashCode();
      break;
      label48:
      localObject1 = this.value;
      i = localObject1.hashCode();
    }
  }
  
  public Node last()
  {
    Node localNode;
    for (Object localObject = this.right; localObject != null; localObject = localNode)
    {
      localNode = ((Node)localObject).right;
      this = (Node)localObject;
    }
    return this;
  }
  
  public Object setValue(Object paramObject)
  {
    Object localObject = this.value;
    this.value = paramObject;
    return localObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.key;
    localStringBuilder = localStringBuilder.append(localObject).append("=");
    localObject = this.value;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$Node.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */