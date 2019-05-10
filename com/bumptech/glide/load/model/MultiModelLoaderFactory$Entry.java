package com.bumptech.glide.load.model;

class MultiModelLoaderFactory$Entry
{
  final Class dataClass;
  final ModelLoaderFactory factory;
  private final Class modelClass;
  
  public MultiModelLoaderFactory$Entry(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    this.modelClass = paramClass1;
    this.dataClass = paramClass2;
    this.factory = paramModelLoaderFactory;
  }
  
  public boolean handles(Class paramClass)
  {
    return this.modelClass.isAssignableFrom(paramClass);
  }
  
  public boolean handles(Class paramClass1, Class paramClass2)
  {
    boolean bool = handles(paramClass1);
    Class localClass;
    if (bool)
    {
      localClass = this.dataClass;
      bool = localClass.isAssignableFrom(paramClass2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MultiModelLoaderFactory$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */