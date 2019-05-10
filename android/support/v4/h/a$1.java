package android.support.v4.h;

import java.util.Map;

class a$1
  extends h
{
  a$1(a parama) {}
  
  protected int a()
  {
    return this.a.mSize;
  }
  
  protected int a(Object paramObject)
  {
    return this.a.indexOfKey(paramObject);
  }
  
  protected Object a(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = this.a.mArray;
    int i = (paramInt1 << 1) + paramInt2;
    return arrayOfObject[i];
  }
  
  protected Object a(int paramInt, Object paramObject)
  {
    return this.a.setValueAt(paramInt, paramObject);
  }
  
  protected void a(int paramInt)
  {
    this.a.removeAt(paramInt);
  }
  
  protected void a(Object paramObject1, Object paramObject2)
  {
    this.a.put(paramObject1, paramObject2);
  }
  
  protected int b(Object paramObject)
  {
    return this.a.indexOfValue(paramObject);
  }
  
  protected Map b()
  {
    return this.a;
  }
  
  protected void c()
  {
    this.a.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */