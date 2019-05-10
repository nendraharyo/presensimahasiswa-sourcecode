package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LinkedTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedTreeMap.EntrySet entrySet;
  final LinkedTreeMap.Node header;
  private LinkedTreeMap.KeySet keySet;
  int modCount = 0;
  LinkedTreeMap.Node root;
  int size = 0;
  
  static
  {
    Object localObject = LinkedTreeMap.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new com/google/gson/internal/LinkedTreeMap$1;
      ((LinkedTreeMap.1)localObject).<init>();
      NATURAL_ORDER = (Comparator)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public LinkedTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedTreeMap(Comparator paramComparator)
  {
    LinkedTreeMap.Node localNode = new com/google/gson/internal/LinkedTreeMap$Node;
    localNode.<init>();
    this.header = localNode;
    if (paramComparator != null) {}
    for (;;)
    {
      this.comparator = paramComparator;
      return;
      paramComparator = NATURAL_ORDER;
    }
  }
  
  private boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void rebalance(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    int i = 1;
    int j = -1;
    LinkedTreeMap.Node localNode1;
    LinkedTreeMap.Node localNode2;
    int k;
    int m;
    label37:
    label49:
    int i2;
    Object localObject;
    if (paramNode != null)
    {
      localNode1 = paramNode.left;
      localNode2 = paramNode.right;
      if (localNode1 == null) {
        break label142;
      }
      k = localNode1.height;
      m = k;
      if (localNode2 == null) {
        break label148;
      }
      k = localNode2.height;
      i2 = m - k;
      int i3 = -2;
      if (i2 != i3) {
        break label215;
      }
      localNode1 = localNode2.left;
      localObject = localNode2.right;
      if (localObject == null) {
        break label157;
      }
      k = ((LinkedTreeMap.Node)localObject).height;
      m = k;
      label97:
      if (localNode1 == null) {
        break label163;
      }
      k = localNode1.height;
      label109:
      k -= m;
      if ((k != j) && ((k != 0) || (paramBoolean))) {
        break label172;
      }
      rotateLeft(paramNode);
      label137:
      if (!paramBoolean) {
        break label298;
      }
    }
    for (;;)
    {
      label141:
      return;
      label142:
      m = 0;
      break label37;
      label148:
      k = 0;
      localObject = null;
      break label49;
      label157:
      m = 0;
      break label97;
      label163:
      k = 0;
      localObject = null;
      break label109;
      label172:
      int n = $assertionsDisabled;
      if ((n == 0) && (k != i))
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
      rotateRight(localNode2);
      rotateLeft(paramNode);
      break label137;
      label215:
      int i4 = 2;
      if (i2 == i4)
      {
        localNode2 = localNode1.left;
        localObject = localNode1.right;
        if (localObject != null)
        {
          k = ((LinkedTreeMap.Node)localObject).height;
          n = k;
          label255:
          if (localNode2 == null) {
            break label312;
          }
          k = localNode2.height;
          label267:
          k -= n;
          if ((k != i) && ((k != 0) || (paramBoolean))) {
            break label321;
          }
          rotateRight(paramNode);
          label294:
          if (paramBoolean) {
            break label363;
          }
        }
      }
      label298:
      label312:
      label321:
      label363:
      label389:
      do
      {
        int i1;
        do
        {
          paramNode = paramNode.parent;
          break;
          i1 = 0;
          break label255;
          k = 0;
          localObject = null;
          break label267;
          i1 = $assertionsDisabled;
          if ((i1 == 0) && (k != j))
          {
            localObject = new java/lang/AssertionError;
            ((AssertionError)localObject).<init>();
            throw ((Throwable)localObject);
          }
          rotateLeft(localNode1);
          rotateRight(paramNode);
          break label294;
          break label141;
          if (i2 != 0) {
            break label389;
          }
          k = i1 + 1;
          paramNode.height = k;
        } while (!paramBoolean);
        break label141;
        boolean bool = $assertionsDisabled;
        if ((!bool) && (i2 != j) && (i2 != i))
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
        }
        k = Math.max(i1, k) + 1;
        paramNode.height = k;
      } while (paramBoolean);
    }
  }
  
  private void replaceInParent(LinkedTreeMap.Node paramNode1, LinkedTreeMap.Node paramNode2)
  {
    Object localObject = paramNode1.parent;
    boolean bool = false;
    LinkedTreeMap.Node localNode = null;
    paramNode1.parent = null;
    if (paramNode2 != null) {
      paramNode2.parent = ((LinkedTreeMap.Node)localObject);
    }
    if (localObject != null)
    {
      localNode = ((LinkedTreeMap.Node)localObject).left;
      if (localNode == paramNode1) {
        ((LinkedTreeMap.Node)localObject).left = paramNode2;
      }
    }
    for (;;)
    {
      return;
      bool = $assertionsDisabled;
      if (!bool)
      {
        localNode = ((LinkedTreeMap.Node)localObject).right;
        if (localNode != paramNode1)
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
        }
      }
      ((LinkedTreeMap.Node)localObject).right = paramNode2;
      continue;
      this.root = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode2.left;
    LinkedTreeMap.Node localNode4 = localNode2.right;
    paramNode.right = localNode3;
    if (localNode3 != null) {
      localNode3.parent = paramNode;
    }
    replaceInParent(paramNode, localNode2);
    localNode2.left = paramNode;
    paramNode.parent = localNode2;
    int j;
    int k;
    if (localNode1 != null)
    {
      j = localNode1.height;
      k = j;
      if (localNode3 == null) {
        break label147;
      }
      j = localNode3.height;
    }
    for (;;)
    {
      j = Math.max(k, j) + 1;
      paramNode.height = j;
      j = paramNode.height;
      if (localNode4 != null) {
        i = localNode4.height;
      }
      j = Math.max(j, i) + 1;
      localNode2.height = j;
      return;
      k = 0;
      break;
      label147:
      j = 0;
      localNode1 = null;
    }
  }
  
  private void rotateRight(LinkedTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = localNode1.left;
    LinkedTreeMap.Node localNode4 = localNode1.right;
    paramNode.left = localNode4;
    if (localNode4 != null) {
      localNode4.parent = paramNode;
    }
    replaceInParent(paramNode, localNode1);
    localNode1.right = paramNode;
    paramNode.parent = localNode1;
    int j;
    int k;
    if (localNode2 != null)
    {
      j = localNode2.height;
      k = j;
      if (localNode4 == null) {
        break label143;
      }
      j = localNode4.height;
    }
    for (;;)
    {
      j = Math.max(k, j) + 1;
      paramNode.height = j;
      j = paramNode.height;
      if (localNode3 != null) {
        i = localNode3.height;
      }
      j = Math.max(j, i) + 1;
      localNode1.height = j;
      return;
      k = 0;
      break;
      label143:
      j = 0;
      localNode2 = null;
    }
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    this.root = null;
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedTreeMap.Node localNode = this.header;
    localNode.prev = localNode;
    localNode.next = localNode;
  }
  
  public boolean containsKey(Object paramObject)
  {
    LinkedTreeMap.Node localNode = findByObject(paramObject);
    boolean bool;
    if (localNode != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNode = null;
    }
  }
  
  public Set entrySet()
  {
    LinkedTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet != null) {}
    for (;;)
    {
      return localEntrySet;
      localEntrySet = new com/google/gson/internal/LinkedTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
  }
  
  LinkedTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Comparator localComparator = this.comparator;
    Object localObject2 = this.root;
    boolean bool = false;
    Object localObject3 = null;
    Object localObject4;
    int j;
    if (localObject2 != null)
    {
      localObject3 = NATURAL_ORDER;
      if (localComparator == localObject3)
      {
        localObject3 = paramObject;
        localObject3 = (Comparable)paramObject;
        if (localObject3 == null) {
          break label93;
        }
        localObject4 = ((LinkedTreeMap.Node)localObject2).key;
        j = ((Comparable)localObject3).compareTo(localObject4);
        label72:
        if (j != 0) {
          break label115;
        }
        localObject1 = localObject2;
      }
    }
    label81:
    label93:
    label115:
    label127:
    label239:
    label376:
    for (;;)
    {
      return (LinkedTreeMap.Node)localObject1;
      bool = false;
      localObject3 = null;
      break;
      localObject4 = ((LinkedTreeMap.Node)localObject2).key;
      j = localComparator.compare(paramObject, localObject4);
      break label72;
      LinkedTreeMap.Node localNode;
      int k;
      if (j < 0)
      {
        localNode = ((LinkedTreeMap.Node)localObject2).left;
        if (localNode != null) {
          break label239;
        }
        localObject4 = localObject2;
        k = j;
      }
      for (;;)
      {
        if (!paramBoolean) {
          break label376;
        }
        localObject1 = this.header;
        if (localObject4 == null)
        {
          localObject3 = NATURAL_ORDER;
          if (localComparator == localObject3)
          {
            bool = paramObject instanceof Comparable;
            if (!bool)
            {
              localObject3 = new java/lang/ClassCastException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject2 = paramObject.getClass().getName();
              localObject1 = (String)localObject2 + " is not Comparable";
              ((ClassCastException)localObject3).<init>((String)localObject1);
              throw ((Throwable)localObject3);
              localNode = ((LinkedTreeMap.Node)localObject2).right;
              break label127;
              localObject2 = localNode;
              break;
            }
          }
          localObject3 = new com/google/gson/internal/LinkedTreeMap$Node;
          localObject2 = ((LinkedTreeMap.Node)localObject1).prev;
          ((LinkedTreeMap.Node)localObject3).<init>((LinkedTreeMap.Node)localObject4, paramObject, (LinkedTreeMap.Node)localObject1, (LinkedTreeMap.Node)localObject2);
          this.root = ((LinkedTreeMap.Node)localObject3);
          i = this.size + 1;
          this.size = i;
          i = this.modCount + 1;
          this.modCount = i;
          localObject1 = localObject3;
          break label81;
        }
        localObject3 = new com/google/gson/internal/LinkedTreeMap$Node;
        localNode = ((LinkedTreeMap.Node)localObject1).prev;
        ((LinkedTreeMap.Node)localObject3).<init>((LinkedTreeMap.Node)localObject4, paramObject, (LinkedTreeMap.Node)localObject1, localNode);
        if (k < 0) {
          ((LinkedTreeMap.Node)localObject4).left = ((LinkedTreeMap.Node)localObject3);
        }
        for (;;)
        {
          i = 1;
          rebalance((LinkedTreeMap.Node)localObject4, i);
          break;
          ((LinkedTreeMap.Node)localObject4).right = ((LinkedTreeMap.Node)localObject3);
        }
        localObject4 = localObject2;
        k = 0;
        localObject2 = null;
      }
    }
  }
  
  LinkedTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    localObject1 = findByObject(localObject1);
    Object localObject2;
    boolean bool;
    if (localObject1 != null)
    {
      localObject2 = ((LinkedTreeMap.Node)localObject1).value;
      Object localObject3 = paramEntry.getValue();
      bool = equal(localObject2, localObject3);
      if (bool)
      {
        bool = true;
        if (!bool) {
          break label62;
        }
      }
    }
    for (;;)
    {
      return (LinkedTreeMap.Node)localObject1;
      bool = false;
      localObject2 = null;
      break;
      label62:
      localObject1 = null;
    }
  }
  
  LinkedTreeMap.Node findByObject(Object paramObject)
  {
    LinkedTreeMap.Node localNode = null;
    if (paramObject != null) {}
    try
    {
      localNode = find(paramObject, false);
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;) {}
    }
    return localNode;
  }
  
  public Object get(Object paramObject)
  {
    Object localObject = findByObject(paramObject);
    if (localObject != null) {}
    for (localObject = ((LinkedTreeMap.Node)localObject).value;; localObject = null) {
      return localObject;
    }
  }
  
  public Set keySet()
  {
    LinkedTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet != null) {}
    for (;;)
    {
      return localKeySet;
      localKeySet = new com/google/gson/internal/LinkedTreeMap$KeySet;
      localKeySet.<init>(this);
      this.keySet = localKeySet;
    }
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("key == null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = find(paramObject1, true);
    Object localObject2 = ((LinkedTreeMap.Node)localObject1).value;
    ((LinkedTreeMap.Node)localObject1).value = paramObject2;
    return localObject2;
  }
  
  public Object remove(Object paramObject)
  {
    Object localObject = removeInternalByKey(paramObject);
    if (localObject != null) {}
    for (localObject = ((LinkedTreeMap.Node)localObject).value;; localObject = null) {
      return localObject;
    }
  }
  
  void removeInternal(LinkedTreeMap.Node paramNode, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      localNode1 = paramNode.prev;
      localNode2 = paramNode.next;
      localNode1.next = localNode2;
      localNode1 = paramNode.next;
      localNode2 = paramNode.prev;
      localNode1.prev = localNode2;
    }
    LinkedTreeMap.Node localNode1 = paramNode.left;
    LinkedTreeMap.Node localNode2 = paramNode.right;
    LinkedTreeMap.Node localNode3 = paramNode.parent;
    int m;
    if ((localNode1 != null) && (localNode2 != null))
    {
      int j = localNode1.height;
      int k = localNode2.height;
      if (j > k)
      {
        localNode1 = localNode1.last();
        removeInternal(localNode1, false);
        localNode3 = paramNode.left;
        if (localNode3 == null) {
          break label299;
        }
        m = localNode3.height;
        localNode1.left = localNode3;
        localNode3.parent = localNode1;
        paramNode.left = null;
      }
    }
    for (;;)
    {
      localNode3 = paramNode.right;
      if (localNode3 != null)
      {
        i = localNode3.height;
        localNode1.right = localNode3;
        localNode3.parent = localNode1;
        paramNode.right = null;
      }
      m = Math.max(m, i) + 1;
      localNode1.height = m;
      replaceInParent(paramNode, localNode1);
      return;
      localNode1 = localNode2.first();
      break;
      if (localNode1 != null)
      {
        replaceInParent(paramNode, localNode1);
        paramNode.left = null;
      }
      for (;;)
      {
        rebalance(localNode3, false);
        int n = this.size + -1;
        this.size = n;
        n = this.modCount + 1;
        this.modCount = n;
        break;
        if (localNode2 != null)
        {
          replaceInParent(paramNode, localNode2);
          paramNode.right = null;
        }
        else
        {
          replaceInParent(paramNode, null);
        }
      }
      label299:
      m = 0;
      localNode2 = null;
    }
  }
  
  LinkedTreeMap.Node removeInternalByKey(Object paramObject)
  {
    LinkedTreeMap.Node localNode = findByObject(paramObject);
    if (localNode != null)
    {
      boolean bool = true;
      removeInternal(localNode, bool);
    }
    return localNode;
  }
  
  public int size()
  {
    return this.size;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */