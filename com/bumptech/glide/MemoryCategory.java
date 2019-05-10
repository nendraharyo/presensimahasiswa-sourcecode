package com.bumptech.glide;

public enum MemoryCategory
{
  private final float multiplier;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/bumptech/glide/MemoryCategory;
    ((MemoryCategory)localObject).<init>("LOW", 0, 0.5F);
    LOW = (MemoryCategory)localObject;
    localObject = new com/bumptech/glide/MemoryCategory;
    ((MemoryCategory)localObject).<init>("NORMAL", j, 1.0F);
    NORMAL = (MemoryCategory)localObject;
    localObject = new com/bumptech/glide/MemoryCategory;
    ((MemoryCategory)localObject).<init>("HIGH", i, 1.5F);
    HIGH = (MemoryCategory)localObject;
    localObject = new MemoryCategory[3];
    MemoryCategory localMemoryCategory = LOW;
    localObject[0] = localMemoryCategory;
    localMemoryCategory = NORMAL;
    localObject[j] = localMemoryCategory;
    localMemoryCategory = HIGH;
    localObject[i] = localMemoryCategory;
    $VALUES = (MemoryCategory[])localObject;
  }
  
  private MemoryCategory(float paramFloat)
  {
    this.multiplier = paramFloat;
  }
  
  public float getMultiplier()
  {
    return this.multiplier;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\MemoryCategory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */