package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LinkedHashTreeMap
  extends AbstractMap
  implements Serializable
{
  private static final Comparator NATURAL_ORDER;
  Comparator comparator;
  private LinkedHashTreeMap.EntrySet entrySet;
  final LinkedHashTreeMap.Node header;
  private LinkedHashTreeMap.KeySet keySet;
  int modCount = 0;
  int size = 0;
  LinkedHashTreeMap.Node[] table;
  int threshold;
  
  static
  {
    Object localObject = LinkedHashTreeMap.class;
    boolean bool = ((Class)localObject).desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      localObject = new com/google/gson/internal/LinkedHashTreeMap$1;
      ((LinkedHashTreeMap.1)localObject).<init>();
      NATURAL_ORDER = (Comparator)localObject;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public LinkedHashTreeMap()
  {
    this(localComparator);
  }
  
  public LinkedHashTreeMap(Comparator paramComparator)
  {
    if (paramComparator != null) {}
    for (;;)
    {
      this.comparator = paramComparator;
      localObject = new com/google/gson/internal/LinkedHashTreeMap$Node;
      ((LinkedHashTreeMap.Node)localObject).<init>();
      this.header = ((LinkedHashTreeMap.Node)localObject);
      localObject = new LinkedHashTreeMap.Node[16];
      this.table = ((LinkedHashTreeMap.Node[])localObject);
      i = this.table.length / 2;
      int j = this.table.length / 4;
      i += j;
      this.threshold = i;
      return;
      paramComparator = NATURAL_ORDER;
    }
  }
  
  private void doubleCapacity()
  {
    LinkedHashTreeMap.Node[] arrayOfNode = doubleCapacity(this.table);
    this.table = arrayOfNode;
    int i = this.table.length / 2;
    int j = this.table.length / 4;
    i += j;
    this.threshold = i;
  }
  
  static LinkedHashTreeMap.Node[] doubleCapacity(LinkedHashTreeMap.Node[] paramArrayOfNode)
  {
    int i = paramArrayOfNode.length;
    int j = i * 2;
    LinkedHashTreeMap.Node[] arrayOfNode = new LinkedHashTreeMap.Node[j];
    LinkedHashTreeMap.AvlIterator localAvlIterator = new com/google/gson/internal/LinkedHashTreeMap$AvlIterator;
    localAvlIterator.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder1 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder1.<init>();
    LinkedHashTreeMap.AvlBuilder localAvlBuilder2 = new com/google/gson/internal/LinkedHashTreeMap$AvlBuilder;
    localAvlBuilder2.<init>();
    int k = 0;
    while (k < i)
    {
      LinkedHashTreeMap.Node localNode1 = paramArrayOfNode[k];
      if (localNode1 == null)
      {
        j = k + 1;
        k = j;
      }
      else
      {
        localAvlIterator.reset(localNode1);
        j = 0;
        LinkedHashTreeMap.Node localNode2 = null;
        int m = 0;
        LinkedHashTreeMap.Node localNode3 = null;
        int n;
        for (;;)
        {
          LinkedHashTreeMap.Node localNode4 = localAvlIterator.next();
          if (localNode4 == null) {
            break;
          }
          n = localNode4.hash & i;
          if (n == 0) {
            m += 1;
          } else {
            j += 1;
          }
        }
        localAvlBuilder1.reset(m);
        localAvlBuilder2.reset(j);
        localAvlIterator.reset(localNode1);
        for (;;)
        {
          localNode1 = localAvlIterator.next();
          if (localNode1 == null) {
            break;
          }
          n = localNode1.hash & i;
          if (n == 0) {
            localAvlBuilder1.add(localNode1);
          } else {
            localAvlBuilder2.add(localNode1);
          }
        }
        if (m > 0)
        {
          localNode3 = localAvlBuilder1.root();
          label211:
          arrayOfNode[k] = localNode3;
          m = k + i;
          if (j <= 0) {
            break label252;
          }
        }
        for (localNode2 = localAvlBuilder2.root();; localNode2 = null)
        {
          arrayOfNode[m] = localNode2;
          break;
          m = 0;
          localNode3 = null;
          break label211;
          label252:
          j = 0;
        }
      }
    }
    return arrayOfNode;
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
  
  private void rebalance(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
  {
    int i = 1;
    int j = -1;
    LinkedHashTreeMap.Node localNode1;
    LinkedHashTreeMap.Node localNode2;
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
      k = ((LinkedHashTreeMap.Node)localObject).height;
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
          k = ((LinkedHashTreeMap.Node)localObject).height;
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
  
  private void replaceInParent(LinkedHashTreeMap.Node paramNode1, LinkedHashTreeMap.Node paramNode2)
  {
    Object localObject1 = paramNode1.parent;
    boolean bool = false;
    Object localObject2 = null;
    paramNode1.parent = null;
    if (paramNode2 != null) {
      paramNode2.parent = ((LinkedHashTreeMap.Node)localObject1);
    }
    if (localObject1 != null)
    {
      localObject2 = ((LinkedHashTreeMap.Node)localObject1).left;
      if (localObject2 == paramNode1) {
        ((LinkedHashTreeMap.Node)localObject1).left = paramNode2;
      }
    }
    for (;;)
    {
      return;
      bool = $assertionsDisabled;
      if (!bool)
      {
        localObject2 = ((LinkedHashTreeMap.Node)localObject1).right;
        if (localObject2 != paramNode1)
        {
          localObject1 = new java/lang/AssertionError;
          ((AssertionError)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
      }
      ((LinkedHashTreeMap.Node)localObject1).right = paramNode2;
      continue;
      int j = paramNode1.hash;
      int i = this.table.length + -1;
      j &= i;
      localObject2 = this.table;
      localObject2[j] = paramNode2;
    }
  }
  
  private void rotateLeft(LinkedHashTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode2.left;
    LinkedHashTreeMap.Node localNode4 = localNode2.right;
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
  
  private void rotateRight(LinkedHashTreeMap.Node paramNode)
  {
    int i = 0;
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = localNode1.left;
    LinkedHashTreeMap.Node localNode4 = localNode1.right;
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
  
  private static int secondaryHash(int paramInt)
  {
    int i = paramInt >>> 20;
    int j = paramInt >>> 12;
    i = i ^ j ^ paramInt;
    j = i >>> 7 ^ i;
    return i >>> 4 ^ j;
  }
  
  private Object writeReplace()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(this);
    return localLinkedHashMap;
  }
  
  public void clear()
  {
    Arrays.fill(this.table, null);
    this.size = 0;
    int i = this.modCount + 1;
    this.modCount = i;
    LinkedHashTreeMap.Node localNode1 = this.header;
    LinkedHashTreeMap.Node localNode2;
    for (Object localObject = localNode1.next; localObject != localNode1; localObject = localNode2)
    {
      localNode2 = ((LinkedHashTreeMap.Node)localObject).next;
      ((LinkedHashTreeMap.Node)localObject).prev = null;
      ((LinkedHashTreeMap.Node)localObject).next = null;
    }
    localNode1.prev = localNode1;
    localNode1.next = localNode1;
  }
  
  public boolean containsKey(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = findByObject(paramObject);
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
    LinkedHashTreeMap.EntrySet localEntrySet = this.entrySet;
    if (localEntrySet != null) {}
    for (;;)
    {
      return localEntrySet;
      localEntrySet = new com/google/gson/internal/LinkedHashTreeMap$EntrySet;
      localEntrySet.<init>(this);
      this.entrySet = localEntrySet;
    }
  }
  
  LinkedHashTreeMap.Node find(Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    Comparator localComparator = this.comparator;
    LinkedHashTreeMap.Node[] arrayOfNode = this.table;
    int j = secondaryHash(paramObject.hashCode());
    int k = arrayOfNode.length + -1;
    int m = j & k;
    Object localObject2 = arrayOfNode[m];
    k = 0;
    Object localObject3 = null;
    Object localObject4;
    int n;
    if (localObject2 != null)
    {
      localObject3 = NATURAL_ORDER;
      if (localComparator == localObject3)
      {
        localObject3 = paramObject;
        localObject3 = (Comparable)paramObject;
        if (localObject3 == null) {
          break label123;
        }
        localObject4 = ((LinkedHashTreeMap.Node)localObject2).key;
        n = ((Comparable)localObject3).compareTo(localObject4);
        label102:
        if (n != 0) {
          break label145;
        }
        localObject1 = localObject2;
      }
    }
    label111:
    label123:
    label145:
    label157:
    label265:
    label427:
    for (;;)
    {
      return (LinkedHashTreeMap.Node)localObject1;
      k = 0;
      localObject3 = null;
      break;
      localObject4 = ((LinkedHashTreeMap.Node)localObject2).key;
      n = localComparator.compare(paramObject, localObject4);
      break label102;
      LinkedHashTreeMap.Node localNode;
      if (n < 0)
      {
        localNode = ((LinkedHashTreeMap.Node)localObject2).left;
        if (localNode != null) {
          break label265;
        }
      }
      for (int i1 = n;; i1 = 0)
      {
        if (!paramBoolean) {
          break label427;
        }
        localObject4 = this.header;
        if (localObject2 == null)
        {
          localObject3 = NATURAL_ORDER;
          if (localComparator == localObject3)
          {
            boolean bool = paramObject instanceof Comparable;
            if (!bool)
            {
              localObject3 = new java/lang/ClassCastException;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject1 = paramObject.getClass().getName();
              localObject2 = (String)localObject1 + " is not Comparable";
              ((ClassCastException)localObject3).<init>((String)localObject2);
              throw ((Throwable)localObject3);
              localNode = ((LinkedHashTreeMap.Node)localObject2).right;
              break label157;
              localObject2 = localNode;
              break;
            }
          }
          localObject3 = new com/google/gson/internal/LinkedHashTreeMap$Node;
          localNode = ((LinkedHashTreeMap.Node)localObject4).prev;
          localObject1 = paramObject;
          ((LinkedHashTreeMap.Node)localObject3).<init>((LinkedHashTreeMap.Node)localObject2, paramObject, j, (LinkedHashTreeMap.Node)localObject4, localNode);
          arrayOfNode[m] = localObject3;
          int i2 = this.size;
          i = i2 + 1;
          this.size = i;
          i = this.threshold;
          if (i2 > i) {
            doubleCapacity();
          }
          int i3 = this.modCount + 1;
          this.modCount = i3;
          localObject1 = localObject3;
          break label111;
        }
        localObject3 = new com/google/gson/internal/LinkedHashTreeMap$Node;
        localNode = ((LinkedHashTreeMap.Node)localObject4).prev;
        localObject1 = paramObject;
        ((LinkedHashTreeMap.Node)localObject3).<init>((LinkedHashTreeMap.Node)localObject2, paramObject, j, (LinkedHashTreeMap.Node)localObject4, localNode);
        if (i1 < 0) {
          ((LinkedHashTreeMap.Node)localObject2).left = ((LinkedHashTreeMap.Node)localObject3);
        }
        for (;;)
        {
          i = 1;
          rebalance((LinkedHashTreeMap.Node)localObject2, i);
          break;
          ((LinkedHashTreeMap.Node)localObject2).right = ((LinkedHashTreeMap.Node)localObject3);
        }
      }
    }
  }
  
  LinkedHashTreeMap.Node findByEntry(Map.Entry paramEntry)
  {
    Object localObject1 = paramEntry.getKey();
    localObject1 = findByObject(localObject1);
    Object localObject2;
    boolean bool;
    if (localObject1 != null)
    {
      localObject2 = ((LinkedHashTreeMap.Node)localObject1).value;
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
      return (LinkedHashTreeMap.Node)localObject1;
      bool = false;
      localObject2 = null;
      break;
      label62:
      localObject1 = null;
    }
  }
  
  LinkedHashTreeMap.Node findByObject(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = null;
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
    for (localObject = ((LinkedHashTreeMap.Node)localObject).value;; localObject = null) {
      return localObject;
    }
  }
  
  public Set keySet()
  {
    LinkedHashTreeMap.KeySet localKeySet = this.keySet;
    if (localKeySet != null) {}
    for (;;)
    {
      return localKeySet;
      localKeySet = new com/google/gson/internal/LinkedHashTreeMap$KeySet;
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
    Object localObject2 = ((LinkedHashTreeMap.Node)localObject1).value;
    ((LinkedHashTreeMap.Node)localObject1).value = paramObject2;
    return localObject2;
  }
  
  public Object remove(Object paramObject)
  {
    Object localObject = removeInternalByKey(paramObject);
    if (localObject != null) {}
    for (localObject = ((LinkedHashTreeMap.Node)localObject).value;; localObject = null) {
      return localObject;
    }
  }
  
  void removeInternal(LinkedHashTreeMap.Node paramNode, boolean paramBoolean)
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
      paramNode.prev = null;
      paramNode.next = null;
    }
    LinkedHashTreeMap.Node localNode1 = paramNode.left;
    LinkedHashTreeMap.Node localNode2 = paramNode.right;
    LinkedHashTreeMap.Node localNode3 = paramNode.parent;
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
          break label309;
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
      label309:
      m = 0;
      localNode2 = null;
    }
  }
  
  LinkedHashTreeMap.Node removeInternalByKey(Object paramObject)
  {
    LinkedHashTreeMap.Node localNode = findByObject(paramObject);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */