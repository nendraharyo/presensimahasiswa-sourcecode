package android.support.v4.g;

class c$b
  implements c.c
{
  static final b a;
  
  static
  {
    b localb = new android/support/v4/g/c$b;
    localb.<init>();
    a = localb;
  }
  
  public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = paramInt1 + paramInt2;
    int k = i;
    while ((paramInt1 < j) && (k == i))
    {
      k = c.b(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
      paramInt1 += 1;
    }
    return k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\g\c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */